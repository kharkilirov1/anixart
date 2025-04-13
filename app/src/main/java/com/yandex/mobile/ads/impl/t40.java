package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class t40 implements mo0 {

    /* renamed from: a */
    @NonNull
    private final y40 f54943a;

    /* renamed from: b */
    @NonNull
    private final Context f54944b;

    /* renamed from: c */
    @NonNull
    private final k91 f54945c = new k91();

    public t40(@NonNull Context context, @NonNull y40 y40Var) {
        this.f54944b = context;
        this.f54943a = y40Var;
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    /* renamed from: a */
    public final void mo23301a(@NonNull String str) {
        if (this.f54945c.m26091a(this.f54944b, str)) {
            this.f54943a.m29861a();
        }
    }
}
