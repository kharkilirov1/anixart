package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.common.zzag;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzx {

    /* renamed from: a */
    @Nullable
    public String f15949a = null;

    /* renamed from: b */
    public long f15950b = -1;

    /* renamed from: c */
    public zzag<byte[]> f15951c = zzag.m8555x();

    /* renamed from: d */
    public zzag<byte[]> f15952d = zzag.m8555x();

    /* renamed from: a */
    public final zzz m8256a() {
        if (this.f15949a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f15950b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f15951c.isEmpty() && this.f15952d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzz(this.f15949a, this.f15951c, this.f15952d);
    }
}
