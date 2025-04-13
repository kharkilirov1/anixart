package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface Clock {

    /* renamed from: a */
    public static final Clock f14615a = new SystemClock();

    /* renamed from: a */
    long mo7527a();

    /* renamed from: b */
    long mo7528b();

    /* renamed from: c */
    HandlerWrapper mo7529c(Looper looper, @Nullable Handler.Callback callback);

    /* renamed from: d */
    void mo7530d();
}
