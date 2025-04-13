package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzd implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f22408b;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f22408b.m9716b(new zze(null, (String) obj));
    }
}
