package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ShowSeparatorsMode;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: WrapLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001LJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R0\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR0\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0007\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR.\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R+\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\tR\u0014\u00105\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\tR\u0014\u00107\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\tR\u0014\u00109\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\tR\u0014\u0010;\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\tR\u0014\u0010=\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\tR\u0014\u0010?\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\tR\u0014\u0010A\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\tR\u0014\u0010C\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\tR\u0014\u0010E\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\tR\u0014\u0010G\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\tR\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, m31884d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "", "getBaseline", "value", "c", "I", "getWrapDirection", "()I", "setWrapDirection", "(I)V", "getWrapDirection$annotations", "()V", "wrapDirection", "d", "getGravity", "setGravity", "gravity", "e", "getShowSeparators", "setShowSeparators", "getShowSeparators$annotations", "showSeparators", "f", "getShowLineSeparators", "setShowLineSeparators", "getShowLineSeparators$annotations", "showLineSeparators", "Landroid/graphics/drawable/Drawable;", "g", "Landroid/graphics/drawable/Drawable;", "getSeparatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setSeparatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "separatorDrawable", "h", "getLineSeparatorDrawable", "setLineSeparatorDrawable", "lineSeparatorDrawable", "", "<set-?>", "o", "Lkotlin/properties/ReadWriteProperty;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getEdgeSeparatorsLength", "edgeSeparatorsLength", "getEdgeLineSeparatorsLength", "edgeLineSeparatorsLength", "getStartSeparatorLength", "startSeparatorLength", "getMiddleSeparatorLength", "middleSeparatorLength", "getEndSeparatorLength", "endSeparatorLength", "getStartLineSeparatorLength", "startLineSeparatorLength", "getMiddleLineSeparatorLength", "middleLineSeparatorLength", "getEndLineSeparatorLength", "endLineSeparatorLength", "getVisibleLinesCount", "visibleLinesCount", "getLargestMainSize", "largestMainSize", "getSumOfCrossSize", "sumOfCrossSize", "Lcom/yandex/div/core/widget/wraplayout/WrapLayout$WrapLine;", "getFirstVisibleLine", "()Lcom/yandex/div/core/widget/wraplayout/WrapLayout$WrapLine;", "firstVisibleLine", "WrapLine", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class WrapLayout extends DivViewGroup implements AspectView {

    /* renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f33064p = {Reflection.m32195c(new MutablePropertyReference1Impl(WrapLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c, reason: from kotlin metadata */
    public int wrapDirection;

    /* renamed from: d, reason: from kotlin metadata */
    public int gravity;

    /* renamed from: e, reason: from kotlin metadata */
    public int showSeparators;

    /* renamed from: f, reason: from kotlin metadata */
    public int showLineSeparators;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Drawable separatorDrawable;

    /* renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Drawable lineSeparatorDrawable;

    /* renamed from: i */
    public boolean f33071i;

    /* renamed from: j */
    @NotNull
    public final List<WrapLine> f33072j;

    /* renamed from: k */
    public int f33073k;

    /* renamed from: l */
    @Px
    public int f33074l;

    /* renamed from: m */
    @Px
    public int f33075m;

    /* renamed from: n */
    public int f33076n;

    /* renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty aspectRatio;

    /* compiled from: WrapLayout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapLayout$WrapLine;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class WrapLine {

        /* renamed from: a */
        public final int f33078a;

        /* renamed from: b */
        public int f33079b;

        /* renamed from: c */
        public int f33080c;

        /* renamed from: d */
        public int f33081d;

        /* renamed from: e */
        public int f33082e;

        /* renamed from: f */
        public int f33083f;

        /* renamed from: g */
        public int f33084g;

        /* renamed from: h */
        public int f33085h;

        /* renamed from: i */
        public int f33086i;

        public WrapLine() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511);
        }

        public WrapLine(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            i2 = (i11 & 1) != 0 ? 0 : i2;
            i3 = (i11 & 2) != 0 ? 0 : i3;
            i4 = (i11 & 4) != 0 ? 0 : i4;
            i5 = (i11 & 8) != 0 ? -1 : i5;
            i6 = (i11 & 16) != 0 ? 0 : i6;
            i7 = (i11 & 32) != 0 ? 0 : i7;
            i8 = (i11 & 64) != 0 ? 0 : i8;
            i9 = (i11 & 128) != 0 ? 0 : i9;
            i10 = (i11 & 256) != 0 ? 0 : i10;
            this.f33078a = i2;
            this.f33079b = i3;
            this.f33080c = i4;
            this.f33081d = i5;
            this.f33082e = i6;
            this.f33083f = i7;
            this.f33084g = i8;
            this.f33085h = i9;
            this.f33086i = i10;
        }

        /* renamed from: a */
        public final int m17206a() {
            return this.f33085h - this.f33086i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) obj;
            return this.f33078a == wrapLine.f33078a && this.f33079b == wrapLine.f33079b && this.f33080c == wrapLine.f33080c && this.f33081d == wrapLine.f33081d && this.f33082e == wrapLine.f33082e && this.f33083f == wrapLine.f33083f && this.f33084g == wrapLine.f33084g && this.f33085h == wrapLine.f33085h && this.f33086i == wrapLine.f33086i;
        }

        public int hashCode() {
            return (((((((((((((((this.f33078a * 31) + this.f33079b) * 31) + this.f33080c) * 31) + this.f33081d) * 31) + this.f33082e) * 31) + this.f33083f) * 31) + this.f33084g) * 31) + this.f33085h) * 31) + this.f33086i;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("WrapLine(firstIndex=");
            m24u.append(this.f33078a);
            m24u.append(", mainSize=");
            m24u.append(this.f33079b);
            m24u.append(", crossSize=");
            m24u.append(this.f33080c);
            m24u.append(", maxBaseline=");
            m24u.append(this.f33081d);
            m24u.append(", maxHeightUnderBaseline=");
            m24u.append(this.f33082e);
            m24u.append(", right=");
            m24u.append(this.f33083f);
            m24u.append(", bottom=");
            m24u.append(this.f33084g);
            m24u.append(", itemCount=");
            m24u.append(this.f33085h);
            m24u.append(", goneItemCount=");
            return C0000a.m17n(m24u, this.f33086i, ')');
        }
    }

    public WrapLayout(@NotNull Context context) {
        super(context, null, 0);
        this.gravity = 51;
        this.f33071i = true;
        this.f33072j = new ArrayList();
        this.aspectRatio = ViewsKt.m17187b(Float.valueOf(0.0f), new Function1<Float, Float>() { // from class: com.yandex.div.core.widget.wraplayout.WrapLayout$aspectRatio$2
            @Override // kotlin.jvm.functions.Function1
            public Float invoke(Float f2) {
                return Float.valueOf(RangesKt.m32234a(f2.floatValue(), 0.0f));
            }
        });
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (m17203p(this.showLineSeparators)) {
            return this.f33075m;
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (m17203p(this.showSeparators)) {
            return this.f33074l;
        }
        return 0;
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj;
        Iterator<T> it = this.f33072j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((WrapLine) obj).m17206a() > 0) {
                break;
            }
        }
        return (WrapLine) obj;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.f33072j.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((WrapLine) it.next()).f33079b);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((WrapLine) it.next()).f33079b);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    private final int getMiddleLineSeparatorLength() {
        if (m17205r(this.showLineSeparators)) {
            return this.f33075m;
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (m17205r(this.showSeparators)) {
            return this.f33074l;
        }
        return 0;
    }

    @ShowSeparatorsMode
    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    @ShowSeparatorsMode
    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    private final int getStartLineSeparatorLength() {
        if (m17204q(this.showLineSeparators)) {
            return this.f33075m;
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (m17204q(this.showSeparators)) {
            return this.f33074l;
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.f33072j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((WrapLine) it.next()).f33080c;
        }
        return ((getVisibleLinesCount() - 1) * getMiddleLineSeparatorLength()) + i2 + getEdgeLineSeparatorsLength();
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.f33072j;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if ((((WrapLine) it.next()).m17206a() > 0) && (i2 = i2 + 1) < 0) {
                CollectionsKt.m32021g0();
                throw null;
            }
        }
        return i2;
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    /* renamed from: g */
    public final void m17195g(WrapLine wrapLine) {
        this.f33072j.add(wrapLine);
        int i2 = wrapLine.f33081d;
        if (i2 > 0) {
            wrapLine.f33080c = Math.max(wrapLine.f33080c, i2 + wrapLine.f33082e);
        }
        this.f33076n += wrapLine.f33080c;
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f33064p[0])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        Integer valueOf = firstVisibleLine == null ? null : Integer.valueOf(getPaddingTop() + firstVisibleLine.f33081d);
        return valueOf == null ? super.getBaseline() : valueOf.intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    @Nullable
    public final Drawable getLineSeparatorDrawable() {
        return this.lineSeparatorDrawable;
    }

    @Nullable
    public final Drawable getSeparatorDrawable() {
        return this.separatorDrawable;
    }

    public final int getShowLineSeparators() {
        return this.showLineSeparators;
    }

    public final int getShowSeparators() {
        return this.showSeparators;
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    /* renamed from: i */
    public final void m17196i(int i2, WrapLine wrapLine) {
        if (i2 == getChildCount() - 1 && wrapLine.m17206a() != 0) {
            m17195g(wrapLine);
        }
    }

    /* renamed from: j */
    public final void m17197j(int i2, int i3, int i4) {
        if (this.f33072j.size() != 0 && View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i2);
            if (this.f33072j.size() == 1) {
                this.f33072j.get(0).f33080c = size - i4;
                return;
            }
            int sumOfCrossSize = getSumOfCrossSize() + i4;
            if (i3 != 1) {
                if (i3 != 5) {
                    if (i3 != 16) {
                        if (i3 != 80) {
                            return;
                        }
                    }
                }
                WrapLine wrapLine = new WrapLine(0, 0, 0, 0, 0, 0, 0, 0, 0, 511);
                wrapLine.f33080c = size - sumOfCrossSize;
                this.f33072j.add(0, wrapLine);
                return;
            }
            WrapLine wrapLine2 = new WrapLine(0, 0, 0, 0, 0, 0, 0, 0, 0, 511);
            wrapLine2.f33080c = (size - sumOfCrossSize) / 2;
            this.f33072j.add(0, wrapLine2);
            this.f33072j.add(wrapLine2);
        }
    }

    /* renamed from: k */
    public final Unit m17198k(Drawable drawable, Canvas canvas, int i2, int i3, int i4, int i5) {
        if (drawable == null) {
            return null;
        }
        float f2 = (i2 + i4) / 2.0f;
        float f3 = (i3 + i5) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f2 - intrinsicWidth), (int) (f3 - intrinsicHeight), (int) (f2 + intrinsicWidth), (int) (f3 + intrinsicHeight));
        drawable.draw(canvas);
        return Unit.f63088a;
    }

    /* renamed from: l */
    public final boolean m17199l(View view) {
        if (this.f33071i) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m17202o(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return m17202o(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    /* renamed from: m */
    public final int m17200m(int i2, int i3, int i4, boolean z) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 0) {
                if (i2 == 1073741824) {
                    return i3;
                }
                throw new IllegalStateException(Intrinsics.m32187p("Unknown size mode is set: ", Integer.valueOf(i2)));
            }
        } else {
            if (z) {
                return Math.min(i3, i4);
            }
            if (i4 < i3 || getVisibleLinesCount() > 1) {
                return i3;
            }
        }
        return i4;
    }

    /* renamed from: n */
    public final boolean m17201n(View view) {
        return view.getVisibility() == 8 || m17199l(view);
    }

    /* renamed from: o */
    public final boolean m17202o(Integer num) {
        return (num != null && num.intValue() == -1) || (num != null && num.intValue() == -3);
    }

    @Override // android.view.View
    public void onDraw(@NotNull final Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.m32179h(canvas, "canvas");
        if (this.separatorDrawable == null && this.lineSeparatorDrawable == null) {
            return;
        }
        if (this.showSeparators == 0 && this.showLineSeparators == 0) {
            return;
        }
        if (this.f33071i) {
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.yandex.div.core.widget.wraplayout.WrapLayout$drawSeparatorsHorizontal$drawLineSeparator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Integer num) {
                    int intValue = num.intValue();
                    WrapLayout wrapLayout = WrapLayout.this;
                    Drawable lineSeparatorDrawable = wrapLayout.getLineSeparatorDrawable();
                    Canvas canvas2 = canvas;
                    int paddingLeft = WrapLayout.this.getPaddingLeft();
                    WrapLayout wrapLayout2 = WrapLayout.this;
                    return wrapLayout.m17198k(lineSeparatorDrawable, canvas2, paddingLeft, intValue - wrapLayout2.f33075m, wrapLayout2.getWidth() - WrapLayout.this.getPaddingRight(), intValue);
                }
            };
            if (this.f33072j.size() > 0 && m17204q(this.showLineSeparators)) {
                WrapLine firstVisibleLine = getFirstVisibleLine();
                function1.invoke(Integer.valueOf(firstVisibleLine == null ? 0 : firstVisibleLine.f33084g - firstVisibleLine.f33080c));
            }
            int i6 = 0;
            boolean z = false;
            for (WrapLine wrapLine : this.f33072j) {
                if (wrapLine.m17206a() != 0) {
                    int i7 = wrapLine.f33084g;
                    int i8 = i7 - wrapLine.f33080c;
                    if (z && m17205r(getShowLineSeparators())) {
                        function1.invoke(Integer.valueOf(i8));
                    }
                    int i9 = wrapLine.f33085h;
                    int i10 = 0;
                    int i11 = 0;
                    boolean z2 = true;
                    while (i10 < i9) {
                        int i12 = i10 + 1;
                        View childAt = getChildAt(wrapLine.f33078a + i10);
                        if (childAt == null || m17201n(childAt)) {
                            i4 = i9;
                        } else {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                            if (z2) {
                                if (m17204q(getShowSeparators())) {
                                    i5 = i9;
                                    m17198k(getSeparatorDrawable(), canvas, left - this.f33074l, i8, left, i7);
                                } else {
                                    i5 = i9;
                                }
                                i10 = i12;
                                i11 = right;
                                i9 = i5;
                                z2 = false;
                            } else {
                                i4 = i9;
                                if (m17205r(getShowSeparators())) {
                                    m17198k(getSeparatorDrawable(), canvas, left - this.f33074l, i8, left, i7);
                                }
                                i11 = right;
                            }
                        }
                        i10 = i12;
                        i9 = i4;
                    }
                    if (i11 > 0 && m17203p(getShowSeparators())) {
                        m17198k(getSeparatorDrawable(), canvas, i11, i8, i11 + this.f33074l, i7);
                    }
                    i6 = i7;
                    z = true;
                }
            }
            if (i6 <= 0 || !m17203p(this.showLineSeparators)) {
                return;
            }
            function1.invoke(Integer.valueOf(i6 + this.f33075m));
            return;
        }
        Function1<Integer, Unit> function12 = new Function1<Integer, Unit>() { // from class: com.yandex.div.core.widget.wraplayout.WrapLayout$drawSeparatorsVertical$drawLineSeparator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                int intValue = num.intValue();
                WrapLayout wrapLayout = WrapLayout.this;
                Drawable lineSeparatorDrawable = wrapLayout.getLineSeparatorDrawable();
                Canvas canvas2 = canvas;
                WrapLayout wrapLayout2 = WrapLayout.this;
                return wrapLayout.m17198k(lineSeparatorDrawable, canvas2, intValue - wrapLayout2.f33075m, wrapLayout2.getPaddingTop(), intValue, WrapLayout.this.getHeight() - WrapLayout.this.getPaddingBottom());
            }
        };
        if (this.f33072j.size() > 0 && m17204q(this.showLineSeparators)) {
            WrapLine firstVisibleLine2 = getFirstVisibleLine();
            function12.invoke(Integer.valueOf(firstVisibleLine2 == null ? 0 : firstVisibleLine2.f33083f - firstVisibleLine2.f33080c));
        }
        int i13 = 0;
        boolean z3 = false;
        for (WrapLine wrapLine2 : this.f33072j) {
            if (wrapLine2.m17206a() != 0) {
                int i14 = wrapLine2.f33083f;
                int i15 = i14 - wrapLine2.f33080c;
                if (z3 && m17205r(getShowLineSeparators())) {
                    function12.invoke(Integer.valueOf(i15));
                }
                boolean z4 = getLineSeparatorDrawable() != null;
                int i16 = wrapLine2.f33085h;
                int i17 = 0;
                int i18 = 0;
                boolean z5 = true;
                while (i17 < i16) {
                    int i19 = i17 + 1;
                    View childAt2 = getChildAt(wrapLine2.f33078a + i17);
                    if (childAt2 == null || m17201n(childAt2)) {
                        i2 = i16;
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                        int top = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin;
                        int bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin;
                        if (z5) {
                            if (m17204q(getShowSeparators())) {
                                i3 = i16;
                                m17198k(getSeparatorDrawable(), canvas, i15, top - this.f33074l, i14, top);
                            } else {
                                i3 = i16;
                            }
                            i17 = i19;
                            i18 = bottom;
                            i16 = i3;
                            z5 = false;
                        } else {
                            i2 = i16;
                            if (m17205r(getShowSeparators())) {
                                m17198k(getSeparatorDrawable(), canvas, i15, top - this.f33074l, i14, top);
                            }
                            i18 = bottom;
                        }
                    }
                    i17 = i19;
                    i16 = i2;
                }
                if (i18 > 0 && m17203p(getShowSeparators())) {
                    m17198k(getSeparatorDrawable(), canvas, i15, i18, i14, i18 + this.f33074l);
                }
                i13 = i14;
                z3 = z4;
            }
        }
        if (i13 <= 0 || !m17203p(this.showLineSeparators)) {
            return;
        }
        function12.invoke(Integer.valueOf(i13 + this.f33075m));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.wraplayout.WrapLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode;
        int size;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int edgeSeparatorsLength;
        int i10;
        int i11;
        int i12;
        this.f33072j.clear();
        this.f33073k = 0;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if ((getAspectRatio() == 0.0f) || mode2 != 1073741824) {
            i4 = i3;
            mode = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
        } else {
            int m32223c = MathKt.m32223c(size2 / getAspectRatio());
            size = m32223c;
            i4 = View.MeasureSpec.makeMeasureSpec(m32223c, 1073741824);
            mode = 1073741824;
        }
        this.f33076n = getEdgeLineSeparatorsLength();
        int i13 = this.f33071i ? i2 : i4;
        int mode3 = View.MeasureSpec.getMode(i13);
        int size3 = View.MeasureSpec.getSize(i13);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.f33071i ? paddingRight : paddingBottom);
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength2, 0, 0, 0, 0, 0, 0, 0, 509);
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(this)).iterator();
        WrapLine wrapLine2 = wrapLine;
        int i14 = 0;
        int i15 = Integer.MIN_VALUE;
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                int i16 = i4;
                if (this.f33071i) {
                    m17197j(i16, this.gravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, getPaddingBottom() + getPaddingTop());
                } else {
                    m17197j(i2, this.gravity & 7, getPaddingRight() + getPaddingLeft());
                }
                int largestMainSize = this.f33071i ? getLargestMainSize() : getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
                int paddingBottom2 = this.f33071i ? getPaddingBottom() + getPaddingTop() + getSumOfCrossSize() : getLargestMainSize();
                int i17 = this.f33073k;
                if (mode2 != 0 && size2 < largestMainSize) {
                    i17 = ViewGroup.combineMeasuredStates(i17, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                }
                this.f33073k = i17;
                int resolveSizeAndState = ViewGroup.resolveSizeAndState(m17200m(mode2, size2, largestMainSize, !this.f33071i), i2, this.f33073k);
                if (this.f33071i) {
                    if (!(getAspectRatio() == 0.0f) && mode2 != 1073741824) {
                        i7 = MathKt.m32223c((16777215 & resolveSizeAndState) / getAspectRatio());
                        i5 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        i6 = 1073741824;
                        i8 = this.f33073k;
                        if (i6 != 0 && i7 < paddingBottom2) {
                            i8 = ViewGroup.combineMeasuredStates(i8, 256);
                        }
                        this.f33073k = i8;
                        setMeasuredDimension(resolveSizeAndState, ViewGroup.resolveSizeAndState(m17200m(i6, i7, paddingBottom2, this.f33071i), i5, this.f33073k));
                        return;
                    }
                }
                i5 = i16;
                i6 = mode;
                i7 = size;
                i8 = this.f33073k;
                if (i6 != 0) {
                    i8 = ViewGroup.combineMeasuredStates(i8, 256);
                }
                this.f33073k = i8;
                setMeasuredDimension(resolveSizeAndState, ViewGroup.resolveSizeAndState(m17200m(i6, i7, paddingBottom2, this.f33071i), i5, this.f33073k));
                return;
            }
            Object next = viewGroupKt$iterator$1.next();
            int i18 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            View view = (View) next;
            if (m17201n(view)) {
                wrapLine2.f33086i++;
                wrapLine2.f33085h++;
                m17196i(i14, wrapLine2);
                i10 = size3;
                i11 = i4;
            } else {
                DivViewGroup.Companion companion = DivViewGroup.f33964b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int m17409a = divLayoutParams.m17409a() + paddingRight;
                int m17410b = divLayoutParams.m17410b() + paddingBottom;
                if (this.f33071i) {
                    i9 = m17409a + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.f33076n;
                } else {
                    i9 = m17409a + this.f33076n;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i19 = i14;
                WrapLine wrapLine3 = wrapLine2;
                int m17411a = companion.m17411a(i2, i9, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.f33963h);
                i10 = size3;
                i11 = i4;
                view.measure(m17411a, companion.m17411a(i4, m17410b + edgeSeparatorsLength, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.f33962g));
                this.f33073k = View.combineMeasuredStates(this.f33073k, view.getMeasuredState());
                int m17409a2 = divLayoutParams.m17409a() + view.getMeasuredWidth();
                int m17410b2 = divLayoutParams.m17410b() + view.getMeasuredHeight();
                if (!this.f33071i) {
                    m17410b2 = m17409a2;
                    m17409a2 = m17410b2;
                }
                if (mode3 != 0 && i10 < (wrapLine3.f33079b + m17409a2) + (wrapLine3.f33085h != 0 ? getMiddleSeparatorLength() : 0)) {
                    if (wrapLine3.m17206a() > 0) {
                        m17195g(wrapLine3);
                    }
                    wrapLine2 = new WrapLine(i19, edgeSeparatorsLength2, 0, 0, 0, 0, 0, 1, 0, 380);
                    i12 = Integer.MIN_VALUE;
                } else {
                    if (wrapLine3.f33085h > 0) {
                        wrapLine3.f33079b += getMiddleSeparatorLength();
                    }
                    wrapLine3.f33085h++;
                    wrapLine2 = wrapLine3;
                    i12 = i15;
                }
                if (this.f33071i && divLayoutParams.f33957b) {
                    wrapLine2.f33081d = Math.max(wrapLine2.f33081d, view.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
                    wrapLine2.f33082e = Math.max(wrapLine2.f33082e, (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view.getBaseline());
                }
                wrapLine2.f33079b += m17409a2;
                int max = Math.max(i12, m17410b2);
                wrapLine2.f33080c = Math.max(wrapLine2.f33080c, max);
                m17196i(i19, wrapLine2);
                i15 = max;
            }
            size3 = i10;
            i4 = i11;
            i14 = i18;
        }
    }

    /* renamed from: p */
    public final boolean m17203p(@ShowSeparatorsMode int i2) {
        return (i2 & 4) != 0;
    }

    /* renamed from: q */
    public final boolean m17204q(@ShowSeparatorsMode int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: r */
    public final boolean m17205r(@ShowSeparatorsMode int i2) {
        return (i2 & 2) != 0;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f2) {
        this.aspectRatio.setValue(this, f33064p[0], Float.valueOf(f2));
    }

    public final void setGravity(int i2) {
        if (this.gravity == i2) {
            return;
        }
        if ((i2 & 7) == 0) {
            i2 |= 3;
        }
        if ((i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i2 |= 48;
        }
        this.gravity = i2;
        requestLayout();
    }

    public final void setLineSeparatorDrawable(@Nullable Drawable drawable) {
        if (Intrinsics.m32174c(this.lineSeparatorDrawable, drawable)) {
            return;
        }
        this.lineSeparatorDrawable = drawable;
        this.f33075m = drawable == null ? 0 : this.f33071i ? drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth();
        requestLayout();
    }

    public final void setSeparatorDrawable(@Nullable Drawable drawable) {
        if (Intrinsics.m32174c(this.separatorDrawable, drawable)) {
            return;
        }
        this.separatorDrawable = drawable;
        this.f33074l = drawable == null ? 0 : this.f33071i ? drawable.getIntrinsicWidth() : drawable.getIntrinsicHeight();
        requestLayout();
    }

    public final void setShowLineSeparators(int i2) {
        if (this.showLineSeparators != i2) {
            this.showLineSeparators = i2;
            requestLayout();
        }
    }

    public final void setShowSeparators(int i2) {
        if (this.showSeparators != i2) {
            this.showSeparators = i2;
            requestLayout();
        }
    }

    public final void setWrapDirection(int i2) {
        if (this.wrapDirection != i2) {
            this.wrapDirection = i2;
            if (i2 == 0) {
                this.f33071i = true;
                Drawable drawable = this.separatorDrawable;
                this.f33074l = drawable == null ? 0 : drawable.getIntrinsicWidth();
                Drawable drawable2 = this.lineSeparatorDrawable;
                this.f33075m = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(Intrinsics.m32187p("Invalid value for the wrap direction is set: ", Integer.valueOf(this.wrapDirection)));
                }
                this.f33071i = false;
                Drawable drawable3 = this.separatorDrawable;
                this.f33074l = drawable3 == null ? 0 : drawable3.getIntrinsicHeight();
                Drawable drawable4 = this.lineSeparatorDrawable;
                this.f33075m = drawable4 != null ? drawable4.getIntrinsicWidth() : 0;
            }
            requestLayout();
        }
    }
}
