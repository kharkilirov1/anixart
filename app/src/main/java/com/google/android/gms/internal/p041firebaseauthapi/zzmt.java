package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmt {

    /* renamed from: b */
    public static final Logger f16593b = Logger.getLogger(zzmt.class.getName());

    /* renamed from: c */
    public static final List f16594c;

    /* renamed from: d */
    public static final boolean f16595d;

    /* renamed from: e */
    public static final zzmt f16596e;

    /* renamed from: f */
    public static final zzmt f16597f;

    /* renamed from: g */
    public static final zzmt f16598g;

    /* renamed from: h */
    public static final zzmt f16599h;

    /* renamed from: i */
    public static final zzmt f16600i;

    /* renamed from: a */
    public final zznb f16601a;

    static {
        if (zzdv.m8921a()) {
            f16594c = m9324b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f16595d = false;
        } else if (zznl.m9338a()) {
            f16594c = m9324b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f16595d = true;
        } else {
            f16594c = new ArrayList();
            f16595d = true;
        }
        f16596e = new zzmt(new zzmu());
        f16597f = new zzmt(new zzmy());
        f16598g = new zzmt(new zzmv());
        f16599h = new zzmt(new zzmx());
        f16600i = new zzmt(new zzmw());
    }

    public zzmt(zznb zznbVar) {
        this.f16601a = zznbVar;
    }

    /* renamed from: b */
    public static List m9324b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f16593b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object m9325a(String str) throws GeneralSecurityException {
        Iterator it = f16594c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f16601a.mo9326a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (f16595d) {
            return this.f16601a.mo9326a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
