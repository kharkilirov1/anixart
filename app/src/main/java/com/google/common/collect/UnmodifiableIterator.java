package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class UnmodifiableIterator<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @DoNotCall
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
