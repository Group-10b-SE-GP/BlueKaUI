package com.bluekaui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------------------------SEEKBARCODE----------------------
        seekBar = findViewById(R.id.seekbarid);
        textView = findViewById(R.id.countid);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int i=0;
            int MIN_VALUE=2;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                i=progress;
                if (i<MIN_VALUE){
                    seekBar.setProgress(MIN_VALUE);
                }
                textView.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //-----------------TOOLBARCODE-------------------------
        Toolbar toolbarm = findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbarm);

        // Set title to false AFTER toolbar has been set
        try
        {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        catch (NullPointerException e){}


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       getMenuInflater().inflate(R.menu.menu,menu);
       return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();

        if (id== R.id.settingsid){
            openSettingspage();
        }
        return true;
    }
public void openSettingspage(){
    Intent intent = new Intent(this,Settingspage.class);
    startActivity(intent);

}

}