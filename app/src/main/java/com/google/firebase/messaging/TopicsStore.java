package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class TopicsStore {

    /* renamed from: d */
    @GuardedBy
    public static WeakReference<TopicsStore> f23329d;

    /* renamed from: a */
    public final SharedPreferences f23330a;

    /* renamed from: b */
    public SharedPreferencesQueue f23331b;

    /* renamed from: c */
    public final Executor f23332c;

    public TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.f23332c = executor;
        this.f23330a = sharedPreferences;
    }

    @Nullable
    /* renamed from: a */
    public synchronized TopicOperation m12692a() {
        String peek;
        TopicOperation topicOperation;
        SharedPreferencesQueue sharedPreferencesQueue = this.f23331b;
        synchronized (sharedPreferencesQueue.f23314d) {
            peek = sharedPreferencesQueue.f23314d.peek();
        }
        Pattern pattern = TopicOperation.f23325d;
        topicOperation = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                topicOperation = new TopicOperation(split[0], split[1]);
            }
        }
        return topicOperation;
    }
}
