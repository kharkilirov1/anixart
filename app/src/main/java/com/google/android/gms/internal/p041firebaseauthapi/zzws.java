package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzws {
    /* renamed from: a */
    public static long m9470a(String str) {
        Preconditions.m8129d(str);
        List m8814c = new zzaf(new zzaa(new zzk())).m8814c(str);
        if (m8814c.size() < 2) {
            throw new RuntimeException("Invalid idToken ".concat(str));
        }
        String str2 = (String) m8814c.get(1);
        try {
            zzwt m9471a = zzwt.m9471a(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return m9471a.f16975b.longValue() - m9471a.f16974a.longValue();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }
}
