package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaaq extends zabg {

    /* renamed from: b */
    public final /* synthetic */ zaaw f15473b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.gms.signin.internal.zak f15474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaq(zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabfVar);
        this.f15473b = zaawVar;
        this.f15474c = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    /* renamed from: a */
    public final void mo8019a() {
        zaaw zaawVar = this.f15473b;
        com.google.android.gms.signin.internal.zak zakVar = this.f15474c;
        boolean z = false;
        zaawVar.m8034l(0);
        ConnectionResult connectionResult = zakVar.f17216c;
        if (!connectionResult.m7914n()) {
            if (zaawVar.f15489l && !connectionResult.m7913m()) {
                z = true;
            }
            if (!z) {
                zaawVar.m8031i(connectionResult);
                return;
            } else {
                zaawVar.m8028f();
                zaawVar.m8033k();
                return;
            }
        }
        com.google.android.gms.common.internal.zav zavVar = zakVar.f17217d;
        Objects.requireNonNull(zavVar, "null reference");
        ConnectionResult connectionResult2 = zavVar.f15777d;
        if (!connectionResult2.m7914n()) {
            String valueOf = String.valueOf(connectionResult2);
            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            zaawVar.m8031i(connectionResult2);
            return;
        }
        zaawVar.f15491n = true;
        IAccountAccessor m8189m = zavVar.m8189m();
        Objects.requireNonNull(m8189m, "null reference");
        zaawVar.f15492o = m8189m;
        zaawVar.f15493p = zavVar.f15778e;
        zaawVar.f15494q = zavVar.f15779f;
        zaawVar.m8033k();
    }
}
