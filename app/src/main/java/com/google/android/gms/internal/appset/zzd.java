package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzd extends GmsClient<zzg> {
    public zzd(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 300, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: B */
    public final boolean mo8091B() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: u */
    public final Feature[] mo8107u() {
        return com.google.android.gms.appset.zze.f15017b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }
}
