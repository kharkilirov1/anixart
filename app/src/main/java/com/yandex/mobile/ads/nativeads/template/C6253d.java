package com.yandex.mobile.ads.nativeads.template;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.nk0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* renamed from: com.yandex.mobile.ads.nativeads.template.d */
/* loaded from: classes3.dex */
public final class C6253d {

    /* renamed from: a */
    private final NativeAdImage f57927a;

    /* renamed from: b */
    private final NativeAdImage f57928b;

    /* renamed from: c */
    private final NativeAdImage f57929c;

    /* renamed from: d */
    private final NativeAdMedia f57930d;

    /* renamed from: e */
    private final int f57931e;

    public C6253d(@NonNull NativeAdAssets nativeAdAssets, @NonNull NativeAdType nativeAdType) {
        this.f57927a = nativeAdAssets.getFavicon();
        this.f57928b = nativeAdAssets.getIcon();
        this.f57929c = nativeAdAssets.getImage();
        this.f57930d = nativeAdAssets.getMedia();
        this.f57931e = nk0.m26921a(nativeAdType);
    }

    /* renamed from: a */
    public static boolean m30723a(@NonNull NativeAdImage nativeAdImage) {
        return "large".equals(nativeAdImage.m30460a()) || "wide".equals(nativeAdImage.m30460a());
    }

    /* renamed from: b */
    public final boolean m30725b() {
        NativeAdImage nativeAdImage;
        return (m30726c() || this.f57927a == null || !(m30728e() || (nativeAdImage = this.f57929c) == null || m30723a(nativeAdImage))) ? false : true;
    }

    /* renamed from: c */
    public final boolean m30726c() {
        if (this.f57928b != null) {
            if ((2 == this.f57931e) || !m30729f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m30727d() {
        NativeAdImage nativeAdImage;
        return (m30728e() || (nativeAdImage = this.f57929c) == null || !m30723a(nativeAdImage)) ? false : true;
    }

    /* renamed from: e */
    public final boolean m30728e() {
        return this.f57930d != null;
    }

    /* renamed from: f */
    public final boolean m30729f() {
        NativeAdImage nativeAdImage;
        if (!m30728e() && (nativeAdImage = this.f57929c) != null && !m30723a(nativeAdImage)) {
            if (!(2 == this.f57931e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m30724a() {
        NativeAdImage nativeAdImage;
        return (m30728e() || (nativeAdImage = this.f57929c) == null || !"fill".equals(nativeAdImage.m30460a())) ? false : true;
    }
}
