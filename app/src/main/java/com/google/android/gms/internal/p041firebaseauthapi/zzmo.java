package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmo implements zzav {

    /* renamed from: a */
    public final zzmm f16588a;

    public zzmo(ECPublicKey eCPublicKey, byte[] bArr, String str, int i2, zzmm zzmmVar) throws GeneralSecurityException {
        zzmr.m9321c(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f16588a = zzmmVar;
    }
}
