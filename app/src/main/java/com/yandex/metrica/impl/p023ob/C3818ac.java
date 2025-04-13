package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ac */
/* loaded from: classes2.dex */
public class C3818ac {

    /* renamed from: a */
    @NonNull
    public final a f44733a;

    /* renamed from: b */
    @Nullable
    public final String f44734b;

    /* renamed from: c */
    @Nullable
    public final Boolean f44735c;

    /* renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C3818ac(@NonNull a aVar, @Nullable String str, @Nullable Boolean bool) {
        this.f44733a = aVar;
        this.f44734b = str;
        this.f44735c = bool;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdTrackingInfo{provider=");
        m24u.append(this.f44733a);
        m24u.append(", advId='");
        C0576a.m4100A(m24u, this.f44734b, '\'', ", limitedAdTracking=");
        m24u.append(this.f44735c);
        m24u.append('}');
        return m24u.toString();
    }
}
