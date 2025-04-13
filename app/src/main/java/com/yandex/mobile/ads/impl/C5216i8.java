package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.mobile.ads.impl.i8 */
/* loaded from: classes3.dex */
public final class C5216i8 {

    /* renamed from: a */
    private final String f51237a;

    /* renamed from: b */
    private final byte[] f51238b;

    /* renamed from: c */
    private final byte[] f51239c;

    public C5216i8(@NonNull String str, @NonNull byte[] bArr, @NonNull byte[] bArr2) {
        this.f51237a = str;
        this.f51238b = bArr;
        this.f51239c = bArr2;
    }

    @NonNull
    @SuppressLint
    /* renamed from: a */
    public final byte[] m25457a(@NonNull byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f51238b, "AES");
        Cipher cipher = Cipher.getInstance(this.f51237a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f51239c));
        return cipher.doFinal(bArr);
    }
}
