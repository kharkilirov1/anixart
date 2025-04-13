package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.vs */
/* loaded from: classes3.dex */
public interface InterfaceC5939vs extends a71 {

    /* renamed from: com.yandex.mobile.ads.impl.vs$a */
    public static final class a {

        /* renamed from: a */
        public final w61 f55873a;

        /* renamed from: b */
        public final int[] f55874b;

        /* renamed from: c */
        public final int f55875c;

        public a() {
            throw null;
        }

        public a(int i2, w61 w61Var, int[] iArr) {
            if (iArr.length == 0) {
                d90.m23838a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f55873a = w61Var;
            this.f55874b = iArr;
            this.f55875c = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vs$b */
    public interface b {
    }

    /* renamed from: a */
    void mo24846a(float f2);

    /* renamed from: a */
    void mo24847a(boolean z);

    /* renamed from: b */
    void mo24848b();

    /* renamed from: c */
    void mo24849c();

    /* renamed from: d */
    C5606pv mo24850d();

    /* renamed from: e */
    void mo29261e();

    /* renamed from: f */
    void mo24851f();

    /* renamed from: g */
    void mo24852g();
}
