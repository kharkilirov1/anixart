package com.swiftsoft.anixartd.utils.p016ui.snowfall;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Randomizer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/Randomizer;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Randomizer {

    /* renamed from: a */
    @NotNull
    public final Random f30558a = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public final double m16472a(int i2) {
        return this.f30558a.nextDouble() * (i2 + 1);
    }

    /* renamed from: b */
    public final double m16473b() {
        double nextGaussian = this.f30558a.nextGaussian() / 3;
        return (nextGaussian <= -1.0d || nextGaussian >= 1.0d) ? m16473b() : nextGaussian;
    }

    /* renamed from: c */
    public final int m16474c(int i2, int i3, boolean z) {
        return (z ? (int) (Math.abs(m16473b()) * (r4 + 1)) : this.f30558a.nextInt((i3 - i2) + 1)) + i2;
    }
}
