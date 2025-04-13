package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class xs0 {

    /* renamed from: a */
    public final C6039a f56556a;

    /* renamed from: b */
    public final C6039a f56557b;

    /* renamed from: c */
    public final int f56558c;

    /* renamed from: d */
    public final boolean f56559d;

    /* renamed from: com.yandex.mobile.ads.impl.xs0$a */
    public static final class C6039a {

        /* renamed from: a */
        private final C6040b[] f56560a;

        public C6039a(C6040b... c6040bArr) {
            this.f56560a = c6040bArr;
        }

        /* renamed from: a */
        public final C6040b m29807a() {
            return this.f56560a[0];
        }

        /* renamed from: b */
        public final int m29808b() {
            return this.f56560a.length;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xs0$b */
    public static final class C6040b {

        /* renamed from: a */
        public final int f56561a;

        /* renamed from: b */
        public final int f56562b;

        /* renamed from: c */
        public final float[] f56563c;

        /* renamed from: d */
        public final float[] f56564d;

        public C6040b(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f56561a = i2;
            C5220ia.m25473a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f56563c = fArr;
            this.f56564d = fArr2;
            this.f56562b = i3;
        }

        /* renamed from: a */
        public final int m29809a() {
            return this.f56563c.length / 3;
        }
    }

    public xs0() {
        throw null;
    }

    public xs0(C6039a c6039a, C6039a c6039a2, int i2) {
        this.f56556a = c6039a;
        this.f56557b = c6039a2;
        this.f56558c = i2;
        this.f56559d = c6039a == c6039a2;
    }
}
