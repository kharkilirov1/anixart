package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ia1 implements hw0<ha1> {

    /* renamed from: a */
    @NonNull
    private final pa1 f51246a;

    /* renamed from: b */
    @NonNull
    private final yd1 f51247b;

    /* renamed from: c */
    @NonNull
    private final C5724s3 f51248c;

    /* renamed from: d */
    @NonNull
    private final hw0<ha1> f51249d;

    public ia1(@NonNull Context context, @NonNull pa1 pa1Var, @NonNull C5724s3 c5724s3, @NonNull fa1 fa1Var, @NonNull sa1 sa1Var) {
        this.f51246a = pa1Var;
        this.f51248c = c5724s3;
        this.f51249d = sa1Var;
        this.f51247b = new yd1(context, fa1Var);
    }

    /* renamed from: a */
    public static void m25479a(ia1 ia1Var) {
        Objects.requireNonNull(ia1Var);
        ia1Var.f51248c.m28051a(EnumC5668r3.f54178k, new na1("success", null), ia1Var.f51246a);
    }

    /* renamed from: a */
    public static void m25480a(ia1 ia1Var, ac1 ac1Var) {
        Objects.requireNonNull(ia1Var);
        ia1Var.f51248c.m28051a(EnumC5668r3.f54178k, new na1("error", ac1Var), ia1Var.f51246a);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ia1$a */
    public class C5221a implements hw0<List<pb1>> {

        /* renamed from: a */
        @NonNull
        private final ha1 f51250a;

        /* renamed from: b */
        @NonNull
        private final hw0<ha1> f51251b;

        public C5221a(ha1 ha1Var, @NonNull hw0<ha1> hw0Var) {
            this.f51250a = ha1Var;
            this.f51251b = hw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22374a(@NonNull List<pb1> list) {
            ia1.m25479a(ia1.this);
            this.f51251b.mo22374a((hw0<ha1>) new ha1(new ca1(this.f51250a.m25101b().m23086a(), list), this.f51250a.m25100a()));
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22373a(@NonNull ac1 ac1Var) {
            ia1.m25480a(ia1.this, ac1Var);
            this.f51251b.mo22373a(ac1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(@NonNull ha1 ha1Var) {
        ha1 ha1Var2 = ha1Var;
        this.f51247b.m29917a(ha1Var2.m25101b().m23087b(), new C5221a(ha1Var2, this.f51249d));
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NonNull ac1 ac1Var) {
        this.f51248c.m28051a(EnumC5668r3.f54178k, new na1("error", ac1Var), this.f51246a);
        this.f51249d.mo22373a(ac1Var);
    }
}
