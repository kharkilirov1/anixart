package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;

/* renamed from: com.yandex.metrica.impl.ob.Dm */
/* loaded from: classes2.dex */
public class C3254Dm implements InterfaceC3354Hm {

    /* renamed from: a */
    private volatile String f42748a;

    /* renamed from: b */
    public String m17984b() {
        if (this.f42748a != null) {
            return this.f42748a;
        }
        synchronized (this) {
            if (this.f42748a == null) {
                this.f42748a = m17982a();
            }
        }
        return this.f42748a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    /* renamed from: a */
    public String m17982a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
