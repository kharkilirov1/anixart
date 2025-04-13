package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.g81;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.j */
/* loaded from: classes3.dex */
public final class C5258j implements InterfaceC5412lt {

    /* renamed from: a */
    private final C5311k f51470a = new C5311k();

    /* renamed from: b */
    private final ap0 f51471b = new ap0(16384);

    /* renamed from: c */
    private boolean f51472c;

    static {
        dn1 dn1Var = dn1.f49691F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m25750a() {
        return new InterfaceC5412lt[]{new C5258j()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r5.mo26765c();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return false;
     */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo22432a(com.yandex.mobile.ads.impl.InterfaceC5458mt r15) throws java.io.IOException {
        /*
            r14 = this;
            com.yandex.mobile.ads.impl.ap0 r0 = new com.yandex.mobile.ads.impl.ap0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.m22587c()
            r5 = r15
            com.yandex.mobile.ads.impl.pn r5 = (com.yandex.mobile.ads.impl.C5598pn) r5
            r5.mo26764b(r4, r2, r1, r2)
            r0.m22591e(r2)
            int r4 = r0.m22610w()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L97
            r5.mo26765c()
            r5.m27349a(r2, r3)
            r1 = r3
        L27:
            r15 = 0
        L28:
            byte[] r4 = r0.m22587c()
            r6 = 7
            r5.mo26764b(r4, r2, r6, r2)
            r0.m22591e(r2)
            int r4 = r0.m22613z()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L51
            if (r4 == r9) goto L51
            r5.mo26765c()
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r15 < r4) goto L4d
            return r2
        L4d:
            r5.m27349a(r2, r1)
            goto L27
        L51:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L57
            return r8
        L57:
            byte[] r8 = r0.m22587c()
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L61
            r11 = -1
            goto L8e
        L61:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L88
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L89
        L88:
            r6 = 4
        L89:
            if (r4 != r9) goto L8d
            int r6 = r6 + 2
        L8d:
            int r11 = r11 + r6
        L8e:
            if (r11 != r12) goto L91
            return r2
        L91:
            int r11 = r11 + (-7)
            r5.m27349a(r2, r11)
            goto L28
        L97:
            r0.m22593f(r7)
            int r4 = r0.m22606s()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.m27349a(r2, r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5258j.mo22432a(com.yandex.mobile.ads.impl.mt):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f51470a.mo22655a(interfaceC5509nt, new g81.C5112d(Integer.MIN_VALUE, 0, 1));
        interfaceC5509nt.mo23023a();
        interfaceC5509nt.mo23024a(new e01.C4998b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f51472c = false;
        this.f51470a.mo22652a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        int read = ((C5598pn) interfaceC5458mt).read(this.f51471b.m22587c(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f51471b.m22591e(0);
        this.f51471b.m22589d(read);
        if (!this.f51472c) {
            this.f51470a.mo22653a(4, 0L);
            this.f51472c = true;
        }
        this.f51470a.mo22654a(this.f51471b);
        return 0;
    }
}
