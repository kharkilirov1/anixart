package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarAdapter;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SidecarCompat.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {

    /* renamed from: f */
    @NotNull
    public static final Companion f6766f = new Companion(null);

    /* renamed from: a */
    @Nullable
    public final SidecarInterface f6767a;

    /* renamed from: b */
    @NotNull
    public final SidecarAdapter f6768b;

    /* renamed from: c */
    @NotNull
    public final Map<IBinder, Activity> f6769c;

    /* renamed from: d */
    @NotNull
    public final Map<Activity, ComponentCallbacks> f6770d;

    /* renamed from: e */
    @Nullable
    public ExtensionInterfaceCompat.ExtensionCallbackInterface f6771e;

    /* compiled from: SidecarCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "", "TAG", "Ljava/lang/String;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        @Nullable
        /* renamed from: a */
        public final IBinder m4462a(@Nullable Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @Nullable
        /* renamed from: b */
        public final SidecarInterface m4463b(@NotNull Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @Nullable
        /* renamed from: c */
        public final Version m4464c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.f6699g.m4422a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        /* renamed from: a */
        @NotNull
        public final ExtensionInterfaceCompat.ExtensionCallbackInterface f6772a;

        /* renamed from: b */
        @NotNull
        public final ReentrantLock f6773b = new ReentrantLock();

        /* renamed from: c */
        @GuardedBy
        @NotNull
        public final WeakHashMap<Activity, WindowLayoutInfo> f6774c = new WeakHashMap<>();

        public DistinctElementCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            this.f6772a = extensionCallbackInterface;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        /* renamed from: a */
        public void mo4434a(@NotNull Activity activity, @NotNull WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.m32179h(activity, "activity");
            ReentrantLock reentrantLock = this.f6773b;
            reentrantLock.lock();
            try {
                if (Intrinsics.m32174c(windowLayoutInfo, this.f6774c.get(activity))) {
                    return;
                }
                this.f6774c.put(activity, windowLayoutInfo);
                reentrantLock.unlock();
                this.f6772a.mo4434a(activity, windowLayoutInfo);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "Landroid/os/IBinder;", FirebaseMessagingService.EXTRA_TOKEN, "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        @NotNull
        public final SidecarAdapter f6775a;

        /* renamed from: b */
        @NotNull
        public final SidecarInterface.SidecarCallback f6776b;

        /* renamed from: c */
        @NotNull
        public final ReentrantLock f6777c;

        /* renamed from: d */
        @GuardedBy
        @Nullable
        public SidecarDeviceState f6778d;

        /* renamed from: e */
        @GuardedBy
        @NotNull
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f6779e;

        public DistinctSidecarElementCallback(@NotNull SidecarAdapter sidecarAdapter, @NotNull SidecarInterface.SidecarCallback sidecarCallback) {
            Intrinsics.m32179h(sidecarAdapter, "sidecarAdapter");
            this.f6775a = sidecarAdapter;
            this.f6776b = sidecarCallback;
            this.f6777c = new ReentrantLock();
            this.f6779e = new WeakHashMap<>();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        
            if (r1.m4452b(r2) == r1.m4452b(r6)) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onDeviceStateChanged(@org.jetbrains.annotations.NotNull androidx.window.sidecar.SidecarDeviceState r6) {
            /*
                r5 = this;
                java.lang.String r0 = "newDeviceState"
                kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
                java.util.concurrent.locks.ReentrantLock r0 = r5.f6777c
                r0.lock()
                androidx.window.layout.SidecarAdapter r1 = r5.f6775a     // Catch: java.lang.Throwable -> L3c
                androidx.window.sidecar.SidecarDeviceState r2 = r5.f6778d     // Catch: java.lang.Throwable -> L3c
                java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L3c
                boolean r1 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r6)     // Catch: java.lang.Throwable -> L3c
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1a
                goto L2b
            L1a:
                if (r2 != 0) goto L1d
                goto L2a
            L1d:
                androidx.window.layout.SidecarAdapter$Companion r1 = androidx.window.layout.SidecarAdapter.f6760b     // Catch: java.lang.Throwable -> L3c
                int r2 = r1.m4452b(r2)     // Catch: java.lang.Throwable -> L3c
                int r1 = r1.m4452b(r6)     // Catch: java.lang.Throwable -> L3c
                if (r2 != r1) goto L2a
                goto L2b
            L2a:
                r3 = 0
            L2b:
                if (r3 == 0) goto L31
                r0.unlock()
                return
            L31:
                r5.f6778d = r6     // Catch: java.lang.Throwable -> L3c
                androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r5.f6776b     // Catch: java.lang.Throwable -> L3c
                r1.onDeviceStateChanged(r6)     // Catch: java.lang.Throwable -> L3c
                r0.unlock()
                return
            L3c:
                r6 = move-exception
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            boolean m4447b;
            Intrinsics.m32179h(token, "token");
            Intrinsics.m32179h(newLayout, "newLayout");
            synchronized (this.f6777c) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = this.f6779e.get(token);
                SidecarAdapter sidecarAdapter = this.f6775a;
                Objects.requireNonNull(sidecarAdapter);
                if (Intrinsics.m32174c(sidecarWindowLayoutInfo, newLayout)) {
                    m4447b = true;
                } else if (sidecarWindowLayoutInfo == null) {
                    m4447b = false;
                } else {
                    SidecarAdapter.Companion companion = SidecarAdapter.f6760b;
                    m4447b = sidecarAdapter.m4447b(companion.m4453c(sidecarWindowLayoutInfo), companion.m4453c(newLayout));
                }
                if (m4447b) {
                    return;
                }
                this.f6779e.put(token, newLayout);
                this.f6776b.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        @NotNull
        public final SidecarCompat f6780b;

        /* renamed from: c */
        @NotNull
        public final WeakReference<Activity> f6781c;

        public FirstAttachAdapter(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            this.f6780b = sidecarCompat;
            this.f6781c = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.m32179h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f6781c.get();
            IBinder m4462a = SidecarCompat.f6766f.m4462a(activity);
            if (activity == null || m4462a == null) {
                return;
            }
            this.f6780b.m4460e(m4462a, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.m32179h(view, "view");
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\u000b"}, m31884d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        @SuppressLint
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterface;
            Intrinsics.m32179h(newDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.f6769c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder m4462a = SidecarCompat.f6766f.m4462a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (m4462a != null && (sidecarInterface = sidecarCompat.f6767a) != null) {
                    sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(m4462a);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.f6771e;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.mo4434a(activity, sidecarCompat.f6768b.m4448c(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.m32179h(windowToken, "windowToken");
            Intrinsics.m32179h(newLayout, "newLayout");
            Activity activity = SidecarCompat.this.f6769c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            SidecarAdapter sidecarAdapter = sidecarCompat.f6768b;
            SidecarInterface sidecarInterface = sidecarCompat.f6767a;
            SidecarDeviceState deviceState = sidecarInterface == null ? null : sidecarInterface.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo m4448c = sidecarAdapter.m4448c(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.f6771e;
            if (extensionCallbackInterface == null) {
                return;
            }
            extensionCallbackInterface.mo4434a(activity, m4448c);
        }
    }

    public SidecarCompat(@NotNull Context context) {
        SidecarInterface m4463b = f6766f.m4463b(context);
        SidecarAdapter sidecarAdapter = new SidecarAdapter(null, 1);
        this.f6767a = m4463b;
        this.f6768b = sidecarAdapter;
        this.f6769c = new LinkedHashMap();
        this.f6770d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /* renamed from: a */
    public void mo4431a(@NotNull Activity activity) {
        IBinder m4462a = f6766f.m4462a(activity);
        if (m4462a != null) {
            m4460e(m4462a, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /* renamed from: b */
    public void mo4432b(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        this.f6771e = new DistinctElementCallback(extensionCallbackInterface);
        SidecarInterface sidecarInterface = this.f6767a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f6768b, new TranslatingCallback()));
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /* renamed from: c */
    public void mo4433c(@NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.m32179h(activity, "activity");
        IBinder m4462a = f6766f.m4462a(activity);
        if (m4462a == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f6767a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(m4462a);
        }
        activity.unregisterComponentCallbacks(this.f6770d.get(activity));
        this.f6770d.remove(activity);
        boolean z = this.f6769c.size() == 1;
        this.f6769c.remove(m4462a);
        if (!z || (sidecarInterface = this.f6767a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: d */
    public final WindowLayoutInfo m4459d(@NotNull Activity activity) {
        Intrinsics.m32179h(activity, "activity");
        IBinder m4462a = f6766f.m4462a(activity);
        if (m4462a == null) {
            return new WindowLayoutInfo(EmptyList.f63144b);
        }
        SidecarInterface sidecarInterface = this.f6767a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(m4462a);
        SidecarAdapter sidecarAdapter = this.f6768b;
        SidecarInterface sidecarInterface2 = this.f6767a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.m4448c(windowLayoutInfo, deviceState);
    }

    /* renamed from: e */
    public final void m4460e(@NotNull IBinder iBinder, @NotNull final Activity activity) {
        SidecarInterface sidecarInterface;
        this.f6769c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f6767a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f6769c.size() == 1 && (sidecarInterface = this.f6767a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.f6771e;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.mo4434a(activity, m4459d(activity));
        }
        if (this.f6770d.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@NotNull Configuration newConfig) {
                    Intrinsics.m32179h(newConfig, "newConfig");
                    SidecarCompat sidecarCompat = SidecarCompat.this;
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface2 = sidecarCompat.f6771e;
                    if (extensionCallbackInterface2 == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface2.mo4434a(activity2, sidecarCompat.m4459d(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.f6770d.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0082 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:21:0x005d, B:23:0x0065, B:28:0x0086, B:30:0x008e, B:35:0x00ae, B:37:0x00b6, B:40:0x00bc, B:41:0x00f2, B:43:0x010e, B:47:0x0112, B:49:0x0141, B:53:0x014a, B:54:0x0151, B:55:0x0152, B:56:0x0159, B:58:0x00bf, B:60:0x00ea, B:62:0x015a, B:63:0x0161, B:64:0x0162, B:65:0x0169, B:66:0x016a, B:67:0x0175, B:68:0x00aa, B:69:0x0094, B:72:0x009b, B:73:0x0176, B:74:0x0181, B:75:0x0082, B:76:0x006b, B:79:0x0072, B:80:0x0182, B:81:0x018d, B:82:0x0059, B:83:0x0042, B:86:0x0049, B:87:0x0039, B:88:0x0031, B:89:0x018e, B:90:0x0199, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #2 }] */
    @android.annotation.SuppressLint
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4461f() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.m4461f():boolean");
    }
}
