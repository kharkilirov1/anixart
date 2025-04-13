package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzau implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f22384b;

    /* renamed from: c */
    public final /* synthetic */ Context f22385c;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f22384b.m9716b((AuthResult) obj);
        zzax.m12302a(this.f22385c);
    }
}
