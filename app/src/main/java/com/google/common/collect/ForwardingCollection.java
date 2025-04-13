package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> mo7455G();

    /* renamed from: I */
    public Object[] m11559I() {
        return toArray(new Object[size()]);
    }

    /* renamed from: J */
    public String m11560J() {
        StringBuilder m11433d = Collections2.m11433d(size());
        m11433d.append('[');
        boolean z = true;
        for (E e2 : this) {
            if (!z) {
                m11433d.append(", ");
            }
            z = false;
            if (e2 == this) {
                m11433d.append("(this Collection)");
            } else {
                m11433d.append(e2);
            }
        }
        m11433d.append(']');
        return m11433d.toString();
    }

    @CanIgnoreReturnValue
    public boolean add(E e2) {
        return mo11329H().add(e2);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return mo11329H().addAll(collection);
    }

    public void clear() {
        mo11329H().clear();
    }

    public boolean contains(Object obj) {
        return mo11329H().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo11329H().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo11329H().isEmpty();
    }

    public Iterator<E> iterator() {
        return mo11329H().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return mo11329H().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return mo11329H().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return mo11329H().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return mo11329H().size();
    }

    public Object[] toArray() {
        return mo11329H().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) mo11329H().toArray(tArr);
    }
}
