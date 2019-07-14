package com.example.alc4phase1challenge;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class AboutUs extends AppCompatActivity {

    @SuppressLint({"RestrictedApi", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_about_us);

        WebView webView = findViewById(R.id.about_us_webview);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        webView.setWebViewClient(
                new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadUrl(url);
                        return true;
                    }

                    @Override
                    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                        view.loadDataWithBaseURL("", "<h1><strong>An Error Occurred while loading this page" + view.getUrl() + "</strong></h1>",
                                "text/html", "utf-8", "");
                    }

                    @Override
                    public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
                        handler.proceed();
                    }
                }
        );

        webView.loadUrl("https://andela.com/alc/");    // https://andela.com/alc/
    }
}
