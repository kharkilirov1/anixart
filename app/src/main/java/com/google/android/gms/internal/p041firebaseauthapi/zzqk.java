package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqk implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzux f16711a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16712b;

    /* renamed from: c */
    public final /* synthetic */ zzwq f16713c;

    /* renamed from: d */
    public final /* synthetic */ zzxg f16714d;

    /* renamed from: e */
    public final /* synthetic */ zzrx f16715e;

    public zzqk(zzrx zzrxVar, zzux zzuxVar, zzts zztsVar, zzwq zzwqVar, zzxg zzxgVar) {
        this.f16715e = zzrxVar;
        this.f16711a = zzuxVar;
        this.f16712b = zztsVar;
        this.f16713c = zzwqVar;
        this.f16714d = zzxgVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16711a.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        List list = ((zzwh) obj).f16947b.f16961b;
        if (list == null || list.isEmpty()) {
            this.f16711a.mo9345a("No users");
        } else {
            zzrx.m9350f(this.f16715e, this.f16712b, this.f16713c, (zzwj) list.get(0), this.f16714d, this.f16711a);
        }
    }
}
