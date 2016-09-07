package com.example.tylerbennet.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessageToScreen(String txtIn) {
        Context context = getApplicationContext();
        CharSequence text = txtIn;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void popularMoviesMessage(View view) {
        toastMessageToScreen("This button will launch my Popular Movies app!");
    }

    public void stockHawkMessage(View view) {
        toastMessageToScreen("This button will launch my Stock Hawk app!");
    }

    public void buildItBiggerMessage(View view) {
        toastMessageToScreen("This button will launch my Build It Bigger app!");
    }

    public void appMaterialMessage(View view) {
        toastMessageToScreen("This button will launch my Make your App Material app!");
    }

    public void ubiquitousMessage(View view) {
        toastMessageToScreen("This button will launch my Go Ubiquitous app!");
    }

    public void capstoneMessage(View view) {
        toastMessageToScreen("This button will launch my Capstone app!");
    }

}
