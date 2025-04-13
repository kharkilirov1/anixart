package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Hi */
/* loaded from: classes2.dex */
public enum EnumC3350Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);


    /* renamed from: a */
    private int f43063a;

    EnumC3350Hi(int i2) {
        this.f43063a = i2;
    }

    /* renamed from: a */
    public Bundle m18234a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f43063a);
        return bundle;
    }
}
