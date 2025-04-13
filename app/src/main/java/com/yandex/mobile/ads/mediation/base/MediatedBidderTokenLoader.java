package com.yandex.mobile.ads.mediation.base;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes3.dex */
public interface MediatedBidderTokenLoader {
    void loadBidderToken(@NonNull Context context, @NonNull Map<String, String> map, @NonNull MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
