package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    /* renamed from: a */
    void mo8007a(@NonNull T t, @NonNull U u) throws RemoteException;
}
