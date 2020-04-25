package com.snacks.snacks;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.snacks.snacks.models.HomeModel;
import com.snacks.snacks.utils.RequestInterface;
import com.snacks.snacks.utils.RestCallback;
import com.snacks.snacks.utils.RetrofitInstance;
import com.snacks.snacks.utils.SharedPrefs;

import retrofit2.Call;
import retrofit2.Response;

public class HomeActivity extends BaseActivity {

    private TextView availableTextView;
    private Button getSnackButton;
    private Button giveSnackButton;
    private Button addItemButton;

    private Toolbar mToolbar;

    private Integer userId;
    private Integer userRole;
    private Integer available;
    private String userName;

    private SharedPrefs mPrefs;

    private Context mContext = this;

    private RequestInterface mService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        mService = RetrofitInstance.createService(RequestInterface.class);

        mPrefs = new SharedPrefs(mContext);

        userId = mPrefs.returnUserId();

        getUserData();


    }

    private void getUserData(){
        Call<HomeModel> call  = mService.getHomeData(userId);
        call.enqueue(new RestCallback<HomeModel>() {
            @Override
            public void onResponse(Call<HomeModel> call, Response<HomeModel> response) {
                if (response.isSuccessful()){
                    Log.d("SUCESS", "SUCESS");
                    Log.d("response", response.body().toString());
                    userRole = response.body().getRole();
                    available = response.body().getAvailable();
                    userName = response.body().getName();
                    bindToolbar();
                    bindViews();

                }
            }

            @Override
            public void onFailure(Call<HomeModel> call, Throwable t) {
                Log.d("FAIL", t.toString());
                bindToolbar();
                bindViews();

            }
        });
    }

    private void bindToolbar(){
        mToolbar = findViewById(R.id.toolbar);
        setupToolbar(mToolbar);
    }

    private void bindViews(){
        availableTextView = findViewById(R.id.available_text);
        getSnackButton = findViewById(R.id.getsnack_button);
        giveSnackButton = findViewById(R.id.givesnack_button);
        addItemButton = findViewById(R.id.additem_button);

        if(userRole != null && userRole == 1){
            giveSnackButton.setVisibility(View.VISIBLE);
//            addItemButton.setVisibility(View.VISIBLE);
        }

        if (available != null && available >= 0){
            String availableText = (new StringBuilder()).append(getResources().getString(R.string.available)).append(available).toString();
            availableTextView.setText(availableText);
        }

    }

}
