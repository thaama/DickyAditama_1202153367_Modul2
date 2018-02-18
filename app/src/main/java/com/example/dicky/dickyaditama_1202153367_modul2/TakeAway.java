package com.example.dicky.dickyaditama_1202153367_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
Toast toast;
Intent pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);


    }
    public void onClick(View view){
        pindah = new Intent(this, DafterMenu.class);
        startActivity(pindah);
    }
}
