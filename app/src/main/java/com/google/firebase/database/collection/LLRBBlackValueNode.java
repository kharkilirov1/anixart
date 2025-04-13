package com.google.firebase.database.collection;

/* loaded from: classes2.dex */
public class LLRBBlackValueNode<K, V> extends LLRBValueNode<K, V> {

    /* renamed from: e */
    public int f22546e;

    public LLRBBlackValueNode(K k2, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k2, v, lLRBNode, lLRBNode2);
        this.f22546e = -1;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    /* renamed from: c */
    public void mo12353c(LLRBNode<K, V> lLRBNode) {
        if (this.f22546e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f22553c = lLRBNode;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int size() {
        if (this.f22546e == -1) {
            this.f22546e = this.f22554d.size() + this.f22553c.size() + 1;
        }
        return this.f22546e;
    }
}
