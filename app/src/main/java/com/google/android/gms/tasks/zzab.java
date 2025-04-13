package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzab implements Continuation<Void, Task<List<Task<?>>>> {
    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Task<List<Task<?>>> mo7340e(@NonNull Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(null);
        return Tasks.m9723e(arrayList);
    }
}
