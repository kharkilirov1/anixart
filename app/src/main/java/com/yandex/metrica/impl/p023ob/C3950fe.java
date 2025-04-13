package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.fe */
/* loaded from: classes2.dex */
public class C3950fe {

    /* renamed from: a */
    @NonNull
    private InterfaceC3898de f45130a;

    public C3950fe(@NonNull InterfaceC3898de interfaceC3898de) {
        this.f45130a = interfaceC3898de;
    }

    /* renamed from: a */
    public void m19899a(@NonNull InterfaceC3898de interfaceC3898de) {
        this.f45130a = interfaceC3898de;
    }

    /* renamed from: b */
    public boolean m19901b(@NonNull Context context) {
        if (this.f45130a.mo19653a("android.permission.READ_PHONE_STATE")) {
            return C3872ce.m19676a(context, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m19902c(@NonNull Context context) {
        if (this.f45130a.mo19653a("android.permission.ACCESS_WIFI_STATE")) {
            return C3872ce.m19676a(context, "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }

    /* renamed from: a */
    public boolean m19900a(@NonNull Context context) {
        if (this.f45130a.mo19653a("android.permission.ACCESS_COARSE_LOCATION")) {
            return C3872ce.m19676a(context, "android.permission.ACCESS_COARSE_LOCATION");
        }
        return false;
    }
}
