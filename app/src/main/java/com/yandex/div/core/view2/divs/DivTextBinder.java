package com.yandex.div.core.view2.divs;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.LineHeightWithTopOffsetSpan;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.spannable.BitmapImageSpan;
import com.yandex.div.internal.spannable.ImagePlaceholderSpan;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientFixedCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeCenter;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivTextBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivText;", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "DivTextRanger", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivTextBinder implements DivViewBinder<DivText, DivLineHeightTextView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32436a;

    /* renamed from: b */
    @NotNull
    public final DivTypefaceResolver f32437b;

    /* renamed from: c */
    @NotNull
    public final DivImageLoader f32438c;

    /* renamed from: d */
    public final boolean f32439d;

    /* compiled from: DivTextBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder$DivTextRanger;", "", "DivClickableSpan", "ImageCallback", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class DivTextRanger {

        /* renamed from: a */
        @NotNull
        public final Div2View f32446a;

        /* renamed from: b */
        @NotNull
        public final TextView f32447b;

        /* renamed from: c */
        @NotNull
        public final ExpressionResolver f32448c;

        /* renamed from: d */
        @NotNull
        public final String f32449d;

        /* renamed from: e */
        public final long f32450e;

        /* renamed from: f */
        @NotNull
        public final DivFontFamily f32451f;

        /* renamed from: g */
        @Nullable
        public final List<DivText.Range> f32452g;

        /* renamed from: h */
        @Nullable
        public final List<DivAction> f32453h;

        /* renamed from: i */
        public final Context f32454i;

        /* renamed from: j */
        public final DisplayMetrics f32455j;

        /* renamed from: k */
        @NotNull
        public final SpannableStringBuilder f32456k;

        /* renamed from: l */
        @NotNull
        public final List<DivText.Image> f32457l;

        /* renamed from: m */
        @Nullable
        public Function1<? super CharSequence, Unit> f32458m;

        /* renamed from: n */
        public final /* synthetic */ DivTextBinder f32459n;

        /* compiled from: DivTextBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder$DivTextRanger$DivClickableSpan;", "Landroid/text/style/ClickableSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public final class DivClickableSpan extends ClickableSpan {

            /* renamed from: b */
            @NotNull
            public final List<DivAction> f32460b;

            /* JADX WARN: Multi-variable type inference failed */
            public DivClickableSpan(@NotNull List<? extends DivAction> list) {
                this.f32460b = list;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View p0) {
                Object obj;
                Intrinsics.m32179h(p0, "p0");
                DivActionBinder mo16634f = DivTextRanger.this.f32446a.getDiv2Component().mo16634f();
                Intrinsics.m32178g(mo16634f, "divView.div2Component.actionBinder");
                Div2View divView = DivTextRanger.this.f32446a;
                List<DivAction> actions = this.f32460b;
                Intrinsics.m32179h(divView, "divView");
                Intrinsics.m32179h(actions, "actions");
                Iterator<T> it = actions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    List<DivAction.MenuItem> list = ((DivAction) obj).f34553c;
                    if (!(list == null || list.isEmpty())) {
                        break;
                    }
                }
                DivAction divAction = (DivAction) obj;
                if (divAction == null) {
                    mo16634f.m16971c(divView, p0, actions, "click");
                    return;
                }
                List<DivAction.MenuItem> list2 = divAction.f34553c;
                if (list2 == null) {
                    int i2 = Assert.f33709a;
                    return;
                }
                OverflowMenuWrapper overflowMenuWrapper = new OverflowMenuWrapper(p0.getContext(), p0, divView);
                overflowMenuWrapper.f34092b = new DivActionBinder.MenuWrapperListener(mo16634f, divView, list2);
                divView.m16817r();
                divView.m16804B(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapper));
                mo16634f.f31826b.mo16572g(divView, p0, divAction);
                mo16634f.f31827c.m16967a(divAction, divView.getExpressionResolver());
                ((ViewOnClickListenerC2744a) overflowMenuWrapper.m17445a()).onClick(p0);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                Intrinsics.m32179h(ds, "ds");
            }
        }

        /* compiled from: DivTextBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder$DivTextRanger$ImageCallback;", "Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public final class ImageCallback extends DivIdLoggingImageDownloadCallback {

            /* renamed from: a */
            public final int f32462a;

            public ImageCallback(int i2) {
                super(DivTextRanger.this.f32446a);
                this.f32462a = i2;
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            /* renamed from: b */
            public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
                float f2;
                float f3;
                DivText.Image image = DivTextRanger.this.f32457l.get(this.f32462a);
                DivTextRanger divTextRanger = DivTextRanger.this;
                SpannableStringBuilder spannableStringBuilder = divTextRanger.f32456k;
                Bitmap bitmap = cachedBitmap.f31288a;
                Intrinsics.m32178g(bitmap, "cachedBitmap.bitmap");
                DivFixedSize divFixedSize = image.f40013a;
                DisplayMetrics metrics = divTextRanger.f32455j;
                Intrinsics.m32178g(metrics, "metrics");
                int m16935Y = BaseDivViewExtensionsKt.m16935Y(divFixedSize, metrics, divTextRanger.f32448c);
                int i2 = 0;
                int i3 = Integer.MIN_VALUE;
                if (spannableStringBuilder.length() == 0) {
                    f2 = 0.0f;
                } else {
                    long longValue = image.f40014b.mo17535b(divTextRanger.f32448c).longValue();
                    long j2 = longValue >> 31;
                    int i4 = (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    int i5 = i4 == 0 ? 0 : i4 - 1;
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(i5, i5 + 1, AbsoluteSizeSpan.class);
                    TextPaint paint = divTextRanger.f32447b.getPaint();
                    if (absoluteSizeSpanArr != null) {
                        if (true ^ (absoluteSizeSpanArr.length == 0)) {
                            f3 = absoluteSizeSpanArr[0].getSize() / divTextRanger.f32447b.getTextSize();
                            float f4 = 2;
                            f2 = (((paint.descent() + paint.ascent()) / f4) * f3) - ((-m16935Y) / f4);
                        }
                    }
                    f3 = 1.0f;
                    float f42 = 2;
                    f2 = (((paint.descent() + paint.ascent()) / f42) * f3) - ((-m16935Y) / f42);
                }
                Context context = divTextRanger.f32454i;
                Intrinsics.m32178g(context, "context");
                DivFixedSize divFixedSize2 = image.f40018f;
                DisplayMetrics metrics2 = divTextRanger.f32455j;
                Intrinsics.m32178g(metrics2, "metrics");
                int m16935Y2 = BaseDivViewExtensionsKt.m16935Y(divFixedSize2, metrics2, divTextRanger.f32448c);
                Expression<Integer> expression = image.f40015c;
                BitmapImageSpan bitmapImageSpan = new BitmapImageSpan(context, bitmap, f2, m16935Y2, m16935Y, expression == null ? null : expression.mo17535b(divTextRanger.f32448c), BaseDivViewExtensionsKt.m16933W(image.f40016d.mo17535b(divTextRanger.f32448c)), false, BitmapImageSpan.AnchorPoint.BASELINE);
                long longValue2 = image.f40014b.mo17535b(DivTextRanger.this.f32448c).longValue();
                long j3 = longValue2 >> 31;
                if (j3 == 0 || j3 == -1) {
                    i3 = (int) longValue2;
                } else if (longValue2 > 0) {
                    i3 = Integer.MAX_VALUE;
                }
                int i6 = i3 + this.f32462a;
                int i7 = i6 + 1;
                Object[] spans = DivTextRanger.this.f32456k.getSpans(i6, i7, ImagePlaceholderSpan.class);
                Intrinsics.m32178g(spans, "getSpans(start, end, T::class.java)");
                DivTextRanger divTextRanger2 = DivTextRanger.this;
                int length = spans.length;
                while (i2 < length) {
                    Object obj = spans[i2];
                    i2++;
                    divTextRanger2.f32456k.removeSpan((ImagePlaceholderSpan) obj);
                }
                DivTextRanger.this.f32456k.setSpan(bitmapImageSpan, i6, i7, 18);
                DivTextRanger divTextRanger3 = DivTextRanger.this;
                Function1<? super CharSequence, Unit> function1 = divTextRanger3.f32458m;
                if (function1 == null) {
                    return;
                }
                function1.invoke(divTextRanger3.f32456k);
            }
        }

        /* compiled from: DivTextBinder.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[DivLineStyle.values().length];
                DivLineStyle divLineStyle = DivLineStyle.SINGLE;
                iArr[1] = 1;
                DivLineStyle divLineStyle2 = DivLineStyle.NONE;
                iArr[0] = 2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DivTextRanger(@NotNull DivTextBinder divTextBinder, @NotNull Div2View divView, @NotNull TextView textView, @NotNull ExpressionResolver resolver, String text, @NotNull long j2, @Nullable DivFontFamily fontFamily, @Nullable List<? extends DivText.Range> list, @Nullable List<? extends DivAction> list2, List<? extends DivText.Image> list3) {
            List<DivText.Image> m32017d0;
            Intrinsics.m32179h(divView, "divView");
            Intrinsics.m32179h(textView, "textView");
            Intrinsics.m32179h(resolver, "resolver");
            Intrinsics.m32179h(text, "text");
            Intrinsics.m32179h(fontFamily, "fontFamily");
            this.f32459n = divTextBinder;
            this.f32446a = divView;
            this.f32447b = textView;
            this.f32448c = resolver;
            this.f32449d = text;
            this.f32450e = j2;
            this.f32451f = fontFamily;
            this.f32452g = list;
            this.f32453h = list2;
            this.f32454i = divView.getContext();
            this.f32455j = divView.getResources().getDisplayMetrics();
            this.f32456k = new SpannableStringBuilder(text);
            if (list3 == null) {
                m32017d0 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (((DivText.Image) obj).f40014b.mo17535b(this.f32448c).longValue() <= ((long) this.f32449d.length())) {
                        arrayList.add(obj);
                    }
                }
                m32017d0 = CollectionsKt.m32017d0(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$DivTextRanger$special$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.m32109b(((DivText.Image) t).f40014b.mo17535b(DivTextBinder.DivTextRanger.this.f32448c), ((DivText.Image) t2).f40014b.mo17535b(DivTextBinder.DivTextRanger.this.f32448c));
                    }
                });
            }
            this.f32457l = m32017d0 == null ? EmptyList.f63144b : m32017d0;
        }

        /* renamed from: a */
        public final void m17050a() {
            int i2;
            float f2;
            float f3;
            boolean z;
            Double mo17535b;
            Integer mo17535b2;
            Long mo17535b3;
            DivTextRangesBackgroundHelper textRoundedBgHelper;
            List<DivText.Range> list = this.f32452g;
            if (list == null || list.isEmpty()) {
                List<DivText.Image> list2 = this.f32457l;
                if (list2 == null || list2.isEmpty()) {
                    Function1<? super CharSequence, Unit> function1 = this.f32458m;
                    if (function1 == null) {
                        return;
                    }
                    function1.invoke(this.f32449d);
                    return;
                }
            }
            TextView textView = this.f32447b;
            if ((textView instanceof DivLineHeightTextView) && (textRoundedBgHelper = ((DivLineHeightTextView) textView).getTextRoundedBgHelper()) != null) {
                textRoundedBgHelper.f31506c.clear();
            }
            List<DivText.Range> list3 = this.f32452g;
            long j2 = 0;
            long j3 = -1;
            if (list3 != null) {
                for (DivText.Range range : list3) {
                    SpannableStringBuilder spannable = this.f32456k;
                    long longValue = range.f40044j.mo17535b(this.f32448c).longValue();
                    long j4 = longValue >> 31;
                    int i3 = (j4 == j2 || j4 == j3) ? (int) longValue : longValue > j2 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    int length = this.f32449d.length();
                    if (i3 > length) {
                        i3 = length;
                    }
                    long longValue2 = range.f40038d.mo17535b(this.f32448c).longValue();
                    long j5 = longValue2 >> 31;
                    int i4 = (j5 == j2 || j5 == j3) ? (int) longValue2 : longValue2 > j2 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    int length2 = this.f32449d.length();
                    if (i4 > length2) {
                        i4 = length2;
                    }
                    if (i3 <= i4) {
                        Expression<Long> expression = range.f40039e;
                        if (expression != null && (mo17535b3 = expression.mo17535b(this.f32448c)) != null) {
                            Long valueOf = Long.valueOf(mo17535b3.longValue());
                            DisplayMetrics metrics = this.f32455j;
                            Intrinsics.m32178g(metrics, "metrics");
                            spannable.setSpan(new AbsoluteSizeSpan(BaseDivViewExtensionsKt.m16942c0(valueOf, metrics, range.f40040f.mo17535b(this.f32448c))), i3, i4, 18);
                        }
                        Expression<Integer> expression2 = range.f40046l;
                        if (expression2 != null && (mo17535b2 = expression2.mo17535b(this.f32448c)) != null) {
                            spannable.setSpan(new ForegroundColorSpan(mo17535b2.intValue()), i3, i4, 18);
                        }
                        Expression<Double> expression3 = range.f40042h;
                        if (expression3 != null && (mo17535b = expression3.mo17535b(this.f32448c)) != null) {
                            double doubleValue = mo17535b.doubleValue();
                            Expression<Long> expression4 = range.f40039e;
                            spannable.setSpan(new LetterSpacingSpan(((float) doubleValue) / ((expression4 == null ? null : expression4.mo17535b(this.f32448c)) == null ? this.f32450e : r2.longValue())), i3, i4, 18);
                        }
                        Expression<DivLineStyle> expression5 = range.f40045k;
                        if (expression5 != null) {
                            int ordinal = expression5.mo17535b(this.f32448c).ordinal();
                            if (ordinal == 0) {
                                spannable.setSpan(new NoStrikethroughSpan(), i3, i4, 18);
                            } else if (ordinal == 1) {
                                spannable.setSpan(new StrikethroughSpan(), i3, i4, 18);
                            }
                        }
                        Expression<DivLineStyle> expression6 = range.f40048n;
                        if (expression6 != null) {
                            int ordinal2 = expression6.mo17535b(this.f32448c).ordinal();
                            if (ordinal2 == 0) {
                                spannable.setSpan(new NoUnderlineSpan(), i3, i4, 18);
                            } else if (ordinal2 == 1) {
                                spannable.setSpan(new UnderlineSpan(), i3, i4, 18);
                            }
                        }
                        Expression<DivFontWeight> expression7 = range.f40041g;
                        if (expression7 != null) {
                            spannable.setSpan(new TypefaceSpan(this.f32459n.f32437b.m16865a(this.f32451f, expression7.mo17535b(this.f32448c))), i3, i4, 18);
                        }
                        List<DivAction> list4 = range.f40035a;
                        if (list4 != null) {
                            this.f32447b.setMovementMethod(LinkMovementMethod.getInstance());
                            spannable.setSpan(new DivClickableSpan(list4), i3, i4, 18);
                        }
                        if (range.f40037c != null || range.f40036b != null) {
                            DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(range.f40037c, range.f40036b);
                            TextView textView2 = this.f32447b;
                            if (textView2 instanceof DivLineHeightTextView) {
                                DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView2;
                                if (divLineHeightTextView.getTextRoundedBgHelper() != null) {
                                    DivTextRangesBackgroundHelper textRoundedBgHelper2 = divLineHeightTextView.getTextRoundedBgHelper();
                                    Intrinsics.m32176e(textRoundedBgHelper2);
                                    Intrinsics.m32179h(spannable, "spannable");
                                    ArrayList<DivBackgroundSpan> arrayList = textRoundedBgHelper2.f31506c;
                                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                        for (DivBackgroundSpan divBackgroundSpan2 : arrayList) {
                                            if (Intrinsics.m32174c(divBackgroundSpan2.f31911b, divBackgroundSpan.f31911b) && Intrinsics.m32174c(divBackgroundSpan2.f31912c, divBackgroundSpan.f31912c) && i4 == spannable.getSpanEnd(divBackgroundSpan2) && i3 == spannable.getSpanStart(divBackgroundSpan2)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    divLineHeightTextView.setTextRoundedBgHelper$div_release(new DivTextRangesBackgroundHelper(divLineHeightTextView, this.f32448c));
                                }
                                z = false;
                                if (!z) {
                                    spannable.setSpan(divBackgroundSpan, i3, i4, 18);
                                    DivTextRangesBackgroundHelper textRoundedBgHelper3 = ((DivLineHeightTextView) this.f32447b).getTextRoundedBgHelper();
                                    if (textRoundedBgHelper3 != null) {
                                        textRoundedBgHelper3.f31506c.add(divBackgroundSpan);
                                    }
                                }
                            }
                        }
                        if (range.f40043i != null || range.f40047m != null) {
                            Expression<Long> expression8 = range.f40047m;
                            Long mo17535b4 = expression8 == null ? null : expression8.mo17535b(this.f32448c);
                            DisplayMetrics metrics2 = this.f32455j;
                            Intrinsics.m32178g(metrics2, "metrics");
                            int m16942c0 = BaseDivViewExtensionsKt.m16942c0(mo17535b4, metrics2, range.f40040f.mo17535b(this.f32448c));
                            Expression<Long> expression9 = range.f40043i;
                            Long mo17535b5 = expression9 == null ? null : expression9.mo17535b(this.f32448c);
                            DisplayMetrics metrics3 = this.f32455j;
                            Intrinsics.m32178g(metrics3, "metrics");
                            spannable.setSpan(new LineHeightWithTopOffsetSpan(m16942c0, BaseDivViewExtensionsKt.m16942c0(mo17535b5, metrics3, range.f40040f.mo17535b(this.f32448c))), i3, i4, 18);
                        }
                    }
                    j2 = 0;
                    j3 = -1;
                }
            }
            for (DivText.Image image : CollectionsKt.m32008U(this.f32457l)) {
                SpannableStringBuilder spannableStringBuilder = this.f32456k;
                long longValue3 = image.f40014b.mo17535b(this.f32448c).longValue();
                long j6 = longValue3 >> 31;
                spannableStringBuilder.insert((j6 == 0 || j6 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE, (CharSequence) "#");
            }
            int i5 = 0;
            for (Object obj : this.f32457l) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                DivText.Image image2 = (DivText.Image) obj;
                DivFixedSize divFixedSize = image2.f40018f;
                DisplayMetrics metrics4 = this.f32455j;
                Intrinsics.m32178g(metrics4, "metrics");
                int m16935Y = BaseDivViewExtensionsKt.m16935Y(divFixedSize, metrics4, this.f32448c);
                DivFixedSize divFixedSize2 = image2.f40013a;
                DisplayMetrics metrics5 = this.f32455j;
                Intrinsics.m32178g(metrics5, "metrics");
                int m16935Y2 = BaseDivViewExtensionsKt.m16935Y(divFixedSize2, metrics5, this.f32448c);
                if (this.f32456k.length() > 0) {
                    long longValue4 = image2.f40014b.mo17535b(this.f32448c).longValue();
                    long j7 = longValue4 >> 31;
                    int i7 = (j7 == 0 || j7 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    int i8 = i7 == 0 ? 0 : i7 - 1;
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) this.f32456k.getSpans(i8, i8 + 1, AbsoluteSizeSpan.class);
                    TextPaint paint = this.f32447b.getPaint();
                    if (absoluteSizeSpanArr != null) {
                        if (!(absoluteSizeSpanArr.length == 0)) {
                            f3 = absoluteSizeSpanArr[0].getSize() / this.f32447b.getTextSize();
                            float f4 = 2;
                            f2 = (((paint.descent() + paint.ascent()) / f4) * f3) - ((-m16935Y2) / f4);
                        }
                    }
                    f3 = 1.0f;
                    float f42 = 2;
                    f2 = (((paint.descent() + paint.ascent()) / f42) * f3) - ((-m16935Y2) / f42);
                } else {
                    f2 = 0.0f;
                }
                ImagePlaceholderSpan imagePlaceholderSpan = new ImagePlaceholderSpan(m16935Y, m16935Y2, f2);
                long longValue5 = image2.f40014b.mo17535b(this.f32448c).longValue();
                long j8 = longValue5 >> 31;
                int i9 = ((j8 == 0 || j8 == -1) ? (int) longValue5 : longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE) + i5;
                this.f32456k.setSpan(imagePlaceholderSpan, i9, i9 + 1, 18);
                i5 = i6;
            }
            List<DivAction> list5 = this.f32453h;
            if (list5 == null) {
                i2 = 0;
            } else {
                this.f32447b.setMovementMethod(LinkMovementMethod.getInstance());
                i2 = 0;
                this.f32456k.setSpan(new DivClickableSpan(list5), 0, this.f32456k.length(), 18);
            }
            Function1<? super CharSequence, Unit> function12 = this.f32458m;
            if (function12 != null) {
                function12.invoke(this.f32456k);
            }
            List<DivText.Image> list6 = this.f32457l;
            DivTextBinder divTextBinder = this.f32459n;
            for (Object obj2 : list6) {
                int i10 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                LoadReference loadImage = divTextBinder.f32438c.loadImage(((DivText.Image) obj2).f40017e.mo17535b(this.f32448c).toString(), new ImageCallback(i2));
                Intrinsics.m32178g(loadImage, "imageLoader.loadImage(im…(), ImageCallback(index))");
                this.f32446a.m16811l(loadImage, this.f32447b);
                i2 = i10;
            }
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            iArr[0] = 1;
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            iArr[1] = 2;
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            iArr[2] = 3;
            int[] iArr2 = new int[DivLineStyle.values().length];
            DivLineStyle divLineStyle = DivLineStyle.SINGLE;
            iArr2[1] = 1;
            DivLineStyle divLineStyle2 = DivLineStyle.NONE;
            iArr2[0] = 2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            DivRadialGradientRelativeRadius.Value value = DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER;
            iArr3[1] = 1;
            DivRadialGradientRelativeRadius.Value value2 = DivRadialGradientRelativeRadius.Value.NEAREST_CORNER;
            iArr3[0] = 2;
            DivRadialGradientRelativeRadius.Value value3 = DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE;
            iArr3[3] = 3;
            DivRadialGradientRelativeRadius.Value value4 = DivRadialGradientRelativeRadius.Value.NEAREST_SIDE;
            iArr3[2] = 4;
        }
    }

    @Inject
    public DivTextBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull DivImageLoader imageLoader, @ExperimentFlag boolean z) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(typefaceResolver, "typefaceResolver");
        Intrinsics.m32179h(imageLoader, "imageLoader");
        this.f32436a = baseBinder;
        this.f32437b = typefaceResolver;
        this.f32438c = imageLoader;
        this.f32439d = z;
    }

    /* renamed from: a */
    public static final RadialGradientDrawable.Center m17040a(DivTextBinder divTextBinder, DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Objects.requireNonNull(divTextBinder);
        Object m17672a = divRadialGradientCenter.m17672a();
        if (m17672a instanceof DivRadialGradientFixedCenter) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.m16962v(((DivRadialGradientFixedCenter) m17672a).f38102b.mo17535b(expressionResolver), displayMetrics));
        }
        if (m17672a instanceof DivRadialGradientRelativeCenter) {
            return new RadialGradientDrawable.Center.Relative((float) ((DivRadialGradientRelativeCenter) m17672a).f38127a.mo17535b(expressionResolver).doubleValue());
        }
        return null;
    }

    /* renamed from: b */
    public static final RadialGradientDrawable.Radius m17041b(DivTextBinder divTextBinder, DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        Objects.requireNonNull(divTextBinder);
        Object m17677a = divRadialGradientRadius.m17677a();
        if (m17677a instanceof DivFixedSize) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.m16962v(((DivFixedSize) m17677a).f35795b.mo17535b(expressionResolver), displayMetrics));
        }
        if (!(m17677a instanceof DivRadialGradientRelativeRadius)) {
            return null;
        }
        int ordinal = ((DivRadialGradientRelativeRadius) m17677a).f38136a.mo17535b(expressionResolver).ordinal();
        if (ordinal == 0) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
        } else if (ordinal == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
        } else if (ordinal == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
        } else {
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    /* renamed from: c */
    public final void m17042c(final EllipsizedTextView ellipsizedTextView, Div2View div2View, ExpressionResolver expressionResolver, DivText divText) {
        DivText.Ellipsis ellipsis = divText.f39975n;
        if (ellipsis == null) {
            return;
        }
        DivTextRanger divTextRanger = new DivTextRanger(this, div2View, ellipsizedTextView, expressionResolver, ellipsis.f40004d.mo17535b(expressionResolver), divText.f39980s.mo17535b(expressionResolver).longValue(), divText.f39979r.mo17535b(expressionResolver), ellipsis.f40003c, ellipsis.f40001a, ellipsis.f40002b);
        divTextRanger.f32458m = new Function1<CharSequence, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyEllipsis$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CharSequence charSequence) {
                CharSequence text = charSequence;
                Intrinsics.m32179h(text, "text");
                EllipsizedTextView.this.setEllipsis(text);
                return Unit.f63088a;
            }
        };
        divTextRanger.m17050a();
    }

    /* renamed from: d */
    public final void m17043d(DivLineHeightTextView divLineHeightTextView, ExpressionResolver expressionResolver, DivText divText) {
        int i2;
        long longValue = divText.f39980s.mo17535b(expressionResolver).longValue();
        long j2 = longValue >> 31;
        if (j2 == 0 || j2 == -1) {
            i2 = (int) longValue;
        } else {
            int i3 = Assert.f33709a;
            i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        BaseDivViewExtensionsKt.m16943d(divLineHeightTextView, i2, divText.f39981t.mo17535b(expressionResolver));
        BaseDivViewExtensionsKt.m16947g(divLineHeightTextView, divText.f39986y.mo17535b(expressionResolver).doubleValue(), i2);
    }

    /* renamed from: e */
    public final void m17044e(TextView textView, ExpressionResolver expressionResolver, DivText divText) {
        if (Build.VERSION.SDK_INT >= 26) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i2 = (!this.f32439d || TextUtils.indexOf((CharSequence) divText.f39946K.mo17535b(expressionResolver), (char) 173, 0, Math.min(divText.f39946K.mo17535b(expressionResolver).length(), 10)) <= 0) ? 0 : 1;
            if (hyphenationFrequency != i2) {
                textView.setHyphenationFrequency(i2);
            }
        }
    }

    /* renamed from: f */
    public final void m17045f(DivLineHeightTextView divLineHeightTextView, ExpressionResolver expressionResolver, Expression<Long> expression, Expression<Long> expression2) {
        int i2;
        AdaptiveMaxLines adaptiveMaxLines = divLineHeightTextView.getAdaptiveMaxLines();
        if (adaptiveMaxLines != null) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = adaptiveMaxLines.f32955b;
            if (onAttachStateChangeListener != null) {
                adaptiveMaxLines.f32954a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            adaptiveMaxLines.f32955b = null;
            adaptiveMaxLines.m17133b();
        }
        Long mo17535b = expression == null ? null : expression.mo17535b(expressionResolver);
        Long mo17535b2 = expression2 != null ? expression2.mo17535b(expressionResolver) : null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        if (mo17535b == null || mo17535b2 == null) {
            if (mo17535b != null) {
                long longValue = mo17535b.longValue();
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i3 = (int) longValue;
                } else {
                    int i5 = Assert.f33709a;
                    if (longValue > 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                }
                i4 = i3;
            }
            divLineHeightTextView.setMaxLines(i4);
            return;
        }
        final AdaptiveMaxLines adaptiveMaxLines2 = new AdaptiveMaxLines(divLineHeightTextView);
        long longValue2 = mo17535b.longValue();
        long j3 = longValue2 >> 31;
        if (j3 == 0 || j3 == -1) {
            i2 = (int) longValue2;
        } else {
            int i6 = Assert.f33709a;
            i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = mo17535b2.longValue();
        long j4 = longValue3 >> 31;
        if (j4 == 0 || j4 == -1) {
            i3 = (int) longValue3;
        } else {
            int i7 = Assert.f33709a;
            if (longValue3 > 0) {
                i3 = Integer.MAX_VALUE;
            }
        }
        AdaptiveMaxLines.Params params = new AdaptiveMaxLines.Params(i2, i3);
        if (!Intrinsics.m32174c(adaptiveMaxLines2.f32957d, params)) {
            adaptiveMaxLines2.f32957d = params;
            if (ViewCompat.m2173M(adaptiveMaxLines2.f32954a)) {
                adaptiveMaxLines2.m17132a();
            }
            if (adaptiveMaxLines2.f32955b == null) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View v) {
                        Intrinsics.m32179h(v, "v");
                        AdaptiveMaxLines.this.m17132a();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View v) {
                        Intrinsics.m32179h(v, "v");
                        AdaptiveMaxLines.this.m17133b();
                    }
                };
                adaptiveMaxLines2.f32954a.addOnAttachStateChangeListener(onAttachStateChangeListener2);
                adaptiveMaxLines2.f32955b = onAttachStateChangeListener2;
            }
        }
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines2);
    }

    /* renamed from: g */
    public final void m17046g(final TextView textView, Div2View div2View, ExpressionResolver expressionResolver, DivText divText) {
        DivTextRanger divTextRanger = new DivTextRanger(this, div2View, textView, expressionResolver, divText.f39946K.mo17535b(expressionResolver), divText.f39980s.mo17535b(expressionResolver).longValue(), divText.f39979r.mo17535b(expressionResolver), divText.f39941F, null, divText.f39985x);
        divTextRanger.f32458m = new Function1<CharSequence, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CharSequence charSequence) {
                CharSequence text = charSequence;
                Intrinsics.m32179h(text, "text");
                textView.setText(text, TextView.BufferType.NORMAL);
                return Unit.f63088a;
            }
        };
        divTextRanger.m17050a();
    }

    /* renamed from: h */
    public final void m17047h(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(BaseDivViewExtensionsKt.m16964x(divAlignmentHorizontal, divAlignmentVertical));
        int ordinal = divAlignmentHorizontal.ordinal();
        int i2 = 5;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 4;
            } else if (ordinal == 2) {
                i2 = 6;
            }
        }
        textView.setTextAlignment(i2);
    }

    /* renamed from: i */
    public final void m17048i(final TextView textView, final ExpressionResolver expressionResolver, final DivTextGradient divTextGradient) {
        final DisplayMetrics metrics = textView.getResources().getDisplayMetrics();
        if (!ViewsKt.m16768b(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    TextPaint paint = textView.getPaint();
                    DivTextGradient divTextGradient2 = divTextGradient;
                    Shader shader = null;
                    Object m17717a = divTextGradient2 == null ? null : divTextGradient2.m17717a();
                    if (m17717a instanceof DivLinearGradient) {
                        shader = LinearGradientDrawable.f33750e.m17304a(r2.f37694a.mo17535b(expressionResolver).longValue(), CollectionsKt.m32025i0(((DivLinearGradient) m17717a).f37695b.mo17531a(expressionResolver)), textView.getWidth(), textView.getHeight());
                    } else if (m17717a instanceof DivRadialGradient) {
                        RadialGradientDrawable.Companion companion = RadialGradientDrawable.f33761g;
                        DivTextBinder divTextBinder = this;
                        DivRadialGradient divRadialGradient = (DivRadialGradient) m17717a;
                        DivRadialGradientRadius divRadialGradientRadius = divRadialGradient.f38086d;
                        DisplayMetrics metrics2 = metrics;
                        Intrinsics.m32178g(metrics2, "metrics");
                        RadialGradientDrawable.Radius m17041b = DivTextBinder.m17041b(divTextBinder, divRadialGradientRadius, metrics, expressionResolver);
                        Intrinsics.m32176e(m17041b);
                        DivTextBinder divTextBinder2 = this;
                        DivRadialGradientCenter divRadialGradientCenter = divRadialGradient.f38083a;
                        DisplayMetrics metrics3 = metrics;
                        Intrinsics.m32178g(metrics3, "metrics");
                        RadialGradientDrawable.Center m17040a = DivTextBinder.m17040a(divTextBinder2, divRadialGradientCenter, metrics, expressionResolver);
                        Intrinsics.m32176e(m17040a);
                        DivTextBinder divTextBinder3 = this;
                        DivRadialGradientCenter divRadialGradientCenter2 = divRadialGradient.f38084b;
                        DisplayMetrics metrics4 = metrics;
                        Intrinsics.m32178g(metrics4, "metrics");
                        RadialGradientDrawable.Center m17040a2 = DivTextBinder.m17040a(divTextBinder3, divRadialGradientCenter2, metrics, expressionResolver);
                        Intrinsics.m32176e(m17040a2);
                        shader = companion.m17307b(m17041b, m17040a, m17040a2, CollectionsKt.m32025i0(divRadialGradient.f38085c.mo17531a(expressionResolver)), textView.getWidth(), textView.getHeight());
                    }
                    paint.setShader(shader);
                }
            });
            return;
        }
        TextPaint paint = textView.getPaint();
        Shader shader = null;
        Object m17717a = divTextGradient == null ? null : divTextGradient.m17717a();
        if (m17717a instanceof DivLinearGradient) {
            shader = LinearGradientDrawable.f33750e.m17304a(r2.f37694a.mo17535b(expressionResolver).longValue(), CollectionsKt.m32025i0(((DivLinearGradient) m17717a).f37695b.mo17531a(expressionResolver)), textView.getWidth(), textView.getHeight());
        } else if (m17717a instanceof DivRadialGradient) {
            RadialGradientDrawable.Companion companion = RadialGradientDrawable.f33761g;
            DivRadialGradient divRadialGradient = (DivRadialGradient) m17717a;
            DivRadialGradientRadius divRadialGradientRadius = divRadialGradient.f38086d;
            Intrinsics.m32178g(metrics, "metrics");
            RadialGradientDrawable.Radius m17041b = m17041b(this, divRadialGradientRadius, metrics, expressionResolver);
            Intrinsics.m32176e(m17041b);
            RadialGradientDrawable.Center m17040a = m17040a(this, divRadialGradient.f38083a, metrics, expressionResolver);
            Intrinsics.m32176e(m17040a);
            RadialGradientDrawable.Center m17040a2 = m17040a(this, divRadialGradient.f38084b, metrics, expressionResolver);
            Intrinsics.m32176e(m17040a2);
            shader = companion.m17307b(m17041b, m17040a, m17040a2, CollectionsKt.m32025i0(divRadialGradient.f38085c.mo17531a(expressionResolver)), textView.getWidth(), textView.getHeight());
        }
        paint.setShader(shader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m17049j(@NotNull final DivLineHeightTextView view, @NotNull final DivText div, @NotNull final Div2View divView) {
        DivSolidBackground divSolidBackground;
        DivStroke divStroke;
        Expression<Long> expression;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivText div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32436a.m16988i(view, div2, divView);
        }
        this.f32436a.m16984e(view, div, div2, divView);
        BaseDivViewExtensionsKt.m16941c(view, divView, div.f39963b, div.f39965d, div.f39936A, div.f39974m, div.f39964c);
        view.setTypeface(this.f32437b.m16865a(div.f39979r.mo17535b(expressionResolver), div.f39982u.mo17535b(expressionResolver)));
        Function1<? super DivFontFamily, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivTextBinder divTextBinder = DivTextBinder.this;
                view.setTypeface(divTextBinder.f32437b.m16865a(div.f39979r.mo17535b(expressionResolver), div.f39982u.mo17535b(expressionResolver)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f39979r.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f39982u.mo17537e(expressionResolver, function1));
        final Expression<DivAlignmentHorizontal> expression5 = div.f39947L;
        final Expression<DivAlignmentVertical> expression6 = div.f39948M;
        m17047h(view, expression5.mo17535b(expressionResolver), expression6.mo17535b(expressionResolver));
        Function1<? super DivAlignmentHorizontal, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivTextBinder.this.m17047h(view, expression5.mo17535b(expressionResolver), expression6.mo17535b(expressionResolver));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, expression5.mo17537e(expressionResolver, function12));
        C6855a.m34405a(view, expression6.mo17537e(expressionResolver, function12));
        m17043d(view, expressionResolver, div);
        Function1<? super Long, Unit> function13 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeFontSize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivTextBinder.this.m17043d(view, expressionResolver, div);
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f39980s.mo17537e(expressionResolver, function13));
        C6855a.m34405a(view, div.f39986y.mo17537e(expressionResolver, function13));
        Expression<Long> expression7 = div.f39987z;
        if (expression7 == null) {
            BaseDivViewExtensionsKt.m16948h(view, null, div.f39981t.mo17535b(expressionResolver));
        } else {
            C6855a.m34405a(view, expression7.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeLineHeight$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Long l2) {
                    BaseDivViewExtensionsKt.m16948h(DivLineHeightTextView.this, Long.valueOf(l2.longValue()), div.f39981t.mo17535b(expressionResolver));
                    return Unit.f63088a;
                }
            }));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f63349b = div.f39949N.mo17535b(expressionResolver).intValue();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Expression<Integer> expression8 = div.f39978q;
        objectRef.f63351b = expression8 == null ? 0 : expression8.mo17535b(expressionResolver);
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextColor$updateTextColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                TextView textView = view;
                int[][] iArr = {new int[]{R.attr.state_focused}, new int[0]};
                int[] iArr2 = new int[2];
                Integer num = objectRef.f63351b;
                iArr2[0] = num == null ? intRef.f63349b : num.intValue();
                iArr2[1] = intRef.f63349b;
                textView.setTextColor(new ColorStateList(iArr, iArr2));
                return Unit.f63088a;
            }
        };
        function0.invoke();
        div.f39949N.mo17537e(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                Ref.IntRef.this.f63349b = num.intValue();
                function0.invoke();
                return Unit.f63088a;
            }
        });
        Expression<Integer> expression9 = div.f39978q;
        if (expression9 != null) {
            expression9.mo17537e(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextColor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Integer] */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Integer num) {
                    int intValue = num.intValue();
                    objectRef.f63351b = Integer.valueOf(intValue);
                    function0.invoke();
                    return Unit.f63088a;
                }
            });
        }
        C6855a.m34405a(view, div.f39957V.mo17538f(expressionResolver, new Function1<DivLineStyle, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivLineStyle divLineStyle) {
                DivLineStyle underline = divLineStyle;
                Intrinsics.m32179h(underline, "underline");
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView = view;
                Objects.requireNonNull(divTextBinder);
                int ordinal = underline.ordinal();
                if (ordinal == 0) {
                    divLineHeightTextView.setPaintFlags(divLineHeightTextView.getPaintFlags() & (-9));
                } else if (ordinal == 1) {
                    divLineHeightTextView.setPaintFlags(divLineHeightTextView.getPaintFlags() | 8);
                }
                return Unit.f63088a;
            }
        }));
        C6855a.m34405a(view, div.f39945J.mo17538f(expressionResolver, new Function1<DivLineStyle, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivLineStyle divLineStyle) {
                DivLineStyle strike = divLineStyle;
                Intrinsics.m32179h(strike, "strike");
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView = view;
                Objects.requireNonNull(divTextBinder);
                int ordinal = strike.ordinal();
                if (ordinal == 0) {
                    divLineHeightTextView.setPaintFlags(divLineHeightTextView.getPaintFlags() & (-17));
                } else if (ordinal == 1) {
                    divLineHeightTextView.setPaintFlags(divLineHeightTextView.getPaintFlags() | 16);
                }
                return Unit.f63088a;
            }
        }));
        final Expression<Long> expression10 = div.f39938C;
        final Expression<Long> expression11 = div.f39939D;
        m17045f(view, expressionResolver, expression10, expression11);
        Function1<? super Long, Unit> function14 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeMaxLines$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivTextBinder.this.m17045f(view, expressionResolver, expression10, expression11);
                return Unit.f63088a;
            }
        };
        DivText div3 = view.getDiv();
        Disposable mo17537e = (div3 == null || (expression4 = div3.f39938C) == null) ? null : expression4.mo17537e(expressionResolver, function14);
        if (mo17537e == null) {
            int i2 = Disposable.f30873B1;
            mo17537e = C2814a.f31000b;
        }
        C6855a.m34405a(view, mo17537e);
        DivText div4 = view.getDiv();
        Disposable mo17537e2 = (div4 == null || (expression3 = div4.f39939D) == null) ? null : expression3.mo17537e(expressionResolver, function14);
        if (mo17537e2 == null) {
            int i3 = Disposable.f30873B1;
            mo17537e2 = C2814a.f31000b;
        }
        C6855a.m34405a(view, mo17537e2);
        if (div.f39941F == null && div.f39985x == null) {
            view.setText(div.f39946K.mo17535b(expressionResolver));
            m17044e(view, expressionResolver, div);
            C6855a.m34405a(view, div.f39946K.mo17537e(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextOnly$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(String str) {
                    String it = str;
                    Intrinsics.m32179h(it, "it");
                    DivTextBinder divTextBinder = DivTextBinder.this;
                    DivLineHeightTextView divLineHeightTextView = view;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    DivText divText = div;
                    Objects.requireNonNull(divTextBinder);
                    divLineHeightTextView.setText(divText.f39946K.mo17535b(expressionResolver2));
                    DivTextBinder.this.m17044e(view, expressionResolver, div);
                    return Unit.f63088a;
                }
            }));
        } else {
            m17046g(view, divView, expressionResolver, div);
            m17044e(view, expressionResolver, div);
            C6855a.m34405a(view, div.f39946K.mo17537e(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(String str) {
                    String it = str;
                    Intrinsics.m32179h(it, "it");
                    DivTextBinder.this.m17046g(view, divView, expressionResolver, div);
                    DivTextBinder.this.m17044e(view, expressionResolver, div);
                    return Unit.f63088a;
                }
            }));
            Function1<? super Long, Unit> function15 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeText$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivTextBinder.this.m17046g(view, divView, expressionResolver, div);
                    return Unit.f63088a;
                }
            };
            List<DivText.Range> list = div.f39941F;
            if (list != null) {
                for (DivText.Range range : list) {
                    C6855a.m34405a(view, range.f40044j.mo17537e(expressionResolver, function15));
                    C6855a.m34405a(view, range.f40038d.mo17537e(expressionResolver, function15));
                    Expression<Long> expression12 = range.f40039e;
                    Disposable mo17537e3 = expression12 == null ? null : expression12.mo17537e(expressionResolver, function15);
                    if (mo17537e3 == null) {
                        int i4 = Disposable.f30873B1;
                        mo17537e3 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e3);
                    C6855a.m34405a(view, range.f40040f.mo17537e(expressionResolver, function15));
                    Expression<DivFontWeight> expression13 = range.f40041g;
                    Disposable mo17537e4 = expression13 == null ? null : expression13.mo17537e(expressionResolver, function15);
                    if (mo17537e4 == null) {
                        int i5 = Disposable.f30873B1;
                        mo17537e4 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e4);
                    Expression<Double> expression14 = range.f40042h;
                    Disposable mo17537e5 = expression14 == null ? null : expression14.mo17537e(expressionResolver, function15);
                    if (mo17537e5 == null) {
                        int i6 = Disposable.f30873B1;
                        mo17537e5 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e5);
                    Expression<Long> expression15 = range.f40043i;
                    Disposable mo17537e6 = expression15 == null ? null : expression15.mo17537e(expressionResolver, function15);
                    if (mo17537e6 == null) {
                        int i7 = Disposable.f30873B1;
                        mo17537e6 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e6);
                    Expression<DivLineStyle> expression16 = range.f40045k;
                    Disposable mo17537e7 = expression16 == null ? null : expression16.mo17537e(expressionResolver, function15);
                    if (mo17537e7 == null) {
                        int i8 = Disposable.f30873B1;
                        mo17537e7 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e7);
                    Expression<Integer> expression17 = range.f40046l;
                    Disposable mo17537e8 = expression17 == null ? null : expression17.mo17537e(expressionResolver, function15);
                    if (mo17537e8 == null) {
                        int i9 = Disposable.f30873B1;
                        mo17537e8 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e8);
                    Expression<Long> expression18 = range.f40047m;
                    Disposable mo17537e9 = expression18 == null ? null : expression18.mo17537e(expressionResolver, function15);
                    if (mo17537e9 == null) {
                        int i10 = Disposable.f30873B1;
                        mo17537e9 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e9);
                    Expression<DivLineStyle> expression19 = range.f40048n;
                    Disposable mo17537e10 = expression19 == null ? null : expression19.mo17537e(expressionResolver, function15);
                    if (mo17537e10 == null) {
                        int i11 = Disposable.f30873B1;
                        mo17537e10 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e10);
                }
            }
            List<DivText.Image> list2 = div.f39985x;
            if (list2 != null) {
                for (DivText.Image image : list2) {
                    C6855a.m34405a(view, image.f40014b.mo17537e(expressionResolver, function15));
                    C6855a.m34405a(view, image.f40017e.mo17537e(expressionResolver, function15));
                    Expression<Integer> expression20 = image.f40015c;
                    Disposable mo17537e11 = expression20 == null ? null : expression20.mo17537e(expressionResolver, function15);
                    if (mo17537e11 == null) {
                        int i12 = Disposable.f30873B1;
                        mo17537e11 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e11);
                    C6855a.m34405a(view, image.f40018f.f35795b.mo17537e(expressionResolver, function15));
                    C6855a.m34405a(view, image.f40018f.f35794a.mo17537e(expressionResolver, function15));
                }
            }
        }
        m17042c(view, divView, expressionResolver, div);
        DivText.Ellipsis ellipsis = div.f39975n;
        if (ellipsis != null) {
            Function1<? super String, Unit> function16 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeEllipsis$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivTextBinder.this.m17042c(view, divView, expressionResolver, div);
                    return Unit.f63088a;
                }
            };
            C6855a.m34405a(view, ellipsis.f40004d.mo17537e(expressionResolver, function16));
            List<DivText.Range> list3 = ellipsis.f40003c;
            if (list3 != null) {
                for (DivText.Range range2 : list3) {
                    C6855a.m34405a(view, range2.f40044j.mo17537e(expressionResolver, function16));
                    C6855a.m34405a(view, range2.f40038d.mo17537e(expressionResolver, function16));
                    Expression<Long> expression21 = range2.f40039e;
                    Disposable mo17537e12 = expression21 == null ? null : expression21.mo17537e(expressionResolver, function16);
                    if (mo17537e12 == null) {
                        int i13 = Disposable.f30873B1;
                        mo17537e12 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e12);
                    C6855a.m34405a(view, range2.f40040f.mo17537e(expressionResolver, function16));
                    Expression<DivFontWeight> expression22 = range2.f40041g;
                    Disposable mo17537e13 = expression22 == null ? null : expression22.mo17537e(expressionResolver, function16);
                    if (mo17537e13 == null) {
                        int i14 = Disposable.f30873B1;
                        mo17537e13 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e13);
                    Expression<Double> expression23 = range2.f40042h;
                    Disposable mo17537e14 = expression23 == null ? null : expression23.mo17537e(expressionResolver, function16);
                    if (mo17537e14 == null) {
                        int i15 = Disposable.f30873B1;
                        mo17537e14 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e14);
                    Expression<Long> expression24 = range2.f40043i;
                    Disposable mo17537e15 = expression24 == null ? null : expression24.mo17537e(expressionResolver, function16);
                    if (mo17537e15 == null) {
                        int i16 = Disposable.f30873B1;
                        mo17537e15 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e15);
                    Expression<DivLineStyle> expression25 = range2.f40045k;
                    Disposable mo17537e16 = expression25 == null ? null : expression25.mo17537e(expressionResolver, function16);
                    if (mo17537e16 == null) {
                        int i17 = Disposable.f30873B1;
                        mo17537e16 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e16);
                    Expression<Integer> expression26 = range2.f40046l;
                    Disposable mo17537e17 = expression26 == null ? null : expression26.mo17537e(expressionResolver, function16);
                    if (mo17537e17 == null) {
                        int i18 = Disposable.f30873B1;
                        mo17537e17 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e17);
                    Expression<Long> expression27 = range2.f40047m;
                    Disposable mo17537e18 = expression27 == null ? null : expression27.mo17537e(expressionResolver, function16);
                    if (mo17537e18 == null) {
                        int i19 = Disposable.f30873B1;
                        mo17537e18 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e18);
                    Expression<DivLineStyle> expression28 = range2.f40048n;
                    Disposable mo17537e19 = expression28 == null ? null : expression28.mo17537e(expressionResolver, function16);
                    if (mo17537e19 == null) {
                        int i20 = Disposable.f30873B1;
                        mo17537e19 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e19);
                    DivTextRangeBackground divTextRangeBackground = range2.f40036b;
                    if (divTextRangeBackground == null) {
                        divSolidBackground = null;
                    } else {
                        if (!(divTextRangeBackground instanceof DivTextRangeBackground.Solid)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        divSolidBackground = ((DivTextRangeBackground.Solid) divTextRangeBackground).f40068c;
                    }
                    if (divSolidBackground instanceof DivSolidBackground) {
                        C6855a.m34405a(view, divSolidBackground.f39186a.mo17537e(expressionResolver, function16));
                    }
                    DivTextRangeBorder divTextRangeBorder = range2.f40037c;
                    Disposable mo17537e20 = (divTextRangeBorder == null || (divStroke2 = divTextRangeBorder.f40076b) == null || (expression2 = divStroke2.f39440a) == null) ? null : expression2.mo17537e(expressionResolver, function16);
                    if (mo17537e20 == null) {
                        int i21 = Disposable.f30873B1;
                        mo17537e20 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e20);
                    DivTextRangeBorder divTextRangeBorder2 = range2.f40037c;
                    Disposable mo17537e21 = (divTextRangeBorder2 == null || (divStroke = divTextRangeBorder2.f40076b) == null || (expression = divStroke.f39442c) == null) ? null : expression.mo17537e(expressionResolver, function16);
                    if (mo17537e21 == null) {
                        int i22 = Disposable.f30873B1;
                        mo17537e21 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e21);
                }
            }
            List<DivText.Image> list4 = ellipsis.f40002b;
            if (list4 != null) {
                for (DivText.Image image2 : list4) {
                    C6855a.m34405a(view, image2.f40014b.mo17537e(expressionResolver, function16));
                    C6855a.m34405a(view, image2.f40017e.mo17537e(expressionResolver, function16));
                    Expression<Integer> expression29 = image2.f40015c;
                    Disposable mo17537e22 = expression29 == null ? null : expression29.mo17537e(expressionResolver, function16);
                    if (mo17537e22 == null) {
                        int i23 = Disposable.f30873B1;
                        mo17537e22 = C2814a.f31000b;
                    }
                    C6855a.m34405a(view, mo17537e22);
                    C6855a.m34405a(view, image2.f40018f.f35795b.mo17537e(expressionResolver, function16));
                    C6855a.m34405a(view, image2.f40018f.f35794a.mo17537e(expressionResolver, function16));
                }
            }
        }
        Expression<Boolean> expression30 = div.f39969h;
        if (expression30 == null) {
            view.setAutoEllipsize(false);
        } else {
            view.setAutoEllipsize(expression30.mo17535b(expressionResolver).booleanValue());
        }
        final DivTextGradient divTextGradient = div.f39950O;
        m17048i(view, expressionResolver, divTextGradient);
        if (divTextGradient != null) {
            Function1<? super Long, Unit> function17 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$observeTextGradient$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivTextBinder.this.m17048i(view, expressionResolver, divTextGradient);
                    return Unit.f63088a;
                }
            };
            Object m17717a = divTextGradient.m17717a();
            if (m17717a instanceof DivLinearGradient) {
                C6855a.m34405a(view, ((DivLinearGradient) m17717a).f37694a.mo17537e(expressionResolver, function17));
            } else if (m17717a instanceof DivRadialGradient) {
                DivRadialGradient divRadialGradient = (DivRadialGradient) m17717a;
                BaseDivViewExtensionsKt.m16919I(divRadialGradient.f38083a, expressionResolver, view, function17);
                BaseDivViewExtensionsKt.m16919I(divRadialGradient.f38084b, expressionResolver, view, function17);
                BaseDivViewExtensionsKt.m16920J(divRadialGradient.f38086d, expressionResolver, view, function17);
            }
        }
        C6855a.m34405a(view, div.f39943H.mo17538f(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView = view;
                Objects.requireNonNull(divTextBinder);
                divLineHeightTextView.setTextIsSelectable(booleanValue);
                return Unit.f63088a;
            }
        }));
        view.setFocusable(view.isFocusable() || div.f39978q != null);
    }
}
