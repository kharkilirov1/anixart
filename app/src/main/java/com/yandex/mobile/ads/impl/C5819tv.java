package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.AbstractC5331kb;
import com.yandex.mobile.ads.impl.C5606pv;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.tv */
/* loaded from: classes3.dex */
public final class C5819tv implements InterfaceC5412lt {

    /* renamed from: F */
    private static final byte[] f55198F;

    /* renamed from: G */
    private static final C5606pv f55199G;

    /* renamed from: A */
    private boolean f55200A;

    /* renamed from: B */
    private InterfaceC5509nt f55201B;

    /* renamed from: C */
    private y61[] f55202C;

    /* renamed from: D */
    private y61[] f55203D;

    /* renamed from: E */
    private boolean f55204E;

    /* renamed from: a */
    private final List<C5606pv> f55205a;

    /* renamed from: b */
    private final SparseArray<b> f55206b;

    /* renamed from: c */
    private final ap0 f55207c;

    /* renamed from: d */
    private final ap0 f55208d;

    /* renamed from: e */
    private final ap0 f55209e;

    /* renamed from: f */
    private final byte[] f55210f;

    /* renamed from: g */
    private final ap0 f55211g;

    /* renamed from: h */
    private final C5985wr f55212h;

    /* renamed from: i */
    private final ap0 f55213i;

    /* renamed from: j */
    private final ArrayDeque<AbstractC5331kb.a> f55214j;

    /* renamed from: k */
    private final ArrayDeque<a> f55215k;

    /* renamed from: l */
    @Nullable
    private final y61 f55216l;

    /* renamed from: m */
    private int f55217m;

    /* renamed from: n */
    private int f55218n;

    /* renamed from: o */
    private long f55219o;

    /* renamed from: p */
    private int f55220p;

    /* renamed from: q */
    @Nullable
    private ap0 f55221q;

    /* renamed from: r */
    private long f55222r;

    /* renamed from: s */
    private int f55223s;

    /* renamed from: t */
    private long f55224t;

    /* renamed from: u */
    private long f55225u;

    /* renamed from: v */
    private long f55226v;

    /* renamed from: w */
    @Nullable
    private b f55227w;

    /* renamed from: x */
    private int f55228x;

    /* renamed from: y */
    private int f55229y;

    /* renamed from: z */
    private int f55230z;

    /* renamed from: com.yandex.mobile.ads.impl.tv$a */
    public static final class a {

        /* renamed from: a */
        public final long f55231a;

        /* renamed from: b */
        public final boolean f55232b;

        /* renamed from: c */
        public final int f55233c;

