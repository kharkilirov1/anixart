package com.google.android.gms.internal.p041firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzeu implements zzau {

    /* renamed from: e */
    public static final byte[] f16468e = new byte[0];

    /* renamed from: a */
    public final zzkf f16469a;

    /* renamed from: b */
    public final zzes f16470b;

    /* renamed from: c */
    public final zzfd f16471c;

    /* renamed from: d */
    public final zzer f16472d;

    public zzeu(zzkf zzkfVar, zzfd zzfdVar, zzer zzerVar, zzes zzesVar) {
        this.f16469a = zzkfVar;
        this.f16471c = zzfdVar;
        this.f16472d = zzerVar;
        this.f16470b = zzesVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzau
    /* renamed from: a */
    public final byte[] mo8831a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] m9316d;
        int length = bArr.length;
        if (length < 32) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        byte[] bArr3 = new byte[0];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
        zzkf zzkfVar = this.f16469a;
        zzfd zzfdVar = this.f16471c;
        zzer zzerVar = this.f16472d;
        zzes zzesVar = this.f16470b;
        byte[] m9525C = zzkfVar.m9203v().m9525C();
        Objects.requireNonNull(zzfdVar);
        byte[] m9342a = zznn.m9342a(m9525C, copyOf);
        byte[] m9315c = zzmj.m9315c(copyOf, zznn.m9343b(m9525C));
        byte[] bArr4 = zzfc.f16477b;
        byte[] m9315c2 = zzmj.m9315c(zzfc.f16483h, bArr4);
        zzer zzerVar2 = zzfdVar.f16486a;
        Objects.requireNonNull(zzerVar2);
        int macLength = Mac.getInstance("HmacSha256").getMacLength();
        byte[] m8936b = zzerVar2.m8936b(zzerVar2.m8937c(zzfc.m8944c("eae_prk", m9342a, m9315c2), null), zzfc.m8945d("shared_secret", m9315c, m9315c2, macLength), macLength);
        byte[] bArr5 = zzfc.f16478c;
        if (!Arrays.equals(bArr5, bArr5)) {
            throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        byte[] m9315c3 = zzmj.m9315c(zzfc.f16484i, bArr4, bArr5, zzesVar.mo8934w());
        byte[] bArr6 = zzfc.f16482g;
        byte[] bArr7 = zzet.f16462f;
        byte[] m9315c4 = zzmj.m9315c(zzfc.f16476a, zzerVar.m8935a(bArr6, bArr7, "psk_id_hash", m9315c3), zzerVar.m8935a(bArr6, bArr3, "info_hash", m9315c3));
        byte[] m8935a = zzerVar.m8935a(m8936b, bArr7, "secret", m9315c3);
        int mo8933u = zzesVar.mo8933u();
        byte[] m8936b2 = zzerVar.m8936b(m8935a, zzfc.m8945d("key", m9315c4, m9315c3, mo8933u), mo8933u);
        byte[] m8936b3 = zzerVar.m8936b(m8935a, zzfc.m8945d("base_nonce", m9315c4, m9315c3, 12), 12);
        BigInteger bigInteger = BigInteger.ONE;
        zzet zzetVar = new zzet(copyOf, m8936b2, m8936b3, bigInteger.shiftLeft(96).subtract(bigInteger), zzesVar);
        byte[] bArr8 = f16468e;
        synchronized (zzetVar) {
            byte[] byteArray = zzetVar.f16467e.toByteArray();
            int length2 = byteArray.length;
            if (length2 != 12) {
                if (length2 > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length2 != 13) {
                    byte[] bArr9 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr9, 12 - length2, length2);
                    byteArray = bArr9;
                } else {
                    if (byteArray[0] != 0) {
                        throw new GeneralSecurityException("integer too large");
                    }
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                }
            }
            m9316d = zzmj.m9316d(m8936b3, byteArray);
            if (zzetVar.f16467e.compareTo(zzetVar.f16464b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            zzetVar.f16467e = zzetVar.f16467e.add(bigInteger);
        }
        return zzetVar.f16463a.mo8932a(m8936b2, m9316d, copyOfRange, bArr8);
    }
}
