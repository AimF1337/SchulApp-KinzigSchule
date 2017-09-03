package de.kinzig_schule.schulapp;

import android.app.ProgressDialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    ProgressDialog pDialog;

    public MyWebViewClient(ProgressDialog pDialog)
    {
        this.pDialog = pDialog;
    }

    @Override
    public void onPageStarted(WebView view, String url, android.graphics.Bitmap favicon){
        super.onPageStarted(view,url,favicon);
        pDialog.show();
    }

    @Override
    public void onPageFinished(WebView view,String url){
        super.onPageFinished(view,url);
        pDialog.dismiss();
    }
}
