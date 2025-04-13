package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* loaded from: classes2.dex */
public class MessagingAnalytics {
    @Nullable
    /* renamed from: a */
    public static String m12662a(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @VisibleForTesting
    /* renamed from: b */
    public static void m12663b(String str, Bundle bundle) {
        try {
            FirebaseApp.m12212c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String m12662a = m12662a(bundle);
            if (m12662a != null) {
                bundle2.putString("_nt", m12662a);
            }
            String string5 = bundle.getString("google.c.a.ts");
            if (string5 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string5));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string6 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string6));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = NotificationParams.m12670f(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            FirebaseApp m12212c = FirebaseApp.m12212c();
            m12212c.m12217a();
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) m12212c.f22262d.get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.m12225a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: c */
    public static boolean m12664c(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
