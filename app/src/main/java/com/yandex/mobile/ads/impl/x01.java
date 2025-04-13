package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public interface x01 {

    /* renamed from: com.yandex.mobile.ads.impl.x01$a */
    public static class C6001a implements x01 {

        /* renamed from: a */
        private final Random f56316a;

        /* renamed from: b */
        private final int[] f56317b;

        /* renamed from: c */
        private final int[] f56318c;

        public C6001a() {
            this(new Random());
        }

        /* renamed from: a */
        private static int[] m29622a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: a */
        public final int mo29614a() {
            return this.f56317b.length;
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: b */
        public final int mo29616b() {
            int[] iArr = this.f56317b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: c */
        public final int mo29618c() {
            int[] iArr = this.f56317b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: d */
        public final int mo29620d(int i2) {
            int i3 = this.f56318c[i2] - 1;
            if (i3 >= 0) {
                return this.f56317b[i3];
            }
            return -1;
        }

        private C6001a(Random random) {
            this(m29622a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: a */
        public final int mo29615a(int i2) {
            int i3 = this.f56318c[i2] + 1;
            int[] iArr = this.f56317b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: b */
        public final C6001a mo29617b(int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f56316a.nextInt(this.f56317b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f56316a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + 0;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f56317b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f56317b;
                if (i3 >= iArr4.length + i2) {
                    return new C6001a(iArr3, new Random(this.f56316a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= 0) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: c */
        public final C6001a mo29619c(int i2) {
            int i3 = i2 + 0;
            int[] iArr = new int[this.f56317b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f56317b;
                if (i4 >= iArr2.length) {
                    return new C6001a(iArr, new Random(this.f56316a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < 0 || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        private C6001a(int[] iArr, Random random) {
            this.f56317b = iArr;
            this.f56316a = random;
            this.f56318c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f56318c[iArr[i2]] = i2;
            }
        }

        @Override // com.yandex.mobile.ads.impl.x01
        /* renamed from: d */
        public final C6001a mo29621d() {
            return new C6001a(new int[0], new Random(this.f56316a.nextLong()));
        }
    }

    /* renamed from: a */
    int mo29614a();

    /* renamed from: a */
    int mo29615a(int i2);

    /* renamed from: b */
    int mo29616b();

    /* renamed from: b */
    C6001a mo29617b(int i2);

    /* renamed from: c */
    int mo29618c();

    /* renamed from: c */
    C6001a mo29619c(int i2);

    /* renamed from: d */
    int mo29620d(int i2);

    /* renamed from: d */
    C6001a mo29621d();
}
