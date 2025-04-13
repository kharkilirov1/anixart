package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class HashAccumulator {

    /* renamed from: a */
    public int f15222a = 1;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public HashAccumulator m7863a(@Nullable Object obj) {
        this.f15222a = (31 * this.f15222a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final HashAccumulator m7864b(boolean z) {
        this.f15222a = (31 * this.f15222a) + (z ? 1 : 0);
        return this;
    }
}
