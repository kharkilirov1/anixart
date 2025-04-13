package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class AwaitListener implements OnCompleteListener<Void> {

    /* renamed from: a */
    public final CountDownLatch f23126a = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Void> task) {
        this.f23126a.countDown();
    }
}
