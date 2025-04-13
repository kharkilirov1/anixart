package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e01;

/* renamed from: com.yandex.mobile.ads.impl.ao */
/* loaded from: classes3.dex */
final class C4817ao implements kn0 {

    /* renamed from: a */
    private final jn0 f48608a;

    /* renamed from: b */
    private final long f48609b;

    /* renamed from: c */
    private final long f48610c;

    /* renamed from: d */
    private final h41 f48611d;

    /* renamed from: e */
    private int f48612e;

    /* renamed from: f */
    private long f48613f;

    /* renamed from: g */
    private long f48614g;

    /* renamed from: h */
    private long f48615h;

    /* renamed from: i */
    private long f48616i;

    /* renamed from: j */
    private long f48617j;

    /* renamed from: k */
    private long f48618k;

    /* renamed from: l */
    private long f48619l;

    /* renamed from: com.yandex.mobile.ads.impl.ao$a */
    public final class a implements e01 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final e01.C4997a mo22565b(long j2) {
            long m25056b = C4817ao.this.f48611d.m25056b(j2);
            long j3 = ((((C4817ao.this.f48610c - C4817ao.this.f48609b) * m25056b) / C4817ao.this.f48613f) + C4817ao.this.f48609b) - 30000;
            long j4 = C4817ao.this.f48609b;
            long j5 = C4817ao.this.f48610c - 1;
            int i2 = s91.f54530a;
            g01 g01Var = new g01(j2, Math.max(j4, Math.min(j3, j5)));
            return new e01.C4997a(g01Var, g01Var);
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final boolean mo22566b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: c */
        public final long mo22567c() {
            return C4817ao.this.f48611d.m25053a(C4817ao.this.f48613f);
        }

        public /* synthetic */ a(C4817ao c4817ao, int i2) {
            this();
        }
    }

    public C4817ao(h41 h41Var, long j2, long j3, long j4, long j5, boolean z) {
        C5220ia.m25473a(j2 >= 0 && j3 > j2);
        this.f48611d = h41Var;
        this.f48609b = j2;
        this.f48610c = j3;
        if (j4 == j3 - j2 || z) {
            this.f48613f = j5;
            this.f48612e = 4;
        } else {
            this.f48612e = 0;
        }
        this.f48608a = new jn0();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    @Override // com.yandex.mobile.ads.impl.kn0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo22562a(com.yandex.mobile.ads.impl.C5598pn r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4817ao.mo22562a(com.yandex.mobile.ads.impl.pn):long");
    }

    @Override // com.yandex.mobile.ads.impl.kn0
    @Nullable
    /* renamed from: a */
    public final e01 mo22563a() {
        if (this.f48613f != 0) {
            return new a(this, 0);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.kn0
    /* renamed from: a */
    public final void mo22564a(long j2) {
        long j3 = this.f48613f - 1;
        int i2 = s91.f54530a;
        this.f48615h = Math.max(0L, Math.min(j2, j3));
        this.f48612e = 2;
        this.f48616i = this.f48609b;
        this.f48617j = this.f48610c;
        this.f48618k = 0L;
        this.f48619l = this.f48613f;
    }
}
