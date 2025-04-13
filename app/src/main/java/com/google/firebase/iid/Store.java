package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
class Store {

    /* renamed from: a */
    public final SharedPreferences f23107a;

    /* renamed from: b */
    public final Context f23108b;

    /* renamed from: c */
    @GuardedBy
    public final Map<String, Long> f23109c = new ArrayMap();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class Token {

        /* renamed from: d */
        public static final long f23110d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e */
        public static final /* synthetic */ int f23111e = 0;

        /* renamed from: a */
        public final String f23112a;

        /* renamed from: b */
        public final String f23113b;

        /* renamed from: c */
        public final long f23114c;

        public Token(String str, String str2, long j2) {
            this.f23112a = str;
            this.f23113b = str2;
            this.f23114c = j2;
        }

        /* renamed from: a */
        public static String m12547a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: b */
        public static Token m12548b(String str) {
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
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
    }

    public Store(Context context) {
        boolean isEmpty;
        this.f23108b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f23107a = sharedPreferences;
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
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                m12545c();
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: a */
    public static String m12543a(String str, String str2) {
        return C0000a.m20q(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    /* renamed from: b */
    public final String m12544b(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        C0000a.m2C(sb, str, "|T|", str2, "|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized void m12545c() {
        this.f23109c.clear();
        this.f23107a.edit().clear().commit();
    }

    /* renamed from: d */
    public final long m12546d(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f23107a.contains(m12543a(str, "cre"))) {
            String string = this.f23107a.getString(m12543a(str, "cre"), null);
            if (string != null) {
                try {
                    return Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            return 0L;
        }
        SharedPreferences.Editor edit = this.f23107a.edit();
        edit.putString(m12543a(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }
}
