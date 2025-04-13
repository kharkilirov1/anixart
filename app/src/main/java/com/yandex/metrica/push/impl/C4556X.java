package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.X */
/* loaded from: classes2.dex */
class C4556X implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4562a f47324a;

    public C4556X(@NonNull C4562a c4562a) {
        this.f47324a = c4562a;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        if (TextUtils.isEmpty(m21655a == null ? null : m21655a.m21569j())) {
            return InterfaceC4508d.a.m21413a();
        }
        this.f47324a.m21497c();
        return InterfaceC4508d.a.m21414a("Not found passport uid provider", null);
    }
}
