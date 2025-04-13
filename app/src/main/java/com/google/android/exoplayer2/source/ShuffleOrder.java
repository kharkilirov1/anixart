package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface ShuffleOrder {

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* renamed from: a */
        public final int f12529a;

        public UnshuffledShuffleOrder(int i2) {
            this.f12529a = i2;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: a */
        public ShuffleOrder mo6909a(int i2, int i3) {
            return new UnshuffledShuffleOrder((this.f12529a - i3) + i2);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: b */
        public int mo6910b() {
            return this.f12529a > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: c */
        public int mo6911c(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: d */
        public int mo6912d(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.f12529a) {
                return i3;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: e */
        public ShuffleOrder mo6913e(int i2, int i3) {
            return new UnshuffledShuffleOrder(this.f12529a + i3);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: f */
        public int mo6914f() {
            int i2 = this.f12529a;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: g */
        public ShuffleOrder mo6915g() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.f12529a;
        }
    }

    /* renamed from: a */
    ShuffleOrder mo6909a(int i2, int i3);

    /* renamed from: b */
    int mo6910b();

    /* renamed from: c */
    int mo6911c(int i2);

    /* renamed from: d */
    int mo6912d(int i2);

    /* renamed from: e */
    ShuffleOrder mo6913e(int i2, int i3);

    /* renamed from: f */
    int mo6914f();

    /* renamed from: g */
    ShuffleOrder mo6915g();

    int getLength();

    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* renamed from: a */
        public final Random f12526a;

        /* renamed from: b */
        public final int[] f12527b;

        /* renamed from: c */
        public final int[] f12528c;

        public DefaultShuffleOrder(int[] iArr, Random random) {
            this.f12527b = iArr;
            this.f12526a = random;
            this.f12528c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f12528c[iArr[i2]] = i2;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: a */
        public ShuffleOrder mo6909a(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.f12527b.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f12527b;
                if (i5 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.f12526a.nextLong()));
                }
                if (iArr2[i5] < i2 || iArr2[i5] >= i3) {
                    iArr[i5 - i6] = iArr2[i5] >= i2 ? iArr2[i5] - i4 : iArr2[i5];
                } else {
                    i6++;
                }
                i5++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: b */
        public int mo6910b() {
            int[] iArr = this.f12527b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: c */
        public int mo6911c(int i2) {
            int i3 = this.f12528c[i2] - 1;
            if (i3 >= 0) {
                return this.f12527b[i3];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: d */
        public int mo6912d(int i2) {
            int i3 = this.f12528c[i2] + 1;
            int[] iArr = this.f12527b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: e */
        public ShuffleOrder mo6913e(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.f12526a.nextInt(this.f12527b.length + 1);
                int i6 = i5 + 1;
                int nextInt = this.f12526a.nextInt(i6);
                iArr2[i5] = iArr2[nextInt];
                iArr2[nextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f12527b.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f12527b;
                if (i4 >= iArr4.length + i3) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.f12526a.nextLong()));
                }
                if (i7 >= i3 || i8 != iArr[i7]) {
                    int i9 = i8 + 1;
                    iArr3[i4] = iArr4[i8];
                    if (iArr3[i4] >= i2) {
                        iArr3[i4] = iArr3[i4] + i3;
                    }
                    i8 = i9;
                } else {
                    iArr3[i4] = iArr2[i7];
                    i7++;
                }
                i4++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: f */
        public int mo6914f() {
            int[] iArr = this.f12527b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        /* renamed from: g */
        public ShuffleOrder mo6915g() {
            return new DefaultShuffleOrder(0, new Random(this.f12526a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.f12527b.length;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DefaultShuffleOrder(int r6, java.util.Random r7) {
            /*
                r5 = this;
                int[] r0 = new int[r6]
                r1 = 0
            L3:
                if (r1 >= r6) goto L13
                int r2 = r1 + 1
                int r3 = r7.nextInt(r2)
                r4 = r0[r3]
                r0[r1] = r4
                r0[r3] = r1
                r1 = r2
                goto L3
            L13:
                r5.<init>(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ShuffleOrder.DefaultShuffleOrder.<init>(int, java.util.Random):void");
        }
    }
}
