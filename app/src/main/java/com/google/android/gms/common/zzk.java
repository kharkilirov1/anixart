package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zzk extends zzi {

    /* renamed from: d */
    public static final WeakReference<byte[]> f15924d = new WeakReference<>(null);

    /* renamed from: c */
    public WeakReference<byte[]> f15925c;

    public zzk(byte[] bArr) {
        super(bArr);
        this.f15925c = f15924d;
    }

    /* renamed from: S0 */
    public abstract byte[] mo8252S0();

    @Override // com.google.android.gms.common.zzi
    /* renamed from: t */
    public final byte[] mo8254t() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f15925c.get();
            if (bArr == null) {
                bArr = mo8252S0();
                this.f15925c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
