package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Warung Babi Guling Ibu Oka", "Nasi Ayam Kedewatan Ibu Mangku", "Naughty Nuri's Warung",
                "Ibu Rai Bar & Restaurant", "Warung Mak Beng", "Warung Eny's", "Warung Bebek Tepi Sawah", "Warung Nasi Ayam Bu Oki",
                "Warung Bule", "Warung Legong", "Bumbu Bali"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BabiGuling.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Kedewatan.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}