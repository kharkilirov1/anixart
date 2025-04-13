package com.airbnb.epoxy;

import androidx.collection.LongSparseArray;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class BoundViewHolders implements Iterable<EpoxyViewHolder> {

    /* renamed from: b */
    public final LongSparseArray<EpoxyViewHolder> f6869b = new LongSparseArray<>(10);

    public class HolderIterator implements Iterator<EpoxyViewHolder> {

        /* renamed from: b */
        public int f6870b = 0;

        public HolderIterator(C06991 c06991) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6870b < BoundViewHolders.this.f6869b.m1100o();
        }

        @Override // java.util.Iterator
        public EpoxyViewHolder next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            LongSparseArray<EpoxyViewHolder> longSparseArray = BoundViewHolders.this.f6869b;
            int i2 = this.f6870b;
            this.f6870b = i2 + 1;
            return longSparseArray.m1101p(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<EpoxyViewHolder> iterator() {
        return new HolderIterator(null);
    }
}
