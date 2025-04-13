package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    @DoNotMock
    public static final class Builder<R, C, V> {
        public Builder() {
            new ArrayList();
        }
    }

    public static final class SerializedForm implements Serializable {
    }

    /* renamed from: j */
    public static <R, C, V> Table.Cell<R, C, V> m11693j(R r, C c2, V v) {
        Preconditions.m11187k(r, "rowKey");
        Preconditions.m11187k(c2, "columnKey");
        Preconditions.m11187k(v, "value");
        return new Tables.ImmutableCell(r, c2, v);
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: a */
    public Iterator mo11406a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable
    @DoNotCall
    @Deprecated
    /* renamed from: b */
    public final void mo11407b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: c */
    public boolean mo11408c(@NullableDecl Object obj) {
        return ((ImmutableCollection) super.m11413h()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    /* renamed from: d */
    public Set mo11409d() {
        return (ImmutableSet) super.mo11409d();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: i */
    public final Iterator<V> mo11414i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet<Table.Cell<R, C, V>> mo11410e();

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection<V> mo11411f();

    @Override // com.google.common.collect.Table
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableMap<R, Map<C, V>> mo11417t();
}
