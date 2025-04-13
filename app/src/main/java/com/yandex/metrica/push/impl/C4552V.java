package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.V */
/* loaded from: classes2.dex */
public class C4552V implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4562a f47316a;

    public C4552V(@NonNull C4562a c4562a) {
        this.f47316a = c4562a;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        Integer m21562c = m21655a == null ? null : m21655a.m21562c();
        int intValue = m21562c != null ? m21562c.intValue() : 3;
        if ((intValue & 1) != 0 && (intValue & 2) != 0) {
            return InterfaceC4508d.a.m21413a();
        }
        this.f47316a.m21497c();
        return InterfaceC4508d.a.m21414a("Not found passport uid provider", null);
    }
}
