package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Hh */
/* loaded from: classes2.dex */
public class C3349Hh {

    /* renamed from: a */
    @NonNull
    public final String f43057a;

    /* renamed from: b */
    @NonNull
    public final List<String> f43058b;

    public C3349Hh(@NonNull String str, @NonNull List<String> list) {
        this.f43057a = str;
        this.f43058b = list;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SdkItem{name='");
        C0576a.m4100A(m24u, this.f43057a, '\'', ", classes=");
        return C0576a.m4119r(m24u, this.f43058b, '}');
    }
}
