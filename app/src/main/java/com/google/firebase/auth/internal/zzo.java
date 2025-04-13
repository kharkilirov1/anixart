package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p041firebaseauthapi.zzwu;
import com.google.android.gms.internal.p041firebaseauthapi.zzxb;
import com.google.firebase.auth.ActionCodeResult;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzo implements ActionCodeResult {

    /* renamed from: a */
    public final int f22421a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzo(zzxb zzxbVar) {
        char c2;
        String str = zzxbVar.f16993c;
        String str2 = zzxbVar.f16994d;
        if (!(str2 != null)) {
            this.f22421a = 3;
            return;
        }
        int i2 = 5;
        switch (str2.hashCode()) {
            case -1874510116:
                if (str2.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1452371317:
                if (str2.equals("PASSWORD_RESET")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1341836234:
                if (str2.equals("VERIFY_EMAIL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1099157829:
                if (str2.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 870738373:
                if (str2.equals("EMAIL_SIGNIN")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 970484929:
                if (str2.equals("RECOVER_EMAIL")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            i2 = 0;
        } else if (c2 == 1) {
            i2 = 1;
        } else if (c2 == 2) {
            i2 = 4;
        } else if (c2 != 3) {
            i2 = c2 != 4 ? c2 != 5 ? 3 : 6 : 2;
        }
        this.f22421a = i2;
        if (i2 == 4 || i2 == 3) {
            return;
        }
        zzwu zzwuVar = zzxbVar.f16995e;
        if (zzwuVar != null) {
            new zzn(zzxbVar.f16992b, zzba.m12308a(zzwuVar));
            return;
        }
        String str3 = zzxbVar.f16993c;
        if (str3 != null) {
            new zzl(str3, zzxbVar.f16992b);
            return;
        }
        String str4 = zzxbVar.f16992b;
        if (str4 != null) {
            new zzm(str4);
        }
    }
}
