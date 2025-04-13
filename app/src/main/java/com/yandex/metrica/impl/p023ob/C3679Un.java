package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Un */
/* loaded from: classes2.dex */
public class C3679Un extends AbstractC3604Rn {
    public C3679Un(int i2) {
        super(i2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3604Rn
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3580Qn<String, InterfaceC3305Fn> mo19058a(@Nullable String str) {
        int i2 = 0;
        if (str != null && str.length() > m19057a()) {
            String substring = str.substring(0, m19057a());
            int length = C3509O2.m18658c(str).length;
            int length2 = C3509O2.m18658c(substring).length;
            i2 = str.getBytes().length - substring.getBytes().length;
            str = substring;
        }
        return new C3580Qn<>(str, new C3280En(i2));
    }
}
