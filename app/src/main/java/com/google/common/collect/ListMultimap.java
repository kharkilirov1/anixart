package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    List<V> mo11335a(@NullableDecl Object obj);

    @Override // com.google.common.collect.Multimap
    List<V> get(@NullableDecl K k2);
}
