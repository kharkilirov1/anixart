package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: UByteArray.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m31884d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "Iterator", "storage", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: classes3.dex */
public final class UByteArray implements Collection<UByte>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final byte[] f63072b;

    /* compiled from: UByteArray.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m31884d2 = {"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {

        /* renamed from: b */
        @NotNull
        public final byte[] f63073b;

        /* renamed from: c */
        public int f63074c;

        public Iterator(@NotNull byte[] array) {
            Intrinsics.m32179h(array, "array");
            this.f63073b = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63074c < this.f63073b.length;
        }

        @Override // java.util.Iterator
        public UByte next() {
            int i2 = this.f63074c;
            byte[] bArr = this.f63073b;
            if (i2 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f63074c));
            }
            this.f63074c = i2 + 1;
            return new UByte(bArr[i2]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UByteArray(byte[] bArr) {
        this.f63072b = bArr;
    }

    @NotNull
    /* renamed from: a */
    public static java.util.Iterator<UByte> m31894a(byte[] bArr) {
        return new Iterator(null);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof UByte)) {
            return false;
        }
        return ArraysKt.m31959i(this.f63072b, ((UByte) obj).f63071b);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        byte[] bArr = this.f63072b;
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!((obj instanceof UByte) && ArraysKt.m31959i(bArr, ((UByte) obj).f63071b))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.m32174c(this.f63072b, ((UByteArray) obj).f63072b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f63072b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f63072b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public java.util.Iterator<UByte> iterator() {
        return new Iterator(this.f63072b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public int size() {
        return this.f63072b.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m32168a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.m32179h(array, "array");
        return (T[]) CollectionToArray.m32169b(this, array);
    }

    public String toString() {
        byte[] bArr = this.f63072b;
        StringBuilder m24u = C0000a.m24u("UByteArray(storage=");
        m24u.append(Arrays.toString(bArr));
        m24u.append(')');
        return m24u.toString();
    }
}
