package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {

    /* renamed from: i */
    public static final /* synthetic */ int f21585i = 0;

    /* renamed from: f */
    public final transient Reference<AvlNode<E>> f21586f;

    /* renamed from: g */
    public final transient GeneralRange<E> f21587g;

    /* renamed from: h */
    public final transient AvlNode<E> f21588h;

    /* renamed from: com.google.common.collect.TreeMultiset$1 */
    class C17901 extends Multisets.AbstractEntry<Object> {

        /* renamed from: b */
        public final /* synthetic */ AvlNode f21589b;

        public C17901(AvlNode avlNode) {
            this.f21589b = avlNode;
        }

        @Override // com.google.common.collect.Multiset.Entry
        /* renamed from: b */
        public Object mo11547b() {
            return this.f21589b.f21601a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            AvlNode avlNode = this.f21589b;
            int i2 = avlNode.f21602b;
            return i2 == 0 ? TreeMultiset.this.mo11383s0(avlNode.f21601a) : i2;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$2 */
    public class C17912 implements Iterator<Multiset.Entry<E>> {

        /* renamed from: b */
        public AvlNode<E> f21591b;

        /* renamed from: c */
        @NullableDecl
        public Multiset.Entry<E> f21592c;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r5.f21587g.m11575a(r0.f21601a) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C17912() {
            /*
                r4 = this;
                com.google.common.collect.TreeMultiset.this = r5
                r4.<init>()
                com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.f21586f
                T r0 = r0.f21610a
                com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
                if (r0 != 0) goto Le
                goto L46
            Le:
                com.google.common.collect.GeneralRange<E> r1 = r5.f21587g
                boolean r2 = r1.f20987c
                if (r2 == 0) goto L34
                T r1 = r1.f20988d
                java.util.Comparator<? super E> r2 = r5.f20850d
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.m11946e(r2, r1)
                if (r0 != 0) goto L1f
                goto L46
            L1f:
                com.google.common.collect.GeneralRange<E> r2 = r5.f21587g
                com.google.common.collect.BoundType r2 = r2.f20989e
                com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.OPEN
                if (r2 != r3) goto L38
                java.util.Comparator<? super E> r2 = r5.f20850d
                E r3 = r0.f21601a
                int r1 = r2.compare(r1, r3)
                if (r1 != 0) goto L38
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.f21609i
                goto L38
            L34:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.f21588h
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.f21609i
            L38:
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r5.f21588h
                if (r0 == r1) goto L46
                com.google.common.collect.GeneralRange<E> r5 = r5.f21587g
                E r1 = r0.f21601a
                boolean r5 = r5.m11575a(r1)
                if (r5 != 0) goto L47
            L46:
                r0 = 0
            L47:
                r4.f21591b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.C17912.<init>(com.google.common.collect.TreeMultiset):void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            AvlNode<E> avlNode = this.f21591b;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.f21587g.m11577c(avlNode.f21601a)) {
                return true;
            }
            this.f21591b = null;
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            AvlNode<E> avlNode = this.f21591b;
            int i2 = TreeMultiset.f21585i;
            Objects.requireNonNull(treeMultiset);
            C17901 c17901 = new C17901(avlNode);
            this.f21592c = c17901;
            AvlNode<E> avlNode2 = this.f21591b.f21609i;
            if (avlNode2 == TreeMultiset.this.f21588h) {
                this.f21591b = null;
            } else {
                this.f21591b = avlNode2;
            }
            return c17901;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21592c != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.mo11376X(this.f21592c.mo11547b(), 0);
            this.f21592c = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4 */
    public static /* synthetic */ class C17934 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21597a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f21597a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21597a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            /* renamed from: a */
            public int mo11939a(AvlNode<?> avlNode) {
                return avlNode.f21602b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            /* renamed from: b */
            public long mo11940b(@NullableDecl AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return avlNode.f21604d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            /* renamed from: a */
            public int mo11939a(AvlNode<?> avlNode) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            /* renamed from: b */
            public long mo11940b(@NullableDecl AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return avlNode.f21603c;
            }
        };

        Aggregate(C17901 c17901) {
        }

        /* renamed from: a */
        public abstract int mo11939a(AvlNode<?> avlNode);

        /* renamed from: b */
        public abstract long mo11940b(@NullableDecl AvlNode<?> avlNode);
    }

    public static final class AvlNode<E> {

        /* renamed from: a */
        @NullableDecl
        public final E f21601a;

        /* renamed from: b */
        public int f21602b;

        /* renamed from: c */
        public int f21603c;

        /* renamed from: d */
        public long f21604d;

        /* renamed from: e */
        public int f21605e;

        /* renamed from: f */
        @NullableDecl
        public AvlNode<E> f21606f;

        /* renamed from: g */
        @NullableDecl
        public AvlNode<E> f21607g;

        /* renamed from: h */
        @NullableDecl
        public AvlNode<E> f21608h;

        /* renamed from: i */
        @NullableDecl
        public AvlNode<E> f21609i;

        public AvlNode(@NullableDecl E e2, int i2) {
            Preconditions.m11178b(i2 > 0);
            this.f21601a = e2;
            this.f21602b = i2;
            this.f21604d = i2;
            this.f21603c = 1;
            this.f21605e = 1;
            this.f21606f = null;
            this.f21607g = null;
        }

        /* renamed from: i */
        public static int m11941i(@NullableDecl AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f21605e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public AvlNode<E> m11942a(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    m11943b(e2, i2);
                    return this;
                }
                int i3 = avlNode.f21605e;
                AvlNode<E> m11942a = avlNode.m11942a(comparator, e2, i2, iArr);
                this.f21606f = m11942a;
                if (iArr[0] == 0) {
                    this.f21603c++;
                }
                this.f21604d += i2;
                return m11942a.f21605e == i3 ? this : m11950j();
            }
            if (compare <= 0) {
                int i4 = this.f21602b;
                iArr[0] = i4;
                long j2 = i2;
                Preconditions.m11178b(((long) i4) + j2 <= ParserMinimalBase.MAX_INT_L);
                this.f21602b += i2;
                this.f21604d += j2;
                return this;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                iArr[0] = 0;
                m11944c(e2, i2);
                return this;
            }
            int i5 = avlNode2.f21605e;
            AvlNode<E> m11942a2 = avlNode2.m11942a(comparator, e2, i2, iArr);
            this.f21607g = m11942a2;
            if (iArr[0] == 0) {
                this.f21603c++;
            }
            this.f21604d += i2;
            return m11942a2.f21605e == i5 ? this : m11950j();
        }

        /* renamed from: b */
        public final AvlNode<E> m11943b(E e2, int i2) {
            AvlNode<E> avlNode = new AvlNode<>(e2, i2);
            this.f21606f = avlNode;
            AvlNode<E> avlNode2 = this.f21608h;
            int i3 = TreeMultiset.f21585i;
            avlNode2.f21609i = avlNode;
            avlNode.f21608h = avlNode2;
            avlNode.f21609i = this;
            this.f21608h = avlNode;
            this.f21605e = Math.max(2, this.f21605e);
            this.f21603c++;
            this.f21604d += i2;
            return this;
        }

        /* renamed from: c */
        public final AvlNode<E> m11944c(E e2, int i2) {
            AvlNode<E> avlNode = new AvlNode<>(e2, i2);
            this.f21607g = avlNode;
            AvlNode<E> avlNode2 = this.f21609i;
            int i3 = TreeMultiset.f21585i;
            this.f21609i = avlNode;
            avlNode.f21608h = this;
            avlNode.f21609i = avlNode2;
            avlNode2.f21608h = avlNode;
            this.f21605e = Math.max(2, this.f21605e);
            this.f21603c++;
            this.f21604d += i2;
            return this;
        }

        /* renamed from: d */
        public final int m11945d() {
            return m11941i(this.f21606f) - m11941i(this.f21607g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        /* renamed from: e */
        public final AvlNode<E> m11946e(Comparator<? super E> comparator, E e2) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                return avlNode == null ? this : (AvlNode) MoreObjects.m11165a(avlNode.m11946e(comparator, e2), this);
            }
            if (compare == 0) {
                return this;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.m11946e(comparator, e2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public int m11947f(Comparator<? super E> comparator, E e2) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.m11947f(comparator, e2);
            }
            if (compare <= 0) {
                return this.f21602b;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                return 0;
            }
            return avlNode2.m11947f(comparator, e2);
        }

        /* renamed from: g */
        public final AvlNode<E> m11948g() {
            int i2 = this.f21602b;
            this.f21602b = 0;
            AvlNode<E> avlNode = this.f21608h;
            AvlNode<E> avlNode2 = this.f21609i;
            int i3 = TreeMultiset.f21585i;
            avlNode.f21609i = avlNode2;
            avlNode2.f21608h = avlNode;
            AvlNode<E> avlNode3 = this.f21606f;
            if (avlNode3 == null) {
                return this.f21607g;
            }
            AvlNode<E> avlNode4 = this.f21607g;
            if (avlNode4 == null) {
                return avlNode3;
            }
            if (avlNode3.f21605e >= avlNode4.f21605e) {
                AvlNode<E> avlNode5 = this.f21608h;
                avlNode5.f21606f = avlNode3.m11954n(avlNode5);
                avlNode5.f21607g = this.f21607g;
                avlNode5.f21603c = this.f21603c - 1;
                avlNode5.f21604d = this.f21604d - i2;
                return avlNode5.m11950j();
            }
            AvlNode<E> avlNode6 = this.f21609i;
            avlNode6.f21607g = avlNode4.m11955o(avlNode6);
            avlNode6.f21606f = this.f21606f;
            avlNode6.f21603c = this.f21603c - 1;
            avlNode6.f21604d = this.f21604d - i2;
            return avlNode6.m11950j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        /* renamed from: h */
        public final AvlNode<E> m11949h(Comparator<? super E> comparator, E e2) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare > 0) {
                AvlNode<E> avlNode = this.f21607g;
                return avlNode == null ? this : (AvlNode) MoreObjects.m11165a(avlNode.m11949h(comparator, e2), this);
            }
            if (compare == 0) {
                return this;
            }
            AvlNode<E> avlNode2 = this.f21606f;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.m11949h(comparator, e2);
        }

        /* renamed from: j */
        public final AvlNode<E> m11950j() {
            int m11945d = m11945d();
            if (m11945d == -2) {
                if (this.f21607g.m11945d() > 0) {
                    this.f21607g = this.f21607g.m11957q();
                }
                return m11956p();
            }
            if (m11945d != 2) {
                m11952l();
                return this;
            }
            if (this.f21606f.m11945d() < 0) {
                this.f21606f = this.f21606f.m11956p();
            }
            return m11957q();
        }

        /* renamed from: k */
        public final void m11951k() {
            AvlNode<E> avlNode = this.f21606f;
            int i2 = TreeMultiset.f21585i;
            int i3 = (avlNode == null ? 0 : avlNode.f21603c) + 1;
            AvlNode<E> avlNode2 = this.f21607g;
            this.f21603c = i3 + (avlNode2 != null ? avlNode2.f21603c : 0);
            this.f21604d = this.f21602b + (avlNode == null ? 0L : avlNode.f21604d) + (avlNode2 != null ? avlNode2.f21604d : 0L);
            m11952l();
        }

        /* renamed from: l */
        public final void m11952l() {
            this.f21605e = Math.max(m11941i(this.f21606f), m11941i(this.f21607g)) + 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m */
        public AvlNode<E> m11953m(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f21606f = avlNode.m11953m(comparator, e2, i2, iArr);
                if (iArr[0] > 0) {
                    if (i2 >= iArr[0]) {
                        this.f21603c--;
                        this.f21604d -= iArr[0];
                    } else {
                        this.f21604d -= i2;
                    }
                }
                return iArr[0] == 0 ? this : m11950j();
            }
            if (compare <= 0) {
                int i3 = this.f21602b;
                iArr[0] = i3;
                if (i2 >= i3) {
                    return m11948g();
                }
                this.f21602b = i3 - i2;
                this.f21604d -= i2;
                return this;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f21607g = avlNode2.m11953m(comparator, e2, i2, iArr);
            if (iArr[0] > 0) {
                if (i2 >= iArr[0]) {
                    this.f21603c--;
                    this.f21604d -= iArr[0];
                } else {
                    this.f21604d -= i2;
                }
            }
            return m11950j();
        }

        /* renamed from: n */
        public final AvlNode<E> m11954n(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                return this.f21606f;
            }
            this.f21607g = avlNode2.m11954n(avlNode);
            this.f21603c--;
            this.f21604d -= avlNode.f21602b;
            return m11950j();
        }

        /* renamed from: o */
        public final AvlNode<E> m11955o(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.f21606f;
            if (avlNode2 == null) {
                return this.f21607g;
            }
            this.f21606f = avlNode2.m11955o(avlNode);
            this.f21603c--;
            this.f21604d -= avlNode.f21602b;
            return m11950j();
        }

        /* renamed from: p */
        public final AvlNode<E> m11956p() {
            Preconditions.m11191o(this.f21607g != null);
            AvlNode<E> avlNode = this.f21607g;
            this.f21607g = avlNode.f21606f;
            avlNode.f21606f = this;
            avlNode.f21604d = this.f21604d;
            avlNode.f21603c = this.f21603c;
            m11951k();
            avlNode.m11952l();
            return avlNode;
        }

        /* renamed from: q */
        public final AvlNode<E> m11957q() {
            Preconditions.m11191o(this.f21606f != null);
            AvlNode<E> avlNode = this.f21606f;
            this.f21606f = avlNode.f21607g;
            avlNode.f21607g = this;
            avlNode.f21604d = this.f21604d;
            avlNode.f21603c = this.f21603c;
            m11951k();
            avlNode.m11952l();
            return avlNode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: r */
        public AvlNode<E> m11958r(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int i3, int[] iArr) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i2 == 0 && i3 > 0) {
                        m11943b(e2, i3);
                    }
                    return this;
                }
                this.f21606f = avlNode.m11958r(comparator, e2, i2, i3, iArr);
                if (iArr[0] == i2) {
                    if (i3 == 0 && iArr[0] != 0) {
                        this.f21603c--;
                    } else if (i3 > 0 && iArr[0] == 0) {
                        this.f21603c++;
                    }
                    this.f21604d += i3 - iArr[0];
                }
                return m11950j();
            }
            if (compare <= 0) {
                int i4 = this.f21602b;
                iArr[0] = i4;
                if (i2 == i4) {
                    if (i3 == 0) {
                        return m11948g();
                    }
                    this.f21604d += i3 - i4;
                    this.f21602b = i3;
                }
                return this;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                iArr[0] = 0;
                if (i2 == 0 && i3 > 0) {
                    m11944c(e2, i3);
                }
                return this;
            }
            this.f21607g = avlNode2.m11958r(comparator, e2, i2, i3, iArr);
            if (iArr[0] == i2) {
                if (i3 == 0 && iArr[0] != 0) {
                    this.f21603c--;
                } else if (i3 > 0 && iArr[0] == 0) {
                    this.f21603c++;
                }
                this.f21604d += i3 - iArr[0];
            }
            return m11950j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: s */
        public AvlNode<E> m11959s(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.f21601a);
            if (compare < 0) {
                AvlNode<E> avlNode = this.f21606f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i2 > 0) {
                        m11943b(e2, i2);
                    }
                    return this;
                }
                this.f21606f = avlNode.m11959s(comparator, e2, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.f21603c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.f21603c++;
                }
                this.f21604d += i2 - iArr[0];
                return m11950j();
            }
            if (compare <= 0) {
                iArr[0] = this.f21602b;
                if (i2 == 0) {
                    return m11948g();
                }
                this.f21604d += i2 - r3;
                this.f21602b = i2;
                return this;
            }
            AvlNode<E> avlNode2 = this.f21607g;
            if (avlNode2 == null) {
                iArr[0] = 0;
                if (i2 > 0) {
                    m11944c(e2, i2);
                }
                return this;
            }
            this.f21607g = avlNode2.m11959s(comparator, e2, i2, iArr);
            if (i2 == 0 && iArr[0] != 0) {
                this.f21603c--;
            } else if (i2 > 0 && iArr[0] == 0) {
                this.f21603c++;
            }
            this.f21604d += i2 - iArr[0];
            return m11950j();
        }

        public String toString() {
            return new Multisets.ImmutableEntry(this.f21601a, this.f21602b).toString();
        }
    }

    public static final class Reference<T> {

        /* renamed from: a */
        @NullableDecl
        public T f21610a;

        /* renamed from: a */
        public void m11960a(@NullableDecl T t, T t2) {
            if (this.f21610a != t) {
                throw new ConcurrentModificationException();
            }
            this.f21610a = t2;
        }
    }

    public TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
        super(generalRange.f20986b);
        this.f21586f = reference;
        this.f21587g = generalRange;
        this.f21588h = avlNode;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: D0 */
    public SortedMultiset<E> mo11527D0(@NullableDecl E e2, BoundType boundType) {
        return new TreeMultiset(this.f21586f, this.f21587g.m11576b(new GeneralRange<>(this.f20850d, true, e2, boundType, false, null, BoundType.OPEN)), this.f21588h);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: X */
    public int mo11376X(@NullableDecl E e2, int i2) {
        CollectPreconditions.m11427b(i2, "count");
        if (!this.f21587g.m11575a(e2)) {
            Preconditions.m11178b(i2 == 0);
            return 0;
        }
        AvlNode<E> avlNode = this.f21586f.f21610a;
        if (avlNode == null) {
            if (i2 > 0) {
                mo11382p(e2, i2);
            }
            return 0;
        }
        int[] iArr = new int[1];
        AvlNode<E> m11959s = avlNode.m11959s(this.f20850d, e2, i2, iArr);
        Reference<AvlNode<E>> reference = this.f21586f;
        if (reference.f21610a != avlNode) {
            throw new ConcurrentModificationException();
        }
        reference.f21610a = m11959s;
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        GeneralRange<E> generalRange = this.f21587g;
        if (generalRange.f20987c || generalRange.f20990f) {
            Iterators.m11707b(new C17912(this));
            return;
        }
        AvlNode<E> avlNode = this.f21588h.f21609i;
        while (true) {
            AvlNode<E> avlNode2 = this.f21588h;
            if (avlNode == avlNode2) {
                avlNode2.f21609i = avlNode2;
                avlNode2.f21608h = avlNode2;
                this.f21586f.f21610a = null;
                return;
            } else {
                AvlNode<E> avlNode3 = avlNode.f21609i;
                avlNode.f21602b = 0;
                avlNode.f21606f = null;
                avlNode.f21607g = null;
                avlNode.f21608h = null;
                avlNode.f21609i = null;
                avlNode = avlNode3;
            }
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: d0 */
    public boolean mo11377d0(@NullableDecl E e2, int i2, int i3) {
        CollectPreconditions.m11427b(i3, "newCount");
        CollectPreconditions.m11427b(i2, "oldCount");
        Preconditions.m11178b(this.f21587g.m11575a(e2));
        AvlNode<E> avlNode = this.f21586f.f21610a;
        if (avlNode == null) {
            if (i2 != 0) {
                return false;
            }
            if (i3 > 0) {
                mo11382p(e2, i3);
            }
            return true;
        }
        int[] iArr = new int[1];
        AvlNode<E> m11958r = avlNode.m11958r(this.f20850d, e2, i2, i3, iArr);
        Reference<AvlNode<E>> reference = this.f21586f;
        if (reference.f21610a != avlNode) {
            throw new ConcurrentModificationException();
        }
        reference.f21610a = m11958r;
        return iArr[0] == i2;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: e */
    public int mo11378e() {
        return Ints.m12084f(m11938u(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: f */
    public Iterator<E> mo11379f() {
        return new Multisets.C17435(new C17912(this));
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: g */
    public Iterator<Multiset.Entry<E>> mo11380g() {
        return new C17912(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return new Multisets.MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: n0 */
    public SortedMultiset<E> mo11529n0(@NullableDecl E e2, BoundType boundType) {
        return new TreeMultiset(this.f21586f, this.f21587g.m11576b(new GeneralRange<>(this.f20850d, false, null, BoundType.OPEN, true, e2, boundType)), this.f21588h);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: o */
    public int mo11381o(@NullableDecl Object obj, int i2) {
        CollectPreconditions.m11427b(i2, "occurrences");
        if (i2 == 0) {
            return mo11383s0(obj);
        }
        AvlNode<E> avlNode = this.f21586f.f21610a;
        int[] iArr = new int[1];
        try {
            if (this.f21587g.m11575a(obj) && avlNode != null) {
                AvlNode<E> m11953m = avlNode.m11953m(this.f20850d, obj, i2, iArr);
                Reference<AvlNode<E>> reference = this.f21586f;
                if (reference.f21610a != avlNode) {
                    throw new ConcurrentModificationException();
                }
                reference.f21610a = m11953m;
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: p */
    public int mo11382p(@NullableDecl E e2, int i2) {
        CollectPreconditions.m11427b(i2, "occurrences");
        if (i2 == 0) {
            return mo11383s0(e2);
        }
        Preconditions.m11178b(this.f21587g.m11575a(e2));
        AvlNode<E> avlNode = this.f21586f.f21610a;
        if (avlNode != null) {
            int[] iArr = new int[1];
            AvlNode<E> m11942a = avlNode.m11942a(this.f20850d, e2, i2, iArr);
            Reference<AvlNode<E>> reference = this.f21586f;
            if (reference.f21610a != avlNode) {
                throw new ConcurrentModificationException();
            }
            reference.f21610a = m11942a;
            return iArr[0];
        }
        this.f20850d.compare(e2, e2);
        AvlNode<E> avlNode2 = new AvlNode<>(e2, i2);
        AvlNode<E> avlNode3 = this.f21588h;
        avlNode3.f21609i = avlNode2;
        avlNode2.f21608h = avlNode3;
        avlNode2.f21609i = avlNode3;
        avlNode3.f21608h = avlNode2;
        this.f21586f.m11960a(avlNode, avlNode2);
        return 0;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    /* renamed from: r */
    public Iterator<Multiset.Entry<E>> mo11401r() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3

            /* renamed from: b */
            public AvlNode<E> f21594b;

            /* renamed from: c */
            public Multiset.Entry<E> f21595c;

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            
                if (r6.f21587g.m11575a(r0.f21601a) != false) goto L21;
             */
            {
                /*
                    r5 = this;
                    com.google.common.collect.TreeMultiset.this = r6
                    r5.<init>()
                    com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r6.f21586f
                    T r0 = r0.f21610a
                    com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
                    r1 = 0
                    if (r0 != 0) goto Lf
                    goto L47
                Lf:
                    com.google.common.collect.GeneralRange<E> r2 = r6.f21587g
                    boolean r3 = r2.f20990f
                    if (r3 == 0) goto L35
                    T r2 = r2.f20991g
                    java.util.Comparator<? super E> r3 = r6.f20850d
                    com.google.common.collect.TreeMultiset$AvlNode r0 = r0.m11949h(r3, r2)
                    if (r0 != 0) goto L20
                    goto L47
                L20:
                    com.google.common.collect.GeneralRange<E> r3 = r6.f21587g
                    com.google.common.collect.BoundType r3 = r3.f20992h
                    com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
                    if (r3 != r4) goto L39
                    java.util.Comparator<? super E> r3 = r6.f20850d
                    E r4 = r0.f21601a
                    int r2 = r3.compare(r2, r4)
                    if (r2 != 0) goto L39
                    com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.f21608h
                    goto L39
                L35:
                    com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r6.f21588h
                    com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.f21608h
                L39:
                    com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.f21588h
                    if (r0 == r2) goto L47
                    com.google.common.collect.GeneralRange<E> r6 = r6.f21587g
                    E r2 = r0.f21601a
                    boolean r6 = r6.m11575a(r2)
                    if (r6 != 0) goto L48
                L47:
                    r0 = r1
                L48:
                    r5.f21594b = r0
                    r5.f21595c = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.C17923.<init>(com.google.common.collect.TreeMultiset):void");
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                AvlNode<E> avlNode = this.f21594b;
                if (avlNode == null) {
                    return false;
                }
                if (!TreeMultiset.this.f21587g.m11578d(avlNode.f21601a)) {
                    return true;
                }
                this.f21594b = null;
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                TreeMultiset treeMultiset = TreeMultiset.this;
                AvlNode<E> avlNode = this.f21594b;
                int i2 = TreeMultiset.f21585i;
                Objects.requireNonNull(treeMultiset);
                C17901 c17901 = new C17901(avlNode);
                this.f21595c = c17901;
                AvlNode<E> avlNode2 = this.f21594b.f21608h;
                if (avlNode2 == TreeMultiset.this.f21588h) {
                    this.f21594b = null;
                } else {
                    this.f21594b = avlNode2;
                }
                return c17901;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.m11192p(this.f21595c != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.mo11376X(this.f21595c.mo11547b(), 0);
                this.f21595c = null;
            }
        };
    }

    /* renamed from: s */
    public final long m11936s(Aggregate aggregate, @NullableDecl AvlNode<E> avlNode) {
        if (avlNode == null) {
            return 0L;
        }
        int compare = this.f20850d.compare(this.f21587g.f20991g, avlNode.f21601a);
        if (compare > 0) {
            return m11936s(aggregate, avlNode.f21607g);
        }
        if (compare != 0) {
            return m11936s(aggregate, avlNode.f21606f) + aggregate.mo11940b(avlNode.f21607g) + aggregate.mo11939a(avlNode);
        }
        int ordinal = this.f21587g.f20992h.ordinal();
        if (ordinal == 0) {
            return aggregate.mo11939a(avlNode) + aggregate.mo11940b(avlNode.f21607g);
        }
        if (ordinal == 1) {
            return aggregate.mo11940b(avlNode.f21607g);
        }
        throw new AssertionError();
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(@NullableDecl Object obj) {
        try {
            AvlNode<E> avlNode = this.f21586f.f21610a;
            if (this.f21587g.m11575a(obj) && avlNode != null) {
                return avlNode.m11947f(this.f20850d, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.m12084f(m11938u(Aggregate.SIZE));
    }

    /* renamed from: t */
    public final long m11937t(Aggregate aggregate, @NullableDecl AvlNode<E> avlNode) {
        if (avlNode == null) {
            return 0L;
        }
        int compare = this.f20850d.compare(this.f21587g.f20988d, avlNode.f21601a);
        if (compare < 0) {
            return m11937t(aggregate, avlNode.f21606f);
        }
        if (compare != 0) {
            return m11937t(aggregate, avlNode.f21607g) + aggregate.mo11940b(avlNode.f21606f) + aggregate.mo11939a(avlNode);
        }
        int ordinal = this.f21587g.f20989e.ordinal();
        if (ordinal == 0) {
            return aggregate.mo11939a(avlNode) + aggregate.mo11940b(avlNode.f21606f);
        }
        if (ordinal == 1) {
            return aggregate.mo11940b(avlNode.f21606f);
        }
        throw new AssertionError();
    }

    /* renamed from: u */
    public final long m11938u(Aggregate aggregate) {
        AvlNode<E> avlNode = this.f21586f.f21610a;
        long mo11940b = aggregate.mo11940b(avlNode);
        if (this.f21587g.f20987c) {
            mo11940b -= m11937t(aggregate, avlNode);
        }
        return this.f21587g.f20990f ? mo11940b - m11936s(aggregate, avlNode) : mo11940b;
    }
}
