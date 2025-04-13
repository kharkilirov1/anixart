package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class MapIteratorCache<K, V> {

    /* renamed from: a */
    @NullableDecl
    public volatile transient Map.Entry<K, V> f21725a;

    /* renamed from: com.google.common.graph.MapIteratorCache$1 */
    class C18491 extends AbstractSet<Object> {

        /* renamed from: b */
        public final /* synthetic */ MapIteratorCache f21726b;

        /* renamed from: com.google.common.graph.MapIteratorCache$1$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<Object> {

            /* renamed from: b */
            public final /* synthetic */ Iterator f21727b;

            /* renamed from: c */
            public final /* synthetic */ C18491 f21728c;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21727b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, V> entry = (Map.Entry) this.f21727b.next();
                this.f21728c.f21726b.f21725a = entry;
                return entry.getKey();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            Objects.requireNonNull(this.f21726b.mo12013a(obj));
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            Objects.requireNonNull(this.f21726b);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Objects.requireNonNull(this.f21726b);
            throw null;
        }
    }

    /* renamed from: a */
    public V mo12013a(@NullableDecl Object obj) {
        Map.Entry<K, V> entry = this.f21725a;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }
}
