package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: b */
    public State f20464b = State.NOT_READY;

    /* renamed from: c */
    @NullableDecl
    public T f20465c;

    /* renamed from: com.google.common.base.AbstractIterator$1 */
    public static /* synthetic */ class C15491 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20466a;

        static {
            int[] iArr = new int[State.values().length];
            f20466a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20466a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo11120a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.f20464b;
        State state2 = State.FAILED;
        Preconditions.m11191o(state != state2);
        int ordinal = this.f20464b.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.f20464b = state2;
        this.f20465c = mo11120a();
        if (this.f20464b == State.DONE) {
            return false;
        }
        this.f20464b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20464b = State.NOT_READY;
        T t = this.f20465c;
        this.f20465c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
