package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzvj implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        zzvn.f16903d.m8205b("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}
