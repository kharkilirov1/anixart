package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {

    /* renamed from: m */
    public static final Api<Api.ApiOptions.NoOptions> f15991m = new Api<>("AppSet.API", new zzn(), new Api.ClientKey());

    /* renamed from: k */
    public final Context f15992k;

    /* renamed from: l */
    public final GoogleApiAvailabilityLight f15993l;

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f15991m, Api.ApiOptions.f15348z1, GoogleApi.Settings.f15363c);
        this.f15992k = context;
        this.f15993l = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* renamed from: a */
    public final Task<AppSetIdInfo> mo7830a() {
        if (this.f15993l.mo7917c(this.f15992k, 212800000) != 0) {
            return Tasks.m9722d(new ApiException(new Status(17, null)));
        }
        TaskApiCall.Builder m8008a = TaskApiCall.m8008a();
        m8008a.f15438c = new Feature[]{com.google.android.gms.appset.zze.f15016a};
        m8008a.f15436a = new RemoteCall(this) { // from class: com.google.android.gms.internal.appset.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* renamed from: a */
            public final void mo8007a(Object obj, Object obj2) {
                zzg zzgVar = (zzg) ((zzd) obj).m8111y();
                com.google.android.gms.appset.zza zzaVar = new com.google.android.gms.appset.zza(null, null);
                zzo zzoVar = new zzo((TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
                int i2 = zzc.f15981a;
                obtain.writeInt(1);
                zzaVar.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(zzoVar);
                Parcel obtain2 = Parcel.obtain();
                try {
                    zzgVar.f15980a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }
        };
        m8008a.f15437b = false;
        m8008a.f15439d = 27601;
        return m7949d(0, m8008a.m8009a());
    }
}
