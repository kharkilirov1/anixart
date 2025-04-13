package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public interface e01 {

    /* renamed from: com.yandex.mobile.ads.impl.e01$a */
    public static final class C4997a {

        /* renamed from: a */
        public final g01 f49774a;

        /* renamed from: b */
        public final g01 f49775b;

        public C4997a(g01 g01Var) {
            this(g01Var, g01Var);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4997a.class != obj.getClass()) {
                return false;
            }
            C4997a c4997a = (C4997a) obj;
            return this.f49774a.equals(c4997a.f49774a) && this.f49775b.equals(c4997a.f49775b);
        }

        public final int hashCode() {
            return this.f49775b.hashCode() + (this.f49774a.hashCode() * 31);
        }

        public final String toString() {
            String sb;
            StringBuilder m26356a = l60.m26356a("[");
            m26356a.append(this.f49774a);
            if (this.f49774a.equals(this.f49775b)) {
                sb = "";
            } else {
                StringBuilder m26356a2 = l60.m26356a(", ");
                m26356a2.append(this.f49775b);
                sb = m26356a2.toString();
            }
            return C0000a.m20q(m26356a, sb, "]");
        }

        public C4997a(g01 g01Var, g01 g01Var2) {
            this.f49774a = (g01) C5220ia.m25469a(g01Var);
            this.f49775b = (g01) C5220ia.m25469a(g01Var2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e01$b */
    public static class C4998b implements e01 {

        /* renamed from: a */
        private final long f49776a;

        /* renamed from: b */
        private final C4997a f49777b;

        public C4998b() {
            this(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final C4997a mo22565b(long j2) {
            return this.f49777b;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final boolean mo22566b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: c */
        public final long mo22567c() {
            return this.f49776a;
        }

        public C4998b(long j2, long j3) {
            this.f49776a = j2;
            this.f49777b = new C4997a(j3 == 0 ? g01.f50467c : new g01(0L, j3));
        }
    }

    /* renamed from: b */
    C4997a mo22565b(long j2);

    /* renamed from: b */
    boolean mo22566b();

    /* renamed from: c */
    long mo22567c();
}
