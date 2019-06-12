package com.example.myapplication;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.databinding.DataBindingUtil;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.User;


public class Main2Activity<fun> extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    private Intent motionEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        User binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        User user = new User("Login de usuario", "Senha de usuario");
        binding.User(user);

        Log.i(TAG,"Tela de Login");

        findViewById(R.id.imageViewDrag).setOnTouchListener(MyTouchListener());

    }

//    private View.OnTouchListener MyTouchListener() {
//
//        fun onTouch(view:View, motionEvent:MotionEvent):Boolean {
//            if (motionEvent.getAction() === MotionEvent.ACTION_DOWN){
//                val data = ClipData.newPlainText("", "");
//                val shadowBuilder = View.DragShadowBuilder(
//                        view);
//                view.startDrag(data, shadowBuilder, view, 0);
//                view.setVisibility(View.INVISIBLE);
//                return true
//            } else {
//                return false
//            }
//        }
//    }
}
