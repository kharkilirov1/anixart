package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public class ExecutionError extends Error {
    public ExecutionError() {
    }

    public ExecutionError(@NullableDecl Error error) {
        super(error);
    }
}
