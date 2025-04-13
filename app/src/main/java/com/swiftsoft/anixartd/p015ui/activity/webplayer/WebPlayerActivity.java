package com.swiftsoft.anixartd.p015ui.activity.webplayer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.parser.Parser;
import com.swiftsoft.anixartd.utils.Common;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebPlayerActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/webplayer/WebPlayerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class WebPlayerActivity extends AppCompatActivity {

    /* renamed from: e */
    @NotNull
    public static final Companion f27600e = new Companion(null);

    /* renamed from: b */
    @Inject
    public Prefs f27601b;

    /* renamed from: d */
    @NotNull
    public Map<Integer, View> f27603d = new LinkedHashMap();

    /* renamed from: c */
    @NotNull
    public HashSet<String> f27602c = new HashSet<>();

    /* compiled from: WebPlayerActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/webplayer/WebPlayerActivity$Companion;", "", "", "IFRAME", "Ljava/lang/String;", "ORIENTATION_LANDSCAPE", "URL_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final Intent m15356a(@NotNull Context context, @NotNull String url, boolean z, boolean z2) {
            Intrinsics.m32179h(url, "url");
            Intent intent = new Intent(context, (Class<?>) WebPlayerActivity.class);
            intent.putExtra("URL_VALUE", url);
            intent.putExtra("IFRAME", z);
            intent.putExtra("ORIENTATION_LANDSCAPE", z2);
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14100P(this);
        super.onCreate(bundle);
        setContentView(C2507R.layout.activity_web_player);
        try {
            InputStream open = getAssets().open("adblock.txt");
            Intrinsics.m32178g(open, "assets.open(\"adblock.txt\")");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                this.f27602c.add(readLine);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        getWindow().setFlags(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        View decorView = getWindow().getDecorView();
        Intrinsics.m32178g(decorView, "window.decorView");
        decorView.setSystemUiVisibility(4098);
        Intent intent = getIntent();
        Unit unit = null;
        if (intent != null) {
            final String stringExtra = intent.getStringExtra("URL_VALUE");
            if (stringExtra == null) {
                stringExtra = "https://anixart.tv";
            }
            boolean booleanExtra = intent.getBooleanExtra("IFRAME", false);
            boolean booleanExtra2 = intent.getBooleanExtra("ORIENTATION_LANDSCAPE", true);
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", stringExtra);
            if (booleanExtra) {
                WebView webView = (WebView) m15355s4(C2507R.id.webView);
                StringBuilder sb = new StringBuilder();
                Common common = new Common();
                Prefs prefs = this.f27601b;
                if (prefs == null) {
                    Intrinsics.m32189r("prefs");
                    throw null;
                }
                sb.append(common.m16297b("https://anixart.tv", prefs.m14082y()));
                sb.append("/iframe?url=");
                sb.append(URLEncoder.encode(stringExtra, "UTF-8"));
                webView.loadUrl(sb.toString());
            } else {
                ((WebView) m15355s4(C2507R.id.webView)).loadUrl(stringExtra, hashMap);
            }
            if (booleanExtra2) {
                setRequestedOrientation(6);
            }
            WebSettings settings = ((WebView) m15355s4(C2507R.id.webView)).getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setMixedContentMode(0);
            settings.setAllowFileAccess(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setAppCacheEnabled(true);
            ((WebView) m15355s4(C2507R.id.webView)).setWebChromeClient(new WebChromeClient() { // from class: com.swiftsoft.anixartd.ui.activity.webplayer.WebPlayerActivity$onCreate$1$2
                @Override // android.webkit.WebChromeClient
                @Nullable
                public Bitmap getDefaultVideoPoster() {
                    return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
                }

                @Override // android.webkit.WebChromeClient
                public void onPermissionRequest(@NotNull PermissionRequest request) {
                    Intrinsics.m32179h(request, "request");
                    request.grant(new String[]{"android.webkit.resource.PROTECTED_MEDIA_ID"});
                }
            });
            ((WebView) m15355s4(C2507R.id.webView)).setBackgroundColor(0);
            ((WebView) m15355s4(C2507R.id.webView)).setWebViewClient(new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.webplayer.WebPlayerActivity$onCreate$1$3
                @Override // android.webkit.WebViewClient
                @Nullable
                public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
                    Intrinsics.m32179h(view, "view");
                    Intrinsics.m32179h(request, "request");
                    String uri = request.getUrl().toString();
                    Intrinsics.m32178g(uri, "request.url.toString()");
                    String m16296a = new Common().m16296a(stringExtra);
                    if (Intrinsics.m32174c(m16296a, "video.sibnet.ru") || Intrinsics.m32174c(m16296a, "my.mail.ru") || ArraysKt.m31963m(Parser.f25798g, m16296a) || ArraysKt.m31963m(Parser.f25799h, m16296a)) {
                        Iterator<String> it = this.f27602c.iterator();
                        while (it.hasNext()) {
                            String s = it.next();
                            Intrinsics.m32178g(s, "s");
                            if (StringsKt.m33922t(uri, s, false, 2, null)) {
                                byte[] bytes = "".getBytes(Charsets.f66855b);
                                Intrinsics.m32178g(bytes, "this as java.lang.String).getBytes(charset)");
                                return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(bytes));
                            }
                        }
                    }
                    return super.shouldInterceptRequest(view, request);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
                    Intrinsics.m32179h(view, "view");
                    Intrinsics.m32179h(url, "url");
                    try {
                        if (URLUtil.isValidUrl(url) && Patterns.WEB_URL.matcher(url).matches()) {
                            if (StringsKt.m33922t(url, new Common().m16296a(stringExtra), false, 2, null)) {
                                view.loadUrl(url);
                            } else {
                                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return true;
                }
            });
            unit = Unit.f63088a;
        }
        if (unit == null) {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NotNull KeyEvent event) {
        Intrinsics.m32179h(event, "event");
        if (event.getAction() != 0 || i2 != 4) {
            return super.onKeyDown(i2, event);
        }
        if (((WebView) m15355s4(C2507R.id.webView)).canGoBack()) {
            ((WebView) m15355s4(C2507R.id.webView)).goBack();
            return true;
        }
        finish();
        return true;
    }

    @Nullable
    /* renamed from: s4 */
    public View m15355s4(int i2) {
        Map<Integer, View> map = this.f27603d;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }
}
