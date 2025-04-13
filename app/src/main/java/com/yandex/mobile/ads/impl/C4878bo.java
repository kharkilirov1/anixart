package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.k61;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.bo */
/* loaded from: classes3.dex */
public final class C4878bo {

    /* renamed from: h */
    public static final c51<String> f48934h = gn1.f50684c;

    /* renamed from: i */
    private static final Random f48935i = new Random();

    /* renamed from: a */
    private final k61.C5323d f48936a;

    /* renamed from: b */
    private final k61.C5321b f48937b;

    /* renamed from: c */
    private final HashMap<String, a> f48938c;

    /* renamed from: d */
    private final c51<String> f48939d;

    /* renamed from: e */
    private pq0 f48940e;

    /* renamed from: f */
    private k61 f48941f;

    /* renamed from: g */
    @Nullable
    private String f48942g;

    /* renamed from: com.yandex.mobile.ads.impl.bo$a */
    public final class a {

        /* renamed from: a */
        private final String f48943a;

        /* renamed from: b */
        private int f48944b;

        /* renamed from: c */
        private long f48945c;

        /* renamed from: d */
        private bc0.C4858b f48946d;

        /* renamed from: e */
        private boolean f48947e;

        /* renamed from: f */
        private boolean f48948f;

        public a(String str, int i2, bc0.C4858b c4858b) {
            this.f48943a = str;
            this.f48944b = i2;
            this.f48945c = c4858b == null ? -1L : c4858b.f56452d;
            if (c4858b == null || !c4858b.m29735a()) {
                return;
            }
            this.f48946d = c4858b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r0 < r8.mo25935b()) goto L15;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m22900a(com.yandex.mobile.ads.impl.k61 r7, com.yandex.mobile.ads.impl.k61 r8) {
            /*
                r6 = this;
                int r0 = r6.f48944b
                int r1 = r7.mo25935b()
                r2 = 0
                r3 = -1
                if (r0 < r1) goto L11
                int r7 = r8.mo25935b()
                if (r0 >= r7) goto L48
                goto L49
            L11:
                com.yandex.mobile.ads.impl.bo r1 = com.yandex.mobile.ads.impl.C4878bo.this
                com.yandex.mobile.ads.impl.k61$d r1 = com.yandex.mobile.ads.impl.C4878bo.m22879a(r1)
                r4 = 0
                r7.mo23974a(r0, r1, r4)
                com.yandex.mobile.ads.impl.bo r0 = com.yandex.mobile.ads.impl.C4878bo.this
                com.yandex.mobile.ads.impl.k61$d r0 = com.yandex.mobile.ads.impl.C4878bo.m22879a(r0)
                int r0 = r0.f51878o
            L24:
                com.yandex.mobile.ads.impl.bo r1 = com.yandex.mobile.ads.impl.C4878bo.this
                com.yandex.mobile.ads.impl.k61$d r1 = com.yandex.mobile.ads.impl.C4878bo.m22879a(r1)
                int r1 = r1.f51879p
                if (r0 > r1) goto L48
                java.lang.Object r1 = r7.mo23975a(r0)
                int r1 = r8.mo23970a(r1)
                if (r1 == r3) goto L45
                com.yandex.mobile.ads.impl.bo r7 = com.yandex.mobile.ads.impl.C4878bo.this
                com.yandex.mobile.ads.impl.k61$b r7 = com.yandex.mobile.ads.impl.C4878bo.m22881b(r7)
                com.yandex.mobile.ads.impl.k61$b r7 = r8.mo23972a(r1, r7, r2)
                int r0 = r7.f51851c
                goto L49
            L45:
                int r0 = r0 + 1
                goto L24
            L48:
                r0 = -1
            L49:
                r6.f48944b = r0
                if (r0 != r3) goto L4e
                return r2
            L4e:
                com.yandex.mobile.ads.impl.bc0$b r7 = r6.f48946d
                r0 = 1
                if (r7 != 0) goto L54
                return r0
            L54:
                java.lang.Object r7 = r7.f56449a
                int r7 = r8.mo23970a(r7)
                if (r7 == r3) goto L5d
                r2 = 1
            L5d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4878bo.a.m22900a(com.yandex.mobile.ads.impl.k61, com.yandex.mobile.ads.impl.k61):boolean");
        }

        /* renamed from: b */
        public final void m22902b(int i2, @Nullable bc0.C4858b c4858b) {
            if (this.f48945c == -1 && i2 == this.f48944b && c4858b != null) {
                this.f48945c = c4858b.f56452d;
            }
        }

        /* renamed from: a */
        public final boolean m22899a(int i2, @Nullable bc0.C4858b c4858b) {
            if (c4858b == null) {
                return i2 == this.f48944b;
            }
            bc0.C4858b c4858b2 = this.f48946d;
            return c4858b2 == null ? !c4858b.m29735a() && c4858b.f56452d == this.f48945c : c4858b.f56452d == c4858b2.f56452d && c4858b.f56450b == c4858b2.f56450b && c4858b.f56451c == c4858b2.f56451c;
        }

        /* renamed from: a */
        public final boolean m22901a(InterfaceC5624q8.a aVar) {
            long j2 = this.f48945c;
            if (j2 == -1) {
                return false;
            }
            bc0.C4858b c4858b = aVar.f53959d;
            if (c4858b == null) {
                return this.f48944b != aVar.f53958c;
            }
            if (c4858b.f56452d > j2) {
                return true;
            }
            if (this.f48946d == null) {
                return false;
            }
            int mo23970a = aVar.f53957b.mo23970a(c4858b.f56449a);
            int mo23970a2 = aVar.f53957b.mo23970a(this.f48946d.f56449a);
            bc0.C4858b c4858b2 = aVar.f53959d;
            if (c4858b2.f56452d < this.f48946d.f56452d || mo23970a < mo23970a2) {
                return false;
            }
            if (mo23970a > mo23970a2) {
                return true;
            }
            if (c4858b2.m29735a()) {
                bc0.C4858b c4858b3 = aVar.f53959d;
                int i2 = c4858b3.f56450b;
                int i3 = c4858b3.f56451c;
                bc0.C4858b c4858b4 = this.f48946d;
                int i4 = c4858b4.f56450b;
                return i2 > i4 || (i2 == i4 && i3 > c4858b4.f56451c);
            }
            int i5 = aVar.f53959d.f56453e;
            return i5 == -1 || i5 > this.f48946d.f56450b;
        }
    }

