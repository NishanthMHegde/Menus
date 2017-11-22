package com.nishanth.mymenuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BrowserActivity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        wv = (WebView)findViewById(R.id.browser);
        String url = "http://www.google.com";
        wv.getSettings().getJavaScriptEnabled();
        wv.loadUrl(url);
    }
}
