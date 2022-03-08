package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate", "test");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    @Override
    protected void onStart() {
        Log.i("onStart", "test");
        super.onStart();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i("onSaveInstanceState", "test");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        Log.i("onResume", "test");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("onPause", "test");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("onStop", "test");
        super.onStop();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.i("onRestoreInstanceState", "test");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.i("onDestroy", "test");
        super.onDestroy();
    }
}