package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import com.yandex.mobile.ads.nativeads.C6266y;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xi0 implements DivExtensionHandler {

    /* renamed from: a */
    @NotNull
    private final List<InterfaceC6256u> f56478a;

    /* renamed from: b */
    @NotNull
    private final NativeAdEventListener f56479b;

    /* renamed from: c */
    @NotNull
    private final C5242ip f56480c;

    /* renamed from: d */
    @NotNull
    private final C5199ht f56481d;

    /* renamed from: e */
    @NotNull
    private final C5301jt f56482e;

    /* renamed from: f */
    @NotNull
    private final C6266y f56483f;

    /* renamed from: g */
    @NotNull
    private final C6134zp f56484g;

    @VisibleForTesting
    public xi0(@NotNull List nativeAds, @NotNull oj0 nativeAdEventListener, @NotNull C5242ip divExtensionProvider, @NotNull C5199ht extensionPositionParser, @NotNull C5301jt extensionViewNameParser, @NotNull C6266y nativeAdViewBinderFromProviderCreator, @NotNull C6134zp divKitNewBinderFeature) {
        Intrinsics.m32179h(nativeAds, "nativeAds");
        Intrinsics.m32179h(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.m32179h(divExtensionProvider, "divExtensionProvider");
        Intrinsics.m32179h(extensionPositionParser, "extensionPositionParser");
        Intrinsics.m32179h(extensionViewNameParser, "extensionViewNameParser");
        Intrinsics.m32179h(nativeAdViewBinderFromProviderCreator, "nativeAdViewBinderFromProviderCreator");
        Intrinsics.m32179h(divKitNewBinderFeature, "divKitNewBinderFeature");
        this.f56478a = nativeAds;
        this.f56479b = nativeAdEventListener;
        this.f56480c = divExtensionProvider;
        this.f56481d = extensionPositionParser;
        this.f56482e = extensionViewNameParser;
        this.f56483f = nativeAdViewBinderFromProviderCreator;
        this.f56484g = divKitNewBinderFeature;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public void beforeBindView(@NotNull Div2View divView, @NotNull View view, @NotNull DivBase div) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(@NotNull Div2View div2View, @NotNull View view, @NotNull DivBase divBase) {
        Intrinsics.m32179h(div2View, "div2View");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(divBase, "divBase");
        view.setVisibility(8);
        Objects.requireNonNull(this.f56480c);
        DivExtension m25586a = C5242ip.m25586a(divBase);
        if (m25586a != null) {
            Objects.requireNonNull(this.f56481d);
            Integer m25360a = C5199ht.m25360a(m25586a);
            if (m25360a == null || m25360a.intValue() < 0 || m25360a.intValue() >= this.f56478a.size()) {
                return;
            }
            InterfaceC6256u interfaceC6256u = this.f56478a.get(m25360a.intValue());
            NativeAdViewBinder m30758a = this.f56483f.m30758a(view, new fn0(m25360a.intValue()));
            Intrinsics.m32178g(m30758a, "nativeAdViewBinderFromPr…(view, assetViewProvider)");
            try {
                C6134zp c6134zp = this.f56484g;
                Context context = div2View.getContext();
                Intrinsics.m32178g(context, "div2View.context");
                Objects.requireNonNull(c6134zp);
                if (C6134zp.m30263a(context)) {
                    C5689rh c5689rh = new C5689rh();
                    DivActionHandler actionHandler = div2View.getActionHandler();
                    C5351kp c5351kp = actionHandler instanceof C5351kp ? (C5351kp) actionHandler : null;
                    if (c5351kp != null) {
                        c5351kp.m26174a(m25360a.intValue(), c5689rh);
                    }
                    interfaceC6256u.mo30561a(m30758a, c5689rh);
                } else {
                    interfaceC6256u.bindNativeAd(m30758a);
                }
                view.setVisibility(0);
                interfaceC6256u.setNativeAdEventListener(this.f56479b);
            } catch (NativeAdException unused) {
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(@NotNull DivBase divBase) {
        Intrinsics.m32179h(divBase, "divBase");
        Objects.requireNonNull(this.f56480c);
        DivExtension m25586a = C5242ip.m25586a(divBase);
        if (m25586a == null) {
            return false;
        }
        Objects.requireNonNull(this.f56481d);
        Integer m25360a = C5199ht.m25360a(m25586a);
        Objects.requireNonNull(this.f56482e);
        return m25360a != null && Intrinsics.m32174c("native_ad_view", C5301jt.m25938a(m25586a));
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public void preprocess(@NotNull DivBase div, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(expressionResolver, "expressionResolver");
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(@NotNull Div2View div2View, @NotNull View view, @NotNull DivBase divBase) {
        Intrinsics.m32179h(div2View, "div2View");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(divBase, "divBase");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xi0(@NotNull c21 sliderAdPrivate, @NotNull oj0 nativeAdEventListener) {
        this(sliderAdPrivate.mo23013c(), nativeAdEventListener, new C5242ip(), new C5199ht(), new C5301jt(), new C6266y(new C5703rp().m27964a(sliderAdPrivate)), new C6134zp());
        Intrinsics.m32179h(sliderAdPrivate, "sliderAdPrivate");
        Intrinsics.m32179h(nativeAdEventListener, "nativeAdEventListener");
    }
}
