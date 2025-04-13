package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmg implements zzap {

    /* renamed from: a */
    public final zzdk f16574a;

    public zzmg(byte[] bArr) throws GeneralSecurityException {
        if (!zzdu.m8920a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f16574a = new zzdk(bArr, true);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f16574a.m8911a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
