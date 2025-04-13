package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinearContainerLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003R0\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010+\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010\u000e\u0012\u0004\b*\u0010\u0014\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R\"\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R$\u00102\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012¨\u00063"}, m31884d2 = {"Lcom/yandex/div/core/widget/LinearContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "", "measureSpec", "", "setParentCrossSizeIfNeeded", "getBaseline", "horizontalGravity", "setHorizontalGravity", "verticalGravity", "setVerticalGravity", "value", "e", "I", "getOrientation", "()I", "setOrientation", "(I)V", "getOrientation$annotations", "()V", "orientation", "", "<set-?>", "j", "Lkotlin/properties/ReadWriteProperty;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Landroid/graphics/drawable/Drawable;", "m", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "setDividerDrawable", "(Landroid/graphics/drawable/Drawable;)V", "dividerDrawable", "n", "getShowDividers", "setShowDividers", "getShowDividers$annotations", "showDividers", "o", "getDividerPadding", "setDividerPadding", "dividerPadding", "getGravity", "setGravity", "gravity", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class LinearContainerLayout extends DivViewGroup implements AspectView {

    /* renamed from: u */
    public static final /* synthetic */ KProperty<Object>[] f32999u = {Reflection.m32195c(new MutablePropertyReference1Impl(LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c */
    public int f33000c;

    /* renamed from: d */
    public int f33001d;

    /* renamed from: e, reason: from kotlin metadata */
    public int orientation;

    /* renamed from: f */
    public int f33003f;

    /* renamed from: g */
    public int f33004g;

    /* renamed from: h */
    public int f33005h;

    /* renamed from: i */
    public int f33006i;

    /* renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty aspectRatio;

    /* renamed from: k */
    public int f33008k;

    /* renamed from: l */
    public int f33009l;

    /* renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Drawable dividerDrawable;

    /* renamed from: n, reason: from kotlin metadata */
    public int showDividers;

    /* renamed from: o, reason: from kotlin metadata */
    public int dividerPadding;

    /* renamed from: p */
    @NotNull
    public final List<View> f33013p;

    /* renamed from: q */
    @NotNull
    public final Set<View> f33014q;

    /* renamed from: r */
    public int f33015r;

    /* renamed from: s */
    @NotNull
    public final Set<View> f33016s;

    /* renamed from: t */
    public float f33017t;

    @JvmOverloads
    public LinearContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f33000c = -1;
        this.f33001d = -1;
        this.f33003f = 8388659;
        this.aspectRatio = new DimensionAffectingViewProperty(Float.valueOf(0.0f), new Function1<Float, Float>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$aspectRatio$2
            @Override // kotlin.jvm.functions.Function1
            public Float invoke(Float f2) {
                return Float.valueOf(RangesKt.m32234a(f2.floatValue(), 0.0f));
            }
        });
        this.f33013p = new ArrayList();
        this.f33014q = new LinkedHashSet();
        this.f33016s = new LinkedHashSet();
    }

    /* renamed from: g */
    public static final float m17155g(LinearContainerLayout linearContainerLayout, DivLayoutParams divLayoutParams) {
        Objects.requireNonNull(linearContainerLayout);
        float f2 = divLayoutParams.f33959d;
        return f2 > 0.0f ? f2 : ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 ? 1.0f : 0.0f;
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    @ShowSeparatorsMode
    public static /* synthetic */ void getShowDividers$annotations() {
    }

    /* renamed from: i */
    public static final float m17156i(LinearContainerLayout linearContainerLayout, DivLayoutParams divLayoutParams) {
        Objects.requireNonNull(linearContainerLayout);
        float f2 = divLayoutParams.f33958c;
        return f2 > 0.0f ? f2 : ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 ? 1.0f : 0.0f;
    }

    private final void setParentCrossSizeIfNeeded(int measureSpec) {
        if (!this.f33016s.isEmpty() && this.f33015r <= 0 && ViewsKt.m17189d(measureSpec)) {
            this.f33015r = View.MeasureSpec.getSize(measureSpec);
        }
    }

    /* renamed from: A */
    public final int m17157A(View view, int i2, int i3) {
        DivViewGroup.Companion companion = DivViewGroup.f33964b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        view.measure(ViewsKt.m17193h(i3), companion.m17411a(i2, divLayoutParams.m17410b() + getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.f33962g));
        return ViewGroup.combineMeasuredStates(this.f33006i, view.getMeasuredState() & (-16777216));
    }

    /* renamed from: B */
    public final void m17158B(View view, int i2, int i3, int i4) {
        DivViewGroup.Companion companion = DivViewGroup.f33964b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i5 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i5 == -1) {
            if (i3 == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                i2 = ViewsKt.m17193h(i3);
            }
        }
        int i6 = i2;
        int m17411a = companion.m17411a(i6, divLayoutParams.m17409a() + getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.f33963h);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i5;
        view.measure(m17411a, ViewsKt.m17193h(i4));
        this.f33006i = ViewGroup.combineMeasuredStates(this.f33006i, view.getMeasuredState() & (-256));
    }

    /* renamed from: C */
    public final void m17159C(final int i2, int i3, int i4, int i5) {
        boolean z;
        final int i6 = i3 - this.f33004g;
        List<View> list = this.f33013p;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (m17167o((View) it.next()) != Integer.MAX_VALUE) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z || m17178z(i6, i4)) {
            this.f33004g = 0;
            if (i6 >= 0) {
                for (View view : this.f33013p) {
                    if (m17167o(view) != Integer.MAX_VALUE) {
                        m17158B(view, i2, this.f33015r, Math.min(view.getMeasuredHeight(), m17167o(view)));
                    }
                }
            } else {
                List<View> list2 = this.f33013p;
                if (list2.size() > 1) {
                    kotlin.collections.CollectionsKt.m32015b0(list2, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedHeightChildren$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            View view2 = (View) t2;
                            View view3 = (View) t;
                            return ComparisonsKt.m32109b(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()), Float.valueOf(view3.getMinimumHeight() / view3.getMeasuredHeight()));
                        }
                    });
                }
                int i7 = i6;
                for (View view2 : this.f33013p) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int measuredHeight = view2.getMeasuredHeight();
                    int m17410b = divLayoutParams.m17410b() + measuredHeight;
                    int m32223c = MathKt.m32223c((m17410b / this.f33005h) * i7) + measuredHeight;
                    int minimumHeight = view2.getMinimumHeight();
                    if (m32223c < minimumHeight) {
                        m32223c = minimumHeight;
                    }
                    int i8 = divLayoutParams.f33962g;
                    if (m32223c > i8) {
                        m32223c = i8;
                    }
                    m17158B(view2, i2, this.f33015r, m32223c);
                    this.f33006i = ViewGroup.combineMeasuredStates(this.f33006i, view2.getMeasuredState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE & (-256));
                    this.f33005h -= m17410b;
                    i7 -= view2.getMeasuredHeight() - measuredHeight;
                }
            }
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.f63349b = i6;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.f63348b = this.f33017t;
            final int i9 = this.f33015r;
            this.f33015r = i5;
            m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureMatchParentHeightChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view3) {
                    View child = view3;
                    Intrinsics.m32179h(child, "child");
                    DivViewGroup.Companion companion = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                    if (((ViewGroup.MarginLayoutParams) divLayoutParams2).height == -1) {
                        if (i6 > 0) {
                            float m17156i = LinearContainerLayout.m17156i(this, divLayoutParams2) * intRef.f63349b;
                            Ref.FloatRef floatRef2 = floatRef;
                            float f2 = floatRef2.f63348b;
                            int i10 = (int) (m17156i / f2);
                            floatRef2.f63348b = f2 - LinearContainerLayout.m17156i(this, divLayoutParams2);
                            intRef.f63349b -= i10;
                            this.m17158B(child, i2, i9, i10);
                        } else if (this.f33014q.contains(child)) {
                            this.m17158B(child, i2, i9, 0);
                        }
                    }
                    LinearContainerLayout linearContainerLayout = this;
                    int i11 = i2;
                    int m17409a = divLayoutParams2.m17409a() + child.getMeasuredWidth();
                    KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                    linearContainerLayout.m17161E(i11, m17409a);
                    LinearContainerLayout linearContainerLayout2 = this;
                    linearContainerLayout2.f33004g = linearContainerLayout2.m17168p(linearContainerLayout2.f33004g, divLayoutParams2.m17410b() + child.getMeasuredHeight());
                    return Unit.f63088a;
                }
            });
            int i10 = Assert.f33709a;
            this.f33004g = getPaddingBottom() + getPaddingTop() + this.f33004g;
        }
    }

    /* renamed from: D */
    public final void m17160D(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (divLayoutParams.f33957b && (baseline = view.getBaseline()) != -1) {
            this.f33000c = Math.max(this.f33000c, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
            this.f33001d = Math.max(this.f33001d, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
        }
    }

    /* renamed from: E */
    public final void m17161E(int i2, int i3) {
        if (ViewsKt.m17190e(i2)) {
            return;
        }
        this.f33015r = Math.max(this.f33015r, i3);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m17174v() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f32999u[0])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!m17174v()) {
            int i2 = this.f33000c;
            return i2 != -1 ? getPaddingTop() + i2 : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return getPaddingTop() + baseline + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin;
    }

    @Nullable
    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getDividerPadding() {
        return this.dividerPadding;
    }

    /* renamed from: getGravity, reason: from getter */
    public final int getF33003f() {
        return this.f33003f;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getShowDividers() {
        return this.showDividers;
    }

    /* renamed from: j */
    public final Unit m17162j(Canvas canvas, int i2, int i3, int i4, int i5) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f2 = (i2 + i4) / 2.0f;
        float f3 = (i3 + i5) / 2.0f;
        float f4 = this.f33008k / 2.0f;
        float f5 = this.f33009l / 2.0f;
        drawable.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        drawable.draw(canvas);
        return Unit.f63088a;
    }

    /* renamed from: k */
    public final Unit m17163k(Canvas canvas, int i2) {
        return m17162j(canvas, getPaddingLeft() + this.dividerPadding, i2, (getWidth() - getPaddingRight()) - this.dividerPadding, i2 + this.f33009l);
    }

    /* renamed from: l */
    public final Unit m17164l(Canvas canvas, int i2) {
        return m17162j(canvas, i2, getPaddingTop() + this.dividerPadding, i2 + this.f33008k, (getHeight() - getPaddingBottom()) - this.dividerPadding);
    }

    /* renamed from: m */
    public final void m17165m(Function1<? super View, Unit> function1) {
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                function1.invoke(childAt);
            }
            i2 = i3;
        }
    }

    /* renamed from: n */
    public final void m17166n(Function2<? super View, ? super Integer, Unit> function2) {
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                function2.invoke(childAt, Integer.valueOf(i2));
            }
            i2 = i3;
        }
    }

    /* renamed from: o */
    public final int m17167o(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).f33962g;
    }

    @Override // android.view.View
    public void onDraw(@NotNull final Canvas canvas) {
        int i2;
        int i3;
        int i4;
        Integer valueOf;
        Intrinsics.m32179h(canvas, "canvas");
        if (this.dividerDrawable == null) {
            return;
        }
        if (m17174v()) {
            m17166n(new Function2<View, Integer, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$drawDividersVertical$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public Unit invoke(View view, Integer num) {
                    View child = view;
                    int intValue = num.intValue();
                    Intrinsics.m32179h(child, "child");
                    LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                    KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                    if (linearContainerLayout.m17171s(intValue)) {
                        int top = child.getTop();
                        DivViewGroup.Companion companion = DivViewGroup.f33964b;
                        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        int i5 = top - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin;
                        LinearContainerLayout linearContainerLayout2 = LinearContainerLayout.this;
                        linearContainerLayout2.m17163k(canvas, i5 - linearContainerLayout2.f33009l);
                    }
                    return Unit.f63088a;
                }
            });
            if (m17171s(getChildCount())) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt == null) {
                    valueOf = null;
                } else {
                    int bottom = childAt.getBottom();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    valueOf = Integer.valueOf(bottom + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).bottomMargin);
                }
                m17163k(canvas, valueOf == null ? (getHeight() - getPaddingBottom()) - this.f33009l : valueOf.intValue());
                return;
            }
            return;
        }
        final boolean z = ViewCompat.m2231w(this) == 1;
        m17166n(new Function2<View, Integer, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$drawDividersHorizontal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(View view, Integer num) {
                int i5;
                View child = view;
                int intValue = num.intValue();
                Intrinsics.m32179h(child, "child");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                if (linearContainerLayout.m17171s(intValue)) {
                    if (z) {
                        int right = child.getRight();
                        DivViewGroup.Companion companion = DivViewGroup.f33964b;
                        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        i5 = right + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).rightMargin;
                    } else {
                        int left = child.getLeft();
                        DivViewGroup.Companion companion2 = DivViewGroup.f33964b;
                        ViewGroup.LayoutParams layoutParams3 = child.getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        i5 = (left - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams3)).leftMargin) - LinearContainerLayout.this.f33008k;
                    }
                    LinearContainerLayout.this.m17164l(canvas, i5);
                }
                return Unit.f63088a;
            }
        });
        if (m17171s(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 == null && z) {
                i2 = getPaddingLeft();
            } else {
                if (childAt2 == null) {
                    i3 = getWidth() - getPaddingRight();
                    i4 = this.f33008k;
                } else if (z) {
                    int left = childAt2.getLeft();
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i3 = left - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).leftMargin;
                    i4 = this.f33008k;
                } else {
                    int right = childAt2.getRight();
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i2 = right + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams3)).rightMargin;
                }
                i2 = i3 - i4;
            }
            m17164l(canvas, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.LinearContainerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        this.f33004g = 0;
        this.f33017t = 0.0f;
        this.f33006i = 0;
        if (m17174v()) {
            m17176x(i2, i3);
        } else {
            m17175w(i2, i3);
        }
        this.f33013p.clear();
        this.f33016s.clear();
        this.f33014q.clear();
    }

    /* renamed from: p */
    public final int m17168p(int i2, int i3) {
        return Math.max(i2, i3 + i2);
    }

    /* renamed from: q */
    public final int m17169q(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).f33963h;
    }

    /* renamed from: r */
    public final int m17170r(int i2, int i3, int i4) {
        return ViewGroup.resolveSizeAndState(i2 + (i2 == i3 ? 0 : getPaddingLeft() + getPaddingRight()), i4, this.f33006i);
    }

    /* renamed from: s */
    public final boolean m17171s(int i2) {
        int i3;
        if (i2 == 0) {
            if ((this.showDividers & 1) == 0) {
                return false;
            }
        } else if (i2 == getChildCount()) {
            if ((this.showDividers & 4) == 0) {
                return false;
            }
        } else {
            if ((this.showDividers & 2) == 0 || (i3 = i2 - 1) < 0) {
                return false;
            }
            while (true) {
                int i4 = i3 - 1;
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
                if (i4 < 0) {
                    return false;
                }
                i3 = i4;
            }
        }
        return true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f2) {
        this.aspectRatio.setValue(this, f32999u[0], Float.valueOf(f2));
    }

    public final void setDividerDrawable(@Nullable Drawable drawable) {
        if (Intrinsics.m32174c(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.f33008k = drawable == null ? 0 : drawable.getIntrinsicWidth();
        this.f33009l = drawable == null ? 0 : drawable.getIntrinsicHeight();
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerPadding(int i2) {
        this.dividerPadding = i2;
    }

    public final void setGravity(int i2) {
        if (this.f33003f == i2) {
            return;
        }
        if ((8388615 & i2) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i2 |= 48;
        }
        this.f33003f = i2;
        requestLayout();
    }

    public final void setHorizontalGravity(int horizontalGravity) {
        int i2 = horizontalGravity & 8388615;
        if ((8388615 & getF33003f()) == i2) {
            return;
        }
        this.f33003f = i2 | (getF33003f() & (-8388616));
        requestLayout();
    }

    public final void setOrientation(int i2) {
        if (this.orientation != i2) {
            this.orientation = i2;
            requestLayout();
        }
    }

    public final void setShowDividers(int i2) {
        if (this.showDividers == i2) {
            return;
        }
        this.showDividers = i2;
        requestLayout();
    }

    public final void setVerticalGravity(int verticalGravity) {
        int i2 = verticalGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if ((getF33003f() & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == i2) {
            return;
        }
        this.f33003f = i2 | (getF33003f() & (-113));
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean m17172t(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height != -1 || ViewsKt.m17191f(i2);
    }

    /* renamed from: u */
    public final boolean m17173u(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).width != -1 || ViewsKt.m17191f(i2);
    }

    /* renamed from: v */
    public final boolean m17174v() {
        return this.orientation == 1;
    }

    /* renamed from: w */
    public final void m17175w(final int i2, int i3) {
        boolean z;
        this.f33000c = -1;
        this.f33001d = -1;
        boolean m17190e = ViewsKt.m17190e(i2);
        final Ref.IntRef intRef = new Ref.IntRef();
        int m17193h = (getAspectRatio() > 0.0f ? 1 : (getAspectRatio() == 0.0f ? 0 : -1)) == 0 ? i3 : m17190e ? ViewsKt.m17193h(MathKt.m32223c(View.MeasureSpec.getSize(i2) / getAspectRatio())) : ViewsKt.m17193h(0);
        intRef.f63349b = m17193h;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f63349b = View.MeasureSpec.getSize(m17193h);
        boolean m17190e2 = ViewsKt.m17190e(intRef.f63349b);
        int suggestedMinimumHeight = m17190e2 ? intRef2.f63349b : getSuggestedMinimumHeight();
        int i4 = suggestedMinimumHeight < 0 ? 0 : suggestedMinimumHeight;
        m17166n(new Function2<View, Integer, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureHorizontal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(View view, Integer num) {
                View child = view;
                int intValue = num.intValue();
                Intrinsics.m32179h(child, "child");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                if (linearContainerLayout.m17171s(intValue)) {
                    LinearContainerLayout linearContainerLayout2 = LinearContainerLayout.this;
                    linearContainerLayout2.f33004g += linearContainerLayout2.f33008k;
                }
                LinearContainerLayout linearContainerLayout3 = LinearContainerLayout.this;
                float f2 = linearContainerLayout3.f33017t;
                DivViewGroup.Companion companion = DivViewGroup.f33964b;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                linearContainerLayout3.f33017t = LinearContainerLayout.m17155g(linearContainerLayout3, (DivLayoutParams) layoutParams) + f2;
                LinearContainerLayout linearContainerLayout4 = LinearContainerLayout.this;
                int i5 = i2;
                int i6 = intRef.f63349b;
                if (linearContainerLayout4.m17173u(child, i5)) {
                    ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams2;
                    if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3) {
                        ViewGroup.LayoutParams layoutParams3 = child.getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams3;
                        int i7 = divLayoutParams2.f33963h;
                        ((ViewGroup.MarginLayoutParams) divLayoutParams2).width = -2;
                        divLayoutParams2.f33963h = Integer.MAX_VALUE;
                        linearContainerLayout4.measureChildWithMargins(child, i5, 0, i6, 0);
                        ((ViewGroup.MarginLayoutParams) divLayoutParams2).width = -3;
                        divLayoutParams2.f33963h = i7;
                        linearContainerLayout4.f33005h = linearContainerLayout4.m17168p(linearContainerLayout4.f33005h, divLayoutParams2.m17409a() + child.getMeasuredWidth());
                        linearContainerLayout4.f33013p.add(child);
                    } else {
                        linearContainerLayout4.measureChildWithMargins(child, i5, 0, i6, 0);
                    }
                    linearContainerLayout4.f33006i = ViewGroup.combineMeasuredStates(linearContainerLayout4.f33006i, child.getMeasuredState());
                    linearContainerLayout4.m17161E(i6, divLayoutParams.m17410b() + child.getMeasuredHeight());
                    linearContainerLayout4.m17160D(child);
                    if (linearContainerLayout4.m17173u(child, i5)) {
                        linearContainerLayout4.f33004g = linearContainerLayout4.m17168p(linearContainerLayout4.f33004g, divLayoutParams.m17409a() + child.getMeasuredWidth());
                    }
                }
                return Unit.f63088a;
            }
        });
        m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureHorizontal$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                int i5 = i2;
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                if (!linearContainerLayout.m17173u(it, i5)) {
                    int i6 = linearContainerLayout.f33004g;
                    ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    linearContainerLayout.f33004g = linearContainerLayout.m17168p(i6, ((DivLayoutParams) layoutParams).m17409a());
                }
                return Unit.f63088a;
            }
        });
        if (this.f33004g > 0 && m17171s(getChildCount())) {
            this.f33004g += this.f33008k;
        }
        this.f33004g = getPaddingRight() + getPaddingLeft() + this.f33004g;
        if (ViewsKt.m17189d(i2) && this.f33017t > 0.0f) {
            this.f33004g = Math.max(View.MeasureSpec.getSize(i2), this.f33004g);
        }
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(this.f33004g, i2, this.f33006i);
        if (!m17190e) {
            if (!(getAspectRatio() == 0.0f)) {
                int m32223c = MathKt.m32223c((16777215 & resolveSizeAndState) / getAspectRatio());
                intRef2.f63349b = m32223c;
                intRef.f63349b = ViewsKt.m17193h(m32223c);
            }
        }
        final int i5 = intRef.f63349b;
        final int size = View.MeasureSpec.getSize(i2) - this.f33004g;
        List<View> list = this.f33013p;
        int i6 = Integer.MAX_VALUE;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (m17169q((View) it.next()) != Integer.MAX_VALUE) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z || m17178z(size, i2)) {
            this.f33004g = 0;
            if (size >= 0) {
                for (View view : this.f33013p) {
                    if (m17169q(view) != i6) {
                        m17157A(view, i5, Math.min(view.getMeasuredWidth(), m17169q(view)));
                        i6 = Integer.MAX_VALUE;
                    }
                }
            } else {
                List<View> list2 = this.f33013p;
                if (list2.size() > 1) {
                    kotlin.collections.CollectionsKt.m32015b0(list2, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedWidthChildren$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            View view2 = (View) t2;
                            View view3 = (View) t;
                            return ComparisonsKt.m32109b(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()), Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()));
                        }
                    });
                }
                int i7 = size;
                for (View view2 : this.f33013p) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int measuredWidth = view2.getMeasuredWidth();
                    int m17409a = divLayoutParams.m17409a() + measuredWidth;
                    int m32223c2 = MathKt.m32223c((m17409a / this.f33005h) * i7) + measuredWidth;
                    int minimumWidth = view2.getMinimumWidth();
                    if (m32223c2 < minimumWidth) {
                        m32223c2 = minimumWidth;
                    }
                    int i8 = divLayoutParams.f33963h;
                    if (m32223c2 > i8) {
                        m32223c2 = i8;
                    }
                    m17157A(view2, i5, m32223c2);
                    this.f33006i = ViewGroup.combineMeasuredStates(this.f33006i, view2.getMeasuredState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE & (-16777216));
                    this.f33005h -= m17409a;
                    i7 -= view2.getMeasuredWidth() - measuredWidth;
                }
            }
            final Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.f63349b = size;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.f63348b = this.f33017t;
            this.f33015r = i4;
            this.f33000c = -1;
            this.f33001d = -1;
            m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureMatchParentWidthChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view3) {
                    View child = view3;
                    Intrinsics.m32179h(child, "child");
                    DivViewGroup.Companion companion = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                    if (((ViewGroup.MarginLayoutParams) divLayoutParams2).width == -1) {
                        if (size > 0) {
                            float m17155g = LinearContainerLayout.m17155g(this, divLayoutParams2) * intRef3.f63349b;
                            Ref.FloatRef floatRef2 = floatRef;
                            float f2 = floatRef2.f63348b;
                            int i9 = (int) (m17155g / f2);
                            floatRef2.f63348b = f2 - LinearContainerLayout.m17155g(this, divLayoutParams2);
                            intRef3.f63349b -= i9;
                            this.m17157A(child, i5, i9);
                        } else {
                            LinearContainerLayout linearContainerLayout = this;
                            int i10 = i5;
                            KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                            linearContainerLayout.m17157A(child, i10, 0);
                        }
                    }
                    LinearContainerLayout linearContainerLayout2 = this;
                    int i11 = i5;
                    int m17410b = divLayoutParams2.m17410b() + child.getMeasuredHeight();
                    KProperty<Object>[] kPropertyArr2 = LinearContainerLayout.f32999u;
                    linearContainerLayout2.m17161E(i11, m17410b);
                    LinearContainerLayout linearContainerLayout3 = this;
                    linearContainerLayout3.f33004g = linearContainerLayout3.m17168p(linearContainerLayout3.f33004g, divLayoutParams2.m17409a() + child.getMeasuredWidth());
                    this.m17160D(child);
                    return Unit.f63088a;
                }
            });
            this.f33004g = getPaddingBottom() + getPaddingTop() + this.f33004g;
        }
        if (!m17190e2) {
            if (getAspectRatio() == 0.0f) {
                setParentCrossSizeIfNeeded(intRef.f63349b);
                m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureHorizontal$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view3) {
                        View it2 = view3;
                        Intrinsics.m32179h(it2, "it");
                        LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                        int i9 = intRef.f63349b;
                        boolean z2 = linearContainerLayout.f33015r == 0;
                        ViewGroup.LayoutParams layoutParams2 = it2.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                        if (((ViewGroup.MarginLayoutParams) divLayoutParams2).height == -1) {
                            if (z2) {
                                linearContainerLayout.f33015r = Math.max(linearContainerLayout.f33015r, divLayoutParams2.m17410b());
                            } else {
                                linearContainerLayout.m17157A(it2, i9, it2.getMeasuredWidth());
                                linearContainerLayout.m17161E(i9, divLayoutParams2.m17410b() + it2.getMeasuredHeight());
                            }
                        }
                        return Unit.f63088a;
                    }
                });
                int i9 = this.f33000c;
                if (i9 != -1) {
                    m17161E(intRef.f63349b, i9 + this.f33001d);
                }
                int i10 = this.f33015r;
                intRef2.f63349b = ViewGroup.resolveSize(i10 + (i10 == i4 ? 0 : getPaddingBottom() + getPaddingTop()), intRef.f63349b);
            }
        }
        m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureHorizontal$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it2 = view3;
                Intrinsics.m32179h(it2, "it");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                int m17193h2 = ViewsKt.m17193h(intRef2.f63349b);
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                Objects.requireNonNull(linearContainerLayout);
                ViewGroup.LayoutParams layoutParams2 = it2.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                int i11 = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).height;
                if (i11 == -1 || i11 == -3) {
                    linearContainerLayout.m17157A(it2, m17193h2, it2.getMeasuredWidth());
                }
                return Unit.f63088a;
            }
        });
        setMeasuredDimension(resolveSizeAndState, ViewGroup.resolveSizeAndState(intRef2.f63349b, intRef.f63349b, this.f33006i << 16));
    }

    /* renamed from: x */
    public final void m17176x(final int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        boolean z = View.MeasureSpec.getMode(i2) == 1073741824;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f63349b = (getAspectRatio() > 0.0f ? 1 : (getAspectRatio() == 0.0f ? 0 : -1)) == 0 ? i3 : z ? ViewsKt.m17193h(MathKt.m32223c(size / getAspectRatio())) : ViewsKt.m17193h(0);
        if (!z) {
            size = getSuggestedMinimumWidth();
        }
        int i4 = size < 0 ? 0 : size;
        this.f33015r = i4;
        m17166n(new Function2<View, Integer, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureVertical$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(View view, Integer num) {
                View child = view;
                int intValue = num.intValue();
                Intrinsics.m32179h(child, "child");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                if (linearContainerLayout.m17171s(intValue)) {
                    LinearContainerLayout linearContainerLayout2 = LinearContainerLayout.this;
                    linearContainerLayout2.f33004g += linearContainerLayout2.f33009l;
                }
                LinearContainerLayout linearContainerLayout3 = LinearContainerLayout.this;
                float f2 = linearContainerLayout3.f33017t;
                DivViewGroup.Companion companion = DivViewGroup.f33964b;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                linearContainerLayout3.f33017t = LinearContainerLayout.m17156i(linearContainerLayout3, (DivLayoutParams) layoutParams) + f2;
                LinearContainerLayout linearContainerLayout4 = LinearContainerLayout.this;
                int i5 = i2;
                int i6 = intRef.f63349b;
                Objects.requireNonNull(linearContainerLayout4);
                ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams2;
                boolean m17190e = ViewsKt.m17190e(i5);
                boolean m17172t = linearContainerLayout4.m17172t(child, i6);
                if (m17190e ? m17172t : ((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    linearContainerLayout4.m17177y(child, i5, i6, true, true);
                } else {
                    if (!m17190e) {
                        linearContainerLayout4.f33016s.add(child);
                    }
                    if (!m17172t) {
                        linearContainerLayout4.f33014q.add(child);
                    }
                }
                return Unit.f63088a;
            }
        });
        setParentCrossSizeIfNeeded(i2);
        int i5 = intRef.f63349b;
        if (!ViewsKt.m17190e(i2)) {
            if (this.f33015r != 0) {
                for (View view : this.f33016s) {
                    int i6 = this.f33015r;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    this.f33015r = Math.max(i6, ((DivLayoutParams) layoutParams).m17409a());
                }
            } else {
                for (View view2 : this.f33016s) {
                    m17177y(view2, i2, i5, true, false);
                    this.f33014q.remove(view2);
                }
            }
        }
        for (View view3 : this.f33016s) {
            int i7 = intRef.f63349b;
            if (m17172t(view3, i7)) {
                m17177y(view3, ViewsKt.m17193h(this.f33015r), i7, false, true);
                this.f33014q.remove(view3);
            }
        }
        m17165m(new Function1<View, Unit>() { // from class: com.yandex.div.core.widget.LinearContainerLayout$measureVertical$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view4) {
                View it = view4;
                Intrinsics.m32179h(it, "it");
                LinearContainerLayout linearContainerLayout = LinearContainerLayout.this;
                int i8 = intRef.f63349b;
                KProperty<Object>[] kPropertyArr = LinearContainerLayout.f32999u;
                if (!linearContainerLayout.m17172t(it, i8)) {
                    int i9 = linearContainerLayout.f33004g;
                    ViewGroup.LayoutParams layoutParams2 = it.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    linearContainerLayout.f33004g = linearContainerLayout.m17168p(i9, ((DivLayoutParams) layoutParams2).m17410b());
                }
                return Unit.f63088a;
            }
        });
        if (this.f33004g > 0 && m17171s(getChildCount())) {
            this.f33004g += this.f33009l;
        }
        this.f33004g = getPaddingBottom() + getPaddingTop() + this.f33004g;
        int size2 = View.MeasureSpec.getSize(intRef.f63349b);
        if (!(getAspectRatio() == 0.0f) && !z) {
            size2 = MathKt.m32223c((m17170r(this.f33015r, i4, i2) & 16777215) / getAspectRatio());
            int m17193h = ViewsKt.m17193h(size2);
            intRef.f63349b = m17193h;
            m17159C(i2, size2, m17193h, i4);
        } else if (!(getAspectRatio() == 0.0f) || ViewsKt.m17190e(intRef.f63349b)) {
            m17159C(i2, size2, intRef.f63349b, i4);
        } else {
            int max = Math.max(this.f33004g, getSuggestedMinimumHeight());
            if (ViewsKt.m17189d(intRef.f63349b) && this.f33017t > 0.0f) {
                max = Math.max(View.MeasureSpec.getSize(intRef.f63349b), max);
            }
            m17159C(i2, ViewGroup.resolveSize(max, intRef.f63349b), intRef.f63349b, i4);
            size2 = Math.max(this.f33004g, getSuggestedMinimumHeight());
        }
        setMeasuredDimension(m17170r(this.f33015r, i4, i2), ViewGroup.resolveSizeAndState(size2, intRef.f63349b, this.f33006i << 16));
    }

    /* renamed from: y */
    public final void m17177y(View view, int i2, int i3, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -3) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
            int i4 = divLayoutParams2.f33962g;
            ((ViewGroup.MarginLayoutParams) divLayoutParams2).height = -2;
            divLayoutParams2.f33962g = Integer.MAX_VALUE;
            measureChildWithMargins(view, i2, 0, i3, 0);
            ((ViewGroup.MarginLayoutParams) divLayoutParams2).height = -3;
            divLayoutParams2.f33962g = i4;
            if (z2) {
                this.f33005h = m17168p(this.f33005h, divLayoutParams2.m17410b() + view.getMeasuredHeight());
                if (!this.f33013p.contains(view)) {
                    this.f33013p.add(view);
                }
            }
        } else {
            measureChildWithMargins(view, i2, 0, i3, 0);
        }
        this.f33006i = ViewGroup.combineMeasuredStates(this.f33006i, view.getMeasuredState());
        if (z) {
            m17161E(i2, divLayoutParams.m17409a() + view.getMeasuredWidth());
        }
        if (z2 && m17172t(view, i3)) {
            this.f33004g = m17168p(this.f33004g, divLayoutParams.m17410b() + view.getMeasuredHeight());
        }
    }

    /* renamed from: z */
    public final boolean m17178z(int i2, int i3) {
        if (!ViewsKt.m17191f(i3)) {
            if (!this.f33014q.isEmpty()) {
                return true;
            }
            if (i2 > 0) {
                if (this.f33017t > 0.0f) {
                    return true;
                }
            } else if (i2 < 0 && this.f33005h > 0) {
                return true;
            }
        }
        return false;
    }
}
