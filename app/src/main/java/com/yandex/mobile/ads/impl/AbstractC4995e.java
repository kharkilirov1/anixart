package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.k61;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4995e extends k61 {

    /* renamed from: b */
    private final int f49771b;

    /* renamed from: c */
    private final x01 f49772c;

    /* renamed from: d */
    private final boolean f49773d = false;

    public AbstractC4995e(x01 x01Var) {
        this.f49772c = x01Var;
        this.f49771b = x01Var.mo29614a();
    }

    /* renamed from: c */
    public static Object m23967c(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: d */
    public static Object m23968d(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final k61.C5321b mo23973a(Object obj, k61.C5321b c5321b) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo23978b = mo23978b(obj2);
        int mo23983f = mo23983f(mo23978b);
        mo23984g(mo23978b).mo23973a(obj3, c5321b);
        c5321b.f51851c += mo23983f;
        c5321b.f51850b = obj;
        return c5321b;
    }

    /* renamed from: b */
    public abstract int mo23976b(int i2);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0031, code lost:
    
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0035, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo23977b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f49773d
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = 2
        La:
            r9 = 0
        Lb:
            int r0 = r6.mo23980c(r7)
            int r4 = r6.mo23983f(r0)
            com.yandex.mobile.ads.impl.k61 r5 = r6.mo23984g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.mo23977b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L30
            com.yandex.mobile.ads.impl.x01 r7 = r6.f49772c
            int r7 = r7.mo29620d(r0)
            r0 = r7
            r7 = r6
            goto L35
        L30:
            r7 = r6
            if (r0 <= 0) goto L34
            goto L4c
        L34:
            r0 = -1
        L35:
            if (r0 == r1) goto L4e
            com.yandex.mobile.ads.impl.k61 r4 = r7.mo23984g(r0)
            boolean r4 = r4.m26043c()
            if (r4 == 0) goto L4e
            if (r9 == 0) goto L4a
            com.yandex.mobile.ads.impl.x01 r4 = r7.f49772c
            int r0 = r4.mo29620d(r0)
            goto L35
        L4a:
            if (r0 <= 0) goto L34
        L4c:
            int r0 = r0 - r2
            goto L35
        L4e:
            if (r0 == r1) goto L5e
            int r8 = r7.mo23983f(r0)
            com.yandex.mobile.ads.impl.k61 r7 = r7.mo23984g(r0)
            int r7 = r7.mo23979b(r9)
            int r7 = r7 + r8
            return r7
        L5e:
            if (r8 != r3) goto L65
            int r7 = r7.mo23979b(r9)
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC4995e.mo23977b(int, int, boolean):int");
    }

    /* renamed from: b */
    public abstract int mo23978b(Object obj);

    /* renamed from: c */
    public abstract int mo23980c(int i2);

    /* renamed from: d */
    public abstract Object mo23981d(int i2);

    /* renamed from: e */
    public abstract int mo23982e(int i2);

    /* renamed from: f */
    public abstract int mo23983f(int i2);

    /* renamed from: g */
    public abstract k61 mo23984g(int i2);

    /* renamed from: a */
    public static Object m23966a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo23969a(int i2, int i3, boolean z) {
        AbstractC4995e abstractC4995e;
        int i4;
        if (this.f49773d) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int mo23980c = mo23980c(i2);
        int mo23983f = mo23983f(mo23980c);
        int mo23969a = mo23984g(mo23980c).mo23969a(i2 - mo23983f, i3 != 2 ? i3 : 0, z);
        if (mo23969a != -1) {
            return mo23983f + mo23969a;
        }
        if (z) {
            i4 = this.f49772c.mo29615a(mo23980c);
            abstractC4995e = this;
        } else if (mo23980c < this.f49771b - 1) {
            abstractC4995e = this;
            i4 = mo23980c + 1;
        } else {
            abstractC4995e = this;
            i4 = -1;
        }
        while (i4 != -1 && abstractC4995e.mo23984g(i4).m26043c()) {
            if (z) {
                i4 = abstractC4995e.f49772c.mo29615a(i4);
            } else {
                i4 = i4 < abstractC4995e.f49771b - 1 ? i4 + 1 : -1;
            }
        }
        if (i4 != -1) {
            return abstractC4995e.mo23984g(i4).mo23971a(z) + abstractC4995e.mo23983f(i4);
        }
        if (i3 == 2) {
            return abstractC4995e.mo23971a(z);
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: b */
    public final int mo23979b(boolean z) {
        int i2 = this.f49771b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f49773d) {
            z = false;
        }
        int mo29618c = z ? this.f49772c.mo29618c() : i2 - 1;
        while (mo23984g(mo29618c).m26043c()) {
            if (z) {
                mo29618c = this.f49772c.mo29620d(mo29618c);
            } else {
                mo29618c = mo29618c > 0 ? mo29618c - 1 : -1;
            }
            if (mo29618c == -1) {
                return -1;
            }
        }
        return mo23984g(mo29618c).mo23979b(z) + mo23983f(mo29618c);
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo23971a(boolean z) {
        if (this.f49771b == 0) {
            return -1;
        }
        if (this.f49773d) {
            z = false;
        }
        int mo29616b = z ? this.f49772c.mo29616b() : 0;
        while (mo23984g(mo29616b).m26043c()) {
            if (z) {
                mo29616b = this.f49772c.mo29615a(mo29616b);
            } else {
                mo29616b = mo29616b < this.f49771b + (-1) ? mo29616b + 1 : -1;
            }
            if (mo29616b == -1) {
                return -1;
            }
        }
        return mo23984g(mo29616b).mo23971a(z) + mo23983f(mo29616b);
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final k61.C5323d mo23974a(int i2, k61.C5323d c5323d, long j2) {
        int mo23980c = mo23980c(i2);
        int mo23983f = mo23983f(mo23980c);
        int mo23982e = mo23982e(mo23980c);
        mo23984g(mo23980c).mo23974a(i2 - mo23983f, c5323d, j2);
        Object mo23981d = mo23981d(mo23980c);
        if (!k61.C5323d.f51860r.equals(c5323d.f51864a)) {
            mo23981d = Pair.create(mo23981d, c5323d.f51864a);
        }
        c5323d.f51864a = mo23981d;
        c5323d.f51878o += mo23982e;
        c5323d.f51879p += mo23982e;
        return c5323d;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final k61.C5321b mo23972a(int i2, k61.C5321b c5321b, boolean z) {
        int mo23976b = mo23976b(i2);
        int mo23983f = mo23983f(mo23976b);
        mo23984g(mo23976b).mo23972a(i2 - mo23982e(mo23976b), c5321b, z);
        c5321b.f51851c += mo23983f;
        if (z) {
            Object mo23981d = mo23981d(mo23976b);
            Object obj = c5321b.f51850b;
            Objects.requireNonNull(obj);
            c5321b.f51850b = Pair.create(mo23981d, obj);
        }
        return c5321b;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo23970a(Object obj) {
        int mo23970a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo23978b = mo23978b(obj2);
        if (mo23978b == -1 || (mo23970a = mo23984g(mo23978b).mo23970a(obj3)) == -1) {
            return -1;
        }
        return mo23982e(mo23978b) + mo23970a;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final Object mo23975a(int i2) {
        int mo23976b = mo23976b(i2);
        return Pair.create(mo23981d(mo23976b), mo23984g(mo23976b).mo23975a(i2 - mo23982e(mo23976b)));
    }
}
