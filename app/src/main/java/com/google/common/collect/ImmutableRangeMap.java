package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {

    /* renamed from: b */
    public final transient ImmutableList<Range<K>> f21070b;

    /* renamed from: c */
    public final transient ImmutableList<V> f21071c;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1 */
    class C16611 extends ImmutableList<Range<Comparable<?>>> {
        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, 0);
            if (i2 == 0) {
                throw null;
            }
            if (i2 == -1) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2 */
    class C16622 extends ImmutableRangeMap<Comparable<?>, Object> {
        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo11665a() {
            return mo11665a();
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {
        public Builder() {
            new ArrayList();
        }
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
    }

    static {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList<Object> immutableList = RegularImmutableList.f21423f;
    }

    @Override // com.google.common.collect.RangeMap
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> mo11665a() {
        if (this.f21070b.isEmpty()) {
            return (ImmutableMap<Range<K>, V>) RegularImmutableMap.f21426h;
        }
        ImmutableList<Range<K>> immutableList = this.f21070b;
        Range<Comparable> range = Range.f21403d;
        return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.f21408b), this.f21071c);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof RangeMap) {
            return mo11665a().equals(((RangeMap) obj).mo11665a());
        }
        return false;
    }

    public int hashCode() {
        return mo11665a().hashCode();
    }

    public String toString() {
        return mo11665a().toString();
    }
}
