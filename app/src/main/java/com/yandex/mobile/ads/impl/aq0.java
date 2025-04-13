package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class aq0 extends AbstractC4967de<km0> {

    /* renamed from: r */
    private static final int f48640r = (int) TimeUnit.SECONDS.toMillis(10);

    public aq0(@NonNull Context context, @NonNull String str, @NonNull AbstractC4967de.a<km0> aVar) {
        super(0, str, aVar);
        m22615a(context);
    }

    /* renamed from: a */
    private void m22615a(@NonNull Context context) {
        Integer m23608q;
        cz0 m29824a = xz0.m29823b().m29824a(context);
        m30310a(new C4982do(1.0f, f48640r, (m29824a == null || (m23608q = m29824a.m23608q()) == null) ? 0 : m23608q.intValue()));
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final tw0<km0> mo22616a(km0 km0Var) {
        return tw0.m28764a(km0Var, k00.m26002a(km0Var));
    }
}
