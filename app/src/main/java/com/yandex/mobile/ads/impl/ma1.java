package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public final class ma1 implements hw0<List<pb1>> {

    /* renamed from: a */
    @NonNull
    private final C5519o1 f52617a;

    /* renamed from: b */
    @NonNull
    private final hw0<m50> f52618b;

    /* renamed from: c */
    @NonNull
    private final n50 f52619c;

    public ma1(@NonNull Context context, @NonNull C5519o1 c5519o1, @NonNull hw0<m50> hw0Var) {
        this.f52617a = c5519o1;
        this.f52618b = hw0Var;
        this.f52619c = new n50(context);
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(@NonNull List<pb1> list) {
        m50 m26797a = this.f52619c.m26797a(this.f52617a, list);
        if (m26797a != null) {
            this.f52618b.mo22374a((hw0<m50>) m26797a);
        } else {
            this.f52618b.mo22373a(ac1.m22462b("Failed to parse ad break"));
        }
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NonNull ac1 ac1Var) {
        this.f52618b.mo22373a(ac1Var);
    }
}
