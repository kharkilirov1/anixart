package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: XorWowRandom.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class XorWowRandom extends Random implements Serializable {

    /* renamed from: d */
    public int f63367d;

    /* renamed from: e */
    public int f63368e;

    /* renamed from: f */
    public int f63369f;

    /* renamed from: g */
    public int f63370g;

    /* renamed from: h */
    public int f63371h;

    /* renamed from: i */
    public int f63372i;

    /* compiled from: XorWowRandom.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // kotlin.random.Random
    /* renamed from: a */
    public int mo32225a(int i2) {
        return ((-i2) >> 31) & (mo32226b() >>> (32 - i2));
    }

    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo32226b() {
        int i2 = this.f63367d;
        int i3 = i2 ^ (i2 >>> 2);
        this.f63367d = this.f63368e;
        this.f63368e = this.f63369f;
        this.f63369f = this.f63370g;
        int i4 = this.f63371h;
        this.f63370g = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.f63371h = i5;
        int i6 = this.f63372i + 362437;
        this.f63372i = i6;
        return i5 + i6;
    }
}
