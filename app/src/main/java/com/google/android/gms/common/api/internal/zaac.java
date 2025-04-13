package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaac implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f15453a;

    /* renamed from: b */
    public final /* synthetic */ zaad f15454b;

    public zaac(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f15454b = zaadVar;
        this.f15453a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f15454b.f15456b.remove(this.f15453a);
    }
}
