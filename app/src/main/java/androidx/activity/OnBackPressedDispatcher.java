package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    @Nullable
    public final Runnable f223a;

    /* renamed from: b */
    public final ArrayDeque<OnBackPressedCallback> f224b;

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* renamed from: b */
        public final Lifecycle f225b;

        /* renamed from: c */
        public final OnBackPressedCallback f226c;

        /* renamed from: d */
        @Nullable
        public Cancellable f227d;

        public LifecycleOnBackPressedCancellable(@NonNull Lifecycle lifecycle, @NonNull OnBackPressedCallback onBackPressedCallback) {
            this.f225b = lifecycle;
            this.f226c = onBackPressedCallback;
            lifecycle.mo3187a(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                OnBackPressedCallback onBackPressedCallback = this.f226c;
                onBackPressedDispatcher.f224b.add(onBackPressedCallback);
                OnBackPressedCancellable onBackPressedCancellable = onBackPressedDispatcher.new OnBackPressedCancellable(onBackPressedCallback);
                onBackPressedCallback.f222b.add(onBackPressedCancellable);
                this.f227d = onBackPressedCancellable;
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.f227d;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.f225b.mo3189c(this);
            this.f226c.f222b.remove(this);
            Cancellable cancellable = this.f227d;
            if (cancellable != null) {
                cancellable.cancel();
                this.f227d = null;
            }
        }
    }

    public class OnBackPressedCancellable implements Cancellable {

        /* renamed from: b */
        public final OnBackPressedCallback f229b;

        public OnBackPressedCancellable(OnBackPressedCallback onBackPressedCallback) {
            this.f229b = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            OnBackPressedDispatcher.this.f224b.remove(this.f229b);
            this.f229b.f222b.remove(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @SuppressLint
    @MainThread
    /* renamed from: a */
    public void m310a(@NonNull LifecycleOwner lifecycleOwner, @NonNull OnBackPressedCallback onBackPressedCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo3188b() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.f222b.add(new LifecycleOnBackPressedCancellable(lifecycle, onBackPressedCallback));
    }

    @MainThread
    /* renamed from: b */
    public void m311b() {
        Iterator<OnBackPressedCallback> descendingIterator = this.f224b.descendingIterator();
        while (descendingIterator.hasNext()) {
            OnBackPressedCallback next = descendingIterator.next();
            if (next.f221a) {
                next.mo308d();
                return;
            }
        }
        Runnable runnable = this.f223a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.f224b = new ArrayDeque<>();
        this.f223a = runnable;
    }
}
