package com.example.ipsenspiegel.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private final static String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("returnValue", "string value");

        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(SecondActivity.TAG, "on start");
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(SecondActivity.TAG, "on resume");
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e(SecondActivity.TAG, "on pause");
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e(SecondActivity.TAG, "on stop");
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e(SecondActivity.TAG, "on Restart");
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(SecondActivity.TAG, "on Destroy");
        Toast.makeText(this, "on Destroy", Toast.LENGTH_SHORT).show();
    }
}


