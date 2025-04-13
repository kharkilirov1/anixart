package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final Set<Intent> f23263b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12643a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r7 = r7.getExtras()     // Catch: java.lang.RuntimeException -> Lf
            if (r7 == 0) goto L15
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r7 = r7.getBundle(r1)     // Catch: java.lang.RuntimeException -> Lf
            goto L16
        Lf:
            r7 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r7)
        L15:
            r7 = 0
        L16:
            java.lang.String r1 = "1"
            if (r7 != 0) goto L1c
            r2 = 0
            goto L26
        L1c:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r7.getString(r2)
            boolean r2 = r1.equals(r2)
        L26:
            if (r2 == 0) goto L97
            if (r7 != 0) goto L2b
            goto L92
        L2b:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r7.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto L87
            com.google.firebase.FirebaseApp r1 = com.google.firebase.FirebaseApp.m12212c()
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnector> r3 = com.google.firebase.analytics.connector.AnalyticsConnector.class
            r1.m12217a()
            com.google.firebase.components.ComponentRuntime r1 = r1.f22262d
            java.lang.Object r1 = r1.get(r3)
            com.google.firebase.analytics.connector.AnalyticsConnector r1 = (com.google.firebase.analytics.connector.AnalyticsConnector) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L54
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L54:
            if (r1 == 0) goto L81
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r2 = "fcm"
            java.lang.String r3 = "_ln"
            r1.m12226b(r2, r3, r0)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "source"
            java.lang.String r5 = "Firebase"
            r3.putString(r4, r5)
            java.lang.String r4 = "medium"
            java.lang.String r5 = "notification"
            r3.putString(r4, r5)
            java.lang.String r4 = "campaign"
            r3.putString(r4, r0)
            java.lang.String r0 = "_cmp"
            r1.m12225a(r2, r0, r3)
            goto L92
        L81:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto L92
        L87:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L92
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        L92:
            java.lang.String r0 = "_no"
            com.google.firebase.messaging.MessagingAnalytics.m12663b(r0, r7)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FcmLifecycleCallbacks.m12643a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.f23263b.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2158d(this, intent, 0));
        } else {
            m12643a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f23263b.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
