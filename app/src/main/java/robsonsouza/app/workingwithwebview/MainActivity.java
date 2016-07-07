package robsonsouza.app.workingwithwebview;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    //References
    //https://developer.chrome.com/multidevice/webview/gettingstarted
    //http://stacktips.com/tutorials/android/android-webview-example
    //http://stacktips.com/tutorials/android/display-html-in-android-textview
    //https://developer.android.com/reference/android/text/Html.html

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webView);
        if (mWebView != null) {
            mWebView.loadUrl("file:///android_asset/help.html");
        }
    }
}
