package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.C5518o0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class sk1 {

    /* renamed from: a */
    @NonNull
    private final Context f54700a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f54701b;

    /* renamed from: c */
    @NonNull
    private final AdResponse<String> f54702c;

    /* renamed from: d */
    @NonNull
    private final String f54703d;

    /* renamed from: e */
    @NonNull
    private final C5715rw f54704e;

    /* renamed from: f */
    @NonNull
    private final C5415lw f54705f;

    /* renamed from: g */
    @NonNull
    private final C5553ow f54706g;

    /* renamed from: h */
    @NonNull
    private final C4889bw f54707h;

    /* renamed from: i */
    @NonNull
    private final InterfaceC5362kw f54708i;

    /* renamed from: j */
    @NonNull
    private final InterfaceC5750sk f54709j;

    /* renamed from: k */
    @NonNull
    private final C5047ew f54710k;

    /* renamed from: l */
    @NonNull
    private final View f54711l;

    /* renamed from: m */
    @NonNull
    private final C5502nm f54712m;

    /* renamed from: n */
    @NonNull
    private final AdResultReceiver f54713n;

    /* renamed from: o */
    @NonNull
    private final C5890uw f54714o;

    public sk1(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull AdResponse<String> adResponse, @NonNull String str) throws mi1 {
        Context applicationContext = context.getApplicationContext();
        this.f54700a = applicationContext;
        this.f54701b = c5101g2;
        this.f54702c = adResponse;
        this.f54703d = str;
        this.f54712m = new C5543om(context, ax0.m22651a(adResponse)).m27091a();
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f54713n = adResultReceiver;
        this.f54714o = new C5890uw();
        C5715rw m28286b = m28286b();
        this.f54704e = m28286b;
        C5415lw c5415lw = new C5415lw(applicationContext, c5101g2, adResponse, adResultReceiver);
        this.f54705f = c5415lw;
        this.f54706g = new C5553ow(applicationContext, c5101g2, adResponse, adResultReceiver);
        C4889bw c4889bw = new C4889bw();
        this.f54707h = c4889bw;
        this.f54708i = m28287c();
        InterfaceC5750sk m28285a = m28285a();
        this.f54709j = m28285a;
        C5047ew c5047ew = new C5047ew(m28285a);
        this.f54710k = c5047ew;
        c4889bw.m22940a(c5047ew);
        c5415lw.m26539a(c5047ew);
        this.f54711l = m28285a.mo24742a(m28286b, adResponse);
    }

    @NonNull
    /* renamed from: a */
    private InterfaceC5750sk m28285a() {
        boolean m26444a = lf0.m26444a(this.f54703d);
        FrameLayout m25058a = C5165h5.m25058a(this.f54700a);
        m25058a.setOnClickListener(new ViewOnClickListenerC5286ji(this.f54707h, this.f54708i, this.f54712m));
        return new C5806tk().m28670a(m25058a, this.f54702c, this.f54712m, m26444a, this.f54702c.m21810K());
    }

    @NonNull
    /* renamed from: b */
    private C5715rw m28286b() throws mi1 {
        return new C5766sw().m28363a(this.f54700a, this.f54702c, this.f54701b);
    }

    @NonNull
    /* renamed from: c */
    private InterfaceC5362kw m28287c() {
        boolean m26444a = lf0.m26444a(this.f54703d);
        Objects.requireNonNull(C5516nz.m26965a());
        InterfaceC5465mz m26964a = C5516nz.m26964a(m26444a);
        C5715rw c5715rw = this.f54704e;
        C5415lw c5415lw = this.f54705f;
        C5553ow c5553ow = this.f54706g;
        return m26964a.mo22467a(c5715rw, c5415lw, c5553ow, this.f54707h, c5553ow);
    }

    /* renamed from: d */
    public final void m28292d() {
        this.f54707h.m22941a((InterfaceC5541ok) null);
        this.f54705f.m26540a((InterfaceC5693rk) null);
        this.f54708i.invalidate();
        this.f54709j.mo24748d();
    }

    @NonNull
    /* renamed from: e */
    public final C4990dw m28293e() {
        return this.f54710k.m24272a();
    }

    /* renamed from: f */
    public final void m28294f() {
        this.f54709j.mo24746b();
        C5715rw c5715rw = this.f54704e;
        Objects.requireNonNull(c5715rw);
        int i2 = C5427m6.f52583b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(c5715rw, new Object[0]);
        } catch (Exception unused) {
        }
        n60.m26811d("WebView component <%s> was paused", C5715rw.class.toString());
    }

    /* renamed from: g */
    public final void m28295g() {
        this.f54708i.mo26546a(this.f54703d);
    }

    /* renamed from: h */
    public final void m28296h() {
        C5715rw c5715rw = this.f54704e;
        Objects.requireNonNull(c5715rw);
        int i2 = C5427m6.f52583b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(c5715rw, new Object[0]);
        } catch (Exception unused) {
        }
        n60.m26811d("WebView component <%s> was resumed", C5715rw.class.toString());
        this.f54709j.mo24743a();
    }

    /* renamed from: a */
    public final void m28290a(@Nullable InterfaceC5541ok interfaceC5541ok) {
        this.f54707h.m22941a(interfaceC5541ok);
    }

    /* renamed from: a */
    public final void m28291a(@Nullable InterfaceC5693rk interfaceC5693rk) {
        this.f54705f.m26540a(interfaceC5693rk);
    }

    /* renamed from: a */
    public final void m28288a(@NonNull Context context, @Nullable AdResultReceiver adResultReceiver) {
        C5518o0 c5518o0 = new C5518o0(new C5518o0.a(this.f54702c).m26976a(this));
        this.f54713n.m21912a(adResultReceiver);
        this.f54714o.m29144a(context, c5518o0, this.f54713n);
    }

    /* renamed from: a */
    public final void m28289a(@NonNull RelativeLayout relativeLayout) {
        this.f54709j.mo24744a(relativeLayout);
        relativeLayout.addView(this.f54711l);
        this.f54709j.mo24747c();
    }
}
