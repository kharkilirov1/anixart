package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrs implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ UserProfileChangeRequest f16787a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16788b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16789c;

    public zzrs(zzrx zzrxVar, UserProfileChangeRequest userProfileChangeRequest, zzts zztsVar) {
        this.f16789c = zzrxVar;
        this.f16787a = userProfileChangeRequest;
        this.f16788b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16788b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        zzxg zzxgVar = new zzxg();
        String str = zzwqVar.f16970c;
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        UserProfileChangeRequest userProfileChangeRequest = this.f16787a;
        if (userProfileChangeRequest.f22344d || userProfileChangeRequest.f22342b != null) {
            String str2 = userProfileChangeRequest.f22342b;
            if (str2 == null) {
                zzxgVar.f17012h.f17044c.add("DISPLAY_NAME");
            } else {
                zzxgVar.f17007c = str2;
            }
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.f16787a;
        if (userProfileChangeRequest2.f22345e || userProfileChangeRequest2.f22346f != null) {
            String str3 = userProfileChangeRequest2.f22343c;
            if (str3 == null) {
                zzxgVar.f17012h.f17044c.add("PHOTO_URL");
            } else {
                zzxgVar.f17011g = str3;
            }
        }
        zzrx.m9349e(this.f16789c, this.f16788b, zzwqVar, zzxgVar, this);
    }
}
