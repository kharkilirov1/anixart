package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vg1;
import com.yandex.mobile.ads.impl.yp0;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class yo0 extends AbstractC5179he implements InterfaceC5610pz, yp0.InterfaceC6087a, vg1.InterfaceC5918a {

    /* renamed from: j */
    private static boolean f56890j = false;

    /* renamed from: b */
    @NonNull
    private final vg1 f56891b;

    /* renamed from: c */
    @NonNull
    private final l11 f56892c;

    /* renamed from: d */
    @NonNull
    private final yp0 f56893d;

    /* renamed from: e */
    @NonNull
    private final q91 f56894e;

    /* renamed from: f */
    @Nullable
    public InterfaceC5719rz f56895f;

    /* renamed from: g */
    @Nullable
    public InterfaceC5662qz f56896g;

    /* renamed from: h */
    private boolean f56897h;

    /* renamed from: i */
    private boolean f56898i;

    /* renamed from: com.yandex.mobile.ads.impl.yo0$a */
    public class RunnableC6085a implements Runnable {
        public RunnableC6085a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            yo0.this.mo26109h();
        }
    }

    public yo0(@NonNull Context context) {
        super(context.getApplicationContext());
        this.f56891b = new vg1();
        this.f56892c = new l11();
        this.f56894e = C5325k8.m26067a();
        this.f56893d = yp0.m29957a();
        mo27991b(context);
        if (f56890j) {
            return;
        }
        m29955a(getContext());
        f56890j = true;
    }

    /* renamed from: a */
    private static void m29955a(@NonNull Context context) {
    }

    /* renamed from: a */
    public void mo26301a() {
        this.f56892c.m26317a(new RunnableC6085a());
    }

    @SuppressLint
    /* renamed from: b */
    public void mo27991b(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        if (C5474n6.m26805a(21)) {
            settings.setMixedContentMode(0);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        WebSettings settings2 = getSettings();
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a != null && m29824a.m23562A()) {
            settings2.setUserAgentString(this.f56894e.m27663a(context));
        }
        setWebViewClient(new C5559oz(this));
        setWebChromeClient(new C5310jz());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5179he
    /* renamed from: c */
    public String mo25134c() {
        StringBuilder m27x = C0000a.m27x("", "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n");
        m27x.append(li1.f52423b);
        return m27x.toString();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5179he
    /* renamed from: e */
    public void mo25136e() {
        this.f56895f = null;
        super.mo25136e();
    }

    /* renamed from: h */
    public abstract void mo26109h();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56898i = true;
        this.f56893d.m29959a(getContext(), this);
        Objects.requireNonNull(this.f56891b);
        boolean m29222a = vg1.m29222a(this);
        if (this.f56897h != m29222a) {
            this.f56897h = m29222a;
            InterfaceC5719rz interfaceC5719rz = this.f56895f;
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23257a(m29222a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f56898i = false;
        Objects.requireNonNull(this.f56891b);
        boolean m29222a = vg1.m29222a(this);
        if (this.f56897h != m29222a) {
            this.f56897h = m29222a;
            InterfaceC5719rz interfaceC5719rz = this.f56895f;
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23257a(m29222a);
            }
        }
        this.f56893d.m29960b(getContext(), this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        Objects.requireNonNull(this.f56891b);
        boolean m29222a = vg1.m29222a(this);
        if (this.f56897h != m29222a) {
            this.f56897h = m29222a;
            InterfaceC5719rz interfaceC5719rz = this.f56895f;
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23257a(m29222a);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Objects.requireNonNull(this.f56891b);
        boolean m29222a = vg1.m29222a(this);
        if (this.f56897h != m29222a) {
            this.f56897h = m29222a;
            InterfaceC5719rz interfaceC5719rz = this.f56895f;
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23257a(m29222a);
            }
        }
    }

    public void setHtmlWebViewErrorListener(@NonNull InterfaceC5662qz interfaceC5662qz) {
        this.f56896g = interfaceC5662qz;
    }

    public void setHtmlWebViewListener(@NonNull InterfaceC5719rz interfaceC5719rz) {
        this.f56895f = interfaceC5719rz;
    }

    /* renamed from: a */
    public void mo26655a(int i2) {
        InterfaceC5662qz interfaceC5662qz = this.f56896g;
        if (interfaceC5662qz != null) {
            ((C5568p7) interfaceC5662qz).m27179a(i2);
        }
    }

    /* renamed from: a */
    public void mo26656a(@NonNull Context context, @NonNull String str) {
        InterfaceC5719rz interfaceC5719rz = this.f56895f;
        if (interfaceC5719rz != null) {
            interfaceC5719rz.mo23256a(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.yp0.InterfaceC6087a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21796a(@androidx.annotation.NonNull android.content.Intent r2) {
        /*
            r1 = this;
            java.lang.String r2 = r2.getAction()
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto L26
        Ld:
            com.yandex.mobile.ads.impl.vg1 r2 = r1.f56891b
            java.util.Objects.requireNonNull(r2)
            boolean r2 = com.yandex.mobile.ads.impl.vg1.m29222a(r1)
            if (r2 == 0) goto L26
            com.yandex.mobile.ads.impl.yp0 r2 = r1.f56893d
            android.content.Context r0 = r1.getContext()
            boolean r2 = r2.m29961b(r0)
            if (r2 == 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            boolean r0 = r1.f56897h
            if (r0 == r2) goto L34
            r1.f56897h = r2
            com.yandex.mobile.ads.impl.rz r0 = r1.f56895f
            if (r0 == 0) goto L34
            r0.mo23257a(r2)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yo0.mo21796a(android.content.Intent):void");
    }

    @Override // com.yandex.mobile.ads.impl.vg1.InterfaceC5918a
    /* renamed from: b */
    public final boolean mo29223b() {
        return this.f56898i;
    }
}
