package androidx.collection;

/* loaded from: classes.dex */
public final class CircularArray<E> {

    /* renamed from: a */
    public E[] f1810a;

    public CircularArray() {
        this.f1810a = (E[]) new Object[Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8];
    }
}
