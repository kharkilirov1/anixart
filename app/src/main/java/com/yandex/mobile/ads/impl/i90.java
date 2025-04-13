package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.StringRes;
import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i90 {
    @Nullable
    /* renamed from: a */
    public static Boolean m25463a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return m25464a(context, C4632R.string.yandex_mobileads_age_restricted_user);
    }

    /* renamed from: b */
    public static boolean m25465b(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        Boolean m25464a = m25464a(context, C4632R.string.yandex_mobileads_automatic_sdk_initialization);
        if (m25464a != null) {
            return m25464a.booleanValue();
        }
        return true;
    }

    /* renamed from: a */
    private static Boolean m25464a(Context context, @StringRes int i2) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            String string = context.getResources().getString(i2);
            Intrinsics.m32178g(string, "context.resources.getString(flagNameResource)");
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable th) {
                n60.m26808a(th, th.getMessage(), new Object[0]);
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(string)) {
                Object obj = bundle.get(string);
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
            }
        } catch (Throwable th2) {
            n60.m26808a(th2, th2.getMessage(), new Object[0]);
        }
        return null;
    }
}
