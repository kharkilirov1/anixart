package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class SnackbarManager {

    /* renamed from: e */
    public static SnackbarManager f18866e;

    /* renamed from: a */
    @NonNull
    public final Object f18867a = new Object();

    /* renamed from: b */
    @NonNull
    public final Handler f18868b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager snackbarManager = SnackbarManager.this;
            SnackbarRecord snackbarRecord = (SnackbarRecord) message.obj;
            synchronized (snackbarManager.f18867a) {
                if (snackbarManager.f18869c == snackbarRecord || snackbarManager.f18870d == snackbarRecord) {
                    snackbarManager.m10383a(snackbarRecord, 2);
                }
            }
            return true;
        }
    });

    /* renamed from: c */
    @Nullable
    public SnackbarRecord f18869c;

    /* renamed from: d */
    @Nullable
    public SnackbarRecord f18870d;

    public interface Callback {
        /* renamed from: a */
        void mo10372a();

        /* renamed from: b */
        void mo10373b(int i2);
    }

    public static class SnackbarRecord {

        /* renamed from: a */
        @NonNull
        public final WeakReference<Callback> f18872a;

        /* renamed from: b */
        public int f18873b;

        /* renamed from: c */
        public boolean f18874c;

        public SnackbarRecord(int i2, Callback callback) {
            this.f18872a = new WeakReference<>(callback);
            this.f18873b = i2;
        }
    }

    /* renamed from: b */
    public static SnackbarManager m10382b() {
        if (f18866e == null) {
            f18866e = new SnackbarManager();
        }
        return f18866e;
    }

    /* renamed from: a */
    public final boolean m10383a(@NonNull SnackbarRecord snackbarRecord, int i2) {
        Callback callback = snackbarRecord.f18872a.get();
        if (callback == null) {
            return false;
        }
        this.f18868b.removeCallbacksAndMessages(snackbarRecord);
        callback.mo10373b(i2);
        return true;
    }

    /* renamed from: c */
    public final boolean m10384c(Callback callback) {
        SnackbarRecord snackbarRecord = this.f18869c;
        if (snackbarRecord != null) {
            return callback != null && snackbarRecord.f18872a.get() == callback;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m10385d(Callback callback) {
        SnackbarRecord snackbarRecord = this.f18870d;
        if (snackbarRecord != null) {
            return callback != null && snackbarRecord.f18872a.get() == callback;
        }
        return false;
    }

    /* renamed from: e */
    public void m10386e(Callback callback) {
        synchronized (this.f18867a) {
            if (m10384c(callback)) {
                SnackbarRecord snackbarRecord = this.f18869c;
                if (!snackbarRecord.f18874c) {
                    snackbarRecord.f18874c = true;
                    this.f18868b.removeCallbacksAndMessages(snackbarRecord);
                }
            }
        }
    }

    /* renamed from: f */
    public void m10387f(Callback callback) {
        synchronized (this.f18867a) {
            if (m10384c(callback)) {
                SnackbarRecord snackbarRecord = this.f18869c;
                if (snackbarRecord.f18874c) {
                    snackbarRecord.f18874c = false;
                    m10388g(snackbarRecord);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m10388g(@NonNull SnackbarRecord snackbarRecord) {
        int i2 = snackbarRecord.f18873b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        this.f18868b.removeCallbacksAndMessages(snackbarRecord);
        Handler handler = this.f18868b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i2);
    }

    /* renamed from: h */
    public final void m10389h() {
        SnackbarRecord snackbarRecord = this.f18870d;
        if (snackbarRecord != null) {
            this.f18869c = snackbarRecord;
            this.f18870d = null;
            Callback callback = snackbarRecord.f18872a.get();
            if (callback != null) {
                callback.mo10372a();
            } else {
                this.f18869c = null;
            }
        }
    }
}
