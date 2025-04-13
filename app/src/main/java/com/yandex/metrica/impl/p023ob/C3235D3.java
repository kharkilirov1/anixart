package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.D3 */
/* loaded from: classes2.dex */
public class C3235D3 implements InterfaceC3653Tm<Thread, StackTraceElement[], C4125m7> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3653Tm
    @NonNull
    /* renamed from: a */
    public C4125m7 mo17948a(@NonNull Thread thread, @Nullable StackTraceElement[] stackTraceElementArr) {
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        String name = thread2.getName();
        int priority = thread2.getPriority();
        long id2 = thread2.getId();
        ThreadGroup threadGroup = thread2.getThreadGroup();
        return new C4125m7(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread2.getState().ordinal()), stackTraceElementArr2 == null ? null : Arrays.asList(stackTraceElementArr2));
    }
}
