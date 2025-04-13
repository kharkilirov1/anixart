package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class po0 {

    /* renamed from: a */
    @NonNull
    private final Context f53602a;

    /* renamed from: b */
    @NonNull
    private final AdResponse<String> f53603b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5896v0 f53604c;

    public po0(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C4788a1 c4788a1) {
        this.f53602a = context.getApplicationContext();
        this.f53603b = adResponse;
        this.f53604c = c4788a1;
    }

    /* renamed from: a */
    public final void m27358a() {
        if (this.f53603b.m21810K()) {
            return;
        }
        new C5990wu(this.f53602a, this.f53603b.m21805F(), this.f53604c).m29566a();
    }
}
