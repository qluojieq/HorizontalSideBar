package com.yydrobo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements HorizontalSideBar.OnChooseChangeListener{


    private static final String TAG = MainActivity.class.getSimpleName();

    HorizontalSideBar sideBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sideBar = findViewById(R.id.sliderBar);
        sideBar.setOnChooseChangeListener(this);
    }

    public void changeLetters(View view) {
        sideBar.setLetters(new String[]{"#","A","B","C","D","E","F"},0);
    }

    public void changeLettersBack(View view) {
        sideBar.setLetters(new String[]{"#", "A","B","C","D","E","F","G","H","I"},0);
    }

    @Override
    public void chooseLetter(String letter) {
        Log.e(TAG,"当前选择的字母 " + letter);
    }
}
