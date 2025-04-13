package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class GmsLogger {

    /* renamed from: a */
    public final String f15719a;

    /* renamed from: b */
    @Nullable
    public final String f15720b;

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.m8132g(str, "log tag cannot be null");
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f15719a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f15720b = null;
        } else {
            this.f15720b = str2;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean m8119a(int i2) {
        return Log.isLoggable(this.f15719a, i2);
    }
}
