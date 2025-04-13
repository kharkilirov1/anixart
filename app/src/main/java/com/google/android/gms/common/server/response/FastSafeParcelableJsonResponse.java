package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @KeepForSdk
    public FastSafeParcelableJsonResponse() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : mo7846c().values()) {
            if (mo7848g(field)) {
                if (!fastJsonResponse.mo7848g(field) || !Objects.m8123a(mo7847d(field), fastJsonResponse.mo7847d(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo7848g(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    @VisibleForTesting
    /* renamed from: f */
    public Object mo8212f(@NonNull String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    /* renamed from: h */
    public boolean mo8213h(@NonNull String str) {
        return false;
    }

    @KeepForSdk
    public int hashCode() {
        int i2 = 0;
        for (FastJsonResponse.Field<?, ?> field : mo7846c().values()) {
            if (mo7848g(field)) {
                Object mo7847d = mo7847d(field);
                java.util.Objects.requireNonNull(mo7847d, "null reference");
                i2 = (i2 * 31) + mo7847d.hashCode();
            }
        }
        return i2;
    }
}
