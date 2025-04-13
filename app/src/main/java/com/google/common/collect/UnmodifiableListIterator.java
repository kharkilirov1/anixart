package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class UnmodifiableListIterator<E> extends UnmodifiableIterator<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @DoNotCall
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @DoNotCall
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
