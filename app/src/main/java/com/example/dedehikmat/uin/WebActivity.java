package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
 WebView view;
        view = (WebView) this.findViewById(R.id.webuin);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.uinsgd.ac.id/front/home");
    }
}
