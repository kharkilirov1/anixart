package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgf implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
