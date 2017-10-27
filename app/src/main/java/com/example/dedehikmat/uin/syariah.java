package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by dedehikmat on 08/10/2017.
 */

public class syariah  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_syariah);
        WebView view;
        view = (WebView) this.findViewById(R.id.fakulsyariah);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.fsh.uinsgd.ac.id/front/home");
    }
}

