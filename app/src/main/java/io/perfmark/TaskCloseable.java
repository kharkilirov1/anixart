package io.perfmark;

import java.io.Closeable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class TaskCloseable implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Objects.requireNonNull(PerfMark.f59566a);
    }
}
