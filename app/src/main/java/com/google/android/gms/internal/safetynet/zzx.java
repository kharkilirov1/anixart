package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

/* loaded from: classes.dex */
public final class zzx extends GmsClient<zzi> {

    /* renamed from: G */
    public final Context f17180G;

    public zzx(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 45, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f17180G = context;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* renamed from: J */
    public final void m9681J(zzg zzgVar, List<Integer> list, int i2, String str, String str2) throws RemoteException {
        m9682K("com.google.android.safetynet.API_KEY");
        throw null;
    }

    @VisibleForTesting
    /* renamed from: K */
    public final String m9682K(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f17180G.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f17180G.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }
}
