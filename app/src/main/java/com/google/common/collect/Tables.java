package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@GwtCompatible
/* loaded from: classes.dex */
public final class Tables {

    /* renamed from: a */
    public static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> f21569a = new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.1
        @Override // com.google.common.base.Function
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return Objects.m11173a(mo11419b(), cell.mo11419b()) && Objects.m11173a(mo11418a(), cell.mo11418a()) && Objects.m11173a(getValue(), cell.getValue());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{mo11419b(), mo11418a(), getValue()});
        }

        public String toString() {
            String valueOf = String.valueOf(mo11419b());
            String valueOf2 = String.valueOf(mo11418a());
            String valueOf3 = String.valueOf(getValue());
            return C0000a.m20q(C0576a.m4122u(valueOf3.length() + valueOf2.length() + valueOf.length() + 4, "(", valueOf, ",", valueOf2), ")=", valueOf3);
        }
    }

    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {

        /* renamed from: b */
        @NullableDecl
        public final R f21570b;

        /* renamed from: c */
        @NullableDecl
        public final C f21571c;

        /* renamed from: d */
        @NullableDecl
        public final V f21572d;

        public ImmutableCell(@NullableDecl R r, @NullableDecl C c2, @NullableDecl V v) {
            this.f21570b = r;
            this.f21571c = c2;
            this.f21572d = v;
        }

        @Override // com.google.common.collect.Table.Cell
        /* renamed from: a */
        public C mo11418a() {
            return this.f21571c;
        }

        @Override // com.google.common.collect.Table.Cell
        /* renamed from: b */
        public R mo11419b() {
            return this.f21570b;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.f21572d;
        }
    }

    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* renamed from: com.google.common.collect.Tables$TransformedTable$1 */
        class C17841 implements Function<Table.Cell<Object, Object, Object>, Table.Cell<Object, Object, Object>> {

            /* renamed from: b */
            public final /* synthetic */ TransformedTable f21573b;

            @Override // com.google.common.base.Function
            public Table.Cell<Object, Object, Object> apply(Table.Cell<Object, Object, Object> cell) {
                Table.Cell<Object, Object, Object> cell2 = cell;
                cell2.mo11419b();
                cell2.mo11418a();
                java.util.Objects.requireNonNull(this.f21573b);
                cell2.getValue();
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$2 */
        public class C17852 implements Function<Map<C, V1>, Map<C, V2>> {

            /* renamed from: b */
            public final /* synthetic */ TransformedTable f21574b;

            @Override // com.google.common.base.Function
            public Object apply(Object obj) {
                java.util.Objects.requireNonNull(this.f21574b);
                Maps.m11795l((Map) obj, null);
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$3 */
        class C17863 implements Function<Map<Object, Object>, Map<Object, Object>> {

            /* renamed from: b */
            public final /* synthetic */ TransformedTable f21575b;

            @Override // com.google.common.base.Function
            public Map<Object, Object> apply(Map<Object, Object> map) {
                java.util.Objects.requireNonNull(this.f21575b);
                Maps.m11795l(map, null);
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: a */
        public Iterator<Table.Cell<R, C, V2>> mo11406a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: b */
        public void mo11407b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: f */
        public Collection<V2> mo11411f() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        /* renamed from: t */
        public Map<R, Map<C, V2>> mo11417t() {
            throw null;
        }
    }

    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {

        /* renamed from: d */
        public static final Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> f21576d = new Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>>() { // from class: com.google.common.collect.Tables.TransposeTable.1
            @Override // com.google.common.base.Function
            public Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
                Table.Cell<?, ?, ?> cell2 = cell;
                return new ImmutableCell(cell2.mo11418a(), cell2.mo11419b(), cell2.getValue());
            }
        };

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: a */
        public Iterator<Table.Cell<C, R, V>> mo11406a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: b */
        public void mo11407b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        /* renamed from: c */
        public boolean mo11408c(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        /* renamed from: t */
        public Map<C, Map<R, V>> mo11417t() {
            throw null;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Table mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        /* renamed from: t */
        public Map mo11417t() {
            throw null;
        }
    }

    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* renamed from: H */
        public Table<R, C, V> mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        /* renamed from: d */
        public Set<Table.Cell<R, C, V>> mo11409d() {
            return Collections.unmodifiableSet(super.mo11409d());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        /* renamed from: t */
        public Map<R, Map<C, V>> mo11417t() {
            return Collections.unmodifiableMap(new Maps.TransformedEntriesMap(super.mo11417t(), new Maps.C17169(Tables.f21569a)));
        }
    }
}
