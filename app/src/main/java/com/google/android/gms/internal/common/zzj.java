package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zzj<T> implements Iterator<T> {

    /* renamed from: b */
    @CheckForNull
    public T f16251b;

    /* renamed from: c */
    public int f16252c = 2;

    @CheckForNull
    /* renamed from: a */
    public abstract T mo8560a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f16252c;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f16252c = 4;
            this.f16251b = mo8560a();
            if (this.f16252c != 3) {
                this.f16252c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16252c = 2;
        T t = this.f16251b;
        this.f16251b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
