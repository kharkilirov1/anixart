package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.vn */
/* loaded from: classes3.dex */
public final class C5931vn implements h80 {

    /* renamed from: a */
    private final C4877bn f55843a;

    /* renamed from: b */
    private final long f55844b;

    /* renamed from: c */
    private final long f55845c;

    /* renamed from: d */
    private final long f55846d;

    /* renamed from: e */
    private final long f55847e;

    /* renamed from: f */
    private final int f55848f;

    /* renamed from: g */
    private final boolean f55849g;

    /* renamed from: h */
    private final long f55850h;

    /* renamed from: i */
    private final boolean f55851i;

    /* renamed from: j */
    private int f55852j;

    /* renamed from: k */
    private boolean f55853k;

    public C5931vn() {
        this(new C4877bn());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: a */
    public final void mo25075a(cv0[] cv0VarArr, InterfaceC5939vs[] interfaceC5939vsArr) {
        int i2 = this.f55848f;
        if (i2 == -1) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < cv0VarArr.length) {
                    if (interfaceC5939vsArr[i3] != null) {
                        switch (cv0VarArr[i3].mo23533m()) {
                            case -2:
                                i5 = 0;
                                i4 += i5;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i5 = 144310272;
                                i4 += i5;
                                break;
                            case 1:
                                i4 += i5;
                                break;
                            case 2:
                                i5 = 131072000;
                                i4 += i5;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i5 = 131072;
                                i4 += i5;
                                break;
                        }
                    }
                    i3++;
                } else {
                    i2 = Math.max(13107200, i4);
                }
            }
        }
        this.f55852j = i2;
        this.f55843a.m22869a(i2);
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: b */
    public final void mo25079b() {
        int i2 = this.f55848f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f55852j = i2;
        this.f55853k = false;
        this.f55843a.m22874d();
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: c */
    public final C4877bn mo25080c() {
        return this.f55843a;
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: d */
    public final void mo25081d() {
        int i2 = this.f55848f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f55852j = i2;
        this.f55853k = false;
        this.f55843a.m22874d();
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: e */
    public final long mo25082e() {
        return this.f55850h;
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: f */
    public final void mo25083f() {
        int i2 = this.f55848f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f55852j = i2;
        this.f55853k = false;
    }

    public C5931vn(C4877bn c4877bn) {
        m29242a(2500, 0, "bufferForPlaybackMs", "0");
        m29242a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m29242a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m29242a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m29242a(50000, 50000, "maxBufferMs", "minBufferMs");
        m29242a(0, 0, "backBufferDurationMs", "0");
        this.f55843a = c4877bn;
        long j2 = 50000;
        this.f55844b = s91.m28096a(j2);
        this.f55845c = s91.m28096a(j2);
        this.f55846d = s91.m28096a(2500);
        this.f55847e = s91.m28096a(5000);
        this.f55848f = -1;
        this.f55852j = 13107200;
        this.f55849g = false;
        this.f55850h = s91.m28096a(0);
        this.f55851i = false;
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: a */
    public final boolean mo25076a() {
        return this.f55851i;
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: a */
    public final boolean mo25077a(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.f55843a.m22873c() >= this.f55852j;
        long j3 = this.f55844b;
        if (f2 > 1.0f) {
            int i2 = s91.f54530a;
            if (f2 != 1.0f) {
                j3 = Math.round(j3 * f2);
            }
            j3 = Math.min(j3, this.f55845c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.f55849g && z2) {
                z = false;
            }
            this.f55853k = z;
            if (!z && j2 < 500000) {
                d90.m23842d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f55845c || z2) {
            this.f55853k = false;
        }
        return this.f55853k;
    }

    @Override // com.yandex.mobile.ads.impl.h80
    /* renamed from: a */
    public final boolean mo25078a(long j2, float f2, boolean z, long j3) {
        int i2 = s91.f54530a;
        if (f2 != 1.0f) {
            j2 = Math.round(j2 / f2);
        }
        long j4 = z ? this.f55847e : this.f55846d;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        return j4 <= 0 || j2 >= j4 || (!this.f55849g && this.f55843a.m22873c() >= this.f55852j);
    }

    /* renamed from: a */
    private static void m29242a(int i2, int i3, String str, String str2) {
        C5220ia.m25472a(str + " cannot be less than " + str2, i2 >= i3);
    }
}
