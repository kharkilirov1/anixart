package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.z10;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.d */
/* loaded from: classes3.dex */
final class C6176d {

    /* renamed from: a */
    @NonNull
    private final C6173a f57540a;

    public C6176d(@NonNull C6173a c6173a) {
        this.f57540a = c6173a;
    }

    @Nullable
    /* renamed from: a */
    public final jc0 m30422a(@NonNull Map<String, Bitmap> map, @Nullable MediatedNativeAdImage mediatedNativeAdImage, @Nullable MediatedNativeAdMedia mediatedNativeAdMedia) {
        ArrayList arrayList;
        z10 m30420a = this.f57540a.m30420a(map, mediatedNativeAdImage);
        ka0 ka0Var = mediatedNativeAdMedia != null ? new ka0(null, mediatedNativeAdMedia.getAspectRatio()) : null;
        if (m30420a != null) {
            arrayList = new ArrayList();
            arrayList.add(m30420a);
        } else {
            arrayList = null;
        }
        if (m30420a == null && ka0Var == null) {
            return null;
        }
        return new jc0(ka0Var, null, arrayList);
    }
}
