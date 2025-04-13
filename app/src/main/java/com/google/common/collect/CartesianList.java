package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: b */
    public static final /* synthetic */ int f20875b = 0;

    /* renamed from: com.google.common.collect.CartesianList$1 */
    class C16281 extends ImmutableList<Object> {

        /* renamed from: d */
        public final /* synthetic */ CartesianList f20876d;

        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            CartesianList cartesianList = this.f20876d;
            int i3 = CartesianList.f20875b;
            Objects.requireNonNull(cartesianList);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            CartesianList cartesianList = this.f20876d;
            int i2 = CartesianList.f20875b;
            Objects.requireNonNull(cartesianList);
            throw null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        throw null;
    }
}
