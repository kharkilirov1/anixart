package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Random.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/random/Random;", "", "Default", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class Random {

    /* renamed from: b */
    @NotNull
    public static final Default f63365b = new Default(null);

    /* renamed from: c */
    @NotNull
    public static final Random f63366c = PlatformImplementationsKt.f63254a.mo32131b();

    /* compiled from: Random.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0006R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Default extends Random implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Serialized implements Serializable {
        }

        public Default() {
        }

        @Override // kotlin.random.Random
        /* renamed from: a */
        public int mo32225a(int i2) {
            return Random.f63366c.mo32225a(i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public int mo32226b() {
            return Random.f63366c.mo32226b();
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public int mo32227c(int i2) {
            return Random.f63366c.mo32227c(i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: d */
        public int mo32229d(int i2, int i3) {
            return Random.f63366c.mo32229d(i2, i3);
        }

        public Default(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: a */
    public abstract int mo32225a(int i2);

    /* renamed from: b */
    public int mo32226b() {
        return mo32225a(32);
    }

    /* renamed from: c */
    public int mo32227c(int i2) {
        return mo32229d(0, i2);
    }

    /* renamed from: d */
    public int mo32229d(int i2, int i3) {
        int mo32226b;
        int i4;
        int i5;
        int mo32226b2;
        if (!(i3 > i2)) {
            Integer from = Integer.valueOf(i2);
            Integer until = Integer.valueOf(i3);
            Intrinsics.m32179h(from, "from");
            Intrinsics.m32179h(until, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + from + ", " + until + ").").toString());
        }
        int i6 = i3 - i2;
        if (i6 <= 0 && i6 != Integer.MIN_VALUE) {
            do {
                mo32226b2 = mo32226b();
            } while (!(i2 <= mo32226b2 && mo32226b2 < i3));
            return mo32226b2;
        }
        if (((-i6) & i6) == i6) {
            i5 = mo32225a(31 - Integer.numberOfLeadingZeros(i6));
        } else {
            do {
                mo32226b = mo32226b() >>> 1;
                i4 = mo32226b % i6;
            } while ((i6 - 1) + (mo32226b - i4) < 0);
            i5 = i4;
        }
        return i2 + i5;
    }
}
