package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdk {

    /* renamed from: c */
    public static final ThreadLocal f16437c = new zzdj();

    /* renamed from: a */
    public final SecretKey f16438a;

    /* renamed from: b */
    public final boolean f16439b;

    public zzdk(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!zzdu.m8920a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zznm.m9340b(bArr.length);
        this.f16438a = new SecretKeySpec(bArr, "AES");
        this.f16439b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m8911a(byte[] r8, byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
        /*
            r7 = this;
            int r10 = r8.length
            r0 = 12
            if (r10 != r0) goto L80
            boolean r10 = r7.f16439b
            r1 = 1
            if (r1 == r10) goto Ld
            r2 = 16
            goto Lf
        Ld:
            r2 = 28
        Lf:
            int r3 = r9.length
            if (r3 < r2) goto L78
            r2 = 0
            if (r10 == 0) goto L2c
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r8)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r9, r2, r0)
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L24
            goto L2c
        L24:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "iv does not match prepended iv"
            r8.<init>(r9)
            throw r8
        L2c:
            boolean r10 = com.google.android.gms.internal.p041firebaseauthapi.zznl.m9338a()
            if (r10 == 0) goto L4f
            java.lang.String r10 = "android.os.Build$VERSION"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "SDK_INT"
            java.lang.reflect.Field r10 = r10.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L44
            r4 = 0
            int r10 = r10.getInt(r4)     // Catch: java.lang.Throwable -> L44
            goto L45
        L44:
            r10 = -1
        L45:
            r4 = 19
            if (r10 > r4) goto L4f
            javax.crypto.spec.IvParameterSpec r10 = new javax.crypto.spec.IvParameterSpec
            r10.<init>(r8, r2, r0)
            goto L56
        L4f:
            javax.crypto.spec.GCMParameterSpec r10 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.8E-43)
            r10.<init>(r4, r8, r2, r0)
        L56:
            java.lang.ThreadLocal r8 = com.google.android.gms.internal.p041firebaseauthapi.zzdk.f16437c
            java.lang.Object r4 = r8.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = 2
            javax.crypto.SecretKey r6 = r7.f16438a
            r4.init(r5, r6, r10)
            boolean r10 = r7.f16439b
            if (r1 == r10) goto L69
            r0 = 0
        L69:
            if (r10 == 0) goto L6d
            int r3 = r3 + (-12)
        L6d:
            java.lang.Object r8 = r8.get()
            javax.crypto.Cipher r8 = (javax.crypto.Cipher) r8
            byte[] r8 = r8.doFinal(r9, r0, r3)
            return r8
        L78:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "ciphertext too short"
            r8.<init>(r9)
            throw r8
        L80:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "iv is wrong size"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzdk.m8911a(byte[], byte[], byte[]):byte[]");
    }
}
