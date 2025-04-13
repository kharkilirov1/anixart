package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class FadeModeResult {

    /* renamed from: a */
    public final int f19463a;

    /* renamed from: b */
    public final int f19464b;

    /* renamed from: c */
    public final boolean f19465c;

    public FadeModeResult(int i2, int i3, boolean z) {
        this.f19463a = i2;
        this.f19464b = i3;
        this.f19465c = z;
    }

    /* renamed from: a */
    public static FadeModeResult m10609a(int i2, int i3) {
        return new FadeModeResult(i2, i3, false);
    }
}
