package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: b */
    public final String f15908b;

    /* renamed from: c */
    public final AtomicInteger f15909c = new AtomicInteger();

    /* renamed from: d */
    public final ThreadFactory f15910d = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        this.f15908b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f15910d.newThread(new zza(runnable));
        String str = this.f15908b;
        int andIncrement = this.f15909c.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
