package com.example.listprovinsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] province = {"Nanggroe Aceh Darussalam", "Sumatera Utara", "Sumatera Selatan",
            "Sumatera Barat", "Bengkulu", "Riau", "Kepulauan Riau", "Jambi", "Lampung", "Bangka Belitung",
            "Banten", "DKI Jakarta", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "DI Yogyakarta", "Kalimantan Barat",
            "Kalimantan Timur", "Kalimantan Selatan", "Kalimantan Tengah", "Kalimantan Utara", "Bali",
            "Nusa Tenggara Timur", "Nusa Tenggara Barat", "Gorontalo", "Sulawesi Barat", "Sulawesi Tengah",
            "Sulawesi Utara", "Sulawesi Tenggara", "Sulawesi Selatan", "Maluku Utara", "Maluku", "Papua Barat",
            "Papua", "Papua Tengah", "Papua Pegunungan", "Papua Selatan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Provinsi Indonesia");

        listView = findViewById(R.id.lv_Provinsi);
        ArrayAdapter<String> MyAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, province);

        listView.setAdapter(MyAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Memilih : " + province[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}