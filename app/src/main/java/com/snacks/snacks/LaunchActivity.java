package com.snacks.snacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.snacks.snacks.utils.SharedPrefs;

public class LaunchActivity extends AppCompatActivity {

    private Context mContext = this;
    private SharedPrefs mPrefs;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        startApp();

    }

    private void startApp(){
        Integer userId;

        userId = mPrefs.returnUserId(mContext);

        if (userId != null && userId > 0){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }

//        else{
//            Intent intent = new Intent(this, LoginActivity.class);
//            startActivity(intent);
//        }
    }

}
