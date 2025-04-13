package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzad implements zzae {

    /* renamed from: b */
    public final CountDownLatch f17243b = new CountDownLatch(1);

    public zzad() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        this.f17243b.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: c */
    public final void mo9695c() {
        this.f17243b.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f17243b.countDown();
    }

    public /* synthetic */ zzad(zzac zzacVar) {
    }
}
