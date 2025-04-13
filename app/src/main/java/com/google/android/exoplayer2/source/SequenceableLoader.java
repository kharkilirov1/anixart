package com.google.android.exoplayer2.source;

/* loaded from: classes.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        /* renamed from: e */
        void mo5784e(T t);
    }

    boolean continueLoading(long j2);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j2);
}
