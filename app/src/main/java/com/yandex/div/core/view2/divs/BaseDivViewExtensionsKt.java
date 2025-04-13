package com.yandex.div.core.view2.divs;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ViewOnClickListenerC2647d;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCircleShape;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivPivotPercentage;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientFixedCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeCenter;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.DivWrapContentSize;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.MergingSequence;
import kotlin.sequences.MergingSequence$iterator$1;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: BaseDivViewExtensions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class BaseDivViewExtensionsKt {

    /* compiled from: BaseDivViewExtensions.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31811a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f31812b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f31813c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f31814d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f31815e;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            iArr[0] = 1;
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            iArr[1] = 2;
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            iArr[2] = 3;
            f31811a = iArr;
            int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            iArr2[0] = 1;
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            iArr2[1] = 2;
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            iArr2[2] = 3;
            f31812b = iArr2;
            int[] iArr3 = new int[DivAlignmentVertical.values().length];
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            iArr3[0] = 1;
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            iArr3[1] = 2;
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            iArr3[2] = 3;
            f31813c = iArr3;
            int[] iArr4 = new int[DivContentAlignmentHorizontal.values().length];
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            iArr4[0] = 1;
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            iArr4[1] = 2;
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            iArr4[2] = 3;
            f31814d = iArr4;
            int[] iArr5 = new int[DivContentAlignmentVertical.values().length];
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            iArr5[0] = 1;
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            iArr5[1] = 2;
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            iArr5[2] = 3;
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            iArr5[3] = 4;
            f31815e = iArr5;
            int[] iArr6 = new int[DivImageScale.values().length];
            DivImageScale divImageScale = DivImageScale.FILL;
            iArr6[0] = 1;
            DivImageScale divImageScale2 = DivImageScale.FIT;
            iArr6[2] = 2;
            DivImageScale divImageScale3 = DivImageScale.STRETCH;
            iArr6[3] = 3;
            DivImageScale divImageScale4 = DivImageScale.NO_SCALE;
            iArr6[1] = 4;
            int[] iArr7 = new int[DivBlendMode.values().length];
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            iArr7[0] = 1;
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            iArr7[1] = 2;
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            iArr7[2] = 3;
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            iArr7[3] = 4;
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            iArr7[4] = 5;
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            iArr7[5] = 6;
            int[] iArr8 = new int[DivFontWeight.values().length];
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            iArr8[0] = 1;
            DivFontWeight divFontWeight2 = DivFontWeight.REGULAR;
            iArr8[2] = 2;
            DivFontWeight divFontWeight3 = DivFontWeight.MEDIUM;
            iArr8[1] = 3;
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            iArr8[3] = 4;
        }
    }

    @NotNull
    /* renamed from: A */
    public static final List<DivVisibilityAction> m16911A(@NotNull DivBase divBase) {
        Intrinsics.m32179h(divBase, "<this>");
        List<DivVisibilityAction> mo17569c = divBase.mo17569c();
        if (mo17569c != null) {
            return mo17569c;
        }
        DivVisibilityAction f39959x = divBase.getF39959X();
        List<DivVisibilityAction> m31993F = f39959x == null ? null : CollectionsKt.m31993F(f39959x);
        return m31993F == null ? EmptyList.f63144b : m31993F;
    }

    /* renamed from: B */
    public static final boolean m16912B(@NotNull DivBase divBase) {
        Intrinsics.m32179h(divBase, "<this>");
        if (divBase.getF39959X() != null) {
            return true;
        }
        List<DivVisibilityAction> mo17569c = divBase.mo17569c();
        return !(mo17569c == null || mo17569c.isEmpty());
    }

    /* renamed from: C */
    public static final float m16913C(int i2, DivPivot divPivot, ExpressionResolver expressionResolver) {
        JSONSerializable jSONSerializable;
        Long mo17535b;
        Objects.requireNonNull(divPivot);
        if (divPivot instanceof DivPivot.Fixed) {
            jSONSerializable = ((DivPivot.Fixed) divPivot).f38031c;
        } else {
            if (!(divPivot instanceof DivPivot.Percentage)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONSerializable = ((DivPivot.Percentage) divPivot).f38032c;
        }
        if (!(jSONSerializable instanceof DivPivotFixed)) {
            return jSONSerializable instanceof DivPivotPercentage ? i2 * (((float) ((DivPivotPercentage) jSONSerializable).f38052a.mo17535b(expressionResolver).doubleValue()) / 100.0f) : i2 / 2.0f;
        }
        DivPivotFixed divPivotFixed = (DivPivotFixed) jSONSerializable;
        Expression<Long> expression = divPivotFixed.f38037b;
        Float f2 = null;
        if (expression != null && (mo17535b = expression.mo17535b(expressionResolver)) != null) {
            f2 = Float.valueOf(mo17535b.longValue());
        }
        if (f2 == null) {
            return i2 / 2.0f;
        }
        float floatValue = f2.floatValue();
        int ordinal = divPivotFixed.f38036a.mo17535b(expressionResolver).ordinal();
        if (ordinal == 0) {
            return SizeKt.m17395a(floatValue);
        }
        if (ordinal == 1) {
            return floatValue * SizeKt.f33901a.scaledDensity;
        }
        if (ordinal == 2) {
            return floatValue;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: D */
    public static final Typeface m16914D(@NotNull DivFontWeight fontWeight, @NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.m32179h(fontWeight, "fontWeight");
        Intrinsics.m32179h(typefaceProvider, "typefaceProvider");
        int ordinal = fontWeight.ordinal();
        if (ordinal == 0) {
            Typeface light = typefaceProvider.getLight();
            if (light != null) {
                return light;
            }
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.m32178g(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        if (ordinal == 1) {
            Typeface medium = typefaceProvider.getMedium();
            if (medium != null) {
                return medium;
            }
            Typeface DEFAULT2 = Typeface.DEFAULT;
            Intrinsics.m32178g(DEFAULT2, "DEFAULT");
            return DEFAULT2;
        }
        if (ordinal == 2) {
            Typeface regular = typefaceProvider.getRegular();
            if (regular != null) {
                return regular;
            }
            Typeface DEFAULT3 = Typeface.DEFAULT;
            Intrinsics.m32178g(DEFAULT3, "DEFAULT");
            return DEFAULT3;
        }
        if (ordinal != 3) {
            Typeface regular2 = typefaceProvider.getRegular();
            if (regular2 != null) {
                return regular2;
            }
            Typeface DEFAULT4 = Typeface.DEFAULT;
            Intrinsics.m32178g(DEFAULT4, "DEFAULT");
            return DEFAULT4;
        }
        Typeface bold = typefaceProvider.getBold();
        if (bold != null) {
            return bold;
        }
        Typeface DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
        Intrinsics.m32178g(DEFAULT_BOLD, "DEFAULT_BOLD");
        return DEFAULT_BOLD;
    }

    /* renamed from: E */
    public static final float m16915E(@NotNull DivSize divSize, @NotNull ExpressionResolver expressionResolver) {
        Expression<Double> expression;
        Double mo17535b;
        Intrinsics.m32179h(divSize, "<this>");
        if (!(divSize instanceof DivSize.MatchParent) || (expression = ((DivSize.MatchParent) divSize).f38837c.f37711a) == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) {
            return 0.0f;
        }
        return (float) mo17535b.doubleValue();
    }

    /* renamed from: F */
    public static final boolean m16916F(@Nullable DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return divBorder.f34789a == null && divBorder.f34790b == null && Intrinsics.m32174c(divBorder.f34791c, Expression.f34334a.m17539a(Boolean.FALSE)) && divBorder.f34792d == null && divBorder.f34793e == null;
    }

    /* renamed from: G */
    public static final boolean m16917G(@NotNull DivContainer divContainer, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(divContainer, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        return divContainer.f34958y.mo17535b(resolver) == DivContainer.Orientation.HORIZONTAL;
    }

    /* renamed from: H */
    public static final boolean m16918H(@NotNull DivContainer divContainer, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(divContainer, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        if (divContainer.f34954u.mo17535b(resolver) == DivContainer.LayoutMode.WRAP && divContainer.f34958y.mo17535b(resolver) != DivContainer.Orientation.OVERLAP) {
            if (m16917G(divContainer, resolver)) {
                return m16959s(divContainer.f34933M, resolver);
            }
            if (m16959s(divContainer.f34951r, resolver)) {
                return true;
            }
            DivAspect divAspect = divContainer.f34941h;
            if (divAspect != null) {
                return true ^ (((float) divAspect.f34742a.mo17535b(resolver).doubleValue()) == 0.0f);
            }
        }
        return false;
    }

    /* renamed from: I */
    public static final void m16919I(@NotNull DivRadialGradientCenter divRadialGradientCenter, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.m32179h(divRadialGradientCenter, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(subscriber, "subscriber");
        Intrinsics.m32179h(callback, "callback");
        Object m17672a = divRadialGradientCenter.m17672a();
        if (m17672a instanceof DivRadialGradientFixedCenter) {
            DivRadialGradientFixedCenter divRadialGradientFixedCenter = (DivRadialGradientFixedCenter) m17672a;
            subscriber.mo16763e(divRadialGradientFixedCenter.f38101a.mo17537e(resolver, callback));
            subscriber.mo16763e(divRadialGradientFixedCenter.f38102b.mo17537e(resolver, callback));
        } else if (m17672a instanceof DivRadialGradientRelativeCenter) {
            subscriber.mo16763e(((DivRadialGradientRelativeCenter) m17672a).f38127a.mo17537e(resolver, callback));
        }
    }

    /* renamed from: J */
    public static final void m16920J(@NotNull DivRadialGradientRadius divRadialGradientRadius, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber subscriber, @NotNull Function1<Object, Unit> function1) {
        Intrinsics.m32179h(divRadialGradientRadius, "<this>");
        Intrinsics.m32179h(subscriber, "subscriber");
        Object m17677a = divRadialGradientRadius.m17677a();
        if (m17677a instanceof DivFixedSize) {
            DivFixedSize divFixedSize = (DivFixedSize) m17677a;
            subscriber.mo16763e(divFixedSize.f35794a.mo17537e(expressionResolver, function1));
            subscriber.mo16763e(divFixedSize.f35795b.mo17537e(expressionResolver, function1));
        } else if (m17677a instanceof DivRadialGradientRelativeRadius) {
            subscriber.mo16763e(((DivRadialGradientRelativeRadius) m17677a).f38136a.mo17537e(expressionResolver, function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public static final void m16921K(@NotNull final View view, @NotNull ExpressionResolver resolver, @Nullable DivAspect divAspect) {
        Intrinsics.m32179h(resolver, "resolver");
        if (view instanceof AspectView) {
            if ((divAspect == null ? null : divAspect.f34742a) == null) {
                ((AspectView) view).setAspectRatio(0.0f);
                return;
            }
            ExpressionSubscriber expressionSubscriber = view instanceof ExpressionSubscriber ? (ExpressionSubscriber) view : null;
            if (expressionSubscriber == null) {
                return;
            }
            expressionSubscriber.mo16763e(divAspect.f34742a.mo17538f(resolver, new Function1<Double, Unit>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$observeAspectRatio$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Double d) {
                    ((AspectView) view).setAspectRatio((float) d.doubleValue());
                    return Unit.f63088a;
                }
            }));
        }
    }

    /* renamed from: L */
    public static final void m16922L(@NotNull ExpressionSubscriber expressionSubscriber, @NotNull ExpressionResolver resolver, @NotNull final DivDrawable drawable, @NotNull final Function1<? super DivDrawable, Unit> function1) {
        Intrinsics.m32179h(expressionSubscriber, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(drawable, "drawable");
        function1.invoke(drawable);
        Function1<? super Integer, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$observeDrawable$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                function1.invoke(drawable);
                return Unit.f63088a;
            }
        };
        if (drawable instanceof DivDrawable.Shape) {
            DivShapeDrawable divShapeDrawable = ((DivDrawable.Shape) drawable).f35602c;
            expressionSubscriber.mo16763e(divShapeDrawable.f38813a.mo17537e(resolver, function12));
            m16925O(expressionSubscriber, resolver, divShapeDrawable.f38815c, function12);
            m16924N(expressionSubscriber, resolver, divShapeDrawable.f38814b, function12);
        }
    }

    /* renamed from: M */
    public static final void m16923M(@NotNull ExpressionSubscriber expressionSubscriber, @NotNull ExpressionResolver expressionResolver, @NotNull DivRoundedRectangleShape shape, @NotNull Function1<Object, Unit> function1) {
        Disposable mo17537e;
        Intrinsics.m32179h(shape, "shape");
        expressionSubscriber.mo16763e(shape.f38182d.f35795b.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(shape.f38182d.f35794a.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(shape.f38181c.f35795b.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(shape.f38181c.f35794a.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(shape.f38180b.f35795b.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(shape.f38180b.f35794a.mo17537e(expressionResolver, function1));
        Expression<Integer> expression = shape.f38179a;
        if (expression != null && (mo17537e = expression.mo17537e(expressionResolver, function1)) != null) {
            expressionSubscriber.mo16763e(mo17537e);
        }
        m16925O(expressionSubscriber, expressionResolver, shape.f38183e, function1);
    }

    /* renamed from: N */
    public static final void m16924N(@NotNull ExpressionSubscriber expressionSubscriber, @NotNull ExpressionResolver resolver, @NotNull DivShape shape, @NotNull Function1<Object, Unit> function1) {
        Disposable mo17537e;
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(shape, "shape");
        if (shape instanceof DivShape.RoundedRectangle) {
            m16923M(expressionSubscriber, resolver, ((DivShape.RoundedRectangle) shape).f38811c, function1);
            return;
        }
        if (shape instanceof DivShape.Circle) {
            DivCircleShape divCircleShape = ((DivShape.Circle) shape).f38809c;
            expressionSubscriber.mo16763e(divCircleShape.f34869b.f35795b.mo17537e(resolver, function1));
            expressionSubscriber.mo16763e(divCircleShape.f34869b.f35794a.mo17537e(resolver, function1));
            Expression<Integer> expression = divCircleShape.f34868a;
            if (expression != null && (mo17537e = expression.mo17537e(resolver, function1)) != null) {
                expressionSubscriber.mo16763e(mo17537e);
            }
            m16925O(expressionSubscriber, resolver, divCircleShape.f34870c, function1);
        }
    }

    /* renamed from: O */
    public static final void m16925O(ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, DivStroke divStroke, Function1<Object, Unit> function1) {
        if (divStroke == null) {
            return;
        }
        expressionSubscriber.mo16763e(divStroke.f39440a.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(divStroke.f39442c.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(divStroke.f39441b.mo17537e(expressionResolver, function1));
    }

    /* renamed from: P */
    public static final void m16926P(@NotNull View view, @NotNull Div2View div2View, @Nullable DivAnimation divAnimation, @Nullable DivGestureListener divGestureListener) {
        final GestureDetectorCompat gestureDetectorCompat;
        Intrinsics.m32179h(view, "<this>");
        final Function2<View, MotionEvent, Unit> m16899b = divAnimation == null ? null : UtilsKt.m16899b(divAnimation, div2View.getExpressionResolver(), view);
        if (divGestureListener != null) {
            if ((!(divGestureListener.f31644b == null && divGestureListener.f31645c == null) ? divGestureListener : null) != null) {
                gestureDetectorCompat = new GestureDetectorCompat(div2View.getContext(), divGestureListener);
                if (m16899b == null || gestureDetectorCompat != null) {
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: com.yandex.div.core.view2.divs.a
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View v, MotionEvent event) {
                            Function2 function2 = Function2.this;
                            GestureDetectorCompat gestureDetectorCompat2 = gestureDetectorCompat;
                            if (function2 != null) {
                                Intrinsics.m32178g(v, "v");
                                Intrinsics.m32178g(event, "event");
                                function2.invoke(v, event);
                            }
                            if (gestureDetectorCompat2 == null) {
                                return false;
                            }
                            return gestureDetectorCompat2.m2082a(event);
                        }
                    });
                } else {
                    view.setOnTouchListener(null);
                    return;
                }
            }
        }
        gestureDetectorCompat = null;
        if (m16899b == null) {
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.yandex.div.core.view2.divs.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View v, MotionEvent event) {
                Function2 function2 = Function2.this;
                GestureDetectorCompat gestureDetectorCompat2 = gestureDetectorCompat;
                if (function2 != null) {
                    Intrinsics.m32178g(v, "v");
                    Intrinsics.m32178g(event, "event");
                    function2.invoke(v, event);
                }
                if (gestureDetectorCompat2 == null) {
                    return false;
                }
                return gestureDetectorCompat2.m2082a(event);
            }
        });
    }

    /* renamed from: Q */
    public static final int m16927Q(@Nullable Long l2, @NotNull DisplayMetrics displayMetrics) {
        float f2;
        if (l2 == null) {
            f2 = 0.0f;
        } else {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            f2 = (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return MathKt.m32223c(TypedValue.applyDimension(2, f2, displayMetrics));
    }

    /* renamed from: R */
    public static final int m16928R(@NotNull DivSizeUnit divSizeUnit) {
        int ordinal = divSizeUnit.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* renamed from: S */
    public static final Drawable m16929S(@NotNull DivDrawable divDrawable, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver resolver) {
        Drawable circleDrawable;
        Expression<Long> expression;
        Long mo17535b;
        Expression<Integer> expression2;
        Expression<Long> expression3;
        Long mo17535b2;
        Expression<Integer> expression4;
        Intrinsics.m32179h(divDrawable, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        if (!(divDrawable instanceof DivDrawable.Shape)) {
            throw new NoWhenBranchMatchedException();
        }
        DivShapeDrawable divShapeDrawable = ((DivDrawable.Shape) divDrawable).f35602c;
        Intrinsics.m32179h(divShapeDrawable, "<this>");
        DivShape divShape = divShapeDrawable.f38814b;
        Float f2 = null;
        if (divShape instanceof DivShape.RoundedRectangle) {
            DivShape.RoundedRectangle roundedRectangle = (DivShape.RoundedRectangle) divShape;
            float m16938a0 = m16938a0(roundedRectangle.f38811c.f38182d, displayMetrics, resolver);
            float m16938a02 = m16938a0(roundedRectangle.f38811c.f38181c, displayMetrics, resolver);
            Expression<Integer> expression5 = roundedRectangle.f38811c.f38179a;
            if (expression5 == null) {
                expression5 = divShapeDrawable.f38813a;
            }
            int intValue = expression5.mo17535b(resolver).intValue();
            float m16938a03 = m16938a0(roundedRectangle.f38811c.f38180b, displayMetrics, resolver);
            DivStroke divStroke = roundedRectangle.f38811c.f38183e;
            if (divStroke == null) {
                divStroke = divShapeDrawable.f38815c;
            }
            Integer mo17535b3 = (divStroke == null || (expression4 = divStroke.f39440a) == null) ? null : expression4.mo17535b(resolver);
            DivStroke divStroke2 = roundedRectangle.f38811c.f38183e;
            if (divStroke2 == null) {
                divStroke2 = divShapeDrawable.f38815c;
            }
            if (divStroke2 != null && (expression3 = divStroke2.f39442c) != null && (mo17535b2 = expression3.mo17535b(resolver)) != null) {
                f2 = Float.valueOf(mo17535b2.longValue());
            }
            circleDrawable = new RoundedRectDrawable(new RoundedRectDrawable.Params(m16938a0, m16938a02, intValue, m16938a03, mo17535b3, f2));
        } else {
            if (!(divShape instanceof DivShape.Circle)) {
                return null;
            }
            DivShape.Circle circle = (DivShape.Circle) divShape;
            float m16938a04 = m16938a0(circle.f38809c.f34869b, displayMetrics, resolver);
            Expression<Integer> expression6 = circle.f38809c.f34868a;
            if (expression6 == null) {
                expression6 = divShapeDrawable.f38813a;
            }
            int intValue2 = expression6.mo17535b(resolver).intValue();
            DivStroke divStroke3 = circle.f38809c.f34870c;
            if (divStroke3 == null) {
                divStroke3 = divShapeDrawable.f38815c;
            }
            Integer mo17535b4 = (divStroke3 == null || (expression2 = divStroke3.f39440a) == null) ? null : expression2.mo17535b(resolver);
            DivStroke divStroke4 = circle.f38809c.f34870c;
            if (divStroke4 == null) {
                divStroke4 = divShapeDrawable.f38815c;
            }
            if (divStroke4 != null && (expression = divStroke4.f39442c) != null && (mo17535b = expression.mo17535b(resolver)) != null) {
                f2 = Float.valueOf(mo17535b.longValue());
            }
            circleDrawable = new CircleDrawable(new CircleDrawable.Params(m16938a04, intValue2, mo17535b4, f2));
        }
        return circleDrawable;
    }

    @NotNull
    /* renamed from: T */
    public static final AspectImageView.Scale m16930T(@NotNull DivImageScale divImageScale) {
        int ordinal = divImageScale.ordinal();
        if (ordinal == 0) {
            return AspectImageView.Scale.FILL;
        }
        if (ordinal == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (ordinal == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (ordinal == 3) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: U */
    public static final int m16931U(@Nullable DivSize divSize, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.m32179h(metrics, "metrics");
        Intrinsics.m32179h(resolver, "resolver");
        if (divSize != null) {
            if (divSize instanceof DivSize.MatchParent) {
                return -1;
            }
            if (divSize instanceof DivSize.Fixed) {
                return m16935Y(((DivSize.Fixed) divSize).f38836c, metrics, resolver);
            }
            if (!(divSize instanceof DivSize.WrapContent)) {
                throw new NoWhenBranchMatchedException();
            }
            Expression<Boolean> expression = ((DivSize.WrapContent) divSize).f38838c.f40995a;
            boolean z = false;
            if (expression != null && expression.mo17535b(resolver).booleanValue()) {
                z = true;
            }
            if (z) {
                return layoutParams instanceof DivLayoutParams ? -3 : -1;
            }
        }
        return -2;
    }

    @NotNull
    /* renamed from: W */
    public static final PorterDuff.Mode m16933W(@NotNull DivBlendMode divBlendMode) {
        Intrinsics.m32179h(divBlendMode, "<this>");
        int ordinal = divBlendMode.ordinal();
        if (ordinal == 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (ordinal == 1) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (ordinal == 2) {
            return PorterDuff.Mode.DARKEN;
        }
        if (ordinal == 3) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (ordinal == 4) {
            return PorterDuff.Mode.MULTIPLY;
        }
        if (ordinal == 5) {
            return PorterDuff.Mode.SCREEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: X */
    public static final int m16934X(@NotNull DivDimension divDimension, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(metrics, "metrics");
        Intrinsics.m32179h(resolver, "resolver");
        int ordinal = divDimension.f35521a.mo17535b(resolver).ordinal();
        if (ordinal == 0) {
            Double mo17535b = divDimension.f35522b.mo17535b(resolver);
            return MathKt.m32223c(TypedValue.applyDimension(1, mo17535b != null ? (float) mo17535b.doubleValue() : 0.0f, metrics));
        }
        if (ordinal == 1) {
            Double mo17535b2 = divDimension.f35522b.mo17535b(resolver);
            return MathKt.m32223c(TypedValue.applyDimension(1, mo17535b2 != null ? (float) mo17535b2.doubleValue() : 0.0f, metrics));
        }
        if (ordinal == 2) {
            return (int) divDimension.f35522b.mo17535b(resolver).doubleValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: Y */
    public static final int m16935Y(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(divFixedSize, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        int ordinal = divFixedSize.f35794a.mo17535b(resolver).ordinal();
        if (ordinal == 0) {
            return m16961u(divFixedSize.f35795b.mo17535b(resolver), displayMetrics);
        }
        if (ordinal == 1) {
            return m16927Q(divFixedSize.f35795b.mo17535b(resolver), displayMetrics);
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        long longValue = divFixedSize.f35795b.mo17535b(resolver).longValue();
        long j2 = longValue >> 31;
        return (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    /* renamed from: Z */
    public static final int m16936Z(@NotNull DivWrapContentSize.ConstraintSize constraintSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int ordinal = constraintSize.f41004a.mo17535b(expressionResolver).ordinal();
        if (ordinal == 0) {
            return m16961u(constraintSize.f41005b.mo17535b(expressionResolver), displayMetrics);
        }
        if (ordinal == 1) {
            return m16927Q(constraintSize.f41005b.mo17535b(expressionResolver), displayMetrics);
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        long longValue = constraintSize.f41005b.mo17535b(expressionResolver).longValue();
        long j2 = longValue >> 31;
        return (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static final void m16937a(@NotNull View view, @Nullable DivAlignmentHorizontal divAlignmentHorizontal, @Nullable DivAlignmentVertical divAlignmentVertical) {
        Intrinsics.m32179h(view, "<this>");
        int m16964x = m16964x(divAlignmentHorizontal, divAlignmentVertical);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.f33956a != m16964x) {
                divLayoutParams.f33956a = m16964x;
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
        }
        boolean z = divAlignmentVertical == DivAlignmentVertical.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
        if (divLayoutParams2 == null || divLayoutParams2.f33957b == z) {
            return;
        }
        divLayoutParams2.f33957b = z;
        view.requestLayout();
    }

    /* renamed from: a0 */
    public static final float m16938a0(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(divFixedSize, "<this>");
        Intrinsics.m32179h(metrics, "metrics");
        Intrinsics.m32179h(resolver, "resolver");
        return m16966z(divFixedSize.f35795b.mo17535b(resolver).longValue(), divFixedSize.f35794a.mo17535b(resolver), metrics);
    }

    /* renamed from: b */
    public static final void m16939b(@NotNull View view, @Nullable String str, @Nullable String str2) {
        Intrinsics.m32179h(view, "<this>");
        if (str == null) {
            str = str2;
        } else if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) str);
            sb.append('\n');
            sb.append((Object) str2);
            str = sb.toString();
        }
        view.setContentDescription(str);
    }

    @MainThread
    /* renamed from: b0 */
    public static final void m16940b0(@NotNull final ViewGroup viewGroup, @NotNull final List<? extends Div> newDivs, @Nullable List<? extends Div> list, @NotNull final Div2View div2View) {
        Intrinsics.m32179h(newDivs, "newDivs");
        final DivVisibilityActionTracker mo16644p = div2View.getDiv2Component().mo16644p();
        Intrinsics.m32178g(mo16644p, "divView.div2Component.visibilityActionTracker");
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = newDivs.iterator();
            while (it.hasNext()) {
                CollectionsKt.m32020g(arrayList, m16911A(((Div) it.next()).m17557a()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((DivVisibilityAction) it2.next()).f40948b);
            }
            for (Div div : list) {
                List<DivVisibilityAction> m16911A = m16911A(div.m17557a());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : m16911A) {
                    if (!hashSet.contains(((DivVisibilityAction) obj).f40948b)) {
                        arrayList2.add(obj);
                    }
                }
                mo16644p.m16876d(div2View, null, div, arrayList2);
            }
        }
        if (!newDivs.isEmpty()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    MergingSequence$iterator$1 mergingSequence$iterator$1 = new MergingSequence$iterator$1((MergingSequence) SequencesKt.m33834D(ViewGroupKt.m2377b(viewGroup), CollectionsKt.m32028k(newDivs)));
                    while (mergingSequence$iterator$1.hasNext()) {
                        Pair pair = (Pair) mergingSequence$iterator$1.next();
                        mo16644p.m16876d(div2View, (View) pair.f63055b, r1, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(((Div) pair.f63056c).m17557a()) : null);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static final void m16941c(@NotNull final View view, @NotNull final Div2View div2View, @Nullable DivAction divAction, @Nullable List<? extends DivAction> list, @Nullable final List<? extends DivAction> list2, @Nullable final List<? extends DivAction> list3, @NotNull DivAnimation divAnimation) {
        Object obj;
        DivGestureListener divGestureListener;
        boolean z;
        boolean z2;
        List<? extends DivAction> list4;
        int i2;
        Object obj2;
        DivAnimation divAnimation2;
        Object obj3;
        DivAnimation actionAnimation = divAnimation;
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        final DivActionBinder mo16634f = div2View.getDiv2Component().mo16634f();
        Intrinsics.m32178g(mo16634f, "divView.div2Component.actionBinder");
        List<? extends DivAction> m31993F = list == null || list.isEmpty() ? divAction == null ? null : CollectionsKt.m31993F(divAction) : list;
        boolean isClickable = view.isClickable();
        boolean isLongClickable = view.isLongClickable();
        DivGestureListener divGestureListener2 = new DivGestureListener();
        boolean z3 = m31993F == null || m31993F.isEmpty();
        if (list2 == null || list2.isEmpty()) {
            if (!mo16634f.f31828d || z3) {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
            } else if (DivActionBinderKt.m16973a(view)) {
                view.setOnLongClickListener(new ViewOnLongClickListenerC2720d(mo16634f.f31831g, 17));
                view.setTag(C2507R.id.div_penetrating_longtap_tag, Boolean.TRUE);
            } else {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
                view.setTag(C2507R.id.div_penetrating_longtap_tag, null);
            }
            divGestureListener = divGestureListener2;
            z = isLongClickable;
            z2 = isClickable;
            list4 = m31993F;
        } else {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                List<DivAction.MenuItem> list5 = ((DivAction) obj).f34553c;
                if (((list5 == null || list5.isEmpty()) || mo16634f.f31829e) ? false : true) {
                    break;
                }
            }
            final DivAction divAction2 = (DivAction) obj;
            if (divAction2 != null) {
                List<DivAction.MenuItem> list6 = divAction2.f34553c;
                if (list6 == null) {
                    divGestureListener = divGestureListener2;
                    z = isLongClickable;
                    z2 = isClickable;
                    list4 = m31993F;
                    i2 = C2507R.id.div_penetrating_longtap_tag;
                } else {
                    final OverflowMenuWrapper overflowMenuWrapper = new OverflowMenuWrapper(view.getContext(), view, div2View);
                    overflowMenuWrapper.f34092b = new DivActionBinder.MenuWrapperListener(mo16634f, div2View, list6);
                    div2View.m16817r();
                    div2View.m16804B(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapper));
                    i2 = C2507R.id.div_penetrating_longtap_tag;
                    divGestureListener = divGestureListener2;
                    z = isLongClickable;
                    z2 = isClickable;
                    list4 = m31993F;
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.d
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            DivActionBinder this$0 = DivActionBinder.this;
                            DivAction divAction3 = divAction2;
                            Div2View divView = div2View;
                            OverflowMenuWrapper overflowMenuWrapper2 = overflowMenuWrapper;
                            View target = view;
                            List list7 = list2;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(divView, "$divView");
                            Intrinsics.m32179h(overflowMenuWrapper2, "$overflowMenuWrapper");
                            Intrinsics.m32179h(target, "$target");
                            String uuid = UUID.randomUUID().toString();
                            Intrinsics.m32178g(uuid, "randomUUID().toString()");
                            this$0.f31827c.m16967a(divAction3, divView.getExpressionResolver());
                            ((ViewOnClickListenerC2744a) overflowMenuWrapper2.m17445a()).onClick(target);
                            Iterator it2 = list7.iterator();
                            while (it2.hasNext()) {
                                this$0.f31826b.mo16575j(divView, target, (DivAction) it2.next(), uuid);
                            }
                            return true;
                        }
                    });
                }
            } else {
                divGestureListener = divGestureListener2;
                z = isLongClickable;
                z2 = isClickable;
                list4 = m31993F;
                i2 = C2507R.id.div_penetrating_longtap_tag;
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.c
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        DivActionBinder this$0 = DivActionBinder.this;
                        Div2View divView = div2View;
                        View target = view;
                        List<? extends DivAction> list7 = list2;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(divView, "$divView");
                        Intrinsics.m32179h(target, "$target");
                        this$0.m16971c(divView, target, list7, "long_click");
                        return true;
                    }
                });
            }
            if (mo16634f.f31828d) {
                view.setTag(i2, Boolean.TRUE);
            }
        }
        if (list3 == null || list3.isEmpty()) {
            divGestureListener.f31645c = null;
        } else {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it2.next();
                List<DivAction.MenuItem> list7 = ((DivAction) next).f34553c;
                if (((list7 == null || list7.isEmpty()) || mo16634f.f31829e) ? false : true) {
                    obj2 = next;
                    break;
                }
            }
            final DivAction divAction3 = (DivAction) obj2;
            if (divAction3 != null) {
                List<DivAction.MenuItem> list8 = divAction3.f34553c;
                if (list8 != null) {
                    final OverflowMenuWrapper overflowMenuWrapper2 = new OverflowMenuWrapper(view.getContext(), view, div2View);
                    overflowMenuWrapper2.f34092b = new DivActionBinder.MenuWrapperListener(mo16634f, div2View, list8);
                    div2View.m16817r();
                    div2View.m16804B(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapper2));
                    divGestureListener.f31645c = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            DivActionBinder.this.f31826b.mo16583r(div2View, view, divAction3);
                            DivActionBinder.this.f31827c.m16967a(divAction3, div2View.getExpressionResolver());
                            ((ViewOnClickListenerC2744a) overflowMenuWrapper2.m17445a()).onClick(view);
                            return Unit.f63088a;
                        }
                    };
                }
            } else {
                divGestureListener.f31645c = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        DivActionBinder.this.m16971c(div2View, view, list3, "double_click");
                        return Unit.f63088a;
                    }
                };
            }
        }
        boolean z4 = mo16634f.f31829e;
        List<? extends DivAction> list9 = list4;
        if (list9 == null || list9.isEmpty()) {
            divAnimation2 = null;
            divGestureListener.f31644b = null;
            view.setOnClickListener(null);
            view.setClickable(false);
        } else {
            divAnimation2 = null;
            Iterator<T> it3 = list9.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                Object next2 = it3.next();
                List<DivAction.MenuItem> list10 = ((DivAction) next2).f34553c;
                if (((list10 == null || list10.isEmpty()) || z4) ? false : true) {
                    obj3 = next2;
                    break;
                }
            }
            final DivAction divAction4 = (DivAction) obj3;
            if (divAction4 != null) {
                List<DivAction.MenuItem> list11 = divAction4.f34553c;
                if (list11 != null) {
                    final OverflowMenuWrapper overflowMenuWrapper3 = new OverflowMenuWrapper(view.getContext(), view, div2View);
                    overflowMenuWrapper3.f34092b = new DivActionBinder.MenuWrapperListener(mo16634f, div2View, list11);
                    div2View.m16817r();
                    div2View.m16804B(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapper3));
                    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.yandex.div.core.view2.divs.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DivActionBinder this$0 = DivActionBinder.this;
                            Div2View divView = div2View;
                            View target = view;
                            DivAction divAction5 = divAction4;
                            OverflowMenuWrapper overflowMenuWrapper4 = overflowMenuWrapper3;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(divView, "$divView");
                            Intrinsics.m32179h(target, "$target");
                            Intrinsics.m32179h(overflowMenuWrapper4, "$overflowMenuWrapper");
                            this$0.f31826b.mo16572g(divView, target, divAction5);
                            this$0.f31827c.m16967a(divAction5, divView.getExpressionResolver());
                            ((ViewOnClickListenerC2744a) overflowMenuWrapper4.m17445a()).onClick(target);
                        }
                    };
                    if (divGestureListener.f31645c != null) {
                        divGestureListener.f31644b = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public Unit invoke() {
                                onClickListener.onClick(view);
                                return Unit.f63088a;
                            }
                        };
                    } else {
                        view.setOnClickListener(onClickListener);
                    }
                }
            } else {
                final ViewOnClickListenerC2647d viewOnClickListenerC2647d = new ViewOnClickListenerC2647d(mo16634f, div2View, view, list9);
                if (divGestureListener.f31645c != null) {
                    divGestureListener.f31644b = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            viewOnClickListenerC2647d.onClick(view);
                            return Unit.f63088a;
                        }
                    };
                } else {
                    view.setOnClickListener(viewOnClickListenerC2647d);
                }
            }
        }
        if (com.yandex.div.internal.util.CollectionsKt.m17385a(list9, list2, list3)) {
            actionAnimation = divAnimation2;
        }
        m16926P(view, div2View, actionAnimation, divGestureListener);
        if (mo16634f.f31830f && DivAccessibility.Mode.MERGE == div2View.f31569w.get(view)) {
            Object parent = view.getParent();
            Object obj4 = parent instanceof View ? (View) parent : divAnimation2;
            if (obj4 != null && div2View.f31569w.get(obj4) == div2View.f31569w.get(view)) {
                view.setClickable(z2);
                view.setLongClickable(z);
            }
        }
    }

    /* renamed from: c0 */
    public static final int m16942c0(@Nullable Long l2, @NotNull DisplayMetrics metrics, @NotNull DivSizeUnit unit) {
        int i2;
        float f2;
        Intrinsics.m32179h(metrics, "metrics");
        Intrinsics.m32179h(unit, "unit");
        int m16928R = m16928R(unit);
        if (l2 == null) {
            f2 = 0.0f;
        } else {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue;
            } else {
                int i3 = Assert.f33709a;
                i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            f2 = i2;
        }
        return MathKt.m32223c(TypedValue.applyDimension(m16928R, f2, metrics));
    }

    /* renamed from: d */
    public static final void m16943d(@NotNull TextView textView, int i2, @NotNull DivSizeUnit unit) {
        Intrinsics.m32179h(textView, "<this>");
        Intrinsics.m32179h(unit, "unit");
        textView.setTextSize(m16928R(unit), i2);
    }

    @Nullable
    /* renamed from: d0 */
    public static final <T extends View & DivBorderSupports> DivBorderDrawer m16944d0(@NotNull T t, @Nullable DivBorder divBorder, @NotNull ExpressionResolver expressionResolver) {
        DivBorderDrawer f32775l = t.getF32775l();
        if (Intrinsics.m32174c(divBorder, f32775l == null ? null : f32775l.f32716e)) {
            return f32775l;
        }
        if (divBorder != null) {
            if (f32775l != null) {
                C6855a.m34406b(f32775l);
                f32775l.f32715d = expressionResolver;
                f32775l.f32716e = divBorder;
                f32775l.m17095m(expressionResolver, divBorder);
            } else if (m16916F(divBorder)) {
                t.setElevation(0.0f);
                t.setClipToOutline(true);
                t.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                DisplayMetrics displayMetrics = t.getResources().getDisplayMetrics();
                Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                f32775l = new DivBorderDrawer(displayMetrics, t, expressionResolver, divBorder);
            }
            t.invalidate();
            return f32775l;
        }
        if (f32775l != null) {
            C6855a.m34406b(f32775l);
        }
        t.setElevation(0.0f);
        t.setClipToOutline(false);
        t.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        f32775l = null;
        t.invalidate();
        return f32775l;
    }

    /* renamed from: e */
    public static final void m16945e(@NotNull View view, @NotNull DivBase div, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        DivSize f39983v = div.getF39983v();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
        int m16931U = m16931U(f39983v, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().height != m16931U) {
            view.getLayoutParams().height = m16931U;
            view.requestLayout();
        }
        m16955o(view, div, resolver);
    }

    /* renamed from: f */
    public static final void m16946f(@NotNull View view, float f2) {
        Intrinsics.m32179h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (divLayoutParams.f33959d == f2) {
            return;
        }
        divLayoutParams.f33959d = f2;
        view.requestLayout();
    }

    /* renamed from: g */
    public static final void m16947g(@NotNull TextView textView, double d, int i2) {
        Intrinsics.m32179h(textView, "<this>");
        textView.setLetterSpacing(((float) d) / i2);
    }

    /* renamed from: h */
    public static final void m16948h(@NotNull TextView textView, @Nullable Long l2, @NotNull DivSizeUnit unit) {
        int m16942c0;
        Intrinsics.m32179h(textView, "<this>");
        Intrinsics.m32179h(unit, "unit");
        if (l2 == null) {
            m16942c0 = 0;
        } else {
            Long valueOf = Long.valueOf(l2.longValue());
            DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            m16942c0 = m16942c0(valueOf, displayMetrics, unit) - textView.getPaint().getFontMetricsInt(null);
        }
        textView.setLineSpacing(m16942c0, 1.0f);
    }

    /* renamed from: i */
    public static final void m16949i(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver resolver) {
        int i2;
        int i3;
        int i4;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i5 = 0;
        if (divEdgeInsets != null) {
            DivSizeUnit mo17535b = divEdgeInsets.f35623e.mo17535b(resolver);
            Long mo17535b2 = divEdgeInsets.f35620b.mo17535b(resolver);
            Intrinsics.m32178g(metrics, "metrics");
            int m16942c0 = m16942c0(mo17535b2, metrics, mo17535b);
            i3 = m16942c0(divEdgeInsets.f35622d.mo17535b(resolver), metrics, mo17535b);
            i4 = m16942c0(divEdgeInsets.f35621c.mo17535b(resolver), metrics, mo17535b);
            i2 = m16942c0(divEdgeInsets.f35619a.mo17535b(resolver), metrics, mo17535b);
            i5 = m16942c0;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (marginLayoutParams.leftMargin == i5 && marginLayoutParams.topMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.bottomMargin == i2) {
            return;
        }
        marginLayoutParams.leftMargin = i5;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.rightMargin = i4;
        marginLayoutParams.bottomMargin = i2;
        view.requestLayout();
    }

    /* renamed from: j */
    public static final void m16950j(@NotNull View view, @Nullable DivWrapContentSize.ConstraintSize constraintSize, @NotNull ExpressionResolver resolver) {
        int m16936Z;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (constraintSize == null) {
            m16936Z = Integer.MAX_VALUE;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            m16936Z = m16936Z(constraintSize, displayMetrics, resolver);
        }
        if (divLayoutParams.f33962g != m16936Z) {
            divLayoutParams.f33962g = m16936Z;
            view.requestLayout();
        }
    }

    /* renamed from: k */
    public static final void m16951k(@NotNull View view, @Nullable DivWrapContentSize.ConstraintSize constraintSize, @NotNull ExpressionResolver resolver) {
        int m16936Z;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (constraintSize == null) {
            m16936Z = Integer.MAX_VALUE;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            m16936Z = m16936Z(constraintSize, displayMetrics, resolver);
        }
        if (divLayoutParams.f33963h != m16936Z) {
            divLayoutParams.f33963h = m16936Z;
            view.requestLayout();
        }
    }

    /* renamed from: l */
    public static final void m16952l(@NotNull View view, @Nullable DivWrapContentSize.ConstraintSize constraintSize, @NotNull ExpressionResolver resolver) {
        int m16936Z;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        if (constraintSize == null) {
            m16936Z = 0;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            m16936Z = m16936Z(constraintSize, displayMetrics, resolver);
        }
        if (view.getMinimumHeight() != m16936Z) {
            view.setMinimumHeight(m16936Z);
            view.requestLayout();
        }
    }

    /* renamed from: m */
    public static final void m16953m(@NotNull View view, @Nullable DivWrapContentSize.ConstraintSize constraintSize, @NotNull ExpressionResolver resolver) {
        int m16936Z;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        if (constraintSize == null) {
            m16936Z = 0;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            m16936Z = m16936Z(constraintSize, displayMetrics, resolver);
        }
        if (view.getMinimumWidth() != m16936Z) {
            view.setMinimumWidth(m16936Z);
            view.requestLayout();
        }
    }

    /* renamed from: n */
    public static final void m16954n(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver resolver) {
        int i2;
        int i3;
        int i4;
        Expression<DivSizeUnit> expression;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(resolver, "resolver");
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnit = null;
        if (divEdgeInsets != null && (expression = divEdgeInsets.f35623e) != null) {
            divSizeUnit = expression.mo17535b(resolver);
        }
        int i5 = divSizeUnit == null ? -1 : WhenMappings.f31811a[divSizeUnit.ordinal()];
        if (i5 == 1) {
            Long mo17535b = divEdgeInsets.f35620b.mo17535b(resolver);
            Intrinsics.m32178g(metrics, "metrics");
            view.setPadding(m16961u(mo17535b, metrics), m16961u(divEdgeInsets.f35622d.mo17535b(resolver), metrics), m16961u(divEdgeInsets.f35621c.mo17535b(resolver), metrics), m16961u(divEdgeInsets.f35619a.mo17535b(resolver), metrics));
            return;
        }
        if (i5 == 2) {
            Long mo17535b2 = divEdgeInsets.f35620b.mo17535b(resolver);
            Intrinsics.m32178g(metrics, "metrics");
            view.setPadding(m16927Q(mo17535b2, metrics), m16927Q(divEdgeInsets.f35622d.mo17535b(resolver), metrics), m16927Q(divEdgeInsets.f35621c.mo17535b(resolver), metrics), m16927Q(divEdgeInsets.f35619a.mo17535b(resolver), metrics));
            return;
        }
        if (i5 != 3) {
            return;
        }
        long longValue = divEdgeInsets.f35620b.mo17535b(resolver).longValue();
        long j2 = longValue >> 31;
        int i6 = Integer.MAX_VALUE;
        if (j2 == 0 || j2 == -1) {
            i2 = (int) longValue;
        } else {
            int i7 = Assert.f33709a;
            i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue2 = divEdgeInsets.f35622d.mo17535b(resolver).longValue();
        long j3 = longValue2 >> 31;
        if (j3 == 0 || j3 == -1) {
            i3 = (int) longValue2;
        } else {
            int i8 = Assert.f33709a;
            i3 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = divEdgeInsets.f35621c.mo17535b(resolver).longValue();
        long j4 = longValue3 >> 31;
        if (j4 == 0 || j4 == -1) {
            i4 = (int) longValue3;
        } else {
            int i9 = Assert.f33709a;
            i4 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue4 = divEdgeInsets.f35619a.mo17535b(resolver).longValue();
        long j5 = longValue4 >> 31;
        if (j5 == 0 || j5 == -1) {
            i6 = (int) longValue4;
        } else {
            int i10 = Assert.f33709a;
            if (longValue4 <= 0) {
                i6 = Integer.MIN_VALUE;
            }
        }
        view.setPadding(i2, i3, i4, i6);
    }

    /* renamed from: o */
    public static final void m16955o(@NotNull final View view, @NotNull final DivBase div, @NotNull final ExpressionResolver resolver) {
        Double mo17535b;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        Expression<Double> expression = div.getF39952Q().f40557c;
        float f2 = 0.0f;
        if (expression != null && (mo17535b = expression.mo17535b(resolver)) != null) {
            f2 = (float) mo17535b.doubleValue();
        }
        view.setRotation(f2);
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.m2149a(view, new Runnable(view, view, div, resolver) { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1

                /* renamed from: b */
                public final /* synthetic */ View f31804b;

                /* renamed from: c */
                public final /* synthetic */ DivBase f31805c;

                /* renamed from: d */
                public final /* synthetic */ ExpressionResolver f31806d;

                {
                    this.f31804b = view;
                    this.f31805c = div;
                    this.f31806d = resolver;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = this.f31804b;
                    view2.setPivotX(BaseDivViewExtensionsKt.m16913C(view2.getWidth(), this.f31805c.getF39952Q().f40555a, this.f31806d));
                    View view3 = this.f31804b;
                    view3.setPivotY(BaseDivViewExtensionsKt.m16913C(view3.getHeight(), this.f31805c.getF39952Q().f40556b, this.f31806d));
                }
            });
        } else {
            view.setPivotX(m16913C(view.getWidth(), div.getF39952Q().f40555a, resolver));
            view.setPivotY(m16913C(view.getHeight(), div.getF39952Q().f40556b, resolver));
        }
    }

    /* renamed from: p */
    public static final void m16956p(@NotNull View view, float f2) {
        Intrinsics.m32179h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (divLayoutParams.f33958c == f2) {
            return;
        }
        divLayoutParams.f33958c = f2;
        view.requestLayout();
    }

    /* renamed from: q */
    public static final void m16957q(@NotNull View view, @NotNull DivBase div, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        DivSize f39961z = div.getF39961Z();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
        int m16931U = m16931U(f39961z, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().width != m16931U) {
            view.getLayoutParams().width = m16931U;
            view.requestLayout();
        }
        m16955o(view, div, resolver);
    }

    /* renamed from: r */
    public static final void m16958r(@NotNull View view, @NotNull DivBase div, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        try {
            m16957q(view, div, resolver);
            m16945e(view, div, resolver);
            Expression<DivAlignmentHorizontal> mo17579m = div.mo17579m();
            DivAlignmentVertical divAlignmentVertical = null;
            DivAlignmentHorizontal mo17535b = mo17579m == null ? null : mo17579m.mo17535b(resolver);
            Expression<DivAlignmentVertical> mo17583q = div.mo17583q();
            if (mo17583q != null) {
                divAlignmentVertical = mo17583q.mo17535b(resolver);
            }
            m16937a(view, mo17535b, divAlignmentVertical);
        } catch (ParsingException e2) {
            if (!ExpressionFallbacksHelperKt.m16669a(e2)) {
                throw e2;
            }
        }
    }

    /* renamed from: s */
    public static final boolean m16959s(@NotNull DivSize divSize, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.m32179h(divSize, "<this>");
        if (divSize instanceof DivSize.WrapContent) {
            Expression<Boolean> expression = ((DivSize.WrapContent) divSize).f38838c.f40995a;
            if (!(expression != null && expression.mo17535b(expressionResolver).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: t */
    public static final IndicatorParams.Shape m16960t(int i2, float f2, float f3, float f4, float f5, @Nullable Float f6, @Nullable Integer num) {
        return new IndicatorParams.Shape.RoundedRect(i2, new IndicatorParams.ItemSize.RoundedRect(f2 * f5, f3 * f5, f4 * f5), f6 == null ? 0.0f : f6.floatValue(), num == null ? 0 : num.intValue());
    }

    /* renamed from: u */
    public static final int m16961u(@Nullable Long l2, @NotNull DisplayMetrics metrics) {
        int i2;
        float f2;
        Intrinsics.m32179h(metrics, "metrics");
        if (l2 == null) {
            f2 = 0.0f;
        } else {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue;
            } else {
                int i3 = Assert.f33709a;
                i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            f2 = i2;
        }
        return MathKt.m32223c(TypedValue.applyDimension(1, f2, metrics));
    }

    /* renamed from: v */
    public static final float m16962v(@Nullable Long l2, @NotNull DisplayMetrics metrics) {
        Intrinsics.m32179h(metrics, "metrics");
        return TypedValue.applyDimension(1, l2 == null ? 0.0f : l2.longValue(), metrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final void m16963w(@NotNull ViewGroup viewGroup, @NotNull Canvas canvas) {
        DivBorderDrawer f32775l;
        int m33837e = SequencesKt.m33837e(ViewGroupKt.m2377b(viewGroup));
        int i2 = 0;
        while (i2 < m33837e) {
            int i3 = i2 + 1;
            View view = (View) SequencesKt.m33839g(ViewGroupKt.m2377b(viewGroup), i2);
            float x = view.getX();
            float y = view.getY();
            int save = canvas.save();
            canvas.translate(x, y);
            try {
                DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
                if (divBorderSupports != null && (f32775l = divBorderSupports.getF32775l()) != null) {
                    f32775l.m17089f(canvas);
                }
                canvas.restoreToCount(save);
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m16964x(@org.jetbrains.annotations.Nullable com.yandex.div2.DivAlignmentHorizontal r4, @org.jetbrains.annotations.Nullable com.yandex.div2.DivAlignmentVertical r5) {
        /*
            r0 = -1
            if (r4 != 0) goto L5
            r4 = -1
            goto Ld
        L5:
            int[] r1 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.WhenMappings.f31812b
            int r4 = r4.ordinal()
            r4 = r1[r4]
        Ld:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r4 == r2) goto L1b
            if (r4 == r1) goto L19
            if (r4 == r3) goto L17
            goto L1b
        L17:
            r4 = 5
            goto L1c
        L19:
            r4 = 1
            goto L1c
        L1b:
            r4 = 3
        L1c:
            if (r5 != 0) goto L1f
            goto L27
        L1f:
            int[] r0 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.WhenMappings.f31813c
            int r5 = r5.ordinal()
            r0 = r0[r5]
        L27:
            r5 = 48
            if (r0 == r2) goto L35
            if (r0 == r1) goto L33
            if (r0 == r3) goto L30
            goto L35
        L30:
            r5 = 80
            goto L35
        L33:
            r5 = 16
        L35:
            r4 = r4 | r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.m16964x(com.yandex.div2.DivAlignmentHorizontal, com.yandex.div2.DivAlignmentVertical):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m16965y(@org.jetbrains.annotations.Nullable com.yandex.div2.DivContentAlignmentHorizontal r4, @org.jetbrains.annotations.Nullable com.yandex.div2.DivContentAlignmentVertical r5) {
        /*
            r0 = -1
            if (r4 != 0) goto L5
            r4 = -1
            goto Ld
        L5:
            int[] r1 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.WhenMappings.f31814d
            int r4 = r4.ordinal()
            r4 = r1[r4]
        Ld:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r4 == r2) goto L1b
            if (r4 == r1) goto L19
            if (r4 == r3) goto L17
            goto L1b
        L17:
            r4 = 5
            goto L1c
        L19:
            r4 = 1
            goto L1c
        L1b:
            r4 = 3
        L1c:
            if (r5 != 0) goto L1f
            goto L27
        L1f:
            int[] r0 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.WhenMappings.f31815e
            int r5 = r5.ordinal()
            r0 = r0[r5]
        L27:
            r5 = 48
            if (r0 == r2) goto L35
            if (r0 == r1) goto L33
            if (r0 == r3) goto L30
            goto L35
        L30:
            r5 = 80
            goto L35
        L33:
            r5 = 16
        L35:
            r4 = r4 | r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.m16965y(com.yandex.div2.DivContentAlignmentHorizontal, com.yandex.div2.DivContentAlignmentVertical):int");
    }

    /* renamed from: z */
    public static final float m16966z(long j2, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int ordinal = divSizeUnit.ordinal();
        if (ordinal == 0) {
            return m16962v(Long.valueOf(j2), displayMetrics);
        }
        if (ordinal == 1) {
            return TypedValue.applyDimension(2, Long.valueOf(j2) == null ? 0.0f : r2.longValue(), displayMetrics);
        }
        if (ordinal == 2) {
            return j2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
