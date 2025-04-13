package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: b */
    public static final /* synthetic */ int f21733b = 0;

    /* renamed from: com.google.common.graph.MultiEdgesConnecting$1 */
    class C18501 extends AbstractIterator<Object> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f21734d;

        /* renamed from: e */
        public final /* synthetic */ MultiEdgesConnecting f21735e;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            if (!this.f21734d.hasNext()) {
                m11333b();
                return null;
            }
            Map.Entry entry = (Map.Entry) this.f21734d.next();
            MultiEdgesConnecting multiEdgesConnecting = this.f21735e;
            int i2 = MultiEdgesConnecting.f21733b;
            Objects.requireNonNull(multiEdgesConnecting);
            entry.getValue();
            throw null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw null;
    }
}
