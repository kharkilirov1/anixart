package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.z10;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.a */
/* loaded from: classes3.dex */
final class C6173a {

    /* renamed from: a */
    @NonNull
    private final C6175c f57537a;

    /* renamed from: b */
    @NonNull
    private final C6174b f57538b;

    public C6173a(@NonNull Context context, @NonNull C6175c c6175c) {
        this.f57537a = c6175c;
        this.f57538b = new C6174b(context);
    }

    @Nullable
    /* renamed from: a */
    public final z10 m30420a(@NonNull Map<String, Bitmap> map, @Nullable MediatedNativeAdImage mediatedNativeAdImage) {
        if (mediatedNativeAdImage == null) {
            return null;
        }
        String url = mediatedNativeAdImage.getUrl();
        int width = mediatedNativeAdImage.getWidth();
        int height = mediatedNativeAdImage.getHeight();
        Objects.requireNonNull(this.f57537a);
        if (width > 0 && height > 0) {
            String m30421a = this.f57538b.m30421a(width, height);
            z10 z10Var = new z10();
            z10Var.m30040b(url);
            z10Var.m30039b(width);
            z10Var.m30035a(height);
            z10Var.m30037a(m30421a);
            return z10Var;
        }
        Bitmap bitmap = map.get(url);
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        String m30421a2 = this.f57538b.m30421a(width2, height2);
        z10 z10Var2 = new z10();
        z10Var2.m30040b(url);
        z10Var2.m30039b(width2);
        z10Var2.m30035a(height2);
        z10Var2.m30037a(m30421a2);
        return z10Var2;
    }
}
