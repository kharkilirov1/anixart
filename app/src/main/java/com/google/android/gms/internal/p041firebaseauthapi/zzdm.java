package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzdm {

    /* renamed from: a */
    public int[] f16440a;

    /* renamed from: b */
    public final int f16441b;

    public zzdm(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f16440a = zzdi.m8910d(bArr);
        this.f16441b = i2;
    }

    /* renamed from: a */
    public abstract int mo8912a();

    /* renamed from: b */
    public abstract int[] mo8913b(int[] iArr, int i2);

    /* renamed from: c */
    public final ByteBuffer m8914c(byte[] bArr, int i2) {
        int[] mo8913b = mo8913b(zzdi.m8910d(bArr), i2);
        int[] iArr = (int[]) mo8913b.clone();
        zzdi.m8909c(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            mo8913b[i3] = mo8913b[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo8913b, 0, 16);
        return order;
    }
}
