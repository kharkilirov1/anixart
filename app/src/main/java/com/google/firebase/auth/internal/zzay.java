package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p041firebaseauthapi.zznp;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzay {

    /* renamed from: a */
    public static final Logger f22391a = new Logger("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static GetTokenResult m12303a(String str) {
        Map hashMap;
        try {
            hashMap = zzaz.m12305b(str);
        } catch (zznp e2) {
            Logger logger = f22391a;
            Log.e(logger.f15834a, logger.m8206c("Error parsing token claims", new Object[0]), e2);
            hashMap = new HashMap();
        }
        return new GetTokenResult(str, hashMap);
    }
}
