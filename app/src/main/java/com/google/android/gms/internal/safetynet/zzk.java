package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafetyNetApi;

/* loaded from: classes.dex */
public class zzk implements SafetyNetApi {

    public static class zza implements SafetyNetApi.zza {

        /* renamed from: b */
        public final Status f17174b;

        /* renamed from: c */
        public final com.google.android.gms.safetynet.zza f17175c = null;

        public zza(Status status, com.google.android.gms.safetynet.zza zzaVar) {
            this.f17174b = status;
        }

        @Override // com.google.android.gms.common.api.Result
        /* renamed from: k */
        public final Status mo7862k() {
            return this.f17174b;
        }

        @Override // com.google.android.gms.safetynet.SafetyNetApi.zza
        /* renamed from: l */
        public final String mo9680l() {
            com.google.android.gms.safetynet.zza zzaVar = this.f17175c;
            if (zzaVar == null) {
                return null;
            }
            return zzaVar.f17192b;
        }
    }

    public static abstract class zzb extends com.google.android.gms.internal.safetynet.zzf<SafetyNetApi.zza> {
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: d */
        public /* synthetic */ Result mo7880d(Status status) {
            return new zza(status, null);
        }
    }

    public static abstract class zzc extends com.google.android.gms.internal.safetynet.zzf<SafetyNetApi.zzc> {
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: d */
        public /* synthetic */ Result mo7880d(Status status) {
            return new zzj(status, false);
        }
    }

    public static abstract class zzd extends com.google.android.gms.internal.safetynet.zzf<SafetyNetApi.zzb> {
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: d */
        public /* synthetic */ Result mo7880d(Status status) {
            return new zzg(status, null);
        }
    }

    public static abstract class zze extends com.google.android.gms.internal.safetynet.zzf<SafetyNetApi.RecaptchaTokenResult> {
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: d */
        public /* synthetic */ Result mo7880d(Status status) {
            return new zzh(status, null);
        }
    }

    public static abstract class zzf extends com.google.android.gms.internal.safetynet.zzf<SafetyNetApi.SafeBrowsingResult> {
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: d */
        public /* synthetic */ Result mo7880d(Status status) {
            return new zzi(status, null);
        }
    }

    public static class zzg implements SafetyNetApi.zzb {

        /* renamed from: b */
        public final Status f17176b;

        public zzg(Status status, com.google.android.gms.safetynet.zzd zzdVar) {
            this.f17176b = status;
        }

        @Override // com.google.android.gms.common.api.Result
        /* renamed from: k */
        public final Status mo7862k() {
            return this.f17176b;
        }
    }

    public static class zzh implements SafetyNetApi.RecaptchaTokenResult {

        /* renamed from: b */
        public final Status f17177b;

        public zzh(Status status, com.google.android.gms.safetynet.zzf zzfVar) {
            this.f17177b = status;
        }

        @Override // com.google.android.gms.common.api.Result
        /* renamed from: k */
        public final Status mo7862k() {
            return this.f17177b;
        }
    }

    public static class zzi implements SafetyNetApi.SafeBrowsingResult {

        /* renamed from: b */
        public Status f17178b;

        public zzi(Status status, SafeBrowsingData safeBrowsingData) {
            this.f17178b = status;
            if (safeBrowsingData == null && status.m7964n()) {
                this.f17178b = new Status(8, null);
            }
        }

        @Override // com.google.android.gms.common.api.Result
        /* renamed from: k */
        public final Status mo7862k() {
            return this.f17178b;
        }
    }

    public static class zzj implements SafetyNetApi.zzc {

        /* renamed from: b */
        public Status f17179b;

        public zzj() {
        }

        public zzj(Status status, boolean z) {
            this.f17179b = status;
        }

        @Override // com.google.android.gms.common.api.Result
        /* renamed from: k */
        public final Status mo7862k() {
            return this.f17179b;
        }
    }
}
