package com.example.dedehikmat.uin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by dedehikmat on 08/10/2017.
 */

public class ushuludin  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_ushuludin);
        WebView view;
        view = (WebView) this.findViewById(R.id.fakulushuluddin);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://www.fu.uinsgd.ac.id/front/home");
    }
}

