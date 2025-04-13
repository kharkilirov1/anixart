package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.x8 */
/* loaded from: classes3.dex */
public final class C6016x8 extends Handler {

    /* renamed from: a */
    @NotNull
    public static final C6016x8 f56403a = new C6016x8();

    private C6016x8() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        Intrinsics.m32179h(record, "record");
        int i2 = C5962w8.f56038c;
        String loggerName = record.getLoggerName();
        Intrinsics.m32178g(loggerName, "record.loggerName");
        int m29872a = C6062y8.m29872a(record);
        String message = record.getMessage();
        Intrinsics.m32178g(message, "record.message");
        C5962w8.m29403a(loggerName, m29872a, message, record.getThrown());
    }
}
