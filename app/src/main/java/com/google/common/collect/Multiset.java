package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        /* renamed from: b */
        E mo11547b();

        int getCount();
    }

    @CanIgnoreReturnValue
    /* renamed from: X */
    int mo11376X(E e2, int i2);

    boolean contains(@NullableDecl Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    @CanIgnoreReturnValue
    /* renamed from: d0 */
    boolean mo11377d0(E e2, int i2, int i3);

    Set<Entry<E>> entrySet();

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    Iterator<E> iterator();

    /* renamed from: l */
    Set<E> mo11389l();

    @CanIgnoreReturnValue
    /* renamed from: o */
    int mo11381o(@NullableDecl @CompatibleWith Object obj, int i2);

    @CanIgnoreReturnValue
    /* renamed from: p */
    int mo11382p(@NullableDecl E e2, int i2);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl Object obj);

    /* renamed from: s0 */
    int mo11383s0(@NullableDecl @CompatibleWith Object obj);

    int size();
}
