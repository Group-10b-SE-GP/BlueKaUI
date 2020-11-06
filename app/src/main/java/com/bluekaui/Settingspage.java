package com.bluekaui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ToggleButton;

public class Settingspage extends AppCompatActivity {
    ToggleButton bluetoothbutton;
    ToggleButton locationbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingspage);

        //--------------------------BluetoothButton-----------------

        bluetoothbutton = findViewById(R.id.bluetooth_button);
        locationbutton = findViewById(R.id.location_button);


        //----------------Toolbarcode---------------------------------------
        Toolbar toolbars = findViewById(R.id.toolbarsettings);
        setSupportActionBar(toolbars);

        // Set title to false AFTER toolbar has been set
        try
        {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        catch (NullPointerException e){}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu settingsmenu){
        getMenuInflater().inflate(R.menu.settingsmenu,settingsmenu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id== R.id.backid){
            openMainpage();
        }
        return true;
    }
    public void openMainpage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}