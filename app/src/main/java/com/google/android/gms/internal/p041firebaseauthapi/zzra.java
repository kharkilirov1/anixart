package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzra implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzuy f16752a;

    /* renamed from: b */
    public final /* synthetic */ zzwq f16753b;

    /* renamed from: c */
    public final /* synthetic */ zzrb f16754c;

    public zzra(zzrb zzrbVar, zzuy zzuyVar, zzwq zzwqVar) {
        this.f16754c = zzrbVar;
        this.f16752a = zzuyVar;
        this.f16753b = zzwqVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16754c.f16756b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        List list = ((zzwh) obj).f16947b.f16961b;
        if (list == null || list.isEmpty()) {
            this.f16752a.mo9345a("No users.");
            return;
        }
        zzwj zzwjVar = (zzwj) list.get(0);
        zzxg zzxgVar = new zzxg();
        String str = this.f16753b.f16970c;
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        String str2 = this.f16754c.f16755a;
        Preconditions.m8129d(str2);
        zzxgVar.f17013i.f17044c.add(str2);
        zzrb zzrbVar = this.f16754c;
        zzrx.m9350f(zzrbVar.f16757c, zzrbVar.f16756b, this.f16753b, zzwjVar, zzxgVar, this.f16752a);
    }
}
