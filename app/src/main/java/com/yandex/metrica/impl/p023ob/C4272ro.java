package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ValidationException;

/* renamed from: com.yandex.metrica.impl.ob.ro */
/* loaded from: classes2.dex */
public class C4272ro<T> implements InterfaceC4350uo<T> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4350uo<T> f46320a;

    public C4272ro(@NonNull InterfaceC4350uo<T> interfaceC4350uo) {
        this.f46320a = interfaceC4350uo;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable T t) {
        C4298so mo18360a = this.f46320a.mo18360a(t);
        if (mo18360a.m20772b()) {
            return mo18360a;
        }
        throw new ValidationException(mo18360a.m20771a());
    }
}
