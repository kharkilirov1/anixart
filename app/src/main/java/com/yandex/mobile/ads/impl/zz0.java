package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zz0 {

    /* renamed from: a */
    @NonNull
    private final xe0 f57405a = new xe0();

    @NonNull
    /* renamed from: a */
    public final String m30347a() {
        Objects.requireNonNull(this.f57405a);
        kb1 m29745a = xe0.m29745a();
        return String.format(Locale.US, "%d.%d%d", Integer.valueOf(m29745a.m26101a()), Integer.valueOf(m29745a.m26102b()), Integer.valueOf(m29745a.m26103c()));
    }

    @NonNull
    /* renamed from: b */
    public final String m30348b() {
        Objects.requireNonNull(this.f57405a);
        kb1 m29745a = xe0.m29745a();
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(m29745a.m26101a()), Integer.valueOf(m29745a.m26102b()), Integer.valueOf(m29745a.m26103c()));
    }
}
