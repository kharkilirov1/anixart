package com.airbnb.epoxy;

import android.os.Handler;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class AsyncEpoxyDiffer {

    /* renamed from: a */
    public final Executor f6843a;

    /* renamed from: b */
    public final ResultCallback f6844b;

    /* renamed from: c */
    public final DiffUtil.ItemCallback<EpoxyModel<?>> f6845c;

    /* renamed from: e */
    @Nullable
    public volatile List<? extends EpoxyModel<?>> f6847e;

    /* renamed from: d */
    public final GenerationTracker f6846d = new GenerationTracker(null);

    /* renamed from: f */
    @NonNull
    public volatile List<? extends EpoxyModel<?>> f6848f = Collections.emptyList();

    public static class DiffCallback extends DiffUtil.Callback {

        /* renamed from: a */
        public final List<? extends EpoxyModel<?>> f6858a;

        /* renamed from: b */
        public final List<? extends EpoxyModel<?>> f6859b;

        /* renamed from: c */
        public final DiffUtil.ItemCallback<EpoxyModel<?>> f6860c;

        public DiffCallback(List<? extends EpoxyModel<?>> list, List<? extends EpoxyModel<?>> list2, DiffUtil.ItemCallback<EpoxyModel<?>> itemCallback) {
            this.f6858a = list;
            this.f6859b = list2;
            this.f6860c = itemCallback;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: a */
        public boolean mo3437a(int i2, int i3) {
            return this.f6860c.mo3542a(this.f6858a.get(i2), this.f6859b.get(i3));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: b */
        public boolean mo3438b(int i2, int i3) {
            return this.f6860c.mo3543b(this.f6858a.get(i2), this.f6859b.get(i3));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        @Nullable
        /* renamed from: c */
        public Object mo3492c(int i2, int i3) {
            return this.f6860c.mo3544c(this.f6858a.get(i2), this.f6859b.get(i3));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: d */
        public int mo3439d() {
            return this.f6859b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: e */
        public int mo3440e() {
            return this.f6858a.size();
        }
    }

    public static class GenerationTracker {

        /* renamed from: a */
        public volatile int f6861a;

        /* renamed from: b */
        public volatile int f6862b;

        public GenerationTracker() {
        }

        /* renamed from: a */
        public synchronized boolean m4478a() {
            return this.f6861a > this.f6862b;
        }

        public GenerationTracker(RunnableC06961 runnableC06961) {
        }
    }

    public interface ResultCallback {
        /* renamed from: g */
        void mo4479g(@NonNull DiffResult diffResult);
    }

    public AsyncEpoxyDiffer(@NonNull Handler handler, @NonNull ResultCallback resultCallback, @NonNull DiffUtil.ItemCallback<EpoxyModel<?>> itemCallback) {
        this.f6843a = new HandlerExecutor(handler);
        this.f6844b = resultCallback;
        this.f6845c = itemCallback;
    }

    @AnyThread
    /* renamed from: a */
    public synchronized boolean m4475a(@Nullable List<EpoxyModel<?>> list) {
        boolean m4478a;
        int i2;
        GenerationTracker generationTracker = this.f6846d;
        synchronized (generationTracker) {
            m4478a = generationTracker.m4478a();
            generationTracker.f6862b = generationTracker.f6861a;
        }
        GenerationTracker generationTracker2 = this.f6846d;
        synchronized (generationTracker2) {
            i2 = generationTracker2.f6861a + 1;
            generationTracker2.f6861a = i2;
        }
        m4477c(list, i2);
        return m4478a;
    }

    /* renamed from: b */
    public final void m4476b(final int i2, @Nullable final List<? extends EpoxyModel<?>> list, @Nullable final DiffResult diffResult) {
        MainThreadExecutor.f7002d.execute(new Runnable() { // from class: com.airbnb.epoxy.AsyncEpoxyDiffer.2
            @Override // java.lang.Runnable
            public void run() {
                boolean m4477c = AsyncEpoxyDiffer.this.m4477c(list, i2);
                DiffResult diffResult2 = diffResult;
                if (diffResult2 == null || !m4477c) {
                    return;
                }
                AsyncEpoxyDiffer.this.f6844b.mo4479g(diffResult2);
            }
        });
    }

    @AnyThread
    /* renamed from: c */
    public final synchronized boolean m4477c(@Nullable List<? extends EpoxyModel<?>> list, int i2) {
        boolean z;
        GenerationTracker generationTracker = this.f6846d;
        synchronized (generationTracker) {
            z = generationTracker.f6861a == i2 && i2 > generationTracker.f6862b;
            if (z) {
                generationTracker.f6862b = i2;
            }
        }
        if (!z) {
            return false;
        }
        this.f6847e = list;
        if (list == null) {
            this.f6848f = Collections.emptyList();
        } else {
            this.f6848f = Collections.unmodifiableList(list);
        }
        return true;
    }
}
