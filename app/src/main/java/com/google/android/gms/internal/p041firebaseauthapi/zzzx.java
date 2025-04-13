package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.internal.p041firebaseauthapi.zzzt;
import com.google.android.gms.internal.p041firebaseauthapi.zzzx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzzx<MessageType extends zzzx<MessageType, BuilderType>, BuilderType extends zzzt<MessageType, BuilderType>> extends zzye<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzacg zzc = zzacg.f16345f;
    public int zzd = -1;

    /* renamed from: g */
    public static Object m9649g(Method method, Object obj, Object... objArr) {
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

    /* renamed from: h */
    public static void m9650h(Class cls, zzzx zzzxVar) {
        zzb.put(cls, zzzxVar);
    }

    /* renamed from: k */
    public static zzzx m9651k(zzzx zzzxVar) throws zzaaf {
        if (zzzxVar.m9656j()) {
            return zzzxVar;
        }
        throw new zzace().m8741a();
    }

    /* renamed from: n */
    public static zzzx m9652n(Class cls) {
        Map map = zzb;
        zzzx zzzxVar = (zzzx) map.get(cls);
        if (zzzxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzzxVar = (zzzx) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzzxVar == null) {
            zzzxVar = (zzzx) ((zzzx) zzacp.m8789i(cls)).mo8970l(6, null, null);
            if (zzzxVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzzxVar);
        }
        return zzzxVar;
    }

    /* renamed from: o */
    public static zzzx m9653o(zzzx zzzxVar, zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        zzyy mo9517r = zzyuVar.mo9517r();
        zzzx zzzxVar2 = (zzzx) zzzxVar.mo8970l(4, null, null);
        try {
            zzabo m8674a = zzabk.f16313c.m8674a(zzzxVar2.getClass());
            zzyz zzyzVar = mo9517r.f17129b;
            if (zzyzVar == null) {
                zzyzVar = new zzyz(mo9517r);
            }
            m8674a.mo8655f(zzzxVar2, zzyzVar, zzzkVar);
            m8674a.mo8652c(zzzxVar2);
            try {
                mo9517r.mo9532g(0);
                m9651k(zzzxVar2);
                return zzzxVar2;
            } catch (zzaaf e2) {
                throw e2;
            }
        } catch (zzaaf e3) {
            throw e3;
        } catch (zzace e4) {
            throw e4.m8741a();
        } catch (IOException e5) {
            if (e5.getCause() instanceof zzaaf) {
                throw ((zzaaf) e5.getCause());
            }
            throw new zzaaf(e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof zzaaf) {
                throw ((zzaaf) e6.getCause());
            }
            throw e6;
        }
    }

    /* renamed from: p */
    public static zzzx m9654p(zzzx zzzxVar, byte[] bArr, zzzk zzzkVar) throws zzaaf {
        int length = bArr.length;
        zzzx zzzxVar2 = (zzzx) zzzxVar.mo8970l(4, null, null);
        try {
            zzabo m8674a = zzabk.f16313c.m8674a(zzzxVar2.getClass());
            m8674a.mo8657h(zzzxVar2, bArr, 0, length, new zzyh(zzzkVar));
            m8674a.mo8652c(zzzxVar2);
            if (zzzxVar2.zza != 0) {
                throw new RuntimeException();
            }
            m9651k(zzzxVar2);
            return zzzxVar2;
        } catch (zzaaf e2) {
            throw e2;
        } catch (zzace e3) {
            throw e3.m8741a();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzaaf) {
                throw ((zzaaf) e4.getCause());
            }
            throw new zzaaf(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw zzaaf.m8584g();
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabc
    /* renamed from: D */
    public final int mo8619D() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int mo8650a = zzabk.f16313c.m8674a(getClass()).mo8650a(this);
        this.zzd = mo8650a;
        return mo8650a;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabc
    /* renamed from: E */
    public final /* synthetic */ zzabb mo8620E() {
        return (zzzt) mo8970l(5, null, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabc
    /* renamed from: c */
    public final /* synthetic */ zzabb mo8623c() {
        zzzt zzztVar = (zzzt) mo8970l(5, null, null);
        zzztVar.m9644g(this);
        return zzztVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabd
    /* renamed from: d */
    public final /* synthetic */ zzabc mo8624d() {
        return (zzzx) mo8970l(6, null, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzye
    /* renamed from: e */
    public final int mo9487e() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzabk.f16313c.m8674a(getClass()).mo8658i(this, (zzzx) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzye
    /* renamed from: f */
    public final void mo9488f(int i2) {
        this.zzd = i2;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int mo8651b = zzabk.f16313c.m8674a(getClass()).mo8651b(this);
        this.zza = mo8651b;
        return mo8651b;
    }

    /* renamed from: i */
    public final void m9655i(zzzf zzzfVar) throws IOException {
        zzabo m8674a = zzabk.f16313c.m8674a(getClass());
        zzzg zzzgVar = zzzfVar.f17144a;
        if (zzzgVar == null) {
            zzzgVar = new zzzg(zzzfVar);
        }
        m8674a.mo8653d(this, zzzgVar);
    }

    /* renamed from: j */
    public final boolean m9656j() {
        byte byteValue = ((Byte) mo8970l(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo8654e = zzabk.f16313c.m8674a(getClass()).mo8654e(this);
        mo8970l(2, true != mo8654e ? null : this, null);
        return mo8654e;
    }

    /* renamed from: l */
    public abstract Object mo8970l(int i2, Object obj, Object obj2);

    /* renamed from: m */
    public final zzzt m9657m() {
        return (zzzt) mo8970l(5, null, null);
    }

    public final String toString() {
        StringBuilder m27x = C0000a.m27x("# ", super.toString());
        zzabe.m8627c(this, m27x, 0);
        return m27x.toString();
    }
}
