package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Wn */
/* loaded from: classes2.dex */
public class C3729Wn {
    @Nullable
    /* renamed from: a */
    public ApplicationInfo m19371a(@NonNull Context context, String str, int i2) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public PackageInfo m19373b(Context context, String str, int i2) {
        try {
            return context.getPackageManager().getPackageInfo(str, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean m19372a(@NonNull Context context, @NonNull String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
