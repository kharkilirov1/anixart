package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_TokenResult;

@AutoValue
/* loaded from: classes2.dex */
public abstract class TokenResult {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract TokenResult mo12615a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo12616b(long j2);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* renamed from: a */
    public static Builder m12631a() {
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.mo12616b(0L);
        return builder;
    }

    @Nullable
    /* renamed from: b */
    public abstract ResponseCode mo12612b();

    @Nullable
    /* renamed from: c */
    public abstract String mo12613c();

    @NonNull
    /* renamed from: d */
    public abstract long mo12614d();
}
