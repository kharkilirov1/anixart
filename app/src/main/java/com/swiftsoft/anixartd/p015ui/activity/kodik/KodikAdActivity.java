package com.swiftsoft.anixartd.p015ui.activity.kodik;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.RunnableC0042c;
import androidx.appcompat.app.AppCompatActivity;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.UrlUtils;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KodikAdActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/kodik/KodikAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "advertEnded", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class KodikAdActivity extends AppCompatActivity {

    /* renamed from: i */
    @NotNull
    public static final Companion f27523i = new Companion(null);

    /* renamed from: b */
    @Inject
    public Prefs f27524b;

    /* renamed from: c */
    public Episode f27525c;

    /* renamed from: d */
    public int f27526d;

    /* renamed from: e */
    public int f27527e;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27530h = new LinkedHashMap();

    /* renamed from: f */
    @NotNull
    public final KodikAdActivity$webChromeClient$1 f27528f = new WebChromeClient() { // from class: com.swiftsoft.anixartd.ui.activity.kodik.KodikAdActivity$webChromeClient$1
        @Override // android.webkit.WebChromeClient
        @Nullable
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
            Intrinsics.m32179h(consoleMessage, "consoleMessage");
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                ((WebView) KodikAdActivity.this.m15342s4(C2507R.id.webView)).onResume();
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(@NotNull PermissionRequest request) {
            Intrinsics.m32179h(request, "request");
            request.grant(new String[]{"android.webkit.resource.PROTECTED_MEDIA_ID"});
        }
    };

    /* renamed from: g */
    @NotNull
    public final KodikAdActivity$webViewClient$1 f27529g = new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.kodik.KodikAdActivity$webViewClient$1
        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView view, @NotNull String url) {
            Intrinsics.m32179h(view, "view");
            Intrinsics.m32179h(url, "url");
            float width = view.getWidth() / 2;
            float height = view.getHeight() / 2;
            MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, width, height, 0.5f, 0.5f, 0, 0.5f, 0.5f, 4098, 0);
            MotionEvent obtain2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis() + DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, 1, width, height, 0.5f, 0.5f, 0, 0.5f, 0.5f, 4098, 0);
            view.dispatchTouchEvent(obtain);
            view.dispatchTouchEvent(obtain2);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
            Intrinsics.m32179h(view, "view");
            Intrinsics.m32179h(request, "request");
            return super.shouldInterceptRequest(view, request);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
            Intrinsics.m32179h(view, "view");
            Intrinsics.m32179h(url, "url");
            String m16366a = UrlUtils.f30249a.m16366a(KodikAdActivity.this.m15343t4().getUrl());
            if (m16366a == null) {
                return true;
            }
            if (StringsKt.m33922t(url, new Common().m16296a(m16366a), false, 2, null) || StringsKt.m33922t(url, "aniqit.com", false, 2, null) || StringsKt.m33922t(url, "kodik.info", false, 2, null) || StringsKt.m33922t(url, "kodik.cc", false, 2, null) || StringsKt.m33922t(url, "kodik-hd.com", false, 2, null) || StringsKt.m33922t(url, "kodik.biz", false, 2, null)) {
                view.loadUrl(url);
                return true;
            }
            KodikAdActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return true;
        }
    };

    /* compiled from: KodikAdActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/kodik/KodikAdActivity$Companion;", "", "", "EPISODE_VALUE", "Ljava/lang/String;", "SELECTED_EPISODE_ACTION_VALUE", "SELECTED_PLAYER_OR_DOWNLOADER_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JavascriptInterface
    public final void advertEnded() {
        Intent intent = new Intent();
        intent.putExtra("EPISODE_VALUE", m15343t4());
        intent.putExtra("SELECTED_EPISODE_ACTION_VALUE", this.f27526d);
        intent.putExtra("SELECTED_PLAYER_OR_DOWNLOADER_VALUE", this.f27527e);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14093I(this);
        super.onCreate(bundle);
        setContentView(C2507R.layout.activity_kodik_ad);
        new Handler().postDelayed(new RunnableC0042c(this, 8), 2000L);
        Intent intent = getIntent();
        if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("EPISODE_VALUE");
            Episode episode = serializableExtra instanceof Episode ? (Episode) serializableExtra : null;
            int intExtra = intent.getIntExtra("SELECTED_EPISODE_ACTION_VALUE", 0);
            int intExtra2 = intent.getIntExtra("SELECTED_PLAYER_OR_DOWNLOADER_VALUE", 0);
            if (episode != null) {
                this.f27525c = episode;
                this.f27526d = intExtra;
                this.f27527e = intExtra2;
            }
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies((WebView) m15342s4(C2507R.id.webView), true);
        String m16366a = UrlUtils.f30249a.m16366a(m15343t4().getUrl());
        WebView webView = (WebView) m15342s4(C2507R.id.webView);
        StringBuilder sb = new StringBuilder();
        Common common = new Common();
        Prefs prefs = this.f27524b;
        if (prefs == null) {
            Intrinsics.m32189r("prefs");
            throw null;
        }
        sb.append(common.m16297b("https://anixart.tv", prefs.m14082y()));
        sb.append("/iframe/ad?url=");
        sb.append(URLEncoder.encode(m16366a, "UTF-8"));
        sb.append("&v=24111318");
        webView.loadUrl(sb.toString());
        WebSettings settings = ((WebView) m15342s4(C2507R.id.webView)).getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        ((WebView) m15342s4(C2507R.id.webView)).addJavascriptInterface(this, "KodikInterface");
        ((WebView) m15342s4(C2507R.id.webView)).setWebChromeClient(this.f27528f);
        ((WebView) m15342s4(C2507R.id.webView)).setWebViewClient(this.f27529g);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NotNull KeyEvent event) {
        Intrinsics.m32179h(event, "event");
        if (event.getAction() != 0 || i2 != 4) {
            return super.onKeyDown(i2, event);
        }
        if (((WebView) m15342s4(C2507R.id.webView)).canGoBack()) {
            ((WebView) m15342s4(C2507R.id.webView)).goBack();
            return true;
        }
        finish();
        return true;
    }

    @Nullable
    /* renamed from: s4 */
    public View m15342s4(int i2) {
        Map<Integer, View> map = this.f27530h;
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

    @NotNull
    /* renamed from: t4 */
    public final Episode m15343t4() {
        Episode episode = this.f27525c;
        if (episode != null) {
            return episode;
        }
        Intrinsics.m32189r("episode");
        throw null;
    }
}
