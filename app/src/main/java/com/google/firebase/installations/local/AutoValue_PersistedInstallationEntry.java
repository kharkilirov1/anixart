package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* renamed from: b */
    public final String f23162b;

    /* renamed from: c */
    public final PersistedInstallation.RegistrationStatus f23163c;

    /* renamed from: d */
    public final String f23164d;

    /* renamed from: e */
    public final String f23165e;

    /* renamed from: f */
    public final long f23166f;

    /* renamed from: g */
    public final long f23167g;

    /* renamed from: h */
    public final String f23168h;

    public static final class Builder extends PersistedInstallationEntry.Builder {

        /* renamed from: a */
        public String f23169a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f23170b;

        /* renamed from: c */
        public String f23171c;

        /* renamed from: d */
        public String f23172d;

        /* renamed from: e */
        public Long f23173e;

        /* renamed from: f */
        public Long f23174f;

        /* renamed from: g */
        public String f23175g;

        public Builder() {
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: a */
        public PersistedInstallationEntry mo12591a() {
            String str = this.f23170b == null ? " registrationStatus" : "";
            if (this.f23173e == null) {
                str = C0000a.m14k(str, " expiresInSecs");
            }
            if (this.f23174f == null) {
                str = C0000a.m14k(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.f23169a, this.f23170b, this.f23171c, this.f23172d, this.f23173e.longValue(), this.f23174f.longValue(), this.f23175g, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: b */
        public PersistedInstallationEntry.Builder mo12592b(@Nullable String str) {
            this.f23171c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: c */
        public PersistedInstallationEntry.Builder mo12593c(long j2) {
            this.f23173e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: d */
        public PersistedInstallationEntry.Builder mo12594d(String str) {
            this.f23169a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: e */
        public PersistedInstallationEntry.Builder mo12595e(@Nullable String str) {
            this.f23175g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: f */
        public PersistedInstallationEntry.Builder mo12596f(@Nullable String str) {
            this.f23172d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: g */
        public PersistedInstallationEntry.Builder mo12597g(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f23170b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        /* renamed from: h */
        public PersistedInstallationEntry.Builder mo12598h(long j2) {
            this.f23174f = Long.valueOf(j2);
            return this;
        }

        public Builder(PersistedInstallationEntry persistedInstallationEntry, C21491 c21491) {
            AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry = (AutoValue_PersistedInstallationEntry) persistedInstallationEntry;
            this.f23169a = autoValue_PersistedInstallationEntry.f23162b;
            this.f23170b = autoValue_PersistedInstallationEntry.f23163c;
            this.f23171c = autoValue_PersistedInstallationEntry.f23164d;
            this.f23172d = autoValue_PersistedInstallationEntry.f23165e;
            this.f23173e = Long.valueOf(autoValue_PersistedInstallationEntry.f23166f);
            this.f23174f = Long.valueOf(autoValue_PersistedInstallationEntry.f23167g);
            this.f23175g = autoValue_PersistedInstallationEntry.f23168h;
        }
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j2, long j3, String str4, C21491 c21491) {
        this.f23162b = str;
        this.f23163c = registrationStatus;
        this.f23164d = str2;
        this.f23165e = str3;
        this.f23166f = j2;
        this.f23167g = j3;
        this.f23168h = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    /* renamed from: a */
    public String mo12583a() {
        return this.f23164d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    /* renamed from: b */
    public long mo12584b() {
        return this.f23166f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    /* renamed from: c */
    public String mo12585c() {
        return this.f23162b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    /* renamed from: d */
    public String mo12586d() {
        return this.f23168h;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    /* renamed from: e */
    public String mo12587e() {
        return this.f23165e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f23162b;
        if (str3 != null ? str3.equals(persistedInstallationEntry.mo12585c()) : persistedInstallationEntry.mo12585c() == null) {
            if (this.f23163c.equals(persistedInstallationEntry.mo12588f()) && ((str = this.f23164d) != null ? str.equals(persistedInstallationEntry.mo12583a()) : persistedInstallationEntry.mo12583a() == null) && ((str2 = this.f23165e) != null ? str2.equals(persistedInstallationEntry.mo12587e()) : persistedInstallationEntry.mo12587e() == null) && this.f23166f == persistedInstallationEntry.mo12584b() && this.f23167g == persistedInstallationEntry.mo12589g()) {
                String str4 = this.f23168h;
                if (str4 == null) {
                    if (persistedInstallationEntry.mo12586d() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.mo12586d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    /* renamed from: f */
    public PersistedInstallation.RegistrationStatus mo12588f() {
        return this.f23163c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    /* renamed from: g */
    public long mo12589g() {
        return this.f23167g;
    }

    public int hashCode() {
        String str = this.f23162b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f23163c.hashCode()) * 1000003;
        String str2 = this.f23164d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23165e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f23166f;
        int i2 = (hashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f23167g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f23168h;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    /* renamed from: k */
    public PersistedInstallationEntry.Builder mo12590k() {
        return new Builder(this, null);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PersistedInstallationEntry{firebaseInstallationId=");
        m24u.append(this.f23162b);
        m24u.append(", registrationStatus=");
        m24u.append(this.f23163c);
        m24u.append(", authToken=");
        m24u.append(this.f23164d);
        m24u.append(", refreshToken=");
        m24u.append(this.f23165e);
        m24u.append(", expiresInSecs=");
        m24u.append(this.f23166f);
        m24u.append(", tokenCreationEpochInSecs=");
        m24u.append(this.f23167g);
        m24u.append(", fisError=");
        return C0000a.m20q(m24u, this.f23168h, "}");
    }
}
