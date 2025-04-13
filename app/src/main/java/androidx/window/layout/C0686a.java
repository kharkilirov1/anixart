package androidx.window.layout;

import androidx.window.layout.WindowInfoTracker;

/* compiled from: WindowInfoTracker.kt */
/* renamed from: androidx.window.layout.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0686a {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.f6795a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.window.layout.WindowInfoTracker m4469a(@org.jetbrains.annotations.NotNull android.content.Context r7) {
        /*
            androidx.window.layout.WindowInfoTracker$Companion r0 = androidx.window.layout.WindowInfoTracker.f6795a
            java.util.Objects.requireNonNull(r0)
            androidx.window.layout.WindowInfoTrackerImpl r0 = new androidx.window.layout.WindowInfoTrackerImpl
            androidx.window.layout.WindowMetricsCalculatorCompat r1 = androidx.window.layout.WindowMetricsCalculatorCompat.f6809a
            r2 = 0
            androidx.window.layout.SafeWindowLayoutComponentProvider r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.f6753a     // Catch: java.lang.Throwable -> L19
            androidx.window.extensions.layout.WindowLayoutComponent r3 = r3.m4443b()     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L13
            goto L19
        L13:
            androidx.window.layout.ExtensionWindowLayoutInfoBackend r4 = new androidx.window.layout.ExtensionWindowLayoutInfoBackend     // Catch: java.lang.Throwable -> L19
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r4 = r2
        L1a:
            if (r4 != 0) goto L66
            androidx.window.layout.SidecarWindowBackend$Companion r3 = androidx.window.layout.SidecarWindowBackend.f6785c
            androidx.window.layout.SidecarWindowBackend r3 = androidx.window.layout.SidecarWindowBackend.f6786d
            if (r3 != 0) goto L61
            java.util.concurrent.locks.ReentrantLock r3 = androidx.window.layout.SidecarWindowBackend.f6787e
            r3.lock()
            androidx.window.layout.SidecarWindowBackend r4 = androidx.window.layout.SidecarWindowBackend.f6786d     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L58
            androidx.window.layout.SidecarCompat$Companion r4 = androidx.window.layout.SidecarCompat.f6766f     // Catch: java.lang.Throwable -> L4f
            androidx.window.core.Version r4 = r4.m4464c()     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            if (r4 != 0) goto L35
            goto L40
        L35:
            androidx.window.core.Version$Companion r6 = androidx.window.core.Version.f6699g     // Catch: java.lang.Throwable -> L4f
            androidx.window.core.Version r6 = androidx.window.core.Version.f6700h     // Catch: java.lang.Throwable -> L4f
            int r4 = r4.compareTo(r6)     // Catch: java.lang.Throwable -> L4f
            if (r4 < 0) goto L40
            r5 = 1
        L40:
            if (r5 == 0) goto L4f
            androidx.window.layout.SidecarCompat r4 = new androidx.window.layout.SidecarCompat     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4f
            boolean r7 = r4.m4461f()     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L4e
            goto L4f
        L4e:
            r2 = r4
        L4f:
            androidx.window.layout.SidecarWindowBackend$Companion r7 = androidx.window.layout.SidecarWindowBackend.f6785c     // Catch: java.lang.Throwable -> L5c
            androidx.window.layout.SidecarWindowBackend r7 = new androidx.window.layout.SidecarWindowBackend     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            androidx.window.layout.SidecarWindowBackend.f6786d = r7     // Catch: java.lang.Throwable -> L5c
        L58:
            r3.unlock()
            goto L61
        L5c:
            r7 = move-exception
            r3.unlock()
            throw r7
        L61:
            androidx.window.layout.SidecarWindowBackend r4 = androidx.window.layout.SidecarWindowBackend.f6786d
            kotlin.jvm.internal.Intrinsics.m32176e(r4)
        L66:
            r0.<init>(r1, r4)
            androidx.window.layout.WindowInfoTrackerDecorator r7 = androidx.window.layout.WindowInfoTracker.Companion.f6797b
            androidx.window.layout.EmptyDecorator r7 = (androidx.window.layout.EmptyDecorator) r7
            java.util.Objects.requireNonNull(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.C0686a.m4469a(android.content.Context):androidx.window.layout.WindowInfoTracker");
    }
}
