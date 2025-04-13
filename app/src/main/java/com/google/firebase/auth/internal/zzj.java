package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzj {

    /* renamed from: a */
    public static final zzj f22417a = new zzj();

    /* renamed from: a */
    public static void m12319a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    /* renamed from: b */
    public static final SharedPreferences m12320b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }
}
