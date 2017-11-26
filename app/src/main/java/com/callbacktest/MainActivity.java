package com.callbacktest;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.textview);

        Manager manager = new Manager();
        manager.getAccessToken("token","AAAAAA",getdatas);

    }

    private Callback getdatas = new Callback<MyRespone>() {
        @Override
        public void onResponse(Call<MyRespone> call, Response<MyRespone> response) {
            Toast.makeText(MainActivity.this, "callback", Toast.LENGTH_SHORT).show();
            MyRespone c = (MyRespone) call;
            textView.setText(c.getText());
        }

        @Override
        public void onFailure(Call call, Throwable t) {

        }
    };

}
