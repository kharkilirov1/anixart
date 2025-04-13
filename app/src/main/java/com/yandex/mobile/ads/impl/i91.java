package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import java.net.URI;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i91 {
    static {
        Pattern.compile("maps.yandex");
    }

    /* renamed from: a */
    public static boolean m25466a(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            for (int i2 : C5782t5.m28465b(31)) {
                if (str.startsWith(h91.m25095a(i2))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return !z && URLUtil.isNetworkUrl(str);
    }

    /* renamed from: b */
    public static boolean m25467b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int[] iArr = {10, 11, 13, 14, 15, 16};
            for (int i2 = 0; i2 < 6; i2++) {
                if (str.startsWith(h91.m25095a(iArr[i2]))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m25468c(@Nullable String str) {
        try {
            new URI(str);
            return !TextUtils.isEmpty(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
