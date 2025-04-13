package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.g81;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.b7 */
/* loaded from: classes3.dex */
public final class C4843b7 implements InterfaceC5412lt {

    /* renamed from: d */
    private final ap0 f48774d;

    /* renamed from: e */
    private final zo0 f48775e;

    /* renamed from: f */
    private InterfaceC5509nt f48776f;

    /* renamed from: g */
    private long f48777g;

    /* renamed from: j */
    private boolean f48780j;

    /* renamed from: k */
    private boolean f48781k;

    /* renamed from: l */
    private boolean f48782l;

    /* renamed from: a */
    private final int f48771a = 0;

    /* renamed from: b */
    private final C4906c7 f48772b = new C4906c7();

    /* renamed from: c */
    private final ap0 f48773c = new ap0(RecyclerView.ViewHolder.FLAG_MOVED);

    /* renamed from: i */
    private int f48779i = -1;

    /* renamed from: h */
    private long f48778h = -1;

    static {
        dn1 dn1Var = dn1.f49699j;
    }

    public C4843b7() {
        ap0 ap0Var = new ap0(10);
        this.f48774d = ap0Var;
        this.f48775e = new zo0(ap0Var.m22587c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InterfaceC5412lt[] m22730a() {
        return new InterfaceC5412lt[]{new C4843b7()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        int m22729a = m22729a(c5598pn);
        int i2 = m22729a;
        int i3 = 0;
        int i4 = 0;
        do {
            c5598pn.mo26764b(this.f48774d.m22587c(), 0, 2, false);
            this.f48774d.m22591e(0);
            if ((this.f48774d.m22613z() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                c5598pn.mo26764b(this.f48774d.m22587c(), 0, 4, false);
                this.f48775e.m30255c(14);
                int m30252b = this.f48775e.m30252b(13);
                if (m30252b <= 6) {
                    i2++;
                    c5598pn.mo26765c();
                    c5598pn.m27349a(false, i2);
                } else {
                    c5598pn.m27349a(false, m30252b - 6);
                    i4 += m30252b;
                }
            } else {
                i2++;
                c5598pn.mo26765c();
                c5598pn.m27349a(false, i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - m22729a < 8192);
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f48776f = interfaceC5509nt;
        this.f48772b.mo22655a(interfaceC5509nt, new g81.C5112d(Integer.MIN_VALUE, 0, 1));
        interfaceC5509nt.mo23023a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f48781k = false;
        this.f48772b.mo22652a();
        this.f48777g = j3;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        C5220ia.m25474b(this.f48776f);
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        long mo22717a = c5598pn.mo22717a();
        int i2 = this.f48771a;
        if ((((i2 & 2) == 0 && ((i2 & 1) == 0 || mo22717a == -1)) ? false : true) && !this.f48780j) {
            this.f48779i = -1;
            c5598pn.mo26765c();
            if (c5598pn.getPosition() == 0) {
                m22729a(c5598pn);
            }
            long j2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (!c5598pn.mo26764b(this.f48774d.m22587c(), 0, 2, true)) {
                        break;
                    }
                    this.f48774d.m22591e(0);
                    if (!((this.f48774d.m22613z() & 65526) == 65520)) {
                        i3 = 0;
                        break;
                    }
                    if (!c5598pn.mo26764b(this.f48774d.m22587c(), 0, 4, true)) {
                        break;
                    }
                    this.f48775e.m30255c(14);
                    int m30252b = this.f48775e.m30252b(13);
                    if (m30252b > 6) {
                        j2 += m30252b;
                        i3++;
                        if (i3 != 1000 && c5598pn.m27349a(true, m30252b - 6)) {
                        }
                    } else {
                        this.f48780j = true;
                        throw ep0.m24225a("Malformed ADTS stream", (Exception) null);
                    }
                } catch (EOFException unused) {
                }
            }
            c5598pn.mo26765c();
            if (i3 > 0) {
                this.f48779i = (int) (j2 / i3);
            } else {
                this.f48779i = -1;
            }
            this.f48780j = true;
        }
        int read = c5598pn.read(this.f48773c.m22587c(), 0, RecyclerView.ViewHolder.FLAG_MOVED);
        boolean z = read == -1;
        if (!this.f48782l) {
            boolean z2 = (this.f48771a & 1) != 0 && this.f48779i > 0;
            if (!z2 || this.f48772b.m23034c() != -9223372036854775807L || z) {
                if (z2 && this.f48772b.m23034c() != -9223372036854775807L) {
                    this.f48776f.mo23024a(new C5401lk((int) (((this.f48779i * 8) * 1000000) / this.f48772b.m23034c()), this.f48779i, mo22717a, this.f48778h, (this.f48771a & 2) != 0));
                } else {
                    this.f48776f.mo23024a(new e01.C4998b(-9223372036854775807L, 0L));
                }
                this.f48782l = true;
            }
        }
        if (z) {
            return -1;
        }
        this.f48773c.m22591e(0);
        this.f48773c.m22589d(read);
        if (!this.f48781k) {
            this.f48772b.mo22653a(4, this.f48777g);
            this.f48781k = true;
        }
        this.f48772b.mo22654a(this.f48773c);
        return 0;
    }

    /* renamed from: a */
    private int m22729a(C5598pn c5598pn) throws IOException {
        int i2 = 0;
        while (true) {
            c5598pn.mo26764b(this.f48774d.m22587c(), 0, 10, false);
            this.f48774d.m22591e(0);
            if (this.f48774d.m22610w() != 4801587) {
                break;
            }
            this.f48774d.m22593f(3);
            int m22606s = this.f48774d.m22606s();
            i2 += m22606s + 10;
            c5598pn.m27349a(false, m22606s);
        }
        c5598pn.mo26765c();
        c5598pn.m27349a(false, i2);
        if (this.f48778h == -1) {
            this.f48778h = i2;
        }
        return i2;
    }
}
