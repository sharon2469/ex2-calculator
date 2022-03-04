package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Log.e("test", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("test", "onStart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("test", "onSaveInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "onStop");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("test", "onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("test", "onDestroy");

    }
}