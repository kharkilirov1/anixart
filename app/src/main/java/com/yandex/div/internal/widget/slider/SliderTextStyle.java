package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SliderTextStyle.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class SliderTextStyle {

    /* renamed from: a */
    public final float f34095a;

    /* renamed from: b */
    @NotNull
    public final Typeface f34096b;

    /* renamed from: c */
    public final float f34097c;

    /* renamed from: d */
    public final float f34098d;

    /* renamed from: e */
    public final int f34099e;

    public SliderTextStyle(@Px float f2, @NotNull Typeface typeface, @Px float f3, @Px float f4, @ColorInt int i2) {
        this.f34095a = f2;
        this.f34096b = typeface;
        this.f34097c = f3;
        this.f34098d = f4;
        this.f34099e = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        return Intrinsics.m32174c(Float.valueOf(this.f34095a), Float.valueOf(sliderTextStyle.f34095a)) && Intrinsics.m32174c(this.f34096b, sliderTextStyle.f34096b) && Intrinsics.m32174c(Float.valueOf(this.f34097c), Float.valueOf(sliderTextStyle.f34097c)) && Intrinsics.m32174c(Float.valueOf(this.f34098d), Float.valueOf(sliderTextStyle.f34098d)) && this.f34099e == sliderTextStyle.f34099e;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f34098d) + ((Float.floatToIntBits(this.f34097c) + ((this.f34096b.hashCode() + (Float.floatToIntBits(this.f34095a) * 31)) * 31)) * 31)) * 31) + this.f34099e;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SliderTextStyle(fontSize=");
        m24u.append(this.f34095a);
        m24u.append(", fontWeight=");
        m24u.append(this.f34096b);
        m24u.append(", offsetX=");
        m24u.append(this.f34097c);
        m24u.append(", offsetY=");
        m24u.append(this.f34098d);
        m24u.append(", textColor=");
        return C0000a.m17n(m24u, this.f34099e, ')');
    }
}
