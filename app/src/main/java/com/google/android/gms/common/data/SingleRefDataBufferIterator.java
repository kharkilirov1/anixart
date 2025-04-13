package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: d */
    public T f15636d;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(C0576a.m4111j(46, "Cannot advance the iterator beyond ", this.f15624c));
        }
        int i2 = this.f15624c + 1;
        this.f15624c = i2;
        if (i2 == 0) {
            T t = this.f15623b.get(0);
            Objects.requireNonNull(t, "null reference");
            this.f15636d = t;
            if (t instanceof DataBufferRef) {
                return t;
            }
            String valueOf = String.valueOf(t.getClass());
            throw new IllegalStateException(C0000a.m21r(new StringBuilder(valueOf.length() + 44), "DataBuffer reference of type ", valueOf, " is not movable"));
        }
        T t2 = this.f15636d;
        Objects.requireNonNull(t2, "null reference");
        DataBufferRef dataBufferRef = (DataBufferRef) t2;
        int i3 = this.f15624c;
        if (i3 >= 0) {
            throw null;
        }
        Preconditions.m8133h(false);
        dataBufferRef.f15625a = i3;
        throw null;
    }
}
