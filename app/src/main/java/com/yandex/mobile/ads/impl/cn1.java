package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.em1;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cn1 implements pm1, em1.InterfaceC5036a {

    /* renamed from: f */
    private static cn1 f49321f;

    /* renamed from: a */
    private float f49322a = 0.0f;

    /* renamed from: b */
    private final zm1 f49323b;

    /* renamed from: c */
    private final dm1 f49324c;

    /* renamed from: d */
    private tm1 f49325d;

    /* renamed from: e */
    private ul1 f49326e;

    public cn1(zm1 zm1Var, dm1 dm1Var) {
        this.f49323b = zm1Var;
        this.f49324c = dm1Var;
    }

    /* renamed from: a */
    public static cn1 m23491a() {
        if (f49321f == null) {
            f49321f = new cn1(new zm1(), new dm1());
        }
        return f49321f;
    }

    /* renamed from: a */
    public final void m23492a(float f2) {
        this.f49322a = f2;
        if (this.f49326e == null) {
            this.f49326e = ul1.m29042a();
        }
        Iterator<tl1> it = this.f49326e.m29046c().iterator();
        while (it.hasNext()) {
            wm1.m29504a(it.next().m28682i().m28896e(), f2);
        }
    }

    /* renamed from: b */
    public final void m23494b() {
        em1.m24209a().m24211a(this);
        em1.m24209a().m24212b();
        Objects.requireNonNull(x71.m29694g());
        x71.m29688a();
        this.f49325d.m28690a();
    }

    /* renamed from: c */
    public final void m23495c() {
        x71.m29694g().m29696b();
        em1.m24209a().m24213c();
        this.f49325d.m28691b();
    }

    /* renamed from: d */
    public final float m23496d() {
        return this.f49322a;
    }

    /* renamed from: a */
    public final void m23493a(Context context) {
        Objects.requireNonNull(this.f49324c);
        sl1 sl1Var = new sl1();
        zm1 zm1Var = this.f49323b;
        Handler handler = new Handler();
        Objects.requireNonNull(zm1Var);
        this.f49325d = new tm1(handler, context, sl1Var, this);
    }
}
