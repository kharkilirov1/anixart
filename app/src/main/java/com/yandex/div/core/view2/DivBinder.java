package com.yandex.div.core.view2;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivPagerBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivBinder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivBinder {

    /* renamed from: a */
    @NotNull
    public final DivValidator f31606a;

    /* renamed from: b */
    @NotNull
    public final DivTextBinder f31607b;

    /* renamed from: c */
    @NotNull
    public final DivContainerBinder f31608c;

    /* renamed from: d */
    @NotNull
    public final DivSeparatorBinder f31609d;

    /* renamed from: e */
    @NotNull
    public final DivImageBinder f31610e;

    /* renamed from: f */
    @NotNull
    public final DivGifImageBinder f31611f;

    /* renamed from: g */
    @NotNull
    public final DivGridBinder f31612g;

    /* renamed from: h */
    @NotNull
    public final DivGalleryBinder f31613h;

    /* renamed from: i */
    @NotNull
    public final DivPagerBinder f31614i;

    /* renamed from: j */
    @NotNull
    public final DivTabsBinder f31615j;

    /* renamed from: k */
    @NotNull
    public final DivStateBinder f31616k;

    /* renamed from: l */
    @NotNull
    public final DivCustomBinder f31617l;

    /* renamed from: m */
    @NotNull
    public final DivIndicatorBinder f31618m;

    /* renamed from: n */
    @NotNull
    public final DivSliderBinder f31619n;

    /* renamed from: o */
    @NotNull
    public final DivInputBinder f31620o;

    /* renamed from: p */
    @NotNull
    public final DivSelectBinder f31621p;

    /* renamed from: q */
    @NotNull
    public final DivVideoBinder f31622q;

    /* renamed from: r */
    @NotNull
    public final DivExtensionController f31623r;

    /* renamed from: s */
    @NotNull
    public final PagerIndicatorConnector f31624s;

    @Inject
    public DivBinder(@NotNull DivValidator validator, @NotNull DivTextBinder textBinder, @NotNull DivContainerBinder containerBinder, @NotNull DivSeparatorBinder separatorBinder, @NotNull DivImageBinder imageBinder, @NotNull DivGifImageBinder gifImageBinder, @NotNull DivGridBinder gridBinder, @NotNull DivGalleryBinder galleryBinder, @NotNull DivPagerBinder pagerBinder, @NotNull DivTabsBinder tabsBinder, @NotNull DivStateBinder stateBinder, @NotNull DivCustomBinder customBinder, @NotNull DivIndicatorBinder indicatorBinder, @NotNull DivSliderBinder sliderBinder, @NotNull DivInputBinder inputBinder, @NotNull DivSelectBinder selectBinder, @NotNull DivVideoBinder videoBinder, @NotNull DivExtensionController extensionController, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(textBinder, "textBinder");
        Intrinsics.m32179h(containerBinder, "containerBinder");
        Intrinsics.m32179h(separatorBinder, "separatorBinder");
        Intrinsics.m32179h(imageBinder, "imageBinder");
        Intrinsics.m32179h(gifImageBinder, "gifImageBinder");
        Intrinsics.m32179h(gridBinder, "gridBinder");
        Intrinsics.m32179h(galleryBinder, "galleryBinder");
        Intrinsics.m32179h(pagerBinder, "pagerBinder");
        Intrinsics.m32179h(tabsBinder, "tabsBinder");
        Intrinsics.m32179h(stateBinder, "stateBinder");
        Intrinsics.m32179h(customBinder, "customBinder");
        Intrinsics.m32179h(indicatorBinder, "indicatorBinder");
        Intrinsics.m32179h(sliderBinder, "sliderBinder");
        Intrinsics.m32179h(inputBinder, "inputBinder");
        Intrinsics.m32179h(selectBinder, "selectBinder");
        Intrinsics.m32179h(videoBinder, "videoBinder");
        Intrinsics.m32179h(extensionController, "extensionController");
        Intrinsics.m32179h(pagerIndicatorConnector, "pagerIndicatorConnector");
        this.f31606a = validator;
        this.f31607b = textBinder;
        this.f31608c = containerBinder;
        this.f31609d = separatorBinder;
        this.f31610e = imageBinder;
        this.f31611f = gifImageBinder;
        this.f31612g = gridBinder;
        this.f31613h = galleryBinder;
        this.f31614i = pagerBinder;
        this.f31615j = tabsBinder;
        this.f31616k = stateBinder;
        this.f31617l = customBinder;
        this.f31618m = indicatorBinder;
        this.f31619n = sliderBinder;
        this.f31620o = inputBinder;
        this.f31621p = selectBinder;
        this.f31622q = videoBinder;
        this.f31623r = extensionController;
        this.f31624s = pagerIndicatorConnector;
    }

    @MainThread
    /* renamed from: a */
    public void m16851a() {
        PagerIndicatorConnector pagerIndicatorConnector = this.f31624s;
        for (Map.Entry<String, DivPagerView> entry : pagerIndicatorConnector.f32534a.entrySet()) {
            String key = entry.getKey();
            DivPagerView value = entry.getValue();
            List<DivPagerIndicatorView> list = pagerIndicatorConnector.f32535b.get(key);
            if (list != null) {
                for (DivPagerIndicatorView divPagerIndicatorView : list) {
                    ViewPager2 newPager = value.getViewPager();
                    Objects.requireNonNull(divPagerIndicatorView);
                    Intrinsics.m32179h(newPager, "newPager");
                    ViewPager2 viewPager2 = divPagerIndicatorView.f34066c;
                    if (viewPager2 != newPager) {
                        if (viewPager2 != null) {
                            viewPager2.m4393g(divPagerIndicatorView.f34068e);
                        }
                        if (newPager.getAdapter() == null) {
                            throw new IllegalArgumentException("Attached pager adapter is null!".toString());
                        }
                        newPager.m4389c(divPagerIndicatorView.f34068e);
                        divPagerIndicatorView.f34066c = newPager;
                        IndicatorsStripDrawer indicatorsStripDrawer = divPagerIndicatorView.f34065b;
                        if (indicatorsStripDrawer != null) {
                            divPagerIndicatorView.m17429b(indicatorsStripDrawer);
                        }
                    }
                }
            }
        }
        pagerIndicatorConnector.f32534a.clear();
        pagerIndicatorConnector.f32535b.clear();
    }

    @MainThread
    /* renamed from: b */
    public void m16852b(@NotNull View view, @NotNull Div div, @NotNull Div2View divView, @NotNull DivStatePath path) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(path, "path");
        try {
            DivValidator divValidator = this.f31606a;
            ExpressionResolver resolver = divView.getExpressionResolver();
            Objects.requireNonNull(divValidator);
            Intrinsics.m32179h(resolver, "resolver");
            if (!divValidator.m17303m(div, resolver).booleanValue()) {
                DivBase m17557a = div.m17557a();
                BaseDivViewExtensionsKt.m16949i(view, m17557a.getF39937B(), divView.getExpressionResolver());
                return;
            }
            this.f31623r.m16691a(divView, view, div.m17557a());
            if (div instanceof Div.Text) {
                this.f31607b.m17049j((DivLineHeightTextView) view, ((Div.Text) div).f34435c, divView);
            } else if (div instanceof Div.Image) {
                this.f31610e.m17004d((DivImageView) view, ((Div.Image) div).f34426c, divView);
            } else if (div instanceof Div.GifImage) {
                this.f31611f.m16996a((DivGifImageView) view, ((Div.GifImage) div).f34424c, divView);
            } else if (div instanceof Div.Separator) {
                this.f31609d.m17026a((DivSeparatorView) view, ((Div.Separator) div).f34431c, divView);
            } else if (div instanceof Div.Container) {
                this.f31608c.m16990b((ViewGroup) view, ((Div.Container) div).f34421c, divView, path);
            } else if (div instanceof Div.Grid) {
                this.f31612g.m17000c((DivGridLayout) view, ((Div.Grid) div).f34425c, divView, path);
            } else if (div instanceof Div.Gallery) {
                this.f31613h.m17055b((DivRecyclerView) view, ((Div.Gallery) div).f34423c, divView, path);
            } else if (div instanceof Div.Pager) {
                this.f31614i.m17015c((DivPagerView) view, ((Div.Pager) div).f34429c, divView, path);
            } else if (div instanceof Div.Tabs) {
                this.f31615j.m17078c((TabsLayout) view, ((Div.Tabs) div).f34434c, divView, this, path);
            } else if (div instanceof Div.State) {
                this.f31616k.m17034a((DivStateLayout) view, ((Div.State) div).f34433c, divView, path);
            } else if (div instanceof Div.Custom) {
                m16853c(view, ((Div.Custom) div).f34422c, divView);
            } else if (div instanceof Div.Indicator) {
                this.f31618m.m17008b((DivPagerIndicatorView) view, ((Div.Indicator) div).f34427c, divView);
            } else if (div instanceof Div.Slider) {
                this.f31619n.m17029c((DivSliderView) view, ((Div.Slider) div).f34432c, divView);
            } else if (div instanceof Div.Input) {
                this.f31620o.m17012b((DivInputView) view, ((Div.Input) div).f34428c, divView);
            } else if (div instanceof Div.Select) {
                this.f31621p.m17025a((DivSelectView) view, ((Div.Select) div).f34430c, divView);
            } else {
                if (!(div instanceof Div.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                m16854d(view, ((Div.Video) div).f34436c, divView);
            }
            if (div instanceof Div.Custom) {
                return;
            }
            this.f31623r.m16692b(divView, view, div.m17557a());
        } catch (ParsingException e2) {
            if (!ExpressionFallbacksHelperKt.m16669a(e2)) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16853c(android.view.View r10, com.yandex.div2.DivCustom r11, com.yandex.div.core.view2.Div2View r12) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.DivBinder.m16853c(android.view.View, com.yandex.div2.DivCustom, com.yandex.div.core.view2.Div2View):void");
    }

    /* renamed from: d */
    public final void m16854d(View view, final DivVideo div, final Div2View div2View) {
        final DivVideoBinder divVideoBinder = this.f31622q;
        DivVideoView divVideoView = (DivVideoView) view;
        Objects.requireNonNull(divVideoBinder);
        Intrinsics.m32179h(div, "div");
        DivVideo div2 = divVideoView.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        ExpressionResolver resolver = div2View.getExpressionResolver();
        C6855a.m34406b(divVideoView);
        divVideoView.setDiv$div_release(div);
        if (div2 != null) {
            divVideoBinder.f32527a.m16988i(divVideoView, div2, div2View);
        }
        divVideoView.removeAllViews();
        DivPlayerFactory mo16648t = div2View.getDiv2Component().mo16648t();
        Intrinsics.m32179h(resolver, "resolver");
        List<DivVideoSource> list = div.f40685G;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        for (DivVideoSource divVideoSource : list) {
            Uri mo17535b = divVideoSource.f40725d.mo17535b(resolver);
            String mo17535b2 = divVideoSource.f40723b.mo17535b(resolver);
            DivVideoSource.Resolution resolution = divVideoSource.f40724c;
            DivVideoResolution divVideoResolution = resolution == null ? null : new DivVideoResolution((int) resolution.f40730b.mo17535b(resolver).longValue(), (int) resolution.f40729a.mo17535b(resolver).longValue());
            Expression<Long> expression = divVideoSource.f40722a;
            arrayList.add(new com.yandex.div.core.player.DivVideoSource(mo17535b, mo17535b2, divVideoResolution, expression == null ? null : expression.mo17535b(resolver)));
        }
        final DivPlayer player = mo16648t.mo16699b(arrayList, new DivPlayerPlaybackConfig(div.f40694e.mo17535b(resolver).booleanValue(), div.f40708s.mo17535b(resolver).booleanValue(), div.f40712w.mo17535b(resolver).booleanValue(), div.f40711v));
        DivPlayerFactory mo16648t2 = div2View.getDiv2Component().mo16648t();
        Context context = divVideoView.getContext();
        Intrinsics.m32178g(context, "view.context");
        DivPlayerView mo16698a = mo16648t2.mo16698a(context);
        divVideoView.addView(mo16698a);
        Objects.requireNonNull(mo16698a);
        Intrinsics.m32179h(player, "player");
        divVideoBinder.f32527a.m16984e(divVideoView, div, div2, div2View);
        player.mo16697b(new DivPlayer.Observer(div, div2View, divVideoBinder) { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$bindView$playerListener$1
        });
        String str = div.f40700k;
        if (str == null) {
            return;
        }
        C6855a.m34405a(divVideoView, divVideoBinder.f32528b.m16683a(div2View, str, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: a */
            public void mo16684a(Long l2) {
                Long l3 = l2;
                if (l3 == null) {
                    return;
                }
                DivPlayer divPlayer = DivPlayer.this;
                l3.longValue();
                divPlayer.mo16696a(l3.longValue());
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: b */
            public void mo16685b(@NotNull final Function1<? super Long, Unit> function1) {
                DivPlayer.this.mo16697b(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                });
            }
        }));
    }
}
