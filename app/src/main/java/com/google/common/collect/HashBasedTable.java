package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {

    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return new LinkedHashMap(Maps.m11787d(0));
        }
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable
    /* renamed from: c */
    public boolean mo11408c(@NullableDecl Object obj) {
        return super.mo11408c(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable
    /* renamed from: g */
    public V mo11412g(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (V) super.mo11412g(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: l */
    public boolean mo11579l(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.mo11579l(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: m */
    public boolean mo11580m(@NullableDecl Object obj) {
        return super.mo11580m(obj);
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: n */
    public boolean mo11581n(@NullableDecl Object obj) {
        return super.mo11581n(obj);
    }

    @Override // com.google.common.collect.StandardTable
    @CanIgnoreReturnValue
    /* renamed from: r */
    public V mo11582r(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (V) super.mo11582r(obj, obj2);
    }
}
