package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractMap.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    /* renamed from: b */
    @Nullable
    public volatile Set<? extends K> f63121b;

    /* renamed from: c */
    @Nullable
    public volatile Collection<? extends V> f63122c;

    /* compiled from: AbstractMap.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public abstract Set m31908a();

    /* renamed from: b */
    public final Map.Entry<K, V> m31909b(K k2) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.m32174c(((Map.Entry) obj).getKey(), k2)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m31909b(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m32174c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m31908a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[LOOP:0: B:17:0x002a->B:26:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r5.size()
            java.util.Map r6 = (java.util.Map) r6
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Set r6 = r6.entrySet()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L26
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L5a
        L26:
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L3a
        L38:
            r1 = 0
            goto L57
        L3a:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = kotlin.jvm.internal.Intrinsics.m32174c(r1, r4)
            if (r1 != 0) goto L4d
            goto L38
        L4d:
            if (r4 != 0) goto L56
            boolean r1 = r5.containsKey(r3)
            if (r1 != 0) goto L56
            goto L38
        L56:
            r1 = 1
        L57:
            if (r1 != 0) goto L2a
            r0 = 0
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.AbstractMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> m31909b = m31909b(obj);
        if (m31909b != null) {
            return m31909b.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f63121b == null) {
            this.f63121b = new AbstractSet<Object>(this) { // from class: kotlin.collections.AbstractMap$keys$1

                /* renamed from: b */
                public final /* synthetic */ AbstractMap<Object, Object> f63123b;

                {
                    this.f63123b = this;
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public int getF63156f() {
                    return this.f63123b.size();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return this.f63123b.containsKey(obj);
                }

                @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
                @NotNull
                public Iterator<Object> iterator() {
                    return new AbstractMap$keys$1$iterator$1(this.f63123b.entrySet().iterator());
                }
            };
        }
        Set<? extends K> set = this.f63121b;
        Intrinsics.m32176e(set);
        return set;
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return entrySet().size();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m31989B(entrySet(), ", ", "{", "}", 0, null, new Function1<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap$toString$1

            /* renamed from: b */
            public final /* synthetic */ AbstractMap<K, V> f63125b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f63125b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(Object obj) {
                Map.Entry it = (Map.Entry) obj;
                Intrinsics.m32179h(it, "it");
                AbstractMap<K, V> abstractMap = this.f63125b;
                Objects.requireNonNull(abstractMap);
                StringBuilder sb = new StringBuilder();
                Object key = it.getKey();
                sb.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it.getValue();
                sb.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f63122c == null) {
            this.f63122c = new AbstractCollection<Object>(this) { // from class: kotlin.collections.AbstractMap$values$1

                /* renamed from: b */
                public final /* synthetic */ AbstractMap<Object, Object> f63126b;

                {
                    this.f63126b = this;
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public int getF63156f() {
                    return this.f63126b.size();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return this.f63126b.containsValue(obj);
                }

                @Override // java.util.Collection, java.lang.Iterable
                @NotNull
                public Iterator<Object> iterator() {
                    return new AbstractMap$values$1$iterator$1(this.f63126b.entrySet().iterator());
                }
            };
        }
        Collection<? extends V> collection = this.f63122c;
        Intrinsics.m32176e(collection);
        return collection;
    }
}
