package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.zze;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqm implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzux f16721a;

    /* renamed from: b */
    public final /* synthetic */ String f16722b;

    /* renamed from: c */
    public final /* synthetic */ String f16723c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f16724d;

    /* renamed from: e */
    public final /* synthetic */ zze f16725e;

    /* renamed from: f */
    public final /* synthetic */ zzts f16726f;

    /* renamed from: g */
    public final /* synthetic */ zzwq f16727g;

    public zzqm(zzux zzuxVar, String str, String str2, Boolean bool, zze zzeVar, zzts zztsVar, zzwq zzwqVar) {
        this.f16721a = zzuxVar;
        this.f16722b = str;
        this.f16723c = str2;
        this.f16724d = bool;
        this.f16725e = zzeVar;
        this.f16726f = zztsVar;
        this.f16727g = zzwqVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16721a.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        List list = ((zzwh) obj).f16947b.f16961b;
        if (list == null || list.isEmpty()) {
            this.f16721a.mo9345a("No users.");
            return;
        }
        int i2 = 0;
        zzwj zzwjVar = (zzwj) list.get(0);
        zzwy zzwyVar = zzwjVar.f16953g;
        List list2 = zzwyVar != null ? zzwyVar.f16987b : null;
        if (list2 != null && !list2.isEmpty()) {
            if (TextUtils.isEmpty(this.f16722b)) {
                ((zzww) list2.get(0)).f16984f = this.f16723c;
            } else {
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    }
                    if (((zzww) list2.get(i2)).f16983e.equals(this.f16722b)) {
                        ((zzww) list2.get(i2)).f16984f = this.f16723c;
                        break;
                    }
                    i2++;
                }
            }
        }
        zzwjVar.f16958l = this.f16724d.booleanValue();
        zzwjVar.f16959m = this.f16725e;
        this.f16726f.m9386e(this.f16727g, zzwjVar);
    }
}
