package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract List<E> mo11329H();

    public void add(int i2, E e2) {
        mo7455G().add(i2, e2);
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i2, Collection<? extends E> collection) {
        return mo7455G().addAll(i2, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || mo7455G().equals(obj);
    }

    @Override // java.util.List
    public E get(int i2) {
        return mo7455G().get(i2);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return mo7455G().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return mo7455G().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return mo7455G().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return mo7455G().listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E remove(int i2) {
        return mo7455G().remove(i2);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E set(int i2, E e2) {
        return mo7455G().set(i2, e2);
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return mo7455G().subList(i2, i3);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return mo7455G().listIterator(i2);
    }
}
