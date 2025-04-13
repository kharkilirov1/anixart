package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.w4 */
/* loaded from: classes3.dex */
public final class C5956w4 {

    /* renamed from: b */
    private static final int f56004b = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    @NonNull
    private final C5565p4 f56005a = new C5565p4();

    @NonNull
    /* renamed from: a */
    public final C4982do m29373a(@NonNull Context context) {
        return m29374a(context, f56004b);
    }

    @NonNull
    /* renamed from: a */
    public final C4982do m29374a(@NonNull Context context, int i2) {
        Integer m23594d;
        Objects.requireNonNull(this.f56005a);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return new C4982do(1.0f, i2, (m29824a == null || (m23594d = m29824a.m23594d()) == null) ? 0 : m23594d.intValue());
    }
}
