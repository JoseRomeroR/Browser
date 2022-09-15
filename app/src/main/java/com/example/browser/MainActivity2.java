package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

     WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView = (WebView) findViewById(R.id.wv1);
        String url = getIntent().getStringExtra("url");
        webView.setWebViewClient(new WebViewClient()); // hace que no abra google fuera de la aplicacion
        webView.loadUrl("https://www.google.es/search?q="+url);
    }
}