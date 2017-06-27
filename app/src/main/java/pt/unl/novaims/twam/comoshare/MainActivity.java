package pt.unl.novaims.twam.comoshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView1 = (WebView) findViewById(R.id.wvPortal);

        // set the properties for the webview
        WebSettings mWebSettings = webView1.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setAllowUniversalAccessFromFileURLs(true);

        webView1.setWebChromeClient(new WebChromeClient());

        webView1.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });

        webView1.loadUrl("http://10.0.2.2/IMS_ComoShare/index.php");
    }
}
