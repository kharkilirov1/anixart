package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DiffUtil {

    /* renamed from: a */
    public static final Comparator<Diagonal> f5244a = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f5247a - diagonal2.f5247a;
        }
    };

    public static abstract class Callback {
        /* renamed from: a */
        public abstract boolean mo3437a(int i2, int i3);

        /* renamed from: b */
        public abstract boolean mo3438b(int i2, int i3);

        @Nullable
        /* renamed from: c */
        public Object mo3492c(int i2, int i3) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo3439d();

        /* renamed from: e */
        public abstract int mo3440e();
    }

    public static class CenteredArray {

        /* renamed from: a */
        public final int[] f5245a;

        /* renamed from: b */
        public final int f5246b;

        public CenteredArray(int i2) {
            int[] iArr = new int[i2];
            this.f5245a = iArr;
            this.f5246b = iArr.length / 2;
        }

        /* renamed from: a */
        public int m3538a(int i2) {
            return this.f5245a[i2 + this.f5246b];
        }

        /* renamed from: b */
        public void m3539b(int i2, int i3) {
            this.f5245a[i2 + this.f5246b] = i3;
        }
    }

    public static class Diagonal {

        /* renamed from: a */
        public final int f5247a;

        /* renamed from: b */
        public final int f5248b;

        /* renamed from: c */
        public final int f5249c;

        public Diagonal(int i2, int i3, int i4) {
            this.f5247a = i2;
            this.f5248b = i3;
            this.f5249c = i4;
        }
    }

    public static class DiffResult {

        /* renamed from: a */
        public final List<Diagonal> f5250a;

        /* renamed from: b */
        public final int[] f5251b;

        /* renamed from: c */
        public final int[] f5252c;

        /* renamed from: d */
        public final Callback f5253d;

        /* renamed from: e */
        public final int f5254e;

        /* renamed from: f */
        public final int f5255f;

        /* renamed from: g */
        public final boolean f5256g;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z) {
            int i2;
            Diagonal diagonal;
            int i3;
            this.f5250a = list;
            this.f5251b = iArr;
            this.f5252c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5253d = callback;
            int mo3440e = callback.mo3440e();
            this.f5254e = mo3440e;
            int mo3439d = callback.mo3439d();
            this.f5255f = mo3439d;
            this.f5256g = z;
            Diagonal diagonal2 = list.isEmpty() ? null : list.get(0);
            if (diagonal2 == null || diagonal2.f5247a != 0 || diagonal2.f5248b != 0) {
                list.add(0, new Diagonal(0, 0, 0));
            }
            list.add(new Diagonal(mo3440e, mo3439d, 0));
            for (Diagonal diagonal3 : list) {
                for (int i4 = 0; i4 < diagonal3.f5249c; i4++) {
                    int i5 = diagonal3.f5247a + i4;
                    int i6 = diagonal3.f5248b + i4;
                    int i7 = this.f5253d.mo3437a(i5, i6) ? 1 : 2;
                    this.f5251b[i5] = (i6 << 4) | i7;
                    this.f5252c[i6] = (i5 << 4) | i7;
                }
            }
            if (this.f5256g) {
                int i8 = 0;
                for (Diagonal diagonal4 : this.f5250a) {
                    while (true) {
                        i2 = diagonal4.f5247a;
                        if (i8 < i2) {
                            if (this.f5251b[i8] == 0) {
                                int size = this.f5250a.size();
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < size) {
                                        diagonal = this.f5250a.get(i9);
                                        while (true) {
                                            i3 = diagonal.f5248b;
                                            if (i10 < i3) {
                                                if (this.f5252c[i10] == 0 && this.f5253d.mo3438b(i8, i10)) {
                                                    int i11 = this.f5253d.mo3437a(i8, i10) ? 8 : 4;
                                                    this.f5251b[i8] = (i10 << 4) | i11;
                                                    this.f5252c[i10] = i11 | (i8 << 4);
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                    i10 = diagonal.f5249c + i3;
                                    i9++;
                                }
                            }
                            i8++;
                        }
                    }
                    i8 = diagonal4.f5249c + i2;
                }
            }
        }

        @Nullable
        /* renamed from: b */
        public static PostponedUpdate m3540b(Collection<PostponedUpdate> collection, int i2, boolean z) {
            PostponedUpdate postponedUpdate;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = it.next();
                if (postponedUpdate.f5257a == i2 && postponedUpdate.f5259c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next = it.next();
                if (z) {
                    next.f5258b--;
                } else {
                    next.f5258b++;
                }
            }
            return postponedUpdate;
        }

        /* renamed from: a */
        public void m3541a(@NonNull ListUpdateCallback listUpdateCallback) {
            int i2;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i3 = this.f5254e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.f5254e;
            int i5 = this.f5255f;
            for (int size = this.f5250a.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.f5250a.get(size);
                int i6 = diagonal.f5247a;
                int i7 = diagonal.f5249c;
                int i8 = i6 + i7;
                int i9 = diagonal.f5248b + i7;
                while (true) {
                    if (i4 <= i8) {
                        break;
                    }
                    i4--;
                    int i10 = this.f5251b[i4];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        PostponedUpdate m3540b = m3540b(arrayDeque, i11, false);
                        if (m3540b != null) {
                            int i12 = (i3 - m3540b.f5258b) - 1;
                            batchingListUpdateCallback.mo3488a(i4, i12);
                            if ((i10 & 4) != 0) {
                                batchingListUpdateCallback.mo3491d(i12, 1, this.f5253d.mo3492c(i4, i11));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.mo3490c(i4, 1);
                        i3--;
                    }
                }
                while (i5 > i9) {
                    i5--;
                    int i13 = this.f5252c[i5];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        PostponedUpdate m3540b2 = m3540b(arrayDeque, i14, true);
                        if (m3540b2 == null) {
                            arrayDeque.add(new PostponedUpdate(i5, i3 - i4, false));
                        } else {
                            batchingListUpdateCallback.mo3488a((i3 - m3540b2.f5258b) - 1, i4);
                            if ((i13 & 4) != 0) {
                                batchingListUpdateCallback.mo3491d(i4, 1, this.f5253d.mo3492c(i14, i5));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.mo3489b(i4, 1);
                        i3++;
                    }
                }
                int i15 = diagonal.f5247a;
                int i16 = diagonal.f5248b;
                for (i2 = 0; i2 < diagonal.f5249c; i2++) {
                    if ((this.f5251b[i15] & 15) == 2) {
                        batchingListUpdateCallback.mo3491d(i15, 1, this.f5253d.mo3492c(i15, i16));
                    }
                    i15++;
                    i16++;
                }
                i4 = diagonal.f5247a;
                i5 = diagonal.f5248b;
            }
            batchingListUpdateCallback.m3493e();
        }
    }

    public static abstract class ItemCallback<T> {
        /* renamed from: a */
        public abstract boolean mo3542a(@NonNull T t, @NonNull T t2);

        /* renamed from: b */
        public abstract boolean mo3543b(@NonNull T t, @NonNull T t2);

        @Nullable
        /* renamed from: c */
        public Object mo3544c(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    public static class PostponedUpdate {

        /* renamed from: a */
        public int f5257a;

        /* renamed from: b */
        public int f5258b;

        /* renamed from: c */
        public boolean f5259c;

        public PostponedUpdate(int i2, int i3, boolean z) {
            this.f5257a = i2;
            this.f5258b = i3;
            this.f5259c = z;
        }
    }

    public static class Range {

        /* renamed from: a */
        public int f5260a;

        /* renamed from: b */
        public int f5261b;

        /* renamed from: c */
        public int f5262c;

        /* renamed from: d */
        public int f5263d;

        public Range() {
        }

        /* renamed from: a */
        public int m3545a() {
            return this.f5263d - this.f5262c;
        }

        /* renamed from: b */
        public int m3546b() {
            return this.f5261b - this.f5260a;
        }

        public Range(int i2, int i3, int i4, int i5) {
            this.f5260a = i2;
            this.f5261b = i3;
            this.f5262c = i4;
            this.f5263d = i5;
        }
    }

    public static class Snake {

        /* renamed from: a */
        public int f5264a;

        /* renamed from: b */
        public int f5265b;

        /* renamed from: c */
        public int f5266c;

        /* renamed from: d */
        public int f5267d;

        /* renamed from: e */
        public boolean f5268e;

        /* renamed from: a */
        public int m3547a() {
            return Math.min(this.f5266c - this.f5264a, this.f5267d - this.f5265b);
        }
    }

    @NonNull
    /* renamed from: a */
    public static DiffResult m3537a(@NonNull Callback callback) {
        ArrayList arrayList;
        Range range;
        Snake snake;
        ArrayList arrayList2;
        Range range2;
        Range range3;
        Diagonal diagonal;
        int i2;
        Snake snake2;
        Snake snake3;
        int m3538a;
        int i3;
        int i4;
        int m3538a2;
        int i5;
        int i6;
        boolean z;
        int mo3440e = callback.mo3440e();
        int mo3439d = callback.mo3439d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new Range(0, mo3440e, 0, mo3439d));
        int i7 = mo3440e + mo3439d;
        int i8 = 1;
        int i9 = (((i7 + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i9);
        CenteredArray centeredArray2 = new CenteredArray(i9);
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            Range range4 = (Range) arrayList4.remove(arrayList4.size() - i8);
            if (range4.m3546b() >= i8 && range4.m3545a() >= i8) {
                int m3546b = ((range4.m3546b() + range4.m3545a()) + i8) / 2;
                centeredArray.m3539b(i8, range4.f5260a);
                centeredArray2.m3539b(i8, range4.f5261b);
                int i10 = 0;
                while (i10 < m3546b) {
                    boolean z2 = Math.abs(range4.m3546b() - range4.m3545a()) % 2 == i8;
                    int m3546b2 = range4.m3546b() - range4.m3545a();
                    int i11 = -i10;
                    int i12 = i11;
                    while (true) {
                        if (i12 > i10) {
                            arrayList = arrayList4;
                            i2 = m3546b;
                            snake2 = null;
                            break;
                        }
                        if (i12 == i11 || (i12 != i10 && centeredArray.m3538a(i12 + 1) > centeredArray.m3538a(i12 - 1))) {
                            m3538a2 = centeredArray.m3538a(i12 + 1);
                            i5 = m3538a2;
                        } else {
                            m3538a2 = centeredArray.m3538a(i12 - 1);
                            i5 = m3538a2 + 1;
                        }
                        i2 = m3546b;
                        int i13 = ((i5 - range4.f5260a) + range4.f5262c) - i12;
                        if (i10 == 0 || i5 != m3538a2) {
                            arrayList = arrayList4;
                            i6 = i13;
                        } else {
                            i6 = i13 - 1;
                            arrayList = arrayList4;
                        }
                        while (i5 < range4.f5261b && i13 < range4.f5263d && callback.mo3438b(i5, i13)) {
                            i5++;
                            i13++;
                        }
                        centeredArray.m3539b(i12, i5);
                        if (z2) {
                            int i14 = m3546b2 - i12;
                            z = z2;
                            if (i14 >= i11 + 1 && i14 <= i10 - 1 && centeredArray2.m3538a(i14) <= i5) {
                                snake2 = new Snake();
                                snake2.f5264a = m3538a2;
                                snake2.f5265b = i6;
                                snake2.f5266c = i5;
                                snake2.f5267d = i13;
                                snake2.f5268e = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i12 += 2;
                        m3546b = i2;
                        arrayList4 = arrayList;
                        z2 = z;
                    }
                    if (snake2 != null) {
                        snake = snake2;
                        range = range4;
                        break;
                    }
                    boolean z3 = (range4.m3546b() - range4.m3545a()) % 2 == 0;
                    int m3546b3 = range4.m3546b() - range4.m3545a();
                    int i15 = i11;
                    while (true) {
                        if (i15 > i10) {
                            range = range4;
                            snake3 = null;
                            break;
                        }
                        if (i15 == i11 || (i15 != i10 && centeredArray2.m3538a(i15 + 1) < centeredArray2.m3538a(i15 - 1))) {
                            m3538a = centeredArray2.m3538a(i15 + 1);
                            i3 = m3538a;
                        } else {
                            m3538a = centeredArray2.m3538a(i15 - 1);
                            i3 = m3538a - 1;
                        }
                        int i16 = range4.f5263d - ((range4.f5261b - i3) - i15);
                        int i17 = (i10 == 0 || i3 != m3538a) ? i16 : i16 + 1;
                        while (i3 > range4.f5260a && i16 > range4.f5262c) {
                            int i18 = i3 - 1;
                            range = range4;
                            int i19 = i16 - 1;
                            if (!callback.mo3438b(i18, i19)) {
                                break;
                            }
                            i3 = i18;
                            i16 = i19;
                            range4 = range;
                        }
                        range = range4;
                        centeredArray2.m3539b(i15, i3);
                        if (z3 && (i4 = m3546b3 - i15) >= i11 && i4 <= i10 && centeredArray.m3538a(i4) >= i3) {
                            snake3 = new Snake();
                            snake3.f5264a = i3;
                            snake3.f5265b = i16;
                            snake3.f5266c = m3538a;
                            snake3.f5267d = i17;
                            snake3.f5268e = true;
                            break;
                        }
                        i15 += 2;
                        range4 = range;
                    }
                    if (snake3 != null) {
                        snake = snake3;
                        break;
                    }
                    i10++;
                    m3546b = i2;
                    arrayList4 = arrayList;
                    range4 = range;
                    i8 = 1;
                }
            }
            arrayList = arrayList4;
            range = range4;
            snake = null;
            if (snake != null) {
                if (snake.m3547a() > 0) {
                    int i20 = snake.f5267d;
                    int i21 = snake.f5265b;
                    int i22 = i20 - i21;
                    int i23 = snake.f5266c;
                    int i24 = snake.f5264a;
                    int i25 = i23 - i24;
                    if (!(i22 != i25)) {
                        diagonal = new Diagonal(i24, i21, i25);
                    } else if (snake.f5268e) {
                        diagonal = new Diagonal(i24, i21, snake.m3547a());
                    } else {
                        diagonal = i22 > i25 ? new Diagonal(i24, i21 + 1, snake.m3547a()) : new Diagonal(i24 + 1, i21, snake.m3547a());
                    }
                    arrayList3.add(diagonal);
                }
                if (arrayList5.isEmpty()) {
                    range2 = new Range();
                    range3 = range;
                } else {
                    range2 = (Range) arrayList5.remove(arrayList5.size() - 1);
                    range3 = range;
                }
                range2.f5260a = range3.f5260a;
                range2.f5262c = range3.f5262c;
                range2.f5261b = snake.f5264a;
                range2.f5263d = snake.f5265b;
                arrayList2 = arrayList;
                arrayList2.add(range2);
                range3.f5261b = range3.f5261b;
                range3.f5263d = range3.f5263d;
                range3.f5260a = snake.f5266c;
                range3.f5262c = snake.f5267d;
                arrayList2.add(range3);
            } else {
                arrayList2 = arrayList;
                arrayList5.add(range);
            }
            arrayList4 = arrayList2;
            i8 = 1;
        }
        Collections.sort(arrayList3, f5244a);
        return new DiffResult(callback, arrayList3, centeredArray.f5245a, centeredArray2.f5245a, true);
    }
}
