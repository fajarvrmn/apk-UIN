package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class PascaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasca);

            WebView view;
            view = (WebView) this.findViewById(R.id.fakulpasca);
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl("http://www.pps.uinsgd.ac.id/front/home");
        }


}
