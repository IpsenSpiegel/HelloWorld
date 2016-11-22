package com.example.ipsenspiegel.myapplication;

import android.content.Intent;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {


    private static final String TAG = MainActivity.class.getSimpleName();
    public static final int ACTIVITY_REQUEST_CODE = 100;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.TAG, "on create()");

        //intentamos hacer una llamada a la 2a actividad

        Intent MyIntent = new Intent(this, SecondActivity.class);
        startActivityForResult(MyIntent, 0);
    }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            Toast.makeText(this, "Todo controlado, resultado devuelto", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onClick(View view) {

    }

}
