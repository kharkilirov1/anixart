package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class sh0 implements qh0 {
    @Override // com.yandex.mobile.ads.impl.qh0
    @Nullable
    /* renamed from: a */
    public final ProgressBar mo27722a(@NonNull View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.qh0
    @Nullable
    /* renamed from: b */
    public final View mo27723b(@NonNull View view) {
        return view.findViewWithTag("close");
    }
}
