package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.nativeads.C6218k;

/* renamed from: com.yandex.mobile.ads.impl.ym */
/* loaded from: classes3.dex */
public final class C6082ym {

    /* renamed from: a */
    @NonNull
    private final wv0 f56880a;

    /* renamed from: b */
    @NonNull
    private final mo0 f56881b;

    /* renamed from: c */
    @NonNull
    private final C6218k f56882c;

    /* renamed from: d */
    @NonNull
    private final bs0 f56883d = new bs0();

    public C6082ym(@NonNull wv0 wv0Var, @NonNull ck0 ck0Var, @NonNull C6218k c6218k) {
        this.f56880a = wv0Var;
        this.f56881b = ck0Var;
        this.f56882c = c6218k;
    }

    /* renamed from: a */
    public final void m29952a(@NonNull Context context, @NonNull C5927vm c5927vm) {
        if (!this.f56883d.m22930a(context, c5927vm.m29236c())) {
            this.f56881b.mo23301a(c5927vm.m29235b());
        } else {
            ((C6123zh) this.f56880a).m30189a(sv0.EnumC5764b.f54816D);
            this.f56882c.m30570d();
        }
    }
}
