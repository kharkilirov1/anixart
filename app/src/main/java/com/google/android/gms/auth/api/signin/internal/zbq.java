package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.yandex.mobile.ads.C4632R;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbq extends com.google.android.gms.internal.p039authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.internal.p039authapi.zbc.m8322a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) com.google.android.gms.internal.p039authapi.zbc.m8322a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p039authapi.zbc.m8323b(parcel);
                mo7874Y0(googleSignInAccount, status);
                break;
            case C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                Status status2 = (Status) com.google.android.gms.internal.p039authapi.zbc.m8322a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p039authapi.zbc.m8323b(parcel);
                mo7875b(status2);
                break;
            case C4632R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                Status status3 = (Status) com.google.android.gms.internal.p039authapi.zbc.m8322a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p039authapi.zbc.m8323b(parcel);
                mo7873U0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
