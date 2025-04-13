package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo
/* loaded from: classes.dex */
public class ManufacturerUtils {
    /* renamed from: a */
    public static boolean m10147a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung");
    }
}
