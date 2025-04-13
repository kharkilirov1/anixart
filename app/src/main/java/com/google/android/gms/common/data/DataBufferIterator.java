package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: b */
    @NonNull
    public final DataBuffer<T> f15623b;

    /* renamed from: c */
    public int f15624c = -1;

    public DataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        this.f15623b = dataBuffer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15624c < this.f15623b.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(C0576a.m4111j(46, "Cannot advance the iterator beyond ", this.f15624c));
        }
        DataBuffer<T> dataBuffer = this.f15623b;
        int i2 = this.f15624c + 1;
        this.f15624c = i2;
        return dataBuffer.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
