package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationResponse {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @Nullable
    /* renamed from: a */
    public abstract TokenResult mo12606a();

    @Nullable
    /* renamed from: b */
    public abstract String mo12607b();

    @Nullable
    /* renamed from: c */
    public abstract String mo12608c();

    @Nullable
    /* renamed from: d */
    public abstract ResponseCode mo12609d();

    @Nullable
    /* renamed from: e */
    public abstract String mo12610e();
}
