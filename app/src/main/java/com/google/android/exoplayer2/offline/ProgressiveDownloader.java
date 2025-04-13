package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ProgressiveDownloader implements Downloader {

    /* renamed from: a */
    public final Executor f12187a;

    /* renamed from: b */
    @Nullable
    public Downloader.ProgressListener f12188b;

    /* renamed from: c */
    public volatile RunnableFutureTask<Void, IOException> f12189c;

    /* renamed from: d */
    public volatile boolean f12190d;

    @Override // com.google.android.exoplayer2.offline.Downloader
    /* renamed from: a */
    public void mo6750a(@Nullable Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
        this.f12188b = progressListener;
        this.f12189c = new RunnableFutureTask<Void, IOException>() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader.1
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            /* renamed from: a */
            public void mo6753a() {
                Objects.requireNonNull(ProgressiveDownloader.this);
                throw null;
            }

            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            /* renamed from: b */
            public Void mo6754b() throws Exception {
                Objects.requireNonNull(ProgressiveDownloader.this);
                throw null;
            }
        };
        boolean z = false;
        while (!z) {
            try {
                if (this.f12190d) {
                    break;
                }
                this.f12187a.execute(this.f12189c);
                try {
                    this.f12189c.get();
                    z = true;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    Objects.requireNonNull(cause);
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i2 = Util.f14736a;
                        throw cause;
                    }
                }
            } finally {
                this.f12189c.f14709c.m7535b();
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
        throw null;
    }
}
