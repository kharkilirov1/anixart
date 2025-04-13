package com.google.firebase.auth.internal;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbd {

    /* renamed from: a */
    public static final List f22394a = new ArrayList(Arrays.asList("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"));

    /* renamed from: b */
    public static final zzbd f22395b = new zzbd();

    /* renamed from: a */
    public static final void m12310a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = ((ArrayList) f22394a).iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.commit();
    }
}
