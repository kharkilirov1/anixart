package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> mo7455G();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return mo7455G().hasNext();
    }

    @CanIgnoreReturnValue
    public T next() {
        return mo7455G().next();
    }

    public void remove() {
        mo7455G().remove();
    }
}
