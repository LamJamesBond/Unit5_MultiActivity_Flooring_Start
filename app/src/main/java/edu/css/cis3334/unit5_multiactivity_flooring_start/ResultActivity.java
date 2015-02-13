package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class ResultActivity extends ActionBarActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = (TextView) findViewById(R.id.textView3);


    // long way
    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        String mainName = extras.getString("Name");
        String mainValue = extras.getString("MainValue");
    }

    //short way
    String mainName = getIntent().getExtras().getString("Name");
    String mainValue = getIntent().getExtras().getString("MainValue");

    result.setText("Updated result: " + mainName + " -- " + mainValue);
}

    public void onClick(View v) {
        // return to main activity
        finish();








 }
}







