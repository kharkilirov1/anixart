package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        @NullableDecl
        /* renamed from: a */
        C mo11418a();

        @NullableDecl
        /* renamed from: b */
        R mo11419b();

        @NullableDecl
        V getValue();
    }

    /* renamed from: d */
    Set<Cell<R, C, V>> mo11409d();

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    int size();

    /* renamed from: t */
    Map<R, Map<C, V>> mo11417t();
}
