package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import androidx.core.util.Consumer;
import androidx.window.layout.ExtensionInterfaceCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SidecarWindowBackend.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SidecarWindowBackend implements WindowBackend {

    /* renamed from: d */
    @Nullable
    public static volatile SidecarWindowBackend f6786d;

    /* renamed from: a */
    @GuardedBy
    @VisibleForTesting
    @Nullable
    public ExtensionInterfaceCompat f6788a;

    /* renamed from: b */
    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> f6789b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    @NotNull
    public static final Companion f6785c = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final ReentrantLock f6787e = new ReentrantLock();

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31884d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "Landroidx/window/layout/SidecarWindowBackend;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @VisibleForTesting
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public ExtensionListenerImpl() {
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        @SuppressLint
        /* renamed from: a */
        public void mo4434a(@NotNull Activity activity, @NotNull WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.m32179h(activity, "activity");
            Iterator<WindowLayoutChangeCallbackWrapper> it = SidecarWindowBackend.this.f6789b.iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (Intrinsics.m32174c(next.f6791a, activity)) {
                    next.f6794d = windowLayoutInfo;
                    next.f6792b.execute(new RunnableC0207a(next, windowLayoutInfo, 5));
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class WindowLayoutChangeCallbackWrapper {

        /* renamed from: a */
        @NotNull
        public final Activity f6791a;

        /* renamed from: b */
        @NotNull
        public final Executor f6792b;

        /* renamed from: c */
        @NotNull
        public final Consumer<WindowLayoutInfo> f6793c;

        /* renamed from: d */
        @Nullable
        public WindowLayoutInfo f6794d;

        public WindowLayoutChangeCallbackWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> consumer) {
            this.f6791a = activity;
            this.f6792b = executor;
            this.f6793c = consumer;
        }
    }

    @VisibleForTesting
    public SidecarWindowBackend(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.f6788a = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.f6788a;
        if (extensionInterfaceCompat2 == null) {
            return;
        }
        extensionInterfaceCompat2.mo4432b(new ExtensionListenerImpl());
    }

    @Override // androidx.window.layout.WindowBackend
    /* renamed from: a */
    public void mo4435a(@NotNull Consumer<WindowLayoutInfo> callback) {
        ExtensionInterfaceCompat extensionInterfaceCompat;
        Intrinsics.m32179h(callback, "callback");
        synchronized (f6787e) {
            if (this.f6788a == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<WindowLayoutChangeCallbackWrapper> it = this.f6789b.iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.f6793c == callback) {
                    arrayList.add(next);
                }
            }
            this.f6789b.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = ((WindowLayoutChangeCallbackWrapper) it2.next()).f6791a;
                CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.f6789b;
                boolean z = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<T> it3 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (Intrinsics.m32174c(((WindowLayoutChangeCallbackWrapper) it3.next()).f6791a, activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z && (extensionInterfaceCompat = this.f6788a) != null) {
                    extensionInterfaceCompat.mo4433c(activity);
                }
            }
        }
    }

    @Override // androidx.window.layout.WindowBackend
    /* renamed from: b */
    public void mo4436b(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> consumer) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        Intrinsics.m32179h(activity, "activity");
        ReentrantLock reentrantLock = f6787e;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat extensionInterfaceCompat = this.f6788a;
            if (extensionInterfaceCompat == null) {
                ((C0687b) consumer).f6810b.mo34150D(new WindowLayoutInfo(EmptyList.f63144b));
                return;
            }
            CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.f6789b;
            boolean z = false;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.m32174c(((WindowLayoutChangeCallbackWrapper) it.next()).f6791a, activity)) {
                        z = true;
                        break;
                    }
                }
            }
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, consumer);
            this.f6789b.add(windowLayoutChangeCallbackWrapper);
            if (z) {
                Iterator<T> it2 = this.f6789b.iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (Intrinsics.m32174c(activity, ((WindowLayoutChangeCallbackWrapper) obj).f6791a)) {
                            break;
                        }
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.f6794d;
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.f6794d = windowLayoutInfo;
                    windowLayoutChangeCallbackWrapper.f6792b.execute(new RunnableC0207a(windowLayoutChangeCallbackWrapper, windowLayoutInfo, 5));
                }
            } else {
                extensionInterfaceCompat.mo4431a(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
