package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.AEADBadTagException;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzdo {

    /* renamed from: a */
    public final zzdm f16442a;

    /* renamed from: b */
    public final zzdm f16443b;

    public zzdo(byte[] bArr) throws GeneralSecurityException {
        if (!zzdu.m8920a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f16442a = mo8915a(bArr, 1);
        this.f16443b = mo8915a(bArr, 0);
    }

    /* renamed from: a */
    public abstract zzdm mo8915a(byte[] bArr, int i2) throws InvalidKeyException;

    /* renamed from: b */
    public final byte[] m8916b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        try {
            byte[] bArr4 = new byte[32];
            this.f16443b.m8914c(bArr, 0).get(bArr4);
            int remaining = byteBuffer.remaining();
            int i2 = remaining % 16;
            int i3 = i2 == 0 ? remaining : (remaining + 16) - i2;
            ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(0);
            order.put(byteBuffer);
            order.position(i3);
            order.putLong(0L);
            order.putLong(remaining);
            if (!zzmj.m9314b(zzdr.m8917a(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            zzdm zzdmVar = this.f16442a;
            Objects.requireNonNull(zzdmVar);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != zzdmVar.mo8912a()) {
                StringBuilder m24u = C0000a.m24u("The nonce length (in bytes) must be ");
                m24u.append(zzdmVar.mo8912a());
                throw new GeneralSecurityException(m24u.toString());
            }
            int remaining2 = byteBuffer.remaining();
            int i4 = (remaining2 / 64) + 1;
            for (int i5 = 0; i5 < i4; i5++) {
                ByteBuffer m8914c = zzdmVar.m8914c(bArr, zzdmVar.f16441b + i5);
                if (i5 == i4 - 1) {
                    zzmj.m9313a(allocate, byteBuffer, m8914c, remaining2 % 64);
                } else {
                    zzmj.m9313a(allocate, byteBuffer, m8914c, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }
}
