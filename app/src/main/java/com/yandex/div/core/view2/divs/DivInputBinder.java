package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.util.DisplayMetrics;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskBase;
import com.yandex.div2.DivSizeUnit;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.PatternSyntaxException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;
import p035l.C6855a;

/* compiled from: DivInputBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivInputBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivInput;", "Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivInputBinder implements DivViewBinder<DivInput, DivInputView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32165a;

    /* renamed from: b */
    @NotNull
    public final DivTypefaceResolver f32166b;

    /* renamed from: c */
    @NotNull
    public final TwoWayStringVariableBinder f32167c;

    /* renamed from: d */
    @NotNull
    public final ErrorCollectors f32168d;

    /* compiled from: DivInputBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivInput.KeyboardType.values().length];
            DivInput.KeyboardType keyboardType = DivInput.KeyboardType.SINGLE_LINE_TEXT;
            iArr[0] = 1;
            DivInput.KeyboardType keyboardType2 = DivInput.KeyboardType.MULTI_LINE_TEXT;
            iArr[1] = 2;
            DivInput.KeyboardType keyboardType3 = DivInput.KeyboardType.EMAIL;
            iArr[4] = 3;
            DivInput.KeyboardType keyboardType4 = DivInput.KeyboardType.URI;
            iArr[5] = 4;
            DivInput.KeyboardType keyboardType5 = DivInput.KeyboardType.NUMBER;
            iArr[3] = 5;
            DivInput.KeyboardType keyboardType6 = DivInput.KeyboardType.PHONE;
            iArr[2] = 6;
        }
    }

    @Inject
    public DivInputBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull TwoWayStringVariableBinder variableBinder, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(typefaceResolver, "typefaceResolver");
        Intrinsics.m32179h(variableBinder, "variableBinder");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32165a = baseBinder;
        this.f32166b = typefaceResolver;
        this.f32167c = variableBinder;
        this.f32168d = errorCollectors;
    }

    /* renamed from: a */
    public final void m17011a(DivInputView divInputView, Long l2, DivSizeUnit divSizeUnit) {
        Integer valueOf;
        if (l2 == null) {
            valueOf = null;
        } else {
            DisplayMetrics displayMetrics = divInputView.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.m16942c0(l2, displayMetrics, divSizeUnit));
        }
        divInputView.setFixedLineHeight(valueOf);
        BaseDivViewExtensionsKt.m16948h(divInputView, l2, divSizeUnit);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    /* renamed from: b */
    public void m17012b(@NotNull final DivInputView view, @NotNull final DivInput div, @NotNull final Div2View divView) {
        Expression<String> expression;
        Disposable mo17537e;
        String str;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivInput div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32165a.m16988i(view, div2, divView);
        }
        final Drawable background = view.getBackground();
        this.f32165a.m16984e(view, div, div2, divView);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setTextAlignment(5);
        if (background != null) {
            DivInput.NativeInterface nativeInterface = div.f37364z;
            Expression<Integer> expression2 = nativeInterface == null ? null : nativeInterface.f37386a;
            if (expression2 != null) {
                C6855a.m34405a(view, expression2.mo17538f(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Integer num) {
                        int intValue = num.intValue();
                        DivInputBinder divInputBinder = DivInputBinder.this;
                        DivInputView view2 = view;
                        DivInput div3 = div;
                        Div2View divView2 = divView;
                        ExpressionResolver resolver = expressionResolver;
                        Drawable drawable = background;
                        Objects.requireNonNull(divInputBinder);
                        drawable.setTint(intValue);
                        DivBaseBinder divBaseBinder = divInputBinder.f32165a;
                        Objects.requireNonNull(divBaseBinder);
                        Intrinsics.m32179h(view2, "view");
                        Intrinsics.m32179h(div3, "div");
                        Intrinsics.m32179h(divView2, "divView");
                        Intrinsics.m32179h(resolver, "resolver");
                        List<DivBackground> mo17570d = div3.mo17570d();
                        DivFocus f39977p = div3.getF39977p();
                        divBaseBinder.m16987h(view2, divView2, mo17570d, f39977p == null ? null : f39977p.f35819a, resolver, ReleasablesKt.m16765a(view2), drawable);
                        BaseDivViewExtensionsKt.m16954n(view2, div3.getF39940E(), resolver);
                        return Unit.f63088a;
                    }
                }));
            }
        }
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFontSize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                int i2;
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputBinder divInputBinder = DivInputBinder.this;
                DivInputView divInputView = view;
                DivInput divInput = div;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Objects.requireNonNull(divInputBinder);
                long longValue = divInput.f37350l.mo17535b(expressionResolver2).longValue();
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i2 = (int) longValue;
                } else {
                    int i3 = Assert.f33709a;
                    i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                BaseDivViewExtensionsKt.m16943d(divInputView, i2, divInput.f37351m.mo17535b(expressionResolver2));
                BaseDivViewExtensionsKt.m16947g(divInputView, divInput.f37359u.mo17535b(expressionResolver2).doubleValue(), i2);
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f37350l.mo17538f(expressionResolver, function1));
        C6855a.m34405a(view, div.f37359u.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f37351m.mo17537e(expressionResolver, function1));
        Function1<? super DivFontFamily, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputView.this.setTypeface(this.f32166b.m16865a(div.f37349k.mo17535b(expressionResolver), div.f37352n.mo17535b(expressionResolver)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f37349k.mo17538f(expressionResolver, function12));
        C6855a.m34405a(view, div.f37352n.mo17537e(expressionResolver, function12));
        C6855a.m34405a(view, div.f37326E.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputView.this.setTextColor(div.f37326E.mo17535b(expressionResolver).intValue());
                return Unit.f63088a;
            }
        }));
        final DivSizeUnit mo17535b = div.f37351m.mo17535b(expressionResolver);
        final Expression<Long> expression3 = div.f37360v;
        if (expression3 == null) {
            m17011a(view, null, mo17535b);
        } else {
            C6855a.m34405a(view, expression3.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivInputBinder.this.m17011a(view, expression3.mo17535b(expressionResolver), mo17535b);
                    return Unit.f63088a;
                }
            }));
        }
        final Expression<Long> expression4 = div.f37363y;
        if (expression4 != null) {
            C6855a.m34405a(view, expression4.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    int i2;
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivInputView divInputView = DivInputView.this;
                    long longValue = expression4.mo17535b(expressionResolver).longValue();
                    long j2 = longValue >> 31;
                    if (j2 == 0 || j2 == -1) {
                        i2 = (int) longValue;
                    } else {
                        int i3 = Assert.f33709a;
                        i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    divInputView.setMaxLines(i2);
                    return Unit.f63088a;
                }
            }));
        }
        final Expression<String> expression5 = div.f37356r;
        if (expression5 != null) {
            C6855a.m34405a(view, expression5.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivInputView.this.setHint(expression5.mo17535b(expressionResolver));
                    return Unit.f63088a;
                }
            }));
        }
        C6855a.m34405a(view, div.f37355q.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputView.this.setHintTextColor(div.f37355q.mo17535b(expressionResolver).intValue());
                return Unit.f63088a;
            }
        }));
        final Expression<Integer> expression6 = div.f37354p;
        if (expression6 != null) {
            C6855a.m34405a(view, expression6.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivInputView.this.setHighlightColor(expression6.mo17535b(expressionResolver).intValue());
                    return Unit.f63088a;
                }
            }));
        }
        C6855a.m34405a(view, div.f37358t.mo17538f(expressionResolver, new Function1<DivInput.KeyboardType, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardType$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivInput.KeyboardType keyboardType) {
                DivInput.KeyboardType type = keyboardType;
                Intrinsics.m32179h(type, "type");
                DivInputBinder divInputBinder = DivInputBinder.this;
                DivInputView divInputView = view;
                Objects.requireNonNull(divInputBinder);
                int ordinal = type.ordinal();
                int i2 = 3;
                if (ordinal == 0) {
                    i2 = 1;
                } else if (ordinal == 1) {
                    i2 = 131073;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        i2 = 8194;
                    } else if (ordinal == 4) {
                        i2 = 33;
                    } else {
                        if (ordinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 17;
                    }
                }
                divInputView.setInputType(i2);
                view.setHorizontallyScrolling(type != DivInput.KeyboardType.MULTI_LINE_TEXT);
                return Unit.f63088a;
            }
        }));
        C6855a.m34405a(view, div.f37324C.mo17538f(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputView.this.setSelectAllOnFocus(div.f37324C.mo17535b(expressionResolver).booleanValue());
                return Unit.f63088a;
            }
        }));
        view.removeTextChangedListener(view.f32779p);
        view.f32779p = null;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Function1<BaseInputMask, Unit> function13 = new Function1<BaseInputMask, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, com.yandex.div.core.util.mask.BaseInputMask] */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(BaseInputMask baseInputMask) {
                BaseInputMask baseInputMask2 = baseInputMask;
                objectRef.f63351b = baseInputMask2;
                if (baseInputMask2 != 0) {
                    DivInputView divInputView = view;
                    divInputView.setText(baseInputMask2.m16778i());
                    divInputView.setSelection(baseInputMask2.f31475d);
                }
                return Unit.f63088a;
            }
        };
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final ErrorCollector m17115a = this.f32168d.m17115a(divView.getDataTag(), divView.getDivData());
        final KeyListener keyListener = view.getKeyListener();
        final Function2<Exception, Function0<? extends Unit>, Unit> function2 = new Function2<Exception, Function0<? extends Unit>, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(Exception exc, Function0<? extends Unit> function0) {
                Exception exception = exc;
                Function0<? extends Unit> other = function0;
                Intrinsics.m32179h(exception, "exception");
                Intrinsics.m32179h(other, "other");
                if (exception instanceof PatternSyntaxException) {
                    ErrorCollector errorCollector = ErrorCollector.this;
                    StringBuilder m24u = C0000a.m24u("Invalid regex pattern '");
                    m24u.append((Object) ((PatternSyntaxException) exception).getPattern());
                    m24u.append("'.");
                    errorCollector.m17112a(new IllegalArgumentException(m24u.toString()));
                } else {
                    other.invoke();
                }
                return Unit.f63088a;
            }
        };
        Function1<? super String, Unit> function14 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.core.util.mask.CurrencyInputMask] */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9, types: [com.yandex.div.core.util.mask.FixedLengthInputMask] */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Locale locale;
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivInputMask divInputMask = DivInput.this.f37362x;
                T t = 0;
                t = 0;
                t = 0;
                DivInputMaskBase m17640a = divInputMask == null ? null : divInputMask.m17640a();
                Ref.ObjectRef<BaseInputMask> objectRef3 = objectRef2;
                if (m17640a instanceof DivFixedLengthInputMask) {
                    view.setKeyListener(keyListener);
                    DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) m17640a;
                    String mo17535b2 = divFixedLengthInputMask.f35738b.mo17535b(expressionResolver);
                    List<DivFixedLengthInputMask.PatternElement> list = divFixedLengthInputMask.f35739c;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
                    for (DivFixedLengthInputMask.PatternElement patternElement : list) {
                        char m33928z = StringsKt.m33928z(patternElement.f35747a.mo17535b(expressionResolver2));
                        Expression<String> expression7 = patternElement.f35749c;
                        arrayList.add(new BaseInputMask.MaskKey(m33928z, expression7 == null ? null : expression7.mo17535b(expressionResolver2), StringsKt.m33928z(patternElement.f35748b.mo17535b(expressionResolver2))));
                    }
                    BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(mo17535b2, arrayList, divFixedLengthInputMask.f35737a.mo17535b(expressionResolver).booleanValue());
                    BaseInputMask baseInputMask = objectRef2.f63351b;
                    if (baseInputMask != null) {
                        baseInputMask.m16782n(maskData, true);
                        t = baseInputMask;
                    }
                    if (t == 0) {
                        final Function2<Exception, Function0<Unit>, Unit> function22 = function2;
                        t = new FixedLengthInputMask(maskData, new Function1<Exception, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Exception exc) {
                                Exception it = exc;
                                Intrinsics.m32179h(it, "it");
                                function22.invoke(it, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.2.1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        return Unit.f63088a;
                                    }
                                });
                                return Unit.f63088a;
                            }
                        });
                    }
                } else if (m17640a instanceof DivCurrencyInputMask) {
                    Expression<String> expression8 = ((DivCurrencyInputMask) m17640a).f35247a;
                    String mo17535b3 = expression8 == null ? null : expression8.mo17535b(expressionResolver);
                    if (mo17535b3 != null) {
                        locale = Locale.forLanguageTag(mo17535b3);
                        ErrorCollector errorCollector = m17115a;
                        String languageTag = locale.toLanguageTag();
                        if (!Intrinsics.m32174c(languageTag, mo17535b3)) {
                            errorCollector.m17113b(new IllegalArgumentException("Original locale tag '" + ((Object) mo17535b3) + "' is not equals to final one '" + ((Object) languageTag) + '\''));
                        }
                    } else {
                        locale = Locale.getDefault();
                    }
                    view.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    BaseInputMask baseInputMask2 = objectRef2.f63351b;
                    BaseInputMask baseInputMask3 = baseInputMask2;
                    if (baseInputMask3 != null) {
                        Objects.requireNonNull(baseInputMask2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                        CurrencyInputMask currencyInputMask = (CurrencyInputMask) baseInputMask2;
                        Intrinsics.m32178g(locale, "locale");
                        String m33890P = StringsKt.m33890P(currencyInputMask.m16777h(), currencyInputMask.m16784p().getDecimalSeparator(), '.', false, 4, null);
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                        Intrinsics.m32178g(currencyInstance, "getCurrencyInstance(locale)");
                        currencyInputMask.m16783o(currencyInstance);
                        currencyInputMask.f31491h = currencyInstance;
                        currencyInputMask.mo16770a(StringsKt.m33890P(m33890P, '.', currencyInputMask.m16784p().getDecimalSeparator(), false, 4, null), null);
                        t = baseInputMask3;
                    }
                    if (t == 0) {
                        Intrinsics.m32178g(locale, "locale");
                        final Function2<Exception, Function0<Unit>, Unit> function23 = function2;
                        t = new CurrencyInputMask(locale, new Function1<Exception, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Exception exc) {
                                Exception it = exc;
                                Intrinsics.m32179h(it, "it");
                                function23.invoke(it, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.4.1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        return Unit.f63088a;
                                    }
                                });
                                return Unit.f63088a;
                            }
                        });
                    }
                } else {
                    view.setKeyListener(keyListener);
                }
                objectRef3.f63351b = t;
                function13.invoke(objectRef2.f63351b);
                return Unit.f63088a;
            }
        };
        DivInputMask divInputMask = div.f37362x;
        DivInputMaskBase m17640a = divInputMask == null ? null : divInputMask.m17640a();
        if (m17640a instanceof DivFixedLengthInputMask) {
            DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) m17640a;
            C6855a.m34405a(view, divFixedLengthInputMask.f35738b.mo17537e(expressionResolver, function14));
            for (DivFixedLengthInputMask.PatternElement patternElement : divFixedLengthInputMask.f35739c) {
                C6855a.m34405a(view, patternElement.f35747a.mo17537e(expressionResolver, function14));
                Expression<String> expression7 = patternElement.f35749c;
                if (expression7 != null) {
                    C6855a.m34405a(view, expression7.mo17537e(expressionResolver, function14));
                }
                C6855a.m34405a(view, patternElement.f35748b.mo17537e(expressionResolver, function14));
            }
            C6855a.m34405a(view, divFixedLengthInputMask.f35737a.mo17537e(expressionResolver, function14));
        } else if ((m17640a instanceof DivCurrencyInputMask) && (expression = ((DivCurrencyInputMask) m17640a).f35247a) != null && (mo17537e = expression.mo17537e(expressionResolver, function14)) != null) {
            C6855a.m34405a(view, mo17537e);
        }
        function14.invoke(Unit.f63088a);
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        DivInputMask divInputMask2 = div.f37362x;
        if (divInputMask2 != null) {
            DivInputMaskBase m17640a2 = divInputMask2.m17640a();
            str = m17640a2 == null ? null : m17640a2.getF35740d();
            if (str == null) {
                return;
            } else {
                objectRef3.f63351b = div.f37327F;
            }
        } else {
            str = div.f37327F;
        }
        final Function1<String, Unit> function15 = new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$setSecondVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(String str2) {
                String value = str2;
                Intrinsics.m32179h(value, "value");
                String str3 = objectRef3.f63351b;
                if (str3 != null) {
                    divView.m16824y(str3, value);
                }
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, this.f32167c.m16683a(divView, str, new TwoWayStringVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: a */
            public void mo16684a(String str2) {
                String str3 = str2;
                BaseInputMask baseInputMask = objectRef.f63351b;
                if (baseInputMask != null) {
                    Function1<String, Unit> function16 = function15;
                    if (str3 == null) {
                        str3 = "";
                    }
                    baseInputMask.mo16780k(str3);
                    function16.invoke(baseInputMask.m16778i());
                    str3 = baseInputMask.m16778i();
                }
                view.setText(str3);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: b */
            public void mo16685b(@NotNull final Function1<? super String, Unit> function16) {
                final DivInputView divInputView = view;
                final Ref.ObjectRef<BaseInputMask> objectRef4 = objectRef;
                final Function1<String, Unit> function17 = function15;
                divInputView.setBoundVariableChangeAction(new Function1<Editable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$callbacks$1$setViewStateChangeListener$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Editable editable) {
                        String str2;
                        String obj;
                        Editable editable2 = editable;
                        String str3 = "";
                        if (editable2 == null || (str2 = editable2.toString()) == null) {
                            str2 = "";
                        }
                        BaseInputMask baseInputMask = objectRef4.f63351b;
                        if (baseInputMask != null) {
                            DivInputView divInputView2 = divInputView;
                            Function1<String, Unit> function18 = function17;
                            if (!Intrinsics.m32174c(baseInputMask.m16778i(), str2)) {
                                Editable text = divInputView2.getText();
                                if (text != null && (obj = text.toString()) != null) {
                                    str3 = obj;
                                }
                                baseInputMask.mo16770a(str3, Integer.valueOf(divInputView2.getSelectionStart()));
                                divInputView2.setText(baseInputMask.m16778i());
                                divInputView2.setSelection(baseInputMask.f31475d);
                                function18.invoke(baseInputMask.m16778i());
                            }
                        }
                        BaseInputMask baseInputMask2 = objectRef4.f63351b;
                        if (baseInputMask2 != null) {
                            str2 = StringsKt.m33890P(baseInputMask2.m16777h(), ',', '.', false, 4, null);
                        }
                        function16.invoke(str2);
                        return Unit.f63088a;
                    }
                });
            }
        }));
    }
}
