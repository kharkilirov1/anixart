package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzng extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ zznh f16609a;

    public zzng(zznh zznhVar) {
        this.f16609a = zznhVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            Mac mac = (Mac) zzmt.f16597f.m9325a(this.f16609a.f16611b);
            mac.init(this.f16609a.f16612c);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