    public C4878bo() {
        this(f48934h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r7.f53959d.f56452d < r0.f48945c) goto L18;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m22889c(com.yandex.mobile.ads.impl.InterfaceC5624q8.a r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.mobile.ads.impl.pq0 r0 = r6.f48940e     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.k61 r0 = r7.f53957b     // Catch: java.lang.Throwable -> Lda
            boolean r0 = r0.m26043c()     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto L10
            monitor-exit(r6)
            return
        L10:
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.bo$a> r0 = r6.f48938c     // Catch: java.lang.Throwable -> Lda
            java.lang.String r1 = r6.f48942g     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bo$a r0 = (com.yandex.mobile.ads.impl.C4878bo.a) r0     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bc0$b r1 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto L46
            if (r0 == 0) goto L46
            long r1 = com.yandex.mobile.ads.impl.C4878bo.a.m22892b(r0)     // Catch: java.lang.Throwable -> Lda
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L33
            int r0 = com.yandex.mobile.ads.impl.C4878bo.a.m22893c(r0)     // Catch: java.lang.Throwable -> Lda
            int r1 = r7.f53958c     // Catch: java.lang.Throwable -> Lda
            if (r0 == r1) goto L41
            goto L3f
        L33:
            com.yandex.mobile.ads.impl.bc0$b r1 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            long r1 = r1.f56452d     // Catch: java.lang.Throwable -> Lda
            long r3 = com.yandex.mobile.ads.impl.C4878bo.a.m22892b(r0)     // Catch: java.lang.Throwable -> Lda
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L46
            monitor-exit(r6)
            return
        L46:
            int r0 = r7.f53958c     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bc0$b r1 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bo$a r0 = r6.m22878a(r0, r1)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r1 = r6.f48942g     // Catch: java.lang.Throwable -> Lda
            if (r1 != 0) goto L58
            java.lang.String r1 = com.yandex.mobile.ads.impl.C4878bo.a.m22891a(r0)     // Catch: java.lang.Throwable -> Lda
            r6.f48942g = r1     // Catch: java.lang.Throwable -> Lda
        L58:
            com.yandex.mobile.ads.impl.bc0$b r1 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Laa
            boolean r1 = r1.m29735a()     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Laa
            com.yandex.mobile.ads.impl.bc0$b r1 = new com.yandex.mobile.ads.impl.bc0$b     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bc0$b r2 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r3 = r2.f56449a     // Catch: java.lang.Throwable -> Lda
            long r4 = r2.f56452d     // Catch: java.lang.Throwable -> Lda
            int r2 = r2.f56450b     // Catch: java.lang.Throwable -> Lda
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> Lda
            int r2 = r7.f53958c     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bo$a r1 = r6.m22878a(r2, r1)     // Catch: java.lang.Throwable -> Lda
            boolean r2 = com.yandex.mobile.ads.impl.C4878bo.a.m22894d(r1)     // Catch: java.lang.Throwable -> Lda
            if (r2 != 0) goto Laa
            com.yandex.mobile.ads.impl.C4878bo.a.m22895e(r1)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.k61 r1 = r7.f53957b     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bc0$b r2 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r2 = r2.f56449a     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.k61$b r3 = r6.f48937b     // Catch: java.lang.Throwable -> Lda
            r1.mo23973a(r2, r3)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.k61$b r1 = r6.f48937b     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.bc0$b r2 = r7.f53959d     // Catch: java.lang.Throwable -> Lda
            int r2 = r2.f56450b     // Catch: java.lang.Throwable -> Lda
            long r1 = r1.m26055b(r2)     // Catch: java.lang.Throwable -> Lda
            long r1 = com.yandex.mobile.ads.impl.s91.m28119b(r1)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.k61$b r3 = r6.f48937b     // Catch: java.lang.Throwable -> Lda
            long r3 = r3.f51853e     // Catch: java.lang.Throwable -> Lda
            long r3 = com.yandex.mobile.ads.impl.s91.m28119b(r3)     // Catch: java.lang.Throwable -> Lda
            long r3 = r3 + r1
            r1 = 0
            java.lang.Math.max(r1, r3)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.pq0 r1 = r6.f48940e     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> Lda
        Laa:
            boolean r1 = com.yandex.mobile.ads.impl.C4878bo.a.m22894d(r0)     // Catch: java.lang.Throwable -> Lda
            if (r1 != 0) goto Lb8
            com.yandex.mobile.ads.impl.C4878bo.a.m22895e(r0)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.pq0 r1 = r6.f48940e     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> Lda
        Lb8:
            java.lang.String r1 = com.yandex.mobile.ads.impl.C4878bo.a.m22891a(r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = r6.f48942g     // Catch: java.lang.Throwable -> Lda
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Ld8
            boolean r1 = com.yandex.mobile.ads.impl.C4878bo.a.m22896f(r0)     // Catch: java.lang.Throwable -> Lda
            if (r1 != 0) goto Ld8
            com.yandex.mobile.ads.impl.C4878bo.a.m22897g(r0)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.pq0 r1 = r6.f48940e     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = com.yandex.mobile.ads.impl.C4878bo.a.m22891a(r0)     // Catch: java.lang.Throwable -> Lda
            com.yandex.mobile.ads.impl.tb0 r1 = (com.yandex.mobile.ads.impl.tb0) r1     // Catch: java.lang.Throwable -> Lda
            r1.m28577a(r7, r0)     // Catch: java.lang.Throwable -> Lda
        Ld8:
            monitor-exit(r6)
            return
        Lda:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4878bo.m22889c(com.yandex.mobile.ads.impl.q8$a):void");
    }

    /* renamed from: d */
    public final synchronized void m22890d(InterfaceC5624q8.a aVar) {
        Objects.requireNonNull(this.f48940e);
        k61 k61Var = this.f48941f;
        this.f48941f = aVar.f53957b;
        Iterator<a> it = this.f48938c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m22900a(k61Var, this.f48941f) || next.m22901a(aVar)) {
                it.remove();
                if (next.f48947e) {
                    if (next.f48943a.equals(this.f48942g)) {
                        this.f48942g = null;
                    }
                    ((tb0) this.f48940e).m28582b(aVar, next.f48943a);
                }
            }
        }
        m22882b(aVar);
    }

