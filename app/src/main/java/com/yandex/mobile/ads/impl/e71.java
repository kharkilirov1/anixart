package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.w90;

/* loaded from: classes3.dex */
public final class e71 {

    /* renamed from: a */
    public final int f49830a;

    /* renamed from: b */
    public final ev0[] f49831b;

    /* renamed from: c */
    public final InterfaceC5939vs[] f49832c;

    /* renamed from: d */
    public final t71 f49833d;

    /* renamed from: e */
    @Nullable
    public final Object f49834e;

    public e71(ev0[] ev0VarArr, InterfaceC5939vs[] interfaceC5939vsArr, t71 t71Var, @Nullable w90.C5964a c5964a) {
        this.f49831b = ev0VarArr;
        this.f49832c = (InterfaceC5939vs[]) interfaceC5939vsArr.clone();
        this.f49833d = t71Var;
        this.f49834e = c5964a;
        this.f49830a = ev0VarArr.length;
    }

    /* renamed from: a */
    public final boolean m24039a(int i2) {
        return this.f49831b[i2] != null;
    }
}
