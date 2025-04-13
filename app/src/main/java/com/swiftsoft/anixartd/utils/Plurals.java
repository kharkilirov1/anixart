package com.swiftsoft.anixartd.utils;

import android.content.Context;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Plurals.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Plurals;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Plurals {

    /* renamed from: a */
    @NotNull
    public static final Plurals f30231a = new Plurals();

    @NotNull
    /* renamed from: a */
    public final String m16341a(@NotNull Context context, int i2, @PluralsRes int i3) {
        String quantityString = context.getResources().getQuantityString(i3, i2, Integer.valueOf(i2));
        Intrinsics.m32178g(quantityString, "context.resources.getQua…\n        totalCount\n    )");
        return quantityString;
    }

    @NotNull
    /* renamed from: b */
    public final String m16342b(@NotNull Context context, int i2, @PluralsRes int i3, @StringRes int i4) {
        if (i2 > 0) {
            return m16341a(context, i2, i3);
        }
        String string = context.getString(i4);
        Intrinsics.m32178g(string, "context.getString(zeroResourceId)");
        return string;
    }

    @NotNull
    /* renamed from: c */
    public final String m16343c(@NotNull Context context, long j2, @PluralsRes int i2, @StringRes int i3) {
        return m16342b(context, (int) j2, i2, i3);
    }
}
