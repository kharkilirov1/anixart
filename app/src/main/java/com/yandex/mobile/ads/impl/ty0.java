package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.InterfaceC4718e;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.exo.drm.InterfaceC4720g;
import com.yandex.mobile.ads.impl.y61;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ty0 implements y61 {

    /* renamed from: A */
    private boolean f55254A;

    /* renamed from: B */
    private boolean f55255B;

    /* renamed from: a */
    private final sy0 f55256a;

    /* renamed from: d */
    @Nullable
    private final InterfaceC4720g f55259d;

    /* renamed from: e */
    @Nullable
    private final InterfaceC4719f.a f55260e;

    /* renamed from: f */
    @Nullable
    private InterfaceC5827c f55261f;

    /* renamed from: g */
    @Nullable
    private C5606pv f55262g;

    /* renamed from: h */
    @Nullable
    private InterfaceC4718e f55263h;

    /* renamed from: p */
    private int f55271p;

    /* renamed from: q */
    private int f55272q;

    /* renamed from: r */
    private int f55273r;

    /* renamed from: s */
    private int f55274s;

    /* renamed from: w */
    private boolean f55278w;

    /* renamed from: z */
    @Nullable
    private C5606pv f55281z;

    /* renamed from: b */
    private final C5825a f55257b = new C5825a();

    /* renamed from: i */
    private int f55264i = 1000;

    /* renamed from: j */
    private int[] f55265j = new int[1000];

    /* renamed from: k */
    private long[] f55266k = new long[1000];

    /* renamed from: n */
    private long[] f55269n = new long[1000];

    /* renamed from: m */
    private int[] f55268m = new int[1000];

    /* renamed from: l */
    private int[] f55267l = new int[1000];

    /* renamed from: o */
    private y61.C6060a[] f55270o = new y61.C6060a[1000];

    /* renamed from: c */
    private final k31<C5826b> f55258c = new k31<>(dn1.f49695f);

    /* renamed from: t */
    private long f55275t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f55276u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f55277v = Long.MIN_VALUE;

    /* renamed from: y */
    private boolean f55280y = true;

    /* renamed from: x */
    private boolean f55279x = true;

    /* renamed from: com.yandex.mobile.ads.impl.ty0$a */
    public static final class C5825a {

        /* renamed from: a */
        public int f55282a;

        /* renamed from: b */
        public long f55283b;

        /* renamed from: c */
        @Nullable
        public y61.C6060a f55284c;
    }

    /* renamed from: com.yandex.mobile.ads.impl.ty0$b */
    public static final class C5826b {

        /* renamed from: a */
        public final C5606pv f55285a;

        /* renamed from: b */
        public final InterfaceC4720g.b f55286b;

        public /* synthetic */ C5826b(C5606pv c5606pv, InterfaceC4720g.b bVar, int i2) {
            this(c5606pv, bVar);
        }

        private C5826b(C5606pv c5606pv, InterfaceC4720g.b bVar) {
            this.f55285a = c5606pv;
            this.f55286b = bVar;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ty0$c */
    public interface InterfaceC5827c {
    }

    public ty0(InterfaceC5476n8 interfaceC5476n8, @Nullable InterfaceC4720g interfaceC4720g, @Nullable InterfaceC4719f.a aVar) {
        this.f55259d = interfaceC4720g;
        this.f55260e = aVar;
        this.f55256a = new sy0(interfaceC5476n8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28770a(C5826b c5826b) {
        c5826b.f55286b.release();
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public /* synthetic */ void mo28345a(int i2, ap0 ap0Var) {
        rq1.m27976a(this, i2, ap0Var);
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: b */
    public /* synthetic */ int mo28348b(InterfaceC4815am interfaceC4815am, int i2, boolean z) {
        return rq1.m27977b(this, interfaceC4815am, i2, z);
    }

    @CallSuper
    /* renamed from: b */
    public final void m28782b(boolean z) {
        this.f55256a.m28379b();
        this.f55271p = 0;
        this.f55272q = 0;
        this.f55273r = 0;
        this.f55274s = 0;
        this.f55279x = true;
        this.f55275t = Long.MIN_VALUE;
        this.f55276u = Long.MIN_VALUE;
        this.f55277v = Long.MIN_VALUE;
        this.f55278w = false;
        this.f55258c.m26017a();
        if (z) {
            this.f55281z = null;
            this.f55280y = true;
        }
    }

    /* renamed from: c */
    public final int m28784c() {
        return this.f55272q + this.f55274s;
    }

    @Nullable
    /* renamed from: d */
    public final synchronized C5606pv m28785d() {
        return this.f55280y ? null : this.f55281z;
    }

    /* renamed from: e */
    public final int m28787e() {
        return this.f55272q + this.f55271p;
    }

    /* renamed from: f */
    public final synchronized boolean m28788f() {
        return this.f55278w;
    }

    @CallSuper
    /* renamed from: g */
    public final void m28789g() throws IOException {
        InterfaceC4718e interfaceC4718e = this.f55263h;
        if (interfaceC4718e == null || interfaceC4718e.mo22111c() != 1) {
            return;
        }
        InterfaceC4718e.a mo22115g = this.f55263h.mo22115g();
        Objects.requireNonNull(mo22115g);
        throw mo22115g;
    }

    @CallSuper
    /* renamed from: h */
    public final void m28790h() {
        m28776a();
        InterfaceC4718e interfaceC4718e = this.f55263h;
        if (interfaceC4718e != null) {
            interfaceC4718e.mo22106a(this.f55260e);
            this.f55263h = null;
            this.f55262g = null;
        }
    }

    @CallSuper
    /* renamed from: i */
    public final void m28791i() {
        m28782b(true);
        InterfaceC4718e interfaceC4718e = this.f55263h;
        if (interfaceC4718e != null) {
            interfaceC4718e.mo22106a(this.f55260e);
            this.f55263h = null;
            this.f55262g = null;
        }
    }

    /* renamed from: c */
    private int m28773c(int i2) {
        int i3 = this.f55273r + i2;
        int i4 = this.f55264i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* renamed from: a */
    public final void m28777a(long j2) {
        this.f55275t = j2;
    }

    /* renamed from: d */
    public final synchronized void m28786d(int i2) {
        boolean z;
        if (i2 >= 0) {
            try {
                if (this.f55274s + i2 <= this.f55271p) {
                    z = true;
                    C5220ia.m25473a(z);
                    this.f55274s += i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C5220ia.m25473a(z);
        this.f55274s += i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0075 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000c, B:13:0x001e, B:16:0x0023, B:19:0x0029, B:21:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x0049, B:48:0x004e, B:50:0x0058, B:52:0x005e, B:54:0x0067, B:59:0x0075, B:61:0x0079, B:63:0x008c, B:64:0x0091, B:66:0x00a6), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000c, B:13:0x001e, B:16:0x0023, B:19:0x0029, B:21:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x0049, B:48:0x004e, B:50:0x0058, B:52:0x005e, B:54:0x0067, B:59:0x0075, B:61:0x0079, B:63:0x008c, B:64:0x0091, B:66:0x00a6), top: B:6:0x000c }] */
    @androidx.annotation.CallSuper
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m28775a(com.yandex.mobile.ads.impl.C5658qv r11, com.yandex.mobile.ads.impl.C5752sm r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ty0.m28775a(com.yandex.mobile.ads.impl.qv, com.yandex.mobile.ads.impl.sm, int, boolean):int");
    }

    /* renamed from: b */
    public final synchronized long m28781b() {
        return this.f55277v;
    }

    /* renamed from: b */
    public final synchronized boolean m28783b(long j2, boolean z) {
        synchronized (this) {
            this.f55274s = 0;
            this.f55256a.m28381c();
        }
        int m28773c = m28773c(this.f55274s);
        int i2 = this.f55274s;
        int i3 = this.f55271p;
        if ((i2 != i3) && j2 >= this.f55269n[m28773c] && (j2 <= this.f55277v || z)) {
            int m28767a = m28767a(m28773c, i3 - i2, j2, true);
            if (m28767a == -1) {
                return false;
            }
            this.f55275t = j2;
            this.f55274s += m28767a;
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: b */
    public final void mo28349b(int i2, ap0 ap0Var) {
        this.f55256a.m28376a(i2, ap0Var);
    }

    /* renamed from: b */
    private long m28771b(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int m28773c = m28773c(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.f55269n[m28773c]);
            if ((this.f55268m[m28773c] & 1) != 0) {
                break;
            }
            m28773c--;
            if (m28773c == -1) {
                m28773c = this.f55264i - 1;
            }
        }
        return j2;
    }

    /* renamed from: a */
    public final synchronized int m28774a(long j2, boolean z) {
        int m28773c = m28773c(this.f55274s);
        int i2 = this.f55274s;
        int i3 = this.f55271p;
        if ((i2 != i3) && j2 >= this.f55269n[m28773c]) {
            if (j2 > this.f55277v && z) {
                return i3 - i2;
            }
            int m28767a = m28767a(m28773c, i3 - i2, j2, true);
            if (m28767a == -1) {
                return 0;
            }
            return m28767a;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m28778a(long j2, boolean z, boolean z2) {
        long j3;
        int i2;
        sy0 sy0Var = this.f55256a;
        synchronized (this) {
            int i3 = this.f55271p;
            if (i3 != 0) {
                long[] jArr = this.f55269n;
                int i4 = this.f55273r;
                if (j2 >= jArr[i4]) {
                    if (z2 && (i2 = this.f55274s) != i3) {
                        i3 = i2 + 1;
                    }
                    int m28767a = m28767a(i4, i3, j2, z);
                    if (m28767a != -1) {
                        j3 = m28768a(m28767a);
                    }
                }
            }
            j3 = -1;
        }
        sy0Var.m28377a(j3);
    }

    /* renamed from: a */
    public final void m28776a() {
        long m28768a;
        sy0 sy0Var = this.f55256a;
        synchronized (this) {
            int i2 = this.f55271p;
            m28768a = i2 == 0 ? -1L : m28768a(i2);
        }
        sy0Var.m28377a(m28768a);
    }

    /* renamed from: a */
    public final void m28779a(@Nullable InterfaceC5827c interfaceC5827c) {
        this.f55261f = interfaceC5827c;
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final void mo28347a(C5606pv c5606pv) {
        boolean z;
        synchronized (this) {
            z = false;
            this.f55280y = false;
            if (!s91.m28112a(c5606pv, this.f55281z)) {
                if (!this.f55258c.m26022c() && this.f55258c.m26020b().f55285a.equals(c5606pv)) {
                    this.f55281z = this.f55258c.m26020b().f55285a;
                } else {
                    this.f55281z = c5606pv;
                }
                C5606pv c5606pv2 = this.f55281z;
                this.f55254A = he0.m25140a(c5606pv2.f53820l, c5606pv2.f53817i);
                this.f55255B = false;
                z = true;
            }
        }
        InterfaceC5827c interfaceC5827c = this.f55261f;
        if (interfaceC5827c == null || !z) {
            return;
        }
        ((us0) interfaceC5827c).m29127k();
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final int mo28344a(InterfaceC4815am interfaceC4815am, int i2, boolean z) throws IOException {
        return this.f55256a.m28374a(interfaceC4815am, i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final void mo28346a(long j2, int i2, int i3, int i4, @Nullable y61.C6060a c6060a) {
        InterfaceC4720g.b bVar;
        int i5 = i2 & 1;
        int i6 = 0;
        boolean z = i5 != 0;
        if (this.f55279x) {
            if (!z) {
                return;
            } else {
                this.f55279x = false;
            }
        }
        long j3 = j2 + 0;
        if (this.f55254A) {
            if (j3 < this.f55275t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f55255B) {
                    StringBuilder m26356a = l60.m26356a("Overriding unexpected non-sync sample for format: ");
                    m26356a.append(this.f55281z);
                    d90.m23842d("SampleQueue", m26356a.toString());
                    this.f55255B = true;
                }
                i2 |= 1;
            }
        }
        long m28375a = (this.f55256a.m28375a() - i3) - i4;
        synchronized (this) {
            int i7 = this.f55271p;
            if (i7 > 0) {
                int m28773c = m28773c(i7 - 1);
                C5220ia.m25473a(this.f55266k[m28773c] + ((long) this.f55267l[m28773c]) <= m28375a);
            }
            this.f55278w = (536870912 & i2) != 0;
            this.f55277v = Math.max(this.f55277v, j3);
            int m28773c2 = m28773c(this.f55271p);
            this.f55269n[m28773c2] = j3;
            this.f55266k[m28773c2] = m28375a;
            this.f55267l[m28773c2] = i3;
            this.f55268m[m28773c2] = i2;
            this.f55270o[m28773c2] = c6060a;
            this.f55265j[m28773c2] = 0;
            if (this.f55258c.m26022c() || !this.f55258c.m26020b().f55285a.equals(this.f55281z)) {
                InterfaceC4720g interfaceC4720g = this.f55259d;
                if (interfaceC4720g != null) {
                    bVar = interfaceC4720g.mo22139b(this.f55260e, this.f55281z);
                } else {
                    bVar = InterfaceC4720g.b.f48026a;
                }
                k31<C5826b> k31Var = this.f55258c;
                int m28787e = m28787e();
                C5606pv c5606pv = this.f55281z;
                Objects.requireNonNull(c5606pv);
                k31Var.m26019a(m28787e, new C5826b(c5606pv, bVar, i6));
            }
            int i8 = this.f55271p + 1;
            this.f55271p = i8;
            int i9 = this.f55264i;
            if (i8 == i9) {
                int i10 = i9 + 1000;
                int[] iArr = new int[i10];
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                y61.C6060a[] c6060aArr = new y61.C6060a[i10];
                int i11 = this.f55273r;
                int i12 = i9 - i11;
                System.arraycopy(this.f55266k, i11, jArr, 0, i12);
                System.arraycopy(this.f55269n, this.f55273r, jArr2, 0, i12);
                System.arraycopy(this.f55268m, this.f55273r, iArr2, 0, i12);
                System.arraycopy(this.f55267l, this.f55273r, iArr3, 0, i12);
                System.arraycopy(this.f55270o, this.f55273r, c6060aArr, 0, i12);
                System.arraycopy(this.f55265j, this.f55273r, iArr, 0, i12);
                int i13 = this.f55273r;
                System.arraycopy(this.f55266k, 0, jArr, i12, i13);
                System.arraycopy(this.f55269n, 0, jArr2, i12, i13);
                System.arraycopy(this.f55268m, 0, iArr2, i12, i13);
                System.arraycopy(this.f55267l, 0, iArr3, i12, i13);
                System.arraycopy(this.f55270o, 0, c6060aArr, i12, i13);
                System.arraycopy(this.f55265j, 0, iArr, i12, i13);
                this.f55266k = jArr;
                this.f55269n = jArr2;
                this.f55268m = iArr2;
                this.f55267l = iArr3;
                this.f55270o = c6060aArr;
                this.f55265j = iArr;
                this.f55273r = 0;
                this.f55264i = i10;
            }
        }
    }

    @CallSuper
    /* renamed from: a */
    public final synchronized boolean m28780a(boolean z) {
        C5606pv c5606pv;
        boolean z2 = false;
        if (!(this.f55274s != this.f55271p)) {
            if (z || this.f55278w || ((c5606pv = this.f55281z) != null && c5606pv != this.f55262g)) {
                z2 = true;
            }
            return z2;
        }
        if (this.f55258c.m26021b(m28784c()).f55285a != this.f55262g) {
            return true;
        }
        int m28773c = m28773c(this.f55274s);
        InterfaceC4718e interfaceC4718e = this.f55263h;
        if (interfaceC4718e == null || interfaceC4718e.mo22111c() == 4 || ((this.f55268m[m28773c] & 1073741824) == 0 && this.f55263h.mo22112d())) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    private void m28769a(C5606pv c5606pv, C5658qv c5658qv) {
        C5606pv c5606pv2 = this.f55262g;
        boolean z = c5606pv2 == null;
        DrmInitData drmInitData = z ? null : c5606pv2.f53823o;
        this.f55262g = c5606pv;
        DrmInitData drmInitData2 = c5606pv.f53823o;
        InterfaceC4720g interfaceC4720g = this.f55259d;
        c5658qv.f54140b = interfaceC4720g != null ? c5606pv.m27508a().m27556d(interfaceC4720g.mo22135a(c5606pv)).m27550a() : c5606pv;
        c5658qv.f54139a = this.f55263h;
        if (this.f55259d == null) {
            return;
        }
        if (z || !s91.m28112a(drmInitData, drmInitData2)) {
            InterfaceC4718e interfaceC4718e = this.f55263h;
            InterfaceC4718e mo22136a = this.f55259d.mo22136a(this.f55260e, c5606pv);
            this.f55263h = mo22136a;
            c5658qv.f54139a = mo22136a;
            if (interfaceC4718e != null) {
                interfaceC4718e.mo22106a(this.f55260e);
            }
        }
    }

    /* renamed from: a */
    private int m28767a(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.f55269n[i2];
            if (j3 > j2) {
                break;
            }
            if (!z || (this.f55268m[i2] & 1) != 0) {
                i4 = i5;
                if (j3 == j2) {
                    break;
                }
            }
            i2++;
            if (i2 == this.f55264i) {
                i2 = 0;
            }
        }
        return i4;
    }

    @GuardedBy
    /* renamed from: a */
    private long m28768a(int i2) {
        this.f55276u = Math.max(this.f55276u, m28771b(i2));
        this.f55271p -= i2;
        int i3 = this.f55272q + i2;
        this.f55272q = i3;
        int i4 = this.f55273r + i2;
        this.f55273r = i4;
        int i5 = this.f55264i;
        if (i4 >= i5) {
            this.f55273r = i4 - i5;
        }
        int i6 = this.f55274s - i2;
        this.f55274s = i6;
        if (i6 < 0) {
            this.f55274s = 0;
        }
        this.f55258c.m26018a(i3);
        if (this.f55271p == 0) {
            int i7 = this.f55273r;
            if (i7 == 0) {
                i7 = this.f55264i;
            }
            return this.f55266k[i7 - 1] + this.f55267l[r6];
        }
        return this.f55266k[this.f55273r];
    }
}
