package com.google.android.gms.auth.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class Auth {

    /* renamed from: a */
    @NonNull
    public static final Api<GoogleSignInOptions> f15038a = new Api<>("Auth.GOOGLE_SIGN_IN_API", new zbb(), new Api.ClientKey());

    /* renamed from: b */
    @NonNull
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi f15039b = AuthProxy.f15046b;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {

        /* renamed from: d */
        @NonNull
        public static final AuthCredentialsOptions f15040d = new AuthCredentialsOptions(new Builder());

        /* renamed from: b */
        public final boolean f15041b;

        /* renamed from: c */
        @Nullable
        public final String f15042c;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        @Deprecated
        public static class Builder {

            /* renamed from: a */
            @NonNull
            public Boolean f15043a;

            /* renamed from: b */
            @Nullable
            public String f15044b;

            public Builder() {
                this.f15043a = Boolean.FALSE;
            }

            @ShowFirstParty
            public Builder(@NonNull AuthCredentialsOptions authCredentialsOptions) {
                this.f15043a = Boolean.FALSE;
                AuthCredentialsOptions authCredentialsOptions2 = AuthCredentialsOptions.f15040d;
                Objects.requireNonNull(authCredentialsOptions);
                this.f15043a = Boolean.valueOf(authCredentialsOptions.f15041b);
                this.f15044b = authCredentialsOptions.f15042c;
            }
        }

        public AuthCredentialsOptions(@NonNull Builder builder) {
            this.f15041b = builder.f15043a.booleanValue();
            this.f15042c = builder.f15044b;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthCredentialsOptions)) {
                return false;
            }
            AuthCredentialsOptions authCredentialsOptions = (AuthCredentialsOptions) obj;
            Objects.requireNonNull(authCredentialsOptions);
            return com.google.android.gms.common.internal.Objects.m8123a(null, null) && this.f15041b == authCredentialsOptions.f15041b && com.google.android.gms.common.internal.Objects.m8123a(this.f15042c, authCredentialsOptions.f15042c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f15041b), this.f15042c});
        }
    }
}
