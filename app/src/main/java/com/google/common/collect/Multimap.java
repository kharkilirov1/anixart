package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public interface Multimap<K, V> {
    /* renamed from: E */
    Map<K, Collection<V>> mo11334E();

    /* renamed from: F */
    boolean mo11385F(@NullableDecl @CompatibleWith Object obj, @NullableDecl @CompatibleWith Object obj2);

    @CanIgnoreReturnValue
    /* renamed from: a */
    Collection<V> mo11335a(@NullableDecl @CompatibleWith Object obj);

    /* renamed from: b */
    Collection<Map.Entry<K, V>> mo11345b();

    void clear();

    boolean containsKey(@NullableDecl @CompatibleWith Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith Object obj);

    boolean equals(@NullableDecl Object obj);

    Collection<V> get(@NullableDecl K k2);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k2, @NullableDecl V v);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith Object obj, @NullableDecl @CompatibleWith Object obj2);

    int size();

    Collection<V> values();
}
