package com.google.android.gms.common.data;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class DataBufferRef {

    /* renamed from: a */
    @KeepForSdk
    public int f15625a;

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof DataBufferRef) && Objects.m8123a(Integer.valueOf(((DataBufferRef) obj).f15625a), Integer.valueOf(this.f15625a)) && Objects.m8123a(0, 0);
    }

    @KeepForSdk
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15625a), 0, null});
    }
}
