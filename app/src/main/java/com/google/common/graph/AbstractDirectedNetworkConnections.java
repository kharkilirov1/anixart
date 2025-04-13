package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: com.google.common.graph.AbstractDirectedNetworkConnections$1 */
    class C18261 extends AbstractSet<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Objects.requireNonNull(null);
            throw null;
        }
    }
}
