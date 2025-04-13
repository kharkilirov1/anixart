package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class Registrar$FIIDInternalAdapter$$Lambda$0 implements Continuation {

    /* renamed from: b */
    public static final Continuation f23098b = new Registrar$FIIDInternalAdapter$$Lambda$0();

    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public Object mo7340e(Task task) {
        return ((InstanceIdResult) task.mo9708m()).getToken();
    }
}
