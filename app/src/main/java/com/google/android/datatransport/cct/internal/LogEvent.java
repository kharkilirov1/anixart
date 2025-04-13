package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class LogEvent {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract LogEvent mo5451a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo5452b(@Nullable Integer num);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo5453c(long j2);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo5454d(long j2);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo5455e(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo5456f(long j2);
    }

    @NonNull
    /* renamed from: h */
    public static Builder m5480h(@NonNull String str) {
        AutoValue_LogEvent.Builder builder = new AutoValue_LogEvent.Builder();
        builder.f9052e = str;
        return builder;
    }

    @NonNull
    /* renamed from: i */
    public static Builder m5481i(@NonNull byte[] bArr) {
        AutoValue_LogEvent.Builder builder = new AutoValue_LogEvent.Builder();
        builder.f9051d = bArr;
        return builder;
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo5444a();

    /* renamed from: b */
    public abstract long mo5445b();

    /* renamed from: c */
    public abstract long mo5446c();

    @Nullable
    /* renamed from: d */
    public abstract NetworkConnectionInfo mo5447d();

    @Nullable
    /* renamed from: e */
    public abstract byte[] mo5448e();

    @Nullable
    /* renamed from: f */
    public abstract String mo5449f();

    /* renamed from: g */
    public abstract long mo5450g();
}
