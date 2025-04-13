package com.yandex.metrica.push;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.core.PushServiceControllerProvider;
import com.yandex.metrica.push.impl.C4562a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YandexMetricaPush {
    public static final String EXTRA_ACTION_INFO = ".extra.ACTION_INFO";
    public static final String EXTRA_PAYLOAD = ".extra.payload";
    public static final String OPEN_DEFAULT_ACTIVITY_ACTION = "com.yandex.metrica.push.action.OPEN";

    /* renamed from: a */
    @SuppressLint
    private static volatile C4562a f47225a;

    /* renamed from: b */
    private static final Object f47226b = new Object();

    private YandexMetricaPush() {
    }

    /* renamed from: a */
    private static void m21349a() {
        if (f47225a == null) {
            throw new IllegalStateException("MetricaPush should be initialized by calling MetricaPush.init(Context).");
        }
    }

    @Nullable
    public static synchronized NotificationChannel getDefaultNotificationChannel() {
        NotificationChannel m21398b;
        synchronized (YandexMetricaPush.class) {
            synchronized (f47226b) {
                m21349a();
            }
            m21398b = f47225a.m21495b().m21398b();
        }
        return m21398b;
    }

    @Nullable
    @Deprecated
    public static synchronized String getToken() {
        String m21504j;
        synchronized (YandexMetricaPush.class) {
            synchronized (f47226b) {
                m21349a();
            }
            m21504j = f47225a.m21504j();
        }
        return m21504j;
    }

    @Nullable
    public static synchronized Map<String, String> getTokens() {
        Map<String, String> m21505k;
        synchronized (YandexMetricaPush.class) {
            synchronized (f47226b) {
                m21349a();
            }
            m21505k = f47225a.m21505k();
        }
        return m21505k;
    }

    public static synchronized void init(@NonNull Context context) {
        synchronized (YandexMetricaPush.class) {
            if (f47225a == null) {
                synchronized (f47226b) {
                    if (f47225a == null) {
                        C4562a m21488a = C4562a.m21488a(context);
                        m21488a.m21506l();
                        f47225a = m21488a;
                    }
                }
            }
        }
    }

    public static synchronized void setTokenUpdateListener(@NonNull TokenUpdateListener tokenUpdateListener) {
        synchronized (YandexMetricaPush.class) {
            synchronized (f47226b) {
                m21349a();
            }
            f47225a.m21491a(tokenUpdateListener);
        }
    }

    public static synchronized void init(@NonNull Context context, PushServiceControllerProvider... pushServiceControllerProviderArr) {
        synchronized (YandexMetricaPush.class) {
            if (f47225a == null) {
                synchronized (f47226b) {
                    if (f47225a == null) {
                        C4562a m21488a = C4562a.m21488a(context);
                        m21488a.m21494a(pushServiceControllerProviderArr);
                        f47225a = m21488a;
                    }
                }
            }
        }
    }
}
