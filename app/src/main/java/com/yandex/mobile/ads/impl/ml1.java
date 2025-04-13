package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.yp0;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;

/* loaded from: classes3.dex */
public final class ml1 implements o71 {

    /* renamed from: a */
    @NonNull
    private final an0 f52705a;

    /* renamed from: b */
    @NonNull
    private final yp0 f52706b;

    /* renamed from: c */
    @NonNull
    private final v20 f52707c;

    /* renamed from: d */
    @NonNull
    private final zu0 f52708d;

    public ml1(@NonNull an0 an0Var, @NonNull zu0 zu0Var, @NonNull v20 v20Var, @NonNull yp0 yp0Var) {
        this.f52705a = an0Var;
        this.f52708d = zu0Var;
        this.f52707c = v20Var;
        this.f52706b = yp0Var;
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26618a(@NonNull Context context, @NonNull yp0.InterfaceC6087a interfaceC6087a, @Nullable C6264w c6264w) {
        this.f52708d.m30303b();
        this.f52705a.mo22553b();
        this.f52706b.m29959a(context, interfaceC6087a);
        if (c6264w != null) {
            this.f52707c.m29176a(context, c6264w);
        }
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26617a(@NonNull Context context, @NonNull yp0.InterfaceC6087a interfaceC6087a) {
        this.f52708d.m30304c();
        this.f52705a.mo22549a();
        this.f52706b.m29960b(context, interfaceC6087a);
        this.f52707c.m29175a();
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26619a(@NonNull AdResponse adResponse, @NonNull List<v01> list) {
        this.f52705a.mo22551a(adResponse, list);
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26622a(@NonNull C6264w c6264w) {
        this.f52707c.m29177a(c6264w);
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26621a(@NonNull l20 l20Var) {
        this.f52705a.mo22552a(l20Var);
    }

    @Override // com.yandex.mobile.ads.impl.o71
    /* renamed from: a */
    public final void mo26620a(@NonNull ek0 ek0Var) {
        this.f52708d.m30302a(ek0Var);
    }
}