    public C4878bo(c51<String> c51Var) {
        this.f48939d = c51Var;
        this.f48936a = new k61.C5323d();
        this.f48937b = new k61.C5321b();
        this.f48938c = new HashMap<>();
        this.f48941f = k61.f51847a;
    }

    /* renamed from: a */
    public final void m22885a(pq0 pq0Var) {
        this.f48940e = pq0Var;
    }

    @Nullable
    /* renamed from: b */
    public final synchronized String m22888b() {
        return this.f48942g;
    }

    @RequiresNonNull({"listener"})
    /* renamed from: b */
    private void m22882b(InterfaceC5624q8.a aVar) {
        if (aVar.f53957b.m26043c()) {
            this.f48942g = null;
            return;
        }
        a aVar2 = this.f48938c.get(this.f48942g);
        this.f48942g = m22878a(aVar.f53958c, aVar.f53959d).f48943a;
        m22889c(aVar);
        bc0.C4858b c4858b = aVar.f53959d;
        if (c4858b == null || !c4858b.m29735a()) {
            return;
        }
        if (aVar2 != null && aVar2.f48945c == aVar.f53959d.f56452d && aVar2.f48946d != null && aVar2.f48946d.f56450b == aVar.f53959d.f56450b && aVar2.f48946d.f56451c == aVar.f53959d.f56451c) {
            return;
        }
        bc0.C4858b c4858b2 = aVar.f53959d;
        m22878a(aVar.f53958c, new bc0.C4858b(c4858b2.f56449a, c4858b2.f56452d));
        Objects.requireNonNull(this.f48940e);
    }

