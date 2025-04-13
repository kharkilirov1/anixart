package com.google.firebase.database.collection;

/* loaded from: classes2.dex */
public class LLRBRedValueNode<K, V> extends LLRBValueNode<K, V> {
    public LLRBRedValueNode(K k2, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k2, v, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int size() {
        return this.f22554d.size() + this.f22553c.size() + 1;
    }
}
