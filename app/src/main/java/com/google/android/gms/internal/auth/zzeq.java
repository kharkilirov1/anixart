package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzeq;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzeq<MessageType extends zzeq<MessageType, BuilderType>, BuilderType extends zzeo<MessageType, BuilderType>> extends zzdm<MessageType, BuilderType> {
    private static final Map<Object, zzeq<?, ?>> zzb = new ConcurrentHashMap();
    public zzgq zzc = zzgq.f16170e;

    /* renamed from: a */
    public static <T extends zzeq> T m8402a(Class<T> cls) {
        Map<Object, zzeq<?, ?>> map = zzb;
        zzeq<?, ?> zzeqVar = map.get(cls);
        if (zzeqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeqVar = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzeqVar == null) {
            zzeqVar = (zzeq) ((zzeq) zzgz.m8512e(cls)).mo8405d(6, null, null);
            if (zzeqVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzeqVar);
        }
        return zzeqVar;
    }

    /* renamed from: b */
    public static Object m8403b(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: c */
    public static <T extends zzeq> void m8404c(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: d */
    public abstract Object mo8405d(int i2, Object obj, Object obj2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfy.f16140c.m8469a(getClass()).mo8452e(this, (zzeq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int mo8448a = zzfy.f16140c.m8469a(getClass()).mo8448a(this);
        this.zza = mo8448a;
        return mo8448a;
    }

    @Override // com.google.android.gms.internal.auth.zzfq
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ zzfp mo8406j() {
        zzeo zzeoVar = (zzeo) mo8405d(5, null, null);
        zzeoVar.m8399c(this);
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzfq mo8401k() {
        return (zzeq) mo8405d(6, null, null);
    }

    public final String toString() {
        StringBuilder m27x = C0000a.m27x("# ", super.toString());
        zzfs.m8436c(this, m27x, 0);
        return m27x.toString();
    }
}
