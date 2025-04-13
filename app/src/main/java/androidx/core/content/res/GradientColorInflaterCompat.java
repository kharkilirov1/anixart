package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
final class GradientColorInflaterCompat {

    public static final class ColorStops {

        /* renamed from: a */
        public final int[] f3337a;

        /* renamed from: b */
        public final float[] f3338b;

        public ColorStops(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f3337a = new int[size];
            this.f3338b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f3337a[i2] = list.get(i2).intValue();
                this.f3338b[i2] = list2.get(i2).floatValue();
            }
        }

        public ColorStops(@ColorInt int i2, @ColorInt int i3) {
            this.f3337a = new int[]{i2, i3};
            this.f3338b = new float[]{0.0f, 1.0f};
        }

        public ColorStops(@ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
            this.f3337a = new int[]{i2, i3, i4};
            this.f3338b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
