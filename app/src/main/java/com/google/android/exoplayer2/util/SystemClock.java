package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SystemClock implements Clock {
    @Override // com.google.android.exoplayer2.util.Clock
    /* renamed from: a */
    public long mo7527a() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.Clock
    /* renamed from: b */
    public long mo7528b() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.Clock
    /* renamed from: c */
    public HandlerWrapper mo7529c(Looper looper, @Nullable Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // com.google.android.exoplayer2.util.Clock
    /* renamed from: d */
    public void mo7530d() {
    }
}
