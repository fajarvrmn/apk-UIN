package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by dedehikmat on 08/10/2017.
 */

public class dakwah  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dakwah);
        WebView view;
        view = (WebView) this.findViewById(R.id.fakuldakwah);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.fdk.uinsgd.ac.id/front/home");
    }
}

