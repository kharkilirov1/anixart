package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class UptimeClock implements Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    /* renamed from: a */
    public long mo5600a() {
        return SystemClock.elapsedRealtime();
    }
}
