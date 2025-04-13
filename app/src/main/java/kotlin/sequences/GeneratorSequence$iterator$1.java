package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class GeneratorSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @Nullable
    public T f66699b;

    /* renamed from: c */
    public int f66700c = -2;

    /* renamed from: d */
    public final /* synthetic */ GeneratorSequence<T> f66701d;

    public GeneratorSequence$iterator$1(GeneratorSequence<T> generatorSequence) {
        this.f66701d = generatorSequence;
    }

    /* renamed from: a */
    public final void m33826a() {
        T invoke;
        if (this.f66700c == -2) {
            invoke = this.f66701d.f66697a.invoke();
        } else {
            Function1<T, T> function1 = this.f66701d.f66698b;
            T t = this.f66699b;
            Intrinsics.m32176e(t);
            invoke = function1.invoke(t);
        }
        this.f66699b = invoke;
        this.f66700c = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f66700c < 0) {
            m33826a();
        }
        return this.f66700c == 1;
    }

    @Override // java.util.Iterator
    @NotNull
    public T next() {
        if (this.f66700c < 0) {
            m33826a();
        }
        if (this.f66700c == 0) {
            throw new NoSuchElementException();
        }
        T t = this.f66699b;
        Intrinsics.m32177f(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f66700c = -1;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
