package com.google.firebase.database.collection;

/* loaded from: classes2.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a */
    public final K f22551a;

    /* renamed from: b */
    public final V f22552b;

    /* renamed from: c */
    public LLRBNode<K, V> f22553c;

    /* renamed from: d */
    public final LLRBNode<K, V> f22554d;

    public LLRBValueNode(K k2, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.f22551a = k2;
        this.f22552b = v;
        this.f22553c = lLRBNode == null ? LLRBEmptyNode.f22547a : lLRBNode;
        this.f22554d = lLRBNode2 == null ? LLRBEmptyNode.f22547a : lLRBNode2;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: a */
    public LLRBNode<K, V> mo12354a() {
        return this.f22553c;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: b */
    public LLRBNode<K, V> mo12355b() {
        return this.f22554d;
    }

    /* renamed from: c */
    public void mo12353c(LLRBNode<K, V> lLRBNode) {
        this.f22553c = lLRBNode;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public K getKey() {
        return this.f22551a;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean isEmpty() {
        return false;
    }
}
