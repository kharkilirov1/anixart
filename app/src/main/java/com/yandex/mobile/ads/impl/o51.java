package com.yandex.mobile.ads.impl;

import com.yandex.div2.C3033a;
import com.yandex.mobile.ads.impl.r51;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o51 {
    /* renamed from: a */
    public static final void m27004a(n51 n51Var, q51 q51Var, String str) {
        r51 r51Var = r51.f54199h;
        Logger m27854a = r51.C5672b.m27854a();
        StringBuilder sb = new StringBuilder();
        sb.append(q51Var.m27640f());
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(n51Var.m26801b());
        m27854a.fine(sb.toString());
    }

    @NotNull
    /* renamed from: a */
    public static final String m27003a(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        return C3033a.m17745g(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }
}
