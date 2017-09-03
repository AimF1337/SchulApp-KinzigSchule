package de.kinzig_schule.schulapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Anzeige extends AppCompatActivity {

    ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anzeige);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Menu.extra_message);


        WebView webView = (WebView) findViewById(R.id.pdfView);

        pDialog = new ProgressDialog(this);
        pDialog.setTitle("PDF loading");
        pDialog.setMessage("Bitte warten...");

        webView.setWebViewClient(new MyWebViewClient(pDialog));


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        webView.loadUrl(message);

    }
}
