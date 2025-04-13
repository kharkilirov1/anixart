package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.qo */
/* loaded from: classes2.dex */
public class C4246qo<T> implements InterfaceC4350uo<T> {

    /* renamed from: a */
    @NonNull
    private final String f46261a;

    public C4246qo(@NonNull String str) {
        this.f46261a = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable T t) {
        if (t != null) {
            return C4298so.m20769a(this);
        }
        return C4298so.m20770a(this, this.f46261a + " is null.");
    }
}
