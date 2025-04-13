package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.en */
/* loaded from: classes2.dex */
public class C3933en {

    /* renamed from: a */
    private final String f45075a;

    /* renamed from: b */
    private final byte[] f45076b;

    /* renamed from: c */
    private final byte[] f45077c;

    public C3933en(String str, byte[] bArr, byte[] bArr2) {
        this.f45075a = str;
        this.f45076b = bArr;
        this.f45077c = bArr2;
    }

    @SuppressLint
    /* renamed from: a */
    public byte[] m19830a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f45076b, "AES");
        Cipher cipher = Cipher.getInstance(this.f45075a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f45077c));
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    public byte[] m19831a(byte[] bArr, int i2, int i3) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f45076b, "AES");
        Cipher cipher = Cipher.getInstance(this.f45075a);
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f45077c));
        return cipher.doFinal(bArr, i2, i3);
    }
}
