package com.yandex.mobile.ads.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.lk1;

/* loaded from: classes2.dex */
public final class BidderTokenLoader {
    private BidderTokenLoader() {
    }

    public static void loadBidderToken(@NonNull Context context, @NonNull BidderTokenLoadListener bidderTokenLoadListener) {
        lk1.m26488a().m26492b(context, bidderTokenLoadListener);
    }
}
