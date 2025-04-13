package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.p039authapi.zbbb;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbe extends GmsClient {

    /* renamed from: G */
    public final GoogleSignInOptions f15240G;

    public zbe(Context context, Looper looper, ClientSettings clientSettings, @Nullable GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.Builder builder = googleSignInOptions != null ? new GoogleSignInOptions.Builder(googleSignInOptions) : new GoogleSignInOptions.Builder();
        byte[] bArr = new byte[16];
        zbbb.f16016a.nextBytes(bArr);
        builder.f15213i = Base64.encodeToString(bArr, 11);
        if (!clientSettings.f15683c.isEmpty()) {
            Iterator<Scope> it = clientSettings.f15683c.iterator();
            while (it.hasNext()) {
                builder.f15205a.add(it.next());
                builder.f15205a.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f15240G = builder.m7860a();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zbs ? (zbs) queryLocalInterface : new zbs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
}
