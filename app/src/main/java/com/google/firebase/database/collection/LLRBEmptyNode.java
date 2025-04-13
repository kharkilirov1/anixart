package com.google.firebase.database.collection;

/* loaded from: classes2.dex */
public class LLRBEmptyNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a */
    public static final LLRBEmptyNode f22547a = new LLRBEmptyNode();

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: a */
    public LLRBNode<K, V> mo12354a() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: b */
    public LLRBNode<K, V> mo12355b() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public K getKey() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int size() {
        return 0;
    }
}
