package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0005\u0006\u0007¨\u0006\b"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67394c = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");

    @NotNull
    private volatile /* synthetic */ int _size;

    /* renamed from: b */
    @Nullable
    public final ReferenceQueue<K> f67395b;

    @NotNull
    public volatile /* synthetic */ Object core;

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "KeyValueIterator", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class Core {

        /* renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f67396g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load");

        /* renamed from: a */
        public final int f67397a;

        /* renamed from: b */
        public final int f67398b;

        /* renamed from: c */
        public final int f67399c;

        /* renamed from: d */
        @NotNull
        public /* synthetic */ AtomicReferenceArray f67400d;

        /* renamed from: e */
        @NotNull
        public /* synthetic */ AtomicReferenceArray f67401e;

        @NotNull
        private volatile /* synthetic */ int load = 0;

        /* compiled from: ConcurrentWeakMap.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {

            /* renamed from: b */
            @NotNull
            public final Function2<K, V, E> f67403b;

            /* renamed from: c */
            public int f67404c = -1;

            /* renamed from: d */
            public K f67405d;

            /* renamed from: e */
            public V f67406e;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
                this.f67403b = function2;
                m34200a();
            }

            /* renamed from: a */
            public final void m34200a() {
                while (true) {
                    int i2 = this.f67404c + 1;
                    this.f67404c = i2;
                    ConcurrentWeakMap<K, V>.Core core = Core.this;
                    if (i2 >= core.f67397a) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) core.f67400d.get(i2);
                    K k2 = hashedWeakRef == null ? null : (K) hashedWeakRef.get();
                    if (k2 != null) {
                        this.f67405d = k2;
                        Object obj = (V) Core.this.f67401e.get(this.f67404c);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).f67433a;
                        }
                        if (obj != null) {
                            this.f67406e = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f67404c < Core.this.f67397a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f67404c >= Core.this.f67397a) {
                    throw new NoSuchElementException();
                }
                Function2<K, V, E> function2 = this.f67403b;
                K k2 = this.f67405d;
                if (k2 == null) {
                    Intrinsics.m32189r("key");
                    throw null;
                }
                V v = this.f67406e;
                if (v == null) {
                    Intrinsics.m32189r("value");
                    throw null;
                }
                E invoke = function2.invoke(k2, v);
                m34200a();
                return invoke;
            }

            @Override // java.util.Iterator
            public void remove() {
                ConcurrentWeakMapKt.m34201a();
                throw null;
            }
        }

        public Core(int i2) {
            this.f67397a = i2;
            this.f67398b = Integer.numberOfLeadingZeros(i2) + 1;
            this.f67399c = (i2 * 2) / 3;
            this.f67400d = new AtomicReferenceArray(i2);
            this.f67401e = new AtomicReferenceArray(i2);
        }

        /* renamed from: a */
        public final int m34196a(int i2) {
            return (i2 * (-1640531527)) >>> this.f67398b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            r6 = r5.f67401e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r5.f67401e.compareAndSet(r0, r6, r7) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        
            return kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a;
         */
        @org.jetbrains.annotations.Nullable
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m34197b(@org.jetbrains.annotations.NotNull K r6, @org.jetbrains.annotations.Nullable V r7, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.HashedWeakRef<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.m34196a(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f67400d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L43
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L2f
            L19:
                int r1 = r5.load
                int r3 = r5.f67399c
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.f67396g
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 == 0) goto L19
                r1 = 1
            L2f:
                if (r8 != 0) goto L3a
                kotlinx.coroutines.debug.internal.HashedWeakRef r8 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue<K> r3 = r3.f67395b
                r8.<init>(r6, r3)
            L3a:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f67400d
                boolean r2 = r3.compareAndSet(r0, r2, r8)
                if (r2 == 0) goto L9
                goto L54
            L43:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r2)
                if (r3 == 0) goto L6c
                if (r1 == 0) goto L54
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.f67396g
                r6.decrementAndGet(r5)
            L54:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f67401e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r8 == 0) goto L63
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f67414a
                return r6
            L63:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f67401e
                boolean r8 = r8.compareAndSet(r0, r6, r7)
                if (r8 == 0) goto L54
                return r6
            L6c:
                if (r2 != 0) goto L71
                r5.m34199d(r0)
            L71:
                if (r0 != 0) goto L75
                int r0 = r5.f67397a
            L75:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.m34197b(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* renamed from: c */
        public final ConcurrentWeakMap<K, V>.Core m34198c() {
            Object obj;
            while (true) {
                int i2 = ConcurrentWeakMap.this.get_size();
                if (i2 < 4) {
                    i2 = 4;
                }
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(i2) * 4);
                int i3 = 0;
                int i4 = this.f67397a;
                while (i3 < i4) {
                    int i5 = i3 + 1;
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f67400d.get(i3);
                    Object obj2 = hashedWeakRef == null ? null : hashedWeakRef.get();
                    if (hashedWeakRef != null && obj2 == null) {
                        m34199d(i3);
                    }
                    while (true) {
                        obj = this.f67401e.get(i3);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).f67433a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f67401e;
                        Symbol symbol = ConcurrentWeakMapKt.f67414a;
                        if (atomicReferenceArray.compareAndSet(i3, obj, obj == null ? ConcurrentWeakMapKt.f67415b : Intrinsics.m32174c(obj, Boolean.TRUE) ? ConcurrentWeakMapKt.f67416c : new Marked(obj))) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object m34197b = core.m34197b(obj2, obj, hashedWeakRef);
                        Symbol symbol2 = ConcurrentWeakMapKt.f67414a;
                        if (m34197b == ConcurrentWeakMapKt.f67414a) {
                            break;
                        }
                    }
                    i3 = i5;
                }
                return core;
            }
        }

        /* renamed from: d */
        public final void m34199d(int i2) {
            Object obj;
            do {
                obj = this.f67401e.get(i2);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!this.f67401e.compareAndSet(i2, obj, null));
            ConcurrentWeakMap<K, V> concurrentWeakMap = ConcurrentWeakMap.this;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f67394c;
            Objects.requireNonNull(concurrentWeakMap);
            ConcurrentWeakMap.f67394c.decrementAndGet(concurrentWeakMap);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: b */
        public final K f67408b;

        /* renamed from: c */
        public final V f67409c;

        public Entry(K k2, V v) {
            this.f67408b = k2;
            this.f67409c = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f67408b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f67409c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            ConcurrentWeakMapKt.m34201a();
            throw null;
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class KeyValueSet<E> extends AbstractMutableSet<E> {

        /* renamed from: b */
        @NotNull
        public final Function2<K, V, E> f67410b;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            this.f67410b = function2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e2) {
            ConcurrentWeakMapKt.m34201a();
            throw null;
        }

        @Override // kotlin.collections.AbstractMutableSet
        /* renamed from: b */
        public int mo31916b() {
            return ConcurrentWeakMap.this.get_size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            Core core = (Core) ConcurrentWeakMap.this.core;
            Function2<K, V, E> function2 = this.f67410b;
            Objects.requireNonNull(core);
            return core.new KeyValueIterator(function2);
        }
    }

    public ConcurrentWeakMap() {
        this(false);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo31913a() {
        return new KeyValueSet(new Function2<K, V, Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // kotlin.jvm.functions.Function2
            public Object invoke(Object obj, Object obj2) {
                return new ConcurrentWeakMap.Entry(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    /* renamed from: b */
    public Set<K> mo31914b() {
        return new KeyValueSet(new Function2<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final K invoke(@NotNull K k2, @NotNull V v) {
                return k2;
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: c, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator it = ((KeyValueSet) mo31914b()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* renamed from: d */
    public final synchronized V m34195d(K k2, V v) {
        V v2;
        Core core = (Core) this.core;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f67396g;
            v2 = (V) core.m34197b(k2, v, null);
            Symbol symbol = ConcurrentWeakMapKt.f67414a;
            if (v2 == ConcurrentWeakMapKt.f67414a) {
                core = core.m34198c();
                this.core = core;
            }
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) this.core;
        Objects.requireNonNull(core);
        int m34196a = core.m34196a(obj.hashCode());
        while (true) {
            HashedWeakRef hashedWeakRef = (HashedWeakRef) core.f67400d.get(m34196a);
            if (hashedWeakRef == null) {
                return null;
            }
            T t = hashedWeakRef.get();
            if (Intrinsics.m32174c(obj, t)) {
                Object obj2 = core.f67401e.get(m34196a);
                if (obj2 instanceof Marked) {
                    obj2 = ((Marked) obj2).f67433a;
                }
                return (V) obj2;
            }
            if (t == 0) {
                core.m34199d(m34196a);
            }
            if (m34196a == 0) {
                m34196a = core.f67397a;
            }
            m34196a--;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k2, @NotNull V v) {
        Core core = (Core) this.core;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f67396g;
        V v2 = (V) core.m34197b(k2, v, null);
        Symbol symbol = ConcurrentWeakMapKt.f67414a;
        if (v2 == ConcurrentWeakMapKt.f67414a) {
            v2 = m34195d(k2, v);
        }
        if (v2 == null) {
            f67394c.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        if (obj == 0) {
            return null;
        }
        Core core = (Core) this.core;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f67396g;
        V v = (V) core.m34197b(obj, null, null);
        Symbol symbol = ConcurrentWeakMapKt.f67414a;
        if (v == ConcurrentWeakMapKt.f67414a) {
            v = m34195d(obj, null);
        }
        if (v != null) {
            f67394c.decrementAndGet(this);
        }
        return v;
    }

    public ConcurrentWeakMap(boolean z) {
        this._size = 0;
        this.core = new Core(16);
        this.f67395b = z ? new ReferenceQueue<>() : null;
    }
}
