package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.InterfaceC5176hd;
import com.yandex.mobile.ads.impl.f71;
import com.yandex.mobile.ads.impl.g90;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.tg1;

/* renamed from: com.yandex.mobile.ads.banner.c */
/* loaded from: classes2.dex */
public final class C4635c extends f71 {

    /* renamed from: m */
    @NonNull
    private final g90 f47626m;

    /* renamed from: n */
    @NonNull
    private final InterfaceC5176hd f47627n;

    /* renamed from: o */
    @NonNull
    private final AbstractC4639g f47628o;

    /* renamed from: p */
    private boolean f47629p;

    public C4635c(@NonNull Context context, @NonNull AdResponse<String> adResponse, @NonNull C5101g2 c5101g2, @NonNull AbstractC4639g abstractC4639g, @NonNull InterfaceC5176hd interfaceC5176hd) {
        super(context, new C4634b(abstractC4639g), adResponse, c5101g2);
        this.f47628o = abstractC4639g;
        this.f47626m = new g90();
        this.f47629p = false;
        this.f47627n = interfaceC5176hd;
    }

    @Override // com.yandex.mobile.ads.impl.m20.InterfaceC5423a
    /* renamed from: a */
    public final void mo21751a(@Nullable AdImpressionData adImpressionData) {
        if (this.f47629p) {
            return;
        }
        this.f47629p = true;
        this.f47627n.mo21778a(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: j */
    public final boolean mo21753j() {
        return tg1.m28659c(this.f47628o.findViewById(2));
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: k */
    public final boolean mo21754k() {
        View findViewById = this.f47628o.findViewById(2);
        return findViewById != null && tg1.m28657b(findViewById) >= 1;
    }

    /* renamed from: m */
    public final void m21755m() {
        this.f47626m.m24828a();
        mo24327g();
        n60.m26811d("onDestroy(), clazz = " + C4635c.class, new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onLeftApplication() {
        this.f47627n.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onReturnedToApplication() {
        this.f47627n.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: a */
    public final boolean mo21752a(int i2) {
        return tg1.m28655a(this.f47628o.findViewById(2), i2);
    }
}
