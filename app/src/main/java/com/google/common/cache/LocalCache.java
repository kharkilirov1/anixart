package com.google.common.cache;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: u */
    public static final Logger f20634u = Logger.getLogger(LocalCache.class.getName());

    /* renamed from: v */
    public static final ValueReference<Object, Object> f20635v = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: a */
        public boolean mo11251a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: b */
        public ReferenceEntry<Object, Object> mo11252b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: c */
        public void mo11253c(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: e */
        public Object mo11255e() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<Object, Object> mo11256f(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }
    };

    /* renamed from: w */
    public static final Queue<?> f20636w = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.m11671C().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    };

    /* renamed from: b */
    public final int f20637b;

    /* renamed from: c */
    public final int f20638c;

    /* renamed from: d */
    public final Segment<K, V>[] f20639d;

    /* renamed from: e */
    public final int f20640e;

    /* renamed from: f */
    public final Equivalence<Object> f20641f;

    /* renamed from: g */
    public final Equivalence<Object> f20642g;

    /* renamed from: h */
    public final Strength f20643h;

    /* renamed from: i */
    public final Strength f20644i;

    /* renamed from: j */
    public final long f20645j;

    /* renamed from: k */
    public final Weigher<K, V> f20646k;

    /* renamed from: l */
    public final Queue<RemovalNotification<K, V>> f20647l;

    /* renamed from: m */
    public final RemovalListener<K, V> f20648m;

    /* renamed from: n */
    public final Ticker f20649n;

    /* renamed from: o */
    public final EntryFactory f20650o;

    /* renamed from: p */
    public final AbstractCache.StatsCounter f20651p;

    /* renamed from: q */
    @NullableDecl
    public final CacheLoader<? super K, V> f20652q;

    /* renamed from: r */
    @RetainedWith
    @NullableDecl
    public Set<K> f20653r;

    /* renamed from: s */
    @RetainedWith
    @NullableDecl
    public Collection<V> f20654s;

    /* renamed from: t */
    @RetainedWith
    @NullableDecl
    public Set<Map.Entry<K, V>> f20655t;

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.m11241a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m11241a(this).toArray(eArr);
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: a */
        public ReferenceEntry<K, V> mo11257a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: b */
        public ValueReference<K, V> mo11258b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: c */
        public int mo11259c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: e */
        public void mo11261e(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: b */
        public final ReferenceEntry<K, V> f20657b = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.AccessQueue.1

            /* renamed from: b */
            @Weak
            public ReferenceEntry<K, V> f20658b = this;

            /* renamed from: c */
            @Weak
            public ReferenceEntry<K, V> f20659c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: d */
            public ReferenceEntry<K, V> mo11260d() {
                return this.f20659c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: h */
            public void mo11263h(long j2) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: j */
            public long mo11265j() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: l */
            public ReferenceEntry<K, V> mo11267l() {
                return this.f20658b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: m */
            public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
                this.f20658b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: p */
            public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
                this.f20659c = referenceEntry;
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> mo11267l = this.f20657b.mo11267l();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f20657b;
                if (mo11267l == referenceEntry) {
                    referenceEntry.mo11268m(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f20657b;
                    referenceEntry2.mo11271p(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> mo11267l2 = mo11267l.mo11267l();
                    Logger logger = LocalCache.f20634u;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    mo11267l.mo11268m(nullEntry);
                    mo11267l.mo11271p(nullEntry);
                    mo11267l = mo11267l2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).mo11267l() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f20657b.mo11267l() == this.f20657b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            ReferenceEntry<K, V> mo11267l = this.f20657b.mo11267l();
            if (mo11267l == this.f20657b) {
                mo11267l = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(mo11267l) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* renamed from: a */
                public Object mo11273a(Object obj) {
                    ReferenceEntry<K, V> mo11267l2 = ((ReferenceEntry) obj).mo11267l();
                    if (mo11267l2 == AccessQueue.this.f20657b) {
                        return null;
                    }
                    return mo11267l2;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> mo11260d = referenceEntry.mo11260d();
            ReferenceEntry<K, V> mo11267l = referenceEntry.mo11267l();
            Logger logger = LocalCache.f20634u;
            mo11260d.mo11268m(mo11267l);
            mo11267l.mo11271p(mo11260d);
            ReferenceEntry<K, V> mo11260d2 = this.f20657b.mo11260d();
            mo11260d2.mo11268m(referenceEntry);
            referenceEntry.mo11271p(mo11260d2);
            ReferenceEntry<K, V> referenceEntry2 = this.f20657b;
            referenceEntry.mo11268m(referenceEntry2);
            referenceEntry2.mo11271p(referenceEntry);
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            ReferenceEntry<K, V> mo11267l = this.f20657b.mo11267l();
            if (mo11267l == this.f20657b) {
                return null;
            }
            return mo11267l;
        }

        @Override // java.util.Queue
        public Object poll() {
            ReferenceEntry<K, V> mo11267l = this.f20657b.mo11267l();
            if (mo11267l == this.f20657b) {
                return null;
            }
            remove(mo11267l);
            return mo11267l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> mo11260d = referenceEntry.mo11260d();
            ReferenceEntry<K, V> mo11267l = referenceEntry.mo11267l();
            Logger logger = LocalCache.f20634u;
            mo11260d.mo11268m(mo11267l);
            mo11267l.mo11271p(mo11260d);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.mo11268m(nullEntry);
            referenceEntry.mo11271p(nullEntry);
            return mo11267l != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i2 = 0;
            for (ReferenceEntry<K, V> mo11267l = this.f20657b.mo11267l(); mo11267l != this.f20657b; mo11267l = mo11267l.mo11267l()) {
                i2++;
            }
            return i2;
        }
    }

    public enum EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k2, i2, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongAccessEntry strongAccessEntry = new StrongAccessEntry(referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11274a(referenceEntry, strongAccessEntry);
                return strongAccessEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k2, i2, referenceEntry);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongWriteEntry strongWriteEntry = new StrongWriteEntry(referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11276c(referenceEntry, strongWriteEntry);
                return strongWriteEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k2, i2, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongAccessWriteEntry strongAccessWriteEntry = new StrongAccessWriteEntry(referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11274a(referenceEntry, strongAccessWriteEntry);
                m11276c(referenceEntry, strongAccessWriteEntry);
                return strongAccessWriteEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k2, i2, referenceEntry);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.f20695i, k2, i2, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo11277d = mo11277d(segment, referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11274a(referenceEntry, mo11277d);
                return mo11277d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.f20695i, k2, i2, referenceEntry);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo11277d = mo11277d(segment, referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11276c(referenceEntry, mo11277d);
                return mo11277d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.f20695i, k2, i2, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: b */
            public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo11277d = mo11277d(segment, referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
                m11274a(referenceEntry, mo11277d);
                m11276c(referenceEntry, mo11277d);
                return mo11277d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            public <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.f20695i, k2, i2, referenceEntry);
            }
        };


        /* renamed from: j */
        public static final EntryFactory[] f20669j = {STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};

        EntryFactory(C15851 c15851) {
        }

        /* renamed from: a */
        public <K, V> void m11274a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.mo11263h(referenceEntry.mo11265j());
            ReferenceEntry<K, V> mo11260d = referenceEntry.mo11260d();
            Logger logger = LocalCache.f20634u;
            mo11260d.mo11268m(referenceEntry2);
            referenceEntry2.mo11271p(mo11260d);
            ReferenceEntry<K, V> mo11267l = referenceEntry.mo11267l();
            referenceEntry2.mo11268m(mo11267l);
            mo11267l.mo11271p(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.mo11268m(nullEntry);
            referenceEntry.mo11271p(nullEntry);
        }

        /* renamed from: b */
        public <K, V> ReferenceEntry<K, V> mo11275b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return mo11277d(segment, referenceEntry.getKey(), referenceEntry.mo11259c(), referenceEntry2);
        }

        /* renamed from: c */
        public <K, V> void m11276c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.mo11266k(referenceEntry.mo11262f());
            ReferenceEntry<K, V> mo11272q = referenceEntry.mo11272q();
            Logger logger = LocalCache.f20634u;
            mo11272q.mo11269n(referenceEntry2);
            referenceEntry2.mo11270o(mo11272q);
            ReferenceEntry<K, V> mo11264i = referenceEntry.mo11264i();
            referenceEntry2.mo11269n(mo11264i);
            mo11264i.mo11270o(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.mo11269n(nullEntry);
            referenceEntry.mo11270o(nullEntry);
        }

        /* renamed from: d */
        public abstract <K, V> ReferenceEntry<K, V> mo11277d(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry);
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m11280c();
        }
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f20642g.m11153d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public int f20672b;

        /* renamed from: c */
        public int f20673c = -1;

        /* renamed from: d */
        @NullableDecl
        public Segment<K, V> f20674d;

        /* renamed from: e */
        @NullableDecl
        public AtomicReferenceArray<ReferenceEntry<K, V>> f20675e;

        /* renamed from: f */
        @NullableDecl
        public ReferenceEntry<K, V> f20676f;

        /* renamed from: g */
        @NullableDecl
        public LocalCache<K, V>.WriteThroughEntry f20677g;

        /* renamed from: h */
        @NullableDecl
        public LocalCache<K, V>.WriteThroughEntry f20678h;

        public HashIterator() {
            this.f20672b = LocalCache.this.f20639d.length - 1;
            m11278a();
        }

        /* renamed from: a */
        public final void m11278a() {
            this.f20677g = null;
            if (m11281d() || m11282e()) {
                return;
            }
            while (true) {
                int i2 = this.f20672b;
                if (i2 < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.f20639d;
                this.f20672b = i2 - 1;
                Segment<K, V> segment = segmentArr[i2];
                this.f20674d = segment;
                if (segment.f20689c != 0) {
                    this.f20675e = this.f20674d.f20693g;
                    this.f20673c = r0.length() - 1;
                    if (m11282e()) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
        
            r6.f20677g = new com.google.common.cache.LocalCache.WriteThroughEntry(r6.f20679i, r2, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
        
            r7 = true;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m11279b(com.google.common.cache.ReferenceEntry<K, V> r7) {
            /*
                r6 = this;
                com.google.common.cache.LocalCache r0 = com.google.common.cache.LocalCache.this     // Catch: java.lang.Throwable -> L40
                com.google.common.base.Ticker r0 = r0.f20649n     // Catch: java.lang.Throwable -> L40
                long r0 = r0.mo11226a()     // Catch: java.lang.Throwable -> L40
                java.lang.Object r2 = r7.getKey()     // Catch: java.lang.Throwable -> L40
                com.google.common.cache.LocalCache r3 = com.google.common.cache.LocalCache.this     // Catch: java.lang.Throwable -> L40
                java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L40
                java.lang.Object r4 = r7.getKey()     // Catch: java.lang.Throwable -> L40
                r5 = 0
                if (r4 != 0) goto L19
                goto L2c
            L19:
                com.google.common.cache.LocalCache$ValueReference r4 = r7.mo11258b()     // Catch: java.lang.Throwable -> L40
                java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L40
                if (r4 != 0) goto L24
                goto L2c
            L24:
                boolean r7 = r3.m11245f(r7, r0)     // Catch: java.lang.Throwable -> L40
                if (r7 == 0) goto L2b
                goto L2c
            L2b:
                r5 = r4
            L2c:
                if (r5 == 0) goto L3e
                com.google.common.cache.LocalCache$WriteThroughEntry r7 = new com.google.common.cache.LocalCache$WriteThroughEntry     // Catch: java.lang.Throwable -> L40
                com.google.common.cache.LocalCache r0 = com.google.common.cache.LocalCache.this     // Catch: java.lang.Throwable -> L40
                r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> L40
                r6.f20677g = r7     // Catch: java.lang.Throwable -> L40
                r7 = 1
            L38:
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r6.f20674d
                r0.m11299m()
                return r7
            L3e:
                r7 = 0
                goto L38
            L40:
                r7 = move-exception
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r6.f20674d
                r0.m11299m()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.HashIterator.m11279b(com.google.common.cache.ReferenceEntry):boolean");
        }

        /* renamed from: c */
        public LocalCache<K, V>.WriteThroughEntry m11280c() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.f20677g;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f20678h = writeThroughEntry;
            m11278a();
            return this.f20678h;
        }

        /* renamed from: d */
        public boolean m11281d() {
            ReferenceEntry<K, V> referenceEntry = this.f20676f;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f20676f = referenceEntry.mo11257a();
                ReferenceEntry<K, V> referenceEntry2 = this.f20676f;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (m11279b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.f20676f;
            }
        }

        /* renamed from: e */
        public boolean m11282e() {
            while (true) {
                int i2 = this.f20673c;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20675e;
                this.f20673c = i2 - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i2);
                this.f20676f = referenceEntry;
                if (referenceEntry != null && (m11279b(referenceEntry) || m11281d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20677g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11191o(this.f20678h != null);
            LocalCache.this.remove(this.f20678h.f20753b);
            this.f20678h = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        public KeyIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m11280c().f20753b;
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V> {
        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
            throw null;
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: b */
        public volatile ValueReference<K, V> f20681b;

        /* renamed from: c */
        public final SettableFuture<V> f20682c;

        /* renamed from: d */
        public final Stopwatch f20683d;

        public LoadingValueReference() {
            ValueReference<K, V> valueReference = (ValueReference<K, V>) LocalCache.f20635v;
            this.f20682c = new SettableFuture<>();
            this.f20683d = new Stopwatch();
            this.f20681b = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: a */
        public boolean mo11251a() {
            return this.f20681b.mo11251a();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: b */
        public ReferenceEntry<K, V> mo11252b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: c */
        public void mo11253c(@NullableDecl V v) {
            if (v != null) {
                this.f20682c.mo12149n(v);
            } else {
                this.f20681b = (ValueReference<K, V>) LocalCache.f20635v;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return this.f20681b.mo11254d();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: e */
        public V mo11255e() throws ExecutionException {
            return (V) Uninterruptibles.m12209a(this.f20682c);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, @NullableDecl V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        /* renamed from: g */
        public long m11283g() {
            return this.f20683d.m11213a(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.f20681b.get();
        }

        /* renamed from: h */
        public ListenableFuture<V> m11284h(K k2, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f20683d.m11216d();
                V v = this.f20681b.get();
                if (v == null) {
                    V mo11237a = cacheLoader.mo11237a(k2);
                    return m11285i(mo11237a) ? this.f20682c : Futures.m12195c(mo11237a);
                }
                ListenableFuture<V> mo11238b = cacheLoader.mo11238b(k2, v);
                return mo11238b == null ? Futures.m12195c(null) : Futures.m12196d(mo11238b, new Function<V, V>() { // from class: com.google.common.cache.LocalCache.LoadingValueReference.1
                    @Override // com.google.common.base.Function
                    public V apply(V v2) {
                        LoadingValueReference.this.f20682c.mo12149n(v2);
                        return v2;
                    }
                }, MoreExecutors.m12201a());
            } catch (Throwable th) {
                ListenableFuture<V> m12194b = this.f20682c.mo12150o(th) ? this.f20682c : Futures.m12194b(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return m12194b;
            }
        }

        /* renamed from: i */
        public boolean m11285i(@NullableDecl V v) {
            return this.f20682c.mo12149n(v);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, cacheLoader), null);
            Objects.requireNonNull(cacheLoader);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
            try {
                return get(k2);
            } catch (ExecutionException e2) {
                throw new UncheckedExecutionException(e2.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k2) throws ExecutionException {
            V m11298l;
            ReferenceEntry<K, V> m11295i;
            LocalCache<K, V> localCache = this.f20685b;
            CacheLoader<? super K, V> cacheLoader = localCache.f20652q;
            Objects.requireNonNull(k2);
            int m11244d = localCache.m11244d(k2);
            Segment<K, V> m11247h = localCache.m11247h(m11244d);
            Objects.requireNonNull(m11247h);
            Objects.requireNonNull(cacheLoader);
            try {
                try {
                    if (m11247h.f20689c != 0 && (m11295i = m11247h.m11295i(k2, m11244d)) != null) {
                        long mo11226a = m11247h.f20688b.f20649n.mo11226a();
                        m11298l = m11247h.m11297k(m11295i, mo11226a);
                        if (m11298l != null) {
                            m11247h.m11302p(m11295i, mo11226a);
                            m11247h.f20701o.mo11228b(1);
                            Objects.requireNonNull(m11247h.f20688b);
                        } else {
                            ValueReference<K, V> mo11258b = m11295i.mo11258b();
                            if (mo11258b.isLoading()) {
                                m11298l = m11247h.m11286A(m11295i, k2, mo11258b);
                            }
                        }
                        return m11298l;
                    }
                    m11298l = m11247h.m11298l(k2, m11244d, cacheLoader);
                    return m11298l;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e2;
                }
            } finally {
                m11247h.m11299m();
            }
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {

        /* renamed from: b */
        public final LocalCache<K, V> f20685b;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$1 */
        class C15981 extends CacheLoader<Object, Object> {
            @Override // com.google.common.cache.CacheLoader
            /* renamed from: a */
            public Object mo11237a(Object obj) throws Exception {
                throw null;
            }
        }

        public LocalManualCache(LocalCache localCache, C15851 c15851) {
            this.f20685b = localCache;
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo11329H() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* renamed from: H */
        public Cache<K, V> mo7455G() {
            return null;
        }
    }

    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: a */
        public ReferenceEntry<Object, Object> mo11257a() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: b */
        public ValueReference<Object, Object> mo11258b() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: c */
        public int mo11259c() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<Object, Object> mo11260d() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: e */
        public void mo11261e(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<Object, Object> mo11264i() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<Object, Object> mo11267l() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<Object, Object> mo11272q() {
            return this;
        }
    }

    public static class Segment<K, V> extends ReentrantLock {

        /* renamed from: b */
        @Weak
        public final LocalCache<K, V> f20688b;

        /* renamed from: c */
        public volatile int f20689c;

        /* renamed from: d */
        @GuardedBy
        public long f20690d;

        /* renamed from: e */
        public int f20691e;

        /* renamed from: f */
        public int f20692f;

        /* renamed from: g */
        @NullableDecl
        public volatile AtomicReferenceArray<ReferenceEntry<K, V>> f20693g;

        /* renamed from: h */
        public final long f20694h;

        /* renamed from: i */
        @NullableDecl
        public final ReferenceQueue<K> f20695i;

        /* renamed from: j */
        @NullableDecl
        public final ReferenceQueue<V> f20696j;

        /* renamed from: k */
        public final Queue<ReferenceEntry<K, V>> f20697k;

        /* renamed from: l */
        public final AtomicInteger f20698l = new AtomicInteger();

        /* renamed from: m */
        @GuardedBy
        public final Queue<ReferenceEntry<K, V>> f20699m;

        /* renamed from: n */
        @GuardedBy
        public final Queue<ReferenceEntry<K, V>> f20700n;

        /* renamed from: o */
        public final AbstractCache.StatsCounter f20701o;

        /* renamed from: com.google.common.cache.LocalCache$Segment$1 */
        class RunnableC15991 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Object f20702b;

            /* renamed from: c */
            public final /* synthetic */ int f20703c;

            /* renamed from: d */
            public final /* synthetic */ LoadingValueReference f20704d;

            /* renamed from: e */
            public final /* synthetic */ ListenableFuture f20705e;

            /* renamed from: f */
            public final /* synthetic */ Segment f20706f;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f20706f.m11294h(this.f20702b, this.f20703c, this.f20704d, this.f20705e);
                } catch (Throwable th) {
                    LocalCache.f20634u.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f20704d.f20682c.mo12150o(th);
                }
            }
        }

        public Segment(LocalCache<K, V> localCache, int i2, long j2, AbstractCache.StatsCounter statsCounter) {
            this.f20688b = localCache;
            this.f20694h = j2;
            Objects.requireNonNull(statsCounter);
            this.f20701o = statsCounter;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i2);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f20692f = length;
            if (!(localCache.f20646k != CacheBuilder.OneWeigher.INSTANCE) && length == j2) {
                this.f20692f = length + 1;
            }
            this.f20693g = atomicReferenceArray;
            this.f20695i = localCache.m11249j() ? new ReferenceQueue<>() : null;
            this.f20696j = localCache.m11250k() ? new ReferenceQueue<>() : null;
            this.f20697k = localCache.m11248i() ? new ConcurrentLinkedQueue() : (Queue<ReferenceEntry<K, V>>) LocalCache.f20636w;
            AccessQueue accessQueue = (Queue<ReferenceEntry<K, V>>) LocalCache.f20636w;
            this.f20699m = accessQueue;
            this.f20700n = localCache.m11248i() ? new AccessQueue() : accessQueue;
        }

        /* renamed from: A */
        public V m11286A(ReferenceEntry<K, V> referenceEntry, K k2, ValueReference<K, V> valueReference) throws ExecutionException {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            Preconditions.m11194r(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", k2);
            try {
                V mo11255e = valueReference.mo11255e();
                if (mo11255e != null) {
                    m11302p(referenceEntry, this.f20688b.f20649n.mo11226a());
                    return mo11255e;
                }
                String valueOf = String.valueOf(k2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(valueOf);
                sb.append(".");
                throw new CacheLoader.InvalidCacheLoadException(sb.toString());
            } finally {
                this.f20701o.mo11229c(1);
            }
        }

        @GuardedBy
        /* renamed from: a */
        public ReferenceEntry<K, V> m11287a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference<K, V> mo11258b = referenceEntry.mo11258b();
            V v = mo11258b.get();
            if (v == null && mo11258b.mo11251a()) {
                return null;
            }
            ReferenceEntry<K, V> mo11275b = this.f20688b.f20650o.mo11275b(this, referenceEntry, referenceEntry2);
            mo11275b.mo11261e(mo11258b.mo11256f(this.f20696j, v, mo11275b));
            return mo11275b;
        }

        @GuardedBy
        /* renamed from: b */
        public void m11288b() {
            while (true) {
                ReferenceEntry<K, V> poll = this.f20697k.poll();
                if (poll == null) {
                    return;
                }
                if (this.f20700n.contains(poll)) {
                    this.f20700n.add(poll);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
        
            if (r11.isHeldByCurrentThread() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
        
            if (r11.isHeldByCurrentThread() == false) goto L45;
         */
        @com.google.errorprone.annotations.concurrent.GuardedBy
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m11289c() {
            /*
                Method dump skipped, instructions count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m11289c():void");
        }

        @GuardedBy
        /* renamed from: d */
        public void m11290d(@NullableDecl Object obj, @NullableDecl Object obj2, int i2, RemovalCause removalCause) {
            this.f20690d -= i2;
            if (removalCause.mo11320a()) {
                this.f20701o.mo11227a();
            }
            if (this.f20688b.f20647l != LocalCache.f20636w) {
                this.f20688b.f20647l.offer(new RemovalNotification<>(obj, obj2, removalCause));
            }
        }

        @GuardedBy
        /* renamed from: e */
        public void m11291e(ReferenceEntry<K, V> referenceEntry) {
            RemovalCause removalCause = RemovalCause.SIZE;
            if (this.f20688b.m11242b()) {
                m11288b();
                if (referenceEntry.mo11258b().mo11254d() > this.f20694h && !m11304r(referenceEntry, referenceEntry.mo11259c(), removalCause)) {
                    throw new AssertionError();
                }
                while (this.f20690d > this.f20694h) {
                    for (ReferenceEntry<K, V> referenceEntry2 : this.f20700n) {
                        if (referenceEntry2.mo11258b().mo11254d() > 0) {
                            if (!m11304r(referenceEntry2, referenceEntry2.mo11259c(), removalCause)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        @GuardedBy
        /* renamed from: f */
        public void m11292f() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.f20689c;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
            this.f20692f = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i3);
                if (referenceEntry != null) {
                    ReferenceEntry<K, V> mo11257a = referenceEntry.mo11257a();
                    int mo11259c = referenceEntry.mo11259c() & length2;
                    if (mo11257a == null) {
                        atomicReferenceArray2.set(mo11259c, referenceEntry);
                    } else {
                        ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                        while (mo11257a != null) {
                            int mo11259c2 = mo11257a.mo11259c() & length2;
                            if (mo11259c2 != mo11259c) {
                                referenceEntry2 = mo11257a;
                                mo11259c = mo11259c2;
                            }
                            mo11257a = mo11257a.mo11257a();
                        }
                        atomicReferenceArray2.set(mo11259c, referenceEntry2);
                        while (referenceEntry != referenceEntry2) {
                            int mo11259c3 = referenceEntry.mo11259c() & length2;
                            ReferenceEntry<K, V> m11287a = m11287a(referenceEntry, atomicReferenceArray2.get(mo11259c3));
                            if (m11287a != null) {
                                atomicReferenceArray2.set(mo11259c3, m11287a);
                            } else {
                                m11303q(referenceEntry);
                                i2--;
                            }
                            referenceEntry = referenceEntry.mo11257a();
                        }
                    }
                }
            }
            this.f20693g = atomicReferenceArray2;
            this.f20689c = i2;
        }

        @GuardedBy
        /* renamed from: g */
        public void m11293g(long j2) {
            ReferenceEntry<K, V> peek;
            ReferenceEntry<K, V> peek2;
            RemovalCause removalCause = RemovalCause.EXPIRED;
            m11288b();
            do {
                peek = this.f20699m.peek();
                if (peek == null || !this.f20688b.m11245f(peek, j2)) {
                    do {
                        peek2 = this.f20700n.peek();
                        if (peek2 == null || !this.f20688b.m11245f(peek2, j2)) {
                            return;
                        }
                    } while (m11304r(peek2, peek2.mo11259c(), removalCause));
                    throw new AssertionError();
                }
            } while (m11304r(peek, peek.mo11259c(), removalCause));
            throw new AssertionError();
        }

        /* renamed from: h */
        public V m11294h(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, ListenableFuture<V> listenableFuture) throws ExecutionException {
            V v;
            try {
                v = (V) Uninterruptibles.m12209a(listenableFuture);
                try {
                    if (v != null) {
                        this.f20701o.mo11231e(loadingValueReference.m11283g());
                        m11311y(k2, i2, loadingValueReference, v);
                        return v;
                    }
                    String valueOf = String.valueOf(k2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append("CacheLoader returned null for key ");
                    sb.append(valueOf);
                    sb.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                } catch (Throwable th) {
                    th = th;
                    if (v == null) {
                        this.f20701o.mo11230d(loadingValueReference.m11283g());
                        m11306t(k2, i2, loadingValueReference);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v = null;
            }
        }

        @NullableDecl
        /* renamed from: i */
        public ReferenceEntry<K, V> m11295i(Object obj, int i2) {
            for (ReferenceEntry<K, V> referenceEntry = this.f20693g.get((r0.length() - 1) & i2); referenceEntry != null; referenceEntry = referenceEntry.mo11257a()) {
                if (referenceEntry.mo11259c() == i2) {
                    K key = referenceEntry.getKey();
                    if (key == null) {
                        m11312z();
                    } else if (this.f20688b.f20641f.m11153d(obj, key)) {
                        return referenceEntry;
                    }
                }
            }
            return null;
        }

        @NullableDecl
        /* renamed from: j */
        public ReferenceEntry<K, V> m11296j(Object obj, int i2, long j2) {
            ReferenceEntry<K, V> m11295i = m11295i(obj, i2);
            if (m11295i == null) {
                return null;
            }
            Objects.requireNonNull(this.f20688b);
            return m11295i;
        }

        /* renamed from: k */
        public V m11297k(ReferenceEntry<K, V> referenceEntry, long j2) {
            if (referenceEntry.getKey() == null) {
                m11312z();
                return null;
            }
            V v = referenceEntry.mo11258b().get();
            if (v == null) {
                m11312z();
                return null;
            }
            Objects.requireNonNull(this.f20688b);
            return v;
        }

        /* renamed from: l */
        public V m11298l(K k2, int i2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            LoadingValueReference<K, V> loadingValueReference;
            ValueReference<K, V> valueReference;
            boolean z;
            V m11294h;
            lock();
            try {
                m11308v(this.f20688b.f20649n.mo11226a());
                int i3 = this.f20689c - 1;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntry2 == null) {
                        valueReference = null;
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.mo11259c() == i2 && key != null && this.f20688b.f20641f.m11153d(k2, key)) {
                        valueReference = referenceEntry2.mo11258b();
                        if (valueReference.isLoading()) {
                            z = false;
                        } else {
                            V v = valueReference.get();
                            if (v != null) {
                                Objects.requireNonNull(this.f20688b);
                                Objects.requireNonNull(this.f20688b);
                                this.f20700n.add(referenceEntry2);
                                this.f20701o.mo11228b(1);
                                return v;
                            }
                            m11290d(key, v, valueReference.mo11254d(), RemovalCause.COLLECTED);
                            this.f20699m.remove(referenceEntry2);
                            this.f20700n.remove(referenceEntry2);
                            this.f20689c = i3;
                        }
                    } else {
                        referenceEntry2 = referenceEntry2.mo11257a();
                    }
                }
                z = true;
                if (z) {
                    loadingValueReference = new LoadingValueReference<>();
                    if (referenceEntry2 == null) {
                        referenceEntry2 = this.f20688b.f20650o.mo11277d(this, k2, i2, referenceEntry);
                        referenceEntry2.mo11261e(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntry2);
                    } else {
                        referenceEntry2.mo11261e(loadingValueReference);
                    }
                }
                if (!z) {
                    return m11286A(referenceEntry2, k2, valueReference);
                }
                try {
                    synchronized (referenceEntry2) {
                        m11294h = m11294h(k2, i2, loadingValueReference, loadingValueReference.m11284h(k2, cacheLoader));
                    }
                    return m11294h;
                } finally {
                    this.f20701o.mo11229c(1);
                }
            } finally {
                unlock();
                m11309w();
            }
        }

        /* renamed from: m */
        public void m11299m() {
            if ((this.f20698l.incrementAndGet() & 63) == 0) {
                m11308v(this.f20688b.f20649n.mo11226a());
                m11309w();
            }
        }

        @NullableDecl
        /* renamed from: n */
        public V m11300n(K k2, int i2, V v, boolean z) {
            int i3;
            lock();
            try {
                long mo11226a = this.f20688b.f20649n.mo11226a();
                m11308v(mo11226a);
                if (this.f20689c + 1 > this.f20692f) {
                    m11292f();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
                int length = i2 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        this.f20691e++;
                        ReferenceEntry<K, V> mo11277d = this.f20688b.f20650o.mo11277d(this, k2, i2, referenceEntry);
                        m11310x(mo11277d, k2, v, mo11226a);
                        atomicReferenceArray.set(length, mo11277d);
                        this.f20689c++;
                        m11291e(mo11277d);
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.mo11259c() == i2 && key != null && this.f20688b.f20641f.m11153d(k2, key)) {
                        ValueReference<K, V> mo11258b = referenceEntry2.mo11258b();
                        V v2 = mo11258b.get();
                        if (v2 != null) {
                            if (z) {
                                Objects.requireNonNull(this.f20688b);
                                this.f20700n.add(referenceEntry2);
                            } else {
                                this.f20691e++;
                                m11290d(k2, v2, mo11258b.mo11254d(), RemovalCause.REPLACED);
                                m11310x(referenceEntry2, k2, v, mo11226a);
                                m11291e(referenceEntry2);
                            }
                            return v2;
                        }
                        this.f20691e++;
                        if (mo11258b.mo11251a()) {
                            m11290d(k2, v2, mo11258b.mo11254d(), RemovalCause.COLLECTED);
                            m11310x(referenceEntry2, k2, v, mo11226a);
                            i3 = this.f20689c;
                        } else {
                            m11310x(referenceEntry2, k2, v, mo11226a);
                            i3 = this.f20689c + 1;
                        }
                        this.f20689c = i3;
                        m11291e(referenceEntry2);
                    } else {
                        referenceEntry2 = referenceEntry2.mo11257a();
                    }
                }
                return null;
            } finally {
                unlock();
                m11309w();
            }
        }

        @GuardedBy
        /* renamed from: o */
        public void m11301o(ReferenceEntry<K, V> referenceEntry, long j2) {
            Objects.requireNonNull(this.f20688b);
            this.f20700n.add(referenceEntry);
        }

        /* renamed from: p */
        public void m11302p(ReferenceEntry<K, V> referenceEntry, long j2) {
            if (this.f20688b.m11243c()) {
                referenceEntry.mo11263h(j2);
            }
            this.f20697k.add(referenceEntry);
        }

        @GuardedBy
        /* renamed from: q */
        public void m11303q(ReferenceEntry<K, V> referenceEntry) {
            K key = referenceEntry.getKey();
            referenceEntry.mo11259c();
            m11290d(key, referenceEntry.mo11258b().get(), referenceEntry.mo11258b().mo11254d(), RemovalCause.COLLECTED);
            this.f20699m.remove(referenceEntry);
            this.f20700n.remove(referenceEntry);
        }

        @VisibleForTesting
        @GuardedBy
        /* renamed from: r */
        public boolean m11304r(ReferenceEntry<K, V> referenceEntry, int i2, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
            int length = (atomicReferenceArray.length() - 1) & i2;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.mo11257a()) {
                if (referenceEntry3 == referenceEntry) {
                    this.f20691e++;
                    ReferenceEntry<K, V> m11307u = m11307u(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i2, referenceEntry3.mo11258b().get(), referenceEntry3.mo11258b(), removalCause);
                    int i3 = this.f20689c - 1;
                    atomicReferenceArray.set(length, m11307u);
                    this.f20689c = i3;
                    return true;
                }
            }
            return false;
        }

        @NullableDecl
        @GuardedBy
        /* renamed from: s */
        public ReferenceEntry<K, V> m11305s(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i2 = this.f20689c;
            ReferenceEntry<K, V> mo11257a = referenceEntry2.mo11257a();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> m11287a = m11287a(referenceEntry, mo11257a);
                if (m11287a != null) {
                    mo11257a = m11287a;
                } else {
                    m11303q(referenceEntry);
                    i2--;
                }
                referenceEntry = referenceEntry.mo11257a();
            }
            this.f20689c = i2;
            return mo11257a;
        }

        /* renamed from: t */
        public boolean m11306t(K k2, int i2, LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.mo11259c() != i2 || key == null || !this.f20688b.f20641f.m11153d(k2, key)) {
                        referenceEntry2 = referenceEntry2.mo11257a();
                    } else if (referenceEntry2.mo11258b() == loadingValueReference) {
                        if (loadingValueReference.mo11251a()) {
                            referenceEntry2.mo11261e(loadingValueReference.f20681b);
                        } else {
                            atomicReferenceArray.set(length, m11305s(referenceEntry, referenceEntry2));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                m11309w();
            }
        }

        @NullableDecl
        @GuardedBy
        /* renamed from: u */
        public ReferenceEntry<K, V> m11307u(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, @NullableDecl K k2, int i2, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            m11290d(k2, v, valueReference.mo11254d(), removalCause);
            this.f20699m.remove(referenceEntry2);
            this.f20700n.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return m11305s(referenceEntry, referenceEntry2);
            }
            valueReference.mo11253c(null);
            return referenceEntry;
        }

        /* renamed from: v */
        public void m11308v(long j2) {
            if (tryLock()) {
                try {
                    m11289c();
                    m11293g(j2);
                    this.f20698l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: w */
        public void m11309w() {
            if (isHeldByCurrentThread()) {
                return;
            }
            LocalCache<K, V> localCache = this.f20688b;
            while (true) {
                RemovalNotification<K, V> poll = localCache.f20647l.poll();
                if (poll == null) {
                    return;
                }
                try {
                    localCache.f20648m.mo11234a(poll);
                } catch (Throwable th) {
                    LocalCache.f20634u.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            }
        }

        @GuardedBy
        /* renamed from: x */
        public void m11310x(ReferenceEntry<K, V> referenceEntry, K k2, V v, long j2) {
            ValueReference<K, V> mo11258b = referenceEntry.mo11258b();
            int mo11235a = this.f20688b.f20646k.mo11235a(k2, v);
            Preconditions.m11192p(mo11235a >= 0, "Weights must be non-negative");
            referenceEntry.mo11261e(this.f20688b.f20644i.mo11314b(this, referenceEntry, v, mo11235a));
            m11288b();
            this.f20690d += mo11235a;
            if (this.f20688b.m11243c()) {
                referenceEntry.mo11263h(j2);
            }
            if (this.f20688b.m11246g()) {
                referenceEntry.mo11266k(j2);
            }
            this.f20700n.add(referenceEntry);
            this.f20699m.add(referenceEntry);
            mo11258b.mo11253c(v);
        }

        /* renamed from: y */
        public boolean m11311y(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, V v) {
            RemovalCause removalCause = RemovalCause.REPLACED;
            lock();
            try {
                long mo11226a = this.f20688b.f20649n.mo11226a();
                m11308v(mo11226a);
                int i3 = this.f20689c + 1;
                if (i3 > this.f20692f) {
                    m11292f();
                    i3 = this.f20689c + 1;
                }
                int i4 = i3;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f20693g;
                int length = i2 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        this.f20691e++;
                        EntryFactory entryFactory = this.f20688b.f20650o;
                        Objects.requireNonNull(k2);
                        ReferenceEntry<K, V> mo11277d = entryFactory.mo11277d(this, k2, i2, referenceEntry);
                        m11310x(mo11277d, k2, v, mo11226a);
                        atomicReferenceArray.set(length, mo11277d);
                        this.f20689c = i4;
                        m11291e(mo11277d);
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.mo11259c() == i2 && key != null && this.f20688b.f20641f.m11153d(k2, key)) {
                        ValueReference<K, V> mo11258b = referenceEntry2.mo11258b();
                        V v2 = mo11258b.get();
                        if (loadingValueReference != mo11258b && (v2 != null || mo11258b == LocalCache.f20635v)) {
                            m11290d(k2, v, 0, removalCause);
                            return false;
                        }
                        this.f20691e++;
                        if (loadingValueReference.mo11251a()) {
                            if (v2 == null) {
                                removalCause = RemovalCause.COLLECTED;
                            }
                            m11290d(k2, v2, loadingValueReference.mo11254d(), removalCause);
                            i4--;
                        }
                        m11310x(referenceEntry2, k2, v, mo11226a);
                        this.f20689c = i4;
                        m11291e(referenceEntry2);
                    } else {
                        referenceEntry2 = referenceEntry2.mo11257a();
                    }
                }
                return true;
            } finally {
                unlock();
                m11309w();
            }
        }

        /* renamed from: z */
        public void m11312z() {
            if (tryLock()) {
                try {
                    m11289c();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* renamed from: b */
        public final ReferenceEntry<K, V> f20707b;

        public SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f20707b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: a */
        public boolean mo11251a() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: b */
        public ReferenceEntry<K, V> mo11252b() {
            return this.f20707b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: c */
        public void mo11253c(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: e */
        public V mo11255e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: a */
            public Equivalence<Object> mo11313a() {
                return Equivalence.m11149c();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: b */
            public <K, V> ValueReference<K, V> mo11314b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
                return i2 == 1 ? new StrongValueReference(v) : new WeightedStrongValueReference(v, i2);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: a */
            public Equivalence<Object> mo11313a() {
                return Equivalence.m11150f();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: b */
            public <K, V> ValueReference<K, V> mo11314b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
                return i2 == 1 ? new SoftValueReference(segment.f20696j, v, referenceEntry) : new WeightedSoftValueReference(segment.f20696j, v, referenceEntry, i2);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: a */
            public Equivalence<Object> mo11313a() {
                return Equivalence.m11150f();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: b */
            public <K, V> ValueReference<K, V> mo11314b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
                return i2 == 1 ? new WeakValueReference(segment.f20696j, v, referenceEntry) : new WeightedWeakValueReference(segment.f20696j, v, referenceEntry, i2);
            }
        };

        Strength(C15851 c15851) {
        }

        /* renamed from: a */
        public abstract Equivalence<Object> mo11313a();

        /* renamed from: b */
        public abstract <K, V> ValueReference<K, V> mo11314b(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: f */
        public volatile long f20712f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20713g;

        /* renamed from: h */
        @Weak
        public ReferenceEntry<K, V> f20714h;

        public StrongAccessEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(k2, i2, referenceEntry);
            this.f20712f = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20713g = nullEntry;
            this.f20714h = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            return this.f20714h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
            this.f20712f = j2;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            return this.f20712f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            return this.f20713g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            this.f20713g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            this.f20714h = referenceEntry;
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: f */
        public volatile long f20715f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20716g;

        /* renamed from: h */
        @Weak
        public ReferenceEntry<K, V> f20717h;

        /* renamed from: i */
        public volatile long f20718i;

        /* renamed from: j */
        @Weak
        public ReferenceEntry<K, V> f20719j;

        /* renamed from: k */
        @Weak
        public ReferenceEntry<K, V> f20720k;

        public StrongAccessWriteEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(k2, i2, referenceEntry);
            this.f20715f = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20716g = nullEntry;
            this.f20717h = nullEntry;
            this.f20718i = Long.MAX_VALUE;
            this.f20719j = nullEntry;
            this.f20720k = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            return this.f20717h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            return this.f20718i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
            this.f20715f = j2;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            return this.f20719j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            return this.f20715f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
            this.f20718i = j2;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            return this.f20716g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            this.f20716g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            this.f20719j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            this.f20720k = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            this.f20717h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            return this.f20720k;
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* renamed from: b */
        public final K f20721b;

        /* renamed from: c */
        public final int f20722c;

        /* renamed from: d */
        @NullableDecl
        public final ReferenceEntry<K, V> f20723d;

        /* renamed from: e */
        public volatile ValueReference<K, V> f20724e = (ValueReference<K, V>) LocalCache.f20635v;

        public StrongEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            this.f20721b = k2;
            this.f20722c = i2;
            this.f20723d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: a */
        public ReferenceEntry<K, V> mo11257a() {
            return this.f20723d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: b */
        public ValueReference<K, V> mo11258b() {
            return this.f20724e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: c */
        public int mo11259c() {
            return this.f20722c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: e */
        public void mo11261e(ValueReference<K, V> valueReference) {
            this.f20724e = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.f20721b;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: b */
        public final V f20725b;

        public StrongValueReference(V v) {
            this.f20725b = v;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: a */
        public boolean mo11251a() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: b */
        public ReferenceEntry<K, V> mo11252b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: c */
        public void mo11253c(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: e */
        public V mo11255e() {
            return this.f20725b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.f20725b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: f */
        public volatile long f20726f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20727g;

        /* renamed from: h */
        @Weak
        public ReferenceEntry<K, V> f20728h;

        public StrongWriteEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(k2, i2, referenceEntry);
            this.f20726f = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20727g = nullEntry;
            this.f20728h = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            return this.f20726f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            return this.f20727g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
            this.f20726f = j2;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            this.f20727g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            this.f20728h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            return this.f20728h;
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        public ValueIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m11280c().f20754c;
        }
    }

    public interface ValueReference<K, V> {
        /* renamed from: a */
        boolean mo11251a();

        @NullableDecl
        /* renamed from: b */
        ReferenceEntry<K, V> mo11252b();

        /* renamed from: c */
        void mo11253c(@NullableDecl V v);

        /* renamed from: d */
        int mo11254d();

        /* renamed from: e */
        V mo11255e() throws ExecutionException;

        /* renamed from: f */
        ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, @NullableDecl V v, ReferenceEntry<K, V> referenceEntry);

        @NullableDecl
        V get();

        boolean isLoading();
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.m11241a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m11241a(this).toArray(eArr);
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: e */
        public volatile long f20730e;

        /* renamed from: f */
        @Weak
        public ReferenceEntry<K, V> f20731f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20732g;

        public WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i2, referenceEntry);
            this.f20730e = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20731f = nullEntry;
            this.f20732g = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            return this.f20732g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
            this.f20730e = j2;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            return this.f20730e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            return this.f20731f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            this.f20731f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            this.f20732g = referenceEntry;
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: e */
        public volatile long f20733e;

        /* renamed from: f */
        @Weak
        public ReferenceEntry<K, V> f20734f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20735g;

        /* renamed from: h */
        public volatile long f20736h;

        /* renamed from: i */
        @Weak
        public ReferenceEntry<K, V> f20737i;

        /* renamed from: j */
        @Weak
        public ReferenceEntry<K, V> f20738j;

        public WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i2, referenceEntry);
            this.f20733e = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20734f = nullEntry;
            this.f20735g = nullEntry;
            this.f20736h = Long.MAX_VALUE;
            this.f20737i = nullEntry;
            this.f20738j = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            return this.f20735g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            return this.f20736h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: h */
        public void mo11263h(long j2) {
            this.f20733e = j2;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            return this.f20737i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: j */
        public long mo11265j() {
            return this.f20733e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
            this.f20736h = j2;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            return this.f20734f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            this.f20734f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            this.f20737i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            this.f20738j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            this.f20735g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            return this.f20738j;
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* renamed from: b */
        public final int f20739b;

        /* renamed from: c */
        @NullableDecl
        public final ReferenceEntry<K, V> f20740c;

        /* renamed from: d */
        public volatile ValueReference<K, V> f20741d;

        public WeakEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(k2, referenceQueue);
            this.f20741d = (ValueReference<K, V>) LocalCache.f20635v;
            this.f20739b = i2;
            this.f20740c = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: a */
        public ReferenceEntry<K, V> mo11257a() {
            return this.f20740c;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: b */
        public ValueReference<K, V> mo11258b() {
            return this.f20741d;
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: c */
        public int mo11259c() {
            return this.f20739b;
        }

        /* renamed from: d */
        public ReferenceEntry<K, V> mo11260d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        /* renamed from: e */
        public void mo11261e(ValueReference<K, V> valueReference) {
            this.f20741d = valueReference;
        }

        /* renamed from: f */
        public long mo11262f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }

        /* renamed from: h */
        public void mo11263h(long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public long mo11265j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public void mo11266k(long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public ReferenceEntry<K, V> mo11267l() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: m */
        public void mo11268m(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: p */
        public void mo11271p(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            throw new UnsupportedOperationException();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* renamed from: b */
        public final ReferenceEntry<K, V> f20742b;

        public WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f20742b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: a */
        public boolean mo11251a() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: b */
        public ReferenceEntry<K, V> mo11252b() {
            return this.f20742b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: c */
        public void mo11253c(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: e */
        public V mo11255e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: e */
        public volatile long f20743e;

        /* renamed from: f */
        @Weak
        public ReferenceEntry<K, V> f20744f;

        /* renamed from: g */
        @Weak
        public ReferenceEntry<K, V> f20745g;

        public WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i2, referenceEntry);
            this.f20743e = Long.MAX_VALUE;
            Logger logger = LocalCache.f20634u;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f20744f = nullEntry;
            this.f20745g = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: f */
        public long mo11262f() {
            return this.f20743e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: i */
        public ReferenceEntry<K, V> mo11264i() {
            return this.f20744f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: k */
        public void mo11266k(long j2) {
            this.f20743e = j2;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: n */
        public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
            this.f20744f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: o */
        public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
            this.f20745g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        /* renamed from: q */
        public ReferenceEntry<K, V> mo11272q() {
            return this.f20745g;
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* renamed from: c */
        public final int f20746c;

        public WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i2) {
            super(referenceQueue, v, referenceEntry);
            this.f20746c = i2;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return this.f20746c;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.f20746c);
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* renamed from: c */
        public final int f20747c;

        public WeightedStrongValueReference(V v, int i2) {
            super(v);
            this.f20747c = i2;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return this.f20747c;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* renamed from: c */
        public final int f20748c;

        public WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i2) {
            super(referenceQueue, v, referenceEntry);
            this.f20748c = i2;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        /* renamed from: d */
        public int mo11254d() {
            return this.f20748c;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        /* renamed from: f */
        public ValueReference<K, V> mo11256f(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.f20748c);
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: b */
        public final ReferenceEntry<K, V> f20749b = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.WriteQueue.1

            /* renamed from: b */
            @Weak
            public ReferenceEntry<K, V> f20750b = this;

            /* renamed from: c */
            @Weak
            public ReferenceEntry<K, V> f20751c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: f */
            public long mo11262f() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: i */
            public ReferenceEntry<K, V> mo11264i() {
                return this.f20750b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: k */
            public void mo11266k(long j2) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: n */
            public void mo11269n(ReferenceEntry<K, V> referenceEntry) {
                this.f20750b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: o */
            public void mo11270o(ReferenceEntry<K, V> referenceEntry) {
                this.f20751c = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            /* renamed from: q */
            public ReferenceEntry<K, V> mo11272q() {
                return this.f20751c;
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> mo11264i = this.f20749b.mo11264i();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f20749b;
                if (mo11264i == referenceEntry) {
                    referenceEntry.mo11269n(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f20749b;
                    referenceEntry2.mo11270o(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> mo11264i2 = mo11264i.mo11264i();
                    Logger logger = LocalCache.f20634u;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    mo11264i.mo11269n(nullEntry);
                    mo11264i.mo11270o(nullEntry);
                    mo11264i = mo11264i2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).mo11264i() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f20749b.mo11264i() == this.f20749b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            ReferenceEntry<K, V> mo11264i = this.f20749b.mo11264i();
            if (mo11264i == this.f20749b) {
                mo11264i = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(mo11264i) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* renamed from: a */
                public Object mo11273a(Object obj) {
                    ReferenceEntry<K, V> mo11264i2 = ((ReferenceEntry) obj).mo11264i();
                    if (mo11264i2 == WriteQueue.this.f20749b) {
                        return null;
                    }
                    return mo11264i2;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> mo11272q = referenceEntry.mo11272q();
            ReferenceEntry<K, V> mo11264i = referenceEntry.mo11264i();
            Logger logger = LocalCache.f20634u;
            mo11272q.mo11269n(mo11264i);
            mo11264i.mo11270o(mo11272q);
            ReferenceEntry<K, V> mo11272q2 = this.f20749b.mo11272q();
            mo11272q2.mo11269n(referenceEntry);
            referenceEntry.mo11270o(mo11272q2);
            ReferenceEntry<K, V> referenceEntry2 = this.f20749b;
            referenceEntry.mo11269n(referenceEntry2);
            referenceEntry2.mo11270o(referenceEntry);
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            ReferenceEntry<K, V> mo11264i = this.f20749b.mo11264i();
            if (mo11264i == this.f20749b) {
                return null;
            }
            return mo11264i;
        }

        @Override // java.util.Queue
        public Object poll() {
            ReferenceEntry<K, V> mo11264i = this.f20749b.mo11264i();
            if (mo11264i == this.f20749b) {
                return null;
            }
            remove(mo11264i);
            return mo11264i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> mo11272q = referenceEntry.mo11272q();
            ReferenceEntry<K, V> mo11264i = referenceEntry.mo11264i();
            Logger logger = LocalCache.f20634u;
            mo11272q.mo11269n(mo11264i);
            mo11264i.mo11270o(mo11272q);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.mo11269n(nullEntry);
            referenceEntry.mo11270o(nullEntry);
            return mo11264i != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i2 = 0;
            for (ReferenceEntry<K, V> mo11264i = this.f20749b.mo11264i(); mo11264i != this.f20749b; mo11264i = mo11264i.mo11264i()) {
                i2++;
            }
            return i2;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f20753b;

        /* renamed from: c */
        public V f20754c;

        public WriteThroughEntry(K k2, V v) {
            this.f20753b = k2;
            this.f20754c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f20753b.equals(entry.getKey()) && this.f20754c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20753b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20754c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20753b.hashCode() ^ this.f20754c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) LocalCache.this.put(this.f20753b, v);
            this.f20754c = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20753b);
            String valueOf2 = String.valueOf(this.f20754c);
            return C0576a.m4115n(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @NullableDecl CacheLoader<? super K, V> cacheLoader) {
        Objects.requireNonNull(cacheBuilder);
        this.f20640e = Math.min(4, TextBuffer.MAX_SEGMENT_LEN);
        Strength strength = cacheBuilder.f20618a;
        Strength strength2 = Strength.STRONG;
        Strength strength3 = (Strength) MoreObjects.m11165a(strength, strength2);
        this.f20643h = strength3;
        this.f20644i = (Strength) MoreObjects.m11165a(null, strength2);
        this.f20641f = (Equivalence) MoreObjects.m11165a(null, ((Strength) MoreObjects.m11165a(cacheBuilder.f20618a, strength2)).mo11313a());
        this.f20642g = (Equivalence) MoreObjects.m11165a(null, ((Strength) MoreObjects.m11165a(null, strength2)).mo11313a());
        this.f20645j = -1L;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.INSTANCE;
        Weigher<K, V> weigher = (Weigher) MoreObjects.m11165a(null, oneWeigher);
        this.f20646k = weigher;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.INSTANCE;
        RemovalListener<K, V> removalListener = (RemovalListener) MoreObjects.m11165a(null, nullListener);
        this.f20648m = removalListener;
        this.f20647l = removalListener == nullListener ? (Queue<RemovalNotification<K, V>>) f20636w : new ConcurrentLinkedQueue();
        this.f20649n = CacheBuilder.f20617d;
        int i2 = 0;
        int i3 = 1;
        this.f20650o = EntryFactory.f20669j[(strength3 != Strength.WEAK ? (char) 0 : (char) 4) | (!m11248i() ? (char) 0 : (char) 1) | 0];
        this.f20651p = cacheBuilder.f20619b.get();
        this.f20652q = cacheLoader;
        int min = Math.min(16, 1073741824);
        if (m11242b()) {
            if (!(weigher != oneWeigher)) {
                min = (int) Math.min(min, -1L);
            }
        }
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f20640e && (!m11242b() || i4 * 20 <= this.f20645j)) {
            i5++;
            i4 <<= 1;
        }
        this.f20638c = 32 - i5;
        this.f20637b = i4 - 1;
        this.f20639d = new Segment[i4];
        int i6 = min / i4;
        while (i3 < (i6 * i4 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (m11242b()) {
            long j2 = this.f20645j;
            long j3 = i4;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (true) {
                Segment<K, V>[] segmentArr = this.f20639d;
                if (i2 >= segmentArr.length) {
                    return;
                }
                if (i2 == j5) {
                    j4--;
                }
                long j6 = j4;
                segmentArr[i2] = new Segment<>(this, i3, j6, cacheBuilder.f20619b.get());
                i2++;
                j4 = j6;
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f20639d;
                if (i2 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i2] = new Segment<>(this, i3, -1L, cacheBuilder.f20619b.get());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static ArrayList m11241a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.m11706a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: b */
    public boolean m11242b() {
        return this.f20645j >= 0;
    }

    /* renamed from: c */
    public boolean m11243c() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        RemovalCause removalCause;
        Segment<K, V>[] segmentArr = this.f20639d;
        int length = segmentArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Segment<K, V> segment = segmentArr[i2];
            if (segment.f20689c != 0) {
                segment.lock();
                try {
                    segment.m11308v(segment.f20688b.f20649n.mo11226a());
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.f20693g;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i3); referenceEntry != null; referenceEntry = referenceEntry.mo11257a()) {
                            if (referenceEntry.mo11258b().mo11251a()) {
                                K key = referenceEntry.getKey();
                                V v = referenceEntry.mo11258b().get();
                                if (key != null && v != null) {
                                    removalCause = RemovalCause.EXPLICIT;
                                    referenceEntry.mo11259c();
                                    segment.m11290d(key, v, referenceEntry.mo11258b().mo11254d(), removalCause);
                                }
                                removalCause = RemovalCause.COLLECTED;
                                referenceEntry.mo11259c();
                                segment.m11290d(key, v, referenceEntry.mo11258b().mo11254d(), removalCause);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (segment.f20688b.m11249j()) {
                        while (segment.f20695i.poll() != null) {
                        }
                    }
                    if (segment.f20688b.m11250k()) {
                        while (segment.f20696j.poll() != null) {
                        }
                    }
                    segment.f20699m.clear();
                    segment.f20700n.clear();
                    segment.f20698l.set(0);
                    segment.f20691e++;
                    segment.f20689c = 0;
                } finally {
                    segment.unlock();
                    segment.m11309w();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        ReferenceEntry<K, V> m11296j;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int m11244d = m11244d(obj);
        Segment<K, V> m11247h = m11247h(m11244d);
        Objects.requireNonNull(m11247h);
        try {
            if (m11247h.f20689c != 0 && (m11296j = m11247h.m11296j(obj, m11244d, m11247h.f20688b.f20649n.mo11226a())) != null) {
                if (m11296j.mo11258b().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            m11247h.m11299m();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        long mo11226a = this.f20649n.mo11226a();
        Segment<K, V>[] segmentArr = this.f20639d;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            int length = segmentArr.length;
            int i3 = 0;
            while (i3 < length) {
                Segment<K, V> segment = segmentArr[i3];
                int i4 = segment.f20689c;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.f20693g;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i5);
                    while (referenceEntry != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V m11297k = segment.m11297k(referenceEntry, mo11226a);
                        long j4 = mo11226a;
                        if (m11297k != null && this.f20642g.m11153d(obj, m11297k)) {
                            return true;
                        }
                        referenceEntry = referenceEntry.mo11257a();
                        segmentArr = segmentArr2;
                        mo11226a = j4;
                    }
                }
                j3 += segment.f20691e;
                i3++;
                mo11226a = mo11226a;
            }
            long j5 = mo11226a;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            segmentArr = segmentArr3;
            mo11226a = j5;
        }
        return false;
    }

    /* renamed from: d */
    public int m11244d(@NullableDecl Object obj) {
        int m11154e = this.f20641f.m11154e(obj);
        int i2 = m11154e + ((m11154e << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20655t;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f20655t = entrySet;
        return entrySet;
    }

    /* renamed from: f */
    public boolean m11245f(ReferenceEntry<K, V> referenceEntry, long j2) {
        return false;
    }

    /* renamed from: g */
    public boolean m11246g() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        long mo11226a;
        ReferenceEntry<K, V> m11296j;
        if (obj == null) {
            return null;
        }
        int m11244d = m11244d(obj);
        Segment<K, V> m11247h = m11247h(m11244d);
        Objects.requireNonNull(m11247h);
        try {
            if (m11247h.f20689c != 0 && (m11296j = m11247h.m11296j(obj, m11244d, (mo11226a = m11247h.f20688b.f20649n.mo11226a()))) != null) {
                V v = m11296j.mo11258b().get();
                if (v != null) {
                    m11247h.m11302p(m11296j, mo11226a);
                    m11296j.getKey();
                    CacheLoader<? super K, V> cacheLoader = m11247h.f20688b.f20652q;
                    return v;
                }
                m11247h.m11312z();
            }
            return null;
        } finally {
            m11247h.m11299m();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public Segment<K, V> m11247h(int i2) {
        return this.f20639d[(i2 >>> this.f20638c) & this.f20637b];
    }

    /* renamed from: i */
    public boolean m11248i() {
        return m11243c() || m11242b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f20639d;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f20689c != 0) {
                return false;
            }
            j2 += segmentArr[i2].f20691e;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].f20689c != 0) {
                return false;
            }
            j2 -= segmentArr[i3].f20691e;
        }
        return j2 == 0;
    }

    /* renamed from: j */
    public boolean m11249j() {
        return this.f20643h != Strength.STRONG;
    }

    /* renamed from: k */
    public boolean m11250k() {
        return this.f20644i != Strength.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20653r;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f20653r = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        int m11244d = m11244d(k2);
        return m11247h(m11244d).m11300n(k2, m11244d, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        int m11244d = m11244d(k2);
        return m11247h(m11244d).m11300n(k2, m11244d, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r7 = r3.mo11258b();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r0 = com.google.common.cache.RemovalCause.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r9.f20691e++;
        r0 = r9.m11307u(r2, r3, r4, r5, r13, r7, r8);
        r1 = r9.f20689c - 1;
        r10.set(r11, r0);
        r9.f20689c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r7.mo11251a() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = com.google.common.cache.RemovalCause.COLLECTED;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r5 = r12.m11244d(r13)
            com.google.common.cache.LocalCache$Segment r9 = r12.m11247h(r5)
            r9.lock()
            com.google.common.cache.LocalCache<K, V> r1 = r9.f20688b     // Catch: java.lang.Throwable -> L84
            com.google.common.base.Ticker r1 = r1.f20649n     // Catch: java.lang.Throwable -> L84
            long r1 = r1.mo11226a()     // Catch: java.lang.Throwable -> L84
            r9.m11308v(r1)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.f20693g     // Catch: java.lang.Throwable -> L84
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L84
            int r1 = r1 + (-1)
            r11 = r1 & r5
            java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> L84
            r2 = r1
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L84
            r3 = r2
        L2c:
            if (r3 == 0) goto L7d
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L84
            int r1 = r3.mo11259c()     // Catch: java.lang.Throwable -> L84
            if (r1 != r5) goto L78
            if (r4 == 0) goto L78
            com.google.common.cache.LocalCache<K, V> r1 = r9.f20688b     // Catch: java.lang.Throwable -> L84
            com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f20641f     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.m11153d(r13, r4)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L78
            com.google.common.cache.LocalCache$ValueReference r7 = r3.mo11258b()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L84
            if (r13 == 0) goto L52
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L84
        L50:
            r8 = r0
            goto L5b
        L52:
            boolean r1 = r7.mo11251a()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7d
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L84
            goto L50
        L5b:
            int r0 = r9.f20691e     // Catch: java.lang.Throwable -> L84
            int r0 = r0 + 1
            r9.f20691e = r0     // Catch: java.lang.Throwable -> L84
            r1 = r9
            r6 = r13
            com.google.common.cache.ReferenceEntry r0 = r1.m11307u(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L84
            int r1 = r9.f20689c     // Catch: java.lang.Throwable -> L84
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L84
            r9.f20689c = r1     // Catch: java.lang.Throwable -> L84
            r9.unlock()
            r9.m11309w()
            r0 = r13
            goto L83
        L78:
            com.google.common.cache.ReferenceEntry r3 = r3.mo11257a()     // Catch: java.lang.Throwable -> L84
            goto L2c
        L7d:
            r9.unlock()
            r9.m11309w()
        L83:
            return r0
        L84:
            r13 = move-exception
            r9.unlock()
            r9.m11309w()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V replace(K r17, V r18) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            java.util.Objects.requireNonNull(r18)
            int r4 = r16.m11244d(r17)
            r8 = r16
            com.google.common.cache.LocalCache$Segment r9 = r8.m11247h(r4)
            r9.lock()
            com.google.common.cache.LocalCache<K, V> r1 = r9.f20688b     // Catch: java.lang.Throwable -> La4
            com.google.common.base.Ticker r1 = r1.f20649n     // Catch: java.lang.Throwable -> La4
            long r5 = r1.mo11226a()     // Catch: java.lang.Throwable -> La4
            r9.m11308v(r5)     // Catch: java.lang.Throwable -> La4
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.f20693g     // Catch: java.lang.Throwable -> La4
            int r1 = r10.length()     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + (-1)
            r11 = r4 & r1
            java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch: java.lang.Throwable -> La4
            r7 = r1
        L31:
            r12 = 0
            if (r7 == 0) goto L9d
            java.lang.Object r3 = r7.getKey()     // Catch: java.lang.Throwable -> La4
            int r2 = r7.mo11259c()     // Catch: java.lang.Throwable -> La4
            if (r2 != r4) goto L98
            if (r3 == 0) goto L98
            com.google.common.cache.LocalCache<K, V> r2 = r9.f20688b     // Catch: java.lang.Throwable -> La4
            com.google.common.base.Equivalence<java.lang.Object> r2 = r2.f20641f     // Catch: java.lang.Throwable -> La4
            boolean r2 = r2.m11153d(r0, r3)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L98
            com.google.common.cache.LocalCache$ValueReference r13 = r7.mo11258b()     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> La4
            if (r14 != 0) goto L75
            boolean r0 = r13.mo11251a()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L9d
            int r0 = r9.f20691e     // Catch: java.lang.Throwable -> La4
            int r0 = r0 + 1
            r9.f20691e = r0     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.RemovalCause r15 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> La4
            r0 = r9
            r2 = r7
            r5 = r14
            r6 = r13
            r7 = r15
            com.google.common.cache.ReferenceEntry r0 = r0.m11307u(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La4
            int r1 = r9.f20689c     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> La4
            r9.f20689c = r1     // Catch: java.lang.Throwable -> La4
            goto L9d
        L75:
            int r1 = r9.f20691e     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + 1
            r9.f20691e = r1     // Catch: java.lang.Throwable -> La4
            int r1 = r13.mo11254d()     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> La4
            r9.m11290d(r0, r14, r1, r2)     // Catch: java.lang.Throwable -> La4
            r1 = r9
            r2 = r7
            r3 = r17
            r4 = r18
            r1.m11310x(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La4
            r9.m11291e(r7)     // Catch: java.lang.Throwable -> La4
            r9.unlock()
            r9.m11309w()
            r12 = r14
            goto La3
        L98:
            com.google.common.cache.ReferenceEntry r7 = r7.mo11257a()     // Catch: java.lang.Throwable -> La4
            goto L31
        L9d:
            r9.unlock()
            r9.m11309w()
        La3:
            return r12
        La4:
            r0 = move-exception
            r9.unlock()
            r9.m11309w()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (int i2 = 0; i2 < this.f20639d.length; i2++) {
            j2 += Math.max(0, r0[i2].f20689c);
        }
        return Ints.m12084f(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f20654s;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f20654s = values;
        return values;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r9 = r5.mo11258b();
        r8 = r9.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r12.f20688b.f20642g.m11153d(r18, r8) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        r12.f20691e++;
        r3 = r12.m11307u(r4, r5, r6, r7, r8, r9, r0);
        r4 = r12.f20689c - 1;
        r14.set(r10, r3);
        r12.f20689c = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r0 != r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r9.mo11251a() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r0 = com.google.common.cache.RemovalCause.COLLECTED;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r17, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 == 0) goto L9b
            if (r1 != 0) goto Lb
            goto L9b
        Lb:
            int r7 = r16.m11244d(r17)
            r11 = r16
            com.google.common.cache.LocalCache$Segment r12 = r11.m11247h(r7)
            com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT
            r12.lock()
            com.google.common.cache.LocalCache<K, V> r3 = r12.f20688b     // Catch: java.lang.Throwable -> L93
            com.google.common.base.Ticker r3 = r3.f20649n     // Catch: java.lang.Throwable -> L93
            long r3 = r3.mo11226a()     // Catch: java.lang.Throwable -> L93
            r12.m11308v(r3)     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r14 = r12.f20693g     // Catch: java.lang.Throwable -> L93
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L93
            r15 = 1
            int r3 = r3 - r15
            r10 = r7 & r3
            java.lang.Object r3 = r14.get(r10)     // Catch: java.lang.Throwable -> L93
            r4 = r3
            com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L93
            r5 = r4
        L37:
            if (r5 == 0) goto L8c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L93
            int r3 = r5.mo11259c()     // Catch: java.lang.Throwable -> L93
            if (r3 != r7) goto L85
            if (r6 == 0) goto L85
            com.google.common.cache.LocalCache<K, V> r3 = r12.f20688b     // Catch: java.lang.Throwable -> L93
            com.google.common.base.Equivalence<java.lang.Object> r3 = r3.f20641f     // Catch: java.lang.Throwable -> L93
            boolean r3 = r3.m11153d(r0, r6)     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L85
            com.google.common.cache.LocalCache$ValueReference r9 = r5.mo11258b()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r8 = r9.get()     // Catch: java.lang.Throwable -> L93
            com.google.common.cache.LocalCache<K, V> r0 = r12.f20688b     // Catch: java.lang.Throwable -> L93
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.f20642g     // Catch: java.lang.Throwable -> L93
            boolean r0 = r0.m11153d(r1, r8)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L63
            r0 = r13
            goto L6d
        L63:
            if (r8 != 0) goto L8c
            boolean r0 = r9.mo11251a()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8c
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L93
        L6d:
            int r1 = r12.f20691e     // Catch: java.lang.Throwable -> L93
            int r1 = r1 + r15
            r12.f20691e = r1     // Catch: java.lang.Throwable -> L93
            r3 = r12
            r1 = r10
            r10 = r0
            com.google.common.cache.ReferenceEntry r3 = r3.m11307u(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L93
            int r4 = r12.f20689c     // Catch: java.lang.Throwable -> L93
            int r4 = r4 - r15
            r14.set(r1, r3)     // Catch: java.lang.Throwable -> L93
            r12.f20689c = r4     // Catch: java.lang.Throwable -> L93
            if (r0 != r13) goto L8c
            r2 = 1
            goto L8c
        L85:
            r3 = r10
            com.google.common.cache.ReferenceEntry r5 = r5.mo11257a()     // Catch: java.lang.Throwable -> L93
            r10 = r3
            goto L37
        L8c:
            r12.unlock()
            r12.m11309w()
            return r2
        L93:
            r0 = move-exception
            r12.unlock()
            r12.m11309w()
            throw r0
        L9b:
            r11 = r16
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @NullableDecl V v, V v2) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v2);
        if (v == null) {
            return false;
        }
        int m11244d = m11244d(k2);
        Segment<K, V> m11247h = m11247h(m11244d);
        m11247h.lock();
        try {
            long mo11226a = m11247h.f20688b.f20649n.mo11226a();
            m11247h.m11308v(mo11226a);
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = m11247h.f20693g;
            int length = m11244d & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
            while (true) {
                if (referenceEntry2 == null) {
                    break;
                }
                K key = referenceEntry2.getKey();
                if (referenceEntry2.mo11259c() == m11244d && key != null && m11247h.f20688b.f20641f.m11153d(k2, key)) {
                    ValueReference<K, V> mo11258b = referenceEntry2.mo11258b();
                    V v3 = mo11258b.get();
                    if (v3 == null) {
                        if (mo11258b.mo11251a()) {
                            m11247h.f20691e++;
                            ReferenceEntry<K, V> m11307u = m11247h.m11307u(referenceEntry, referenceEntry2, key, m11244d, v3, mo11258b, RemovalCause.COLLECTED);
                            int i2 = m11247h.f20689c - 1;
                            atomicReferenceArray.set(length, m11307u);
                            m11247h.f20689c = i2;
                        }
                    } else {
                        if (m11247h.f20688b.f20642g.m11153d(v, v3)) {
                            m11247h.f20691e++;
                            m11247h.m11290d(k2, v3, mo11258b.mo11254d(), RemovalCause.REPLACED);
                            m11247h.m11310x(referenceEntry2, k2, v2, mo11226a);
                            m11247h.m11291e(referenceEntry2);
                            m11247h.unlock();
                            m11247h.m11309w();
                            return true;
                        }
                        m11247h.m11301o(referenceEntry2, mo11226a);
                    }
                } else {
                    referenceEntry2 = referenceEntry2.mo11257a();
                }
            }
            return false;
        } finally {
            m11247h.unlock();
            m11247h.m11309w();
        }
    }
}
