package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzab implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public final Object mo7340e(Task task) throws Exception {
        if (!task.mo9712q()) {
            return Tasks.m9722d(task.mo9707l());
        }
        String str = ((GetTokenResult) task.mo9708m()).f22322a;
        Preconditions.m8129d(str);
        zzag zzagVar = new zzag();
        zzagVar.f22361b = str;
        return Tasks.m9723e(zzagVar);
    }
}
