package androidx.constraintlayout.core;

/* loaded from: classes.dex */
final class Pools {

    public interface Pool<T> {
        /* renamed from: a */
        boolean mo1196a(T t);

        /* renamed from: b */
        T mo1197b();

        /* renamed from: c */
        void mo1198c(T[] tArr, int i2);
    }

    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a */
        public final Object[] f1921a;

        /* renamed from: b */
        public int f1922b;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1921a = new Object[i2];
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        /* renamed from: a */
        public boolean mo1196a(T t) {
            int i2 = this.f1922b;
            Object[] objArr = this.f1921a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.f1922b = i2 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        /* renamed from: b */
        public T mo1197b() {
            int i2 = this.f1922b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f1921a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f1922b = i2 - 1;
            return t;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        /* renamed from: c */
        public void mo1198c(T[] tArr, int i2) {
            if (i2 > tArr.length) {
                i2 = tArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                T t = tArr[i3];
                int i4 = this.f1922b;
                Object[] objArr = this.f1921a;
                if (i4 < objArr.length) {
                    objArr[i4] = t;
                    this.f1922b = i4 + 1;
                }
            }
        }
    }
}
