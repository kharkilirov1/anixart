package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzql implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzxg f16716a;

    /* renamed from: b */
    public final /* synthetic */ zzwj f16717b;

    /* renamed from: c */
    public final /* synthetic */ zzts f16718c;

    /* renamed from: d */
    public final /* synthetic */ zzwq f16719d;

    /* renamed from: e */
    public final /* synthetic */ zzux f16720e;

    public zzql(zzrx zzrxVar, zzxg zzxgVar, zzwj zzwjVar, zzts zztsVar, zzwq zzwqVar, zzux zzuxVar) {
        this.f16716a = zzxgVar;
        this.f16717b = zzwjVar;
        this.f16718c = zztsVar;
        this.f16719d = zzwqVar;
        this.f16720e = zzuxVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16720e.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxh zzxhVar = (zzxh) obj;
        if (this.f16716a.m9477c("EMAIL")) {
            this.f16717b.f16949c = null;
        } else {
            String str = this.f16716a.f17008d;
            if (str != null) {
                this.f16717b.f16949c = str;
            }
        }
        if (this.f16716a.m9477c("DISPLAY_NAME")) {
            this.f16717b.f16951e = null;
        } else {
            String str2 = this.f16716a.f17007c;
            if (str2 != null) {
                this.f16717b.f16951e = str2;
            }
        }
        if (this.f16716a.m9477c("PHOTO_URL")) {
            this.f16717b.f16952f = null;
        } else {
            String str3 = this.f16716a.f17011g;
            if (str3 != null) {
                this.f16717b.f16952f = str3;
            }
        }
        if (!TextUtils.isEmpty(this.f16716a.f17009e)) {
            zzwj zzwjVar = this.f16717b;
            String m8236a = Base64Utils.m8236a("redacted".getBytes());
            Objects.requireNonNull(zzwjVar);
            Preconditions.m8129d(m8236a);
            zzwjVar.f16954h = m8236a;
        }
        zzwy zzwyVar = zzxhVar.f17016c;
        List list = zzwyVar != null ? zzwyVar.f16987b : null;
        if (list == null) {
            list = new ArrayList();
        }
        zzwj zzwjVar2 = this.f16717b;
        Objects.requireNonNull(zzwjVar2);
        zzwy zzwyVar2 = new zzwy();
        zzwjVar2.f16953g = zzwyVar2;
        zzwyVar2.f16987b.addAll(list);
        zzts zztsVar = this.f16718c;
        zzwq zzwqVar = this.f16719d;
        Objects.requireNonNull(zzwqVar, "null reference");
        String str4 = zzxhVar.f17017d;
        String str5 = zzxhVar.f17018e;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            zzwqVar = new zzwq(str5, str4, Long.valueOf(zzxhVar.f17019f), zzwqVar.f16972e);
        }
        zztsVar.m9386e(zzwqVar, this.f16717b);
    }
}
