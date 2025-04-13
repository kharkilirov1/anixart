package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class BooleanResult implements Result {
    @KeepForSdk
    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        throw null;
    }

    @KeepForSdk
    public final int hashCode() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public Status mo7862k() {
        return null;
    }
}
