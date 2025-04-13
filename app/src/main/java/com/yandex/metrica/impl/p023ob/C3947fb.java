package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;

/* renamed from: com.yandex.metrica.impl.ob.fb */
/* loaded from: classes2.dex */
public class C3947fb {

    /* renamed from: a */
    @NonNull
    private final C3566Q9 f45122a;

    /* renamed from: b */
    @NonNull
    private final C3566Q9 f45123b;

    /* renamed from: c */
    @NonNull
    private final C3791Za<C3196Be> f45124c;

    /* renamed from: d */
    @NonNull
    private final C3791Za<C3535P3> f45125d;

    public C3947fb(@NonNull Context context) {
        this(context, InterfaceC3467Ma.b.m18577a(C3535P3.class).mo18575a(context), InterfaceC3467Ma.b.m18577a(C3196Be.class).mo18575a(context), new C3817ab());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m19897a(@NonNull C3575Qi c3575Qi) {
        this.f45124c.m19506a(this.f45123b.m18782b(), c3575Qi.m18855m());
        this.f45125d.m19506a(this.f45122a.m18782b(), c3575Qi.m18855m());
    }

    @VisibleForTesting
    public C3947fb(@NonNull Context context, @NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92, @NonNull C3817ab c3817ab) {
        this.f45122a = c3566q9;
        this.f45123b = c3566q92;
        this.f45124c = c3817ab.m19575c(context, C3454Lm.m18520c());
        this.f45125d = c3817ab.m19574b(context, C3454Lm.m18520c());
    }
}
