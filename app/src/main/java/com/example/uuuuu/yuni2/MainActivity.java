package com.example.uuuuu.yuni2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        Log.d(TAG, "onCreate: udah jalan lho!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:sekarang ada di Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:kembali aktif resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause:app di pause dulu!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop:sekarang ada di tahap Stop berhenti dulu!");
    }

    public void submit(View view) {
        Toast.makeText(this, "data sudah di submit", Toast.LENGTH_LONG).show();
        Log.i(TAG, "submit: data sudah di submit");
    }
}
