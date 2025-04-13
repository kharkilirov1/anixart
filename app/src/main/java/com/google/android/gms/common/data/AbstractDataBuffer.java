package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int i2);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return 0;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }
}
