package com.example.kelinciburungdanikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKelinci,btnBurung,btnIkan;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

        Button btn_tentang = findViewById(R.id.btn_tentang);
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tentang.class);
                startActivity(intent);
            }
        });

    }

    private void inisialisasiView() {
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnIkan = findViewById(R.id.btn_buka_ras_ikan);

        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        btnBurung.setOnClickListener(View -> bukaGaleri("Burung"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity Sapi");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }


}