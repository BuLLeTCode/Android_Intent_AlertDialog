package com.raivis.develops.mpi_prd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    //function for only button in second activity
    public void callFirstActivity(View view) {
        //Create intent to start first activity
        Intent callMainActivity = new Intent(this, MainActivity.class);
        //No need to put extra information - so just start activity
        startActivity(callMainActivity);
    }
}
