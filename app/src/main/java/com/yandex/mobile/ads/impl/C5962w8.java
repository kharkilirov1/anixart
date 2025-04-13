package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w8 */
/* loaded from: classes3.dex */
public final class C5962w8 {

    /* renamed from: a */
    @NotNull
    private static final CopyOnWriteArraySet<Logger> f56036a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    @NotNull
    private static final Map<String, String> f56037b;

    /* renamed from: c */
    public static final /* synthetic */ int f56038c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = mn0.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(mn0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C5893uz.class.getName(), "okhttp.Http2");
        linkedHashMap.put(r51.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f56037b = MapsKt.m32068m(linkedHashMap);
    }

    /* renamed from: a */
    public static void m29403a(@NotNull String loggerName, int i2, @NotNull String message, @Nullable Throwable th) {
        int min;
        Intrinsics.m32179h(loggerName, "loggerName");
        Intrinsics.m32179h(message, "message");
        String str = f56037b.get(loggerName);
        if (str == null) {
            str = StringsKt.m33907g0(loggerName, 23);
        }
        if (Log.isLoggable(str, i2)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int i3 = 0;
            int length = message.length();
            while (i3 < length) {
                int m33877C = StringsKt.m33877C(message, '\n', i3, false, 4, null);
                if (m33877C == -1) {
                    m33877C = length;
                }
                while (true) {
                    min = Math.min(m33877C, i3 + 4000);
                    String substring = message.substring(i3, min);
                    Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= m33877C) {
                        break;
                    } else {
                        i3 = min;
                    }
                }
                i3 = min + 1;
            }
        }
    }

    /* renamed from: a */
    public static void m29402a() {
        Level level;
        for (Map.Entry<String, String> entry : f56037b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f56036a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(C6016x8.f56403a);
            }
        }
    }
}
