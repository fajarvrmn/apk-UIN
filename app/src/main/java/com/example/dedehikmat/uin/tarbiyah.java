package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by dedehikmat on 08/10/2017.
 */

public class tarbiyah  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tar);
        WebView view;
        view = (WebView) this.findViewById(R.id.fakultarbiyah);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.ftk.uinsgd.ac.id/front/home");
    }
}

