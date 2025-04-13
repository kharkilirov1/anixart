package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C6073ye;
import java.util.Objects;

/* loaded from: classes3.dex */
final class jv0 implements C6073ye.b {

    /* renamed from: a */
    public final /* synthetic */ sl0 f51768a;

    /* renamed from: b */
    public final /* synthetic */ lv0 f51769b;

    /* renamed from: c */
    public final /* synthetic */ kv0 f51770c;

    public jv0(kv0 kv0Var, sl0 sl0Var, lv0 lv0Var) {
        this.f51770c = kv0Var;
        this.f51768a = sl0Var;
        this.f51769b = lv0Var;
    }

    @Override // com.yandex.mobile.ads.impl.C6073ye.b
    /* renamed from: a */
    public final void mo25989a(@NonNull Bitmap bitmap) {
        iv0 iv0Var;
        iv0Var = this.f51770c.f52176d;
        sl0 sl0Var = this.f51768a;
        lv0 lv0Var = this.f51769b;
        Objects.requireNonNull(iv0Var);
        iv0.m25737a(sl0Var, lv0Var, bitmap);
    }
}
