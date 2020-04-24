package com.snacks.snacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.snacks.snacks.utils.RequestInterface;
import com.snacks.snacks.utils.RetrofitInstance;

public class HomeActivity extends AppCompatActivity {

    private RequestInterface mService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        mService = RetrofitInstance.createService(RequestInterface.class);

    }
}
