package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5229ih;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o31 {

    /* renamed from: a */
    private final AbstractC5229ih f53142a;

    /* renamed from: b */
    private final InterfaceC5523b f53143b;

    /* renamed from: com.yandex.mobile.ads.impl.o31$a */
    public static abstract class AbstractC5522a extends AbstractC5051f<String> {

        /* renamed from: c */
        public final CharSequence f53144c;

        /* renamed from: d */
        public final AbstractC5229ih f53145d;

        /* renamed from: e */
        public final boolean f53146e;

        /* renamed from: f */
        public int f53147f = 0;

        /* renamed from: g */
        public int f53148g;

        public AbstractC5522a(o31 o31Var, CharSequence charSequence) {
            this.f53145d = o31Var.f53142a;
            this.f53146e = o31.m26992b(o31Var);
            this.f53148g = o31.m26993c(o31Var);
            this.f53144c = charSequence;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o31$b */
    public interface InterfaceC5523b {
    }

    private o31(n31 n31Var, AbstractC5229ih abstractC5229ih) {
        this.f53143b = n31Var;
        this.f53142a = abstractC5229ih;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m26992b(o31 o31Var) {
        Objects.requireNonNull(o31Var);
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ int m26993c(o31 o31Var) {
        Objects.requireNonNull(o31Var);
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static o31 m26991a(char c2) {
        return new o31(new n31(new AbstractC5229ih.b(c2)), AbstractC5229ih.d.f51302b);
    }

    /* renamed from: a */
    public final List<String> m26994a(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        n31 n31Var = (n31) this.f53143b;
        Objects.requireNonNull(n31Var);
        m31 m31Var = new m31(n31Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (m31Var.hasNext()) {
            arrayList.add(m31Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