        public a(int i2, long j2, boolean z) {
            this.f55231a = j2;
            this.f55232b = z;
            this.f55233c = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tv$b */
    public static final class b {

        /* renamed from: a */
        public final y61 f55234a;

        /* renamed from: d */
        public z61 f55237d;

        /* renamed from: e */
        public C5038eo f55238e;

        /* renamed from: f */
        public int f55239f;

        /* renamed from: g */
        public int f55240g;

        /* renamed from: h */
        public int f55241h;

        /* renamed from: i */
        public int f55242i;

        /* renamed from: l */
        private boolean f55245l;

        /* renamed from: b */
        public final v61 f55235b = new v61();

        /* renamed from: c */
        public final ap0 f55236c = new ap0();

        /* renamed from: j */
        private final ap0 f55243j = new ap0(1);

        /* renamed from: k */
        private final ap0 f55244k = new ap0();

        public b(y61 y61Var, z61 z61Var, C5038eo c5038eo) {
            this.f55234a = y61Var;
            this.f55237d = z61Var;
            this.f55238e = c5038eo;
            m28749a(z61Var, c5038eo);
        }

        /* renamed from: c */
        public final long m28751c() {
            if (!this.f55245l) {
                return this.f55237d.f57061f[this.f55239f];
            }
            v61 v61Var = this.f55235b;
            return v61Var.f55762i[this.f55239f];
        }

        /* renamed from: d */
        public final int m28752d() {
            return !this.f55245l ? this.f55237d.f57059d[this.f55239f] : this.f55235b.f55761h[this.f55239f];
        }

        @Nullable
        /* renamed from: e */
        public final u61 m28753e() {
            if (!this.f55245l) {
                return null;
            }
            v61 v61Var = this.f55235b;
            C5038eo c5038eo = v61Var.f55754a;
            int i2 = s91.f54530a;
            int i3 = c5038eo.f50023a;
            u61 u61Var = v61Var.f55766m;
            if (u61Var == null) {
                u61Var = this.f55237d.f57056a.m28467a(i3);
            }
            if (u61Var == null || !u61Var.f55411a) {
                return null;
            }
            return u61Var;
        }

        /* renamed from: f */
        public final boolean m28754f() {
            this.f55239f++;
            if (!this.f55245l) {
                return false;
            }
            int i2 = this.f55240g + 1;
            this.f55240g = i2;
            int[] iArr = this.f55235b.f55760g;
            int i3 = this.f55241h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f55241h = i3 + 1;
            this.f55240g = 0;
            return false;
        }

        /* renamed from: g */
        public final void m28755g() {
            v61 v61Var = this.f55235b;
            v61Var.f55757d = 0;
            v61Var.f55769p = 0L;
            v61Var.f55770q = false;
            v61Var.f55764k = false;
            v61Var.f55768o = false;
            v61Var.f55766m = null;
            this.f55239f = 0;
            this.f55241h = 0;
            this.f55240g = 0;
            this.f55242i = 0;
            this.f55245l = false;
        }

        /* renamed from: a */
        public final void m28749a(z61 z61Var, C5038eo c5038eo) {
            this.f55237d = z61Var;
            this.f55238e = c5038eo;
            this.f55234a.mo28347a(z61Var.f57056a.f54962f);
            m28755g();
        }

        /* renamed from: b */
        public final long m28750b() {
            return !this.f55245l ? this.f55237d.f57058c[this.f55239f] : this.f55235b.f55759f[this.f55241h];
        }

        /* renamed from: a */
        public final int m28747a() {
            int i2;
            if (!this.f55245l) {
                i2 = this.f55237d.f57062g[this.f55239f];
            } else {
                i2 = this.f55235b.f55763j[this.f55239f] ? 1 : 0;
            }
            return m28753e() != null ? i2 | 1073741824 : i2;
        }

        /* renamed from: a */
        public final int m28748a(int i2, int i3) {
            ap0 ap0Var;
            u61 m28753e = m28753e();
            if (m28753e == null) {
                return 0;
            }
            int i4 = m28753e.f55414d;
            if (i4 != 0) {
                ap0Var = this.f55235b.f55767n;
            } else {
                byte[] bArr = m28753e.f55415e;
                int i5 = s91.f54530a;
                this.f55244k.m22582a(bArr.length, bArr);
                ap0 ap0Var2 = this.f55244k;
                i4 = bArr.length;
                ap0Var = ap0Var2;
            }
            v61 v61Var = this.f55235b;
            boolean z = v61Var.f55764k && v61Var.f55765l[this.f55239f];
            boolean z2 = z || i3 != 0;
            this.f55243j.m22587c()[0] = (byte) ((z2 ? 128 : 0) | i4);
            this.f55243j.m22591e(0);
            this.f55234a.mo28349b(1, this.f55243j);
            this.f55234a.mo28349b(i4, ap0Var);
            if (!z2) {
                return i4 + 1;
            }
            if (!z) {
                this.f55236c.m22586c(8);
                byte[] m22587c = this.f55236c.m22587c();
                m22587c[0] = 0;
                m22587c[1] = 1;
                m22587c[2] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c[4] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c[5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c[6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c[7] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f55234a.mo28349b(8, this.f55236c);
                return i4 + 1 + 8;
            }
            ap0 ap0Var3 = this.f55235b.f55767n;
            int m22613z = ap0Var3.m22613z();
            ap0Var3.m22593f(-2);
            int i6 = (m22613z * 6) + 2;
            if (i3 != 0) {
                this.f55236c.m22586c(i6);
                byte[] m22587c2 = this.f55236c.m22587c();
                ap0Var3.m22583a(m22587c2, 0, i6);
                int i7 = (((m22587c2[2] & 255) << 8) | (m22587c2[3] & 255)) + i3;
                m22587c2[2] = (byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                m22587c2[3] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
                ap0Var3 = this.f55236c;
            }
            this.f55234a.mo28349b(i6, ap0Var3);
            return i4 + 1 + i6;
        }
    }

    static {
        jp1 jp1Var = jp1.f51688B;
        f55198F = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        f55199G = new C5606pv.a().m27561f("application/x-emsg").m27550a();
    }

    public C5819tv(int i2) {
        this(Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InterfaceC5412lt[] m28742a() {
        return new InterfaceC5412lt[]{new C5819tv(0)};
    }

    @Nullable
    /* renamed from: a */
    public final t61 m28744a(@Nullable t61 t61Var) {
        return t61Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    public C5819tv(List list) {
        this(list, 0);
    }

    public C5819tv(List list, int i2) {
        this.f55205a = Collections.unmodifiableList(list);
        this.f55216l = null;
        this.f55212h = new C5985wr();
        this.f55213i = new ap0(16);
        this.f55207c = new ap0(ch0.f49243a);
        this.f55208d = new ap0(5);
        this.f55209e = new ap0();
        byte[] bArr = new byte[16];
        this.f55210f = bArr;
        this.f55211g = new ap0(bArr);
        this.f55214j = new ArrayDeque<>();
        this.f55215k = new ArrayDeque<>();
        this.f55206b = new SparseArray<>();
        this.f55225u = -9223372036854775807L;
        this.f55224t = -9223372036854775807L;
        this.f55226v = -9223372036854775807L;
        this.f55201B = InterfaceC5509nt.f53089a;
        this.f55202C = new y61[0];
        this.f55203D = new y61[0];
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        return p21.m27155a((C5598pn) interfaceC5458mt);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        int i2;
        this.f55201B = interfaceC5509nt;
        int i3 = 0;
        this.f55217m = 0;
        this.f55220p = 0;
        y61[] y61VarArr = new y61[2];
        this.f55202C = y61VarArr;
        y61 y61Var = this.f55216l;
        if (y61Var != null) {
            y61VarArr[0] = y61Var;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        y61[] y61VarArr2 = (y61[]) s91.m28113a(i2, y61VarArr);
        this.f55202C = y61VarArr2;
        for (y61 y61Var2 : y61VarArr2) {
            y61Var2.mo28347a(f55199G);
        }
        this.f55203D = new y61[this.f55205a.size()];
        while (i3 < this.f55203D.length) {
            y61 mo23022a = this.f55201B.mo23022a(i4, 3);
            mo23022a.mo28347a(this.f55205a.get(i3));
            this.f55203D[i3] = mo23022a;
            i3++;
            i4++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        int size = this.f55206b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f55206b.valueAt(i2).m28755g();
        }
        this.f55215k.clear();
        this.f55223s = 0;
        this.f55224t = j3;
        this.f55214j.clear();
        this.f55217m = 0;
        this.f55220p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r34, com.yandex.mobile.ads.impl.qr0 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5819tv.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }

    /* renamed from: a */
    private void m28739a(long j2) throws ep0 {
        C5819tv c5819tv;
        byte[] bArr;
        AbstractC5331kb.a aVar;
        SparseArray<b> sparseArray;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        AbstractC5331kb.a aVar2;
        int i9;
        int i10;
        int i11;
        AbstractC5331kb.a aVar3;
        v61 v61Var;
        ArrayList arrayList;
        int i12;
        b bVar;
        int i13;
        boolean z;
        int i14;
        int i15;
        boolean z2;
        int i16;
        int i17;
        boolean z3;
        ap0 ap0Var;
        boolean z4;
        int i18;
        v61 v61Var2;
        C5038eo c5038eo;
        C5819tv c5819tv2 = this;
        C5819tv c5819tv3 = c5819tv2;
        while (!c5819tv3.f55214j.isEmpty() && c5819tv3.f55214j.peek().f51929b == j2) {
            AbstractC5331kb.a pop = c5819tv3.f55214j.pop();
            int i19 = pop.f51928a;
            if (i19 == 1836019574) {
                c5819tv3.m28741a(pop);
            } else {
                if (i19 == 1836019558) {
                    SparseArray<b> sparseArray2 = c5819tv3.f55206b;
                    byte[] bArr4 = c5819tv3.f55210f;
                    int size = pop.f51931d.size();
                    int i20 = 0;
                    while (i20 < size) {
                        AbstractC5331kb.a aVar4 = (AbstractC5331kb.a) pop.f51931d.get(i20);
                        if (aVar4.f51928a == 1953653094) {
                            AbstractC5331kb.b m26098d = aVar4.m26098d(1952868452);
                            Objects.requireNonNull(m26098d);
                            ap0 ap0Var2 = m26098d.f51932b;
                            ap0Var2.m22591e(8);
                            int m22595h = ap0Var2.m22595h() & 16777215;
                            b bVar2 = sparseArray2.get(ap0Var2.m22595h());
                            if (bVar2 == null) {
                                bVar2 = null;
                            } else {
                                if ((m22595h & 1) != 0) {
                                    long m22612y = ap0Var2.m22612y();
                                    v61 v61Var3 = bVar2.f55235b;
                                    v61Var3.f55755b = m22612y;
                                    v61Var3.f55756c = m22612y;
                                }
                                C5038eo c5038eo2 = bVar2.f55238e;
                                int m22595h2 = (m22595h & 2) != 0 ? ap0Var2.m22595h() - 1 : c5038eo2.f50023a;
                                if ((m22595h & 8) != 0) {
                                    i4 = ap0Var2.m22595h();
                                } else {
                                    i4 = c5038eo2.f50024b;
                                }
                                if ((m22595h & 16) != 0) {
                                    i5 = ap0Var2.m22595h();
                                } else {
                                    i5 = c5038eo2.f50025c;
                                }
                                if ((m22595h & 32) != 0) {
                                    i6 = ap0Var2.m22595h();
                                } else {
                                    i6 = c5038eo2.f50026d;
                                }
                                bVar2.f55235b.f55754a = new C5038eo(m22595h2, i4, i5, i6);
                            }
                            if (bVar2 != null) {
                                v61 v61Var4 = bVar2.f55235b;
                                long j3 = v61Var4.f55769p;
                                boolean z5 = v61Var4.f55770q;
                                bVar2.m28755g();
                                bVar2.f55245l = true;
                                AbstractC5331kb.b m26098d2 = aVar4.m26098d(1952867444);
                                if (m26098d2 != null) {
                                    ap0 ap0Var3 = m26098d2.f51932b;
                                    ap0Var3.m22591e(8);
                                    v61Var4.f55769p = AbstractC5331kb.m26096b(ap0Var3.m22595h()) == 1 ? ap0Var3.m22612y() : ap0Var3.m22609v();
                                    v61Var4.f55770q = true;
                                } else {
                                    v61Var4.f55769p = j3;
                                    v61Var4.f55770q = z5;
                                }
                                ArrayList arrayList2 = aVar4.f51930c;
                                int size2 = arrayList2.size();
                                int i21 = 0;
                                int i22 = 0;
                                int i23 = 0;
                                while (true) {
                                    i7 = 1953658222;
                                    if (i23 >= size2) {
                                        break;
                                    }
                                    AbstractC5331kb.b bVar3 = (AbstractC5331kb.b) arrayList2.get(i23);
                                    SparseArray<b> sparseArray3 = sparseArray2;
                                    if (bVar3.f51928a == 1953658222) {
                                        ap0 ap0Var4 = bVar3.f51932b;
                                        ap0Var4.m22591e(12);
                                        int m22611x = ap0Var4.m22611x();
                                        if (m22611x > 0) {
                                            i21 += m22611x;
                                            i22++;
                                        }
                                    }
                                    i23++;
                                    sparseArray2 = sparseArray3;
                                }
                                sparseArray = sparseArray2;
                                bVar2.f55241h = 0;
                                bVar2.f55240g = 0;
                                bVar2.f55239f = 0;
                                v61 v61Var5 = bVar2.f55235b;
                                v61Var5.f55757d = i22;
                                v61Var5.f55758e = i21;
                                if (v61Var5.f55760g.length < i22) {
                                    v61Var5.f55759f = new long[i22];
                                    v61Var5.f55760g = new int[i22];
                                }
                                if (v61Var5.f55761h.length < i21) {
                                    int i24 = (i21 * 125) / 100;
                                    v61Var5.f55761h = new int[i24];
                                    v61Var5.f55762i = new long[i24];
                                    v61Var5.f55763j = new boolean[i24];
                                    v61Var5.f55765l = new boolean[i24];
                                }
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    long j4 = 0;
                                    if (i25 < size2) {
                                        AbstractC5331kb.b bVar4 = (AbstractC5331kb.b) arrayList2.get(i25);
                                        if (bVar4.f51928a == i7) {
                                            int i28 = i26 + 1;
                                            ap0 ap0Var5 = bVar4.f51932b;
                                            ap0Var5.m22591e(8);
                                            int m22595h3 = ap0Var5.m22595h() & 16777215;
                                            i10 = size;
                                            t61 t61Var = bVar2.f55237d.f57056a;
                                            arrayList = arrayList2;
                                            v61 v61Var6 = bVar2.f55235b;
                                            i12 = size2;
                                            C5038eo c5038eo3 = v61Var6.f55754a;
                                            int i29 = s91.f54530a;
                                            v61Var6.f55760g[i26] = ap0Var5.m22611x();
                                            long[] jArr = v61Var6.f55759f;
                                            bArr3 = bArr4;
                                            long j5 = v61Var6.f55755b;
                                            jArr[i26] = j5;
                                            if ((m22595h3 & 1) != 0) {
                                                aVar2 = pop;
                                                i11 = i20;
                                                aVar3 = aVar4;
                                                jArr[i26] = j5 + ap0Var5.m22595h();
                                            } else {
                                                aVar2 = pop;
                                                i11 = i20;
                                                aVar3 = aVar4;
                                            }
                                            boolean z6 = (m22595h3 & 4) != 0;
                                            int i30 = c5038eo3.f50026d;
                                            if (z6) {
                                                i30 = ap0Var5.m22595h();
                                            }
                                            boolean z7 = (m22595h3 & 256) != 0;
                                            boolean z8 = (m22595h3 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 0;
                                            boolean z9 = (m22595h3 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 0;
                                            boolean z10 = (m22595h3 & RecyclerView.ViewHolder.FLAG_MOVED) != 0;
                                            long[] jArr2 = t61Var.f54964h;
                                            if (jArr2 != null) {
                                                i13 = i30;
                                                v61Var = v61Var4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    j4 = t61Var.f54965i[0];
                                                }
                                            } else {
                                                i13 = i30;
                                                v61Var = v61Var4;
                                            }
                                            int[] iArr = v61Var6.f55761h;
                                            long[] jArr3 = v61Var6.f55762i;
                                            boolean[] zArr = v61Var6.f55763j;
                                            i9 = i25;
                                            int i31 = v61Var6.f55760g[i26] + i27;
                                            long j6 = t61Var.f54959c;
                                            bVar = bVar2;
                                            long j7 = v61Var6.f55769p;
                                            int i32 = i27;
                                            while (i32 < i31) {
                                                if (z7) {
                                                    z = z7;
                                                    i15 = i31;
                                                    i14 = ap0Var5.m22595h();
                                                } else {
                                                    z = z7;
                                                    i14 = c5038eo3.f50024b;
                                                    i15 = i31;
                                                }
                                                if (i14 < 0) {
                                                    throw ep0.m24225a("Unexpected negative value: " + i14, (Exception) null);
                                                }
                                                if (z8) {
                                                    z2 = z8;
                                                    i16 = ap0Var5.m22595h();
                                                } else {
                                                    z2 = z8;
                                                    i16 = c5038eo3.f50025c;
                                                }
                                                if (i16 < 0) {
                                                    throw ep0.m24225a("Unexpected negative value: " + i16, (Exception) null);
                                                }
                                                if (z9) {
                                                    i17 = ap0Var5.m22595h();
                                                } else {
                                                    i17 = (i32 == 0 && z6) ? i13 : c5038eo3.f50026d;
                                                }
                                                if (z10) {
                                                    z3 = z6;
                                                    ap0Var = ap0Var5;
                                                    z4 = z10;
                                                    i18 = ap0Var5.m22595h();
                                                } else {
                                                    z3 = z6;
                                                    ap0Var = ap0Var5;
                                                    z4 = z10;
                                                    i18 = 0;
                                                }
                                                long m28097a = s91.m28097a((i18 + j7) - j4, 1000000L, j6);
                                                jArr3[i32] = m28097a;
                                                if (v61Var6.f55770q) {
                                                    v61Var2 = v61Var6;
                                                    c5038eo = c5038eo3;
                                                } else {
                                                    v61Var2 = v61Var6;
                                                    c5038eo = c5038eo3;
                                                    jArr3[i32] = m28097a + bVar.f55237d.f57063h;
                                                }
                                                iArr[i32] = i16;
                                                zArr[i32] = ((i17 >> 16) & 1) == 0;
                                                j7 += i14;
                                                i32++;
                                                v61Var6 = v61Var2;
                                                c5038eo3 = c5038eo;
                                                z7 = z;
                                                i31 = i15;
                                                z8 = z2;
                                                z6 = z3;
                                                ap0Var5 = ap0Var;
                                                z10 = z4;
                                            }
                                            v61Var6.f55769p = j7;
                                            i26 = i28;
                                            i27 = i31;
                                        } else {
                                            bArr3 = bArr4;
                                            aVar2 = pop;
                                            i9 = i25;
                                            i10 = size;
                                            i11 = i20;
                                            aVar3 = aVar4;
                                            v61Var = v61Var4;
                                            arrayList = arrayList2;
                                            i12 = size2;
                                            bVar = bVar2;
                                        }
                                        i25 = i9 + 1;
                                        i7 = 1953658222;
                                        bVar2 = bVar;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        size2 = i12;
                                        bArr4 = bArr3;
                                        pop = aVar2;
                                        i20 = i11;
                                        aVar4 = aVar3;
                                        v61Var4 = v61Var;
                                    } else {
                                        byte[] bArr5 = bArr4;
                                        aVar = pop;
                                        i2 = size;
                                        i3 = i20;
                                        v61 v61Var7 = v61Var4;
                                        t61 t61Var2 = bVar2.f55237d.f57056a;
                                        C5038eo c5038eo4 = v61Var7.f55754a;
                                        Objects.requireNonNull(c5038eo4);
                                        u61 m28467a = t61Var2.m28467a(c5038eo4.f50023a);
                                        AbstractC5331kb.b m26098d3 = aVar4.m26098d(1935763834);
                                        if (m26098d3 != null) {
                                            Objects.requireNonNull(m28467a);
                                            ap0 ap0Var6 = m26098d3.f51932b;
                                            int i33 = m28467a.f55414d;
                                            ap0Var6.m22591e(8);
                                            if ((ap0Var6.m22595h() & 16777215 & 1) == 1) {
                                                ap0Var6.m22593f(8);
                                            }
                                            int m22607t = ap0Var6.m22607t();
                                            int m22611x2 = ap0Var6.m22611x();
                                            if (m22611x2 <= v61Var7.f55758e) {
                                                if (m22607t == 0) {
                                                    boolean[] zArr2 = v61Var7.f55765l;
                                                    i8 = 0;
                                                    for (int i34 = 0; i34 < m22611x2; i34++) {
                                                        int m22607t2 = ap0Var6.m22607t();
                                                        i8 += m22607t2;
                                                        zArr2[i34] = m22607t2 > i33;
                                                    }
                                                } else {
                                                    i8 = (m22607t * m22611x2) + 0;
                                                    Arrays.fill(v61Var7.f55765l, 0, m22611x2, m22607t > i33);
                                                }
                                                Arrays.fill(v61Var7.f55765l, m22611x2, v61Var7.f55758e, false);
                                                if (i8 > 0) {
                                                    v61Var7.f55767n.m22586c(i8);
                                                    v61Var7.f55764k = true;
                                                    v61Var7.f55768o = true;
                                                }
                                            } else {
                                                StringBuilder m25v = C0000a.m25v("Saiz sample count ", m22611x2, " is greater than fragment sample count");
                                                m25v.append(v61Var7.f55758e);
                                                throw ep0.m24225a(m25v.toString(), (Exception) null);
                                            }
                                        }
                                        AbstractC5331kb.b m26098d4 = aVar4.m26098d(1935763823);
                                        if (m26098d4 != null) {
                                            ap0 ap0Var7 = m26098d4.f51932b;
                                            ap0Var7.m22591e(8);
                                            int m22595h4 = ap0Var7.m22595h();
                                            if ((16777215 & m22595h4 & 1) == 1) {
                                                ap0Var7.m22593f(8);
                                            }
                                            int m22611x3 = ap0Var7.m22611x();
                                            if (m22611x3 != 1) {
                                                throw ep0.m24225a("Unexpected saio entry count: " + m22611x3, (Exception) null);
                                            }
                                            v61Var7.f55756c += AbstractC5331kb.m26096b(m22595h4) == 0 ? ap0Var7.m22609v() : ap0Var7.m22612y();
                                        }
                                        byte[] bArr6 = null;
                                        AbstractC5331kb.b m26098d5 = aVar4.m26098d(1936027235);
                                        if (m26098d5 != null) {
                                            m28740a(m26098d5.f51932b, 0, v61Var7);
                                        }
                                        String str = m28467a != null ? m28467a.f55412b : null;
                                        ap0 ap0Var8 = null;
                                        ap0 ap0Var9 = null;
                                        for (int i35 = 0; i35 < aVar4.f51930c.size(); i35++) {
                                            AbstractC5331kb.b bVar5 = (AbstractC5331kb.b) aVar4.f51930c.get(i35);
                                            ap0 ap0Var10 = bVar5.f51932b;
                                            int i36 = bVar5.f51928a;
                                            if (i36 == 1935828848) {
                                                ap0Var10.m22591e(12);
                                                if (ap0Var10.m22595h() == 1936025959) {
                                                    ap0Var8 = ap0Var10;
                                                }
                                            } else if (i36 == 1936158820) {
                                                ap0Var10.m22591e(12);
                                                if (ap0Var10.m22595h() == 1936025959) {
                                                    ap0Var9 = ap0Var10;
                                                }
                                            }
                                        }
                                        if (ap0Var8 != null && ap0Var9 != null) {
                                            ap0Var8.m22591e(8);
                                            int m26096b = AbstractC5331kb.m26096b(ap0Var8.m22595h());
                                            ap0Var8.m22593f(4);
                                            if (m26096b == 1) {
                                                ap0Var8.m22593f(4);
                                            }
                                            if (ap0Var8.m22595h() == 1) {
                                                ap0Var9.m22591e(8);
                                                int m26096b2 = AbstractC5331kb.m26096b(ap0Var9.m22595h());
                                                ap0Var9.m22593f(4);
                                                if (m26096b2 == 1) {
                                                    if (ap0Var9.m22609v() == 0) {
                                                        throw ep0.m24224a("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (m26096b2 >= 2) {
                                                    ap0Var9.m22593f(4);
                                                }
                                                if (ap0Var9.m22609v() == 1) {
                                                    ap0Var9.m22593f(1);
                                                    int m22607t3 = ap0Var9.m22607t();
                                                    int i37 = (m22607t3 & 240) >> 4;
                                                    int i38 = m22607t3 & 15;
                                                    boolean z11 = ap0Var9.m22607t() == 1;
                                                    if (z11) {
                                                        int m22607t4 = ap0Var9.m22607t();
                                                        byte[] bArr7 = new byte[16];
                                                        ap0Var9.m22583a(bArr7, 0, 16);
                                                        if (m22607t4 == 0) {
                                                            int m22607t5 = ap0Var9.m22607t();
                                                            bArr6 = new byte[m22607t5];
                                                            ap0Var9.m22583a(bArr6, 0, m22607t5);
                                                        }
                                                        v61Var7.f55764k = true;
                                                        v61Var7.f55766m = new u61(z11, str, m22607t4, bArr7, i37, i38, bArr6);
                                                    }
                                                } else {
                                                    throw ep0.m24224a("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            } else {
                                                throw ep0.m24224a("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                        int size3 = aVar4.f51930c.size();
                                        int i39 = 0;
                                        while (i39 < size3) {
                                            AbstractC5331kb.b bVar6 = (AbstractC5331kb.b) aVar4.f51930c.get(i39);
                                            if (bVar6.f51928a == 1970628964) {
                                                ap0 ap0Var11 = bVar6.f51932b;
                                                ap0Var11.m22591e(8);
                                                bArr2 = bArr5;
                                                ap0Var11.m22583a(bArr2, 0, 16);
                                                if (Arrays.equals(bArr2, f55198F)) {
                                                    m28740a(ap0Var11, 16, v61Var7);
                                                }
                                            } else {
                                                bArr2 = bArr5;
                                            }
                                            i39++;
                                            bArr5 = bArr2;
                                        }
                                        bArr = bArr5;
                                    }
                                }
                                i20 = i3 + 1;
                                bArr4 = bArr;
                                sparseArray2 = sparseArray;
                                size = i2;
                                pop = aVar;
                            }
                        }
                        bArr = bArr4;
                        aVar = pop;
                        sparseArray = sparseArray2;
                        i2 = size;
                        i3 = i20;
                        i20 = i3 + 1;
                        bArr4 = bArr;
                        sparseArray2 = sparseArray;
                        size = i2;
                        pop = aVar;
                    }
                    DrmInitData m28738a = m28738a(pop.f51930c);
                    c5819tv = this;
                    if (m28738a != null) {
                        int size4 = c5819tv.f55206b.size();
                        for (int i40 = 0; i40 < size4; i40++) {
                            b valueAt = c5819tv.f55206b.valueAt(i40);
                            t61 t61Var3 = valueAt.f55237d.f57056a;
                            C5038eo c5038eo5 = valueAt.f55235b.f55754a;
                            int i41 = s91.f54530a;
                            u61 m28467a2 = t61Var3.m28467a(c5038eo5.f50023a);
                            valueAt.f55234a.mo28347a(valueAt.f55237d.f57056a.f54962f.m27508a().m27544a(m28738a.m22090a(m28467a2 != null ? m28467a2.f55412b : null)).m27550a());
                        }
                    }
                    if (c5819tv.f55224t != -9223372036854775807L) {
                        int size5 = c5819tv.f55206b.size();
                        for (int i42 = 0; i42 < size5; i42++) {
                            b valueAt2 = c5819tv.f55206b.valueAt(i42);
                            long j8 = c5819tv.f55224t;
                            int i43 = valueAt2.f55239f;
                            while (true) {
                                v61 v61Var8 = valueAt2.f55235b;
                                if (i43 < v61Var8.f55758e && v61Var8.f55762i[i43] < j8) {
                                    if (v61Var8.f55763j[i43]) {
                                        valueAt2.f55242i = i43;
                                    }
                                    i43++;
                                }
                            }
                        }
                        c5819tv.f55224t = -9223372036854775807L;
                    }
                    c5819tv3 = c5819tv;
                } else {
                    c5819tv = c5819tv2;
                    if (!c5819tv3.f55214j.isEmpty()) {
                        c5819tv3.f55214j.peek().f51931d.add(pop);
                    }
                }
                c5819tv2 = c5819tv;
            }
        }
        c5819tv3.f55217m = 0;
        c5819tv3.f55220p = 0;
    }

    /* renamed from: a */
    private void m28741a(AbstractC5331kb.a aVar) throws ep0 {
        C5038eo c5038eo;
        C5038eo c5038eo2;
        DrmInitData m28738a = m28738a(aVar.f51930c);
        AbstractC5331kb.a m26097c = aVar.m26097c(1836475768);
        Objects.requireNonNull(m26097c);
        SparseArray sparseArray = new SparseArray();
        int size = m26097c.f51930c.size();
        long j2 = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC5331kb.b bVar = (AbstractC5331kb.b) m26097c.f51930c.get(i2);
            int i3 = bVar.f51928a;
            if (i3 == 1953654136) {
                ap0 ap0Var = bVar.f51932b;
                ap0Var.m22591e(12);
                Pair create = Pair.create(Integer.valueOf(ap0Var.m22595h()), new C5038eo(ap0Var.m22595h() - 1, ap0Var.m22595h(), ap0Var.m22595h(), ap0Var.m22595h()));
                sparseArray.put(((Integer) create.first).intValue(), (C5038eo) create.second);
            } else if (i3 == 1835362404) {
                ap0 ap0Var2 = bVar.f51932b;
                ap0Var2.m22591e(8);
                j2 = AbstractC5331kb.m26096b(ap0Var2.m22595h()) == 0 ? ap0Var2.m22609v() : ap0Var2.m22612y();
            }
        }
        ArrayList m26409a = C5391lb.m26409a(aVar, new C5557ox(), j2, m28738a, false, false, new en1(this, 14));
        int size2 = m26409a.size();
        if (this.f55206b.size() == 0) {
            for (int i4 = 0; i4 < size2; i4++) {
                z61 z61Var = (z61) m26409a.get(i4);
                t61 t61Var = z61Var.f57056a;
                y61 mo23022a = this.f55201B.mo23022a(i4, t61Var.f54958b);
                int i5 = t61Var.f54957a;
                if (sparseArray.size() == 1) {
                    c5038eo2 = (C5038eo) sparseArray.valueAt(0);
                } else {
                    c5038eo2 = (C5038eo) sparseArray.get(i5);
                    Objects.requireNonNull(c5038eo2);
                }
                this.f55206b.put(t61Var.f54957a, new b(mo23022a, z61Var, c5038eo2));
                this.f55225u = Math.max(this.f55225u, t61Var.f54961e);
            }
            this.f55201B.mo23023a();
            return;
        }
        C5220ia.m25476b(this.f55206b.size() == size2);
        for (int i6 = 0; i6 < size2; i6++) {
            z61 z61Var2 = (z61) m26409a.get(i6);
            t61 t61Var2 = z61Var2.f57056a;
            b bVar2 = this.f55206b.get(t61Var2.f54957a);
            int i7 = t61Var2.f54957a;
            if (sparseArray.size() == 1) {
                c5038eo = (C5038eo) sparseArray.valueAt(0);
            } else {
                c5038eo = (C5038eo) sparseArray.get(i7);
                Objects.requireNonNull(c5038eo);
            }
            bVar2.m28749a(z61Var2, c5038eo);
        }
    }

    /* renamed from: a */
    private static void m28740a(ap0 ap0Var, int i2, v61 v61Var) throws ep0 {
        ap0Var.m22591e(i2 + 8);
        int m22595h = ap0Var.m22595h() & 16777215;
        if ((m22595h & 1) == 0) {
            boolean z = (m22595h & 2) != 0;
            int m22611x = ap0Var.m22611x();
            if (m22611x == 0) {
                Arrays.fill(v61Var.f55765l, 0, v61Var.f55758e, false);
                return;
            }
            if (m22611x == v61Var.f55758e) {
                Arrays.fill(v61Var.f55765l, 0, m22611x, z);
                v61Var.f55767n.m22586c(ap0Var.m22579a());
                v61Var.f55764k = true;
                v61Var.f55768o = true;
                ap0Var.m22583a(v61Var.f55767n.m22587c(), 0, v61Var.f55767n.m22590e());
                v61Var.f55767n.m22591e(0);
                v61Var.f55768o = false;
                return;
            }
            StringBuilder m25v = C0000a.m25v("Senc sample count ", m22611x, " is different from fragment sample count");
            m25v.append(v61Var.f55758e);
            throw ep0.m24225a(m25v.toString(), (Exception) null);
        }
        throw ep0.m24224a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Nullable
    /* renamed from: a */
    private static DrmInitData m28738a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC5331kb.b bVar = (AbstractC5331kb.b) arrayList.get(i2);
            if (bVar.f51928a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] m22587c = bVar.f51932b.m22587c();
                UUID m26954c = nt0.m26954c(m22587c);
                if (m26954c == null) {
                    d90.m23842d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(m26954c, null, "video/mp4", m22587c));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(arrayList2);
    }
}
