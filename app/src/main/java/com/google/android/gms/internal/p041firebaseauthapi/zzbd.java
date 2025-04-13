package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzbd {

    /* renamed from: b */
    public static final Logger f16400b = Logger.getLogger(zzbd.class.getName());

    /* renamed from: a */
    public final ConcurrentMap f16401a;

    public zzbd() {
        this.f16401a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final synchronized void m8844a(zzfq zzfqVar, zzfo zzfoVar) throws GeneralSecurityException {
        Class mo8843x;
        int mo8899e = zzfoVar.mo8899e();
        if (!zzdu.m8920a(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzfqVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzdu.m8920a(mo8899e)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzfoVar.getClass()) + " as it is not FIPS compatible.");
        }
        String mo8897c = zzfqVar.mo8897c();
        String mo8897c2 = zzfoVar.mo8897c();
        if (this.f16401a.containsKey(mo8897c) && ((zzbc) this.f16401a.get(mo8897c)).mo8843x() != null && (mo8843x = ((zzbc) this.f16401a.get(mo8897c)).mo8843x()) != null && !mo8843x.getName().equals(zzfoVar.getClass().getName())) {
            f16400b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + mo8897c + " with inconsistent public key type " + mo8897c2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzfqVar.getClass().getName(), mo8843x.getName(), zzfoVar.getClass().getName()));
        }
        m8849f(new zzbb(zzfqVar, zzfoVar), true);
        m8849f(new zzba(zzfoVar), false);
    }

    /* renamed from: b */
    public final synchronized void m8845b(zzfo zzfoVar) throws GeneralSecurityException {
        if (!zzdu.m8920a(zzfoVar.mo8899e())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzfoVar.getClass()) + " as it is not FIPS compatible.");
        }
        m8849f(new zzba(zzfoVar), false);
    }

    /* renamed from: c */
    public final boolean m8846c(String str) {
        return this.f16401a.containsKey(str);
    }

    /* renamed from: d */
    public final zzax m8847d(String str, Class cls) throws GeneralSecurityException {
        zzbc m8848e = m8848e(str);
        if (cls == null) {
            return m8848e.mo8842w();
        }
        if (m8848e.mo8840j().contains(cls)) {
            return m8848e.mo8839a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(m8848e.mo8841v());
        Set<Class> mo8840j = m8848e.mo8840j();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : mo8840j) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder m29z = C0000a.m29z("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        m29z.append(sb2);
        throw new GeneralSecurityException(m29z.toString());
    }

    /* renamed from: e */
    public final synchronized zzbc m8848e(String str) throws GeneralSecurityException {
        if (!this.f16401a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbc) this.f16401a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r6.f16401a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m8849f(com.google.android.gms.internal.p041firebaseauthapi.zzbc r7, boolean r8) throws java.security.GeneralSecurityException {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.firebase-auth-api.zzax r0 = r7.mo8842w()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.mo8836j()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.f16401a     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.firebase-auth-api.zzbc r1 = (com.google.android.gms.internal.p041firebaseauthapi.zzbc) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.mo8841v()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.mo8841v()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.util.logging.Logger r8 = com.google.android.gms.internal.p041firebaseauthapi.zzbd.f16400b     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r4 = "registerKeyManagerContainer"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L6b
            r8.logp(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.Class r1 = r1.mo8841v()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.mo8841v()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.f16401a     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.f16401a     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzbd.m8849f(com.google.android.gms.internal.firebase-auth-api.zzbc, boolean):void");
    }

    public zzbd(zzbd zzbdVar) {
        this.f16401a = new ConcurrentHashMap(zzbdVar.f16401a);
    }
}
