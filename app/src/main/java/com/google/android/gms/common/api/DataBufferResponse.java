package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) this.f15371b).close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    @NonNull
    public final T get(int i2) {
        return (T) ((AbstractDataBuffer) this.f15371b).get(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) this.f15371b).getCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) this.f15371b).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        Objects.requireNonNull((AbstractDataBuffer) this.f15371b);
    }
}
