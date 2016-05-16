package com.raivis.develops.mpi_prd2;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This function for Aktivitate2 button
    public void callSecondActivity(View view) {
        //Create intent to start second activity
        Intent callMain2Activity = new Intent(this, Main2Activity.class);
        //No need to put extra information - so just start activity
        startActivity(callMain2Activity);
    }

    public void callDialog(View view) {
        //Create dialog fragment for dialog class what have been created and show it...
        DialogFragment myDialog = new Dialogg();
        myDialog.show(getFragmentManager(), "group_dialog");
    }
}
