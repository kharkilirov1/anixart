package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
final class ActivityRecreator {

    /* renamed from: a */
    public static final Class<?> f3105a;

    /* renamed from: b */
    public static final Field f3106b;

    /* renamed from: c */
    public static final Field f3107c;

    /* renamed from: d */
    public static final Method f3108d;

    /* renamed from: e */
    public static final Method f3109e;

    /* renamed from: f */
    public static final Method f3110f;

    /* renamed from: g */
    public static final Handler f3111g = new Handler(Looper.getMainLooper());

    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Object f3118b;

        /* renamed from: c */
        public Activity f3119c;

        /* renamed from: d */
        public final int f3120d;

        /* renamed from: e */
        public boolean f3121e = false;

        /* renamed from: f */
        public boolean f3122f = false;

        /* renamed from: g */
        public boolean f3123g = false;

        public LifecycleCheckCallbacks(@NonNull Activity activity) {
            this.f3119c = activity;
            this.f3120d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3119c == activity) {
                this.f3119c = null;
                this.f3122f = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            r5.f3123g = true;
            r5.f3118b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onActivityPaused(android.app.Activity r6) {
            /*
                r5 = this;
                boolean r0 = r5.f3122f
                if (r0 == 0) goto L44
                boolean r0 = r5.f3123g
                if (r0 != 0) goto L44
                boolean r0 = r5.f3121e
                if (r0 != 0) goto L44
                java.lang.Object r0 = r5.f3118b
                int r1 = r5.f3120d
                java.lang.Class<?> r2 = androidx.core.app.ActivityRecreator.f3105a
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = androidx.core.app.ActivityRecreator.f3107c     // Catch: java.lang.Throwable -> L35
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L35
                if (r4 != r0) goto L3d
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L35
                if (r0 == r1) goto L23
                goto L3d
            L23:
                java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.f3106b     // Catch: java.lang.Throwable -> L35
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L35
                android.os.Handler r0 = androidx.core.app.ActivityRecreator.f3111g     // Catch: java.lang.Throwable -> L35
                androidx.core.app.ActivityRecreator$3 r1 = new androidx.core.app.ActivityRecreator$3     // Catch: java.lang.Throwable -> L35
                r1.<init>()     // Catch: java.lang.Throwable -> L35
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L35
                r2 = 1
                goto L3d
            L35:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3d:
                if (r2 == 0) goto L44
                r5.f3123g = r3
                r6 = 0
                r5.f3118b = r6
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3119c == activity) {
                this.f3121e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            androidx.core.app.ActivityRecreator.f3111g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            androidx.core.app.ActivityRecreator.f3105a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            androidx.core.app.ActivityRecreator.f3106b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            androidx.core.app.ActivityRecreator.f3107c = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.f3105a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
        L3c:
            r0 = r1
            goto L53
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3c
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L53:
            androidx.core.app.ActivityRecreator.f3108d = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.f3105a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6c
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6c:
            androidx.core.app.ActivityRecreator.f3109e = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.f3105a
            boolean r4 = m1553a()
            if (r4 == 0) goto Lad
            if (r0 != 0) goto L79
            goto Lad
        L79:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r1 = r0
        Lad:
            androidx.core.app.ActivityRecreator.f3110f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ActivityRecreator.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m1553a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }
}
