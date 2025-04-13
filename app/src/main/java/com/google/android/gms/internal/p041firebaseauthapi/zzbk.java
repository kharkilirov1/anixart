package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbk {

    /* renamed from: a */
    public static final CopyOnWriteArrayList f16405a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static zzbj m8866a(String str) throws GeneralSecurityException {
        Iterator it = f16405a.iterator();
        while (it.hasNext()) {
            zzbj zzbjVar = (zzbj) it.next();
            if (zzbjVar.mo8865b(str)) {
                return zzbjVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
