package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: b */
    public final Feature f15384b;

    @KeepForSdk
    public UnsupportedApiCallException(@NonNull Feature feature) {
        this.f15384b = feature;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15384b));
    }
}