    /* renamed from: a */
    public final synchronized String m22884a(k61 k61Var, bc0.C4858b c4858b) {
        return m22878a(k61Var.mo23973a(c4858b.f56449a, this.f48937b).f51851c, c4858b).f48943a;
    }

    /* renamed from: a */
    public final synchronized void m22887a(InterfaceC5624q8.a aVar, int i2) {
        Objects.requireNonNull(this.f48940e);
        boolean z = i2 == 0;
        Iterator<a> it = this.f48938c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m22901a(aVar)) {
                it.remove();
                if (next.f48947e) {
                    boolean equals = next.f48943a.equals(this.f48942g);
                    if (z && equals) {
                        boolean unused = next.f48948f;
                    }
                    if (equals) {
                        this.f48942g = null;
                    }
                    ((tb0) this.f48940e).m28582b(aVar, next.f48943a);
                }
            }
        }
        m22882b(aVar);
    }

    /* renamed from: a */
    public final synchronized void m22886a(InterfaceC5624q8.a aVar) {
        pq0 pq0Var;
        this.f48942g = null;
        Iterator<a> it = this.f48938c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f48947e && (pq0Var = this.f48940e) != null) {
                ((tb0) pq0Var).m28582b(aVar, next.f48943a);
            }
        }
    }

    /* renamed from: a */
    private a m22878a(int i2, @Nullable bc0.C4858b c4858b) {
        a aVar = null;
        long j2 = Long.MAX_VALUE;
        for (a aVar2 : this.f48938c.values()) {
            aVar2.m22902b(i2, c4858b);
            if (aVar2.m22899a(i2, c4858b)) {
                long j3 = aVar2.f48945c;
                if (j3 == -1 || j3 < j2) {
                    aVar = aVar2;
                    j2 = j3;
                } else if (j3 == j2) {
                    int i3 = s91.f54530a;
                    if (aVar.f48946d != null && aVar2.f48946d != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f48939d.get();
        a aVar3 = new a(str, i2, c4858b);
        this.f48938c.put(str, aVar3);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static String m22880a() {
        byte[] bArr = new byte[12];
        f48935i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
