package com.yandex.metrica.impl.p023ob;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.C9 */
/* loaded from: classes2.dex */
public final class C3216C9 {

    /* renamed from: a */
    private final C3365I8 f42668a;

    public C3216C9(@NotNull C3365I8 c3365i8) {
        this.f42668a = c3365i8;
    }

    /* renamed from: a */
    public final int m17928a(int i2) {
        JSONObject m18263f = this.f42668a.m18263f();
        if (m18263f != null) {
            return m18263f.optInt(String.valueOf(i2));
        }
        return 0;
    }

    /* renamed from: a */
    public final void m17929a(int i2, int i3) {
        JSONObject m18263f = this.f42668a.m18263f();
        if (m18263f == null) {
            m18263f = new JSONObject();
        }
        m18263f.put(String.valueOf(i2), i3);
        this.f42668a.m18256b(m18263f);
    }
}
