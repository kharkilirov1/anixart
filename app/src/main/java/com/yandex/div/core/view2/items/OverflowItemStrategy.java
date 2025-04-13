package com.yandex.div.core.view2.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OverflowItemStrategy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "", "Clamp", "Companion", "Ring", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class OverflowItemStrategy {

    /* renamed from: a */
    public final int f32930a;

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Clamp extends OverflowItemStrategy {

        /* renamed from: b */
        public final int f32931b;

        /* renamed from: c */
        public final int f32932c;

        public Clamp(int i2, int i3) {
            super(i3, null);
            this.f32931b = i2;
            this.f32932c = i3;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        /* renamed from: a */
        public int mo17129a() {
            if (this.f32930a <= 0) {
                return -1;
            }
            return Math.min(this.f32931b + 1, this.f32932c - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        /* renamed from: b */
        public int mo17130b() {
            if (this.f32930a <= 0) {
                return -1;
            }
            return Math.max(0, this.f32931b - 1);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Ring extends OverflowItemStrategy {

        /* renamed from: b */
        public final int f32933b;

        /* renamed from: c */
        public final int f32934c;

        public Ring(int i2, int i3) {
            super(i3, null);
            this.f32933b = i2;
            this.f32934c = i3;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        /* renamed from: a */
        public int mo17129a() {
            if (this.f32930a <= 0) {
                return -1;
            }
            return (this.f32933b + 1) % this.f32934c;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        /* renamed from: b */
        public int mo17130b() {
            if (this.f32930a <= 0) {
                return -1;
            }
            int i2 = this.f32934c;
            return ((this.f32933b - 1) + i2) % i2;
        }
    }

    public OverflowItemStrategy(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f32930a = i2;
    }

    /* renamed from: a */
    public abstract int mo17129a();

    /* renamed from: b */
    public abstract int mo17130b();
}
