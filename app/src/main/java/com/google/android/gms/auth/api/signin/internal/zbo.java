package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.PendingResultUtil;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbo extends com.google.android.gms.internal.p039authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zbt zbtVar = (zbt) this;
            zbtVar.m7890q();
            Storage m7866a = Storage.m7866a(zbtVar.f15247a);
            GoogleSignInAccount m7868b = m7866a.m7868b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f15187m;
            if (m7868b != null) {
                googleSignInOptions = m7866a.m7869c();
            }
            Context context = zbtVar.f15247a;
            Objects.requireNonNull(googleSignInOptions, "null reference");
            GoogleSignInClient googleSignInClient = new GoogleSignInClient(context, googleSignInOptions);
            if (m7868b != null) {
                PendingResultUtil.m8125a(zbm.m7884b(googleSignInClient.f15360h, googleSignInClient.f15353a, googleSignInClient.m7856f() == 3));
            } else {
                PendingResultUtil.m8125a(zbm.m7885c(googleSignInClient.f15360h, googleSignInClient.f15353a, googleSignInClient.m7856f() == 3));
            }
        } else {
            if (i2 != 2) {
                return false;
            }
            zbt zbtVar2 = (zbt) this;
            zbtVar2.m7890q();
            zbn.m7887a(zbtVar2.f15247a).m7888b();
        }
        return true;
    }
}
