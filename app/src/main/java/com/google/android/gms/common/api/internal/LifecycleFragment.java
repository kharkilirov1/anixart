package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleFragment {
    @KeepForSdk
    /* renamed from: g0 */
    void mo8003g0(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    @Nullable
    @KeepForSdk
    /* renamed from: i1 */
    <T extends LifecycleCallback> T mo8004i1(@NonNull String str, @NonNull Class<T> cls);

    @KeepForSdk
    void startActivityForResult(@NonNull Intent intent, int i2);

    @Nullable
    @KeepForSdk
    /* renamed from: v1 */
    Activity mo8005v1();
}
