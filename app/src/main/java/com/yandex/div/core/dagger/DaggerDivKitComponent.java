package com.yandex.div.core.dagger;

import android.content.Context;
import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.android.beacon.SendBeaconManager;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivConfiguration_GetActionHandlerFactory;
import com.yandex.div.core.DivConfiguration_GetAreVisualErrorsEnabledFactory;
import com.yandex.div.core.DivConfiguration_GetDisplayTypefaceProviderFactory;
import com.yandex.div.core.DivConfiguration_GetDiv2ImageStubProviderFactory;
import com.yandex.div.core.DivConfiguration_GetDiv2LoggerFactory;
import com.yandex.div.core.DivConfiguration_GetDivCustomViewAdapterFactory;
import com.yandex.div.core.DivConfiguration_GetDivCustomViewFactoryFactory;
import com.yandex.div.core.DivConfiguration_GetDivStateCacheFactory;
import com.yandex.div.core.DivConfiguration_GetDivVisibilityChangeListenerFactory;
import com.yandex.div.core.DivConfiguration_GetExtensionHandlersFactory;
import com.yandex.div.core.DivConfiguration_GetImageLoaderFactory;
import com.yandex.div.core.DivConfiguration_GetTooltipRestrictorFactory;
import com.yandex.div.core.DivConfiguration_GetTypefaceProviderFactory;
import com.yandex.div.core.DivConfiguration_GetViewPoolReporterFactory;
import com.yandex.div.core.DivConfiguration_IsAccessibilityEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsContextMenuHandlerOverriddenFactory;
import com.yandex.div.core.DivConfiguration_IsHyphenationSupportedFactory;
import com.yandex.div.core.DivConfiguration_IsLongtapActionsPassToChildFactory;
import com.yandex.div.core.DivConfiguration_IsMultipleStateChangeEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsResourceCacheEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsTapBeaconsEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsViewPoolEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsViewPoolProfilingEnabledFactory;
import com.yandex.div.core.DivConfiguration_IsVisibilityBeaconsEnabledFactory;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivCustomViewFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivKitConfiguration_CpuUsageHistogramReporterFactory;
import com.yandex.div.core.DivKitConfiguration_ExecutorServiceFactory;
import com.yandex.div.core.DivKitConfiguration_HistogramConfigurationFactory;
import com.yandex.div.core.DivKitConfiguration_HistogramRecorderFactory;
import com.yandex.div.core.DivKitConfiguration_SendBeaconConfigurationFactory;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchCache_Factory;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.downloader.DivPatchManager_Factory;
import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.ExpressionsRuntimeProvider_Factory;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder_Factory;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder_Factory;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.extension.DivExtensionController_Factory;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoActionHandler_Factory;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.DivStateManager_Factory;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache_Factory;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider_Factory;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipController_Factory;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2Builder_Factory;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivAccessibilityBinder_Factory;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivBinder_Factory;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivImagePreloader_Factory;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivPlaceholderLoader_Factory;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTransitionBuilder_Factory;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolver_Factory;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivValidator_Factory;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewCreator_Factory;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivViewIdProvider_Factory;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher_Factory;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.DivVisibilityActionTracker_Factory;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewBindingProvider_Factory;
import com.yandex.div.core.view2.ViewVisibilityCalculator_Factory;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBeaconSender_Factory;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivActionBinder_Factory;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder_Factory;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder_Factory;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder_Factory;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder_Factory;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder_Factory;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder_Factory;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivGridBinder_Factory;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivImageBinder_Factory;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder_Factory;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivInputBinder_Factory;
import com.yandex.div.core.view2.divs.DivPagerBinder;
import com.yandex.div.core.view2.divs.DivPagerBinder_Factory;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder_Factory;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder_Factory;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder_Factory;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivStateBinder_Factory;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivTextBinder_Factory;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder_Factory;
import com.yandex.div.core.view2.divs.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.PagerIndicatorConnector_Factory;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder_Factory;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder_Factory;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor_Factory;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorCollectors_Factory;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor_Factory;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher_Factory;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher_Factory;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.core.view2.state.DivStateTransitionHolder_Factory;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramColdTypeChecker_Factory;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.state.DivStateCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DaggerDivKitComponent implements DivKitComponent {

    /* renamed from: a */
    public final DivKitConfiguration f31011a;

    /* renamed from: b */
    public final DaggerDivKitComponent f31012b = this;

    /* renamed from: c */
    public Provider<Context> f31013c;

    /* renamed from: d */
    public Provider<SendBeaconConfiguration> f31014d;

    /* renamed from: e */
    public Provider<SendBeaconManager> f31015e;

    /* renamed from: f */
    public Provider<HistogramRecorder> f31016f;

    /* renamed from: g */
    public Provider<HistogramConfiguration> f31017g;

    /* renamed from: h */
    public Provider<HistogramColdTypeChecker> f31018h;

    /* renamed from: i */
    public Provider<HistogramReporterDelegate> f31019i;

    /* renamed from: j */
    public Provider<ExecutorService> f31020j;

    /* renamed from: k */
    public Provider<DivParsingHistogramReporter> f31021k;

    /* renamed from: l */
    public Provider<CpuUsageHistogramReporter> f31022l;

    /* renamed from: m */
    public Provider<ViewCreator> f31023m;

    public static final class Builder implements DivKitComponent.Builder {

        /* renamed from: a */
        public Context f31024a;

        /* renamed from: b */
        public DivKitConfiguration f31025b;

        public Builder() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        /* renamed from: A */
        public DivKitComponent mo16620A() {
            Preconditions.m30793a(this.f31024a, Context.class);
            Preconditions.m30793a(this.f31025b, DivKitConfiguration.class);
            return new DaggerDivKitComponent(this.f31025b, this.f31024a, null);
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        /* renamed from: a */
        public DivKitComponent.Builder mo16621a(DivKitConfiguration divKitConfiguration) {
            Objects.requireNonNull(divKitConfiguration);
            this.f31025b = divKitConfiguration;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        /* renamed from: b */
        public DivKitComponent.Builder mo16622b(Context context) {
            this.f31024a = context;
            return this;
        }

        public Builder(C28181 c28181) {
        }
    }

    public static final class Div2ComponentBuilder implements Div2Component.Builder {

        /* renamed from: a */
        public final DaggerDivKitComponent f31026a;

        /* renamed from: b */
        public ContextThemeWrapper f31027b;

        /* renamed from: c */
        public DivConfiguration f31028c;

        /* renamed from: d */
        public Integer f31029d;

        /* renamed from: e */
        public DivCreationTracker f31030e;

        /* renamed from: f */
        public GlobalVariableController f31031f;

        public Div2ComponentBuilder(DaggerDivKitComponent daggerDivKitComponent, C28181 c28181) {
            this.f31026a = daggerDivKitComponent;
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: A */
        public Div2Component mo16623A() {
            Preconditions.m30793a(this.f31027b, ContextThemeWrapper.class);
            Preconditions.m30793a(this.f31028c, DivConfiguration.class);
            Preconditions.m30793a(this.f31029d, Integer.class);
            Preconditions.m30793a(this.f31030e, DivCreationTracker.class);
            Preconditions.m30793a(this.f31031f, GlobalVariableController.class);
            return new Div2ComponentImpl(this.f31026a, this.f31028c, this.f31027b, this.f31029d, this.f31030e, this.f31031f, null);
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: a */
        public Div2Component.Builder mo16624a(int i2) {
            Integer valueOf = Integer.valueOf(i2);
            Objects.requireNonNull(valueOf);
            this.f31029d = valueOf;
            return this;
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: b */
        public Div2Component.Builder mo16625b(GlobalVariableController globalVariableController) {
            Objects.requireNonNull(globalVariableController);
            this.f31031f = globalVariableController;
            return this;
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: c */
        public Div2Component.Builder mo16626c(DivConfiguration divConfiguration) {
            this.f31028c = divConfiguration;
            return this;
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: d */
        public Div2Component.Builder mo16627d(DivCreationTracker divCreationTracker) {
            this.f31030e = divCreationTracker;
            return this;
        }

        @Override // com.yandex.div.core.dagger.Div2Component.Builder
        /* renamed from: e */
        public Div2Component.Builder mo16628e(ContextThemeWrapper contextThemeWrapper) {
            this.f31027b = contextThemeWrapper;
            return this;
        }
    }

    public static final class Div2ComponentImpl implements Div2Component {

        /* renamed from: A */
        public Provider<DivVisibilityActionTracker> f31032A;

        /* renamed from: A0 */
        public Provider<DivStateManager> f31033A0;

        /* renamed from: B */
        public Provider<DivImagePreloader> f31034B;

        /* renamed from: B0 */
        public Provider<HistogramReporter> f31035B0;

        /* renamed from: C */
        public Provider<DivCustomViewAdapter> f31036C;

        /* renamed from: C0 */
        public Provider<RenderScript> f31037C0;

        /* renamed from: D */
        public Provider<List<? extends DivExtensionHandler>> f31038D;

        /* renamed from: D0 */
        public Provider<Boolean> f31039D0;

        /* renamed from: E */
        public Provider<DivExtensionController> f31040E;

        /* renamed from: F */
        public Provider<DivPreloader> f31041F;

        /* renamed from: G */
        public Provider<DivTooltipController> f31042G;

        /* renamed from: H */
        public Provider<Boolean> f31043H;

        /* renamed from: I */
        public Provider<Boolean> f31044I;

        /* renamed from: J */
        public Provider<Boolean> f31045J;

        /* renamed from: K */
        public Provider<DivActionBinder> f31046K;

        /* renamed from: L */
        public Provider<DivFocusBinder> f31047L;

        /* renamed from: M */
        public Provider<DivAccessibilityBinder> f31048M;

        /* renamed from: N */
        public Provider<DivBaseBinder> f31049N;

        /* renamed from: O */
        public Provider<DivTypefaceProvider> f31050O;

        /* renamed from: P */
        public Provider<DivTypefaceProvider> f31051P;

        /* renamed from: Q */
        public Provider<DivTypefaceResolver> f31052Q;

        /* renamed from: R */
        public Provider<Boolean> f31053R;

        /* renamed from: S */
        public Provider<DivTextBinder> f31054S;

        /* renamed from: T */
        public Provider<DivPatchCache> f31055T;

        /* renamed from: U */
        public Provider<DivPatchManager> f31056U;

        /* renamed from: V */
        public Provider<DivBinder> f31057V;

        /* renamed from: W */
        public Provider<ErrorCollectors> f31058W;

        /* renamed from: X */
        public Provider<DivContainerBinder> f31059X;

        /* renamed from: Y */
        public Provider<DivSeparatorBinder> f31060Y;

        /* renamed from: Z */
        public Provider<Div2ImageStubProvider> f31061Z;

        /* renamed from: a */
        public final DivConfiguration f31062a;

        /* renamed from: a0 */
        public Provider<DivPlaceholderLoader> f31063a0;

        /* renamed from: b */
        public final DivCreationTracker f31064b;

        /* renamed from: b0 */
        public Provider<DivImageBinder> f31065b0;

        /* renamed from: c */
        public final DaggerDivKitComponent f31066c;

        /* renamed from: c0 */
        public Provider<DivGifImageBinder> f31067c0;

        /* renamed from: d */
        public final Div2ComponentImpl f31068d = this;

        /* renamed from: d0 */
        public Provider<DivGridBinder> f31069d0;

        /* renamed from: e */
        public Provider<ContextThemeWrapper> f31070e;

        /* renamed from: e0 */
        public Provider<DivGalleryBinder> f31071e0;

        /* renamed from: f */
        public Provider<Integer> f31072f;

        /* renamed from: f0 */
        public Provider<PagerIndicatorConnector> f31073f0;

        /* renamed from: g */
        public Provider<Boolean> f31074g;

        /* renamed from: g0 */
        public Provider<DivPagerBinder> f31075g0;

        /* renamed from: h */
        public Provider<Context> f31076h;

        /* renamed from: h0 */
        public Provider<TabTextStyleProvider> f31077h0;

        /* renamed from: i */
        public Provider<Boolean> f31078i;

        /* renamed from: i0 */
        public Provider<DivTabsBinder> f31079i0;

        /* renamed from: j */
        public Provider<Boolean> f31080j;

        /* renamed from: j0 */
        public Provider<DivStateCache> f31081j0;

        /* renamed from: k */
        public Provider<ViewPoolProfiler.Reporter> f31082k;

        /* renamed from: k0 */
        public Provider<TemporaryDivStateCache> f31083k0;

        /* renamed from: l */
        public Provider<ViewPoolProfiler> f31084l;

        /* renamed from: l0 */
        public Provider<DivStateBinder> f31085l0;

        /* renamed from: m */
        public Provider<ViewPool> f31086m;

        /* renamed from: m0 */
        public Provider<DivCustomViewFactory> f31087m0;

        /* renamed from: n */
        public Provider<DivValidator> f31088n;

        /* renamed from: n0 */
        public Provider<DivCustomBinder> f31089n0;

        /* renamed from: o */
        public Provider<DivViewCreator> f31090o;

        /* renamed from: o0 */
        public Provider<DivIndicatorBinder> f31091o0;

        /* renamed from: p */
        public Provider<DivImageLoader> f31092p;

        /* renamed from: p0 */
        public Provider<GlobalVariableController> f31093p0;

        /* renamed from: q */
        public Provider<DivBackgroundBinder> f31094q;

        /* renamed from: q0 */
        public Provider<ExpressionsRuntimeProvider> f31095q0;

        /* renamed from: r */
        public Provider<Div2Builder> f31096r;

        /* renamed from: r0 */
        public Provider<TwoWayIntegerVariableBinder> f31097r0;

        /* renamed from: s */
        public Provider<DivTooltipRestrictor> f31098s;

        /* renamed from: s0 */
        public Provider<Boolean> f31099s0;

        /* renamed from: t */
        public Provider<Div2Logger> f31100t;

        /* renamed from: t0 */
        public Provider<DivSliderBinder> f31101t0;

        /* renamed from: u */
        public Provider<DivVisibilityChangeListener> f31102u;

        /* renamed from: u0 */
        public Provider<TwoWayStringVariableBinder> f31103u0;

        /* renamed from: v */
        public Provider<DivActionHandler> f31104v;

        /* renamed from: v0 */
        public Provider<DivInputBinder> f31105v0;

        /* renamed from: w */
        public Provider<Boolean> f31106w;

        /* renamed from: w0 */
        public Provider<DivSelectBinder> f31107w0;

        /* renamed from: x */
        public Provider<Boolean> f31108x;

        /* renamed from: x0 */
        public Provider<DivVideoBinder> f31109x0;

        /* renamed from: y */
        public Provider<DivActionBeaconSender> f31110y;

        /* renamed from: y0 */
        public Provider<DivTimerEventDispatcherProvider> f31111y0;

        /* renamed from: z */
        public Provider<DivVisibilityActionDispatcher> f31112z;

        /* renamed from: z0 */
        public Provider<DivVideoActionHandler> f31113z0;

        public Div2ComponentImpl(DaggerDivKitComponent daggerDivKitComponent, DivConfiguration divConfiguration, ContextThemeWrapper contextThemeWrapper, Integer num, DivCreationTracker divCreationTracker, GlobalVariableController globalVariableController, C28181 c28181) {
            this.f31066c = daggerDivKitComponent;
            this.f31062a = divConfiguration;
            this.f31064b = divCreationTracker;
            Objects.requireNonNull(contextThemeWrapper, "instance cannot be null");
            this.f31070e = new InstanceFactory(contextThemeWrapper);
            Objects.requireNonNull(num, "instance cannot be null");
            InstanceFactory instanceFactory = new InstanceFactory(num);
            this.f31072f = instanceFactory;
            DivConfiguration_IsResourceCacheEnabledFactory divConfiguration_IsResourceCacheEnabledFactory = new DivConfiguration_IsResourceCacheEnabledFactory(divConfiguration);
            this.f31074g = divConfiguration_IsResourceCacheEnabledFactory;
            Provider div2Module_ProvideThemedContextFactory = new Div2Module_ProvideThemedContextFactory(this.f31070e, instanceFactory, divConfiguration_IsResourceCacheEnabledFactory);
            Object obj = DoubleCheck.f58002c;
            this.f31076h = div2Module_ProvideThemedContextFactory instanceof DoubleCheck ? div2Module_ProvideThemedContextFactory : new DoubleCheck(div2Module_ProvideThemedContextFactory);
            this.f31078i = new DivConfiguration_IsViewPoolEnabledFactory(divConfiguration);
            DivConfiguration_IsViewPoolProfilingEnabledFactory divConfiguration_IsViewPoolProfilingEnabledFactory = new DivConfiguration_IsViewPoolProfilingEnabledFactory(divConfiguration);
            this.f31080j = divConfiguration_IsViewPoolProfilingEnabledFactory;
            DivConfiguration_GetViewPoolReporterFactory divConfiguration_GetViewPoolReporterFactory = new DivConfiguration_GetViewPoolReporterFactory(divConfiguration);
            this.f31082k = divConfiguration_GetViewPoolReporterFactory;
            Provider div2Module_ProvideViewPoolProfilerFactory = new Div2Module_ProvideViewPoolProfilerFactory(divConfiguration_IsViewPoolProfilingEnabledFactory, divConfiguration_GetViewPoolReporterFactory);
            div2Module_ProvideViewPoolProfilerFactory = div2Module_ProvideViewPoolProfilerFactory instanceof DoubleCheck ? div2Module_ProvideViewPoolProfilerFactory : new DoubleCheck(div2Module_ProvideViewPoolProfilerFactory);
            this.f31084l = div2Module_ProvideViewPoolProfilerFactory;
            Provider div2Module_ProvideViewPoolFactory = new Div2Module_ProvideViewPoolFactory(this.f31078i, div2Module_ProvideViewPoolProfilerFactory, daggerDivKitComponent.f31023m);
            this.f31086m = div2Module_ProvideViewPoolFactory instanceof DoubleCheck ? div2Module_ProvideViewPoolFactory : new DoubleCheck(div2Module_ProvideViewPoolFactory);
            Provider m16866a = DivValidator_Factory.m16866a();
            m16866a = m16866a instanceof DoubleCheck ? m16866a : new DoubleCheck(m16866a);
            this.f31088n = m16866a;
            Provider divViewCreator_Factory = new DivViewCreator_Factory(this.f31076h, this.f31086m, m16866a);
            this.f31090o = divViewCreator_Factory instanceof DoubleCheck ? divViewCreator_Factory : new DoubleCheck(divViewCreator_Factory);
            DivConfiguration_GetImageLoaderFactory divConfiguration_GetImageLoaderFactory = new DivConfiguration_GetImageLoaderFactory(divConfiguration);
            this.f31092p = divConfiguration_GetImageLoaderFactory;
            Provider divBackgroundBinder_Factory = new DivBackgroundBinder_Factory(divConfiguration_GetImageLoaderFactory);
            this.f31094q = divBackgroundBinder_Factory instanceof DoubleCheck ? divBackgroundBinder_Factory : new DoubleCheck(divBackgroundBinder_Factory);
            this.f31096r = new DelegateFactory();
            this.f31098s = new DivConfiguration_GetTooltipRestrictorFactory(divConfiguration);
            this.f31100t = new DivConfiguration_GetDiv2LoggerFactory(divConfiguration);
            this.f31102u = new DivConfiguration_GetDivVisibilityChangeListenerFactory(divConfiguration);
            this.f31104v = new DivConfiguration_GetActionHandlerFactory(divConfiguration);
            DivConfiguration_IsTapBeaconsEnabledFactory divConfiguration_IsTapBeaconsEnabledFactory = new DivConfiguration_IsTapBeaconsEnabledFactory(divConfiguration);
            this.f31106w = divConfiguration_IsTapBeaconsEnabledFactory;
            DivConfiguration_IsVisibilityBeaconsEnabledFactory divConfiguration_IsVisibilityBeaconsEnabledFactory = new DivConfiguration_IsVisibilityBeaconsEnabledFactory(divConfiguration);
            this.f31108x = divConfiguration_IsVisibilityBeaconsEnabledFactory;
            Provider divActionBeaconSender_Factory = new DivActionBeaconSender_Factory(daggerDivKitComponent.f31015e, divConfiguration_IsTapBeaconsEnabledFactory, divConfiguration_IsVisibilityBeaconsEnabledFactory);
            divActionBeaconSender_Factory = divActionBeaconSender_Factory instanceof DoubleCheck ? divActionBeaconSender_Factory : new DoubleCheck(divActionBeaconSender_Factory);
            this.f31110y = divActionBeaconSender_Factory;
            Provider divVisibilityActionDispatcher_Factory = new DivVisibilityActionDispatcher_Factory(this.f31100t, this.f31102u, this.f31104v, divActionBeaconSender_Factory);
            this.f31112z = divVisibilityActionDispatcher_Factory instanceof DoubleCheck ? divVisibilityActionDispatcher_Factory : new DoubleCheck(divVisibilityActionDispatcher_Factory);
            Provider divVisibilityActionTracker_Factory = new DivVisibilityActionTracker_Factory(ViewVisibilityCalculator_Factory.m16879a(), this.f31112z);
            this.f31032A = divVisibilityActionTracker_Factory instanceof DoubleCheck ? divVisibilityActionTracker_Factory : new DoubleCheck(divVisibilityActionTracker_Factory);
            Provider divImagePreloader_Factory = new DivImagePreloader_Factory(this.f31092p);
            this.f31034B = divImagePreloader_Factory instanceof DoubleCheck ? divImagePreloader_Factory : new DoubleCheck(divImagePreloader_Factory);
            this.f31036C = new DivConfiguration_GetDivCustomViewAdapterFactory(divConfiguration);
            DivConfiguration_GetExtensionHandlersFactory divConfiguration_GetExtensionHandlersFactory = new DivConfiguration_GetExtensionHandlersFactory(divConfiguration);
            this.f31038D = divConfiguration_GetExtensionHandlersFactory;
            Provider divExtensionController_Factory = new DivExtensionController_Factory(divConfiguration_GetExtensionHandlersFactory);
            divExtensionController_Factory = divExtensionController_Factory instanceof DoubleCheck ? divExtensionController_Factory : new DoubleCheck(divExtensionController_Factory);
            this.f31040E = divExtensionController_Factory;
            Provider div2Module_ProvideDivPreloaderFactory = new Div2Module_ProvideDivPreloaderFactory(this.f31034B, this.f31036C, divExtensionController_Factory);
            div2Module_ProvideDivPreloaderFactory = div2Module_ProvideDivPreloaderFactory instanceof DoubleCheck ? div2Module_ProvideDivPreloaderFactory : new DoubleCheck(div2Module_ProvideDivPreloaderFactory);
            this.f31041F = div2Module_ProvideDivPreloaderFactory;
            Provider divTooltipController_Factory = new DivTooltipController_Factory(this.f31096r, this.f31098s, this.f31032A, div2Module_ProvideDivPreloaderFactory);
            this.f31042G = divTooltipController_Factory instanceof DoubleCheck ? divTooltipController_Factory : new DoubleCheck(divTooltipController_Factory);
            DivConfiguration_IsLongtapActionsPassToChildFactory divConfiguration_IsLongtapActionsPassToChildFactory = new DivConfiguration_IsLongtapActionsPassToChildFactory(divConfiguration);
            this.f31043H = divConfiguration_IsLongtapActionsPassToChildFactory;
            DivConfiguration_IsContextMenuHandlerOverriddenFactory divConfiguration_IsContextMenuHandlerOverriddenFactory = new DivConfiguration_IsContextMenuHandlerOverriddenFactory(divConfiguration);
            this.f31044I = divConfiguration_IsContextMenuHandlerOverriddenFactory;
            DivConfiguration_IsAccessibilityEnabledFactory divConfiguration_IsAccessibilityEnabledFactory = new DivConfiguration_IsAccessibilityEnabledFactory(divConfiguration);
            this.f31045J = divConfiguration_IsAccessibilityEnabledFactory;
            Provider divActionBinder_Factory = new DivActionBinder_Factory(this.f31104v, this.f31100t, this.f31110y, divConfiguration_IsLongtapActionsPassToChildFactory, divConfiguration_IsContextMenuHandlerOverriddenFactory, divConfiguration_IsAccessibilityEnabledFactory);
            divActionBinder_Factory = divActionBinder_Factory instanceof DoubleCheck ? divActionBinder_Factory : new DoubleCheck(divActionBinder_Factory);
            this.f31046K = divActionBinder_Factory;
            Provider divFocusBinder_Factory = new DivFocusBinder_Factory(divActionBinder_Factory);
            this.f31047L = divFocusBinder_Factory instanceof DoubleCheck ? divFocusBinder_Factory : new DoubleCheck(divFocusBinder_Factory);
            Provider divAccessibilityBinder_Factory = new DivAccessibilityBinder_Factory(this.f31045J);
            Provider doubleCheck = divAccessibilityBinder_Factory instanceof DoubleCheck ? divAccessibilityBinder_Factory : new DoubleCheck(divAccessibilityBinder_Factory);
            this.f31048M = doubleCheck;
            Provider divBaseBinder_Factory = new DivBaseBinder_Factory(this.f31094q, this.f31042G, this.f31040E, this.f31047L, doubleCheck);
            this.f31049N = divBaseBinder_Factory instanceof DoubleCheck ? divBaseBinder_Factory : new DoubleCheck(divBaseBinder_Factory);
            this.f31050O = new DivConfiguration_GetTypefaceProviderFactory(divConfiguration);
            this.f31051P = new DivConfiguration_GetDisplayTypefaceProviderFactory(divConfiguration);
            Provider divTypefaceResolver_Factory = new DivTypefaceResolver_Factory(this.f31050O, this.f31051P);
            this.f31052Q = divTypefaceResolver_Factory instanceof DoubleCheck ? divTypefaceResolver_Factory : new DoubleCheck(divTypefaceResolver_Factory);
            this.f31053R = new DivConfiguration_IsHyphenationSupportedFactory(divConfiguration);
            Provider divTextBinder_Factory = new DivTextBinder_Factory(this.f31049N, this.f31052Q, this.f31092p, this.f31053R);
            this.f31054S = divTextBinder_Factory instanceof DoubleCheck ? divTextBinder_Factory : new DoubleCheck(divTextBinder_Factory);
            Provider m16667a = DivPatchCache_Factory.m16667a();
            m16667a = m16667a instanceof DoubleCheck ? m16667a : new DoubleCheck(m16667a);
            this.f31055T = m16667a;
            Provider divPatchManager_Factory = new DivPatchManager_Factory(m16667a, this.f31096r);
            this.f31056U = divPatchManager_Factory instanceof DoubleCheck ? divPatchManager_Factory : new DoubleCheck(divPatchManager_Factory);
            this.f31057V = new DelegateFactory();
            Provider m17116a = ErrorCollectors_Factory.m17116a();
            this.f31058W = m17116a instanceof DoubleCheck ? m17116a : new DoubleCheck(m17116a);
            Provider divContainerBinder_Factory = new DivContainerBinder_Factory(this.f31049N, this.f31090o, this.f31056U, this.f31055T, this.f31057V, this.f31058W);
            this.f31059X = divContainerBinder_Factory instanceof DoubleCheck ? divContainerBinder_Factory : new DoubleCheck(divContainerBinder_Factory);
            Provider divSeparatorBinder_Factory = new DivSeparatorBinder_Factory(this.f31049N);
            this.f31060Y = divSeparatorBinder_Factory instanceof DoubleCheck ? divSeparatorBinder_Factory : new DoubleCheck(divSeparatorBinder_Factory);
            DivConfiguration_GetDiv2ImageStubProviderFactory divConfiguration_GetDiv2ImageStubProviderFactory = new DivConfiguration_GetDiv2ImageStubProviderFactory(divConfiguration);
            this.f31061Z = divConfiguration_GetDiv2ImageStubProviderFactory;
            Provider divPlaceholderLoader_Factory = new DivPlaceholderLoader_Factory(divConfiguration_GetDiv2ImageStubProviderFactory, this.f31066c.f31020j);
            this.f31063a0 = divPlaceholderLoader_Factory instanceof DoubleCheck ? divPlaceholderLoader_Factory : new DoubleCheck(divPlaceholderLoader_Factory);
            Provider divImageBinder_Factory = new DivImageBinder_Factory(this.f31049N, this.f31092p, this.f31063a0, this.f31058W);
            this.f31065b0 = divImageBinder_Factory instanceof DoubleCheck ? divImageBinder_Factory : new DoubleCheck(divImageBinder_Factory);
            Provider divGifImageBinder_Factory = new DivGifImageBinder_Factory(this.f31049N, this.f31092p, this.f31063a0, this.f31058W);
            this.f31067c0 = divGifImageBinder_Factory instanceof DoubleCheck ? divGifImageBinder_Factory : new DoubleCheck(divGifImageBinder_Factory);
            Provider divGridBinder_Factory = new DivGridBinder_Factory(this.f31049N, this.f31056U, this.f31055T, this.f31057V);
            this.f31069d0 = divGridBinder_Factory instanceof DoubleCheck ? divGridBinder_Factory : new DoubleCheck(divGridBinder_Factory);
            Provider divGalleryBinder_Factory = new DivGalleryBinder_Factory(this.f31049N, this.f31090o, this.f31057V, this.f31055T);
            this.f31071e0 = divGalleryBinder_Factory instanceof DoubleCheck ? divGalleryBinder_Factory : new DoubleCheck(divGalleryBinder_Factory);
            Provider m17051a = PagerIndicatorConnector_Factory.m17051a();
            this.f31073f0 = m17051a instanceof DoubleCheck ? m17051a : new DoubleCheck(m17051a);
            Provider divPagerBinder_Factory = new DivPagerBinder_Factory(this.f31049N, this.f31090o, this.f31057V, this.f31055T, this.f31046K, this.f31073f0);
            this.f31075g0 = divPagerBinder_Factory instanceof DoubleCheck ? divPagerBinder_Factory : new DoubleCheck(divPagerBinder_Factory);
            Provider div2Module_ProvideTabTextStyleProviderFactory = new Div2Module_ProvideTabTextStyleProviderFactory(this.f31050O);
            this.f31077h0 = div2Module_ProvideTabTextStyleProviderFactory instanceof DoubleCheck ? div2Module_ProvideTabTextStyleProviderFactory : new DoubleCheck(div2Module_ProvideTabTextStyleProviderFactory);
            Provider divTabsBinder_Factory = new DivTabsBinder_Factory(this.f31049N, this.f31090o, this.f31086m, this.f31077h0, this.f31046K, this.f31100t, this.f31032A, this.f31055T, this.f31076h);
            this.f31079i0 = divTabsBinder_Factory instanceof DoubleCheck ? divTabsBinder_Factory : new DoubleCheck(divTabsBinder_Factory);
            this.f31081j0 = new DivConfiguration_GetDivStateCacheFactory(divConfiguration);
            Provider m16723a = TemporaryDivStateCache_Factory.m16723a();
            this.f31083k0 = m16723a instanceof DoubleCheck ? m16723a : new DoubleCheck(m16723a);
            DivStateBinder_Factory divStateBinder_Factory = new DivStateBinder_Factory(this.f31049N, this.f31090o, this.f31057V, this.f31081j0, this.f31083k0, this.f31046K, this.f31056U, this.f31055T, this.f31100t, this.f31032A, this.f31058W);
            this.f31085l0 = divStateBinder_Factory instanceof DoubleCheck ? divStateBinder_Factory : new DoubleCheck<>(divStateBinder_Factory);
            this.f31087m0 = new DivConfiguration_GetDivCustomViewFactoryFactory(divConfiguration);
            this.f31089n0 = new DivCustomBinder_Factory(this.f31049N, this.f31087m0, this.f31036C, this.f31040E);
            this.f31091o0 = new DivIndicatorBinder_Factory(this.f31049N, this.f31073f0);
            Objects.requireNonNull(globalVariableController, "instance cannot be null");
            InstanceFactory instanceFactory2 = new InstanceFactory(globalVariableController);
            this.f31093p0 = instanceFactory2;
            Provider expressionsRuntimeProvider_Factory = new ExpressionsRuntimeProvider_Factory(instanceFactory2, this.f31104v, this.f31058W, this.f31100t);
            this.f31095q0 = expressionsRuntimeProvider_Factory instanceof DoubleCheck ? expressionsRuntimeProvider_Factory : new DoubleCheck(expressionsRuntimeProvider_Factory);
            Provider twoWayIntegerVariableBinder_Factory = new TwoWayIntegerVariableBinder_Factory(this.f31058W, this.f31095q0);
            this.f31097r0 = twoWayIntegerVariableBinder_Factory instanceof DoubleCheck ? twoWayIntegerVariableBinder_Factory : new DoubleCheck(twoWayIntegerVariableBinder_Factory);
            this.f31099s0 = new DivConfiguration_GetAreVisualErrorsEnabledFactory(divConfiguration);
            this.f31101t0 = new DivSliderBinder_Factory(this.f31049N, this.f31100t, this.f31050O, this.f31097r0, this.f31058W, this.f31099s0);
            Provider twoWayStringVariableBinder_Factory = new TwoWayStringVariableBinder_Factory(this.f31058W, this.f31095q0);
            this.f31103u0 = twoWayStringVariableBinder_Factory instanceof DoubleCheck ? twoWayStringVariableBinder_Factory : new DoubleCheck(twoWayStringVariableBinder_Factory);
            Provider divInputBinder_Factory = new DivInputBinder_Factory(this.f31049N, this.f31052Q, this.f31103u0, this.f31058W);
            this.f31105v0 = divInputBinder_Factory instanceof DoubleCheck ? divInputBinder_Factory : new DoubleCheck(divInputBinder_Factory);
            Provider divSelectBinder_Factory = new DivSelectBinder_Factory(this.f31049N, this.f31052Q, this.f31103u0, this.f31058W);
            this.f31107w0 = divSelectBinder_Factory instanceof DoubleCheck ? divSelectBinder_Factory : new DoubleCheck(divSelectBinder_Factory);
            Provider divVideoBinder_Factory = new DivVideoBinder_Factory(this.f31049N, this.f31097r0, this.f31104v);
            this.f31109x0 = divVideoBinder_Factory instanceof DoubleCheck ? divVideoBinder_Factory : new DoubleCheck(divVideoBinder_Factory);
            Provider<DivBinder> provider = this.f31057V;
            Provider divBinder_Factory = new DivBinder_Factory(this.f31088n, this.f31054S, this.f31059X, this.f31060Y, this.f31065b0, this.f31067c0, this.f31069d0, this.f31071e0, this.f31075g0, this.f31079i0, this.f31085l0, this.f31089n0, this.f31091o0, this.f31101t0, this.f31105v0, this.f31107w0, this.f31109x0, this.f31040E, this.f31073f0);
            divBinder_Factory = divBinder_Factory instanceof DoubleCheck ? divBinder_Factory : new DoubleCheck(divBinder_Factory);
            DelegateFactory delegateFactory = (DelegateFactory) provider;
            if (delegateFactory.f58001a != null) {
                throw new IllegalStateException();
            }
            delegateFactory.f58001a = divBinder_Factory;
            Provider<Div2Builder> provider2 = this.f31096r;
            Provider div2Builder_Factory = new Div2Builder_Factory(this.f31090o, this.f31057V);
            div2Builder_Factory = div2Builder_Factory instanceof DoubleCheck ? div2Builder_Factory : new DoubleCheck(div2Builder_Factory);
            DelegateFactory delegateFactory2 = (DelegateFactory) provider2;
            if (delegateFactory2.f58001a != null) {
                throw new IllegalStateException();
            }
            delegateFactory2.f58001a = div2Builder_Factory;
            Provider divTimerEventDispatcherProvider_Factory = new DivTimerEventDispatcherProvider_Factory(this.f31104v, this.f31058W);
            this.f31111y0 = divTimerEventDispatcherProvider_Factory instanceof DoubleCheck ? divTimerEventDispatcherProvider_Factory : new DoubleCheck(divTimerEventDispatcherProvider_Factory);
            Provider m16701a = DivVideoActionHandler_Factory.m16701a();
            this.f31113z0 = m16701a instanceof DoubleCheck ? m16701a : new DoubleCheck(m16701a);
            Provider divStateManager_Factory = new DivStateManager_Factory(this.f31081j0, this.f31083k0);
            this.f31033A0 = divStateManager_Factory instanceof DoubleCheck ? divStateManager_Factory : new DoubleCheck(divStateManager_Factory);
            Provider divHistogramsModule_ProvideHistogramReporterFactory = new DivHistogramsModule_ProvideHistogramReporterFactory(this.f31066c.f31019i);
            this.f31035B0 = divHistogramsModule_ProvideHistogramReporterFactory instanceof DoubleCheck ? divHistogramsModule_ProvideHistogramReporterFactory : new DoubleCheck(divHistogramsModule_ProvideHistogramReporterFactory);
            Provider div2Module_ProvideRenderScriptFactory = new Div2Module_ProvideRenderScriptFactory(this.f31070e);
            this.f31037C0 = div2Module_ProvideRenderScriptFactory instanceof DoubleCheck ? div2Module_ProvideRenderScriptFactory : new DoubleCheck(div2Module_ProvideRenderScriptFactory);
            this.f31039D0 = new DivConfiguration_IsMultipleStateChangeEnabledFactory(divConfiguration);
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: a */
        public HistogramReporter mo16629a() {
            return this.f31035B0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: b */
        public boolean mo16630b() {
            return this.f31062a.f30882D;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: c */
        public DivVideoActionHandler mo16631c() {
            return this.f31113z0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: d */
        public DivCreationTracker mo16632d() {
            return this.f31064b;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: e */
        public Div2Builder mo16633e() {
            return this.f31096r.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: f */
        public DivActionBinder mo16634f() {
            return this.f31046K.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: g */
        public DivTimerEventDispatcherProvider mo16635g() {
            return this.f31111y0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: h */
        public DivStateChangeListener mo16636h() {
            DivStateChangeListener divStateChangeListener = this.f31062a.f30887e;
            Objects.requireNonNull(divStateChangeListener, "Cannot return null from a non-@Nullable @Provides method");
            return divStateChangeListener;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: i */
        public Div2Logger mo16637i() {
            Div2Logger div2Logger = this.f31062a.f30885c;
            Objects.requireNonNull(div2Logger, "Cannot return null from a non-@Nullable @Provides method");
            return div2Logger;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: j */
        public DivDownloader mo16638j() {
            DivDownloader divDownloader = this.f31062a.f30896n;
            Objects.requireNonNull(divDownloader, "Cannot return null from a non-@Nullable @Provides method");
            return divDownloader;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: k */
        public ExpressionsRuntimeProvider mo16639k() {
            return this.f31095q0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: l */
        public DivCustomContainerChildFactory mo16640l() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: m */
        public DivBinder mo16641m() {
            return this.f31057V.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: n */
        public Div2ViewComponent.Builder mo16642n() {
            return new Div2ViewComponentBuilder(this.f31066c, this.f31068d, null);
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: o */
        public RenderScript mo16643o() {
            return this.f31037C0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: p */
        public DivVisibilityActionTracker mo16644p() {
            return this.f31032A.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: q */
        public DivStateManager mo16645q() {
            return this.f31033A0.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: r */
        public DivDataChangeListener mo16646r() {
            DivDataChangeListener divDataChangeListener = this.f31062a.f30886d;
            Objects.requireNonNull(divDataChangeListener, "Cannot return null from a non-@Nullable @Provides method");
            return divDataChangeListener;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: s */
        public DivTooltipController mo16647s() {
            return this.f31042G.get();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: t */
        public DivPlayerFactory mo16648t() {
            DivPlayerFactory divPlayerFactory = this.f31062a.f30893k;
            Objects.requireNonNull(divPlayerFactory, "Cannot return null from a non-@Nullable @Provides method");
            return divPlayerFactory;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        /* renamed from: u */
        public DivPreloader mo16649u() {
            return this.f31041F.get();
        }
    }

    public static final class Div2ViewComponentBuilder implements Div2ViewComponent.Builder {

        /* renamed from: a */
        public final DaggerDivKitComponent f31114a;

        /* renamed from: b */
        public final Div2ComponentImpl f31115b;

        /* renamed from: c */
        public Div2View f31116c;

        public Div2ViewComponentBuilder(DaggerDivKitComponent daggerDivKitComponent, Div2ComponentImpl div2ComponentImpl, C28181 c28181) {
            this.f31114a = daggerDivKitComponent;
            this.f31115b = div2ComponentImpl;
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
        /* renamed from: A */
        public Div2ViewComponent mo16650A() {
            Preconditions.m30793a(this.f31116c, Div2View.class);
            return new Div2ViewComponentImpl(this.f31114a, this.f31115b, this.f31116c, null);
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
        /* renamed from: a */
        public Div2ViewComponent.Builder mo16651a(Div2View div2View) {
            this.f31116c = div2View;
            return this;
        }
    }

    public static final class Div2ViewComponentImpl implements Div2ViewComponent {

        /* renamed from: a */
        public final Div2ComponentImpl f31117a;

        /* renamed from: b */
        public Provider<DivViewIdProvider> f31118b;

        /* renamed from: c */
        public Provider<DivTransitionBuilder> f31119c;

        /* renamed from: d */
        public Provider<Div2View> f31120d;

        /* renamed from: e */
        public Provider<ReleaseViewVisitor> f31121e;

        /* renamed from: f */
        public Provider<DivJoinedStateSwitcher> f31122f;

        /* renamed from: g */
        public Provider<DivMultipleStateSwitcher> f31123g;

        /* renamed from: h */
        public Provider<DivStateSwitcher> f31124h;

        /* renamed from: i */
        public Provider<DivStateTransitionHolder> f31125i;

        /* renamed from: j */
        public Provider<ViewBindingProvider> f31126j;

        /* renamed from: k */
        public Provider<ErrorVisualMonitor> f31127k;

        public Div2ViewComponentImpl(DaggerDivKitComponent daggerDivKitComponent, Div2ComponentImpl div2ComponentImpl, Div2View div2View, C28181 c28181) {
            this.f31117a = div2ComponentImpl;
            Provider m16871a = DivViewIdProvider_Factory.m16871a();
            Object obj = DoubleCheck.f58002c;
            m16871a = m16871a instanceof DoubleCheck ? m16871a : new DoubleCheck(m16871a);
            this.f31118b = m16871a;
            Provider divTransitionBuilder_Factory = new DivTransitionBuilder_Factory(div2ComponentImpl.f31070e, m16871a);
            this.f31119c = divTransitionBuilder_Factory instanceof DoubleCheck ? divTransitionBuilder_Factory : new DoubleCheck(divTransitionBuilder_Factory);
            Objects.requireNonNull(div2View, "instance cannot be null");
            InstanceFactory instanceFactory = new InstanceFactory(div2View);
            this.f31120d = instanceFactory;
            Provider releaseViewVisitor_Factory = new ReleaseViewVisitor_Factory(instanceFactory, div2ComponentImpl.f31036C, div2ComponentImpl.f31040E);
            this.f31121e = releaseViewVisitor_Factory instanceof DoubleCheck ? releaseViewVisitor_Factory : new DoubleCheck(releaseViewVisitor_Factory);
            Provider divJoinedStateSwitcher_Factory = new DivJoinedStateSwitcher_Factory(this.f31120d, div2ComponentImpl.f31057V);
            this.f31122f = divJoinedStateSwitcher_Factory instanceof DoubleCheck ? divJoinedStateSwitcher_Factory : new DoubleCheck(divJoinedStateSwitcher_Factory);
            Provider divMultipleStateSwitcher_Factory = new DivMultipleStateSwitcher_Factory(this.f31120d, div2ComponentImpl.f31057V);
            divMultipleStateSwitcher_Factory = divMultipleStateSwitcher_Factory instanceof DoubleCheck ? divMultipleStateSwitcher_Factory : new DoubleCheck(divMultipleStateSwitcher_Factory);
            this.f31123g = divMultipleStateSwitcher_Factory;
            Provider div2ViewModule_ProvideStateSwitcherFactory = new Div2ViewModule_ProvideStateSwitcherFactory(div2ComponentImpl.f31039D0, this.f31122f, divMultipleStateSwitcher_Factory);
            this.f31124h = div2ViewModule_ProvideStateSwitcherFactory instanceof DoubleCheck ? div2ViewModule_ProvideStateSwitcherFactory : new DoubleCheck(div2ViewModule_ProvideStateSwitcherFactory);
            Provider divStateTransitionHolder_Factory = new DivStateTransitionHolder_Factory(this.f31120d);
            this.f31125i = divStateTransitionHolder_Factory instanceof DoubleCheck ? divStateTransitionHolder_Factory : new DoubleCheck(divStateTransitionHolder_Factory);
            Provider m16878a = ViewBindingProvider_Factory.m16878a();
            m16878a = m16878a instanceof DoubleCheck ? m16878a : new DoubleCheck(m16878a);
            this.f31126j = m16878a;
            Provider errorVisualMonitor_Factory = new ErrorVisualMonitor_Factory(div2ComponentImpl.f31058W, div2ComponentImpl.f31099s0, m16878a);
            this.f31127k = errorVisualMonitor_Factory instanceof DoubleCheck ? errorVisualMonitor_Factory : new DoubleCheck(errorVisualMonitor_Factory);
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: a */
        public DivViewIdProvider mo16652a() {
            return this.f31118b.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: b */
        public ErrorVisualMonitor mo16653b() {
            return this.f31127k.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: c */
        public ReleaseViewVisitor mo16654c() {
            return this.f31121e.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: d */
        public ViewBindingProvider mo16655d() {
            return this.f31126j.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: e */
        public DivStateSwitcher mo16656e() {
            return this.f31124h.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: f */
        public ErrorCollectors mo16657f() {
            return this.f31117a.f31058W.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: g */
        public DivStateTransitionHolder mo16658g() {
            return this.f31125i.get();
        }

        @Override // com.yandex.div.core.dagger.Div2ViewComponent
        /* renamed from: h */
        public DivTransitionBuilder mo16659h() {
            return this.f31119c.get();
        }
    }

    public DaggerDivKitComponent(DivKitConfiguration divKitConfiguration, Context context, C28181 c28181) {
        this.f31011a = divKitConfiguration;
        Objects.requireNonNull(context, "instance cannot be null");
        InstanceFactory instanceFactory = new InstanceFactory(context);
        this.f31013c = instanceFactory;
        DivKitConfiguration_SendBeaconConfigurationFactory divKitConfiguration_SendBeaconConfigurationFactory = new DivKitConfiguration_SendBeaconConfigurationFactory(divKitConfiguration);
        this.f31014d = divKitConfiguration_SendBeaconConfigurationFactory;
        Provider divKitModule_ProvideSendBeaconManagerFactory = new DivKitModule_ProvideSendBeaconManagerFactory(instanceFactory, divKitConfiguration_SendBeaconConfigurationFactory);
        Object obj = DoubleCheck.f58002c;
        this.f31015e = divKitModule_ProvideSendBeaconManagerFactory instanceof DoubleCheck ? divKitModule_ProvideSendBeaconManagerFactory : new DoubleCheck(divKitModule_ProvideSendBeaconManagerFactory);
        Provider divKitConfiguration_HistogramRecorderFactory = new DivKitConfiguration_HistogramRecorderFactory(divKitConfiguration);
        this.f31016f = divKitConfiguration_HistogramRecorderFactory instanceof DoubleCheck ? divKitConfiguration_HistogramRecorderFactory : new DoubleCheck(divKitConfiguration_HistogramRecorderFactory);
        this.f31017g = new DivKitConfiguration_HistogramConfigurationFactory(divKitConfiguration);
        Provider m17283a = HistogramColdTypeChecker_Factory.m17283a();
        m17283a = m17283a instanceof DoubleCheck ? m17283a : new DoubleCheck(m17283a);
        this.f31018h = m17283a;
        Provider<HistogramConfiguration> provider = this.f31017g;
        DivKitHistogramsModule_ProvideHistogramReporterDelegateFactory divKitHistogramsModule_ProvideHistogramReporterDelegateFactory = new DivKitHistogramsModule_ProvideHistogramReporterDelegateFactory(provider, this.f31016f, m17283a);
        this.f31019i = divKitHistogramsModule_ProvideHistogramReporterDelegateFactory;
        DivKitConfiguration_ExecutorServiceFactory divKitConfiguration_ExecutorServiceFactory = new DivKitConfiguration_ExecutorServiceFactory(divKitConfiguration);
        this.f31020j = divKitConfiguration_ExecutorServiceFactory;
        Provider divKitHistogramsModule_ProvideDivParsingHistogramReporterFactory = new DivKitHistogramsModule_ProvideDivParsingHistogramReporterFactory(provider, divKitHistogramsModule_ProvideHistogramReporterDelegateFactory, divKitConfiguration_ExecutorServiceFactory);
        this.f31021k = divKitHistogramsModule_ProvideDivParsingHistogramReporterFactory instanceof DoubleCheck ? divKitHistogramsModule_ProvideDivParsingHistogramReporterFactory : new DoubleCheck(divKitHistogramsModule_ProvideDivParsingHistogramReporterFactory);
        Provider divKitConfiguration_CpuUsageHistogramReporterFactory = new DivKitConfiguration_CpuUsageHistogramReporterFactory(divKitConfiguration);
        divKitConfiguration_CpuUsageHistogramReporterFactory = divKitConfiguration_CpuUsageHistogramReporterFactory instanceof DoubleCheck ? divKitConfiguration_CpuUsageHistogramReporterFactory : new DoubleCheck(divKitConfiguration_CpuUsageHistogramReporterFactory);
        this.f31022l = divKitConfiguration_CpuUsageHistogramReporterFactory;
        Provider divKitModule_ProvideViewCreatorFactory = new DivKitModule_ProvideViewCreatorFactory(divKitConfiguration_CpuUsageHistogramReporterFactory);
        this.f31023m = divKitModule_ProvideViewCreatorFactory instanceof DoubleCheck ? divKitModule_ProvideViewCreatorFactory : new DoubleCheck(divKitModule_ProvideViewCreatorFactory);
    }

    /* renamed from: c */
    public static DivKitComponent.Builder m16617c() {
        return new Builder(null);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    /* renamed from: a */
    public HistogramRecordConfiguration mo16618a() {
        HistogramConfiguration histogramConfiguration = this.f31011a.f30964c.get();
        Intrinsics.m32178g(histogramConfiguration, "histogramConfiguration.get()");
        return histogramConfiguration;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    /* renamed from: b */
    public Div2Component.Builder mo16619b() {
        return new Div2ComponentBuilder(this.f31012b, null);
    }
}
