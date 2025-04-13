package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "MulticastConsumer", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {

    /* renamed from: a */
    @NotNull
    public final WindowLayoutComponent f6731a;

    /* renamed from: b */
    @NotNull
    public final ReentrantLock f6732b = new ReentrantLock();

    /* renamed from: c */
    @GuardedBy
    @NotNull
    public final Map<Activity, MulticastConsumer> f6733c = new LinkedHashMap();

    /* renamed from: d */
    @GuardedBy
    @NotNull
    public final Map<Consumer<WindowLayoutInfo>, Activity> f6734d = new LinkedHashMap();

    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @SuppressLint
    public static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {

        /* renamed from: b */
        @NotNull
        public final Activity f6735b;

        /* renamed from: d */
        @GuardedBy
        @Nullable
        public WindowLayoutInfo f6737d;

        /* renamed from: c */
        @NotNull
        public final ReentrantLock f6736c = new ReentrantLock();

        /* renamed from: e */
        @GuardedBy
        @NotNull
        public final Set<Consumer<WindowLayoutInfo>> f6738e = new LinkedHashSet();

        public MulticastConsumer(@NotNull Activity activity) {
            this.f6735b = activity;
        }

        /* renamed from: a */
        public final void m4437a(@NotNull Consumer<WindowLayoutInfo> consumer) {
            ReentrantLock reentrantLock = this.f6736c;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.f6737d;
                if (windowLayoutInfo != null) {
                    consumer.accept(windowLayoutInfo);
                }
                this.f6738e.add(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            androidx.window.extensions.layout.WindowLayoutInfo value = windowLayoutInfo;
            Intrinsics.m32179h(value, "value");
            ReentrantLock reentrantLock = this.f6736c;
            reentrantLock.lock();
            try {
                this.f6737d = ExtensionsWindowLayoutInfoAdapter.f6739a.m4439b(this.f6735b, value);
                Iterator<T> it = this.f6738e.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(this.f6737d);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(@NotNull WindowLayoutComponent windowLayoutComponent) {
        this.f6731a = windowLayoutComponent;
    }

    @Override // androidx.window.layout.WindowBackend
    /* renamed from: a */
    public void mo4435a(@NotNull Consumer<WindowLayoutInfo> callback) {
        Intrinsics.m32179h(callback, "callback");
        ReentrantLock reentrantLock = this.f6732b;
        reentrantLock.lock();
        try {
            Activity activity = this.f6734d.get(callback);
            if (activity == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.f6733c.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            ReentrantLock reentrantLock2 = multicastConsumer.f6736c;
            reentrantLock2.lock();
            try {
                multicastConsumer.f6738e.remove(callback);
                reentrantLock2.unlock();
                if (multicastConsumer.f6738e.isEmpty()) {
                    this.f6731a.removeWindowLayoutInfoListener(multicastConsumer);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    /* renamed from: b */
    public void mo4436b(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> consumer) {
        Unit unit;
        Intrinsics.m32179h(activity, "activity");
        ReentrantLock reentrantLock = this.f6732b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.f6733c.get(activity);
            if (multicastConsumer == null) {
                unit = null;
            } else {
                multicastConsumer.m4437a(consumer);
                this.f6734d.put(consumer, activity);
                unit = Unit.f63088a;
            }
            if (unit == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.f6733c.put(activity, multicastConsumer2);
                this.f6734d.put(consumer, activity);
                multicastConsumer2.m4437a(consumer);
                this.f6731a.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
