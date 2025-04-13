package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.g81;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.g */
/* loaded from: classes3.dex */
public final class C5098g implements InterfaceC5412lt {

    /* renamed from: a */
    private final C5155h f50463a = new C5155h();

    /* renamed from: b */
    private final ap0 f50464b = new ap0(2786);

    /* renamed from: c */
    private boolean f50465c;

    static {
        dn1 dn1Var = dn1.f49713x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m24760a() {
        return new InterfaceC5412lt[]{new C5098g()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r5.mo26765c();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if ((r1 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        return false;
     */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo22432a(com.yandex.mobile.ads.impl.InterfaceC5458mt r8) throws java.io.IOException {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.ap0 r0 = new com.yandex.mobile.ads.impl.ap0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.m22587c()
            r5 = r8
            com.yandex.mobile.ads.impl.pn r5 = (com.yandex.mobile.ads.impl.C5598pn) r5
            r5.mo26764b(r4, r2, r1, r2)
            r0.m22591e(r2)
            int r4 = r0.m22610w()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L62
            r5.mo26765c()
            r5.m27349a(r2, r3)
            r1 = r3
        L26:
            r8 = 0
        L27:
            byte[] r4 = r0.m22587c()
            r6 = 6
            r5.mo26764b(r4, r2, r6, r2)
            r0.m22591e(r2)
            int r4 = r0.m22613z()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r4 == r6) goto L4a
            r5.mo26765c()
            int r1 = r1 + 1
            int r8 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r8 < r4) goto L46
            return r2
        L46:
            r5.m27349a(r2, r1)
            goto L26
        L4a:
            r4 = 1
            int r8 = r8 + r4
            r6 = 4
            if (r8 < r6) goto L50
            return r4
        L50:
            byte[] r4 = r0.m22587c()
            int r4 = com.yandex.mobile.ads.impl.C5206i.m25406a(r4)
            r6 = -1
            if (r4 != r6) goto L5c
            return r2
        L5c:
            int r4 = r4 + (-6)
            r5.m27349a(r2, r4)
            goto L27
        L62:
            r4 = 3
            r0.m22593f(r4)
            int r4 = r0.m22606s()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.m27349a(r2, r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5098g.mo22432a(com.yandex.mobile.ads.impl.mt):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f50463a.mo22655a(interfaceC5509nt, new g81.C5112d(Integer.MIN_VALUE, 0, 1));
        interfaceC5509nt.mo23023a();
        interfaceC5509nt.mo23024a(new e01.C4998b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f50465c = false;
        this.f50463a.mo22652a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        int read = ((C5598pn) interfaceC5458mt).read(this.f50464b.m22587c(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f50464b.m22591e(0);
        this.f50464b.m22589d(read);
        if (!this.f50465c) {
            this.f50463a.mo22653a(4, 0L);
            this.f50465c = true;
        }
        this.f50463a.mo22654a(this.f50464b);
        return 0;
    }
}
