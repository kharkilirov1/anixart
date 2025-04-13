package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.activity.RunnableC0042c;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.AbstractC6093yv;
import com.yandex.mobile.ads.impl.C5048ex;
import com.yandex.mobile.ads.impl.InterfaceC6044xw;
import com.yandex.mobile.ads.impl.e60;
import com.yandex.mobile.ads.impl.f90;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.s60;

@MainThread
/* loaded from: classes3.dex */
public final class InterstitialAd extends AbstractC6093yv {

    /* renamed from: a */
    @NonNull
    private final h90 f57463a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC6044xw<InterstitialAdEventListener> f57464b;

    /* renamed from: c */
    @NonNull
    private final f90 f57465c;

    public InterstitialAd(@NonNull Context context) {
        super(context);
        this.f57465c = new f90();
        h90 h90Var = new h90(context);
        this.f57463a = h90Var;
        h90Var.m25094a();
        this.f57464b = new C5048ex(new s60()).m24275a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30408a(AdRequest adRequest) {
        this.f57464b.mo23541a(adRequest);
    }

    public void destroy() {
        this.f57463a.m25094a();
        this.f57465c.m24372a();
        this.f57464b.mo23546c();
    }

    public boolean isLoaded() {
        this.f57463a.m25094a();
        return this.f57464b.mo23544a();
    }

    public void loadAd(@NonNull AdRequest adRequest) {
        this.f57463a.m25094a();
        this.f57465c.m24373a(new RunnableC0207a(this, adRequest, 16));
    }

    public void setAdUnitId(@NonNull String str) {
        this.f57463a.m25094a();
        this.f57464b.mo23543a(str);
    }

    public void setInterstitialAdEventListener(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f57463a.m25094a();
        this.f57464b.mo23542a((InterfaceC6044xw<InterstitialAdEventListener>) interstitialAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z) {
        this.f57463a.m25094a();
        this.f57464b.setShouldOpenLinksInApp(z);
    }

    public void show() {
        this.f57463a.m25094a();
        this.f57465c.m24373a(new RunnableC0042c(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30407a() {
        if (this.f57464b.mo23544a()) {
            this.f57464b.mo23545b();
        } else {
            e60.m24034a("Failed to show not loaded ad. We recommend checking whether the ad was actually loaded. To do this, call the 'isLoaded()' method.", new Object[0]);
        }
    }
}
