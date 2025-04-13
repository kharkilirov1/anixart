package com.google.android.gms.common.internal;

import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: a */
    public static final Object f15716a = new Object();

    /* renamed from: b */
    @Nullable
    public static zzr f15717b;

    /* renamed from: c */
    @Nullable
    @VisibleForTesting
    public static HandlerThread f15718c;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static HandlerThread m8116a() {
        synchronized (f15716a) {
            HandlerThread handlerThread = f15718c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f15718c = handlerThread2;
            handlerThread2.start();
            return f15718c;
        }
    }

    /* renamed from: b */
    public abstract void mo8117b(zzn zznVar, ServiceConnection serviceConnection, String str);

    /* renamed from: c */
    public abstract boolean mo8118c(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor);
}
