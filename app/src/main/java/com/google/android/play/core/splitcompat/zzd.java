package com.google.android.play.core.splitcompat;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzd {

    /* renamed from: a */
    @Nullable
    public static ThreadPoolExecutor f20193a;

    /* renamed from: a */
    public static Executor m10941a() {
        if (f20193a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzc());
            f20193a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f20193a;
    }
}
