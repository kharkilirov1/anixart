package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Pa */
/* loaded from: classes2.dex */
class C3542Pa implements InterfaceC4438y8 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4438y8 f43623a;

    public C3542Pa(@NonNull Context context, @NonNull EnumC3240D8 enumC3240D8, @NonNull InterfaceC4438y8 interfaceC4438y8) {
        this.f43623a = interfaceC4438y8;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: a */
    public void mo18664a(@NonNull String str, @NonNull byte[] bArr) {
        this.f43623a.mo18664a(str, bArr);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: b */
    public void mo18666b(@NonNull String str) {
        this.f43623a.mo18666b(str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: a */
    public byte[] mo18665a(@NonNull String str) {
        return this.f43623a.mo18665a(str);
    }
}
