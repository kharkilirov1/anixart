package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b */
    public final ArrayDeque<LLRBValueNode<K, V>> f22542b = new ArrayDeque<>();

    /* renamed from: c */
    public final boolean f22543c;

    public ImmutableSortedMapIterator(LLRBNode<K, V> lLRBNode, K k2, Comparator<K> comparator, boolean z) {
        this.f22543c = z;
        while (!lLRBNode.isEmpty()) {
            int compare = k2 != null ? z ? comparator.compare(k2, lLRBNode.getKey()) : comparator.compare(lLRBNode.getKey(), k2) : 1;
            if (compare < 0) {
                lLRBNode = z ? lLRBNode.mo12354a() : lLRBNode.mo12355b();
            } else if (compare == 0) {
                this.f22542b.push((LLRBValueNode) lLRBNode);
                return;
            } else {
                this.f22542b.push((LLRBValueNode) lLRBNode);
                lLRBNode = z ? lLRBNode.mo12355b() : lLRBNode.mo12354a();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22542b.size() > 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            LLRBValueNode<K, V> pop = this.f22542b.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.f22551a, pop.f22552b);
            if (this.f22543c) {
                for (LLRBNode<K, V> lLRBNode = pop.f22553c; !lLRBNode.isEmpty(); lLRBNode = lLRBNode.mo12355b()) {
                    this.f22542b.push((LLRBValueNode) lLRBNode);
                }
            } else {
                for (LLRBNode<K, V> lLRBNode2 = pop.f22554d; !lLRBNode2.isEmpty(); lLRBNode2 = lLRBNode2.mo12354a()) {
                    this.f22542b.push((LLRBValueNode) lLRBNode2);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
