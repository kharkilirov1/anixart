package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: b */
    @NullableDecl
    public T f20849b;

    public AbstractSequentialIterator(@NullableDecl T t) {
        this.f20849b = t;
    }

    @NullableDecl
    /* renamed from: a */
    public abstract T mo11273a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20849b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t = this.f20849b;
            this.f20849b = mo11273a(t);
            return t;
        } catch (Throwable th) {
            this.f20849b = mo11273a(this.f20849b);
            throw th;
        }
    }
}
