package com.google.android.play.core.internal;

import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzcj {
    /* renamed from: a */
    public static String m10892a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
