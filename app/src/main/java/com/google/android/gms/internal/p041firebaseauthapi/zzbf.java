package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbf {
    /* renamed from: a */
    public static zzbe m8851a(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Logger logger = zzbz.f16420a;
        synchronized (zzbz.class) {
            concurrentMap = zzbz.f16425f;
            unmodifiableMap = Collections.unmodifiableMap(concurrentMap);
        }
        if (!unmodifiableMap.containsKey(str)) {
            throw new GeneralSecurityException("cannot find key template: ".concat(str));
        }
        synchronized (zzbz.class) {
            unmodifiableMap2 = Collections.unmodifiableMap(concurrentMap);
        }
        return (zzbe) unmodifiableMap2.get(str);
    }
}
