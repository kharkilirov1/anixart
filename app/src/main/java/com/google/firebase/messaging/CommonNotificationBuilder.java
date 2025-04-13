package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class CommonNotificationBuilder {

    /* renamed from: a */
    public static final AtomicInteger f23250a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {

        /* renamed from: a */
        public final NotificationCompat.Builder f23251a;

        /* renamed from: b */
        public final String f23252b;

        /* renamed from: c */
        public final int f23253c;

        public DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i2) {
            this.f23251a = builder;
            this.f23252b = str;
            this.f23253c = i2;
        }
    }

    @TargetApi
    /* renamed from: a */
    public static boolean m12636a(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i2);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i2 + ", treating it as an invalid icon");
            return false;
        }
    }
}
