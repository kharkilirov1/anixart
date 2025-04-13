package com.google.android.gms.internal.p041firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzaco {

    /* renamed from: a */
    public final Unsafe f16354a;

    public zzaco(Unsafe unsafe) {
        this.f16354a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo8765a(Object obj, long j2);

    /* renamed from: b */
    public abstract float mo8766b(Object obj, long j2);

    /* renamed from: c */
    public abstract void mo8767c(Object obj, long j2, boolean z);

    /* renamed from: d */
    public abstract void mo8768d(Object obj, long j2, byte b);

    /* renamed from: e */
    public abstract void mo8769e(Object obj, long j2, double d);

    /* renamed from: f */
    public abstract void mo8770f(Object obj, long j2, float f2);

    /* renamed from: g */
    public abstract boolean mo8771g(Object obj, long j2);

    /* renamed from: h */
    public final int m8772h(Class cls) {
        return this.f16354a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m8773i(Class cls) {
        return this.f16354a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m8774j(Object obj, long j2) {
        return this.f16354a.getInt(obj, j2);
    }

    /* renamed from: k */
    public final long m8775k(Object obj, long j2) {
        return this.f16354a.getLong(obj, j2);
    }

    /* renamed from: l */
    public final long m8776l(Field field) {
        return this.f16354a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m8777m(Object obj, long j2) {
        return this.f16354a.getObject(obj, j2);
    }

    /* renamed from: n */
    public final void m8778n(Object obj, long j2, int i2) {
        this.f16354a.putInt(obj, j2, i2);
    }

    /* renamed from: o */
    public final void m8779o(Object obj, long j2, long j3) {
        this.f16354a.putLong(obj, j2, j3);
    }

    /* renamed from: p */
    public final void m8780p(Object obj, long j2, Object obj2) {
        this.f16354a.putObject(obj, j2, obj2);
    }
}
