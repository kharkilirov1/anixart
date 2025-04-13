package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrk implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzuy f16772a;

    /* renamed from: b */
    public final /* synthetic */ zzwq f16773b;

    /* renamed from: c */
    public final /* synthetic */ zzrl f16774c;

    public zzrk(zzrl zzrlVar, zzuy zzuyVar, zzwq zzwqVar) {
        this.f16774c = zzrlVar;
        this.f16772a = zzuyVar;
        this.f16773b = zzwqVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16772a.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        List list = ((zzwh) obj).f16947b.f16961b;
        if (list == null || list.isEmpty()) {
            this.f16772a.mo9345a("No users");
        } else {
            this.f16774c.f16775a.m9386e(this.f16773b, (zzwj) list.get(0));
        }
    }
}
