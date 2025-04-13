package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.C5097fz;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5618q4;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.C5838u3;
import com.yandex.mobile.ads.impl.InterfaceC5470n2;

/* renamed from: com.yandex.mobile.ads.banner.d */
/* loaded from: classes2.dex */
public final class C4636d implements InterfaceC5470n2 {

    /* renamed from: a */
    @NonNull
    private final Handler f47630a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final C5838u3 f47631b;

    /* renamed from: c */
    @Nullable
    private BannerAdEventListener f47632c;

    public C4636d(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f47631b = new C5838u3(context, c5724s3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21762c() {
        BannerAdEventListener bannerAdEventListener = this.f47632c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
    }

    /* renamed from: a */
    public final void m21768a(@NonNull C5101g2 c5101g2) {
        this.f47631b.m28846b(new C5618q4(c5101g2));
    }

    /* renamed from: b */
    public final void m21770b(@Nullable ImpressionData impressionData) {
        this.f47630a.post(new RunnableC0207a(this, impressionData, 14));
    }

    /* renamed from: d */
    public final void m21771d() {
        this.f47631b.m28843a();
        this.f47630a.post(new RunnableC4644l(this, 0));
    }

    /* renamed from: e */
    public final void m21772e() {
        this.f47630a.post(new RunnableC4644l(this, 2));
    }

    /* renamed from: f */
    public final void m21773f() {
        this.f47630a.post(new RunnableC4644l(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21760b() {
        BannerAdEventListener bannerAdEventListener = this.f47632c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
            bannerAdEventListener.onLeftApplication();
        }
    }

    /* renamed from: a */
    public final void m21767a(@NonNull C5097fz c5097fz) {
        this.f47631b.m28844a(c5097fz);
    }

    /* renamed from: a */
    public final void m21769a(@NonNull C5563p2 c5563p2) {
        this.f47631b.m28845a(c5563p2.m27145b());
        this.f47630a.post(new RunnableC0207a(this, new AdRequestError(c5563p2.m27144a(), c5563p2.m27145b()), 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21758a(AdRequestError adRequestError) {
        BannerAdEventListener bannerAdEventListener = this.f47632c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21759a(ImpressionData impressionData) {
        BannerAdEventListener bannerAdEventListener = this.f47632c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21756a() {
        BannerAdEventListener bannerAdEventListener = this.f47632c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoaded();
        }
    }

    /* renamed from: a */
    public final void m21766a(@Nullable BannerAdEventListener bannerAdEventListener) {
        this.f47632c = bannerAdEventListener;
    }
}
