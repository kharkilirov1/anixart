package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    @Beta
    public class StandardElementSet extends Multisets.ElementSet<E> {
        @Override // com.google.common.collect.Multisets.ElementSet
        /* renamed from: e */
        public Multiset<E> mo11390e() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            throw null;
        }
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract Multiset<E> mo11329H();

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: X */
    public int mo11376X(E e2, int i2) {
        return mo11329H().mo11376X(e2, i2);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: d0 */
    public boolean mo11377d0(E e2, int i2, int i3) {
        return mo11329H().mo11377d0(e2, i2, i3);
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return mo11329H().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || mo11329H().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return mo11329H().hashCode();
    }

    /* renamed from: l */
    public Set<E> mo11389l() {
        return mo11329H().mo11389l();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: o */
    public int mo11381o(Object obj, int i2) {
        return mo11329H().mo11381o(obj, i2);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: p */
    public int mo11382p(E e2, int i2) {
        return mo11329H().mo11382p(e2, i2);
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(Object obj) {
        return mo11329H().mo11383s0(obj);
    }
}
