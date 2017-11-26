package com.callbacktest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by LRC on 2017/11/26.
 */

public class  Manager implements GetData {
    @Override
    public void getAccessToken(String token, String text, Callback<MyRespone> response) {
        Response r = null;
        MyRespone m = new MyRespone();
        Call<MyRespone> mycall = null;
        m.setText(text);
        m.setToken(token);
        mycall = m;
        response.onResponse(mycall,r);
    }
}
