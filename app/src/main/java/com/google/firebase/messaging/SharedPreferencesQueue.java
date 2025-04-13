package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class SharedPreferencesQueue {

    /* renamed from: a */
    public final SharedPreferences f23311a;

    /* renamed from: b */
    public final String f23312b;

    /* renamed from: c */
    public final String f23313c;

    /* renamed from: d */
    @GuardedBy
    @VisibleForTesting
    public final ArrayDeque<String> f23314d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f23315e;

    public SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f23311a = sharedPreferences;
        this.f23312b = str;
        this.f23313c = str2;
        this.f23315e = executor;
    }

    @WorkerThread
    /* renamed from: b */
    public static SharedPreferencesQueue m12683b(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        synchronized (sharedPreferencesQueue.f23314d) {
            sharedPreferencesQueue.f23314d.clear();
            String string = sharedPreferencesQueue.f23311a.getString(sharedPreferencesQueue.f23312b, "");
            if (!TextUtils.isEmpty(string) && string.contains(sharedPreferencesQueue.f23313c)) {
                String[] split = string.split(sharedPreferencesQueue.f23313c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        sharedPreferencesQueue.f23314d.add(str3);
                    }
                }
            }
        }
        return sharedPreferencesQueue;
    }

    /* renamed from: a */
    public boolean m12684a(@NonNull String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f23313c)) {
            return false;
        }
        synchronized (this.f23314d) {
            add = this.f23314d.add(str);
            if (add) {
                this.f23315e.execute(new RunnableC2168l(this, 0));
            }
        }
        return add;
    }
}
