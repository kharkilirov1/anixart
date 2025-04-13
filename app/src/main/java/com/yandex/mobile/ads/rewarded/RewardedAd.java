package com.yandex.mobile.ads.rewarded;

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
import com.yandex.mobile.ads.impl.cy0;
import com.yandex.mobile.ads.impl.e60;
import com.yandex.mobile.ads.impl.f90;
import com.yandex.mobile.ads.impl.h90;

@MainThread
/* loaded from: classes3.dex */
public final class RewardedAd extends AbstractC6093yv {

    /* renamed from: a */
    @NonNull
    private final h90 f57978a;

    /* renamed from: b */
    @NonNull
    private final f90 f57979b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC6044xw<RewardedAdEventListener> f57980c;

    @MainThread
    public RewardedAd(@NonNull Context context) {
        super(context);
        this.f57979b = new f90();
        h90 h90Var = new h90(context);
        this.f57978a = h90Var;
        h90Var.m25094a();
        this.f57980c = new C5048ex(new cy0()).m24275a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30760a(AdRequest adRequest) {
        this.f57980c.mo23541a(adRequest);
    }

    @MainThread
    public void destroy() {
        this.f57978a.m25094a();
        this.f57979b.m24372a();
        this.f57980c.mo23546c();
    }

    @MainThread
    public boolean isLoaded() {
        this.f57978a.m25094a();
        return this.f57980c.mo23544a();
    }

    @MainThread
    public void loadAd(@NonNull AdRequest adRequest) {
        this.f57978a.m25094a();
        this.f57979b.m24373a(new RunnableC0207a(this, adRequest, 21));
    }

    @MainThread
    public void setAdUnitId(@NonNull String str) {
        this.f57978a.m25094a();
        this.f57980c.mo23543a(str);
    }

    @MainThread
    public void setRewardedAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f57978a.m25094a();
        this.f57980c.mo23542a((InterfaceC6044xw<RewardedAdEventListener>) rewardedAdEventListener);
    }

    @MainThread
    public void setShouldOpenLinksInApp(boolean z) {
        this.f57978a.m25094a();
        this.f57980c.setShouldOpenLinksInApp(z);
    }

    @MainThread
    public void show() {
        this.f57978a.m25094a();
        this.f57979b.m24373a(new RunnableC0042c(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30759a() {
        if (this.f57980c.mo23544a()) {
            this.f57980c.mo23545b();
        } else {
            e60.m24034a("Failed to show not loaded ad. We recommend checking whether the ad was actually loaded. To do this, call the 'isLoaded()' method.", new Object[0]);
        }
    }
}
