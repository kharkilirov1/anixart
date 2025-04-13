package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: SlidingWindow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* renamed from: c */
    @NotNull
    public final Object[] f63153c;

    /* renamed from: d */
    public final int f63154d;

    /* renamed from: e */
    public int f63155e;

    /* renamed from: f */
    public int f63156f;

    public RingBuffer(@NotNull Object[] objArr, int i2) {
        this.f63153c = objArr;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("ring buffer filled size should not be negative but it is ", i2).toString());
        }
        if (i2 <= objArr.length) {
            this.f63154d = objArr.length;
            this.f63156f = i2;
        } else {
            StringBuilder m25v = C0000a.m25v("ring buffer filled size: ", i2, " cannot be larger than the buffer size: ");
            m25v.append(objArr.length);
            throw new IllegalArgumentException(m25v.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public int getF63156f() {
        return this.f63156f;
    }

    /* renamed from: d */
    public final void m32073d(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("n shouldn't be negative but it is ", i2).toString());
        }
        if (!(i2 <= getF63156f())) {
            StringBuilder m25v = C0000a.m25v("n shouldn't be greater than the buffer size: n = ", i2, ", size = ");
            m25v.append(getF63156f());
            throw new IllegalArgumentException(m25v.toString().toString());
        }
        if (i2 > 0) {
            int i3 = this.f63155e;
            int i4 = this.f63154d;
            int i5 = (i3 + i2) % i4;
            if (i3 > i5) {
                ArraysKt.m31973w(this.f63153c, null, i3, i4);
                ArraysKt.m31973w(this.f63153c, null, 0, i5);
            } else {
                ArraysKt.m31973w(this.f63153c, null, i3, i5);
            }
            this.f63155e = i5;
            this.f63156f = getF63156f() - i2;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i2) {
        AbstractList.f63114b.m31905a(i2, getF63156f());
        return (T) this.f63153c[(this.f63155e + i2) % this.f63154d];
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1

            /* renamed from: d */
            public int f63157d;

            /* renamed from: e */
            public int f63158e;

            /* renamed from: f */
            public final /* synthetic */ RingBuffer<T> f63159f;

            {
                this.f63159f = this;
                this.f63157d = this.f63156f;
                this.f63158e = this.f63155e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            /* renamed from: a */
            public void mo16754a() {
                if (this.f63157d == 0) {
                    this.f63112b = State.Done;
                    return;
                }
                m31904c(this.f63159f.f63153c[this.f63158e]);
                this.f63158e = (this.f63158e + 1) % this.f63159f.f63154d;
                this.f63157d--;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[getF63156f()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.m32179h(array, "array");
        if (array.length < getF63156f()) {
            array = (T[]) Arrays.copyOf(array, getF63156f());
            Intrinsics.m32178g(array, "copyOf(this, newSize)");
        }
        int f63156f = getF63156f();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = this.f63155e; i3 < f63156f && i4 < this.f63154d; i4++) {
            array[i3] = this.f63153c[i4];
            i3++;
        }
        while (i3 < f63156f) {
            array[i3] = this.f63153c[i2];
            i3++;
            i2++;
        }
        if (array.length > getF63156f()) {
            array[getF63156f()] = null;
        }
        return array;
    }
}
