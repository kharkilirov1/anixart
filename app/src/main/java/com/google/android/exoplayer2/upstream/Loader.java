package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class Loader implements LoaderErrorThrower {

    /* renamed from: d */
    public static final LoadErrorAction f14472d = m7469c(false, -9223372036854775807L);

    /* renamed from: e */
    public static final LoadErrorAction f14473e = new LoadErrorAction(2, -9223372036854775807L, null);

    /* renamed from: f */
    public static final LoadErrorAction f14474f = new LoadErrorAction(3, -9223372036854775807L, null);

    /* renamed from: a */
    public final ExecutorService f14475a;

    /* renamed from: b */
    @Nullable
    public LoadTask<? extends Loadable> f14476b;

    /* renamed from: c */
    @Nullable
    public IOException f14477c;

    public interface Callback<T extends Loadable> {
        /* renamed from: f */
        void mo6852f(T t, long j2, long j3, boolean z);

        /* renamed from: g */
        void mo6853g(T t, long j2, long j3);

        /* renamed from: o */
        LoadErrorAction mo6858o(T t, long j2, long j3, IOException iOException, int i2);
    }

    public static final class LoadErrorAction {

        /* renamed from: a */
        public final int f14478a;

        /* renamed from: b */
        public final long f14479b;

        public LoadErrorAction(int i2, long j2, C11611 c11611) {
            this.f14478a = i2;
            this.f14479b = j2;
        }

        /* renamed from: a */
        public boolean m7476a() {
            int i2 = this.f14478a;
            return i2 == 0 || i2 == 1;
        }
    }

    @SuppressLint
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f14480b;

        /* renamed from: c */
        public final T f14481c;

        /* renamed from: d */
        public final long f14482d;

        /* renamed from: e */
        @Nullable
        public Callback<T> f14483e;

        /* renamed from: f */
        @Nullable
        public IOException f14484f;

        /* renamed from: g */
        public int f14485g;

        /* renamed from: h */
        @Nullable
        public Thread f14486h;

        /* renamed from: i */
        public boolean f14487i;

        /* renamed from: j */
        public volatile boolean f14488j;

        public LoadTask(Looper looper, T t, Callback<T> callback, int i2, long j2) {
            super(looper);
            this.f14481c = t;
            this.f14483e = callback;
            this.f14480b = i2;
            this.f14482d = j2;
        }

        /* renamed from: a */
        public void m7477a(boolean z) {
            this.f14488j = z;
            this.f14484f = null;
            if (hasMessages(0)) {
                this.f14487i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14487i = true;
                    this.f14481c.mo6866c();
                    Thread thread = this.f14486h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f14476b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Callback<T> callback = this.f14483e;
                Objects.requireNonNull(callback);
                callback.mo6852f(this.f14481c, elapsedRealtime, elapsedRealtime - this.f14482d, true);
                this.f14483e = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m7478b(long j2) {
            Assertions.m7516d(Loader.this.f14476b == null);
            Loader loader = Loader.this;
            loader.f14476b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                this.f14484f = null;
                loader.f14475a.execute(this);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f14488j) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f14484f = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f14475a;
                LoadTask<? extends Loadable> loadTask = loader.f14476b;
                Objects.requireNonNull(loadTask);
                executorService.execute(loadTask);
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f14476b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f14482d;
            Callback<T> callback = this.f14483e;
            Objects.requireNonNull(callback);
            if (this.f14487i) {
                callback.mo6852f(this.f14481c, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    callback.mo6853g(this.f14481c, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e2) {
                    Log.m7585b("LoadTask", "Unexpected exception handling load completed", e2);
                    Loader.this.f14477c = new UnexpectedLoaderException(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14484f = iOException;
            int i4 = this.f14485g + 1;
            this.f14485g = i4;
            LoadErrorAction mo6858o = callback.mo6858o(this.f14481c, elapsedRealtime, j2, iOException, i4);
            int i5 = mo6858o.f14478a;
            if (i5 == 3) {
                Loader.this.f14477c = this.f14484f;
            } else if (i5 != 2) {
                if (i5 == 1) {
                    this.f14485g = 1;
                }
                long j3 = mo6858o.f14479b;
                if (j3 == -9223372036854775807L) {
                    j3 = Math.min((this.f14485g - 1) * 1000, 5000);
                }
                m7478b(j3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f14487i;
                    this.f14486h = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f14481c.getClass().getSimpleName();
                    TraceUtil.m7696a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f14481c.mo6865a();
                        TraceUtil.m7697b();
                    } catch (Throwable th) {
                        TraceUtil.m7697b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14486h = null;
                    Thread.interrupted();
                }
                if (this.f14488j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.f14488j) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (Error e3) {
                if (!this.f14488j) {
                    Log.m7585b("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.f14488j) {
                    return;
                }
                Log.m7585b("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            } catch (OutOfMemoryError e5) {
                if (this.f14488j) {
                    return;
                }
                Log.m7585b("LoadTask", "OutOfMemory error loading stream", e5);
                obtainMessage(2, new UnexpectedLoaderException(e5)).sendToTarget();
            }
        }
    }

    public interface Loadable {
        /* renamed from: a */
        void mo6865a() throws IOException;

        /* renamed from: c */
        void mo6866c();
    }

    public interface ReleaseCallback {
        /* renamed from: e */
        void mo6851e();
    }

    public static final class ReleaseTask implements Runnable {

        /* renamed from: b */
        public final ReleaseCallback f14490b;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.f14490b = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14490b.mo6851e();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedLoaderException(java.lang.Throwable r6) {
            /*
                r5 = this;
                java.lang.Class r0 = r6.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r6.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = androidx.room.util.C0576a.m4106e(r1, r2)
                java.lang.String r3 = "Unexpected "
                java.lang.String r4 = ": "
                java.lang.String r0 = com.google.android.exoplayer2.extractor.C1008a.m6437d(r2, r3, r0, r4, r1)
                r5.<init>(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    public Loader(String str) {
        final String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i2 = Util.f14736a;
        this.f14475a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = concat;
                int i3 = Util.f14736a;
                return new Thread(runnable, str2);
            }
        });
    }

    /* renamed from: c */
    public static LoadErrorAction m7469c(boolean z, long j2) {
        return new LoadErrorAction(z ? 1 : 0, j2, null);
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    /* renamed from: a */
    public void mo7013a() throws IOException {
        m7473f(Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public void m7470b() {
        LoadTask<? extends Loadable> loadTask = this.f14476b;
        Assertions.m7518f(loadTask);
        loadTask.m7477a(false);
    }

    /* renamed from: d */
    public boolean m7471d() {
        return this.f14477c != null;
    }

    /* renamed from: e */
    public boolean m7472e() {
        return this.f14476b != null;
    }

    /* renamed from: f */
    public void m7473f(int i2) throws IOException {
        IOException iOException = this.f14477c;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask<? extends Loadable> loadTask = this.f14476b;
        if (loadTask != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = loadTask.f14480b;
            }
            IOException iOException2 = loadTask.f14484f;
            if (iOException2 != null && loadTask.f14485g > i2) {
                throw iOException2;
            }
        }
    }

    /* renamed from: g */
    public void m7474g(@Nullable ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.f14476b;
        if (loadTask != null) {
            loadTask.m7477a(true);
        }
        if (releaseCallback != null) {
            this.f14475a.execute(new ReleaseTask(releaseCallback));
        }
        this.f14475a.shutdown();
    }

    /* renamed from: h */
    public <T extends Loadable> long m7475h(T t, Callback<T> callback, int i2) {
        Looper myLooper = Looper.myLooper();
        Assertions.m7518f(myLooper);
        this.f14477c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(myLooper, t, callback, i2, elapsedRealtime).m7478b(0L);
        return elapsedRealtime;
    }
}
