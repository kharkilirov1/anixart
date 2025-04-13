package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Y */
/* loaded from: classes2.dex */
public class C3755Y {

    /* renamed from: i */
    @SuppressLint
    private static volatile C3755Y f44529i;

    /* renamed from: a */
    @NonNull
    private final C3254Dm f44530a;

    /* renamed from: b */
    @NonNull
    private final C4326u0 f44531b;

    /* renamed from: c */
    @NonNull
    private final C4245qn f44532c;

    /* renamed from: d */
    @NonNull
    private final C3433L1 f44533d;

    /* renamed from: e */
    @NonNull
    private final C4429y f44534e;

    /* renamed from: f */
    @NonNull
    private final C3359I2 f44535f;

    /* renamed from: g */
    @NonNull
    private final C4014i0 f44536g;

    /* renamed from: h */
    @NonNull
    private final C4403x f44537h;

    private C3755Y() {
        this(new C3254Dm(), new C4429y(), new C4245qn());
    }

    /* renamed from: g */
    public static C3755Y m19410g() {
        if (f44529i == null) {
            synchronized (C3755Y.class) {
                if (f44529i == null) {
                    f44529i = new C3755Y(new C3254Dm(), new C4429y(), new C4245qn());
                }
            }
        }
        return f44529i;
    }

    @NonNull
    /* renamed from: a */
    public C4403x m19411a() {
        return this.f44537h;
    }

    @NonNull
    /* renamed from: b */
    public C4429y m19412b() {
        return this.f44534e;
    }

    @NonNull
    /* renamed from: c */
    public InterfaceExecutorC4297sn m19413c() {
        return this.f44532c.m20606a();
    }

    @NonNull
    /* renamed from: d */
    public C4245qn m19414d() {
        return this.f44532c;
    }

    @NonNull
    /* renamed from: e */
    public C4014i0 m19415e() {
        return this.f44536g;
    }

    @NonNull
    /* renamed from: f */
    public C4326u0 m19416f() {
        return this.f44531b;
    }

    @NonNull
    /* renamed from: h */
    public C3254Dm m19417h() {
        return this.f44530a;
    }

    @NonNull
    /* renamed from: i */
    public C3433L1 m19418i() {
        return this.f44533d;
    }

    @NonNull
    /* renamed from: j */
    public InterfaceC3354Hm m19419j() {
        return this.f44530a;
    }

    @NonNull
    /* renamed from: k */
    public C3359I2 m19420k() {
        return this.f44535f;
    }

    private C3755Y(@NonNull C3254Dm c3254Dm, @NonNull C4429y c4429y, @NonNull C4245qn c4245qn) {
        this(c3254Dm, c4429y, c4245qn, new C4403x(c4429y, c4245qn.m20606a()));
    }

    private C3755Y(@NonNull C3254Dm c3254Dm, @NonNull C4429y c4429y, @NonNull C4245qn c4245qn, @NonNull C4403x c4403x) {
        this(c3254Dm, new C4326u0(), c4245qn, c4403x, new C3433L1(c3254Dm), c4429y, new C3359I2(c4429y, c4245qn.m20606a(), c4403x), new C4014i0(c4429y));
    }

    @VisibleForTesting
    public C3755Y(@NonNull C3254Dm c3254Dm, @NonNull C4326u0 c4326u0, @NonNull C4245qn c4245qn, @NonNull C4403x c4403x, @NonNull C3433L1 c3433l1, @NonNull C4429y c4429y, @NonNull C3359I2 c3359i2, @NonNull C4014i0 c4014i0) {
        this.f44530a = c3254Dm;
        this.f44531b = c4326u0;
        this.f44532c = c4245qn;
        this.f44537h = c4403x;
        this.f44533d = c3433l1;
        this.f44534e = c4429y;
        this.f44535f = c3359i2;
        this.f44536g = c4014i0;
    }
}
