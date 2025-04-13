package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6152d;
import com.yandex.mobile.ads.instream.C6153e;

/* loaded from: classes3.dex */
public final class hq0 {

    /* renamed from: a */
    @NonNull
    private final y30 f51122a;

    /* renamed from: b */
    @NonNull
    private final gq0 f51123b;

    /* renamed from: c */
    @Nullable
    private j11 f51124c;

    /* renamed from: d */
    @Nullable
    private ge0 f51125d;

    /* renamed from: e */
    @Nullable
    private j11 f51126e;

    public hq0(@NonNull Context context, @NonNull l50 l50Var, @NonNull t30 t30Var, @NonNull i40 i40Var, @NonNull C6153e c6153e, @NonNull C6152d c6152d) {
        y30 y30Var = new y30(l50Var, c6153e);
        this.f51122a = y30Var;
        this.f51123b = new gq0(context, t30Var, c6153e, c6152d, i40Var, y30Var);
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC5426m5 m25355a() {
        if (this.f51125d == null) {
            this.f51125d = this.f51123b.m24958a(this.f51122a.m29859a());
        }
        return this.f51125d;
    }

    @Nullable
    /* renamed from: b */
    public final InterfaceC5426m5 m25356b() {
        m50 m29371b;
        if (this.f51126e == null && (m29371b = this.f51122a.m29859a().m29371b()) != null) {
            this.f51126e = this.f51123b.m24959a(m29371b);
        }
        return this.f51126e;
    }

    @Nullable
    /* renamed from: c */
    public final InterfaceC5426m5 m25357c() {
        m50 m29372c;
        if (this.f51124c == null && (m29372c = this.f51122a.m29859a().m29372c()) != null) {
            this.f51124c = this.f51123b.m24959a(m29372c);
        }
        return this.f51124c;
    }
}
