package com.example.dedehikmat.uin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;


public class FakultasActivity extends Activity implements View.OnClickListener {

    Button btnAdabb, btnSainss, btnPolitikk, btnPsikologii, btnSyariahh, btnTarr, btnUshul, btnDakwah, btnPasca;

    PascaActivity pascaaa;
    adab adabbb;
    sains sainsss;
    politik politikkk;
    psikolog psikologgg;
    syariah syariahhh;
    tarbiyah tarrr;
    dakwah dakwahhh;
    ushuludin ushul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fakultas);

        btnAdabb = (Button) findViewById(R.id.adab1);
        btnSainss = (Button) findViewById(R.id.sains1);
        btnPolitikk = (Button) findViewById(R.id.politik1);
        btnPsikologii = (Button) findViewById(R.id.psikolog1);
        btnSyariahh = (Button) findViewById(R.id.syariah1);
        btnTarr = (Button) findViewById(R.id.tar1);
        btnUshul = (Button) findViewById(R.id.ushuludin1);
        btnDakwah = (Button) findViewById(R.id.dakwah1);
        btnPasca = (Button) findViewById(R.id.pasca);

        btnAdabb.setOnClickListener(this);
        btnSainss.setOnClickListener(this);
        btnPolitikk.setOnClickListener(this);
        btnPsikologii.setOnClickListener(this);
        btnSyariahh.setOnClickListener(this);
        btnTarr.setOnClickListener(this);
        btnUshul.setOnClickListener(this);
        btnDakwah.setOnClickListener(this);
        btnPasca.setOnClickListener(this);

    }

    void mAdab(){
        Intent intentku = new Intent(FakultasActivity.this, adab.class);
        startActivity(intentku);
    }
    void mSains(){
        Intent intentku = new Intent(FakultasActivity.this, sains.class);
        startActivity(intentku);
    }
    void mPolitik(){
        Intent intentku = new Intent(FakultasActivity.this, politik.class);
        startActivity(intentku);

    }
    void mPsikologi(){
        Intent intentku = new Intent(FakultasActivity.this, psikolog.class);
        startActivity(intentku);

    }
    void mSyariah(){
        Intent intentku = new Intent(FakultasActivity.this, syariah.class);
        startActivity(intentku);

    }
    void mTar(){

        Intent intentku = new Intent(FakultasActivity.this, tarbiyah.class);
        startActivity(intentku);

    }
    void mDakwah(){

        Intent intentku = new Intent(FakultasActivity.this, dakwah.class);
        startActivity(intentku);
    }
    void mUshuluddin(){

        Intent intentku = new Intent(FakultasActivity.this, ushuludin.class);
        startActivity(intentku);

    }
    void mPas(){

        Intent intentku = new Intent(FakultasActivity.this, PascaActivity.class);
        startActivity(intentku);

    }

    @Override

    public void onClick(View v) {
        if(v == btnAdabb)
            mAdab();
        if (v == btnSainss)
            mSains();
        if (v == btnPolitikk)
            mPolitik();
        if (v == btnPsikologii)
            mPsikologi();
        if (v == btnSyariahh)
            mSyariah();
        if (v == btnTarr)
            mTar();
        if (v == btnDakwah)
            mDakwah();
        if (v == btnUshul)
            mUshuluddin();
        if (v == btnPasca)
            mPas();
    }






}
