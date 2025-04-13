package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.P */
/* loaded from: classes2.dex */
public class C4541P {

    /* renamed from: a */
    @NonNull
    public final InterfaceC4508d.a f47306a;

    /* renamed from: b */
    @NonNull
    public final C4596r f47307b;

    private C4541P(@NonNull InterfaceC4508d.a aVar, @NonNull C4596r c4596r) {
        this.f47306a = aVar;
        this.f47307b = c4596r;
    }

    @NonNull
    /* renamed from: a */
    public static C4541P m21467a(@NonNull C4596r c4596r) {
        return new C4541P(InterfaceC4508d.a.m21413a(), c4596r);
    }

    @NonNull
    /* renamed from: a */
    public static C4541P m21468a(@NonNull C4596r c4596r, @Nullable String str, @Nullable String str2) {
        return new C4541P(InterfaceC4508d.a.m21414a(str, str2), c4596r);
    }

    /* renamed from: a */
    public boolean m21469a() {
        return this.f47306a.f47282a == InterfaceC4508d.b.f47285a;
    }
}
