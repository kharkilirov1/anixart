package com.google.android.exoplayer2.util;

import android.os.Trace;

/* loaded from: classes.dex */
public final class TraceUtil {
    /* renamed from: a */
    public static void m7696a(String str) {
        if (Util.f14736a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m7697b() {
        if (Util.f14736a >= 18) {
            Trace.endSection();
        }
    }
}
