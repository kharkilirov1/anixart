package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
abstract class zzgy {

    /* renamed from: a */
    public final Unsafe f16178a;

    public zzgy(Unsafe unsafe) {
        this.f16178a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo8493a(Object obj, long j2);

    /* renamed from: b */
    public abstract float mo8494b(Object obj, long j2);

    /* renamed from: c */
    public abstract void mo8495c(Object obj, long j2, boolean z);

    /* renamed from: d */
    public abstract void mo8496d(Object obj, long j2, double d);

    /* renamed from: e */
    public abstract void mo8497e(Object obj, long j2, float f2);

    /* renamed from: f */
    public abstract boolean mo8498f(Object obj, long j2);

    /* renamed from: g */
    public final int m8499g(Class<?> cls) {
        return this.f16178a.arrayBaseOffset(cls);
    }

    /* renamed from: h */
    public final int m8500h(Class<?> cls) {
        return this.f16178a.arrayIndexScale(cls);
    }

    /* renamed from: i */
    public final int m8501i(Object obj, long j2) {
        return this.f16178a.getInt(obj, j2);
    }

    /* renamed from: j */
    public final long m8502j(Object obj, long j2) {
        return this.f16178a.getLong(obj, j2);
    }

    /* renamed from: k */
    public final long m8503k(Field field) {
        return this.f16178a.objectFieldOffset(field);
    }

    /* renamed from: l */
    public final Object m8504l(Object obj, long j2) {
        return this.f16178a.getObject(obj, j2);
    }

    /* renamed from: m */
    public final void m8505m(Object obj, long j2, int i2) {
        this.f16178a.putInt(obj, j2, i2);
    }

    /* renamed from: n */
    public final void m8506n(Object obj, long j2, long j3) {
        this.f16178a.putLong(obj, j2, j3);
    }

    /* renamed from: o */
    public final void m8507o(Object obj, long j2, Object obj2) {
        this.f16178a.putObject(obj, j2, obj2);
    }
}
