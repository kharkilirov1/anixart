package kotlin.ranges;

import com.yandex.mobile.ads.C4632R;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"kotlin/ranges/RangesKt__RangesKt", "kotlin/ranges/RangesKt___RangesKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class RangesKt extends RangesKt___RangesKt {
    /* renamed from: a */
    public static float m32234a(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    /* renamed from: b */
    public static long m32235b(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    /* renamed from: c */
    public static float m32236c(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    /* renamed from: d */
    public static long m32237d(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    /* renamed from: e */
    public static float m32238e(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    /* renamed from: f */
    public static int m32239f(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    @NotNull
    /* renamed from: g */
    public static IntProgression m32240g(int i2, int i3) {
        return new IntProgression(i2, i3, -1);
    }

    @SinceKotlin
    /* renamed from: h */
    public static int m32241h(@NotNull IntRange intRange, @NotNull Random random) {
        try {
            return RandomKt.m32230a(random, intRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @NotNull
    /* renamed from: i */
    public static IntProgression m32242i(@NotNull IntProgression intProgression, int i2) {
        Intrinsics.m32179h(intProgression, "<this>");
        boolean z = i2 > 0;
        Integer step = Integer.valueOf(i2);
        Intrinsics.m32179h(step, "step");
        if (z) {
            int i3 = intProgression.f63380b;
            int i4 = intProgression.f63381c;
            if (intProgression.f63382d <= 0) {
                i2 = -i2;
            }
            return new IntProgression(i3, i4, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @NotNull
    /* renamed from: j */
    public static IntRange m32243j(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new IntRange(i2, i3 - 1);
        }
        IntRange.Companion companion = IntRange.f63387e;
        return IntRange.f63388f;
    }
}
