package com.yandex.mobile.ads.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4945cz;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.EnumC5007e6;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ug1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.banner.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4642j extends AbstractC4945cz implements ug1 {

    /* renamed from: w */
    private boolean f47651w;

    /* renamed from: x */
    @NonNull
    private final C4634b f47652x;

    /* renamed from: y */
    @NonNull
    private final AbstractC4639g f47653y;

    /* renamed from: z */
    @NonNull
    private final Runnable f47654z;

    @SuppressLint
    public AbstractC4642j(@NonNull Context context, @NonNull AbstractC4639g abstractC4639g, @NonNull C5724s3 c5724s3) {
        super(context, EnumC5007e6.f49816b, c5724s3);
        this.f47654z = new RunnableC4644l(this, 3);
        this.f47651w = true;
        this.f47652x = new C4634b(abstractC4639g);
        this.f47653y = abstractC4639g;
        abstractC4639g.addVisibilityChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m21792u() {
        n60.m26811d("Ad will be loaded soon by ad-refresher", new Object[0]);
        mo26773b(m28618f());
    }

    /* renamed from: v */
    private void m21794v() {
        n60.m26811d("scheduleAdRefreshTimer()", new Object[0]);
        this.f55052a.removeCallbacks(this.f47654z);
        n60.m26811d("Refresh timer was cancelled", new Object[0]);
        AdResponse<String> m28620h = m28620h();
        if (m28620h != null && m28620h.m21811L() && this.f47651w) {
            if (m28624l() || !this.f47652x.mo21750b()) {
                return;
            }
            this.f55052a.postDelayed(this.f47654z, m28620h.m21817g());
            n60.m26811d("Refresh timer was scheduled within %d seconds", Integer.valueOf(m28620h.m21818h()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td, com.yandex.mobile.ads.impl.yp0.InterfaceC6087a
    /* renamed from: a */
    public void mo21796a(@NonNull Intent intent) {
        super.mo21796a(intent);
        m21794v();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: b */
    public void mo21797b(@NonNull C5563p2 c5563p2) {
        super.mo21797b(c5563p2);
        if (5 == c5563p2.m27144a() || 2 == c5563p2.m27144a()) {
            return;
        }
        m21794v();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: c */
    public void mo21779c() {
        super.mo21779c();
        this.f47653y.removeVisibilityChangeListener(this);
        n60.m26811d("disableAutoRefresh()", new Object[0]);
        this.f47651w = false;
        this.f55052a.removeCallbacks(this.f47654z);
        n60.m26811d("Refresh timer was cancelled", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: n */
    public final void mo21798n() {
        super.mo21798n();
        m21794v();
    }

    @Override // com.yandex.mobile.ads.impl.ug1
    /* renamed from: a */
    public void mo21795a(int i2) {
        m21794v();
    }
}
