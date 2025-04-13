package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadSafeHeap.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    @NotNull
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    @Nullable
    public T[] f68313a;

    @PublishedApi
    /* renamed from: a */
    public final void m34339a(@NotNull T t) {
        t.mo34052a(this);
        T[] tArr = this.f68313a;
        if (tArr == null) {
            tArr = (T[]) new ThreadSafeHeapNode[4];
            this.f68313a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            Intrinsics.m32178g(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((ThreadSafeHeapNode[]) copyOf);
            this.f68313a = tArr;
        }
        int i2 = this._size;
        this._size = i2 + 1;
        tArr[i2] = t;
        t.mo34054e(i2);
        m34345g(i2);
    }

    @PublishedApi
    @Nullable
    /* renamed from: b */
    public final T m34340b() {
        T[] tArr = this.f68313a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final boolean m34341c() {
        return this._size == 0;
    }

    /* renamed from: d */
    public final boolean m34342d(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.mo34053b() == null) {
                z = false;
            } else {
                m34343e(t.mo34055h());
                z = true;
            }
        }
        return z;
    }

    @PublishedApi
    @NotNull
    /* renamed from: e */
    public final T m34343e(int i2) {
        T[] tArr = this.f68313a;
        Intrinsics.m32176e(tArr);
        this._size--;
        if (i2 < this._size) {
            m34346h(i2, this._size);
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t = tArr[i2];
                Intrinsics.m32176e(t);
                T t2 = tArr[i3];
                Intrinsics.m32176e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m34346h(i2, i3);
                    m34345g(i3);
                }
            }
            while (true) {
                int i4 = (i2 * 2) + 1;
                if (i4 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f68313a;
                Intrinsics.m32176e(tArr2);
                int i5 = i4 + 1;
                if (i5 < this._size) {
                    T t3 = tArr2[i5];
                    Intrinsics.m32176e(t3);
                    T t4 = tArr2[i4];
                    Intrinsics.m32176e(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i4 = i5;
                    }
                }
                T t5 = tArr2[i2];
                Intrinsics.m32176e(t5);
                T t6 = tArr2[i4];
                Intrinsics.m32176e(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                m34346h(i2, i4);
                i2 = i4;
            }
        }
        T t7 = tArr[this._size];
        Intrinsics.m32176e(t7);
        t7.mo34052a(null);
        t7.mo34054e(-1);
        tArr[this._size] = null;
        return t7;
    }

    @Nullable
    /* renamed from: f */
    public final T m34344f() {
        T m34343e;
        synchronized (this) {
            m34343e = this._size > 0 ? m34343e(0) : null;
        }
        return m34343e;
    }

    /* renamed from: g */
    public final void m34345g(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f68313a;
            Intrinsics.m32176e(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            Intrinsics.m32176e(t);
            T t2 = tArr[i2];
            Intrinsics.m32176e(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m34346h(i2, i3);
            i2 = i3;
        }
    }

    /* renamed from: h */
    public final void m34346h(int i2, int i3) {
        T[] tArr = this.f68313a;
        Intrinsics.m32176e(tArr);
        T t = tArr[i3];
        Intrinsics.m32176e(t);
        T t2 = tArr[i2];
        Intrinsics.m32176e(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.mo34054e(i2);
        t2.mo34054e(i3);
    }
}
