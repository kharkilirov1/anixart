package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* loaded from: classes2.dex */
public abstract class PersistedInstallationEntry {

    /* renamed from: a */
    public static final /* synthetic */ int f23187a = 0;

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract PersistedInstallationEntry mo12591a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo12592b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo12593c(long j2);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo12594d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo12595e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo12596f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract Builder mo12597g(@NonNull PersistedInstallation.RegistrationStatus registrationStatus);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo12598h(long j2);
    }

    static {
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.mo12598h(0L);
        builder.mo12597g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        builder.mo12593c(0L);
        builder.mo12591a();
    }

    @Nullable
    /* renamed from: a */
    public abstract String mo12583a();

    /* renamed from: b */
    public abstract long mo12584b();

    @Nullable
    /* renamed from: c */
    public abstract String mo12585c();

    @Nullable
    /* renamed from: d */
    public abstract String mo12586d();

    @Nullable
    /* renamed from: e */
    public abstract String mo12587e();

    @NonNull
    /* renamed from: f */
    public abstract PersistedInstallation.RegistrationStatus mo12588f();

    /* renamed from: g */
    public abstract long mo12589g();

    /* renamed from: h */
    public boolean m12603h() {
        return mo12588f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    /* renamed from: i */
    public boolean m12604i() {
        return mo12588f() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo12588f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    /* renamed from: j */
    public boolean m12605j() {
        return mo12588f() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    @NonNull
    /* renamed from: k */
    public abstract Builder mo12590k();
}
