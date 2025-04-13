package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry;
import com.yandex.mobile.ads.impl.AbstractC5331kb;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.lb */
/* loaded from: classes3.dex */
final class C5391lb {

    /* renamed from: a */
    private static final byte[] f52327a = s91.m28124b("OpusHead");

    /* renamed from: b */
    public static final /* synthetic */ int f52328b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.lb$a */
    public static final class a {

        /* renamed from: a */
        public final int f52329a;

        /* renamed from: b */
        public int f52330b;

        /* renamed from: c */
        public int f52331c;

        /* renamed from: d */
        public long f52332d;

        /* renamed from: e */
        private final boolean f52333e;

        /* renamed from: f */
        private final ap0 f52334f;

        /* renamed from: g */
        private final ap0 f52335g;

        /* renamed from: h */
        private int f52336h;

        /* renamed from: i */
        private int f52337i;

        public a(ap0 ap0Var, ap0 ap0Var2, boolean z) throws ep0 {
            this.f52335g = ap0Var;
            this.f52334f = ap0Var2;
            this.f52333e = z;
            ap0Var2.m22591e(12);
            this.f52329a = ap0Var2.m22611x();
            ap0Var.m22591e(12);
            this.f52337i = ap0Var.m22611x();
            C5550ot.m27108a("first_chunk must be 1", ap0Var.m22595h() == 1);
            this.f52330b = -1;
        }

