package com.google.firebase.auth;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public class ActionCodeUrl {

    /* renamed from: c */
    public static final Map f22297c;

    /* renamed from: a */
    public final String f22298a;

    /* renamed from: b */
    @Nullable
    public final String f22299b;

    static {
        HashMap hashMap = new HashMap();
        C0576a.m4124w(2, hashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f22297c = Collections.unmodifiableMap(hashMap);
    }

    public ActionCodeUrl(String str) {
        String m12228a = m12228a(str, "apiKey");
        String m12228a2 = m12228a(str, "oobCode");
        String m12228a3 = m12228a(str, "mode");
        if (m12228a == null || m12228a2 == null || m12228a3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        Preconditions.m8129d(m12228a);
        Preconditions.m8129d(m12228a2);
        this.f22298a = m12228a2;
        Preconditions.m8129d(m12228a3);
        m12228a(str, "continueUrl");
        m12228a(str, "languageCode");
        this.f22299b = m12228a(str, "tenantId");
    }

    @Nullable
    /* renamed from: a */
    public static String m12228a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            Preconditions.m8129d(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
