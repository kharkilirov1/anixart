package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public RemovalNotification(@NullableDecl K k2, @NullableDecl V v, RemovalCause removalCause) {
        super(k2, v);
        Objects.requireNonNull(removalCause);
    }
}
