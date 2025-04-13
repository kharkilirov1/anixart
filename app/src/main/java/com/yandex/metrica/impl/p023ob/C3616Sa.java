package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Sa */
/* loaded from: classes2.dex */
class C3616Sa implements InterfaceC4464z8 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4464z8 f43990a;

    public C3616Sa(@NonNull Context context, @NonNull EnumC3240D8 enumC3240D8, @NonNull InterfaceC4464z8 interfaceC4464z8) {
        this.f43990a = interfaceC4464z8;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public int mo18950a(String str, int i2) {
        return this.f43990a.mo18950a(str, i2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public void mo18961b() {
        this.f43990a.mo18961b();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public long mo18951a(String str, long j2) {
        return this.f43990a.mo18951a(str, j2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    @Nullable
    /* renamed from: b */
    public String mo18960b(String str, String str2) {
        return this.f43990a.mo18960b(str, str2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public InterfaceC4464z8 mo18952a(String str, String str2) {
        this.f43990a.mo18952a(str, str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public boolean mo18962b(String str, boolean z) {
        return this.f43990a.mo18962b(str, z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public InterfaceC4464z8 mo18953a(String str, boolean z) {
        this.f43990a.mo18953a(str, z);
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public InterfaceC4464z8 mo18957b(String str) {
        this.f43990a.mo18957b(str);
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public boolean mo18956a(@NonNull String str) {
        return this.f43990a.mo18956a(str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public InterfaceC4464z8 mo18959b(String str, long j2) {
        this.f43990a.mo18959b(str, j2);
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    @NonNull
    /* renamed from: a */
    public Set<String> mo18954a() {
        return this.f43990a.mo18954a();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public InterfaceC4464z8 mo18958b(String str, int i2) {
        this.f43990a.mo18958b(str, i2);
        return this;
    }
}
