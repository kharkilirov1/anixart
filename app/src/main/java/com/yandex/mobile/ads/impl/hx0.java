package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class hx0 {

    /* renamed from: a */
    @NonNull
    private final DecimalFormat f51147a;

    public hx0() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f51147a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    @NonNull
    /* renamed from: a */
    public final String m25379a(@NonNull String str) throws ni0 {
        try {
            return this.f51147a.format(Long.valueOf(!TextUtils.isEmpty(str) ? str.replaceAll(" ", "") : str));
        } catch (NumberFormatException e2) {
            n60.m26810c(String.format("Could not parse review count value. Review Count value is %s", str), e2);
            throw new ni0("Native Ad json has not required attributes");
        }
    }
}
