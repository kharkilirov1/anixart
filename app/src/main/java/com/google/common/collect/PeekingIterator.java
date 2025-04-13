package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Iterator;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public interface PeekingIterator<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    E next();

    E peek();
}
