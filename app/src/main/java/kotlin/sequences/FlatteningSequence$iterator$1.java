package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FlatteningSequence$iterator$1<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f66694b;

    /* renamed from: c */
    @Nullable
    public Iterator<? extends E> f66695c;

    /* renamed from: d */
    public final /* synthetic */ FlatteningSequence<T, R, E> f66696d;

    public FlatteningSequence$iterator$1(FlatteningSequence<T, R, E> flatteningSequence) {
        this.f66696d = flatteningSequence;
        this.f66694b = flatteningSequence.f66691a.iterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return true;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33825a() {
        /*
            r5 = this;
            java.util.Iterator<? extends E> r0 = r5.f66695c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            r0 = 0
            r5.f66695c = r0
        L14:
            java.util.Iterator<? extends E> r0 = r5.f66695c
            if (r0 != 0) goto L3f
            java.util.Iterator<T> r0 = r5.f66694b
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            return r2
        L21:
            java.util.Iterator<T> r0 = r5.f66694b
            java.lang.Object r0 = r0.next()
            kotlin.sequences.FlatteningSequence<T, R, E> r3 = r5.f66696d
            kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> r4 = r3.f66693c
            kotlin.jvm.functions.Function1<T, R> r3 = r3.f66692b
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Object r0 = r4.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L14
            r5.f66695c = r0
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.FlatteningSequence$iterator$1.m33825a():boolean");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m33825a();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!m33825a()) {
            throw new NoSuchElementException();
        }
        Iterator<? extends E> it = this.f66695c;
        Intrinsics.m32176e(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
