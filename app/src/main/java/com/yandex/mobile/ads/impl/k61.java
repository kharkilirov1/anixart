package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C6054y3;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import com.yandex.mobile.ads.impl.pb0;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class k61 implements InterfaceC5589pf {

    /* renamed from: a */
    public static final k61 f51847a = new C5320a();

    /* renamed from: com.yandex.mobile.ads.impl.k61$a */
    public class C5320a extends k61 {
        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo25934a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23970a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final C5323d mo23974a(int i2, C5323d c5323d, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: b */
        public final int mo25935b() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final C5321b mo23972a(int i2, C5321b c5321b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final Object mo23975a(int i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k61$b */
    public static final class C5321b implements InterfaceC5589pf {

        /* renamed from: h */
        public static final InterfaceC5589pf.a<C5321b> f51848h = jp1.f51694e;

        /* renamed from: a */
        @Nullable
        public Object f51849a;

        /* renamed from: b */
        @Nullable
        public Object f51850b;

        /* renamed from: c */
        public int f51851c;

        /* renamed from: d */
        public long f51852d;

        /* renamed from: e */
        public long f51853e;

        /* renamed from: f */
        public boolean f51854f;

        /* renamed from: g */
        private C6054y3 f51855g = C6054y3.f56644g;

        /* renamed from: b */
        public final long m26055b(int i2) {
            return this.f51855g.m29854a(i2).f56654a;
        }

        /* renamed from: c */
        public final int m26056c() {
            return this.f51855g.f56651e;
        }

        /* renamed from: d */
        public final int m26059d(int i2) {
            return this.f51855g.m29854a(i2).m29857a(-1);
        }

        /* renamed from: e */
        public final boolean m26060e(int i2) {
            C6054y3.a m29854a = this.f51855g.m29854a(i2);
            boolean z = false;
            if (m29854a.f56655b != -1) {
                for (int i3 = 0; i3 < m29854a.f56655b; i3++) {
                    int i4 = m29854a.f56657d[i3];
                    if (i4 != 0 && i4 != 1) {
                    }
                }
                return !z;
            }
            z = true;
            return !z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5321b.class.equals(obj.getClass())) {
                return false;
            }
            C5321b c5321b = (C5321b) obj;
            return s91.m28112a(this.f51849a, c5321b.f51849a) && s91.m28112a(this.f51850b, c5321b.f51850b) && this.f51851c == c5321b.f51851c && this.f51852d == c5321b.f51852d && this.f51853e == c5321b.f51853e && this.f51854f == c5321b.f51854f && s91.m28112a(this.f51855g, c5321b.f51855g);
        }

        /* renamed from: f */
        public final boolean m26061f(int i2) {
            return this.f51855g.m29854a(i2).f56660g;
        }

        public final int hashCode() {
            Object obj = this.f51849a;
            int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f51850b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f51851c) * 31;
            long j2 = this.f51852d;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f51853e;
            return this.f51855g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f51854f ? 1 : 0)) * 31);
        }

        /* renamed from: a */
        public final C5321b m26051a(@Nullable Object obj, @Nullable Object obj2, int i2, long j2, long j3, C6054y3 c6054y3, boolean z) {
            this.f51849a = obj;
            this.f51850b = obj2;
            this.f51851c = i2;
            this.f51852d = j2;
            this.f51853e = j3;
            this.f51855g = c6054y3;
            this.f51854f = z;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[LOOP:0: B:2:0x0008->B:14:0x0033, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EDGE_INSN: B:15:0x0036->B:16:0x0036 BREAK  A[LOOP:0: B:2:0x0008->B:14:0x0033], SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m26053b(long r12) {
            /*
                r11 = this;
                com.yandex.mobile.ads.impl.y3 r0 = r11.f51855g
                long r1 = r11.f51852d
                int r3 = r0.f56648b
                r4 = 1
                int r3 = r3 - r4
            L8:
                r5 = 0
                if (r3 < 0) goto L36
                r6 = -9223372036854775808
                int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                if (r8 != 0) goto L12
                goto L30
            L12:
                com.yandex.mobile.ads.impl.y3$a r8 = r0.m29854a(r3)
                long r8 = r8.f56654a
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 != 0) goto L2a
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 == 0) goto L2e
                int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r6 >= 0) goto L30
                goto L2e
            L2a:
                int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r6 >= 0) goto L30
            L2e:
                r6 = 1
                goto L31
            L30:
                r6 = 0
            L31:
                if (r6 == 0) goto L36
                int r3 = r3 + (-1)
                goto L8
            L36:
                r12 = -1
                if (r3 < 0) goto L57
                com.yandex.mobile.ads.impl.y3$a r13 = r0.m29854a(r3)
                int r0 = r13.f56655b
                if (r0 != r12) goto L42
                goto L54
            L42:
                r0 = 0
            L43:
                int r1 = r13.f56655b
                if (r0 >= r1) goto L53
                int[] r1 = r13.f56657d
                r1 = r1[r0]
                if (r1 == 0) goto L54
                if (r1 != r4) goto L50
                goto L54
            L50:
                int r0 = r0 + 1
                goto L43
            L53:
                r4 = 0
            L54:
                if (r4 == 0) goto L57
                goto L58
            L57:
                r3 = -1
            L58:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k61.C5321b.m26053b(long):int");
        }

        /* renamed from: c */
        public final int m26057c(int i2, int i3) {
            return this.f51855g.m29854a(i2).m29857a(i3);
        }

        /* renamed from: c */
        public final long m26058c(int i2) {
            return this.f51855g.m29854a(i2).f56659f;
        }

        /* renamed from: a */
        public final int m26047a() {
            return this.f51855g.f56648b;
        }

        /* renamed from: b */
        public final int m26052b(int i2, int i3) {
            C6054y3.a m29854a = this.f51855g.m29854a(i2);
            if (m29854a.f56655b != -1) {
                return m29854a.f56657d[i3];
            }
            return 0;
        }

        /* renamed from: a */
        public final int m26049a(long j2) {
            C6054y3 c6054y3 = this.f51855g;
            long j3 = this.f51852d;
            Objects.requireNonNull(c6054y3);
            if (j2 == Long.MIN_VALUE) {
                return -1;
            }
            if (j3 != -9223372036854775807L && j2 >= j3) {
                return -1;
            }
            int i2 = c6054y3.f56651e;
            while (i2 < c6054y3.f56648b) {
                if (c6054y3.m29854a(i2).f56654a == Long.MIN_VALUE || c6054y3.m29854a(i2).f56654a > j2) {
                    C6054y3.a m29854a = c6054y3.m29854a(i2);
                    if (m29854a.f56655b == -1 || m29854a.m29857a(-1) < m29854a.f56655b) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 < c6054y3.f56648b) {
                return i2;
            }
            return -1;
        }

        /* renamed from: b */
        public final long m26054b() {
            return this.f51855g.f56649c;
        }

        /* renamed from: a */
        public final int m26048a(int i2) {
            return this.f51855g.m29854a(i2).f56655b;
        }

        /* renamed from: a */
        public final long m26050a(int i2, int i3) {
            C6054y3.a m29854a = this.f51855g.m29854a(i2);
            if (m29854a.f56655b != -1) {
                return m29854a.f56658e[i3];
            }
            return -9223372036854775807L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5321b m26044a(Bundle bundle) {
            C6054y3 c6054y3;
            int i2 = bundle.getInt(Integer.toString(0, 36), 0);
            long j2 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j3 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            if (bundle2 != null) {
                c6054y3 = C6054y3.f56646i.fromBundle(bundle2);
            } else {
                c6054y3 = C6054y3.f56644g;
            }
            C6054y3 c6054y32 = c6054y3;
            C5321b c5321b = new C5321b();
            c5321b.m26051a(null, null, i2, j2, j3, c6054y32, z);
            return c5321b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k61$c */
    public static final class C5322c extends k61 {

        /* renamed from: b */
        private final AbstractC4698p<C5323d> f51856b;

        /* renamed from: c */
        private final AbstractC4698p<C5321b> f51857c;

        /* renamed from: d */
        private final int[] f51858d;

        /* renamed from: e */
        private final int[] f51859e;

        public C5322c(AbstractC4698p<C5323d> abstractC4698p, AbstractC4698p<C5321b> abstractC4698p2, int[] iArr) {
            C5220ia.m25473a(abstractC4698p.size() == iArr.length);
            this.f51856b = abstractC4698p;
            this.f51857c = abstractC4698p2;
            this.f51858d = iArr;
            this.f51859e = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f51859e[iArr[i2]] = i2;
            }
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final C5323d mo23974a(int i2, C5323d c5323d, long j2) {
            C5323d c5323d2 = this.f51856b.get(i2);
            c5323d.m26064a(c5323d2.f51864a, c5323d2.f51866c, c5323d2.f51867d, c5323d2.f51868e, c5323d2.f51869f, c5323d2.f51870g, c5323d2.f51871h, c5323d2.f51872i, c5323d2.f51874k, c5323d2.f51876m, c5323d2.f51877n, c5323d2.f51878o, c5323d2.f51879p, c5323d2.f51880q);
            c5323d.f51875l = c5323d2.f51875l;
            return c5323d;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: b */
        public final int mo25935b() {
            return this.f51856b.size();
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: b */
        public final int mo23977b(int i2, int i3, boolean z) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != mo23971a(z)) {
                return z ? this.f51858d[this.f51859e[i2] - 1] : i2 - 1;
            }
            if (i3 == 2) {
                return mo23979b(z);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23969a(int i2, int i3, boolean z) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != mo23979b(z)) {
                return z ? this.f51858d[this.f51859e[i2] + 1] : i2 + 1;
            }
            if (i3 == 2) {
                return mo23971a(z);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: b */
        public final int mo23979b(boolean z) {
            if (m26043c()) {
                return -1;
            }
            if (z) {
                return this.f51858d[this.f51856b.size() - 1];
            }
            return this.f51856b.size() - 1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23971a(boolean z) {
            if (m26043c()) {
                return -1;
            }
            if (z) {
                return this.f51858d[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo25934a() {
            return this.f51857c.size();
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final C5321b mo23972a(int i2, C5321b c5321b, boolean z) {
            C5321b c5321b2 = this.f51857c.get(i2);
            c5321b.m26051a(c5321b2.f51849a, c5321b2.f51850b, c5321b2.f51851c, c5321b2.f51852d, c5321b2.f51853e, c5321b2.f51855g, c5321b2.f51854f);
            return c5321b;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23970a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final Object mo23975a(int i2) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        jp1 jp1Var = jp1.f51693d;
    }

    /* renamed from: a */
    public abstract int mo25934a();

    /* renamed from: a */
    public int mo23969a(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == mo23979b(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo23979b(z) ? mo23971a(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public abstract int mo23970a(Object obj);

    /* renamed from: a */
    public abstract C5321b mo23972a(int i2, C5321b c5321b, boolean z);

    /* renamed from: a */
    public abstract C5323d mo23974a(int i2, C5323d c5323d, long j2);

    /* renamed from: a */
    public abstract Object mo23975a(int i2);

    /* renamed from: b */
    public abstract int mo25935b();

    /* renamed from: b */
    public int mo23977b(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == mo23971a(z)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo23971a(z) ? mo23979b(z) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final boolean m26043c() {
        return mo25935b() == 0;
    }

    public final boolean equals(@Nullable Object obj) {
        int mo23979b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k61)) {
            return false;
        }
        k61 k61Var = (k61) obj;
        if (k61Var.mo25935b() != mo25935b() || k61Var.mo25934a() != mo25934a()) {
            return false;
        }
        C5323d c5323d = new C5323d();
        C5321b c5321b = new C5321b();
        C5323d c5323d2 = new C5323d();
        C5321b c5321b2 = new C5321b();
        for (int i2 = 0; i2 < mo25935b(); i2++) {
            if (!mo23974a(i2, c5323d, 0L).equals(k61Var.mo23974a(i2, c5323d2, 0L))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < mo25934a(); i3++) {
            if (!mo23972a(i3, c5321b, true).equals(k61Var.mo23972a(i3, c5321b2, true))) {
                return false;
            }
        }
        int mo23971a = mo23971a(true);
        if (mo23971a != k61Var.mo23971a(true) || (mo23979b = mo23979b(true)) != k61Var.mo23979b(true)) {
            return false;
        }
        while (mo23971a != mo23979b) {
            int mo23969a = mo23969a(mo23971a, 0, true);
            if (mo23969a != k61Var.mo23969a(mo23971a, 0, true)) {
                return false;
            }
            mo23971a = mo23969a;
        }
        return true;
    }

    public final int hashCode() {
        C5323d c5323d = new C5323d();
        C5321b c5321b = new C5321b();
        int mo25935b = mo25935b() + 217;
        for (int i2 = 0; i2 < mo25935b(); i2++) {
            mo25935b = (mo25935b * 31) + mo23974a(i2, c5323d, 0L).hashCode();
        }
        int mo25934a = mo25934a() + (mo25935b * 31);
        for (int i3 = 0; i3 < mo25934a(); i3++) {
            mo25934a = (mo25934a * 31) + mo23972a(i3, c5321b, true).hashCode();
        }
        int mo23971a = mo23971a(true);
        while (mo23971a != -1) {
            mo25934a = (mo25934a * 31) + mo23971a;
            mo23971a = mo23969a(mo23971a, 0, true);
        }
        return mo25934a;
    }

    /* renamed from: a */
    public int mo23971a(boolean z) {
        return m26043c() ? -1 : 0;
    }

    /* renamed from: b */
    public int mo23979b(boolean z) {
        if (m26043c()) {
            return -1;
        }
        return mo25935b() - 1;
    }

    /* renamed from: a */
    public final Pair<Object, Long> m26041a(C5323d c5323d, C5321b c5321b, int i2, long j2) {
        Pair<Object, Long> m26042a = m26042a(c5323d, c5321b, i2, j2, 0L);
        Objects.requireNonNull(m26042a);
        return m26042a;
    }

    @Nullable
    /* renamed from: a */
    public final Pair<Object, Long> m26042a(C5323d c5323d, C5321b c5321b, int i2, long j2, long j3) {
        C5220ia.m25471a(i2, mo25935b());
        mo23974a(i2, c5323d, j3);
        if (j2 == -9223372036854775807L) {
            j2 = c5323d.f51876m;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = c5323d.f51878o;
        mo23972a(i3, c5321b, false);
        while (i3 < c5323d.f51879p && c5321b.f51853e != j2) {
            int i4 = i3 + 1;
            if (mo23972a(i4, c5321b, false).f51853e > j2) {
                break;
            }
            i3 = i4;
        }
        mo23972a(i3, c5321b, true);
        long j4 = j2 - c5321b.f51853e;
        long j5 = c5321b.f51852d;
        if (j5 != -9223372036854775807L) {
            j4 = Math.min(j4, j5 - 1);
        }
        long max = Math.max(0L, j4);
        Object obj = c5321b.f51850b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: com.yandex.mobile.ads.impl.k61$d */
    public static final class C5323d implements InterfaceC5589pf {

        /* renamed from: r */
        public static final Object f51860r = new Object();

        /* renamed from: s */
        private static final Object f51861s = new Object();

        /* renamed from: t */
        private static final pb0 f51862t = new pb0.C5575a().m27215b("com.yandex.mobile.ads.exoplayer2.Timeline").m27211a(Uri.EMPTY).m27214a();

        /* renamed from: u */
        public static final InterfaceC5589pf.a<C5323d> f51863u = jp1.f51695f;

        /* renamed from: b */
        @Nullable
        @Deprecated
        public Object f51865b;

        /* renamed from: d */
        @Nullable
        public Object f51867d;

        /* renamed from: e */
        public long f51868e;

        /* renamed from: f */
        public long f51869f;

        /* renamed from: g */
        public long f51870g;

        /* renamed from: h */
        public boolean f51871h;

        /* renamed from: i */
        public boolean f51872i;

        /* renamed from: j */
        @Deprecated
        public boolean f51873j;

        /* renamed from: k */
        @Nullable
        public pb0.C5579e f51874k;

        /* renamed from: l */
        public boolean f51875l;

        /* renamed from: m */
        public long f51876m;

        /* renamed from: n */
        public long f51877n;

        /* renamed from: o */
        public int f51878o;

        /* renamed from: p */
        public int f51879p;

        /* renamed from: q */
        public long f51880q;

        /* renamed from: a */
        public Object f51864a = f51860r;

        /* renamed from: c */
        public pb0 f51866c = f51862t;

        /* renamed from: a */
        public final C5323d m26064a(Object obj, @Nullable pb0 pb0Var, @Nullable Object obj2, long j2, long j3, long j4, boolean z, boolean z2, @Nullable pb0.C5579e c5579e, long j5, long j6, int i2, int i3, long j7) {
            pb0.C5581g c5581g;
            this.f51864a = obj;
            this.f51866c = pb0Var != null ? pb0Var : f51862t;
            this.f51865b = (pb0Var == null || (c5581g = pb0Var.f53429b) == null) ? null : c5581g.f53483g;
            this.f51867d = obj2;
            this.f51868e = j2;
            this.f51869f = j3;
            this.f51870g = j4;
            this.f51871h = z;
            this.f51872i = z2;
            this.f51873j = c5579e != null;
            this.f51874k = c5579e;
            this.f51876m = j5;
            this.f51877n = j6;
            this.f51878o = i2;
            this.f51879p = i3;
            this.f51880q = j7;
            this.f51875l = false;
            return this;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5323d.class.equals(obj.getClass())) {
                return false;
            }
            C5323d c5323d = (C5323d) obj;
            return s91.m28112a(this.f51864a, c5323d.f51864a) && s91.m28112a(this.f51866c, c5323d.f51866c) && s91.m28112a(this.f51867d, c5323d.f51867d) && s91.m28112a(this.f51874k, c5323d.f51874k) && this.f51868e == c5323d.f51868e && this.f51869f == c5323d.f51869f && this.f51870g == c5323d.f51870g && this.f51871h == c5323d.f51871h && this.f51872i == c5323d.f51872i && this.f51875l == c5323d.f51875l && this.f51876m == c5323d.f51876m && this.f51877n == c5323d.f51877n && this.f51878o == c5323d.f51878o && this.f51879p == c5323d.f51879p && this.f51880q == c5323d.f51880q;
        }

        public final int hashCode() {
            int hashCode = (this.f51866c.hashCode() + ((this.f51864a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f51867d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            pb0.C5579e c5579e = this.f51874k;
            int hashCode3 = (hashCode2 + (c5579e != null ? c5579e.hashCode() : 0)) * 31;
            long j2 = this.f51868e;
            int i2 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f51869f;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f51870g;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f51871h ? 1 : 0)) * 31) + (this.f51872i ? 1 : 0)) * 31) + (this.f51875l ? 1 : 0)) * 31;
            long j5 = this.f51876m;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f51877n;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f51878o) * 31) + this.f51879p) * 31;
            long j7 = this.f51880q;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }

        /* renamed from: a */
        public final boolean m26065a() {
            C5220ia.m25476b(this.f51873j == (this.f51874k != null));
            return this.f51874k != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5323d m26062a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            pb0 fromBundle = bundle2 != null ? pb0.f53427g.fromBundle(bundle2) : null;
            long j2 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j3 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j4 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z2 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            pb0.C5579e fromBundle2 = bundle3 != null ? pb0.C5579e.f53466g.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j5 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j6 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i2 = bundle.getInt(Integer.toString(11, 36), 0);
            int i3 = bundle.getInt(Integer.toString(12, 36), 0);
            long j7 = bundle.getLong(Integer.toString(13, 36), 0L);
            C5323d c5323d = new C5323d();
            c5323d.m26064a(f51861s, fromBundle, null, j2, j3, j4, z, z2, fromBundle2, j5, j6, i2, i3, j7);
            c5323d.f51875l = z3;
            return c5323d;
        }
    }

    /* renamed from: a */
    public C5321b mo23973a(Object obj, C5321b c5321b) {
        return mo23972a(mo23970a(obj), c5321b, true);
    }

    /* renamed from: a */
    public final int m26040a(int i2, C5321b c5321b, C5323d c5323d, int i3, boolean z) {
        int i4 = mo23972a(i2, c5321b, false).f51851c;
        if (mo23974a(i4, c5323d, 0L).f51879p != i2) {
            return i2 + 1;
        }
        int mo23969a = mo23969a(i4, i3, z);
        if (mo23969a == -1) {
            return -1;
        }
        return mo23974a(mo23969a, c5323d, 0L).f51878o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static k61 m26038a(Bundle bundle) {
        AbstractC4698p m26037a = m26037a(C5323d.f51863u, C5536of.m27083a(bundle, Integer.toString(0, 36)));
        AbstractC4698p m26037a2 = m26037a(C5321b.f51848h, C5536of.m27083a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = m26037a.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = i2;
            }
            intArray = iArr;
        }
        return new C5322c(m26037a, m26037a2, intArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T extends InterfaceC5589pf> AbstractC4698p<T> m26037a(InterfaceC5589pf.a<T> aVar, @Nullable IBinder iBinder) {
        int readInt;
        if (iBinder == null) {
            return AbstractC4698p.m22055i();
        }
        AbstractC4698p.a aVar2 = new AbstractC4698p.a();
        int i2 = BinderC5492nf.f52961a;
        int i3 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar3 = new AbstractC4698p.a();
        int i4 = 1;
        int i5 = 0;
        while (i4 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i5);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            Objects.requireNonNull(readBundle);
                            aVar3.m22060b(readBundle);
                            i5++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i4 = readInt;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        AbstractC4698p m22058a = aVar3.m22058a();
        for (int i6 = 0; i6 < m22058a.size(); i6++) {
            aVar2.m22060b(aVar.fromBundle((Bundle) m22058a.get(i6)));
        }
        return aVar2.m22058a();
    }
}
