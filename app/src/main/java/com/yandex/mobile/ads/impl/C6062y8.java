package com.yandex.mobile.ads.impl;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: com.yandex.mobile.ads.impl.y8 */
/* loaded from: classes3.dex */
public final class C6062y8 {
    /* renamed from: a */
    public static final int m29872a(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
