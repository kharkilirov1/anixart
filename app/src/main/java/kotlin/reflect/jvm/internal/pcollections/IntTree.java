package kotlin.reflect.jvm.internal.pcollections;

/* loaded from: classes3.dex */
final class IntTree<V> {

    /* renamed from: f */
    public static final IntTree<Object> f66528f = new IntTree<>();

    /* renamed from: a */
    public final long f66529a;

    /* renamed from: b */
    public final V f66530b;

    /* renamed from: c */
    public final IntTree<V> f66531c;

    /* renamed from: d */
    public final IntTree<V> f66532d;

    /* renamed from: e */
    public final int f66533e;

    public IntTree() {
        this.f66533e = 0;
        this.f66529a = 0L;
        this.f66530b = null;
        this.f66531c = null;
        this.f66532d = null;
    }

    /* renamed from: a */
    public V m33793a(long j2) {
        if (this.f66533e == 0) {
            return null;
        }
        long j3 = this.f66529a;
        return j2 < j3 ? this.f66531c.m33793a(j2 - j3) : j2 > j3 ? this.f66532d.m33793a(j2 - j3) : this.f66530b;
    }

    /* renamed from: b */
    public IntTree<V> m33794b(long j2, V v) {
        if (this.f66533e == 0) {
            return new IntTree<>(j2, v, this, this);
        }
        long j3 = this.f66529a;
        return j2 < j3 ? m33795c(this.f66531c.m33794b(j2 - j3, v), this.f66532d) : j2 > j3 ? m33795c(this.f66531c, this.f66532d.m33794b(j2 - j3, v)) : v == this.f66530b ? this : new IntTree<>(j2, v, this.f66531c, this.f66532d);
    }

    /* renamed from: c */
    public final IntTree<V> m33795c(IntTree<V> intTree, IntTree<V> intTree2) {
        if (intTree == this.f66531c && intTree2 == this.f66532d) {
            return this;
        }
        long j2 = this.f66529a;
        V v = this.f66530b;
        int i2 = intTree.f66533e;
        int i3 = intTree2.f66533e;
        if (i2 + i3 > 1) {
            if (i2 >= i3 * 5) {
                IntTree<V> intTree3 = intTree.f66531c;
                IntTree<V> intTree4 = intTree.f66532d;
                if (intTree4.f66533e < intTree3.f66533e * 2) {
                    long j3 = intTree.f66529a;
                    return new IntTree<>(j3 + j2, intTree.f66530b, intTree3, new IntTree(-j3, v, intTree4.m33796d(intTree4.f66529a + j3), intTree2));
                }
                IntTree<V> intTree5 = intTree4.f66531c;
                IntTree<V> intTree6 = intTree4.f66532d;
                long j4 = intTree4.f66529a;
                long j5 = intTree.f66529a + j4 + j2;
                V v2 = intTree4.f66530b;
                IntTree intTree7 = new IntTree(-j4, intTree.f66530b, intTree3, intTree5.m33796d(intTree5.f66529a + j4));
                long j6 = intTree.f66529a;
                long j7 = intTree4.f66529a;
                return new IntTree<>(j5, v2, intTree7, new IntTree((-j6) - j7, v, intTree6.m33796d(intTree6.f66529a + j7 + j6), intTree2));
            }
            if (i3 >= i2 * 5) {
                IntTree<V> intTree8 = intTree2.f66531c;
                IntTree<V> intTree9 = intTree2.f66532d;
                if (intTree8.f66533e < intTree9.f66533e * 2) {
                    long j8 = intTree2.f66529a;
                    return new IntTree<>(j8 + j2, intTree2.f66530b, new IntTree(-j8, v, intTree, intTree8.m33796d(intTree8.f66529a + j8)), intTree9);
                }
                IntTree<V> intTree10 = intTree8.f66531c;
                IntTree<V> intTree11 = intTree8.f66532d;
                long j9 = intTree8.f66529a;
                long j10 = intTree2.f66529a;
                long j11 = j9 + j10 + j2;
                V v3 = intTree8.f66530b;
                IntTree intTree12 = new IntTree((-j10) - j9, v, intTree, intTree10.m33796d(intTree10.f66529a + j9 + j10));
                long j12 = intTree8.f66529a;
                return new IntTree<>(j11, v3, intTree12, new IntTree(-j12, intTree2.f66530b, intTree11.m33796d(intTree11.f66529a + j12), intTree9));
            }
        }
        return new IntTree<>(j2, v, intTree, intTree2);
    }

    /* renamed from: d */
    public final IntTree<V> m33796d(long j2) {
        return (this.f66533e == 0 || j2 == this.f66529a) ? this : new IntTree<>(j2, this.f66530b, this.f66531c, this.f66532d);
    }

    public IntTree(long j2, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        this.f66529a = j2;
        this.f66530b = v;
        this.f66531c = intTree;
        this.f66532d = intTree2;
        this.f66533e = intTree.f66533e + 1 + intTree2.f66533e;
    }
}
