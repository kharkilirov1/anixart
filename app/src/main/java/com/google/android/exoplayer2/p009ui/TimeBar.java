package com.google.android.exoplayer2.p009ui;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface TimeBar {

    public interface OnScrubListener {
        /* renamed from: a */
        void mo7374a(TimeBar timeBar, long j2);

        /* renamed from: b */
        void mo7375b(TimeBar timeBar, long j2, boolean z);

        /* renamed from: c */
        void mo7376c(TimeBar timeBar, long j2);
    }

    /* renamed from: a */
    void mo7346a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i2);

    /* renamed from: b */
    void mo7347b(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j2);

    void setDuration(long j2);

    void setEnabled(boolean z);

    void setPosition(long j2);
}
