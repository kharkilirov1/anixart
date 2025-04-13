package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: n */
    public static final ThreadLocal<Boolean> f15396n = new zaq();

    /* renamed from: a */
    public final Object f15397a;

    /* renamed from: b */
    @NonNull
    public final CallbackHandler<R> f15398b;

    /* renamed from: c */
    @NonNull
    public final WeakReference<GoogleApiClient> f15399c;

    /* renamed from: d */
    public final CountDownLatch f15400d;

    /* renamed from: e */
    public final ArrayList<PendingResult.StatusListener> f15401e;

    /* renamed from: f */
    @Nullable
    public ResultCallback<? super R> f15402f;

    /* renamed from: g */
    public final AtomicReference<zadb> f15403g;

    /* renamed from: h */
    @Nullable
    public R f15404h;

    /* renamed from: i */
    public Status f15405i;

    /* renamed from: j */
    public volatile boolean f15406j;

    /* renamed from: k */
    public boolean f15407k;

    /* renamed from: l */
    public boolean f15408l;

    /* renamed from: m */
    public boolean f15409m;

    @KeepName
    private zas mResultGuardian;

    @Deprecated
    public BasePendingResult() {
        this.f15397a = new Object();
        this.f15400d = new CountDownLatch(1);
        this.f15401e = new ArrayList<>();
        this.f15403g = new AtomicReference<>();
        this.f15409m = false;
        this.f15398b = new CallbackHandler<>(Looper.getMainLooper());
        this.f15399c = new WeakReference<>(null);
    }

    /* renamed from: k */
    public static void m7973k(@Nullable Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: b */
    public final void mo7955b(@NonNull PendingResult.StatusListener statusListener) {
        synchronized (this.f15397a) {
            if (m7975f()) {
                statusListener.mo7957a(this.f15405i);
            } else {
                this.f15401e.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    /* renamed from: c */
    public final R mo7956c(long j2, @NonNull TimeUnit timeUnit) {
        if (j2 > 0) {
            Preconditions.m8131f("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.m8134i(!this.f15406j, "Result has already been consumed.");
        try {
            if (!this.f15400d.await(j2, timeUnit)) {
                m7974e(Status.f15377j);
            }
        } catch (InterruptedException unused) {
            m7974e(Status.f15375h);
        }
        Preconditions.m8134i(m7975f(), "Result is not ready.");
        return m7977h();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public abstract R mo7880d(@NonNull Status status);

    @KeepForSdk
    @Deprecated
    /* renamed from: e */
    public final void m7974e(@NonNull Status status) {
        synchronized (this.f15397a) {
            if (!m7975f()) {
                mo7882a(mo7880d(status));
                this.f15408l = true;
            }
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public final boolean m7975f() {
        return this.f15400d.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void mo7882a(@NonNull R r) {
        synchronized (this.f15397a) {
            if (this.f15408l || this.f15407k) {
                m7973k(r);
                return;
            }
            m7975f();
            Preconditions.m8134i(!m7975f(), "Results have already been set");
            Preconditions.m8134i(!this.f15406j, "Result has already been consumed");
            m7978i(r);
        }
    }

    /* renamed from: h */
    public final R m7977h() {
        R r;
        synchronized (this.f15397a) {
            Preconditions.m8134i(!this.f15406j, "Result has already been consumed.");
            Preconditions.m8134i(m7975f(), "Result is not ready.");
            r = this.f15404h;
            this.f15404h = null;
            this.f15402f = null;
            this.f15406j = true;
        }
        zadb andSet = this.f15403g.getAndSet(null);
        if (andSet != null) {
            andSet.f15581a.f15582a.remove(this);
        }
        Objects.requireNonNull(r, "null reference");
        return r;
    }

    /* renamed from: i */
    public final void m7978i(R r) {
        this.f15404h = r;
        this.f15405i = r.mo7862k();
        this.f15400d.countDown();
        if (this.f15407k) {
            this.f15402f = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f15402f;
            if (resultCallback != null) {
                this.f15398b.removeMessages(2);
                CallbackHandler<R> callbackHandler = this.f15398b;
                R m7977h = m7977h();
                Objects.requireNonNull(callbackHandler);
                callbackHandler.sendMessage(callbackHandler.obtainMessage(1, new Pair(resultCallback, m7977h)));
            } else if (this.f15404h instanceof Releasable) {
                this.mResultGuardian = new zas(this);
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f15401e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).mo7957a(this.f15405i);
        }
        this.f15401e.clear();
    }

    /* renamed from: j */
    public final void m7979j() {
        boolean z = true;
        if (!this.f15409m && !f15396n.get().booleanValue()) {
            z = false;
        }
        this.f15409m = z;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.mo7961a(result);
                    return;
                } catch (RuntimeException e2) {
                    BasePendingResult.m7973k(result);
                    throw e2;
                }
            }
            if (i2 == 2) {
                ((BasePendingResult) message.obj).m7974e(Status.f15377j);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }

        public CallbackHandler(@NonNull Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    public BasePendingResult(@Nullable GoogleApiClient googleApiClient) {
        this.f15397a = new Object();
        this.f15400d = new CountDownLatch(1);
        this.f15401e = new ArrayList<>();
        this.f15403g = new AtomicReference<>();
        this.f15409m = false;
        this.f15398b = new CallbackHandler<>(googleApiClient != null ? googleApiClient.mo7952e() : Looper.getMainLooper());
        this.f15399c = new WeakReference<>(googleApiClient);
    }
}
