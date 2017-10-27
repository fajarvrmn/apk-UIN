package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        String text = "\n" +
                "Aplikasi ini merupakan sebuah aplikasi company profile UIN dimana didalam nya berisi tentang informasi dari Universitas Islam negeri Sunan Gunung Djati Bandung";

        WebView webView = (WebView) findViewById(R.id.webvieww);
        webView.loadData("<b><p style=\"text-align: justify\">"+ text + "</p></b>", "text/html", "UTF-8");
    }
}
