package com.google.firebase.database.collection;

/* loaded from: classes2.dex */
public interface LLRBNode<K, V> {

    public enum Color {
        RED,
        BLACK
    }

    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
    }

    public interface ShortCircuitingNodeVisitor<K, V> {
    }

    /* renamed from: a */
    LLRBNode<K, V> mo12354a();

    /* renamed from: b */
    LLRBNode<K, V> mo12355b();

    K getKey();

    boolean isEmpty();

    int size();
}
