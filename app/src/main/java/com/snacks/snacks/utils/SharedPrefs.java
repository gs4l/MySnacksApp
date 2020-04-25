package com.snacks.snacks.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {

    private Context mContext;

    private static final String USER_ID = "user_id";

    public SharedPrefs(Context context){
        this.mContext = context;
    }

    private int getIntPreference(String key, int value){

        SharedPreferences mPrefs = mContext.getSharedPreferences(Constants.SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE);
        return mPrefs.getInt(key, value);
    }

    private void setIntPreference(String key, int value){
        SharedPreferences.Editor mEditor = mContext.getSharedPreferences(Constants.SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE).edit();
        mEditor.putInt(key, value);
        mEditor.apply();

    }
    public int returnUserId(){
        return getIntPreference(USER_ID, 0);
    }

    public void setUserId(){
        setIntPreference(USER_ID, 0);
    }
}
