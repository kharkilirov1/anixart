package androidx.collection;

/* loaded from: classes.dex */
public final class CircularIntArray {
    public CircularIntArray() {
        int[] iArr = new int[Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8];
    }
}
