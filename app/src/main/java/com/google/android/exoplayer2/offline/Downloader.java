package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public interface Downloader {

    public interface ProgressListener {
        /* renamed from: a */
        void mo6746a(long j2, long j3, float f2);
    }

    /* renamed from: a */
    void mo6750a(@Nullable ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
