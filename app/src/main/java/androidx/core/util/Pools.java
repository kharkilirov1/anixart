package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        /* renamed from: a */
        boolean mo2026a(@NonNull T t);

        @Nullable
        /* renamed from: b */
        T mo2027b();
    }

    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a */
        public final Object[] f3554a;

        /* renamed from: b */
        public int f3555b;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3554a = new Object[i2];
        }

        @Override // androidx.core.util.Pools.Pool
        /* renamed from: a */
        public boolean mo2026a(@NonNull T t) {
            int i2;
            boolean z;
            int i3 = 0;
            while (true) {
                i2 = this.f3555b;
                if (i3 >= i2) {
                    z = false;
                    break;
                }
                if (this.f3554a[i3] == t) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            }
            Object[] objArr = this.f3554a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.f3555b = i2 + 1;
            return true;
        }

        @Override // androidx.core.util.Pools.Pool
        /* renamed from: b */
        public T mo2027b() {
            int i2 = this.f3555b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f3554a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f3555b = i2 - 1;
            return t;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: c */
        public final Object f3556c;

        public SynchronizedPool(int i2) {
            super(i2);
            this.f3556c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        /* renamed from: a */
        public boolean mo2026a(@NonNull T t) {
            boolean mo2026a;
            synchronized (this.f3556c) {
                mo2026a = super.mo2026a(t);
            }
            return mo2026a;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        /* renamed from: b */
        public T mo2027b() {
            T t;
            synchronized (this.f3556c) {
                t = (T) super.mo2027b();
            }
            return t;
        }
    }
}
