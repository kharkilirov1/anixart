package com.p017vk.api.sdk.p018ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.p017vk.api.sdk.C2786VK;
import com.p017vk.api.sdk.VKApiConfig;
import com.p017vk.api.sdk.VKApiValidationHandler;
import com.p017vk.api.sdk.auth.VKAuthParams;
import com.p017vk.api.sdk.auth.VKScope;
import com.p017vk.api.sdk.p018ui.VKWebViewAuthActivity;
import com.p017vk.api.sdk.utils.VKUtils;
import com.p017vk.api.sdk.utils.VKValidationLocker;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKWebViewAuthActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;", "Landroid/app/Activity;", "<init>", "()V", "Companion", "OAuthWebViewClient", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKWebViewAuthActivity extends Activity {

    /* renamed from: e */
    @Nullable
    public static VKApiValidationHandler.Credentials f30772e;

    /* renamed from: f */
    public static final Companion f30773f = new Companion(null);

    /* renamed from: b */
    public WebView f30774b;

    /* renamed from: c */
    public ProgressBar f30775c;

    /* renamed from: d */
    public VKAuthParams f30776d;

    /* compiled from: VKWebViewAuthActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity$Companion;", "", "", "VK_EXTRA_AUTH_PARAMS", "Ljava/lang/String;", "VK_EXTRA_VALIDATION_URL", "VK_RESULT_INTENT_NAME", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: VKWebViewAuthActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity$OAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class OAuthWebViewClient extends WebViewClient {

        /* renamed from: a */
        public boolean f30777a;

        public OAuthWebViewClient() {
        }

        /* renamed from: a */
        public final boolean m16530a(String str) {
            int i2 = 0;
            if (str != null) {
                VKAuthParams vKAuthParams = VKWebViewAuthActivity.this.f30776d;
                if (vKAuthParams == null) {
                    Intrinsics.m32189r("params");
                    throw null;
                }
                if (StringsKt.m33898X(str, vKAuthParams.f30672c, false, 2, null)) {
                    Intent intent = new Intent("com.vk.auth-token");
                    String substring = str.substring(StringsKt.m33878D(str, "#", 0, false, 6, null) + 1);
                    Intrinsics.m32175d(substring, "(this as java.lang.String).substring(startIndex)");
                    intent.putExtra("extra-token-data", substring);
                    Map<String, String> m16535b = VKUtils.m16535b(substring);
                    if (m16535b == null || (!m16535b.containsKey("error") && !m16535b.containsKey("cancel"))) {
                        i2 = -1;
                    }
                    VKWebViewAuthActivity.this.setResult(i2, intent);
                    if (VKWebViewAuthActivity.this.m16529c()) {
                        Uri parse = Uri.parse(StringsKt.m33891Q(str, "#", "?", false, 4, null));
                        if (parse.getQueryParameter("success") != null) {
                            String queryParameter = parse.getQueryParameter("access_token");
                            String queryParameter2 = parse.getQueryParameter("secret");
                            String queryParameter3 = parse.getQueryParameter("user_id");
                            Integer valueOf = queryParameter3 != null ? Integer.valueOf(Integer.parseInt(queryParameter3)) : null;
                            Companion companion = VKWebViewAuthActivity.f30773f;
                            VKWebViewAuthActivity.f30772e = new VKApiValidationHandler.Credentials(queryParameter2, queryParameter, valueOf);
                        }
                    }
                    VKValidationLocker.f30797c.m16538b();
                    VKWebViewAuthActivity.this.finish();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final void m16531b(WebView webView, String str) {
            this.f30777a = true;
            try {
                new AlertDialog.Builder(webView != null ? webView.getContext() : null).setMessage(str).setPositiveButton(C2507R.string.vk_retry, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKWebViewAuthActivity$OAuthWebViewClient$showError$builder$1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        VKWebViewAuthActivity.OAuthWebViewClient oAuthWebViewClient = VKWebViewAuthActivity.OAuthWebViewClient.this;
                        oAuthWebViewClient.f30777a = false;
                        VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
                        VKApiValidationHandler.Credentials credentials = VKWebViewAuthActivity.f30772e;
                        vKWebViewAuthActivity.m16528b();
                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKWebViewAuthActivity$OAuthWebViewClient$showError$builder$2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        VKWebViewAuthActivity.this.setResult(0);
                        VKWebViewAuthActivity.this.finish();
                    }
                }).show();
            } catch (Exception unused) {
                VKWebViewAuthActivity.this.setResult(0);
                VKWebViewAuthActivity.this.finish();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            if (this.f30777a) {
                return;
            }
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            ProgressBar progressBar = vKWebViewAuthActivity.f30775c;
            if (progressBar == null) {
                Intrinsics.m32189r("progress");
                throw null;
            }
            progressBar.setVisibility(8);
            WebView webView2 = vKWebViewAuthActivity.f30774b;
            if (webView2 != null) {
                webView2.setVisibility(0);
            } else {
                Intrinsics.m32189r("webView");
                throw null;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            m16530a(str);
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi
        public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            CharSequence description;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            String str = null;
            if (Build.VERSION.SDK_INT >= 23 && webResourceError != null && (description = webResourceError.getDescription()) != null) {
                str = description.toString();
            }
            m16531b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return m16530a(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            return m16530a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i2, @Nullable String str, @Nullable String str2) {
            super.onReceivedError(webView, i2, str, str2);
            m16531b(webView, str);
        }
    }

    @NotNull
    /* renamed from: a */
    public Map<String, String> m16527a() {
        Pair[] pairArr = new Pair[7];
        VKAuthParams vKAuthParams = this.f30776d;
        if (vKAuthParams == null) {
            Intrinsics.m32189r("params");
            throw null;
        }
        pairArr[0] = new Pair("client_id", String.valueOf(vKAuthParams.f30671b));
        VKAuthParams vKAuthParams2 = this.f30776d;
        if (vKAuthParams2 == null) {
            Intrinsics.m32189r("params");
            throw null;
        }
        pairArr[1] = new Pair("scope", CollectionsKt.m31989B(vKAuthParams2.f30670a, ",", null, null, 0, null, null, 62, null));
        VKAuthParams vKAuthParams3 = this.f30776d;
        if (vKAuthParams3 == null) {
            Intrinsics.m32189r("params");
            throw null;
        }
        pairArr[2] = new Pair("redirect_uri", vKAuthParams3.f30672c);
        pairArr[3] = new Pair("response_type", FirebaseMessagingService.EXTRA_TOKEN);
        pairArr[4] = new Pair("display", "mobile");
        VKApiConfig vKApiConfig = C2786VK.f30602a;
        if (vKApiConfig == null) {
            Intrinsics.m32189r("config");
            throw null;
        }
        pairArr[5] = new Pair("v", vKApiConfig.f30617e);
        pairArr[6] = new Pair("revoke", "1");
        return MapsKt.m32064i(pairArr);
    }

    /* renamed from: b */
    public final void m16528b() {
        String uri;
        try {
            if (m16529c()) {
                uri = getIntent().getStringExtra("vk_validation_url");
            } else {
                Uri.Builder buildUpon = Uri.parse("https://oauth.vk.com/authorize").buildUpon();
                for (Map.Entry<String, String> entry : m16527a().entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                uri = buildUpon.build().toString();
            }
            WebView webView = this.f30774b;
            if (webView == null) {
                Intrinsics.m32189r("webView");
                throw null;
            }
            webView.loadUrl(uri);
        } catch (Exception unused) {
            setResult(0);
            finish();
        }
    }

    /* renamed from: c */
    public final boolean m16529c() {
        return getIntent().getStringExtra("vk_validation_url") != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ?? r3;
        VKAuthParams vKAuthParams;
        super.onCreate(bundle);
        setContentView(C2507R.layout.vk_webview_auth_dialog);
        View findViewById = findViewById(C2507R.id.webView);
        Intrinsics.m32175d(findViewById, "findViewById(R.id.webView)");
        this.f30774b = (WebView) findViewById;
        View findViewById2 = findViewById(C2507R.id.progress);
        Intrinsics.m32175d(findViewById2, "findViewById(R.id.progress)");
        this.f30775c = (ProgressBar) findViewById2;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        if (bundleExtra == null) {
            vKAuthParams = null;
        } else {
            int i2 = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList != null) {
                r3 = new ArrayList(CollectionsKt.m32032m(stringArrayList, 10));
                for (String it : stringArrayList) {
                    Intrinsics.m32175d(it, "it");
                    r3.add(VKScope.valueOf(it));
                }
            } else {
                r3 = EmptySet.f63146b;
            }
            String redirectUrl = bundleExtra.getString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
            Intrinsics.m32175d(redirectUrl, "redirectUrl");
            vKAuthParams = new VKAuthParams(i2, redirectUrl, r3);
        }
        if (vKAuthParams != null) {
            this.f30776d = vKAuthParams;
        } else if (!m16529c()) {
            finish();
        }
        WebView webView = this.f30774b;
        if (webView == null) {
            Intrinsics.m32189r("webView");
            throw null;
        }
        webView.setWebViewClient(new OAuthWebViewClient());
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.f30774b;
        if (webView2 == null) {
            Intrinsics.m32189r("webView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        m16528b();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        WebView webView = this.f30774b;
        if (webView == null) {
            Intrinsics.m32189r("webView");
            throw null;
        }
        webView.destroy();
        VKValidationLocker.f30797c.m16538b();
        super.onDestroy();
    }
}
