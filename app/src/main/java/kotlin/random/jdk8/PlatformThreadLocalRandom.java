package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformThreadLocalRandom.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "kotlin-stdlib-jdk8"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.Random
    /* renamed from: d */
    public int mo32229d(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    /* renamed from: e */
    public Random mo32228e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.m32178g(current, "current()");
        return current;
    }
}
