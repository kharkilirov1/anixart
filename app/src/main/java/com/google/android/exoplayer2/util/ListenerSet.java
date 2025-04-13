package com.google.android.exoplayer2.util;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.RunnableC0998d;
import com.google.android.exoplayer2.util.FlagSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ListenerSet<T> {

    /* renamed from: a */
    public final Clock f14641a;

    /* renamed from: b */
    public final HandlerWrapper f14642b;

    /* renamed from: c */
    public final IterationFinishedEvent<T> f14643c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<ListenerHolder<T>> f14644d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f14645e = new ArrayDeque<>();

    /* renamed from: f */
    public final ArrayDeque<Runnable> f14646f = new ArrayDeque<>();

    /* renamed from: g */
    public boolean f14647g;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T> {
        /* renamed from: e */
        void mo5568e(T t, FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {

        /* renamed from: a */
        public final T f14648a;

        /* renamed from: b */
        public FlagSet.Builder f14649b = new FlagSet.Builder();

        /* renamed from: c */
        public boolean f14650c;

        /* renamed from: d */
        public boolean f14651d;

        public ListenerHolder(T t) {
            this.f14648a = t;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.f14648a.equals(((ListenerHolder) obj).f14648a);
        }

        public int hashCode() {
            return this.f14648a.hashCode();
        }
    }

    public ListenerSet(CopyOnWriteArraySet<ListenerHolder<T>> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this.f14641a = clock;
        this.f14644d = copyOnWriteArraySet;
        this.f14643c = iterationFinishedEvent;
        this.f14642b = clock.mo7529c(looper, new C1176a(this, 0));
    }

    /* renamed from: a */
    public static void m7578a(CopyOnWriteArraySet copyOnWriteArraySet, int i2, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            if (!listenerHolder.f14651d) {
                if (i2 != -1) {
                    FlagSet.Builder builder = listenerHolder.f14649b;
                    Assertions.m7516d(!builder.f14639b);
                    builder.f14638a.append(i2, true);
                }
                listenerHolder.f14650c = true;
                event.invoke(listenerHolder.f14648a);
            }
        }
    }

    /* renamed from: b */
    public void m7579b(T t) {
        if (this.f14647g) {
            return;
        }
        Objects.requireNonNull(t);
        this.f14644d.add(new ListenerHolder<>(t));
    }

    /* renamed from: c */
    public void m7580c() {
        if (this.f14646f.isEmpty()) {
            return;
        }
        if (!this.f14642b.mo7570e(0)) {
            HandlerWrapper handlerWrapper = this.f14642b;
            handlerWrapper.mo7569d(handlerWrapper.mo7568c(0));
        }
        boolean z = !this.f14645e.isEmpty();
        this.f14645e.addAll(this.f14646f);
        this.f14646f.clear();
        if (z) {
            return;
        }
        while (!this.f14645e.isEmpty()) {
            this.f14645e.peekFirst().run();
            this.f14645e.removeFirst();
        }
    }

    /* renamed from: d */
    public void m7581d(int i2, Event<T> event) {
        this.f14646f.add(new RunnableC0998d(new CopyOnWriteArraySet(this.f14644d), i2, event));
    }

    /* renamed from: e */
    public void m7582e() {
        Iterator<ListenerHolder<T>> it = this.f14644d.iterator();
        while (it.hasNext()) {
            ListenerHolder<T> next = it.next();
            IterationFinishedEvent<T> iterationFinishedEvent = this.f14643c;
            next.f14651d = true;
            if (next.f14650c) {
                iterationFinishedEvent.mo5568e(next.f14648a, next.f14649b.m7553b());
            }
        }
        this.f14644d.clear();
        this.f14647g = true;
    }

    /* renamed from: f */
    public void m7583f(T t) {
        Iterator<ListenerHolder<T>> it = this.f14644d.iterator();
        while (it.hasNext()) {
            ListenerHolder<T> next = it.next();
            if (next.f14648a.equals(t)) {
                IterationFinishedEvent<T> iterationFinishedEvent = this.f14643c;
                next.f14651d = true;
                if (next.f14650c) {
                    iterationFinishedEvent.mo5568e(next.f14648a, next.f14649b.m7553b());
                }
                this.f14644d.remove(next);
            }
        }
    }
}
