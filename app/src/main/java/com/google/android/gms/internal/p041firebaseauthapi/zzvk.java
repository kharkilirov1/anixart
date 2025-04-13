package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzvk extends zzts {

    /* renamed from: c */
    public final String f16890c;

    /* renamed from: d */
    public final /* synthetic */ zzvn f16891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvk(zzvn zzvnVar, zzts zztsVar, String str) {
        super(zztsVar.f16819a, zztsVar.f16820b);
        this.f16891d = zzvnVar;
        this.f16890c = str;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzts
    /* renamed from: b */
    public final void mo9383b(String str) {
        zzvn.f16903d.m8204a("onCodeSent", new Object[0]);
        zzvm zzvmVar = (zzvm) this.f16891d.f16906c.get(this.f16890c);
        if (zzvmVar == null) {
            return;
        }
        Iterator it = zzvmVar.f16895b.iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).mo9383b(str);
        }
        zzvmVar.f16900g = true;
        zzvmVar.f16897d = str;
        if (zzvmVar.f16894a <= 0) {
            this.f16891d.m9460i(this.f16890c);
        } else if (!zzvmVar.f16896c) {
            this.f16891d.m9459h(this.f16890c);
        } else {
            if (zzag.m8817c(zzvmVar.f16898e)) {
                return;
            }
            zzvn.m9452b(this.f16891d, this.f16890c);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzts
    /* renamed from: d */
    public final void mo9385d(Status status) {
        zzvn.f16903d.m8205b("SMS verification code request failed: " + CommonStatusCodes.m7947a(status.f15380c) + " " + status.f15381d, new Object[0]);
        zzvm zzvmVar = (zzvm) this.f16891d.f16906c.get(this.f16890c);
        if (zzvmVar == null) {
            return;
        }
        Iterator it = zzvmVar.f16895b.iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).mo9385d(status);
        }
        this.f16891d.m9456d(this.f16890c);
    }
}
