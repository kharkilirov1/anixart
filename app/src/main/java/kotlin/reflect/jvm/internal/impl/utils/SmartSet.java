package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: SmartSet.kt */
/* loaded from: classes3.dex */
public final class SmartSet<T> extends AbstractSet<T> {

    /* renamed from: d */
    public static final Companion f66512d = new Companion(null);

    /* renamed from: b */
    public Object f66513b;

    /* renamed from: c */
    public int f66514c;

    /* compiled from: SmartSet.kt */
    public static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {

        /* renamed from: b */
        public final Iterator<T> f66515b;

        public ArrayIterator(@NotNull T[] tArr) {
            this.f66515b = ArrayIteratorKt.m32154a(tArr);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66515b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f66515b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final <T> SmartSet<T> m33786a() {
            return new SmartSet<>(null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {

        /* renamed from: b */
        public boolean f66516b = true;

        /* renamed from: c */
        public final T f66517c;

        public SingletonIterator(T t) {
            this.f66517c = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66516b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f66516b) {
                throw new NoSuchElementException();
            }
            this.f66516b = false;
            return this.f66517c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public SmartSet() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        int i2 = this.f66514c;
        if (i2 == 0) {
            this.f66513b = t;
        } else if (i2 == 1) {
            if (Intrinsics.m32174c(this.f66513b, t)) {
                return false;
            }
            this.f66513b = new Object[]{this.f66513b, t};
        } else if (i2 < 5) {
            Object obj = this.f66513b;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Object[] objArr2 = (Object[]) obj;
            if (ArraysKt.m31963m(objArr2, t)) {
                return false;
            }
            int i3 = this.f66514c;
            if (i3 == 4) {
                LinkedHashSet m32074a = SetsKt.m32074a(Arrays.copyOf(objArr2, objArr2.length));
                m32074a.add(t);
                objArr = m32074a;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, i3 + 1);
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.f66513b = objArr;
        } else {
            Object obj2 = this.f66513b;
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            }
            if (!TypeIntrinsics.m32214c(obj2).add(t)) {
                return false;
            }
        }
        this.f66514c++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f66513b = null;
        this.f66514c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i2 = this.f66514c;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return Intrinsics.m32174c(this.f66513b, obj);
        }
        if (i2 < 5) {
            Object obj2 = this.f66513b;
            if (obj2 != null) {
                return ArraysKt.m31963m((Object[]) obj2, obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.f66513b;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        int i2 = this.f66514c;
        if (i2 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i2 == 1) {
            return new SingletonIterator(this.f66513b);
        }
        if (i2 < 5) {
            Object obj = this.f66513b;
            if (obj != null) {
                return new ArrayIterator((Object[]) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.f66513b;
        if (obj2 != null) {
            return TypeIntrinsics.m32214c(obj2).iterator();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f66514c;
    }

    public SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
