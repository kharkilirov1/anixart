package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class kj1 {

    /* renamed from: a */
    @NonNull
    private final gj1 f51992a;

    /* renamed from: b */
    @NonNull
    private final ArrayList f51993b = new ArrayList();

    /* renamed from: c */
    @Nullable
    private hw0<List<pb1>> f51994c;

    /* renamed from: d */
    private int f51995d;

    /* renamed from: com.yandex.mobile.ads.impl.kj1$a */
    public class C5341a implements hw0<List<pb1>> {
        private C5341a() {
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22374a(@NonNull List<pb1> list) {
            kj1.m26134b(kj1.this);
            kj1.this.f51993b.addAll(list);
            m26138a();
        }

        public /* synthetic */ C5341a(kj1 kj1Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22373a(@NonNull ac1 ac1Var) {
            kj1.m26134b(kj1.this);
            m26138a();
        }

        /* renamed from: a */
        private void m26138a() {
            if (kj1.this.f51995d != 0 || kj1.this.f51994c == null) {
                return;
            }
            kj1.this.f51994c.mo22374a((hw0) kj1.this.f51993b);
        }
    }

    public kj1(@NonNull Context context, @NonNull fa1 fa1Var) {
        this.f51992a = new gj1(context, fa1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ void m26134b(kj1 kj1Var) {
        kj1Var.f51995d--;
    }

    /* renamed from: a */
    public final void m26137a(@NonNull Context context, @NonNull List<pb1> list, @NonNull hw0<List<pb1>> hw0Var) {
        if (list.isEmpty()) {
            hw0Var.mo22374a((hw0<List<pb1>>) this.f51993b);
            return;
        }
        this.f51994c = hw0Var;
        for (pb1 pb1Var : list) {
            this.f51995d++;
            this.f51992a.m24907a(context, pb1Var, new C5341a(this, 0));
        }
    }
}
