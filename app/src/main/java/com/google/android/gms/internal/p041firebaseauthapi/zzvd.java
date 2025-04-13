package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvd {
    /* renamed from: a */
    public static zzxy m9445a(PhoneAuthCredential phoneAuthCredential) {
        if (TextUtils.isEmpty(phoneAuthCredential.f22332g)) {
            String str = phoneAuthCredential.f22327b;
            String str2 = phoneAuthCredential.f22328c;
            boolean z = phoneAuthCredential.f22331f;
            zzxy zzxyVar = new zzxy();
            Preconditions.m8129d(str);
            zzxyVar.f17092c = str;
            Preconditions.m8129d(str2);
            zzxyVar.f17093d = str2;
            zzxyVar.f17096g = z;
            return zzxyVar;
        }
        String str3 = phoneAuthCredential.f22330e;
        String str4 = phoneAuthCredential.f22332g;
        boolean z2 = phoneAuthCredential.f22331f;
        zzxy zzxyVar2 = new zzxy();
        Preconditions.m8129d(str3);
        zzxyVar2.f17091b = str3;
        Preconditions.m8129d(str4);
        zzxyVar2.f17094e = str4;
        zzxyVar2.f17096g = z2;
        return zzxyVar2;
    }
}
