package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.C3 */
/* loaded from: classes2.dex */
public class C3210C3 implements InterfaceC3703Vm<Thread, C4125m7> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C4125m7 mo17917a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C4125m7(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
