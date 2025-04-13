package com.google.android.gms.safetynet;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

@KeepForSdkWithMembers
/* loaded from: classes.dex */
public interface SafetyNetApi {

    public static class AttestationResponse extends Response<zza> {
        /* renamed from: b */
        public String m9683b() {
            return ((zza) this.f15371b).mo9680l();
        }
    }

    public static class HarmfulAppsResponse extends Response<zzb> {
    }

    public static class RecaptchaTokenResponse extends Response<RecaptchaTokenResult> {
    }

    @Deprecated
    public interface RecaptchaTokenResult extends Result {
    }

    @KeepForSdkWithMembers
    public static class SafeBrowsingResponse extends Response<SafeBrowsingResult> {
    }

    @KeepForSdkWithMembers
    @Deprecated
    public interface SafeBrowsingResult extends Result {
    }

    public static class VerifyAppsUserResponse extends Response<zzc> {
    }

    @Deprecated
    public interface zza extends Result {
        /* renamed from: l */
        String mo9680l();
    }

    @Deprecated
    public interface zzb extends Result {
    }

    @Deprecated
    public interface zzc extends Result {
    }
}
