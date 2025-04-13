package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import com.yandex.div.core.C2816c;
import com.yandex.div.core.C2824e;
import com.yandex.div.core.C2834i;
import com.yandex.div.core.C2835j;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivCustomViewFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.state.InMemoryDivStateCache;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivTooltip;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.op */
/* loaded from: classes3.dex */
public final class C5546op {
    @NonNull
    /* renamed from: a */
    public static DivConfiguration m27097a(@NonNull Context context) {
        C5297jp c5297jp = new C5297jp(context);
        C4983dp c4983dp = new C4983dp(new C5039ep(), new C5140gp(), new C5087fp());
        DivConfiguration.Builder builder = new DivConfiguration.Builder(c5297jp);
        builder.f30910b = c4983dp;
        builder.f30911c.add(C5983wp.m29518a());
        C4935cq c4935cq = new C4935cq(context);
        builder.f30912d = c4935cq;
        DivImageLoader divImageLoader = builder.f30909a;
        DivActionHandler divActionHandler = new DivActionHandler();
        Div2Logger div2Logger = Div2Logger.f30878a;
        DivDataChangeListener divDataChangeListener = DivDataChangeListener.f30957a;
        DivStateChangeListener divStateChangeListener = DivStateChangeListener.f31324a;
        InMemoryDivStateCache inMemoryDivStateCache = new InMemoryDivStateCache();
        int i2 = Div2ImageStubProvider.f30877a;
        C2816c c2816c = new Div2ImageStubProvider() { // from class: com.yandex.div.core.c
            @Override // com.yandex.div.core.Div2ImageStubProvider
            /* renamed from: a */
            public final Drawable mo16565a(int i3) {
                return new ColorDrawable(i3);
            }
        };
        int i3 = DivVisibilityChangeListener.f30989a;
        C2835j c2835j = new DivVisibilityChangeListener() { // from class: com.yandex.div.core.j
            @Override // com.yandex.div.core.DivVisibilityChangeListener
            /* renamed from: a */
            public final void mo16610a(Map map) {
                int i4 = C2836k.f31293a;
            }
        };
        int i4 = DivCustomViewFactory.f30956a;
        C2824e c2824e = new DivCustomViewFactory() { // from class: com.yandex.div.core.e
            @Override // com.yandex.div.core.DivCustomViewFactory
            /* renamed from: a */
            public final void mo16584a(DivCustom divCustom, Div2View div2View, DivCustomViewFactory.OnViewCreatedListener onViewCreatedListener) {
                int i5 = C2829f.f31271a;
                new Space(div2View.getContext());
            }
        };
        DivCustomViewAdapter divCustomViewAdapter = builder.f30910b;
        DivPlayerFactory divPlayerFactory = DivPlayerFactory.f31294a;
        int i5 = DivTooltipRestrictor.f30987a;
        C2834i c2834i = new DivTooltipRestrictor() { // from class: com.yandex.div.core.i
            @Override // com.yandex.div.core.DivTooltipRestrictor
            /* renamed from: a */
            public boolean mo16602a(Div2View div2View, View view, DivTooltip divTooltip) {
                return true;
            }

            @Override // com.yandex.div.core.DivTooltipRestrictor
            /* renamed from: b */
            public /* synthetic */ DivTooltipRestrictor.DivTooltipShownCallback mo16603b() {
                return null;
            }
        };
        List<DivExtensionHandler> list = builder.f30911c;
        int i6 = DivDownloader.f31156a;
        return new DivConfiguration(divImageLoader, divActionHandler, div2Logger, divDataChangeListener, divStateChangeListener, inMemoryDivStateCache, c2816c, c2835j, c2824e, divCustomViewAdapter, divPlayerFactory, c2834i, list, new DivDownloader() { // from class: com.yandex.div.core.downloader.a
            @Override // com.yandex.div.core.downloader.DivDownloader
            /* renamed from: a */
            public final LoadReference mo16662a(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
                int i7 = C2823b.f31165a;
                return new LoadReference() { // from class: com.yandex.div.core.downloader.DivDownloader.1
                    @Override // com.yandex.div.core.images.LoadReference
                    public void cancel() {
                    }
                };
            }
        }, c4935cq, c4935cq, ViewPoolProfiler.Reporter.f33939a, new GlobalVariableController(), builder.f30913e, builder.f30914f, builder.f30915g, builder.f30916h, builder.f30918j, builder.f30917i, builder.f30919k, builder.f30920l, builder.f30921m, builder.f30922n, builder.f30923o, false, null);
    }
}
