package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class HttpUtil {

    /* renamed from: a */
    public static final Pattern f14462a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    public static final Pattern f14463b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    /* renamed from: a */
    public static String m7466a(long j2, long j3) {
        if (j2 == 0 && j3 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j2);
        sb.append("-");
        if (j3 != -1) {
            sb.append((j2 + j3) - 1);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static long m7467b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f14463b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }
}
