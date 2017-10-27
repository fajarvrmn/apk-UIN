package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebasalamActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webasalam);

        WebView view;
        view = (WebView) this.findViewById(R.id.asalam);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.smkassalaambandung.sch.id/");
    }
}
