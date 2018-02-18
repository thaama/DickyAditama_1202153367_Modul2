package com.example.dicky.dickyaditama_1202153367_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DafterMenu extends AppCompatActivity {
    private RecyclerView listView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> dataGambar;


    private String[] Judul = {"Burrito ", "Quesadillas", "Tacos"};

    private String[] test = {"Rp. 50.000", "Rp. 38.500", "Rp. 25.000"};

    private int[] Gambar = {R.drawable.buritto, R.drawable.qeusadillas, R.drawable.tacos};


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dafter_menu);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        dataGambar = new ArrayList<>();
        DaftarItem();


        listView = (RecyclerView) findViewById(R.id.list_menu);
        listView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);

        adapter = new viewListMenu(dataMenu, dataHarga, dataGambar);
        listView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int a=0; a<Judul.length; a++){
            dataMenu.add(Judul[a]);
            dataHarga.add(test[a]);
            dataGambar.add(Gambar[a]);
        }
    }
}
