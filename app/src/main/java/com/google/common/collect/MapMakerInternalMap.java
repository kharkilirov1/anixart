package com.google.common.collect;

import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: k */
    public static final WeakValueReference<Object, Object, DummyInternalEntry> f21220k = new WeakValueReference<Object, Object, DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        /* renamed from: a */
        public WeakValueReference<Object, Object, DummyInternalEntry> mo11754a(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        /* renamed from: b */
        public /* bridge */ /* synthetic */ DummyInternalEntry mo11755b() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public Object get() {
            return null;
        }
    };

    /* renamed from: b */
    public final transient int f21221b;

    /* renamed from: c */
    public final transient int f21222c;

    /* renamed from: d */
    public final transient Segment<K, V, E, S>[] f21223d;

    /* renamed from: e */
    public final int f21224e = Math.min(4, TextBuffer.MAX_SEGMENT_LEN);

    /* renamed from: f */
    public final Equivalence<Object> f21225f;

    /* renamed from: g */
    public final transient InternalEntryHelper<K, V, E, S> f21226g;

    /* renamed from: h */
    @NullableDecl
    public transient Set<K> f21227h;

    /* renamed from: i */
    @NullableDecl
    public transient Collection<V> f21228i;

    /* renamed from: j */
    @NullableDecl
    public transient Set<Map.Entry<K, V>> f21229j;

    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Map mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap
        /* renamed from: J */
        public ConcurrentMap<K, V> mo7456H() {
            return null;
        }
    }

    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* renamed from: b */
        public final K f21230b;

        /* renamed from: c */
        public final int f21231c;

        /* renamed from: d */
        @NullableDecl
        public final E f21232d;

        public AbstractStrongKeyEntry(K k2, int i2, @NullableDecl E e2) {
            this.f21230b = k2;
            this.f21231c = i2;
            this.f21232d = e2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: a */
        public E mo11756a() {
            return this.f21232d;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: c */
        public int mo11757c() {
            return this.f21231c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
            return this.f21230b;
        }
    }

    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* renamed from: b */
        public final int f21233b;

        /* renamed from: c */
        @NullableDecl
        public final E f21234c;

        public AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl E e2) {
            super(k2, referenceQueue);
            this.f21233b = i2;
            this.f21234c = e2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: a */
        public E mo11756a() {
            return this.f21234c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: c */
        public int mo11757c() {
            return this.f21233b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
            return get();
        }
    }

    public static final class CleanupMapTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        public DummyInternalEntry() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: a */
        public DummyInternalEntry mo11756a() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* renamed from: c */
        public int mo11757c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            throw new AssertionError();
        }
    }

    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m11760c();
        }
    }

    public final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        public EntrySet() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.m11753d().m11153d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public int f21236b;

        /* renamed from: c */
        public int f21237c = -1;

        /* renamed from: d */
        @NullableDecl
        public Segment<K, V, E, S> f21238d;

        /* renamed from: e */
        @NullableDecl
        public AtomicReferenceArray<E> f21239e;

        /* renamed from: f */
        @NullableDecl
        public E f21240f;

        /* renamed from: g */
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f21241g;

        /* renamed from: h */
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f21242h;

        public HashIterator() {
            this.f21236b = MapMakerInternalMap.this.f21223d.length - 1;
            m11758a();
        }

        /* renamed from: a */
        public final void m11758a() {
            this.f21241g = null;
            if (m11761d() || m11762e()) {
                return;
            }
            while (true) {
                int i2 = this.f21236b;
                if (i2 < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f21223d;
                this.f21236b = i2 - 1;
                Segment<K, V, E, S> segment = segmentArr[i2];
                this.f21238d = segment;
                if (segment.f21247c != 0) {
                    this.f21239e = this.f21238d.f21250f;
                    this.f21237c = r0.length() - 1;
                    if (m11762e()) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean m11759b(E e2) {
            boolean z;
            try {
                Object key = e2.getKey();
                Objects.requireNonNull(MapMakerInternalMap.this);
                Object value = e2.getKey() == null ? null : e2.getValue();
                if (value != null) {
                    this.f21241g = new WriteThroughEntry(key, value);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f21238d.m11775h();
            }
        }

        /* renamed from: c */
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry m11760c() {
            MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.f21241g;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f21242h = writeThroughEntry;
            m11758a();
            return this.f21242h;
        }

        /* renamed from: d */
        public boolean m11761d() {
            E e2 = this.f21240f;
            if (e2 == null) {
                return false;
            }
            while (true) {
                this.f21240f = (E) e2.mo11756a();
                E e3 = this.f21240f;
                if (e3 == null) {
                    return false;
                }
                if (m11759b(e3)) {
                    return true;
                }
                e2 = this.f21240f;
            }
        }

        /* renamed from: e */
        public boolean m11762e() {
            while (true) {
                int i2 = this.f21237c;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f21239e;
                this.f21237c = i2 - 1;
                E e2 = atomicReferenceArray.get(i2);
                this.f21240f = e2;
                if (e2 != null && (m11759b(e2) || m11761d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21241g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21242h != null, "no calls to next() since the last call to remove()");
            MapMakerInternalMap.this.remove(this.f21242h.f21271b);
            this.f21242h = null;
        }
    }

    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        /* renamed from: a */
        E mo11756a();

        /* renamed from: c */
        int mo11757c();

        K getKey();

        V getValue();
    }

    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        /* renamed from: a */
        E mo11763a(S s, E e2, @NullableDecl E e3);

        /* renamed from: b */
        Strength mo11764b();

        /* renamed from: c */
        void mo11765c(S s, E e2, V v);

        /* renamed from: d */
        S mo11766d(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i2, int i3);

        /* renamed from: e */
        E mo11767e(S s, K k2, int i2, @NullableDecl E e2);
    }

    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        public KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m11760c().f21271b;
        }
    }

    public final class KeySet extends SafeToArraySet<K> {
        public KeySet() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        public SafeToArraySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.m11750a(this).toArray();
        }

        public SafeToArraySet(C17011 c17011) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m11750a(this).toArray(tArr);
        }
    }

    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* renamed from: i */
        public static final /* synthetic */ int f21245i = 0;

        /* renamed from: b */
        @Weak
        public final MapMakerInternalMap<K, V, E, S> f21246b;

        /* renamed from: c */
        public volatile int f21247c;

        /* renamed from: d */
        public int f21248d;

        /* renamed from: e */
        public int f21249e;

        /* renamed from: f */
        @NullableDecl
        public volatile AtomicReferenceArray<E> f21250f;

        /* renamed from: g */
        public final int f21251g;

        /* renamed from: h */
        public final AtomicInteger f21252h = new AtomicInteger();

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i2, int i3) {
            this.f21246b = mapMakerInternalMap;
            this.f21251g = i3;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i2);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f21249e = length;
            if (length == i3) {
                this.f21249e = length + 1;
            }
            this.f21250f = atomicReferenceArray;
        }

        /* renamed from: a */
        public <T> void m11768a(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy
        /* renamed from: b */
        public void m11769b(ReferenceQueue<K> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                InternalEntry internalEntry = (InternalEntry) poll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.f21246b;
                Objects.requireNonNull(mapMakerInternalMap);
                int mo11757c = internalEntry.mo11757c();
                Segment<K, V, E, S> m11752c = mapMakerInternalMap.m11752c(mo11757c);
                m11752c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = m11752c.f21250f;
                    int length = mo11757c & (atomicReferenceArray.length() - 1);
                    InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                    InternalEntry internalEntry3 = internalEntry2;
                    while (true) {
                        if (internalEntry3 == null) {
                            break;
                        }
                        if (internalEntry3 == internalEntry) {
                            m11752c.f21248d++;
                            InternalEntry m11777j = m11752c.m11777j(internalEntry2, internalEntry3);
                            int i3 = m11752c.f21247c - 1;
                            atomicReferenceArray.set(length, m11777j);
                            m11752c.f21247c = i3;
                            break;
                        }
                        internalEntry3 = internalEntry3.mo11756a();
                    }
                    m11752c.unlock();
                    i2++;
                } catch (Throwable th) {
                    m11752c.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy
        /* renamed from: c */
        public void m11770c(ReferenceQueue<V> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                WeakValueReference<K, V, E> weakValueReference = (WeakValueReference) poll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.f21246b;
                Objects.requireNonNull(mapMakerInternalMap);
                E mo11755b = weakValueReference.mo11755b();
                int mo11757c = mo11755b.mo11757c();
                Segment<K, V, E, S> m11752c = mapMakerInternalMap.m11752c(mo11757c);
                Object key = mo11755b.getKey();
                m11752c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = m11752c.f21250f;
                    int length = (atomicReferenceArray.length() - 1) & mo11757c;
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                    InternalEntry internalEntry2 = internalEntry;
                    while (true) {
                        if (internalEntry2 == null) {
                            break;
                        }
                        Object key2 = internalEntry2.getKey();
                        if (internalEntry2.mo11757c() != mo11757c || key2 == null || !m11752c.f21246b.f21225f.m11153d(key, key2)) {
                            internalEntry2 = internalEntry2.mo11756a();
                        } else if (((WeakValueEntry) internalEntry2).mo11783b() == weakValueReference) {
                            m11752c.f21248d++;
                            InternalEntry m11777j = m11752c.m11777j(internalEntry, internalEntry2);
                            int i3 = m11752c.f21247c - 1;
                            atomicReferenceArray.set(length, m11777j);
                            m11752c.f21247c = i3;
                        }
                    }
                    m11752c.unlock();
                    i2++;
                } catch (Throwable th) {
                    m11752c.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy
        /* renamed from: d */
        public void m11771d() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f21250f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.f21247c;
            ArrayCompositeSubscription arrayCompositeSubscription = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f21249e = (arrayCompositeSubscription.length() * 3) / 4;
            int length2 = arrayCompositeSubscription.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                E e2 = atomicReferenceArray.get(i3);
                if (e2 != null) {
                    InternalEntry mo11756a = e2.mo11756a();
                    int mo11757c = e2.mo11757c() & length2;
                    if (mo11756a == null) {
                        arrayCompositeSubscription.set(mo11757c, e2);
                    } else {
                        InternalEntry internalEntry = e2;
                        while (mo11756a != null) {
                            int mo11757c2 = mo11756a.mo11757c() & length2;
                            if (mo11757c2 != mo11757c) {
                                internalEntry = mo11756a;
                                mo11757c = mo11757c2;
                            }
                            mo11756a = mo11756a.mo11756a();
                        }
                        arrayCompositeSubscription.set(mo11757c, internalEntry);
                        while (e2 != internalEntry) {
                            int mo11757c3 = e2.mo11757c() & length2;
                            InternalEntry mo11763a = this.f21246b.f21226g.mo11763a(mo11779l(), e2, (InternalEntry) arrayCompositeSubscription.get(mo11757c3));
                            if (mo11763a != null) {
                                arrayCompositeSubscription.set(mo11757c3, mo11763a);
                            } else {
                                i2--;
                            }
                            e2 = e2.mo11756a();
                        }
                    }
                }
            }
            this.f21250f = arrayCompositeSubscription;
            this.f21247c = i2;
        }

        /* renamed from: e */
        public E m11772e(Object obj, int i2) {
            if (this.f21247c == 0) {
                return null;
            }
            for (E e2 = this.f21250f.get((r0.length() - 1) & i2); e2 != null; e2 = (E) e2.mo11756a()) {
                if (e2.mo11757c() == i2) {
                    Object key = e2.getKey();
                    if (key == null) {
                        m11781n();
                    } else if (this.f21246b.f21225f.m11153d(obj, key)) {
                        return e2;
                    }
                }
            }
            return null;
        }

        /* renamed from: f */
        public void mo11773f() {
        }

        @GuardedBy
        /* renamed from: g */
        public void mo11774g() {
        }

        /* renamed from: h */
        public void m11775h() {
            if ((this.f21252h.incrementAndGet() & 63) == 0) {
                m11778k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i */
        public V m11776i(K k2, int i2, V v, boolean z) {
            lock();
            try {
                m11778k();
                int i3 = this.f21247c + 1;
                if (i3 > this.f21249e) {
                    m11771d();
                    i3 = this.f21247c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f21250f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.mo11756a()) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo11757c() == i2 && key != null && this.f21246b.f21225f.m11153d(k2, key)) {
                        V v2 = (V) internalEntry2.getValue();
                        if (v2 == null) {
                            this.f21248d++;
                            this.f21246b.f21226g.mo11765c(mo11779l(), internalEntry2, v);
                            this.f21247c = this.f21247c;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.f21248d++;
                        this.f21246b.f21226g.mo11765c(mo11779l(), internalEntry2, v);
                        return v2;
                    }
                }
                this.f21248d++;
                E mo11767e = this.f21246b.f21226g.mo11767e(mo11779l(), k2, i2, internalEntry);
                m11780m(mo11767e, v);
                atomicReferenceArray.set(length, mo11767e);
                this.f21247c = i3;
                return null;
            } finally {
                unlock();
            }
        }

        @GuardedBy
        /* renamed from: j */
        public E m11777j(E e2, E e3) {
            int i2 = this.f21247c;
            E e4 = (E) e3.mo11756a();
            while (e2 != e3) {
                Object mo11763a = this.f21246b.f21226g.mo11763a(mo11779l(), e2, e4);
                if (mo11763a != null) {
                    e4 = (E) mo11763a;
                } else {
                    i2--;
                }
                e2 = (E) e2.mo11756a();
            }
            this.f21247c = i2;
            return e4;
        }

        /* renamed from: k */
        public void m11778k() {
            if (tryLock()) {
                try {
                    mo11774g();
                    this.f21252h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: l */
        public abstract S mo11779l();

        /* renamed from: m */
        public void m11780m(E e2, V v) {
            this.f21246b.f21226g.mo11765c(mo11779l(), e2, v);
        }

        /* renamed from: n */
        public void m11781n() {
            if (tryLock()) {
                try {
                    mo11774g();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            /* renamed from: a */
            public Equivalence<Object> mo11782a() {
                return Equivalence.m11149c();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            /* renamed from: a */
            public Equivalence<Object> mo11782a() {
                return Equivalence.m11150f();
            }
        };

        Strength(C17011 c17011) {
        }

        /* renamed from: a */
        public abstract Equivalence<Object> mo11782a();
    }

    public static final class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                return new StrongKeyDummyValueEntry(strongKeyDummyValueEntry.f21230b, strongKeyDummyValueEntry.f21231c, (StrongKeyDummyValueEntry) internalEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public /* bridge */ /* synthetic */ void mo11765c(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new StrongKeyDummyValueEntry(obj, i2, (StrongKeyDummyValueEntry) internalEntry);
            }
        }

        public StrongKeyDummyValueEntry(K k2, int i2, @NullableDecl StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            super(k2, i2, strongKeyDummyValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {

        /* renamed from: e */
        @NullableDecl
        public volatile V f21256e;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final Helper<?, ?> f21257a = new Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = new StrongKeyStrongValueEntry(strongKeyStrongValueEntry.f21230b, strongKeyStrongValueEntry.f21231c, (StrongKeyStrongValueEntry) internalEntry2);
                strongKeyStrongValueEntry2.f21256e = strongKeyStrongValueEntry.f21256e;
                return strongKeyStrongValueEntry2;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public void mo11765c(Segment segment, InternalEntry internalEntry, Object obj) {
                ((StrongKeyStrongValueEntry) internalEntry).f21256e = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new StrongKeyStrongValueEntry(obj, i2, (StrongKeyStrongValueEntry) internalEntry);
            }
        }

        public StrongKeyStrongValueEntry(K k2, int i2, @NullableDecl StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            super(k2, i2, strongKeyStrongValueEntry);
            this.f21256e = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @NullableDecl
        public V getValue() {
            return this.f21256e;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {

        /* renamed from: e */
        public volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> f21258e;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final Helper<?, ?> f21259a = new Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = (StrongKeyWeakValueEntry) internalEntry2;
                int i2 = Segment.f21245i;
                if (strongKeyWeakValueEntry.getValue() == null) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = strongKeyWeakValueSegment.f21260j;
                StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry3 = new StrongKeyWeakValueEntry<>(strongKeyWeakValueEntry.f21230b, strongKeyWeakValueEntry.f21231c, strongKeyWeakValueEntry2);
                strongKeyWeakValueEntry3.f21258e = strongKeyWeakValueEntry.f21258e.mo11754a(referenceQueue, strongKeyWeakValueEntry3);
                return strongKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public void mo11765c(Segment segment, InternalEntry internalEntry, Object obj) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                ReferenceQueue<V> referenceQueue = ((StrongKeyWeakValueSegment) segment).f21260j;
                WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> weakValueReference = strongKeyWeakValueEntry.f21258e;
                strongKeyWeakValueEntry.f21258e = new WeakValueReferenceImpl(referenceQueue, obj, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new StrongKeyWeakValueEntry(obj, i2, (StrongKeyWeakValueEntry) internalEntry);
            }
        }

        public StrongKeyWeakValueEntry(K k2, int i2, @NullableDecl StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            super(k2, i2, strongKeyWeakValueEntry);
            WeakValueReference<Object, Object, DummyInternalEntry> weakValueReference = MapMakerInternalMap.f21220k;
            this.f21258e = (WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>>) MapMakerInternalMap.f21220k;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        /* renamed from: b */
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> mo11783b() {
            return this.f21258e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f21258e.get();
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

        /* renamed from: j */
        public final ReferenceQueue<V> f21260j;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
            this.f21260j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: f */
        public void mo11773f() {
            m11768a(this.f21260j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: g */
        public void mo11774g() {
            m11770c(this.f21260j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        public ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m11760c().f21272c;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.m11750a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m11750a(this).toArray(tArr);
        }
    }

    public static final class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry2 = (WeakKeyDummyValueEntry) internalEntry2;
                if (weakKeyDummyValueEntry.get() == null) {
                    return null;
                }
                return new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.f21262j, weakKeyDummyValueEntry.get(), weakKeyDummyValueEntry.f21233b, weakKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public /* bridge */ /* synthetic */ void mo11765c(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new WeakKeyDummyValueEntry(((WeakKeyDummyValueSegment) segment).f21262j, obj, i2, (WeakKeyDummyValueEntry) internalEntry);
            }
        }

        public WeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            super(referenceQueue, k2, i2, weakKeyDummyValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

        /* renamed from: j */
        public final ReferenceQueue<K> f21262j;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
            this.f21262j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: f */
        public void mo11773f() {
            m11768a(this.f21262j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: g */
        public void mo11774g() {
            m11769b(this.f21262j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* renamed from: d */
        @NullableDecl
        public volatile V f21263d;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final Helper<?, ?> f21264a = new Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = (WeakKeyStrongValueEntry) internalEntry2;
                if (weakKeyStrongValueEntry.get() == null) {
                    return null;
                }
                WeakKeyStrongValueEntry weakKeyStrongValueEntry3 = new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.f21265j, weakKeyStrongValueEntry.get(), weakKeyStrongValueEntry.f21233b, weakKeyStrongValueEntry2);
                weakKeyStrongValueEntry3.f21263d = weakKeyStrongValueEntry.f21263d;
                return weakKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public void mo11765c(Segment segment, InternalEntry internalEntry, Object obj) {
                ((WeakKeyStrongValueEntry) internalEntry).f21263d = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new WeakKeyStrongValueEntry(((WeakKeyStrongValueSegment) segment).f21265j, obj, i2, (WeakKeyStrongValueEntry) internalEntry);
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            super(referenceQueue, k2, i2, weakKeyStrongValueEntry);
            this.f21263d = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @NullableDecl
        public V getValue() {
            return this.f21263d;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

        /* renamed from: j */
        public final ReferenceQueue<K> f21265j;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
            this.f21265j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: f */
        public void mo11773f() {
            m11768a(this.f21265j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: g */
        public void mo11774g() {
            m11769b(this.f21265j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* renamed from: d */
        public volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> f21266d;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final Helper<?, ?> f21267a = new Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: a */
            public InternalEntry mo11763a(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = (WeakKeyWeakValueEntry) internalEntry2;
                if (weakKeyWeakValueEntry.get() == null) {
                    return null;
                }
                int i2 = Segment.f21245i;
                if (weakKeyWeakValueEntry.getValue() == null) {
                    return null;
                }
                ReferenceQueue<K> referenceQueue = weakKeyWeakValueSegment.f21268j;
                ReferenceQueue<V> referenceQueue2 = weakKeyWeakValueSegment.f21269k;
                WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry3 = new WeakKeyWeakValueEntry<>(referenceQueue, weakKeyWeakValueEntry.get(), weakKeyWeakValueEntry.f21233b, weakKeyWeakValueEntry2);
                weakKeyWeakValueEntry3.f21266d = weakKeyWeakValueEntry.f21266d.mo11754a(referenceQueue2, weakKeyWeakValueEntry3);
                return weakKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: b */
            public Strength mo11764b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: c */
            public void mo11765c(Segment segment, InternalEntry internalEntry, Object obj) {
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                ReferenceQueue<V> referenceQueue = ((WeakKeyWeakValueSegment) segment).f21269k;
                WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> weakValueReference = weakKeyWeakValueEntry.f21266d;
                weakKeyWeakValueEntry.f21266d = new WeakValueReferenceImpl(referenceQueue, obj, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: d */
            public Segment mo11766d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i2, i3);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* renamed from: e */
            public InternalEntry mo11767e(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
                return new WeakKeyWeakValueEntry(((WeakKeyWeakValueSegment) segment).f21268j, obj, i2, (WeakKeyWeakValueEntry) internalEntry);
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            super(referenceQueue, k2, i2, weakKeyWeakValueEntry);
            WeakValueReference<Object, Object, DummyInternalEntry> weakValueReference = MapMakerInternalMap.f21220k;
            this.f21266d = (WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>>) MapMakerInternalMap.f21220k;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        /* renamed from: b */
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> mo11783b() {
            return this.f21266d;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f21266d.get();
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

        /* renamed from: j */
        public final ReferenceQueue<K> f21268j;

        /* renamed from: k */
        public final ReferenceQueue<V> f21269k;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
            this.f21268j = new ReferenceQueue<>();
            this.f21269k = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: f */
        public void mo11773f() {
            m11768a(this.f21268j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: g */
        public void mo11774g() {
            m11769b(this.f21268j);
            m11770c(this.f21269k);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: l */
        public Segment mo11779l() {
            return this;
        }
    }

    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        /* renamed from: b */
        WeakValueReference<K, V, E> mo11783b();
    }

    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        /* renamed from: a */
        WeakValueReference<K, V, E> mo11754a(ReferenceQueue<V> referenceQueue, E e2);

        /* renamed from: b */
        E mo11755b();

        void clear();

        @NullableDecl
        V get();
    }

    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {

        /* renamed from: b */
        @Weak
        public final E f21270b;

        public WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e2) {
            super(v, referenceQueue);
            this.f21270b = e2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        /* renamed from: a */
        public WeakValueReference<K, V, E> mo11754a(ReferenceQueue<V> referenceQueue, E e2) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        /* renamed from: b */
        public E mo11755b() {
            return this.f21270b;
        }
    }

    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        public final K f21271b;

        /* renamed from: c */
        public V f21272c;

        public WriteThroughEntry(K k2, V v) {
            this.f21271b = k2;
            this.f21272c = v;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f21271b.equals(entry.getKey()) && this.f21272c.equals(entry.getValue());
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.f21271b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.f21272c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.f21271b.hashCode() ^ this.f21272c.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) MapMakerInternalMap.this.put(this.f21271b, v);
            this.f21272c = v;
            return v2;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.f21225f = (Equivalence) MoreObjects.m11165a(null, mapMaker.m11746a().mo11782a());
        this.f21226g = internalEntryHelper;
        int min = Math.min(16, 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f21224e) {
            i5++;
            i4 <<= 1;
        }
        this.f21222c = 32 - i5;
        this.f21221b = i4 - 1;
        this.f21223d = new Segment[i4];
        int i6 = min / i4;
        while (i3 < (i4 * i6 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f21223d;
            if (i2 >= segmentArr.length) {
                return;
            }
            segmentArr[i2] = this.f21226g.mo11766d(this, i3, -1);
            i2++;
        }
    }

    /* renamed from: a */
    public static ArrayList m11750a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.m11706a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: b */
    public int m11751b(Object obj) {
        int m11154e = this.f21225f.m11154e(obj);
        int i2 = m11154e + ((m11154e << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    /* renamed from: c */
    public Segment<K, V, E, S> m11752c(int i2) {
        return this.f21223d[(i2 >>> this.f21222c) & this.f21221b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Segment<K, V, E, S>[] segmentArr = this.f21223d;
        int length = segmentArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Segment<K, V, E, S> segment = segmentArr[i2];
            if (segment.f21247c != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segment.f21250f;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    segment.mo11773f();
                    segment.f21252h.set(0);
                    segment.f21248d++;
                    segment.f21247c = 0;
                } finally {
                    segment.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        E m11772e;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int m11751b = m11751b(obj);
        Segment<K, V, E, S> m11752c = m11752c(m11751b);
        Objects.requireNonNull(m11752c);
        try {
            if (m11752c.f21247c != 0 && (m11772e = m11752c.m11772e(obj, m11751b)) != null) {
                if (m11772e.getValue() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            m11752c.m11775h();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        Object value;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f21223d;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            for (Segment<K, V, E, S> segment : segmentArr) {
                int i3 = segment.f21247c;
                AtomicReferenceArray<E> atomicReferenceArray = segment.f21250f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (E e2 = atomicReferenceArray.get(i4); e2 != null; e2 = e2.mo11756a()) {
                        if (e2.getKey() == null) {
                            segment.m11781n();
                        } else {
                            value = e2.getValue();
                            if (value == null) {
                                segment.m11781n();
                            }
                            if (value == null && m11753d().m11153d(obj, value)) {
                                return true;
                            }
                        }
                        value = null;
                        if (value == null) {
                        }
                    }
                }
                j3 += segment.f21248d;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: d */
    public Equivalence<Object> m11753d() {
        return this.f21226g.mo11764b().mo11782a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21229j;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f21229j = entrySet;
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int m11751b = m11751b(obj);
        Segment<K, V, E, S> m11752c = m11752c(m11751b);
        Objects.requireNonNull(m11752c);
        try {
            E m11772e = m11752c.m11772e(obj, m11751b);
            if (m11772e != null && (v = (V) m11772e.getValue()) == null) {
                m11752c.m11781n();
            }
            return v;
        } finally {
            m11752c.m11775h();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f21223d;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f21247c != 0) {
                return false;
            }
            j2 += segmentArr[i2].f21248d;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].f21247c != 0) {
                return false;
            }
            j2 -= segmentArr[i3].f21248d;
        }
        return j2 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f21227h;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f21227h = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k2, V v) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        int m11751b = m11751b(k2);
        return m11752c(m11751b).m11776i(k2, m11751b, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k2, V v) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        int m11751b = m11751b(k2);
        return m11752c(m11751b).m11776i(k2, m11751b, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r11 = (V) r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r2.f21248d++;
        r0 = r2.m11777j(r6, r7);
        r1 = r2.f21247c - 1;
        r3.set(r4, r0);
        r2.f21247c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r7.getValue() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r1 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.m11751b(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r10.m11752c(r1)
            r2.lock()
            r2.m11778k()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r3 = r2.f21250f     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6     // Catch: java.lang.Throwable -> L6b
            r7 = r6
        L22:
            if (r7 == 0) goto L67
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L6b
            int r9 = r7.mo11757c()     // Catch: java.lang.Throwable -> L6b
            if (r9 != r1) goto L62
            if (r8 == 0) goto L62
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r2.f21246b     // Catch: java.lang.Throwable -> L6b
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.f21225f     // Catch: java.lang.Throwable -> L6b
            boolean r8 = r9.m11153d(r11, r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L62
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L41
            goto L4c
        L41:
            java.lang.Object r1 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L67
        L4c:
            int r0 = r2.f21248d     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + r5
            r2.f21248d = r0     // Catch: java.lang.Throwable -> L6b
            com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r2.m11777j(r6, r7)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.f21247c     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r5
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.f21247c = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r11
            goto L6a
        L62:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.mo11756a()     // Catch: java.lang.Throwable -> L6b
            goto L22
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r2.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V replace(K r11, V r12) {
        /*
            r10 = this;
            java.util.Objects.requireNonNull(r11)
            java.util.Objects.requireNonNull(r12)
            int r0 = r10.m11751b(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r10.m11752c(r0)
            r1.lock()
            r1.m11778k()     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r2 = r1.f21250f     // Catch: java.lang.Throwable -> L7e
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            int r3 = r3 - r4
            r3 = r3 & r0
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Throwable -> L7e
            com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r5     // Catch: java.lang.Throwable -> L7e
            r6 = r5
        L24:
            r7 = 0
            if (r6 == 0) goto L7a
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L7e
            int r9 = r6.mo11757c()     // Catch: java.lang.Throwable -> L7e
            if (r9 != r0) goto L75
            if (r8 == 0) goto L75
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r1.f21246b     // Catch: java.lang.Throwable -> L7e
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.f21225f     // Catch: java.lang.Throwable -> L7e
            boolean r8 = r9.m11153d(r11, r8)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L75
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            if (r11 != 0) goto L60
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            if (r11 != 0) goto L4b
            r11 = 1
            goto L4c
        L4b:
            r11 = 0
        L4c:
            if (r11 == 0) goto L7a
            int r11 = r1.f21248d     // Catch: java.lang.Throwable -> L7e
            int r11 = r11 + r4
            r1.f21248d = r11     // Catch: java.lang.Throwable -> L7e
            com.google.common.collect.MapMakerInternalMap$InternalEntry r11 = r1.m11777j(r5, r6)     // Catch: java.lang.Throwable -> L7e
            int r12 = r1.f21247c     // Catch: java.lang.Throwable -> L7e
            int r12 = r12 - r4
            r2.set(r3, r11)     // Catch: java.lang.Throwable -> L7e
            r1.f21247c = r12     // Catch: java.lang.Throwable -> L7e
            goto L7a
        L60:
            int r0 = r1.f21248d     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + r4
            r1.f21248d = r0     // Catch: java.lang.Throwable -> L7e
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.f21246b     // Catch: java.lang.Throwable -> L7e
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.f21226g     // Catch: java.lang.Throwable -> L7e
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r1.mo11779l()     // Catch: java.lang.Throwable -> L7e
            r0.mo11765c(r2, r6, r12)     // Catch: java.lang.Throwable -> L7e
            r1.unlock()
            r7 = r11
            goto L7d
        L75:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r6.mo11756a()     // Catch: java.lang.Throwable -> L7e
            goto L24
        L7a:
            r1.unlock()
        L7d:
            return r7
        L7e:
            r11 = move-exception
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (int i2 = 0; i2 < this.f21223d.length; i2++) {
            j2 += r0[i2].f21247c;
        }
        return Ints.m12084f(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f21228i;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f21228i = values;
        return values;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r2.f21246b.m11753d().m11153d(r12, r7.getValue()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r2.f21248d++;
        r11 = r2.m11777j(r6, r7);
        r12 = r2.f21247c - 1;
        r3.set(r4, r11);
        r2.f21247c = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r7.getValue() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r11 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r11, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7a
            if (r12 != 0) goto L7
            goto L7a
        L7:
            int r1 = r10.m11751b(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r10.m11752c(r1)
            r2.lock()
            r2.m11778k()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r3 = r2.f21250f     // Catch: java.lang.Throwable -> L75
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L75
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6     // Catch: java.lang.Throwable -> L75
            r7 = r6
        L25:
            if (r7 == 0) goto L71
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L75
            int r9 = r7.mo11757c()     // Catch: java.lang.Throwable -> L75
            if (r9 != r1) goto L6c
            if (r8 == 0) goto L6c
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r2.f21246b     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.f21225f     // Catch: java.lang.Throwable -> L75
            boolean r8 = r9.m11153d(r11, r8)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6c
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r1 = r2.f21246b     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence r1 = r1.m11753d()     // Catch: java.lang.Throwable -> L75
            boolean r11 = r1.m11153d(r12, r11)     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L4f
            r0 = 1
            goto L5a
        L4f:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L57
            r11 = 1
            goto L58
        L57:
            r11 = 0
        L58:
            if (r11 == 0) goto L71
        L5a:
            int r11 = r2.f21248d     // Catch: java.lang.Throwable -> L75
            int r11 = r11 + r5
            r2.f21248d = r11     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap$InternalEntry r11 = r2.m11777j(r6, r7)     // Catch: java.lang.Throwable -> L75
            int r12 = r2.f21247c     // Catch: java.lang.Throwable -> L75
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L75
            r2.f21247c = r12     // Catch: java.lang.Throwable -> L75
            goto L71
        L6c:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.mo11756a()     // Catch: java.lang.Throwable -> L75
            goto L25
        L71:
            r2.unlock()
            return r0
        L75:
            r11 = move-exception
            r2.unlock()
            throw r11
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k2, @NullableDecl V v, V v2) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v2);
        if (v == null) {
            return false;
        }
        int m11751b = m11751b(k2);
        Segment<K, V, E, S> m11752c = m11752c(m11751b);
        m11752c.lock();
        try {
            m11752c.m11778k();
            AtomicReferenceArray<E> atomicReferenceArray = m11752c.f21250f;
            int length = (atomicReferenceArray.length() - 1) & m11751b;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            InternalEntry internalEntry2 = internalEntry;
            while (true) {
                if (internalEntry2 == null) {
                    break;
                }
                Object key = internalEntry2.getKey();
                if (internalEntry2.mo11757c() == m11751b && key != null && m11752c.f21246b.f21225f.m11153d(k2, key)) {
                    Object value = internalEntry2.getValue();
                    if (value == null) {
                        if (internalEntry2.getValue() == null) {
                            m11752c.f21248d++;
                            InternalEntry m11777j = m11752c.m11777j(internalEntry, internalEntry2);
                            int i2 = m11752c.f21247c - 1;
                            atomicReferenceArray.set(length, m11777j);
                            m11752c.f21247c = i2;
                        }
                    } else if (m11752c.f21246b.m11753d().m11153d(v, value)) {
                        m11752c.f21248d++;
                        m11752c.f21246b.f21226g.mo11765c(m11752c.mo11779l(), internalEntry2, v2);
                        m11752c.unlock();
                        return true;
                    }
                } else {
                    internalEntry2 = internalEntry2.mo11756a();
                }
            }
            return false;
        } finally {
            m11752c.unlock();
        }
    }
}
