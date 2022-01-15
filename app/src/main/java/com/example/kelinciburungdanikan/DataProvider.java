package com.example.kelinciburungdanikan;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.kelinciburungdanikan.model.Kelinci;
import com.example.kelinciburungdanikan.model.Hewan;
import com.example.kelinciburungdanikan.model.Burung;
import com.example.kelinciburungdanikan.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.anggora_nama), ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi), R.drawable.ankara));
        kelincis.add(new Kelinci(ctx.getString(R.string.Dutch_nama), ctx.getString(R.string.Dutch_asal),
                ctx.getString(R.string.Dutch_deskripsi), R.drawable.dutch));
        kelincis.add(new Kelinci(ctx.getString(R.string.Dwart_nama), ctx.getString(R.string.Dwart_asal),
                ctx.getString(R.string.Dwart_deskripsi), R.drawable.dutch));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_pop_nama), ctx.getString(R.string.holland_pop_asal),
                ctx.getString(R.string.holland_pop_deskripsi), R.drawable.hollandpop));

        return kelincis;
    }


    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.Lovebird_nama), ctx.getString(R.string.Lovebird_asal),
                ctx.getString(R.string.Lovebird_deskripsi),R.drawable.lovebird));
        burungs.add(new Burung(ctx.getString(R.string.Jalak_nama), ctx.getString(R.string.Jalak_asal),
                ctx.getString(R.string.Jalak_deskripsi),R.drawable.jalak));
        burungs.add(new Burung(ctx.getString(R.string.red_vector_nama), ctx.getString(R.string.red_vector_asal),
                ctx.getString(R.string.red_vector_deskripsi), R.drawable.redvektor));
        burungs.add(new Burung(ctx.getString(R.string.Cendrawasih_nama), ctx.getString(R.string.Cendrawasih_asal),
                ctx.getString(R.string.Cendrawasih_deskripsi), R.drawable.cendrawasih));
        return burungs;
    }
    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.butterfly_nama), ctx.getString(R.string.butterfly_asal),
                ctx.getString(R.string.butterfly_deskripsi), R.drawable.butterfly));
        ikans.add(new Ikan(ctx.getString(R.string.Ikan_Badut_nama), ctx.getString(R.string.Ikan_Badut_asal),
                ctx.getString(R.string.Ikan_Badut_deskripsi), R.drawable.zebarasoma));
        ikans.add(new Ikan(ctx.getString(R.string.Paracanthurus_hepatus_nama), ctx.getString(R.string.Paracanthurus_hepatus_asal),
                ctx.getString(R.string.Paracanthurus_hepatus_deskripsi), R.drawable.badut));
        ikans.add(new Ikan(ctx.getString(R.string.firefish_nama), ctx.getString(R.string.firefish_asal),
                ctx.getString(R.string.firefish_deskripsi), R.drawable.zebarasoma));
        return ikans;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}