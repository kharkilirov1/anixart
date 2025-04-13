package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class InternalTokenResult {

    /* renamed from: a */
    @Nullable
    public String f23226a;

    @KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.f23226a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof InternalTokenResult) {
            return Objects.m8123a(this.f23226a, ((InternalTokenResult) obj).f23226a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23226a});
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a(FirebaseMessagingService.EXTRA_TOKEN, this.f23226a);
        return toStringHelper.toString();
    }
}
