package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivLayoutParams.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/widget/DivLayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f33956a;

    /* renamed from: b */
    public boolean f33957b;

    /* renamed from: c */
    public float f33958c;

    /* renamed from: d */
    public float f33959d;

    /* renamed from: e */
    public int f33960e;

    /* renamed from: f */
    public int f33961f;

    /* renamed from: g */
    public int f33962g;

    /* renamed from: h */
    public int f33963h;

    /* compiled from: DivLayoutParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div/internal/widget/DivLayoutParams$Companion;", "", "", "DEFAULT_GRAVITY", "I", "DEFAULT_SPAN", "", "DEFAULT_WEIGHT", "F", "WRAP_CONTENT_CONSTRAINED", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public DivLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33956a = 51;
        this.f33960e = 1;
        this.f33961f = 1;
        this.f33962g = Integer.MAX_VALUE;
        this.f33963h = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int m17409a() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    /* renamed from: b */
    public final int m17410b() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m32174c(Reflection.m32193a(DivLayoutParams.class), Reflection.m32193a(obj.getClass()))) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        if (((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.f33956a == divLayoutParams.f33956a && this.f33957b == divLayoutParams.f33957b && this.f33960e == divLayoutParams.f33960e && this.f33961f == divLayoutParams.f33961f) {
            if (this.f33958c == divLayoutParams.f33958c) {
                if ((this.f33959d == divLayoutParams.f33959d) && this.f33962g == divLayoutParams.f33962g && this.f33963h == divLayoutParams.f33963h) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.f33959d) + ((Float.floatToIntBits(this.f33958c) + (((((((((super.hashCode() * 31) + this.f33956a) * 31) + (this.f33957b ? 1 : 0)) * 31) + this.f33960e) * 31) + this.f33961f) * 31)) * 31)) * 31;
        int i2 = this.f33962g;
        if (i2 == Integer.MAX_VALUE) {
            i2 = 0;
        }
        int i3 = (floatToIntBits + i2) * 31;
        int i4 = this.f33963h;
        return i3 + (i4 != Integer.MAX_VALUE ? i4 : 0);
    }

    public DivLayoutParams(int i2, int i3) {
        super(i2, i3);
        this.f33956a = 51;
        this.f33960e = 1;
        this.f33961f = 1;
        this.f33962g = Integer.MAX_VALUE;
        this.f33963h = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f33956a = 51;
        this.f33960e = 1;
        this.f33961f = 1;
        this.f33962g = Integer.MAX_VALUE;
        this.f33963h = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f33956a = 51;
        this.f33960e = 1;
        this.f33961f = 1;
        this.f33962g = Integer.MAX_VALUE;
        this.f33963h = Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLayoutParams(@NotNull DivLayoutParams source) {
        super((ViewGroup.MarginLayoutParams) source);
        Intrinsics.m32179h(source, "source");
        this.f33956a = 51;
        this.f33960e = 1;
        this.f33961f = 1;
        this.f33962g = Integer.MAX_VALUE;
        this.f33963h = Integer.MAX_VALUE;
        this.f33956a = source.f33956a;
        this.f33957b = source.f33957b;
        this.f33958c = source.f33958c;
        this.f33959d = source.f33959d;
        this.f33960e = source.f33960e;
        this.f33961f = source.f33961f;
        this.f33962g = source.f33962g;
        this.f33963h = source.f33963h;
    }
}
