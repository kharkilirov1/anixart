package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.vo */
/* loaded from: classes3.dex */
public final class C5932vo {

    /* renamed from: a */
    @NonNull
    private final C6034xo f55857a = new C6034xo();

    /* renamed from: b */
    @NonNull
    private final u80 f55858b = new u80();

    @Nullable
    /* renamed from: a */
    public static String m29243a() {
        return Build.MANUFACTURER;
    }

    @Nullable
    /* renamed from: b */
    public final String m29245b(@NonNull Context context) {
        return this.f55858b.m28912a(context);
    }

    @Nullable
    /* renamed from: a */
    public final String m29244a(@NonNull Context context) {
        return C5982wo.m29517a(this.f55857a.m29779a(context)).toLowerCase(Locale.US);
    }
}
