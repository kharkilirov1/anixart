package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DownloadManager {

    /* renamed from: a */
    public int f12149a;

    /* renamed from: b */
    public boolean f12150b;

    public static final class DownloadUpdate {
    }

    public static final class InternalHandler extends Handler {

        /* renamed from: a */
        public int f12151a;

        /* renamed from: b */
        public boolean f12152b;

        /* renamed from: c */
        public int f12153c;

        /* JADX WARN: Finally extract failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f12151a = message.arg1;
                    try {
                        throw null;
                    } catch (Throwable th) {
                        int i2 = Util.f14736a;
                        throw th;
                    }
                case 1:
                    this.f12152b = message.arg1 != 0;
                    throw null;
                case 2:
                    this.f12151a = message.arg1;
                    throw null;
                case 3:
                    Objects.requireNonNull((String) message.obj);
                    throw null;
                case 4:
                    this.f12153c = message.arg1;
                    throw null;
                case 5:
                    throw null;
                case 6:
                    String str = ((DownloadRequest) message.obj).f12165b;
                    throw null;
                case 7:
                    throw null;
                case 8:
                    new ArrayList();
                    throw null;
                case 9:
                    String str2 = ((Task) message.obj).f12154b.f12165b;
                    throw null;
                case 10:
                    Task task = (Task) message.obj;
                    int i3 = Util.f14736a;
                    String str3 = task.f12154b.f12165b;
                    throw null;
                case 11:
                    throw null;
                case 12:
                    throw null;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public interface Listener {
    }

    public static class Task extends Thread implements Downloader.ProgressListener {

        /* renamed from: b */
        public final DownloadRequest f12154b;

        /* renamed from: c */
        public final Downloader f12155c;

        /* renamed from: d */
        public final DownloadProgress f12156d;

        /* renamed from: e */
        public final boolean f12157e;

        /* renamed from: f */
        public final int f12158f;

        /* renamed from: g */
        @Nullable
        public volatile InternalHandler f12159g;

        /* renamed from: h */
        public volatile boolean f12160h;

        /* renamed from: i */
        @Nullable
        public Exception f12161i;

        /* renamed from: j */
        public long f12162j;

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        /* renamed from: a */
        public void mo6746a(long j2, long j3, float f2) {
            this.f12156d.f12163a = j3;
            this.f12156d.f12164b = f2;
            if (j2 != this.f12162j) {
                this.f12162j = j2;
                InternalHandler internalHandler = this.f12159g;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f12157e) {
                    this.f12155c.remove();
                } else {
                    long j2 = -1;
                    int i2 = 0;
                    while (!this.f12160h) {
                        try {
                            this.f12155c.mo6750a(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.f12160h) {
                                long j3 = this.f12156d.f12163a;
                                if (j3 != j2) {
                                    j2 = j3;
                                    i2 = 0;
                                }
                                i2++;
                                if (i2 > this.f12158f) {
                                    throw e2;
                                }
                                Thread.sleep(Math.min((i2 - 1) * 1000, 5000));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.f12161i = e3;
            }
            InternalHandler internalHandler = this.f12159g;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }
    }
}
