package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    EditText txtValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValue = (EditText) findViewById(R.id.etWidth);
    }

    public void onClick(View v) {
        // declare an intent for our new activity
        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("Name", "Tom");
        i.putExtra("MainValue", txtValue.getText().toString());
        startActivity(i);       // display new activity
    }



    }

