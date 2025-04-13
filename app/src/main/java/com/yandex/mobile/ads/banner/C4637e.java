package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C5097fz;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.C5911vc;
import com.yandex.mobile.ads.impl.C5967wc;
import com.yandex.mobile.ads.impl.InterfaceC5176hd;
import com.yandex.mobile.ads.impl.InterfaceC6021xc;
import com.yandex.mobile.ads.impl.hg1;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.r11;
import com.yandex.mobile.ads.impl.tg1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.banner.e */
/* loaded from: classes2.dex */
public final class C4637e extends AbstractC4642j implements InterfaceC5176hd {

    /* renamed from: A */
    @NonNull
    private final C4636d f47633A;

    /* renamed from: B */
    @NonNull
    private final VideoController f47634B;

    /* renamed from: C */
    @NonNull
    private final ke1 f47635C;

    /* renamed from: D */
    @NonNull
    private final C5911vc f47636D;

    /* renamed from: E */
    @NonNull
    private final C5097fz f47637E;

    /* renamed from: F */
    @NonNull
    private final AbstractC4639g f47638F;

    /* renamed from: G */
    @NonNull
    private final C5967wc f47639G;

    /* renamed from: H */
    @Nullable
    private InterfaceC6021xc f47640H;

    /* renamed from: I */
    @Nullable
    private InterfaceC6021xc f47641I;

    public C4637e(@NonNull Context context, @NonNull AbstractC4639g abstractC4639g, @NonNull C4636d c4636d, @NonNull C5724s3 c5724s3) {
        super(context, abstractC4639g, c5724s3);
        this.f47633A = c4636d;
        this.f47638F = abstractC4639g;
        m21774a(abstractC4639g);
        this.f47639G = new C5967wc();
        ke1 ke1Var = new ke1();
        this.f47635C = ke1Var;
        this.f47634B = new VideoController(ke1Var);
        this.f47636D = new C5911vc();
        C5097fz c5097fz = new C5097fz();
        this.f47637E = c5097fz;
        c4636d.m21767a(c5097fz);
    }

    @NonNull
    /* renamed from: A */
    public final ke1 m21775A() {
        return this.f47635C;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5176hd
    /* renamed from: a */
    public final void mo21778a(@Nullable AdImpressionData adImpressionData) {
        this.f47633A.m21770b(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4642j, com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: c */
    public final void mo21779c() {
        super.mo21779c();
        this.f47633A.m21766a((BannerAdEventListener) null);
        hg1.m25195a(this.f47638F, true);
        this.f47638F.setVisibility(8);
        AbstractC4639g abstractC4639g = this.f47638F;
        int i2 = tg1.f55120b;
        if (abstractC4639g != null) {
            try {
                if (abstractC4639g.getParent() instanceof ViewGroup) {
                    ((ViewGroup) abstractC4639g.getParent()).removeView(abstractC4639g);
                }
            } catch (Exception unused) {
            }
            try {
                abstractC4639g.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5176hd
    public final void onLeftApplication() {
        this.f47633A.m21772e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5176hd
    public final void onReturnedToApplication() {
        this.f47633A.m21773f();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: p */
    public final void mo21780p() {
        super.mo21780p();
        InterfaceC6021xc interfaceC6021xc = this.f47640H;
        if (interfaceC6021xc != this.f47641I) {
            Iterator it = new HashSet(Arrays.asList(interfaceC6021xc)).iterator();
            while (it.hasNext()) {
                InterfaceC6021xc interfaceC6021xc2 = (InterfaceC6021xc) it.next();
                if (interfaceC6021xc2 != null) {
                    interfaceC6021xc2.mo24185a(this.f55053b);
                }
            }
            this.f47640H = this.f47641I;
        }
        SizeInfo m24792n = m28616d().m24792n();
        if (!(2 == (m24792n != null ? m24792n.m21917d() : 0)) || this.f47638F.getLayoutParams() == null) {
            return;
        }
        this.f47638F.getLayoutParams().height = -2;
    }

    /* renamed from: w */
    public final boolean m21781w() {
        AdResponse<String> m28620h = m28620h();
        SizeInfo m21805F = m28620h != null ? m28620h.m21805F() : null;
        if (m21805F == null) {
            return false;
        }
        SizeInfo m24792n = this.f55057f.m24792n();
        AdResponse<T> adResponse = this.f55071t;
        return (adResponse == 0 || m24792n == null) ? false : r11.m27822a(this.f55053b, adResponse, m21805F, this.f47639G, m24792n);
    }

    /* renamed from: x */
    public final void m21782x() {
        Iterator it = new HashSet(Arrays.asList(this.f47640H, this.f47641I)).iterator();
        while (it.hasNext()) {
            InterfaceC6021xc interfaceC6021xc = (InterfaceC6021xc) it.next();
            if (interfaceC6021xc != null) {
                interfaceC6021xc.mo24185a(this.f55053b);
            }
        }
        mo21779c();
        n60.m26811d("onDestroy(), clazz = " + C4637e.class, new Object[0]);
    }

    @NonNull
    /* renamed from: y */
    public final AbstractC4639g m21783y() {
        return this.f47638F;
    }

    @NonNull
    /* renamed from: z */
    public final VideoController m21784z() {
        return this.f47634B;
    }

    /* renamed from: a */
    public final void m21776a(@Nullable BannerAdEventListener bannerAdEventListener) {
        m28604a(this.f47633A);
        this.f47633A.m21766a(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: a */
    public final void mo22924a(@NonNull AdResponse<String> adResponse) {
        super.mo22924a((AdResponse) adResponse);
        this.f47637E.m24758a(adResponse);
        Objects.requireNonNull(this.f47636D);
        InterfaceC6021xc mo24548a = C5911vc.m29211a(adResponse).mo24548a(this);
        this.f47641I = mo24548a;
        mo24548a.mo24186a(this.f55053b, adResponse);
    }

    /* renamed from: a */
    private static void m21774a(@NonNull AbstractC4639g abstractC4639g) {
        abstractC4639g.setHorizontalScrollBarEnabled(false);
        abstractC4639g.setVerticalScrollBarEnabled(false);
        abstractC4639g.setVisibility(8);
        abstractC4639g.setBackgroundColor(0);
    }
}
