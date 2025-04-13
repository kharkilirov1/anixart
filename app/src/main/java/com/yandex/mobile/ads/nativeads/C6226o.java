package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.AbstractC5524o4;
import com.yandex.mobile.ads.impl.AbstractC5630qd;
import com.yandex.mobile.ads.impl.AbstractC5794td;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.EnumC5007e6;
import com.yandex.mobile.ads.impl.EnumC5668r3;
import com.yandex.mobile.ads.impl.EnumC5901v3;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.gi0;
import com.yandex.mobile.ads.impl.h70;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.qi0;
import com.yandex.mobile.ads.impl.si0;
import com.yandex.mobile.ads.impl.t41;
import com.yandex.mobile.ads.impl.th0;
import com.yandex.mobile.ads.impl.uh0;
import com.yandex.mobile.ads.impl.vi0;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.o */
/* loaded from: classes3.dex */
public final class C6226o extends AbstractC5794td<qi0> {

    /* renamed from: A */
    @NonNull
    private final C6236t f57763A;

    /* renamed from: B */
    @NonNull
    private final C5724s3 f57764B;

    /* renamed from: C */
    @NonNull
    private final t41 f57765C;

    /* renamed from: D */
    @Nullable
    private jw0<qi0> f57766D;

    /* renamed from: E */
    @Nullable
    private NativeAdRequestConfiguration f57767E;

    /* renamed from: F */
    @NonNull
    private gi0 f57768F;

    /* renamed from: w */
    @NonNull
    private final th0 f57769w;

    /* renamed from: x */
    @NonNull
    private final uh0 f57770x;

    /* renamed from: y */
    @NonNull
    private final si0 f57771y;

    /* renamed from: z */
    @NonNull
    private final vi0 f57772z;

    public C6226o(@NonNull Context context, @NonNull C6236t c6236t, @NonNull C5724s3 c5724s3) {
        super(context, EnumC5007e6.f49819e, c5724s3);
        this.f57763A = c6236t;
        this.f57764B = c5724s3;
        this.f57769w = new a();
        this.f57770x = new uh0(context, m28616d(), c5724s3);
        this.f57771y = new si0();
        vi0 vi0Var = new vi0();
        this.f57772z = vi0Var;
        c6236t.m30648a(vi0Var);
        this.f57768F = new gi0(context, this);
        this.f57765C = t41.m28460a();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: a */
    public final boolean mo28611a(@Nullable AdRequest adRequest) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: b */
    public final synchronized void mo26773b(@Nullable AdRequest adRequest) {
        throw null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    @Nullable
    @SuppressLint
    /* renamed from: t */
    public final C5563p2 mo28629t() {
        return this.f55062k.m26070c();
    }

    /* renamed from: u */
    public final void m30600u() {
        m28612b();
        this.f55063l.m29610a();
        this.f55054c.m27604b();
        this.f57763A.m30646a();
        this.f57765C.m28461a(h70.f50864a, this);
        m28608a(EnumC5901v3.f55738a);
        this.f57770x.m28998a();
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.nativeads.o$a */
    public class a implements th0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.th0
        /* renamed from: a */
        public final void mo25215a(@NonNull C5563p2 c5563p2) {
            C6226o.this.f57764B.m28050a(EnumC5668r3.f54170c);
            C6226o.this.mo21797b(c5563p2);
        }

        @Override // com.yandex.mobile.ads.impl.th0
        /* renamed from: a */
        public final void mo25216a(@NonNull NativeAd nativeAd) {
            C6226o.this.m28625o();
            C6226o.this.f57763A.m30649a(nativeAd);
        }

        @Override // com.yandex.mobile.ads.impl.th0
        /* renamed from: a */
        public final void mo25218a(@NonNull ArrayList arrayList) {
            C6226o.this.m28625o();
            C6226o.this.f57763A.m30654a(arrayList);
        }

        @Override // com.yandex.mobile.ads.impl.th0
        /* renamed from: a */
        public final void mo25217a(@NonNull SliderAd sliderAd) {
            C6226o.this.m28625o();
            C6226o.this.f57763A.m30652a(sliderAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td, com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
    /* renamed from: a */
    public final void mo22924a(@NonNull AdResponse<qi0> adResponse) {
        super.mo22924a((AdResponse) adResponse);
        this.f57772z.m29227a(adResponse);
        if (m28623k()) {
            return;
        }
        Objects.requireNonNull(this.f57771y);
        si0.m28253a(adResponse).mo24906a(this).mo24610a(this.f55053b, adResponse);
    }

    /* renamed from: a */
    public final void m30595a(@NonNull AdResponse<qi0> adResponse, @NonNull di0 di0Var, @Nullable String str) {
        m28614b(str);
        if (m28623k()) {
            return;
        }
        this.f57770x.m28999a(this.f55053b, adResponse, adResponse.m21801B(), di0Var, this.f57769w);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    @NonNull
    /* renamed from: a */
    public final AbstractC5630qd<qi0> mo23561a(@NonNull String str, @NonNull String str2) {
        return this.f57768F.m24897a(this.f57766D, this.f55057f, this.f57767E, str, str2);
    }

    /* renamed from: a */
    public final void m30597a(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull kk0 kk0Var, @NonNull mk0 mk0Var, @NonNull jw0<qi0> jw0Var, int i2) {
        this.f57767E = nativeAdRequestConfiguration;
        this.f57766D = jw0Var;
        if (jw0Var.mo25993a()) {
            this.f57764B.m28055b(EnumC5668r3.f54170c);
            this.f57765C.m28462b(h70.f50864a, this);
            this.f55057f.m24766a(i2);
            this.f55057f.m24773a(nativeAdRequestConfiguration.m30465a());
            this.f55057f.m24769a(kk0Var);
            this.f55057f.m24774a(nativeAdRequestConfiguration.m30474j());
            this.f55057f.m24770a(mk0Var);
            AdRequest build = new AdRequest.Builder().setAge(nativeAdRequestConfiguration.m30466b()).setBiddingData(nativeAdRequestConfiguration.m30467c()).setContextQuery(nativeAdRequestConfiguration.m30468d()).setContextTags(nativeAdRequestConfiguration.m30469e()).setGender(nativeAdRequestConfiguration.m30470f()).setLocation(nativeAdRequestConfiguration.m30471g()).setParameters(nativeAdRequestConfiguration.m30472h()).setPreferredTheme(nativeAdRequestConfiguration.m30473i()).build();
            synchronized (this) {
                m28615c(build);
            }
            return;
        }
        mo21797b(AbstractC5524o4.f53160l);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: a */
    public final void mo26772a(@NonNull C5563p2 c5563p2) {
        this.f57763A.m30655b(c5563p2);
    }

    /* renamed from: a */
    public final void m30596a(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f57763A.m30650a(nativeAdLoadListener);
    }

    /* renamed from: a */
    public final void m30598a(@Nullable NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f57763A.m30651a(nativeBulkAdLoadListener);
    }

    /* renamed from: a */
    public final void m30599a(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f57763A.m30653a(sliderAdLoadListener);
    }
}
