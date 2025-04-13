package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {

    /* renamed from: com.google.common.base.Optional$1 */
    class C15651 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            new AbstractIterator<Object>(this) { // from class: com.google.common.base.Optional.1.1
                {
                    throw null;
                }

                @Override // com.google.common.base.AbstractIterator
                /* renamed from: a */
                public Object mo11120a() {
                    throw null;
                }
            };
            throw null;
        }
    }

    /* renamed from: a */
    public static <T> Optional<T> m11174a() {
        return Absent.f20463b;
    }

    /* renamed from: b */
    public static <T> Optional<T> m11175b(@NullableDecl T t) {
        return t == null ? Absent.f20463b : new Present(t);
    }

    /* renamed from: d */
    public static <T> Optional<T> m11176d(T t) {
        java.util.Objects.requireNonNull(t);
        return new Present(t);
    }

    /* renamed from: c */
    public abstract boolean mo11117c();

    /* renamed from: e */
    public abstract T mo11118e(T t);

    @NullableDecl
    /* renamed from: f */
    public abstract T mo11119f();
}
