package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.i3 */
/* loaded from: classes3.dex */
public final class C5211i3 {

    /* renamed from: a */
    @NonNull
    private final C5160h3 f51192a = C5160h3.m25034b();

    /* renamed from: b */
    @NonNull
    private final InterfaceC5102g3 f51193b;

    public C5211i3(@NonNull InterfaceC5102g3 interfaceC5102g3) {
        this.f51193b = interfaceC5102g3;
    }

    /* renamed from: a */
    public final void m25430a() {
        String mo22662a = this.f51193b.mo22662a();
        if (TextUtils.isEmpty(mo22662a)) {
            return;
        }
        this.f51192a.m25036a(mo22662a);
    }

    /* renamed from: b */
    public final void m25431b() {
        String mo22662a = this.f51193b.mo22662a();
        if (TextUtils.isEmpty(mo22662a)) {
            return;
        }
        this.f51192a.m25037b(mo22662a);
    }
}
