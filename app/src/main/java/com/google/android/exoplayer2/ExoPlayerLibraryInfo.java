package com.google.android.exoplayer2;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class ExoPlayerLibraryInfo {

    /* renamed from: a */
    public static final HashSet<String> f9637a = new HashSet<>();

    /* renamed from: b */
    public static String f9638b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m5824a(String str) {
        synchronized (ExoPlayerLibraryInfo.class) {
            if (f9637a.add(str)) {
                String str2 = f9638b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f9638b = sb.toString();
            }
        }
    }
}
