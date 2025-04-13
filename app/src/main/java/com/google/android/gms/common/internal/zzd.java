package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzd extends zzab {

    /* renamed from: a */
    @Nullable
    public BaseGmsClient f15798a;

    /* renamed from: b */
    public final int f15799b;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i2) {
        this.f15798a = baseGmsClient;
        this.f15799b = i2;
    }

    @BinderThread
    /* renamed from: q */
    public final void m8199q(int i2, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.m8132g(this.f15798a, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.f15798a;
        int i3 = this.f15799b;
        Handler handler = baseGmsClient.f15661k;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new zzf(baseGmsClient, i2, iBinder, bundle)));
        this.f15798a = null;
    }
}
