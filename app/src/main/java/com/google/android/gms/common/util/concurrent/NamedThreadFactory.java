package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: b */
    public final String f15906b;

    /* renamed from: c */
    public final ThreadFactory f15907c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@NonNull String str) {
        Preconditions.m8132g(str, "Name must not be null");
        this.f15906b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f15907c.newThread(new zza(runnable));
        newThread.setName(this.f15906b);
        return newThread;
    }
}
