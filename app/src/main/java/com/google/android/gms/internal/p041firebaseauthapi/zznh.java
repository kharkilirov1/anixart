package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zznh implements zzgf {

    /* renamed from: a */
    public final ThreadLocal f16610a;

    /* renamed from: b */
    public final String f16611b;

    /* renamed from: c */
    public final Key f16612c;

    /* renamed from: d */
    public final int f16613d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zznh(String str, Key key) throws GeneralSecurityException {
        char c2;
        int i2;
        zzng zzngVar = new zzng(this);
        this.f16610a = zzngVar;
        if (!zzdu.m8920a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f16611b = str;
        this.f16612c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                i2 = 28;
            } else if (c2 == 2) {
                i2 = 32;
            } else if (c2 == 3) {
                i2 = 48;
            } else {
                if (c2 != 4) {
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                i2 = 64;
            }
            this.f16613d = i2;
        } else {
            this.f16613d = 20;
        }
        zzngVar.get();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzgf
    /* renamed from: a */
    public final byte[] mo8963a(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > this.f16613d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f16610a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f16610a.get()).doFinal(), i2);
    }
}
