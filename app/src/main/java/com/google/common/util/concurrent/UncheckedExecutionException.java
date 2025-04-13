package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public class UncheckedExecutionException extends RuntimeException {
    public UncheckedExecutionException() {
    }

    public UncheckedExecutionException(@NullableDecl Throwable th) {
        super(th);
    }
}
