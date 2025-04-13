package com.yandex.metrica.impl.p022ac;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
public class CrashpadHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    @Nullable
    public static native String getLibDirInsideApk();

    public static native String getLibraryVersion();

    public static native void logsEnabled(boolean z);

    public static native void setUpNativeUncaughtExceptionHandler(@NonNull Bundle bundle);

    public static native void updateRuntimeConfig(@NonNull String str);
}
