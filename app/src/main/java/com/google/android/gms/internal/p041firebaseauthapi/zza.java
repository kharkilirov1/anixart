package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zza {
    @ChecksSdkIntAtLeast
    /* renamed from: a */
    public static boolean m8569a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
