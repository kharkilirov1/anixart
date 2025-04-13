package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbz {

    /* renamed from: a */
    public static final Logger f16420a = Logger.getLogger(zzbz.class.getName());

    /* renamed from: b */
    public static final AtomicReference f16421b = new AtomicReference(new zzbd());

    /* renamed from: c */
    public static final ConcurrentMap f16422c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap f16423d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap f16424e;

    /* renamed from: f */
    public static final ConcurrentMap f16425f;

    static {
        new ConcurrentHashMap();
        f16424e = new ConcurrentHashMap();
        f16425f = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static synchronized zzkl m8874a(zzkq zzkqVar) throws GeneralSecurityException {
        zzkl mo8832a;
        synchronized (zzbz.class) {
            zzax mo8842w = ((zzbd) f16421b.get()).m8848e(zzkqVar.m9235u()).mo8842w();
            if (!((Boolean) ((ConcurrentHashMap) f16423d).get(zzkqVar.m9235u())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzkqVar.m9235u())));
            }
            mo8832a = mo8842w.mo8832a(zzkqVar.m9234t());
        }
        return mo8832a;
    }

    /* renamed from: b */
    public static synchronized zzabc m8875b(zzkq zzkqVar) throws GeneralSecurityException {
        zzabc mo8835e;
        synchronized (zzbz.class) {
            zzax mo8842w = ((zzbd) f16421b.get()).m8848e(zzkqVar.m9235u()).mo8842w();
            if (!((Boolean) ((ConcurrentHashMap) f16423d).get(zzkqVar.m9235u())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzkqVar.m9235u())));
            }
            mo8835e = mo8842w.mo8835e(zzkqVar.m9234t());
        }
        return mo8835e;
    }

    /* renamed from: c */
    public static Object m8876c(String str, zzabc zzabcVar, Class cls) throws GeneralSecurityException {
        return ((zzbd) f16421b.get()).m8847d(str, cls).mo8833b(zzabcVar);
    }

    /* renamed from: d */
    public static Object m8877d(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        zzyu zzyuVar = zzyu.f17120c;
        return ((zzbd) f16421b.get()).m8847d(str, cls).mo8834d(zzyu.m9523z(bArr, 0, bArr.length));
    }

    /* renamed from: e */
    public static synchronized void m8878e(zzfq zzfqVar, zzfo zzfoVar, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = f16421b;
            zzbd zzbdVar = new zzbd((zzbd) atomicReference.get());
            zzbdVar.m8844a(zzfqVar, zzfoVar);
            String mo8897c = zzfqVar.mo8897c();
            String mo8897c2 = zzfoVar.mo8897c();
            m8881h(mo8897c, zzfqVar.mo8895a().mo8892c(), true);
            m8881h(mo8897c2, Collections.emptyMap(), false);
            if (!((zzbd) atomicReference.get()).m8846c(mo8897c)) {
                ((ConcurrentHashMap) f16422c).put(mo8897c, new zzby(zzfqVar));
                m8882i(zzfqVar.mo8897c(), zzfqVar.mo8895a().mo8892c());
            }
            ConcurrentMap concurrentMap = f16423d;
            ((ConcurrentHashMap) concurrentMap).put(mo8897c, Boolean.TRUE);
            ((ConcurrentHashMap) concurrentMap).put(mo8897c2, Boolean.FALSE);
            atomicReference.set(zzbdVar);
        }
    }

    /* renamed from: f */
    public static synchronized void m8879f(zzfo zzfoVar, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = f16421b;
            zzbd zzbdVar = new zzbd((zzbd) atomicReference.get());
            zzbdVar.m8845b(zzfoVar);
            String mo8897c = zzfoVar.mo8897c();
            m8881h(mo8897c, zzfoVar.mo8895a().mo8892c(), true);
            if (!((zzbd) atomicReference.get()).m8846c(mo8897c)) {
                ((ConcurrentHashMap) f16422c).put(mo8897c, new zzby(zzfoVar));
                m8882i(mo8897c, zzfoVar.mo8895a().mo8892c());
            }
            ((ConcurrentHashMap) f16423d).put(mo8897c, Boolean.TRUE);
            atomicReference.set(zzbdVar);
        }
    }

    /* renamed from: g */
    public static synchronized void m8880g(zzbv zzbvVar) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            Class mo8872w = zzbvVar.mo8872w();
            ConcurrentMap concurrentMap = f16424e;
            if (((ConcurrentHashMap) concurrentMap).containsKey(mo8872w)) {
                zzbv zzbvVar2 = (zzbv) ((ConcurrentHashMap) concurrentMap).get(mo8872w);
                if (!zzbvVar.getClass().getName().equals(zzbvVar2.getClass().getName())) {
                    f16420a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(mo8872w.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", mo8872w.getName(), zzbvVar2.getClass().getName(), zzbvVar.getClass().getName()));
                }
            }
            ((ConcurrentHashMap) concurrentMap).put(mo8872w, zzbvVar);
        }
    }

    /* renamed from: h */
    public static synchronized void m8881h(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            if (z) {
                ConcurrentMap concurrentMap = f16423d;
                if (((ConcurrentHashMap) concurrentMap).containsKey(str) && !((Boolean) ((ConcurrentHashMap) concurrentMap).get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((zzbd) f16421b.get()).f16401a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!((ConcurrentHashMap) f16425f).containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((ConcurrentHashMap) f16425f).containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.zzabc, java.lang.Object] */
    /* renamed from: i */
    public static void m8882i(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((ConcurrentHashMap) f16425f).put((String) entry.getKey(), zzbe.m8850a(str, ((zzfm) entry.getValue()).f16502a.mo8621a(), ((zzfm) entry.getValue()).f16503b));
        }
    }
}
