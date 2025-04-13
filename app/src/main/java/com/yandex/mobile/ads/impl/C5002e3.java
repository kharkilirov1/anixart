package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.e3 */
/* loaded from: classes3.dex */
public final class C5002e3 {

    /* renamed from: a */
    @NonNull
    private final C5160h3 f49793a = C5160h3.m25034b();

    /* renamed from: b */
    @NonNull
    private final C5055f3 f49794b = new C5055f3();

    @NonNull
    /* renamed from: a */
    public final String m23998a(@NonNull Context context) {
        ArrayList m25035a = this.f49793a.m25035a();
        Objects.requireNonNull(this.f49794b);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return TextUtils.join(",", m25035a.subList(m25035a.size() - Math.min((m29824a == null || m29824a.m23592c() == 0) ? 5 : m29824a.m23592c(), m25035a.size()), m25035a.size()));
    }

    @NonNull
    /* renamed from: b */
    public final String m23999b(@NonNull Context context) {
        ArrayList m25038c = this.f49793a.m25038c();
        Objects.requireNonNull(this.f49794b);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return TextUtils.join(",", m25038c.subList(m25038c.size() - Math.min((m29824a == null || m29824a.m23592c() == 0) ? 5 : m29824a.m23592c(), m25038c.size()), m25038c.size()));
    }
}
