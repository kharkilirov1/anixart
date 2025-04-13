package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Base64Utils {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static String m8236a(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static String m8237b(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
