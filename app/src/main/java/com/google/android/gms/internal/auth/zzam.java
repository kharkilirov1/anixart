package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.yandex.mobile.ads.C4632R;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzam extends GmsClient<com.google.android.gms.auth.account.zze> {
    public zzam(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: D */
    public final boolean mo8093D() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: s */
    public final IInterface mo7878s(IBinder iBinder) {
        int i2 = com.google.android.gms.auth.account.zzd.f15037a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof com.google.android.gms.auth.account.zze ? (com.google.android.gms.auth.account.zze) queryLocalInterface : new com.google.android.gms.auth.account.zzc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: u */
    public final Feature[] mo8107u() {
        return new Feature[]{com.google.android.gms.auth.zze.f15253d};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }
}
