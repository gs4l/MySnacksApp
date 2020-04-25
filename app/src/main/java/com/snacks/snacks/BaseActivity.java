package com.snacks.snacks;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class BaseActivity extends AppCompatActivity {

    public void setupToolbar(Toolbar toolbar){
        setSupportActionBar(toolbar);
    }
}
