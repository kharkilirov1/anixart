package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    Set<V> mo11335a(@NullableDecl Object obj);

    @Override // com.google.common.collect.Multimap
    /* renamed from: b */
    Set<Map.Entry<K, V>> mo11345b();

    @Override // com.google.common.collect.Multimap
    Set<V> get(@NullableDecl K k2);
}
