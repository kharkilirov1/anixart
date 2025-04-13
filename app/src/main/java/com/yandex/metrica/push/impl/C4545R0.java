package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.push.impl.R0 */
/* loaded from: classes2.dex */
public class C4545R0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4544Q0 f47308a;

    public C4545R0(@NonNull Context context) {
        if (C4530J0.m21449a("okhttp3.OkHttpClient")) {
            this.f47308a = new C4547S0(context);
        } else {
            this.f47308a = new C4549T0();
        }
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC4544Q0 m21472a() {
        return this.f47308a;
    }
}
