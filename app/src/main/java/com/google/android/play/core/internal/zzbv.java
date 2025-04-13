package com.google.android.play.core.internal;

import java.lang.reflect.Field;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class zzbv<T> {

    /* renamed from: a */
    public final Object f20134a;

    /* renamed from: b */
    public final Field f20135b;

    /* renamed from: c */
    public final Class<T> f20136c;

    public zzbv(Object obj, Field field, Class<T> cls) {
        this.f20134a = obj;
        this.f20135b = field;
        this.f20136c = cls;
    }

    /* renamed from: a */
    public final T m10865a() {
        try {
            return this.f20136c.cast(this.f20135b.get(this.f20134a));
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", this.f20135b.getName(), this.f20134a.getClass().getName(), this.f20136c.getName()), e2);
        }
    }

    /* renamed from: b */
    public final void m10866b(T t) {
        try {
            this.f20135b.set(this.f20134a, t);
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to set value of field %s of type %s on object of type %s", this.f20135b.getName(), this.f20134a.getClass().getName(), this.f20136c.getName()), e2);
        }
    }
}
