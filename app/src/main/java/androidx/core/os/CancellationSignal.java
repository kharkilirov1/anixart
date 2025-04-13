package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class CancellationSignal {

    /* renamed from: a */
    public boolean f3456a;

    /* renamed from: b */
    public OnCancelListener f3457b;

    /* renamed from: c */
    public Object f3458c;

    /* renamed from: d */
    public boolean f3459d;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1948a(Object obj) {
            ((android.os.CancellationSignal) obj).cancel();
        }

        @DoNotInline
        /* renamed from: b */
        public static android.os.CancellationSignal m1949b() {
            return new android.os.CancellationSignal();
        }
    }

    public interface OnCancelListener {
        void onCancel();
    }

    /* renamed from: a */
    public void m1945a() {
        synchronized (this) {
            if (this.f3456a) {
                return;
            }
            this.f3456a = true;
            this.f3459d = true;
            OnCancelListener onCancelListener = this.f3457b;
            Object obj = this.f3458c;
            if (onCancelListener != null) {
                try {
                    onCancelListener.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3459d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                Api16Impl.m1948a(obj);
            }
            synchronized (this) {
                this.f3459d = false;
                notifyAll();
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public Object m1946b() {
        Object obj;
        synchronized (this) {
            if (this.f3458c == null) {
                android.os.CancellationSignal m1949b = Api16Impl.m1949b();
                this.f3458c = m1949b;
                if (this.f3456a) {
                    Api16Impl.m1948a(m1949b);
                }
            }
            obj = this.f3458c;
        }
        return obj;
    }

    /* renamed from: c */
    public void m1947c(@Nullable OnCancelListener onCancelListener) {
        synchronized (this) {
            while (this.f3459d) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f3457b == onCancelListener) {
                return;
            }
            this.f3457b = onCancelListener;
            if (this.f3456a) {
                onCancelListener.onCancel();
            }
        }
    }
}
