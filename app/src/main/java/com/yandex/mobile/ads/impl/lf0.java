package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class lf0 {

    /* renamed from: a */
    private static final Pattern f52379a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    /* renamed from: a */
    public static boolean m26444a(@NonNull String str) {
        return f52379a.matcher(str).find();
    }
}
