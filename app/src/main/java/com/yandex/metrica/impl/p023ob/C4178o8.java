package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.o8 */
/* loaded from: classes2.dex */
public class C4178o8 {

    /* renamed from: a */
    @Nullable
    public final String f46062a;

    /* renamed from: b */
    @Nullable
    public final String f46063b;

    public C4178o8(@Nullable String str, @Nullable String str2) {
        this.f46062a = str;
        this.f46063b = str2;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("RuntimeConfig{errorEnvironment='");
        C0576a.m4100A(m24u, this.f46062a, '\'', ", handlerVersion='");
        m24u.append(this.f46063b);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }
}
