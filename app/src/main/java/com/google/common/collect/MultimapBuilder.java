package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class MultimapBuilder<K0, V0> {

    /* renamed from: com.google.common.collect.MultimapBuilder$2 */
    class C17252 extends MultimapBuilderWithKeys<Object> {
        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: b */
        public <K, V> Map<K, Collection<V>> mo11813b() {
            return new CompactLinkedHashMap(0);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$4 */
    class C17274 extends MultimapBuilderWithKeys<Enum<Object>> {
        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: b */
        public <K extends Enum<Object>, V> Map<K, Collection<V>> mo11813b() {
            return new EnumMap((Class) null);
        }
    }

    public static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {

        /* renamed from: b */
        public final int f21339b;

        public ArrayListSupplier(int i2) {
            CollectPreconditions.m11427b(i2, "expectedValuesPerKey");
            this.f21339b = i2;
        }

        @Override // com.google.common.base.Supplier
        public Object get() {
            return new ArrayList(this.f21339b);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return EnumSet.noneOf(null);
        }
    }

    public static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return new CompactHashSet(0);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return new CompactLinkedHashSet(0);
        }
    }

    public enum LinkedListSupplier implements Supplier<List<Object>> {
        INSTANCE;

        @Override // com.google.common.base.Supplier
        public List<Object> get() {
            return new LinkedList();
        }
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public ListMultimapBuilder() {
            super(null);
        }

        /* renamed from: c */
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> mo11814c();
    }

    public static abstract class MultimapBuilderWithKeys<K0> {

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2 */
        class C17292 extends ListMultimapBuilder<Object, Object> {
            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder
            /* renamed from: c */
            public <K, V> ListMultimap<K, V> mo11814c() {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3 */
        class C17303 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4 */
        class C17314 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5 */
        class C17325 extends SortedSetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6 */
        class C17336 extends SetMultimapBuilder<Object, Enum<Object>> {
        }

        /* renamed from: a */
        public ListMultimapBuilder<K0, Object> m11815a() {
            final int i2 = 2;
            CollectPreconditions.m11427b(2, "expectedValuesPerKey");
            return (ListMultimapBuilder<K0, Object>) new ListMultimapBuilder<Object, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder
                /* renamed from: c */
                public <K, V> ListMultimap<K, V> mo11814c() {
                    return new Multimaps.CustomListMultimap(MultimapBuilderWithKeys.this.mo11813b(), new ArrayListSupplier(i2));
                }
            };
        }

        /* renamed from: b */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo11813b();
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public SetMultimapBuilder() {
            super(null);
        }
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
    }

    public static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return new TreeSet((Comparator) null);
        }
    }

    public MultimapBuilder() {
    }

    /* renamed from: a */
    public static MultimapBuilderWithKeys<Object> m11811a() {
        final int i2 = 8;
        CollectPreconditions.m11427b(8, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            /* renamed from: b */
            public <K, V> Map<K, Collection<V>> mo11813b() {
                return new CompactHashMap(i2);
            }
        };
    }

    /* renamed from: b */
    public static MultimapBuilderWithKeys<Comparable> m11812b() {
        final NaturalOrdering naturalOrdering = NaturalOrdering.f21382d;
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            /* renamed from: b */
            public <K, V> Map<K, Collection<V>> mo11813b() {
                return new TreeMap(naturalOrdering);
            }
        };
    }

    public MultimapBuilder(C17241 c17241) {
    }
}
