package com.google.android.exoplayer2.p009ui;

import android.view.View;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AdOverlayInfo {

    /* renamed from: a */
    public final View f14061a;

    /* renamed from: b */
    public final int f14062b;

    /* renamed from: c */
    @Nullable
    public final String f14063c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    public AdOverlayInfo(View view, int i2) {
        this.f14061a = view;
        this.f14062b = i2;
        this.f14063c = null;
    }

    public AdOverlayInfo(View view, int i2, @Nullable String str) {
        this.f14061a = view;
        this.f14062b = i2;
        this.f14063c = str;
    }
}
