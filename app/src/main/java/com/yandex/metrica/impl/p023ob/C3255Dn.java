package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Dn */
/* loaded from: classes2.dex */
public class C3255Dn extends AbstractC3230Cn<byte[]> {
    public C3255Dn(int i2, @NonNull String str, @NonNull C3379Im c3379Im) {
        super(i2, str, c3379Im);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3555Pn
    @Nullable
    /* renamed from: a */
    public Object mo17985a(@Nullable Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= super.m17943b()) {
            return bArr;
        }
        byte[] bArr2 = new byte[super.m17943b()];
        System.arraycopy(bArr, 0, bArr2, 0, super.m17943b());
        if (this.f42683c.m21337c()) {
            this.f42683c.m21336c("\"%s\" %s exceeded limit of %d bytes", super.m17942a(), bArr, Integer.valueOf(super.m17943b()));
        }
        return bArr2;
    }
}
