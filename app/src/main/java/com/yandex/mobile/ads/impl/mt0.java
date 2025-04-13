package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class mt0 implements InterfaceC5412lt {

    /* renamed from: a */
    private final p61 f52796a;

    /* renamed from: b */
    private final SparseArray<C5459a> f52797b;

    /* renamed from: c */
    private final ap0 f52798c;

    /* renamed from: d */
    private final lt0 f52799d;

    /* renamed from: e */
    private boolean f52800e;

    /* renamed from: f */
    private boolean f52801f;

    /* renamed from: g */
    private boolean f52802g;

    /* renamed from: h */
    private long f52803h;

    /* renamed from: i */
    @Nullable
    private kt0 f52804i;

    /* renamed from: j */
    private InterfaceC5509nt f52805j;

    /* renamed from: k */
    private boolean f52806k;

    static {
        jp1 jp1Var = jp1.f51698i;
    }

    public mt0() {
        this(new p61(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m26766a() {
        return new InterfaceC5412lt[]{new mt0()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.mt0$a */
    public static final class C5459a {

        /* renamed from: a */
        private final InterfaceC4936cr f52807a;

        /* renamed from: b */
        private final p61 f52808b;

        /* renamed from: c */
        private final zo0 f52809c = new zo0(new byte[64]);

        /* renamed from: d */
        private boolean f52810d;

        /* renamed from: e */
        private boolean f52811e;

        /* renamed from: f */
        private boolean f52812f;

        /* renamed from: g */
        private long f52813g;

        public C5459a(InterfaceC4936cr interfaceC4936cr, p61 p61Var) {
            this.f52807a = interfaceC4936cr;
            this.f52808b = p61Var;
        }

        /* renamed from: a */
        public final void m26768a() {
            this.f52812f = false;
            this.f52807a.mo22652a();
        }

        /* renamed from: a */
        public final void m26769a(ap0 ap0Var) throws ep0 {
            ap0Var.m22583a(this.f52809c.f57274a, 0, 3);
            this.f52809c.m30255c(0);
            this.f52809c.m30257d(8);
            this.f52810d = this.f52809c.m30260f();
            this.f52811e = this.f52809c.m30260f();
            this.f52809c.m30257d(6);
            ap0Var.m22583a(this.f52809c.f57274a, 0, this.f52809c.m30252b(8));
            this.f52809c.m30255c(0);
            this.f52813g = 0L;
            if (this.f52810d) {
                this.f52809c.m30257d(4);
                this.f52809c.m30257d(1);
                this.f52809c.m30257d(1);
                long m30252b = (this.f52809c.m30252b(3) << 30) | (this.f52809c.m30252b(15) << 15) | this.f52809c.m30252b(15);
                this.f52809c.m30257d(1);
                if (!this.f52812f && this.f52811e) {
                    this.f52809c.m30257d(4);
                    this.f52809c.m30257d(1);
                    this.f52809c.m30257d(1);
                    this.f52809c.m30257d(1);
                    this.f52808b.m27173b((this.f52809c.m30252b(3) << 30) | (this.f52809c.m30252b(15) << 15) | this.f52809c.m30252b(15));
                    this.f52812f = true;
                }
                this.f52813g = this.f52808b.m27173b(m30252b);
            }
            this.f52807a.mo22653a(4, this.f52813g);
            this.f52807a.mo22654a(ap0Var);
            this.f52807a.mo22656b();
        }
    }

    public mt0(p61 p61Var) {
        this.f52796a = p61Var;
        this.f52798c = new ap0(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
        this.f52797b = new SparseArray<>();
        this.f52799d = new lt0();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        byte[] bArr = new byte[14];
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        c5598pn.mo26764b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c5598pn.m27349a(false, bArr[13] & 7);
        c5598pn.mo26764b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f52805j = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        boolean z = true;
        boolean z2 = this.f52796a.m27174c() == -9223372036854775807L;
        if (z2) {
            z = z2;
        } else {
            long m27170a = this.f52796a.m27170a();
            if (m27170a == -9223372036854775807L || m27170a == 0 || m27170a == j3) {
                z = false;
            }
        }
        if (z) {
            this.f52796a.m27175c(j3);
        }
        kt0 kt0Var = this.f52804i;
        if (kt0Var != null) {
            kt0Var.m28213a(j3);
        }
        for (int i2 = 0; i2 < this.f52797b.size(); i2++) {
            this.f52797b.valueAt(i2).m26768a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r17, com.yandex.mobile.ads.impl.qr0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mt0.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }
}
