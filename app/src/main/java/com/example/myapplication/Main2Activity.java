package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.databinding.DataBindingUtil;
import com.example.myapplication.User;


public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        User binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        User user = new User("Login de usuario", "Senha de usuario");
        binding.User(user);

        Log.i(TAG,"Tela de Login");
    }
}
