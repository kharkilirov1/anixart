package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.mg */
/* loaded from: classes3.dex */
final class C5442mg {

    /* renamed from: a */
    public final int f52678a;

    /* renamed from: b */
    public final String f52679b;

    /* renamed from: c */
    private final TreeSet<c11> f52680c = new TreeSet<>();

    /* renamed from: d */
    private final ArrayList<a> f52681d = new ArrayList<>();

    /* renamed from: e */
    private C5349kn f52682e;

    /* renamed from: com.yandex.mobile.ads.impl.mg$a */
    public static final class a {

        /* renamed from: a */
        public final long f52683a;

        /* renamed from: b */
        public final long f52684b;

        public a(long j2, long j3) {
            this.f52683a = j2;
            this.f52684b = j3;
        }
    }

    public C5442mg(int i2, String str, C5349kn c5349kn) {
        this.f52678a = i2;
        this.f52679b = str;
        this.f52682e = c5349kn;
    }

    /* renamed from: a */
    public final C5349kn m26660a() {
        return this.f52682e;
    }

    /* renamed from: b */
    public final TreeSet<c11> m26666b() {
        return this.f52680c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r11 + r13) <= (r5 + r3)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r11 >= r2.f52683a) goto L17;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m26668c(long r11, long r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.ArrayList<com.yandex.mobile.ads.impl.mg$a> r2 = r10.f52681d
            int r2 = r2.size()
            if (r1 >= r2) goto L3d
            java.util.ArrayList<com.yandex.mobile.ads.impl.mg$a> r2 = r10.f52681d
            java.lang.Object r2 = r2.get(r1)
            com.yandex.mobile.ads.impl.mg$a r2 = (com.yandex.mobile.ads.impl.C5442mg.a) r2
            long r3 = r2.f52684b
            r5 = -1
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L22
            long r2 = r2.f52683a
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 < 0) goto L36
            goto L34
        L22:
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L36
        L27:
            long r5 = r2.f52683a
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 > 0) goto L36
            long r8 = r11 + r13
            long r5 = r5 + r3
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L36
        L34:
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            if (r2 == 0) goto L3a
            return r7
        L3a:
            int r1 = r1 + 1
            goto L2
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5442mg.m26668c(long, long):boolean");
    }

    /* renamed from: d */
    public final boolean m26669d() {
        return this.f52681d.isEmpty();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5442mg.class != obj.getClass()) {
            return false;
        }
        C5442mg c5442mg = (C5442mg) obj;
        return this.f52678a == c5442mg.f52678a && this.f52679b.equals(c5442mg.f52679b) && this.f52680c.equals(c5442mg.f52680c) && this.f52682e.equals(c5442mg.f52682e);
    }

    public final int hashCode() {
        return this.f52682e.hashCode() + o11.m26984a(this.f52679b, this.f52678a * 31, 31);
    }

    /* renamed from: a */
    public final boolean m26664a(C5643qk c5643qk) {
        this.f52682e = this.f52682e.m26169a(c5643qk);
        return !r2.equals(r0);
    }

    /* renamed from: b */
    public final c11 m26665b(long j2, long j3) {
        c11 m23003a = c11.m23003a(this.f52679b, j2);
        c11 floor = this.f52680c.floor(m23003a);
        if (floor != null && floor.f51598b + floor.f51599c > j2) {
            return floor;
        }
        c11 ceiling = this.f52680c.ceiling(m23003a);
        if (ceiling != null) {
            long j4 = ceiling.f51598b - j2;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return c11.m23004a(this.f52679b, j2, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if ((r11 + r13) <= r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if ((r4 + r8) <= r11) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[LOOP:0: B:2:0x0002->B:12:0x0036, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m26670d(long r11, long r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.ArrayList<com.yandex.mobile.ads.impl.mg$a> r2 = r10.f52681d
            int r2 = r2.size()
            r3 = 1
            if (r1 >= r2) goto L39
            java.util.ArrayList<com.yandex.mobile.ads.impl.mg$a> r2 = r10.f52681d
            java.lang.Object r2 = r2.get(r1)
            com.yandex.mobile.ads.impl.mg$a r2 = (com.yandex.mobile.ads.impl.C5442mg.a) r2
            long r4 = r2.f52683a
            r6 = -1
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 > 0) goto L27
            long r8 = r2.f52684b
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L33
            long r4 = r4 + r8
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 <= 0) goto L32
            goto L33
        L27:
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 == 0) goto L33
            long r6 = r11 + r13
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L32
            goto L33
        L32:
            r3 = 0
        L33:
            if (r3 == 0) goto L36
            return r0
        L36:
            int r1 = r1 + 1
            goto L2
        L39:
            java.util.ArrayList<com.yandex.mobile.ads.impl.mg$a> r0 = r10.f52681d
            com.yandex.mobile.ads.impl.mg$a r1 = new com.yandex.mobile.ads.impl.mg$a
            r1.<init>(r11, r13)
            r0.add(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5442mg.m26670d(long, long):boolean");
    }

    /* renamed from: a */
    public final void m26661a(long j2) {
        for (int i2 = 0; i2 < this.f52681d.size(); i2++) {
            if (this.f52681d.get(i2).f52683a == j2) {
                this.f52681d.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final boolean m26667c() {
        return this.f52680c.isEmpty();
    }

    /* renamed from: a */
    public final void m26662a(c11 c11Var) {
        this.f52680c.add(c11Var);
    }

    /* renamed from: a */
    public final long m26658a(long j2, long j3) {
        C5220ia.m25473a(j2 >= 0);
        C5220ia.m25473a(j3 >= 0);
        c11 m26665b = m26665b(j2, j3);
        if (!m26665b.f51600d) {
            long j4 = m26665b.f51599c;
            return -Math.min(j4 == -1 ? Long.MAX_VALUE : j4, j3);
        }
        long j5 = j2 + j3;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        long j7 = m26665b.f51598b + m26665b.f51599c;
        if (j7 < j6) {
            for (c11 c11Var : this.f52680c.tailSet(m26665b, false)) {
                long j8 = c11Var.f51598b;
                if (j8 > j7) {
                    break;
                }
                j7 = Math.max(j7, j8 + c11Var.f51599c);
                if (j7 >= j6) {
                    break;
                }
            }
        }
        return Math.min(j7 - j2, j3);
    }

    /* renamed from: a */
    public final c11 m26659a(c11 c11Var, long j2, boolean z) {
        C5220ia.m25476b(this.f52680c.remove(c11Var));
        File file = c11Var.f51601e;
        Objects.requireNonNull(file);
        if (z) {
            File parentFile = file.getParentFile();
            Objects.requireNonNull(parentFile);
            long j3 = c11Var.f51598b;
            int i2 = this.f52678a;
            int i3 = c11.f49068j;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(".");
            sb.append(j3);
            sb.append(".");
            File file2 = new File(parentFile, C0000a.m19p(sb, j2, ".v3.exo"));
            if (file.renameTo(file2)) {
                file = file2;
            } else {
                d90.m23842d("CachedContent", "Failed to rename " + file + " to " + file2);
            }
        }
        c11 m23005a = c11Var.m23005a(file, j2);
        this.f52680c.add(m23005a);
        return m23005a;
    }

    /* renamed from: a */
    public final boolean m26663a(C5284jg c5284jg) {
        if (!this.f52680c.remove(c5284jg)) {
            return false;
        }
        File file = c5284jg.f51601e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }
}
