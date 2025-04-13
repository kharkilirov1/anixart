package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class yd1 {

    /* renamed from: a */
    @NonNull
    private final Context f56803a;

    /* renamed from: b */
    @NonNull
    private final jj1 f56804b;

    /* renamed from: c */
    @NonNull
    private final xd1 f56805c = new xd1();

    /* renamed from: d */
    @NonNull
    private final ArrayList f56806d = new ArrayList();

    public yd1(@NonNull Context context, @NonNull fa1 fa1Var) {
        this.f56803a = context.getApplicationContext();
        this.f56804b = new jj1(context, fa1Var);
    }

    /* renamed from: a */
    public final void m29917a(@NonNull List<pb1> list, @NonNull hw0<List<pb1>> hw0Var) {
        Objects.requireNonNull(this.f56805c);
        wd1 m29744a = xd1.m29744a(list);
        this.f56806d.addAll(m29744a.m29473a());
        this.f56804b.m25898a(this.f56803a, m29744a.m29474b(), new C6072a(hw0Var));
    }

    /* renamed from: com.yandex.mobile.ads.impl.yd1$a */
    public class C6072a implements hw0<List<pb1>> {

        /* renamed from: a */
        @NonNull
        private final hw0<List<pb1>> f56807a;

        public C6072a(hw0<List<pb1>> hw0Var) {
            this.f56807a = hw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22374a(@NonNull List<pb1> list) {
            Objects.requireNonNull(yd1.this.f56805c);
            wd1 m29744a = xd1.m29744a(list);
            yd1.this.f56806d.addAll(m29744a.m29473a());
            List<pb1> m29474b = m29744a.m29474b();
            if (m29474b.isEmpty()) {
                m29918a();
            } else {
                yd1.this.f56804b.m25898a(yd1.this.f56803a, m29474b, this);
            }
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22373a(@NonNull ac1 ac1Var) {
            m29918a();
        }

        /* renamed from: a */
        private void m29918a() {
            if (!yd1.this.f56806d.isEmpty()) {
                this.f56807a.mo22374a((hw0<List<pb1>>) yd1.this.f56806d);
            } else {
                this.f56807a.mo22373a(ac1.m22459a(new C5143gr()));
            }
        }
    }
}
