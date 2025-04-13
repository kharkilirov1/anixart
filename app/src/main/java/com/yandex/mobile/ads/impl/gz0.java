package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class gz0 {

    /* renamed from: a */
    @NonNull
    private final Context f50767a;

    /* renamed from: b */
    @NonNull
    private final C5961w7 f50768b;

    /* renamed from: c */
    @NonNull
    private final C5548or f50769c;

    /* renamed from: d */
    @NonNull
    private final lz0 f50770d;

    /* renamed from: e */
    @NonNull
    private final hz0 f50771e = hz0.m25401a();

    /* renamed from: f */
    @NonNull
    private final iw0 f50772f = iw0.m25739a();

    /* renamed from: g */
    @NonNull
    private final jz0 f50773g = new jz0();

    /* renamed from: com.yandex.mobile.ads.impl.gz0$a */
    public interface InterfaceC5154a {
        /* renamed from: a */
        void mo25013a();

        /* renamed from: a */
        void mo25014a(@NonNull qh1 qh1Var);
    }

    public gz0(@NonNull Context context, @NonNull C5961w7 c5961w7, @NonNull C5548or c5548or) {
        this.f50767a = context.getApplicationContext();
        this.f50768b = c5961w7;
        this.f50769c = c5548or;
        this.f50770d = new lz0(context);
    }

    /* renamed from: a */
    public final void m25012a(@NonNull l01 l01Var, @NonNull InterfaceC5154a interfaceC5154a) {
        String str;
        if (!this.f50770d.mo25993a()) {
            interfaceC5154a.mo25013a();
            return;
        }
        mz0 mz0Var = new mz0(this.f50767a, this.f50771e, interfaceC5154a);
        C5507nr m27101a = this.f50769c.m27101a();
        Context context = this.f50767a;
        String m26941a = m27101a.m26941a();
        if (TextUtils.isEmpty(m26941a)) {
            str = null;
        } else {
            str = C0000a.m22s(new StringBuilder(m26941a), m26941a.endsWith("/") ? "" : "/", "v1/startup", "?", this.f50773g.m25999a(context, l01Var, this.f50768b, m27101a));
        }
        if (TextUtils.isEmpty(str)) {
            mz0Var.mo22923a((qh1) new C5372l2(null, 11));
            return;
        }
        kz0 kz0Var = new kz0(this.f50767a, str, this.f50770d, m27101a.m26945c(), mz0Var);
        kz0Var.m30318b(this);
        iw0 iw0Var = this.f50772f;
        Context context2 = this.f50767a;
        synchronized (iw0Var) {
            um0.m29048a(context2).m26292a(kz0Var);
        }
    }

    /* renamed from: a */
    public final void m25011a() {
        iw0 iw0Var = this.f50772f;
        Context context = this.f50767a;
        Objects.requireNonNull(iw0Var);
        iw0.m25740a(context, this);
    }
}