        /* renamed from: a */
        public final boolean m26410a() {
            int i2 = this.f52330b + 1;
            this.f52330b = i2;
            if (i2 == this.f52329a) {
                return false;
            }
            this.f52332d = this.f52333e ? this.f52334f.m22612y() : this.f52334f.m22609v();
            if (this.f52330b == this.f52336h) {
                this.f52331c = this.f52335g.m22611x();
                this.f52335g.m22593f(4);
                int i3 = this.f52337i - 1;
                this.f52337i = i3;
                this.f52336h = i3 > 0 ? this.f52335g.m22611x() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb$b */
    public static final class b {

        /* renamed from: a */
        private final String f52338a;

        /* renamed from: b */
        private final byte[] f52339b;

        /* renamed from: c */
        private final long f52340c;

        /* renamed from: d */
        private final long f52341d;

        public b(String str, byte[] bArr, long j2, long j3) {
            this.f52338a = str;
            this.f52339b = bArr;
            this.f52340c = j2;
            this.f52341d = j3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb$c */
    public interface c {
        /* renamed from: a */
        int mo26415a();

        /* renamed from: b */
        int mo26416b();

        /* renamed from: c */
        int mo26417c();
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb$d */
    public static final class d implements c {

        /* renamed from: a */
        private final int f52342a;

        /* renamed from: b */
        private final int f52343b;

        /* renamed from: c */
        private final ap0 f52344c;

        public d(AbstractC5331kb.b bVar, C5606pv c5606pv) {
            ap0 ap0Var = bVar.f51932b;
            this.f52344c = ap0Var;
            ap0Var.m22591e(12);
            int m22611x = ap0Var.m22611x();
            if ("audio/raw".equals(c5606pv.f53820l)) {
                int m28117b = s91.m28117b(c5606pv.f53803A, c5606pv.f53833y);
                if (m22611x == 0 || m22611x % m28117b != 0) {
                    d90.m23842d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m28117b + ", stsz sample size: " + m22611x);
                    m22611x = m28117b;
                }
            }
            this.f52342a = m22611x == 0 ? -1 : m22611x;
            this.f52343b = ap0Var.m22611x();
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: a */
        public final int mo26415a() {
            return this.f52342a;
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: b */
        public final int mo26416b() {
            return this.f52343b;
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: c */
        public final int mo26417c() {
            int i2 = this.f52342a;
            return i2 == -1 ? this.f52344c.m22611x() : i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb$e */
    public static final class e implements c {

        /* renamed from: a */
        private final ap0 f52345a;

        /* renamed from: b */
        private final int f52346b;

        /* renamed from: c */
        private final int f52347c;

        /* renamed from: d */
        private int f52348d;

        /* renamed from: e */
        private int f52349e;

        public e(AbstractC5331kb.b bVar) {
            ap0 ap0Var = bVar.f51932b;
            this.f52345a = ap0Var;
            ap0Var.m22591e(12);
            this.f52347c = ap0Var.m22611x() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f52346b = ap0Var.m22611x();
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: a */
        public final int mo26415a() {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: b */
        public final int mo26416b() {
            return this.f52346b;
        }

        @Override // com.yandex.mobile.ads.impl.C5391lb.c
        /* renamed from: c */
        public final int mo26417c() {
            int i2 = this.f52347c;
            if (i2 == 8) {
                return this.f52345a.m22607t();
            }
            if (i2 == 16) {
                return this.f52345a.m22613z();
            }
            int i3 = this.f52348d;
            this.f52348d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f52349e & 15;
            }
            int m22607t = this.f52345a.m22607t();
            this.f52349e = m22607t;
            return (m22607t & 240) >> 4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb$f */
    public static final class f {

        /* renamed from: a */
        private final int f52350a;

        /* renamed from: b */
        private final long f52351b;

        /* renamed from: c */
        private final int f52352c;

        public f(int i2, int i3, long j2) {
            this.f52350a = i2;
            this.f52351b = j2;
            this.f52352c = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c52, code lost:
    
        if (r15 == null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x00ee, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0d34  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m26409a(com.yandex.mobile.ads.impl.AbstractC5331kb.a r68, com.yandex.mobile.ads.impl.C5557ox r69, long r70, @androidx.annotation.Nullable com.yandex.mobile.ads.exo.drm.DrmInitData r72, boolean r73, boolean r74, com.yandex.mobile.ads.impl.InterfaceC5416lx r75) throws com.yandex.mobile.ads.impl.ep0 {
        /*
            Method dump skipped, instructions count: 3482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5391lb.m26409a(com.yandex.mobile.ads.impl.kb$a, com.yandex.mobile.ads.impl.ox, long, com.yandex.mobile.ads.exo.drm.DrmInitData, boolean, boolean, com.yandex.mobile.ads.impl.lx):java.util.ArrayList");
    }

    @Nullable
    /* renamed from: a */
    public static Metadata m26406a(AbstractC5331kb.a aVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        AbstractC5331kb.b m26098d = aVar.m26098d(1751411826);
        AbstractC5331kb.b m26098d2 = aVar.m26098d(1801812339);
        AbstractC5331kb.b m26098d3 = aVar.m26098d(1768715124);
        if (m26098d == null || m26098d2 == null || m26098d3 == null) {
            return null;
        }
        ap0 ap0Var = m26098d.f51932b;
        ap0Var.m22591e(16);
        if (ap0Var.m22595h() != 1835299937) {
            return null;
        }
        ap0 ap0Var2 = m26098d2.f51932b;
        ap0Var2.m22591e(12);
        int m22595h = ap0Var2.m22595h();
        String[] strArr = new String[m22595h];
        for (int i2 = 0; i2 < m22595h; i2++) {
            int m22595h2 = ap0Var2.m22595h();
            ap0Var2.m22593f(4);
            strArr[i2] = ap0Var2.m22580a(m22595h2 - 8, C5285jh.f51608c);
        }
        ap0 ap0Var3 = m26098d3.f51932b;
        ap0Var3.m22591e(8);
        ArrayList arrayList = new ArrayList();
        while (ap0Var3.m22579a() > 8) {
            int m22588d = ap0Var3.m22588d();
            int m22595h3 = ap0Var3.m22595h();
            int m22595h4 = ap0Var3.m22595h() - 1;
            if (m22595h4 >= 0 && m22595h4 < m22595h) {
                String str = strArr[m22595h4];
                int i3 = m22588d + m22595h3;
                while (true) {
                    int m22588d2 = ap0Var3.m22588d();
                    if (m22588d2 >= i3) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int m22595h5 = ap0Var3.m22595h();
                    if (ap0Var3.m22595h() == 1684108385) {
                        int m22595h6 = ap0Var3.m22595h();
                        int m22595h7 = ap0Var3.m22595h();
                        int i4 = m22595h5 - 16;
                        byte[] bArr = new byte[i4];
                        ap0Var3.m22583a(bArr, 0, i4);
                        mdtaMetadataEntry = new MdtaMetadataEntry(m22595h7, m22595h6, str, bArr);
                        break;
                    }
                    ap0Var3.m22591e(m22588d2 + m22595h5);
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            } else {
                c80.m23073a("Skipped metadata with unknown key index: ", m22595h4, "AtomParsers");
            }
            ap0Var3.m22591e(m22588d + m22595h3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x030b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.z61 m26408a(com.yandex.mobile.ads.impl.t61 r36, com.yandex.mobile.ads.impl.AbstractC5331kb.a r37, com.yandex.mobile.ads.impl.C5557ox r38) throws com.yandex.mobile.ads.impl.ep0 {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5391lb.m26408a(com.yandex.mobile.ads.impl.t61, com.yandex.mobile.ads.impl.kb$a, com.yandex.mobile.ads.impl.ox):com.yandex.mobile.ads.impl.z61");
    }

    /* renamed from: a */
    private static b m26407a(int i2, ap0 ap0Var) {
        ap0Var.m22591e(i2 + 8 + 4);
        ap0Var.m22593f(1);
        int m22607t = ap0Var.m22607t();
        while ((m22607t & 128) == 128) {
            m22607t = ap0Var.m22607t();
        }
        ap0Var.m22593f(2);
        int m22607t2 = ap0Var.m22607t();
        if ((m22607t2 & 128) != 0) {
            ap0Var.m22593f(2);
        }
        if ((m22607t2 & 64) != 0) {
            ap0Var.m22593f(ap0Var.m22607t());
        }
        if ((m22607t2 & 32) != 0) {
            ap0Var.m22593f(2);
        }
        ap0Var.m22593f(1);
        int m22607t3 = ap0Var.m22607t();
        while ((m22607t3 & 128) == 128) {
            m22607t3 = ap0Var.m22607t();
        }
        String m25139a = he0.m25139a(ap0Var.m22607t());
        if (!"audio/mpeg".equals(m25139a) && !"audio/vnd.dts".equals(m25139a) && !"audio/vnd.dts.hd".equals(m25139a)) {
            ap0Var.m22593f(4);
            long m22609v = ap0Var.m22609v();
            long m22609v2 = ap0Var.m22609v();
            ap0Var.m22593f(1);
            int m22607t4 = ap0Var.m22607t();
            int i3 = m22607t4 & 127;
            while ((m22607t4 & 128) == 128) {
                m22607t4 = ap0Var.m22607t();
                i3 = (i3 << 7) | (m22607t4 & 127);
            }
            byte[] bArr = new byte[i3];
            ap0Var.m22583a(bArr, 0, i3);
            long j2 = m22609v2 > 0 ? m22609v2 : -1L;
            if (m22609v <= 0) {
                m22609v = -1;
            }
            return new b(m25139a, bArr, j2, m22609v);
        }
        return new b(m25139a, null, -1L, -1L);
    }

    @Nullable
    /* renamed from: a */
    private static Pair m26405a(int i2, int i3, ap0 ap0Var) throws ep0 {
        Integer num;
        u61 u61Var;
        Pair create;
        int i4;
        int i5;
        byte[] bArr;
        int m22588d = ap0Var.m22588d();
        while (m22588d - i2 < i3) {
            ap0Var.m22591e(m22588d);
            int m22595h = ap0Var.m22595h();
            C5550ot.m27108a("childAtomSize must be positive", m22595h > 0);
            if (ap0Var.m22595h() == 1936289382) {
                int i6 = m22588d + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - m22588d < m22595h) {
                    ap0Var.m22591e(i6);
                    int m22595h2 = ap0Var.m22595h();
                    int m22595h3 = ap0Var.m22595h();
                    if (m22595h3 == 1718775137) {
                        num2 = Integer.valueOf(ap0Var.m22595h());
                    } else if (m22595h3 == 1935894637) {
                        ap0Var.m22593f(4);
                        str = ap0Var.m22580a(4, C5285jh.f51608c);
                    } else if (m22595h3 == 1935894633) {
                        i7 = i6;
                        i8 = m22595h2;
                    }
                    i6 += m22595h2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C5550ot.m27108a("frma atom is mandatory", num2 != null);
                    C5550ot.m27108a("schi atom is mandatory", i7 != -1);
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            u61Var = null;
                            break;
                        }
                        ap0Var.m22591e(i9);
                        int m22595h4 = ap0Var.m22595h();
                        if (ap0Var.m22595h() == 1952804451) {
                            int m26096b = AbstractC5331kb.m26096b(ap0Var.m22595h());
                            ap0Var.m22593f(1);
                            if (m26096b == 0) {
                                ap0Var.m22593f(1);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int m22607t = ap0Var.m22607t();
                                int i10 = (m22607t & 240) >> 4;
                                i4 = m22607t & 15;
                                i5 = i10;
                            }
                            boolean z = ap0Var.m22607t() == 1;
                            int m22607t2 = ap0Var.m22607t();
                            byte[] bArr2 = new byte[16];
                            ap0Var.m22583a(bArr2, 0, 16);
                            if (z && m22607t2 == 0) {
                                int m22607t3 = ap0Var.m22607t();
                                byte[] bArr3 = new byte[m22607t3];
                                ap0Var.m22583a(bArr3, 0, m22607t3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            u61Var = new u61(z, str, m22607t2, bArr2, i5, i4, bArr);
                        } else {
                            i9 += m22595h4;
                        }
                    }
                    C5550ot.m27108a("tenc atom is mandatory", u61Var != null);
                    int i11 = s91.f54530a;
                    create = Pair.create(num, u61Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            m22588d += m22595h;
        }
        return null;
    }
}
