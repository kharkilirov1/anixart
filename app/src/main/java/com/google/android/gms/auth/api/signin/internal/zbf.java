package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbf extends zba {

    /* renamed from: a */
    public final /* synthetic */ zbg f15241a;

    public zbf(zbg zbgVar) {
        this.f15241a = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    /* renamed from: Y0 */
    public final void mo7874Y0(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount == null) {
            this.f15241a.mo7882a(new GoogleSignInResult(googleSignInAccount, status));
        } else {
            Objects.requireNonNull(this.f15241a);
            zbn.m7887a(null);
            throw null;
        }
    }
}
