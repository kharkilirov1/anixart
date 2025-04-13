package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry;
import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;
import com.yandex.mobile.ads.exo.metadata.mp4.SmtaMetadataEntry;
import com.yandex.mobile.ads.impl.AbstractC5331kb;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class bf0 implements InterfaceC5412lt, e01 {

    /* renamed from: a */
    private final int f48836a;

    /* renamed from: b */
    private final ap0 f48837b;

    /* renamed from: c */
    private final ap0 f48838c;

    /* renamed from: d */
    private final ap0 f48839d;

    /* renamed from: e */
    private final ap0 f48840e;

    /* renamed from: f */
    private final ArrayDeque<AbstractC5331kb.a> f48841f;

    /* renamed from: g */
    private final i01 f48842g;

    /* renamed from: h */
    private final ArrayList f48843h;

    /* renamed from: i */
    private int f48844i;

    /* renamed from: j */
    private int f48845j;

    /* renamed from: k */
    private long f48846k;

    /* renamed from: l */
    private int f48847l;

    /* renamed from: m */
    @Nullable
    private ap0 f48848m;

    /* renamed from: n */
    private int f48849n;

    /* renamed from: o */
    private int f48850o;

    /* renamed from: p */
    private int f48851p;

    /* renamed from: q */
    private int f48852q;

    /* renamed from: r */
    private InterfaceC5509nt f48853r;

    /* renamed from: s */
    private C4863a[] f48854s;

    /* renamed from: t */
    private long[][] f48855t;

    /* renamed from: u */
    private int f48856u;

    /* renamed from: v */
    private long f48857v;

    /* renamed from: w */
    private int f48858w;

    /* renamed from: x */
    @Nullable
    private MotionPhotoMetadata f48859x;

    /* renamed from: com.yandex.mobile.ads.impl.bf0$a */
    public static final class C4863a {

        /* renamed from: a */
        public final t61 f48860a;

        /* renamed from: b */
        public final z61 f48861b;

        /* renamed from: c */
        public final y61 f48862c;

        /* renamed from: d */
        @Nullable
        public final z71 f48863d;

        /* renamed from: e */
        public int f48864e;

        public C4863a(t61 t61Var, z61 z61Var, y61 y61Var) {
            this.f48860a = t61Var;
            this.f48861b = z61Var;
            this.f48862c = y61Var;
            this.f48863d = "audio/true-hd".equals(t61Var.f54962f.f53820l) ? new z71() : null;
        }
    }

    static {
        dn1 dn1Var = dn1.f49702m;
    }

    public bf0() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ t61 m22807a(t61 t61Var) {
        return t61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC5412lt[] m22810d() {
        return new InterfaceC5412lt[]{new bf0()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        return p21.m27153a(interfaceC5458mt, (this.f48836a & 2) != 0);
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int m30066a;
        long j9 = j2;
        C4863a[] c4863aArr = this.f48854s;
        if (c4863aArr.length == 0) {
            g01 g01Var = g01.f50467c;
            return new e01.C4997a(g01Var, g01Var);
        }
        int i2 = this.f48856u;
        boolean z = false;
        int i3 = -1;
        if (i2 != -1) {
            z61 z61Var = c4863aArr[i2].f48861b;
            int m28118b = s91.m28118b(z61Var.f57061f, j9, false);
            while (true) {
                if (m28118b < 0) {
                    m28118b = -1;
                    break;
                }
                if ((z61Var.f57062g[m28118b] & 1) != 0) {
                    break;
                }
                m28118b--;
            }
            if (m28118b == -1) {
                m28118b = z61Var.m30066a(j9);
            }
            if (m28118b == -1) {
                g01 g01Var2 = g01.f50467c;
                return new e01.C4997a(g01Var2, g01Var2);
            }
            long j10 = z61Var.f57061f[m28118b];
            j3 = z61Var.f57058c[m28118b];
            if (j10 >= j9 || m28118b >= z61Var.f57057b - 1 || (m30066a = z61Var.m30066a(j9)) == -1 || m30066a == m28118b) {
                j8 = -1;
                j5 = -9223372036854775807L;
            } else {
                j5 = z61Var.f57061f[m30066a];
                j8 = z61Var.f57058c[m30066a];
            }
            long j11 = j8;
            j9 = j10;
            j4 = j11;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i4 = 0;
        while (true) {
            C4863a[] c4863aArr2 = this.f48854s;
            if (i4 >= c4863aArr2.length) {
                break;
            }
            if (i4 != this.f48856u) {
                z61 z61Var2 = c4863aArr2[i4].f48861b;
                int m28118b2 = s91.m28118b(z61Var2.f57061f, j9, z);
                while (true) {
                    if (m28118b2 < 0) {
                        m28118b2 = -1;
                        break;
                    }
                    if ((z61Var2.f57062g[m28118b2] & 1) != 0) {
                        break;
                    }
                    m28118b2--;
                }
                if (m28118b2 == i3) {
                    m28118b2 = z61Var2.m30066a(j9);
                }
                if (m28118b2 == i3) {
                    j7 = j4;
                } else {
                    j7 = j4;
                    j3 = Math.min(z61Var2.f57058c[m28118b2], j3);
                }
                if (j5 != -9223372036854775807L) {
                    int m28118b3 = s91.m28118b(z61Var2.f57061f, j5, false);
                    while (true) {
                        if (m28118b3 < 0) {
                            m28118b3 = -1;
                            break;
                        }
                        if ((z61Var2.f57062g[m28118b3] & 1) != 0) {
                            break;
                        }
                        m28118b3--;
                    }
                    if (m28118b3 == -1) {
                        m28118b3 = z61Var2.m30066a(j5);
                    }
                    if (m28118b3 != -1) {
                        j4 = Math.min(z61Var2.f57058c[m28118b3], j7);
                        i4++;
                        z = false;
                        i3 = -1;
                    }
                }
                j6 = j7;
            } else {
                j6 = j4;
            }
            j4 = j6;
            i4++;
            z = false;
            i3 = -1;
        }
        long j12 = j4;
        g01 g01Var3 = new g01(j9, j3);
        return j5 == -9223372036854775807L ? new e01.C4997a(g01Var3, g01Var3) : new e01.C4997a(g01Var3, new g01(j5, j12));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f48857v;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    public bf0(int i2) {
        this.f48836a = 0;
        this.f48844i = 0;
        this.f48842g = new i01();
        this.f48843h = new ArrayList();
        this.f48840e = new ap0(16);
        this.f48841f = new ArrayDeque<>();
        this.f48837b = new ap0(ch0.f49243a);
        this.f48838c = new ap0(4);
        this.f48839d = new ap0();
        this.f48849n = -1;
        this.f48853r = InterfaceC5509nt.f53089a;
        this.f48854s = new C4863a[0];
    }

    /* renamed from: c */
    private void m22809c(long j2) throws ep0 {
        while (!this.f48841f.isEmpty() && this.f48841f.peek().f51929b == j2) {
            AbstractC5331kb.a pop = this.f48841f.pop();
            if (pop.f51928a == 1836019574) {
                m22808a(pop);
                this.f48841f.clear();
                this.f48844i = 2;
            } else if (!this.f48841f.isEmpty()) {
                this.f48841f.peek().f51931d.add(pop);
            }
        }
        if (this.f48844i != 2) {
            this.f48844i = 0;
            this.f48847l = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f48853r = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f48841f.clear();
        this.f48847l = 0;
        this.f48849n = -1;
        this.f48850o = 0;
        this.f48851p = 0;
        this.f48852q = 0;
        if (j2 == 0) {
            if (this.f48844i != 3) {
                this.f48844i = 0;
                this.f48847l = 0;
                return;
            } else {
                this.f48842g.m25422a();
                this.f48843h.clear();
                return;
            }
        }
        for (C4863a c4863a : this.f48854s) {
            z61 z61Var = c4863a.f48861b;
            int m28118b = s91.m28118b(z61Var.f57061f, j3, false);
            while (true) {
                if (m28118b < 0) {
                    m28118b = -1;
                    break;
                } else if ((z61Var.f57062g[m28118b] & 1) != 0) {
                    break;
                } else {
                    m28118b--;
                }
            }
            if (m28118b == -1) {
                m28118b = z61Var.m30066a(j3);
            }
            c4863a.f48864e = m28118b;
            z71 z71Var = c4863a.f48863d;
            if (z71Var != null) {
                z71Var.m30068a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r32, com.yandex.mobile.ads.impl.qr0 r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bf0.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }

    /* renamed from: a */
    private void m22808a(AbstractC5331kb.a aVar) throws ep0 {
        int i2;
        Metadata metadata;
        Metadata metadata2;
        long j2;
        ArrayList arrayList;
        int i3;
        int i4;
        Metadata metadata3;
        int i5;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f48858w == 1;
        C5557ox c5557ox = new C5557ox();
        AbstractC5331kb.b m26098d = aVar.m26098d(1969517665);
        int i6 = 1835365473;
        if (m26098d != null) {
            int i7 = C5391lb.f52328b;
            ap0 ap0Var = m26098d.f51932b;
            ap0Var.m22591e(8);
            Metadata metadata4 = null;
            Metadata metadata5 = null;
            for (int i8 = 8; ap0Var.m22579a() >= i8; i8 = 8) {
                int m22588d = ap0Var.m22588d();
                int m22595h = ap0Var.m22595h();
                int m22595h2 = ap0Var.m22595h();
                if (m22595h2 == i6) {
                    ap0Var.m22591e(m22588d);
                    int i9 = m22588d + m22595h;
                    ap0Var.m22593f(i8);
                    int m22588d2 = ap0Var.m22588d();
                    ap0Var.m22593f(4);
                    if (ap0Var.m22595h() != 1751411826) {
                        m22588d2 += 4;
                    }
                    ap0Var.m22591e(m22588d2);
                    while (true) {
                        if (ap0Var.m22588d() >= i9) {
                            break;
                        }
                        int m22588d3 = ap0Var.m22588d();
                        int m22595h3 = ap0Var.m22595h();
                        if (ap0Var.m22595h() == 1768715124) {
                            ap0Var.m22591e(m22588d3);
                            int i10 = m22588d3 + m22595h3;
                            ap0Var.m22593f(i8);
                            ArrayList arrayList3 = new ArrayList();
                            while (ap0Var.m22588d() < i10) {
                                Id3Frame m22474b = ae0.m22474b(ap0Var);
                                if (m22474b != null) {
                                    arrayList3.add(m22474b);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                metadata4 = new Metadata(arrayList3);
                            }
                        } else {
                            ap0Var.m22591e(m22588d3 + m22595h3);
                        }
                    }
                    metadata4 = null;
                } else if (m22595h2 == 1936553057) {
                    ap0Var.m22591e(m22588d);
                    int i11 = m22588d + m22595h;
                    ap0Var.m22593f(12);
                    while (true) {
                        if (ap0Var.m22588d() >= i11) {
                            break;
                        }
                        int m22588d4 = ap0Var.m22588d();
                        int m22595h4 = ap0Var.m22595h();
                        if (ap0Var.m22595h() != 1935766900) {
                            ap0Var.m22591e(m22588d4 + m22595h4);
                        } else if (m22595h4 >= 14) {
                            ap0Var.m22593f(5);
                            int m22607t = ap0Var.m22607t();
                            if (m22607t == 12 || m22607t == 13) {
                                float f2 = m22607t == 12 ? 240.0f : 120.0f;
                                ap0Var.m22593f(1);
                                metadata5 = new Metadata(new SmtaMetadataEntry(ap0Var.m22607t(), f2));
                            }
                        }
                    }
                    metadata5 = null;
                }
                ap0Var.m22591e(m22588d + m22595h);
                i6 = 1835365473;
            }
            Pair create = Pair.create(metadata4, metadata5);
            Metadata metadata6 = (Metadata) create.first;
            Metadata metadata7 = (Metadata) create.second;
            if (metadata6 != null) {
                c5557ox.m27128a(metadata6);
            }
            metadata = metadata7;
            metadata2 = metadata6;
            i2 = 1835365473;
        } else {
            i2 = 1835365473;
            metadata = null;
            metadata2 = null;
        }
        AbstractC5331kb.a m26097c = aVar.m26097c(i2);
        Metadata m26406a = m26097c != null ? C5391lb.m26406a(m26097c) : null;
        long j3 = -9223372036854775807L;
        ArrayList m26409a = C5391lb.m26409a(aVar, c5557ox, -9223372036854775807L, null, (this.f48836a & 1) != 0, z, dn1.f49701l);
        int size = m26409a.size();
        long j4 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            j2 = 0;
            if (i12 >= size) {
                break;
            }
            z61 z61Var = (z61) m26409a.get(i12);
            if (z61Var.f57057b == 0) {
                arrayList = m26409a;
                i3 = size;
                metadata3 = metadata;
            } else {
                t61 t61Var = z61Var.f57056a;
                arrayList = m26409a;
                i3 = size;
                long j5 = t61Var.f54961e;
                if (j5 == j3) {
                    j5 = z61Var.f57063h;
                }
                long max = Math.max(j4, j5);
                C4863a c4863a = new C4863a(t61Var, z61Var, this.f48853r.mo23022a(i12, t61Var.f54958b));
                if ("audio/true-hd".equals(t61Var.f54962f.f53820l)) {
                    i4 = z61Var.f57060e * 16;
                } else {
                    i4 = z61Var.f57060e + 30;
                }
                C5606pv.a m27508a = t61Var.f54962f.m27508a();
                m27508a.m27564i(i4);
                if (t61Var.f54958b == 2 && j5 > 0 && (i5 = z61Var.f57057b) > 1) {
                    m27508a.m27541a(i5 / (j5 / 1000000.0f));
                }
                if (t61Var.f54958b == 1) {
                    int i14 = c5557ox.f53351a;
                    if ((i14 == -1 || c5557ox.f53352b == -1) ? false : true) {
                        m27508a.m27558e(i14).m27560f(c5557ox.f53352b);
                    }
                }
                int i15 = t61Var.f54958b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f48843h.isEmpty() ? null : new Metadata(this.f48843h);
                metadata3 = metadata;
                Metadata metadata8 = new Metadata(new Metadata.Entry[0]);
                if (i15 == 1) {
                    if (metadata2 != null) {
                        metadata8 = metadata2;
                    }
                } else if (i15 == 2 && m26406a != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= m26406a.m22237c()) {
                            break;
                        }
                        Metadata.Entry m22234a = m26406a.m22234a(i16);
                        if (m22234a instanceof MdtaMetadataEntry) {
                            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) m22234a;
                            if ("com.android.capture.fps".equals(mdtaMetadataEntry.f48126a)) {
                                metadata8 = new Metadata(mdtaMetadataEntry);
                                break;
                            }
                        }
                        i16++;
                    }
                }
                for (int i17 = 0; i17 < 2; i17++) {
                    metadata8 = metadata8.m22235a(metadataArr[i17]);
                }
                if (metadata8.m22237c() > 0) {
                    m27508a.m27545a(metadata8);
                }
                c4863a.f48862c.mo28347a(m27508a.m27550a());
                if (t61Var.f54958b == 2 && i13 == -1) {
                    i13 = arrayList2.size();
                }
                arrayList2.add(c4863a);
                j4 = max;
            }
            i12++;
            m26409a = arrayList;
            size = i3;
            metadata = metadata3;
            j3 = -9223372036854775807L;
        }
        this.f48856u = i13;
        this.f48857v = j4;
        C4863a[] c4863aArr = (C4863a[]) arrayList2.toArray(new C4863a[0]);
        this.f48854s = c4863aArr;
        long[][] jArr = new long[c4863aArr.length][];
        int[] iArr = new int[c4863aArr.length];
        long[] jArr2 = new long[c4863aArr.length];
        boolean[] zArr = new boolean[c4863aArr.length];
        for (int i18 = 0; i18 < c4863aArr.length; i18++) {
            jArr[i18] = new long[c4863aArr[i18].f48861b.f57057b];
            jArr2[i18] = c4863aArr[i18].f48861b.f57061f[0];
        }
        int i19 = 0;
        while (i19 < c4863aArr.length) {
            long j6 = Long.MAX_VALUE;
            int i20 = -1;
            for (int i21 = 0; i21 < c4863aArr.length; i21++) {
                if (!zArr[i21]) {
                    long j7 = jArr2[i21];
                    if (j7 <= j6) {
                        i20 = i21;
                        j6 = j7;
                    }
                }
            }
            int i22 = iArr[i20];
            long[] jArr3 = jArr[i20];
            jArr3[i22] = j2;
            z61 z61Var2 = c4863aArr[i20].f48861b;
            j2 += z61Var2.f57059d[i22];
            int i23 = i22 + 1;
            iArr[i20] = i23;
            if (i23 < jArr3.length) {
                jArr2[i20] = z61Var2.f57061f[i23];
            } else {
                zArr[i20] = true;
                i19++;
            }
        }
        this.f48855t = jArr;
        this.f48853r.mo23023a();
        this.f48853r.mo23024a(this);
    }
}
