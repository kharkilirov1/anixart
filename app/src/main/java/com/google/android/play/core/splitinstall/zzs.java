package com.google.android.play.core.splitinstall;

import android.content.Context;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzs {

    /* renamed from: a */
    public static final /* synthetic */ int f20290a = 0;

    static {
        new com.google.android.play.core.internal.zzag("SplitInstallInfoProvider");
    }

    public zzs(Context context) {
        context.getPackageName();
    }

    /* renamed from: a */
    public static String m10993a(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: b */
    public static boolean m10994b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
