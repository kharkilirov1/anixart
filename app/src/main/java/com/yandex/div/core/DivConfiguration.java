package com.yandex.div.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.state.DivStateCache;
import dagger.Module;
import java.util.ArrayList;
import java.util.List;

@PublicApi
@Module
/* loaded from: classes2.dex */
public class DivConfiguration {

    /* renamed from: A */
    public boolean f30879A;

    /* renamed from: B */
    public boolean f30880B;

    /* renamed from: C */
    public boolean f30881C;

    /* renamed from: D */
    public boolean f30882D;

    /* renamed from: a */
    @NonNull
    public final DivImageLoader f30883a;

    /* renamed from: b */
    @NonNull
    public final DivActionHandler f30884b;

    /* renamed from: c */
    @NonNull
    public final Div2Logger f30885c;

    /* renamed from: d */
    @NonNull
    public final DivDataChangeListener f30886d;

    /* renamed from: e */
    @NonNull
    public final DivStateChangeListener f30887e;

    /* renamed from: f */
    @NonNull
    public final DivStateCache f30888f;

    /* renamed from: g */
    @NonNull
    public final Div2ImageStubProvider f30889g;

    /* renamed from: h */
    @NonNull
    public final DivVisibilityChangeListener f30890h;

    /* renamed from: i */
    @NonNull
    public final DivCustomViewFactory f30891i;

    /* renamed from: j */
    @Nullable
    public final DivCustomViewAdapter f30892j;

    /* renamed from: k */
    @NonNull
    public final DivPlayerFactory f30893k;

    /* renamed from: l */
    @NonNull
    public final DivTooltipRestrictor f30894l;

    /* renamed from: m */
    @NonNull
    public final List<DivExtensionHandler> f30895m;

    /* renamed from: n */
    @NonNull
    public final DivDownloader f30896n;

    /* renamed from: o */
    @NonNull
    public final DivTypefaceProvider f30897o;

    /* renamed from: p */
    @NonNull
    public final DivTypefaceProvider f30898p;

    /* renamed from: q */
    @NonNull
    public final ViewPoolProfiler.Reporter f30899q;

    /* renamed from: r */
    @NonNull
    public final GlobalVariableController f30900r;

    /* renamed from: s */
    public final boolean f30901s;

    /* renamed from: t */
    public final boolean f30902t;

    /* renamed from: u */
    public final boolean f30903u;

    /* renamed from: v */
    public final boolean f30904v;

    /* renamed from: w */
    public final boolean f30905w;

    /* renamed from: x */
    public final boolean f30906x;

    /* renamed from: y */
    public final boolean f30907y;

    /* renamed from: z */
    public boolean f30908z;

    public static class Builder {

        /* renamed from: a */
        @NonNull
        public final DivImageLoader f30909a;

        /* renamed from: b */
        @Nullable
        public DivCustomViewAdapter f30910b;

        /* renamed from: d */
        @Nullable
        public DivTypefaceProvider f30912d;

        /* renamed from: l */
        public boolean f30920l;

        /* renamed from: m */
        public boolean f30921m;

        /* renamed from: n */
        public boolean f30922n;

        /* renamed from: o */
        public boolean f30923o;

        /* renamed from: c */
        @NonNull
        public final List<DivExtensionHandler> f30911c = new ArrayList();

        /* renamed from: e */
        public boolean f30913e = Experiment.TAP_BEACONS_ENABLED.f31181b;

        /* renamed from: f */
        public boolean f30914f = Experiment.VISIBILITY_BEACONS_ENABLED.f31181b;

        /* renamed from: g */
        public boolean f30915g = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.f31181b;

        /* renamed from: h */
        public boolean f30916h = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.f31181b;

        /* renamed from: i */
        public boolean f30917i = Experiment.HYPHENATION_SUPPORT_ENABLED.f31181b;

        /* renamed from: j */
        public boolean f30918j = Experiment.VISUAL_ERRORS_ENABLED.f31181b;

        /* renamed from: k */
        public boolean f30919k = Experiment.ACCESSIBILITY_ENABLED.f31181b;

        public Builder(@NonNull DivImageLoader divImageLoader) {
            Experiment experiment = Experiment.VIEW_POOL_ENABLED;
            this.f30920l = true;
            this.f30921m = Experiment.VIEW_POOL_PROFILING_ENABLED.f31181b;
            Experiment experiment2 = Experiment.RESOURCE_CACHE_ENABLED;
            this.f30922n = true;
            this.f30923o = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.f31181b;
            this.f30909a = divImageLoader;
        }
    }

    public DivConfiguration(DivImageLoader divImageLoader, DivActionHandler divActionHandler, Div2Logger div2Logger, DivDataChangeListener divDataChangeListener, DivStateChangeListener divStateChangeListener, DivStateCache divStateCache, Div2ImageStubProvider div2ImageStubProvider, DivVisibilityChangeListener divVisibilityChangeListener, DivCustomViewFactory divCustomViewFactory, DivCustomViewAdapter divCustomViewAdapter, DivPlayerFactory divPlayerFactory, DivTooltipRestrictor divTooltipRestrictor, List list, DivDownloader divDownloader, DivTypefaceProvider divTypefaceProvider, DivTypefaceProvider divTypefaceProvider2, ViewPoolProfiler.Reporter reporter, GlobalVariableController globalVariableController, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, C28111 c28111) {
        this.f30883a = divImageLoader;
        this.f30884b = divActionHandler;
        this.f30885c = div2Logger;
        this.f30886d = divDataChangeListener;
        this.f30887e = divStateChangeListener;
        this.f30888f = divStateCache;
        this.f30889g = div2ImageStubProvider;
        this.f30890h = divVisibilityChangeListener;
        this.f30891i = divCustomViewFactory;
        this.f30892j = divCustomViewAdapter;
        this.f30893k = divPlayerFactory;
        this.f30894l = divTooltipRestrictor;
        this.f30895m = list;
        this.f30896n = divDownloader;
        this.f30897o = divTypefaceProvider;
        this.f30898p = divTypefaceProvider2;
        this.f30899q = reporter;
        this.f30901s = z;
        this.f30902t = z2;
        this.f30903u = z3;
        this.f30904v = z4;
        this.f30905w = z5;
        this.f30906x = z6;
        this.f30907y = z7;
        this.f30908z = z8;
        this.f30879A = z9;
        this.f30880B = z10;
        this.f30881C = z11;
        this.f30882D = z12;
        this.f30900r = globalVariableController;
    }
}
