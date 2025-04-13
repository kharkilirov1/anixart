package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.ImageUtilsKt;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivImageBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivImage;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivImageBinder implements DivViewBinder<DivImage, DivImageView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32109a;

    /* renamed from: b */
    @NotNull
    public final DivImageLoader f32110b;

    /* renamed from: c */
    @NotNull
    public final DivPlaceholderLoader f32111c;

    /* renamed from: d */
    @NotNull
    public final ErrorCollectors f32112d;

    @Inject
    public DivImageBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivImageLoader imageLoader, @NotNull DivPlaceholderLoader placeholderLoader, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(imageLoader, "imageLoader");
        Intrinsics.m32179h(placeholderLoader, "placeholderLoader");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32109a = baseBinder;
        this.f32110b = imageLoader;
        this.f32111c = placeholderLoader;
        this.f32112d = errorCollectors;
    }

    /* renamed from: a */
    public static final void m17001a(DivImageBinder divImageBinder, final DivImageView divImageView, List list, Div2View div2View, ExpressionResolver expressionResolver) {
        Objects.requireNonNull(divImageBinder);
        Bitmap currentBitmapWithoutFilters = divImageView.getCurrentBitmapWithoutFilters();
        if (currentBitmapWithoutFilters != null) {
            ImageUtilsKt.m17106a(currentBitmapWithoutFilters, divImageView, list, div2View.getDiv2Component(), expressionResolver, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyFiltersAndSetBitmap$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Bitmap bitmap) {
                    Bitmap it = bitmap;
                    Intrinsics.m32179h(it, "it");
                    DivImageView.this.setImageBitmap(it);
                    return Unit.f63088a;
                }
            });
        } else {
            divImageView.setImageBitmap(null);
        }
    }

    /* renamed from: b */
    public final void m17002b(final DivImageView divImageView, final Div2View div2View, final ExpressionResolver expressionResolver, final DivImage divImage, ErrorCollector errorCollector, boolean z) {
        Expression<String> expression = divImage.f36698C;
        String mo17535b = expression == null ? null : expression.mo17535b(expressionResolver);
        divImageView.setPreview$div_release(mo17535b);
        this.f32111c.m16861a(divImageView, errorCollector, mo17535b, divImage.f36696A.mo17535b(expressionResolver).intValue(), z, new Function1<Drawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPreview$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Drawable drawable) {
                Drawable drawable2 = drawable;
                if (!DivImageView.this.m17180j() && !DivImageView.this.m17181k()) {
                    DivImageView.this.setPlaceholder(drawable2);
                }
                return Unit.f63088a;
            }
        }, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPreview$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (!DivImageView.this.m17180j()) {
                    DivImageView.this.setCurrentBitmapWithoutFilters$div_release(bitmap2);
                    DivImageBinder.m17001a(this, DivImageView.this, divImage.f36731r, div2View, expressionResolver);
                    DivImageView.this.setTag(C2507R.id.image_loaded_flag, Boolean.FALSE);
                    DivImageBinder divImageBinder = this;
                    DivImageView divImageView2 = DivImageView.this;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    DivImage divImage2 = divImage;
                    divImageBinder.m17003c(divImageView2, expressionResolver2, divImage2.f36702G, divImage2.f36703H);
                }
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: c */
    public final void m17003c(ImageView imageView, ExpressionResolver expressionResolver, Expression<Integer> expression, Expression<DivBlendMode> expression2) {
        Integer mo17535b = expression == null ? null : expression.mo17535b(expressionResolver);
        if (mo17535b != null) {
            imageView.setColorFilter(mo17535b.intValue(), BaseDivViewExtensionsKt.m16933W(expression2.mo17535b(expressionResolver)));
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: d */
    public void m17004d(@NotNull final DivImageView view, @NotNull final DivImage div, @NotNull final Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivImage div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ErrorCollector m17115a = this.f32112d.m17115a(divView.getDataTag(), divView.getDivData());
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        ExpressionSubscriber m16765a = ReleasablesKt.m16765a(view);
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32109a.m16988i(view, div2, divView);
        }
        this.f32109a.m16984e(view, div, div2, divView);
        BaseDivViewExtensionsKt.m16941c(view, divView, div.f36715b, div.f36717d, div.f36737x, div.f36729p, div.f36716c);
        BaseDivViewExtensionsKt.m16921K(view, expressionResolver, div.f36722i);
        C6855a.m34405a(view, div.f36700E.mo17538f(expressionResolver, new Function1<DivImageScale, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivImageScale divImageScale) {
                DivImageScale scale = divImageScale;
                Intrinsics.m32179h(scale, "scale");
                DivImageView.this.setImageScale(BaseDivViewExtensionsKt.m16930T(scale));
                return Unit.f63088a;
            }
        }));
        final Expression<DivAlignmentHorizontal> expression = div.f36726m;
        final Expression<DivAlignmentVertical> expression2 = div.f36727n;
        view.setGravity(BaseDivViewExtensionsKt.m16964x(expression.mo17535b(expressionResolver), expression2.mo17535b(expressionResolver)));
        Function1<? super DivAlignmentHorizontal, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivImageBinder divImageBinder = DivImageBinder.this;
                DivImageView divImageView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Expression<DivAlignmentHorizontal> expression3 = expression;
                Expression<DivAlignmentVertical> expression4 = expression2;
                Objects.requireNonNull(divImageBinder);
                divImageView.setGravity(BaseDivViewExtensionsKt.m16964x(expression3.mo17535b(expressionResolver2), expression4.mo17535b(expressionResolver2)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, expression.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, expression2.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f36736w.mo17538f(expressionResolver, new Function1<Uri, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Uri uri) {
                Uri it = uri;
                Intrinsics.m32179h(it, "it");
                DivImageBinder divImageBinder = DivImageBinder.this;
                DivImageView divImageView = view;
                Div2View div2View = divView;
                ExpressionResolver expressionResolver2 = expressionResolver;
                ErrorCollector errorCollector = m17115a;
                DivImage divImage = div;
                Objects.requireNonNull(divImageBinder);
                Uri mo17535b = divImage.f36736w.mo17535b(expressionResolver2);
                if (Intrinsics.m32174c(mo17535b, divImageView.getImageUrl())) {
                    divImageBinder.m17003c(divImageView, expressionResolver2, divImage.f36702G, divImage.f36703H);
                } else {
                    boolean m17005e = divImageBinder.m17005e(expressionResolver2, divImageView, divImage);
                    divImageView.mo17100l();
                    LoadReference loadReference = divImageView.getLoadReference();
                    if (loadReference != null) {
                        loadReference.cancel();
                    }
                    divImageBinder.m17002b(divImageView, div2View, expressionResolver2, divImage, errorCollector, m17005e);
                    divImageView.setImageUrl$div_release(mo17535b);
                    LoadReference loadImage = divImageBinder.f32110b.loadImage(mo17535b.toString(), new DivIdLoggingImageDownloadCallback(divImageView, divImageBinder, divImage, expressionResolver2) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1

                        /* renamed from: b */
                        public final /* synthetic */ DivImageView f32115b;

                        /* renamed from: c */
                        public final /* synthetic */ DivImageBinder f32116c;

                        /* renamed from: d */
                        public final /* synthetic */ DivImage f32117d;

                        /* renamed from: e */
                        public final /* synthetic */ ExpressionResolver f32118e;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(Div2View.this);
                            this.f32115b = divImageView;
                            this.f32116c = divImageBinder;
                            this.f32117d = divImage;
                            this.f32118e = expressionResolver2;
                        }

                        @Override // com.yandex.div.core.images.DivImageDownloadCallback
                        /* renamed from: a */
                        public void mo16590a() {
                            this.f32115b.setImageUrl$div_release(null);
                        }

                        @Override // com.yandex.div.core.images.DivImageDownloadCallback
                        /* renamed from: b */
                        public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
                            this.f32115b.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.f31288a);
                            DivImageBinder.m17001a(this.f32116c, this.f32115b, this.f32117d.f36731r, Div2View.this, this.f32118e);
                            DivImageBinder divImageBinder2 = this.f32116c;
                            DivImageView divImageView2 = this.f32115b;
                            DivImage divImage2 = this.f32117d;
                            ExpressionResolver expressionResolver3 = this.f32118e;
                            BitmapSource bitmapSource = cachedBitmap.f31291d;
                            Objects.requireNonNull(divImageBinder2);
                            divImageView2.animate().cancel();
                            DivFadeTransition divFadeTransition = divImage2.f36721h;
                            float doubleValue = (float) divImage2.f36720g.mo17535b(expressionResolver3).doubleValue();
                            if (divFadeTransition == null || bitmapSource == BitmapSource.MEMORY) {
                                divImageView2.setAlpha(doubleValue);
                            } else {
                                long longValue = divFadeTransition.f35684b.mo17535b(expressionResolver3).longValue();
                                Interpolator m16759b = DivUtilKt.m16759b(divFadeTransition.f35685c.mo17535b(expressionResolver3));
                                divImageView2.setAlpha((float) divFadeTransition.f35683a.mo17535b(expressionResolver3).doubleValue());
                                divImageView2.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(m16759b).setStartDelay(divFadeTransition.f35686d.mo17535b(expressionResolver3).longValue());
                            }
                            this.f32115b.m17179i();
                            DivImageBinder divImageBinder3 = this.f32116c;
                            DivImageView divImageView3 = this.f32115b;
                            ExpressionResolver expressionResolver4 = this.f32118e;
                            DivImage divImage3 = this.f32117d;
                            divImageBinder3.m17003c(divImageView3, expressionResolver4, divImage3.f36702G, divImage3.f36703H);
                            this.f32115b.invalidate();
                        }
                    });
                    Intrinsics.m32178g(loadImage, "private fun DivImageView…ference = reference\n    }");
                    div2View.m16811l(loadImage, divImageView);
                    divImageView.setLoadReference$div_release(loadImage);
                }
                return Unit.f63088a;
            }
        }));
        Expression<String> expression3 = div.f36698C;
        if (expression3 != null) {
            C6855a.m34405a(view, expression3.mo17538f(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePreview$1$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(String str) {
                    String newPreview = str;
                    Intrinsics.m32179h(newPreview, "newPreview");
                    if (!DivImageView.this.m17180j() && !Intrinsics.m32174c(newPreview, DivImageView.this.getPreview())) {
                        DivImageView.this.mo17100l();
                        DivImageBinder divImageBinder = this;
                        DivImageView divImageView = DivImageView.this;
                        Div2View div2View = divView;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        DivImage divImage = div;
                        divImageBinder.m17002b(divImageView, div2View, expressionResolver2, divImage, m17115a, divImageBinder.m17005e(expressionResolver2, divImageView, divImage));
                    }
                    return Unit.f63088a;
                }
            }));
        }
        final Expression<Integer> expression4 = div.f36702G;
        final Expression<DivBlendMode> expression5 = div.f36703H;
        if (expression4 == null) {
            view.setColorFilter((ColorFilter) null);
        } else {
            Function1<? super Integer, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observeTint$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    if (DivImageView.this.m17180j() || DivImageView.this.m17181k()) {
                        this.m17003c(DivImageView.this, expressionResolver, expression4, expression5);
                    } else {
                        DivImageBinder divImageBinder = this;
                        DivImageView divImageView = DivImageView.this;
                        Objects.requireNonNull(divImageBinder);
                        divImageView.setColorFilter((ColorFilter) null);
                    }
                    return Unit.f63088a;
                }
            };
            C6855a.m34405a(view, expression4.mo17538f(expressionResolver, function12));
            C6855a.m34405a(view, expression5.mo17538f(expressionResolver, function12));
        }
        final List<DivFilter> list = div.f36731r;
        if (list == null) {
            return;
        }
        Function1<? super Long, Unit> function13 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observeFilters$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivImageBinder.m17001a(DivImageBinder.this, view, list, divView, expressionResolver);
                return Unit.f63088a;
            }
        };
        for (DivFilter divFilter : list) {
            if (divFilter instanceof DivFilter.Blur) {
                m16765a.mo16763e(((DivFilter.Blur) divFilter).f35719c.f34778a.mo17537e(expressionResolver, function13));
            }
        }
    }

    /* renamed from: e */
    public final boolean m17005e(ExpressionResolver expressionResolver, DivImageView divImageView, DivImage divImage) {
        return !divImageView.m17180j() && divImage.f36734u.mo17535b(expressionResolver).booleanValue();
    }
}
