package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzs {

    /* renamed from: a */
    public final Context f19639a;

    public zzs(Context context) {
        this.f19639a = context;
    }

    /* renamed from: a */
    public static long m10667a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j2 += m10667a(file2);
            }
        }
        return j2;
    }
}
