package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Queue;

@GwtCompatible
/* loaded from: classes.dex */
class ConsumingQueueIterator<T> extends AbstractIterator<T> {

    /* renamed from: d */
    public final Queue<T> f20938d;

    @Override // com.google.common.collect.AbstractIterator
    /* renamed from: a */
    public T mo11332a() {
        if (!this.f20938d.isEmpty()) {
            return this.f20938d.remove();
        }
        m11333b();
        return null;
    }
}
