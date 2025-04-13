package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p041firebaseauthapi.zzwu;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzba {
    @Nullable
    /* renamed from: a */
    public static MultiFactorInfo m12308a(zzwu zzwuVar) {
        if (zzwuVar == null || TextUtils.isEmpty(zzwuVar.f16976b)) {
            return null;
        }
        String str = zzwuVar.f16977c;
        String str2 = zzwuVar.f16978d;
        long j2 = zzwuVar.f16979e;
        String str3 = zzwuVar.f16976b;
        Preconditions.m8129d(str3);
        return new PhoneMultiFactorInfo(str, str2, j2, str3);
    }

    /* renamed from: b */
    public static List m12309b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo m12308a = m12308a((zzwu) it.next());
            if (m12308a != null) {
                arrayList.add(m12308a);
            }
        }
        return arrayList;
    }
}
