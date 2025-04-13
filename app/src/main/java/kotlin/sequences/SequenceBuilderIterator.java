package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SequenceBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m31884d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    /* renamed from: b */
    public int f66709b;

    /* renamed from: c */
    @Nullable
    public T f66710c;

    /* renamed from: d */
    @Nullable
    public Iterator<? extends T> f66711d;

    /* renamed from: e */
    @Nullable
    public Continuation<? super Unit> f66712e;

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    /* renamed from: a */
    public Object mo33827a(T t, @NotNull Continuation<? super Unit> continuation) {
        this.f66710c = t;
        this.f66709b = 3;
        this.f66712e = continuation;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    /* renamed from: b */
    public Object mo33828b(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> frame) {
        if (!it.hasNext()) {
            return Unit.f63088a;
        }
        this.f66711d = it;
        this.f66709b = 2;
        this.f66712e = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Intrinsics.m32179h(frame, "frame");
        return coroutineSingletons;
    }

    /* renamed from: f */
    public final Throwable m33829f() {
        int i2 = this.f66709b;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder m24u = C0000a.m24u("Unexpected state of the iterator: ");
        m24u.append(this.f66709b);
        return new IllegalStateException(m24u.toString());
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext getF66944f() {
        return EmptyCoroutineContext.f63224b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i2 = this.f66709b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw m33829f();
                }
                Iterator<? extends T> it = this.f66711d;
                Intrinsics.m32176e(it);
                if (it.hasNext()) {
                    this.f66709b = 2;
                    return true;
                }
                this.f66711d = null;
            }
            this.f66709b = 5;
            Continuation<? super Unit> continuation = this.f66712e;
            Intrinsics.m32176e(continuation);
            this.f66712e = null;
            continuation.mo31877j(Unit.f63088a);
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        this.f66709b = 4;
    }

    @Override // java.util.Iterator
    public T next() {
        int i2 = this.f66709b;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f66709b = 1;
            Iterator<? extends T> it = this.f66711d;
            Intrinsics.m32176e(it);
            return it.next();
        }
        if (i2 != 3) {
            throw m33829f();
        }
        this.f66709b = 0;
        T t = this.f66710c;
        this.f66710c = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
