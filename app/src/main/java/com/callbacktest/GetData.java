package com.callbacktest;
import retrofit2.Callback;

/**
 * Created by LRC on 2017/11/25.
 */

public interface GetData {

        void getAccessToken(
                String token,
                String text,
                Callback<MyRespone> response
        );
}
