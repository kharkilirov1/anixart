package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.wd */
/* loaded from: classes2.dex */
public class C4391wd {

    /* renamed from: a */
    @Nullable
    private final LocationManager f46869a;

    /* renamed from: b */
    @NonNull
    private final C3835b3 f46870b;

    /* renamed from: c */
    @NonNull
    private final C4450yk f46871c = C3532P0.m18696i().m18720w();

    public C4391wd(@NonNull Context context) {
        this.f46869a = (LocationManager) context.getSystemService("location");
        this.f46870b = C3835b3.m19636a(context);
    }

    @Nullable
    /* renamed from: a */
    public LocationManager m21095a() {
        return this.f46869a;
    }

    @NonNull
    /* renamed from: b */
    public C4450yk m21096b() {
        return this.f46871c;
    }

    @NonNull
    /* renamed from: c */
    public C3835b3 m21097c() {
        return this.f46870b;
    }
}
