package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ij1 {

    /* renamed from: a */
    @NonNull
    private final xd1 f51314a = new xd1();

    /* renamed from: b */
    @NonNull
    private final nj1 f51315b;

    /* renamed from: c */
    @NonNull
    private final dj1 f51316c;

    public ij1(@NonNull Context context, @NonNull pb1 pb1Var) {
        this.f51315b = new nj1(pb1Var);
        this.f51316c = new dj1(context, pb1Var);
    }

    @NonNull
    /* renamed from: a */
    public final List<pb1> m25550a(@NonNull List<pb1> list) {
        lj1 m26920a = this.f51315b.m26920a();
        if (m26920a == null) {
            return list;
        }
        if (!m26920a.m26476b()) {
            Objects.requireNonNull(this.f51314a);
            list = xd1.m29744a(list).m29473a();
        }
        if (!m26920a.m26475a() && !list.isEmpty()) {
            list = Collections.singletonList(list.get(0));
        }
        return this.f51316c.m23896a(list);
    }
}
