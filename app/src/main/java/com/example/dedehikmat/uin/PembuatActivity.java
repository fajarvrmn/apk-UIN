package com.example.dedehikmat.uin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class PembuatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembuat);

        Button cpu = (Button) findViewById(R.id.webassalaam);
        cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View mulai) {

                Intent mula = new
                        Intent(mulai.getContext(),WebasalamActivity.class);
                startActivityForResult(mula, 0);

            }
        });
        String text = "\n" +
                "Aplikasi ini dibuat oleh siswa dan siswi Smk assalaam bandung peserta PRAKERIN eksternal yang bertempat di kampus UIN SUNAN GUNUNG DJATI BANDUNG";

        WebView webView = (WebView) findViewById(R.id.webvieww);
            webView.loadData("<b><p style=\"text-align: justify\">"+ text + "</p></b>", "text/html", "UTF-8");


    }
}
