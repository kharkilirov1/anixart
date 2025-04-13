package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public class Strings {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @Nullable
    @KeepForSdk
    /* renamed from: a */
    public static String m8247a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    @KeepForSdk
    /* renamed from: b */
    public static boolean m8248b(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
