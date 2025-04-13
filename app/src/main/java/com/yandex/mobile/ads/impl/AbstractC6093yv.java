package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.yv */
/* loaded from: classes3.dex */
public abstract class AbstractC6093yv {
    public AbstractC6093yv(@NonNull Context context) {
        if (!(context instanceof Activity)) {
            e60.m24037c("Please use Activity context for mediation ads. Several mediation adapters will not work without activity context.", new Object[0]);
        }
        te0.m28642b().m28643a(context);
    }
}
