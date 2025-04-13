package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.regex.Pattern;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class TopicOperation {

    /* renamed from: d */
    public static final Pattern f23325d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f23326a;

    /* renamed from: b */
    public final String f23327b;

    /* renamed from: c */
    public final String f23328c;

    public TopicOperation(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f23325d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f23326a = str3;
        this.f23327b = str;
        this.f23328c = C0000a.m16m(str, "!", str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.f23326a.equals(topicOperation.f23326a) && this.f23327b.equals(topicOperation.f23327b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23327b, this.f23326a});
    }
}
