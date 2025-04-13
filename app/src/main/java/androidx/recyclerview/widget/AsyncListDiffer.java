package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class AsyncListDiffer<T> {

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1 */
    class RunnableC04961 implements Runnable {

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$2, reason: invalid class name */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RunnableC04961 f5179b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f5179b);
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DiffUtil.m3537a(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: a */
                public boolean mo3437a(int i2, int i3) {
                    Objects.requireNonNull(RunnableC04961.this);
                    throw null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: b */
                public boolean mo3438b(int i2, int i3) {
                    Objects.requireNonNull(RunnableC04961.this);
                    throw null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                @Nullable
                /* renamed from: c */
                public Object mo3492c(int i2, int i3) {
                    Objects.requireNonNull(RunnableC04961.this);
                    throw null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: d */
                public int mo3439d() {
                    Objects.requireNonNull(RunnableC04961.this);
                    throw null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: e */
                public int mo3440e() {
                    Objects.requireNonNull(RunnableC04961.this);
                    throw null;
                }
            });
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface ListListener<T> {
    }

    public static class MainThreadExecutor implements Executor {

        /* renamed from: b */
        public final Handler f5180b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f5180b.post(runnable);
        }
    }

    static {
        new MainThreadExecutor();
    }
}
