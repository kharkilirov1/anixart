package com.yandex.metrica.push.impl;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.impl.H0 */
/* loaded from: classes2.dex */
public class C4526H0 {

    /* renamed from: a */
    @Nullable
    private String f47292a;

    @Nullable
    /* renamed from: b */
    public String m21438b() {
        String str = this.f47292a;
        if (str != null) {
            return str;
        }
        String m21436a = m21436a();
        this.f47292a = m21436a;
        return m21436a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    @SuppressLint
    /* renamed from: a */
    public String m21436a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
