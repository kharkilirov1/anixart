package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ListIterator;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // com.google.common.collect.ForwardingIterator
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListIterator<E> mo7455G();

    @Override // java.util.ListIterator
    public void add(E e2) {
        mo11329H().add(e2);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return mo11329H().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return mo11329H().nextIndex();
    }

    @Override // java.util.ListIterator
    @CanIgnoreReturnValue
    public E previous() {
        return mo11329H().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return mo11329H().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(E e2) {
        mo11329H().set(e2);
    }
}
