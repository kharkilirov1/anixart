package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.yandex.mobile.ads.C4632R;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbk extends zbl {
    public zbk(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Result mo7880d(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final void mo7881l(Api.AnyClient anyClient) throws RemoteException {
        zbe zbeVar = (zbe) anyClient;
        zbs zbsVar = (zbs) zbeVar.m8111y();
        zbj zbjVar = new zbj(this);
        GoogleSignInOptions googleSignInOptions = zbeVar.f15240G;
        Parcel m8320i = zbsVar.m8320i();
        com.google.android.gms.internal.p039authapi.zbc.m8325d(m8320i, zbjVar);
        com.google.android.gms.internal.p039authapi.zbc.m8324c(m8320i, googleSignInOptions);
        zbsVar.m8321q(C4632R.styleable.AppCompatTheme_textAppearanceListItem, m8320i);
    }
}
