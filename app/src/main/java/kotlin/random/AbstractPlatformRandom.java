package kotlin.random;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformRandom.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class AbstractPlatformRandom extends Random {
    @Override // kotlin.random.Random
    /* renamed from: a */
    public int mo32225a(int i2) {
        return ((-i2) >> 31) & (mo32228e().nextInt() >>> (32 - i2));
    }

    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo32226b() {
        return mo32228e().nextInt();
    }

    @Override // kotlin.random.Random
    /* renamed from: c */
    public int mo32227c(int i2) {
        return mo32228e().nextInt(i2);
    }

    @NotNull
    /* renamed from: e */
    public abstract java.util.Random mo32228e();
}
