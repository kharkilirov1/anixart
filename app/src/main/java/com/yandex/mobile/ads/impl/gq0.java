package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.C6152d;
import com.yandex.mobile.ads.instream.C6153e;

/* loaded from: classes3.dex */
final class gq0 {

    /* renamed from: a */
    @NonNull
    private final Context f50702a;

    /* renamed from: b */
    @NonNull
    private final t30 f50703b;

    /* renamed from: c */
    @NonNull
    private final C6153e f50704c;

    /* renamed from: d */
    @NonNull
    private final i40 f50705d;

    /* renamed from: e */
    @NonNull
    private final f40 f50706e;

    /* renamed from: f */
    @NonNull
    private final C6152d f50707f;

    /* renamed from: g */
    @NonNull
    private final C5952w1 f50708g;

    public gq0(@NonNull Context context, @NonNull t30 t30Var, @NonNull C6153e c6153e, @NonNull C6152d c6152d, @NonNull i40 i40Var, @NonNull y30 y30Var) {
        Context applicationContext = context.getApplicationContext();
        this.f50702a = applicationContext;
        this.f50703b = t30Var;
        this.f50704c = c6153e;
        this.f50705d = i40Var;
        this.f50707f = c6152d;
        this.f50706e = new f40(applicationContext, i40Var, c6153e, t30Var);
        this.f50708g = new C5952w1(y30Var);
    }

    @NonNull
    /* renamed from: a */
    public final j11 m24959a(@NonNull m50 m50Var) {
        return new j11(this.f50702a, m50Var, this.f50703b, this.f50706e, this.f50705d, this.f50708g.m29360a());
    }

    @NonNull
    /* renamed from: a */
    public final ge0 m24958a(@NonNull w30 w30Var) {
        return new ge0(this.f50702a, w30Var, this.f50708g.m29360a(), this.f50703b, this.f50706e, this.f50705d, this.f50704c, this.f50707f);
    }
}
