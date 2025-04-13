package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class LogRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract LogRequest mo5464a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo5465b(@Nullable ClientInfo clientInfo);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo5466c(@Nullable List<LogEvent> list);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo5467d(@Nullable Integer num);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo5468e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo5469f(@Nullable QosTier qosTier);

        @NonNull
        /* renamed from: g */
        public abstract Builder mo5470g(long j2);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo5471h(long j2);
    }

    @NonNull
    /* renamed from: a */
    public static Builder m5482a() {
        return new AutoValue_LogRequest.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract ClientInfo mo5457b();

    @Nullable
    @Encodable.Field
    /* renamed from: c */
    public abstract List<LogEvent> mo5458c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo5459d();

    @Nullable
    /* renamed from: e */
    public abstract String mo5460e();

    @Nullable
    /* renamed from: f */
    public abstract QosTier mo5461f();

    /* renamed from: g */
    public abstract long mo5462g();

    /* renamed from: h */
    public abstract long mo5463h();
}
