package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
/* loaded from: classes.dex */
public interface Supplier<T> {
    @CanIgnoreReturnValue
    T get();
}
