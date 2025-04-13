package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6152d;
import com.yandex.mobile.ads.instream.C6153e;

/* renamed from: com.yandex.mobile.ads.impl.l5 */
/* loaded from: classes3.dex */
public final class C5377l5 {

    /* renamed from: a */
    @NonNull
    private final hq0 f52257a;

    /* renamed from: b */
    @NonNull
    private final sb1 f52258b;

    /* renamed from: c */
    @NonNull
    private final ds0 f52259c;

    /* renamed from: d */
    @Nullable
    private C5318k5 f52260d;

    /* renamed from: e */
    @Nullable
    private C5318k5 f52261e;

    /* renamed from: f */
    @Nullable
    private C5318k5 f52262f;

    public C5377l5(@NonNull Context context, @NonNull l50 l50Var, @NonNull t30 t30Var, @NonNull i40 i40Var, @NonNull C6153e c6153e, @NonNull C6152d c6152d, @NonNull tb1 tb1Var) {
        this.f52258b = tb1Var;
        this.f52259c = new ds0(c6153e);
        this.f52257a = new hq0(context, l50Var, t30Var, i40Var, c6153e, c6152d);
    }

    @NonNull
    /* renamed from: a */
    public final C5318k5 m26352a() {
        if (this.f52261e == null) {
            C5318k5 c5318k5 = new C5318k5(this.f52257a.m25355a());
            c5318k5.m26026a(this.f52258b);
            this.f52261e = c5318k5;
        }
        return this.f52261e;
    }

    @Nullable
    /* renamed from: b */
    public final C5318k5 m26353b() {
        InterfaceC5426m5 m25356b;
        if (this.f52262f == null && (m25356b = this.f52257a.m25356b()) != null) {
            C5318k5 c5318k5 = new C5318k5(m25356b);
            c5318k5.m26026a(this.f52258b);
            this.f52262f = c5318k5;
        }
        return this.f52262f;
    }

    @Nullable
    /* renamed from: c */
    public final C5318k5 m26354c() {
        InterfaceC5426m5 m25357c;
        if (this.f52260d == null && this.f52259c.m23929a() && (m25357c = this.f52257a.m25357c()) != null) {
            C5318k5 c5318k5 = new C5318k5(m25357c);
            c5318k5.m26026a(this.f52258b);
            this.f52260d = c5318k5;
        }
        return this.f52260d;
    }
}
