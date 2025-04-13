package com.yandex.metrica.impl.p022ac;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
public class CrashpadServiceHelper {
    /* renamed from: a */
    public static boolean m17803a(String str) {
        return markCrashCompleted(str) && deleteCompletedReports();
    }

    public static native void cancelSetUpServiceHelper();

    public static native boolean deleteCompletedReports();

    private static native boolean markCrashCompleted(String str);

    public static native Bundle readCrash(String str);

    public static native List<Bundle> readOldCrashes();

    public static native void setUpServiceHelper(String str);
}
