package com.yandex.div.core.dagger;

import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import dagger.BindsInstance;
import dagger.Subcomponent;
import javax.inject.Named;

@Subcomponent
@DivScope
/* loaded from: classes2.dex */
public interface Div2Component {

    @Subcomponent.Builder
    public interface Builder {
        @NonNull
        /* renamed from: A */
        Div2Component mo16623A();

        @NonNull
        @BindsInstance
        /* renamed from: a */
        Builder mo16624a(@StyleRes @Named int i2);

        @NonNull
        @BindsInstance
        /* renamed from: b */
        Builder mo16625b(@NonNull GlobalVariableController globalVariableController);

        @NonNull
        /* renamed from: c */
        Builder mo16626c(@NonNull DivConfiguration divConfiguration);

        @NonNull
        @BindsInstance
        /* renamed from: d */
        Builder mo16627d(@NonNull DivCreationTracker divCreationTracker);

        @NonNull
        @BindsInstance
        /* renamed from: e */
        Builder mo16628e(@NonNull ContextThemeWrapper contextThemeWrapper);
    }

    @NonNull
    /* renamed from: a */
    HistogramReporter mo16629a();

    @NonNull
    @ExperimentFlag
    /* renamed from: b */
    boolean mo16630b();

    @NonNull
    /* renamed from: c */
    DivVideoActionHandler mo16631c();

    @NonNull
    /* renamed from: d */
    DivCreationTracker mo16632d();

    @NonNull
    /* renamed from: e */
    Div2Builder mo16633e();

    @NonNull
    /* renamed from: f */
    DivActionBinder mo16634f();

    @NonNull
    /* renamed from: g */
    DivTimerEventDispatcherProvider mo16635g();

    @NonNull
    /* renamed from: h */
    DivStateChangeListener mo16636h();

    @NonNull
    /* renamed from: i */
    Div2Logger mo16637i();

    @NonNull
    /* renamed from: j */
    DivDownloader mo16638j();

    @NonNull
    /* renamed from: k */
    ExpressionsRuntimeProvider mo16639k();

    @NonNull
    /* renamed from: l */
    DivCustomContainerChildFactory mo16640l();

    @NonNull
    /* renamed from: m */
    DivBinder mo16641m();

    @NonNull
    /* renamed from: n */
    Div2ViewComponent.Builder mo16642n();

    @NonNull
    /* renamed from: o */
    RenderScript mo16643o();

    @NonNull
    /* renamed from: p */
    DivVisibilityActionTracker mo16644p();

    @NonNull
    /* renamed from: q */
    DivStateManager mo16645q();

    @NonNull
    /* renamed from: r */
    DivDataChangeListener mo16646r();

    @NonNull
    /* renamed from: s */
    DivTooltipController mo16647s();

    @NonNull
    /* renamed from: t */
    DivPlayerFactory mo16648t();

    @NonNull
    /* renamed from: u */
    DivPreloader mo16649u();
}
