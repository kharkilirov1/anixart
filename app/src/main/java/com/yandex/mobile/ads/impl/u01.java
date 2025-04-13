package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u01 {
    /* renamed from: a */
    public static SharedPreferences m28814a(u01 u01Var, Context context, String prefName) {
        boolean z;
        Objects.requireNonNull(u01Var);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(prefName, "prefName");
        try {
            Object systemService = context.getSystemService("user");
            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.os.UserManager");
            z = ((UserManager) systemService).isUserUnlocked();
        } catch (Throwable unused) {
            z = true;
        }
        if (z || Build.VERSION.SDK_INT < 24) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(prefName, 0);
            Intrinsics.m32178g(sharedPreferences, "{\n            context.ge…prefName, mode)\n        }");
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(prefName, 0);
        Intrinsics.m32178g(sharedPreferences2, "{\n            context.cr…prefName, mode)\n        }");
        return sharedPreferences2;
    }
}
