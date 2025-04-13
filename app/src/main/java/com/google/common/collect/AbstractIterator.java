package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: b */
    public State f20787b = State.NOT_READY;

    /* renamed from: c */
    @NullableDecl
    public T f20788c;

    /* renamed from: com.google.common.collect.AbstractIterator$1 */
    public static /* synthetic */ class C16151 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20789a;

        static {
            int[] iArr = new int[State.values().length];
            f20789a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20789a[0] = 2;
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
    public abstract T mo11332a();

    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T m11333b() {
        this.f20787b = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        State state = this.f20787b;
        State state2 = State.FAILED;
        Preconditions.m11191o(state != state2);
        int ordinal = this.f20787b.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.f20787b = state2;
        this.f20788c = mo11332a();
        if (this.f20787b == State.DONE) {
            return false;
        }
        this.f20787b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20787b = State.NOT_READY;
        T t = this.f20788c;
        this.f20788c = null;
        return t;
    }
}
