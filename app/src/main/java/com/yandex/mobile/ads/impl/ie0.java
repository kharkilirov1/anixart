package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class ie0 {

    /* renamed from: a */
    @NonNull
    private final String f51282a;

    /* renamed from: b */
    private final int f51283b;

    public ie0(int i2, @NonNull String str) {
        this(i2, str, 0);
    }

    @Nullable
    @SuppressLint
    /* renamed from: a */
    public final byte[] m25527a(@NonNull byte[] bArr) {
        try {
            byte[] decode = Base64.decode(this.f51282a, 0);
            if (decode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                secureRandom.nextBytes(bArr2);
                return m25526a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            }
        } catch (NoSuchAlgorithmException e2) {
            n60.m26810c("MixedEncryptor", e2);
        } catch (InvalidKeySpecException e3) {
            n60.m26810c("MixedEncryptor", e3);
        }
        return null;
    }

    private ie0(int i2, String str, @NonNull int i3) {
        this.f51282a = str;
        this.f51283b = i2;
    }

    @Nullable
    /* renamed from: a */
    private byte[] m25526a(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull PublicKey publicKey) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream2.write(bArr2);
                byteArrayOutputStream2.write(bArr3);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream2.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                C5216i8 c5216i8 = new C5216i8("AES/CBC/PKCS5Padding", bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f51283b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(c5216i8.m25457a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        n60.m26810c("MixedEncryptor", e2);
                    }
                    return byteArray2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        n60.m26810c("MixedEncryptor", th);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e3) {
                                n60.m26810c("MixedEncryptor", e3);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                                n60.m26810c("MixedEncryptor", e4);
                            }
                        }
                        throw th2;
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }
}
