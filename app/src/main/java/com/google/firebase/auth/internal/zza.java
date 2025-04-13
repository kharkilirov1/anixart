package com.google.firebase.auth.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zza implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        Log.e("zzf", "Problem retrieving SafetyNet Token: ".concat(String.valueOf(exc.getMessage())));
        zzf.m12316a(null, null, null, null, null);
        throw null;
    }
}
