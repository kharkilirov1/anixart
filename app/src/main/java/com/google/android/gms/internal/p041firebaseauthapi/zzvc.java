package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvc {

    /* renamed from: a */
    public final String f16883a;

    /* renamed from: b */
    public final String f16884b;

    public zzvc(Context context, String str) {
        Preconditions.m8129d(str);
        this.f16883a = str;
        try {
            byte[] m8232a = AndroidUtilsLight.m8232a(context, str);
            if (m8232a != null) {
                this.f16884b = Hex.m8241a(m8232a, false);
            } else {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f16884b = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f16884b = null;
        }
    }
}
