package com.swiftsoft.anixartd.utils;

import android.content.Context;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div2.C3033a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Counters.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Counters;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Counters {

    /* renamed from: a */
    @NotNull
    public static final Counters f30127a = new Counters();

    /* renamed from: a */
    public static String m16301a(Counters counters, Context context, long j2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = C2507R.string.thousand_count;
        }
        if ((i4 & 8) != 0) {
            i3 = C2507R.string.million_count;
        }
        if (j2 >= 1000) {
            String string = context.getString(i2);
            Intrinsics.m32178g(string, "context.getString(thousandResourceId)");
            return C3033a.m17745g(new Object[]{Long.valueOf(j2 / 1000)}, 1, string, "format(format, *args)");
        }
        if (j2 < 1000000) {
            return String.valueOf(j2);
        }
        String string2 = context.getString(i3);
        Intrinsics.m32178g(string2, "context.getString(millionResourceId)");
        return C3033a.m17745g(new Object[]{Long.valueOf(j2 / 1000000)}, 1, string2, "format(format, *args)");
    }
}
