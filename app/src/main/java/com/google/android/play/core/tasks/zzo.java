package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzo implements zzp {

    /* renamed from: b */
    public final CountDownLatch f20331b = new CountDownLatch(1);

    public zzo() {
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo10817a(Exception exc) {
        this.f20331b.countDown();
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f20331b.countDown();
    }

    public /* synthetic */ zzo(zzn zznVar) {
    }
}
