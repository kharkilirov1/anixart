package com.yandex.mobile.ads.nativeads.template;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.nk0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* renamed from: com.yandex.mobile.ads.nativeads.template.e */
/* loaded from: classes3.dex */
public final class C6254e {

    /* renamed from: a */
    private final int f57932a;

    /* renamed from: b */
    private final String f57933b;

    /* renamed from: c */
    private final NativeAdImage f57934c;

    /* renamed from: d */
    private final Float f57935d;

    /* renamed from: e */
    private final String f57936e;

    /* renamed from: f */
    private final String f57937f;

    /* renamed from: g */
    private final String f57938g;

    /* renamed from: h */
    private final String f57939h;

    /* renamed from: i */
    private final String f57940i;

    /* renamed from: j */
    private final String f57941j;

    /* renamed from: k */
    private final String f57942k;

    /* renamed from: l */
    private final NativeAdImage f57943l;

    /* renamed from: m */
    private final NativeAdImage f57944m;

    public C6254e(@NonNull NativeAdAssets nativeAdAssets, @NonNull NativeAdType nativeAdType) {
        this.f57933b = nativeAdAssets.getCallToAction();
        this.f57934c = nativeAdAssets.getImage();
        this.f57935d = nativeAdAssets.getRating();
        this.f57936e = nativeAdAssets.getReviewCount();
        this.f57937f = nativeAdAssets.getWarning();
        this.f57938g = nativeAdAssets.getAge();
        this.f57939h = nativeAdAssets.getSponsored();
        this.f57940i = nativeAdAssets.getTitle();
        this.f57941j = nativeAdAssets.getBody();
        this.f57942k = nativeAdAssets.getDomain();
        this.f57943l = nativeAdAssets.getIcon();
        this.f57944m = nativeAdAssets.getFavicon();
        this.f57932a = nk0.m26921a(nativeAdType);
    }

    /* renamed from: e */
    private boolean m30730e() {
        return !((this.f57935d == null && this.f57936e == null) ? false : true);
    }

    /* renamed from: a */
    public final boolean m30731a() {
        return (this.f57940i == null && this.f57941j == null && this.f57942k == null && this.f57943l == null && this.f57944m == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean m30732b() {
        if (this.f57933b != null) {
            return 1 == this.f57932a || m30730e();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m30733c() {
        NativeAdImage nativeAdImage = this.f57934c;
        return nativeAdImage != null && ("large".equals(nativeAdImage.m30460a()) || "wide".equals(this.f57934c.m30460a()));
    }

    /* renamed from: d */
    public final boolean m30734d() {
        return (this.f57938g == null && this.f57939h == null && !m30731a()) ? false : true;
    }

    /* renamed from: f */
    public final boolean m30735f() {
        if (this.f57933b != null) {
            return true;
        }
        return this.f57935d != null || this.f57936e != null;
    }

    /* renamed from: g */
    public final boolean m30736g() {
        return (this.f57933b != null) && (m30732b() || m30733c());
    }

    /* renamed from: h */
    public final boolean m30737h() {
        return this.f57937f != null;
    }

    /* renamed from: i */
    public final boolean m30738i() {
        return m30732b() || (m30733c() && m30730e());
    }
}
