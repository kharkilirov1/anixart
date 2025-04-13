package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformRandom.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class KotlinRandom extends java.util.Random {

    /* renamed from: b */
    public boolean f63364b;

    /* compiled from: PlatformRandom.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // java.util.Random
    public int next(int i2) {
        throw null;
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        throw null;
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bytes) {
        Intrinsics.m32179h(bytes, "bytes");
        throw null;
    }

    @Override // java.util.Random
    public double nextDouble() {
        throw null;
    }

    @Override // java.util.Random
    public float nextFloat() {
        throw null;
    }

    @Override // java.util.Random
    public int nextInt() {
        throw null;
    }

    @Override // java.util.Random
    public long nextLong() {
        throw null;
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (this.f63364b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f63364b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i2) {
        throw null;
    }
}
