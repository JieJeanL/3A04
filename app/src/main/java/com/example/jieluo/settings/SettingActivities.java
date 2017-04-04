package com.example.jieluo.settings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class SettingActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_activities);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting_activities, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean[] settingOptions = {false, false, false, false, false, false};

    //TODO: GO BACK TO PREVIOUS PAGE
    public void confirmSettings(View view){
        System.out.println("done");

    }

    /**
     * Update the mode of transportation selected by the user
     * @param view - the setting screen
     */
    public void updateMode(View view){
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            // Air mode of transportation
            case R.id.checkAir:
                if (checked)
                    settingOptions[0] = true;
                else
                    settingOptions[0] = false;
                break;
            // Water mode of transportation
            case R.id.checkWater:
                if (checked)
                    settingOptions[1] = true;
                else
                    settingOptions[1] = false;
                break;
            // Land mode of transportation
            case R.id.checkLand:
                if (checked)
                    settingOptions[2] = true;
                else
                    settingOptions[2] = false;
                break;
        }
    }

    /**
     * Update the option for sorting the resulting routes
     * @param view - the setting screen
     */
    public void updateView(View view){
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            // Sort by price
            case R.id.radioButtonPrice:
                if (checked)
                    settingOptions[3] = true;
                else
                    settingOptions[3] = false;
                break;
            // Sort by Time
            case R.id.radioButtonTime:
                if (checked)
                    settingOptions[4] = true;
                else
                    settingOptions[4] = false;
                break;
            // Sort by distance
            case R.id.radioButtonDistance:
                if (checked)
                    settingOptions[5] = true;
                else
                    settingOptions[5] = false;
                break;
        }
    }



}
