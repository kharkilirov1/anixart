package com.yandex.metrica.impl.p023ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.g0 */
/* loaded from: classes2.dex */
public final class C3962g0 {

    /* renamed from: a */
    private static volatile CountDownLatch f45153a;

    /* renamed from: b */
    private static volatile PreloadInfoContentProvider f45154b;

    @JvmStatic
    /* renamed from: a */
    public static final void m19923a(@NotNull PreloadInfoContentProvider preloadInfoContentProvider) {
        f45153a = new CountDownLatch(1);
        f45154b = preloadInfoContentProvider;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m19921a() {
        CountDownLatch countDownLatch = f45153a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m19922a(@NotNull Context context) {
        CountDownLatch countDownLatch = f45153a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f45154b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f45153a = null;
        }
    }
}
