package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Store {

    /* renamed from: a */
    public final SharedPreferences f23316a;

    public static class Token {

        /* renamed from: d */
        public static final long f23317d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f23318a;

        /* renamed from: b */
        public final String f23319b;

        /* renamed from: c */
        public final long f23320c;

        public Token(String str, String str2, long j2) {
            this.f23318a = str;
            this.f23319b = str2;
            this.f23320c = j2;
        }

        /* renamed from: a */
        public static String m12686a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
                return null;
            }
        }

        /* renamed from: b */
        public static Token m12687b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
                return null;
            }
        }
    }

    public Store(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f23316a = sharedPreferences;
        File file = new File(ContextCompat.m1673f(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder m24u = C0000a.m24u("Error creating file in no backup dir: ");
                m24u.append(e2.getMessage());
                Log.d("FirebaseMessaging", m24u.toString());
            }
        }
    }

    /* renamed from: a */
    public final String m12685a(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }
}
