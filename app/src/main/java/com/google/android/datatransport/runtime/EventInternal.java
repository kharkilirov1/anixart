package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

@AutoValue
/* loaded from: classes.dex */
public abstract class EventInternal {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public final Builder m5517a(String str, String str2) {
            mo5493c().put(str, str2);
            return this;
        }

        /* renamed from: b */
        public abstract EventInternal mo5492b();

        /* renamed from: c */
        public abstract Map<String, String> mo5493c();

        /* renamed from: d */
        public abstract Builder mo5494d(Integer num);

        /* renamed from: e */
        public abstract Builder mo5495e(EncodedPayload encodedPayload);

        /* renamed from: f */
        public abstract Builder mo5496f(long j2);

        /* renamed from: g */
        public abstract Builder mo5497g(String str);

        /* renamed from: h */
        public abstract Builder mo5498h(long j2);
    }

    /* renamed from: a */
    public static Builder m5513a() {
        AutoValue_EventInternal.Builder builder = new AutoValue_EventInternal.Builder();
        builder.f9120f = new HashMap();
        return builder;
    }

    /* renamed from: b */
    public final String m5514b(String str) {
        String str2 = mo5486c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo5486c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo5487d();

    /* renamed from: e */
    public abstract EncodedPayload mo5488e();

    /* renamed from: f */
    public abstract long mo5489f();

    /* renamed from: g */
    public final int m5515g(String str) {
        String str2 = mo5486c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public abstract String mo5490h();

    /* renamed from: i */
    public abstract long mo5491i();

    /* renamed from: j */
    public Builder m5516j() {
        AutoValue_EventInternal.Builder builder = new AutoValue_EventInternal.Builder();
        builder.mo5497g(mo5490h());
        builder.f9116b = mo5487d();
        builder.mo5495e(mo5488e());
        builder.mo5496f(mo5489f());
        builder.mo5498h(mo5491i());
        builder.f9120f = new HashMap(mo5486c());
        return builder;
    }
}
