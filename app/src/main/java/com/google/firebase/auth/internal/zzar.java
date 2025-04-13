package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzar implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f22378b;

    /* renamed from: c */
    public final /* synthetic */ Context f22379c;

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(Exception exc) {
        this.f22378b.m9715a(exc);
        zzax.m12302a(this.f22379c);
    }
}
