package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import androidx.activity.RunnableC0042c;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.DivDataChangedObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipControllerKt;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTimer;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;
import p031j.C6523a;

/* compiled from: Div2View.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0081\u0001J\u000f\u0010\u0006\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u001a\u001a\u00020\u00158\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00102\u001a\u0004\u0018\u00010)8\u0010@\u0010X\u0091\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010:\u001a\u00020\u000e8\u0010@\u0010X\u0091\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u00101\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u0010@\u001a\u00020;8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R*\u0010G\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010L\u001a\u00020\f2\u0006\u0010H\u001a\u00020\f8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR.\u0010T\u001a\u0004\u0018\u00010M2\b\u0010A\u001a\u0004\u0018\u00010M8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00020]8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR(\u0010z\u001a\u0004\u0018\u00010s2\b\u0010A\u001a\u0004\u0018\u00010s8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010u\"\u0004\bx\u0010yR%\u0010\u0080\u0001\u001a\u00020{2\u0006\u0010A\u001a\u00020{8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/DivViewFacade;", "Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory$div_release", "()Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory", "Lcom/yandex/div/core/DivViewConfig;", "viewConfig", "", "setConfig", "getConfig", "Lcom/yandex/div/DivDataTag;", "getDivTag", "", "getCurrentStateId", "Lcom/yandex/div/core/state/DivViewState;", "getCurrentState", "getView", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getExpressionResolver", "Lcom/yandex/div/core/dagger/Div2Component;", "n", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "o", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/Div2ViewComponent;", "viewComponent", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "z", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "getDivTimerEventDispatcher$div_release", "()Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "setDivTimerEventDispatcher$div_release", "(Lcom/yandex/div/core/timer/DivTimerEventDispatcher;)V", "divTimerEventDispatcher", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "C", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "getBindOnAttachRunnable$div_release", "()Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "setBindOnAttachRunnable$div_release", "(Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;)V", "getBindOnAttachRunnable$div_release$annotations", "()V", "bindOnAttachRunnable", "F", "J", "getStateId$div_release", "()J", "setStateId$div_release", "(J)V", "getStateId$div_release$annotations", "stateId", "Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "I", "Lkotlin/Lazy;", "getHistogramReporter", "()Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter", "value", "Lcom/yandex/div/DivDataTag;", "getDataTag", "()Lcom/yandex/div/DivDataTag;", "setDataTag$div_release", "(Lcom/yandex/div/DivDataTag;)V", "dataTag", "<set-?>", "K", "getPrevDataTag", "setPrevDataTag$div_release", "prevDataTag", "Lcom/yandex/div2/DivData;", "L", "Lcom/yandex/div2/DivData;", "getDivData", "()Lcom/yandex/div2/DivData;", "setDivData$div_release", "(Lcom/yandex/div2/DivData;)V", "divData", "Lcom/yandex/div/core/DivActionHandler;", "M", "Lcom/yandex/div/core/DivActionHandler;", "getActionHandler", "()Lcom/yandex/div/core/DivActionHandler;", "setActionHandler", "(Lcom/yandex/div/core/DivActionHandler;)V", "actionHandler", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "Q", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "getDivTransitionHandler$div_release", "()Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "divTransitionHandler", "Lcom/yandex/div/core/player/DivVideoActionHandler;", "getDivVideoActionHandler", "()Lcom/yandex/div/core/player/DivVideoActionHandler;", "divVideoActionHandler", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/DivTooltipController;", "tooltipController", "Lcom/yandex/div/core/expression/variables/VariableController;", "getVariableController", "()Lcom/yandex/div/core/expression/variables/VariableController;", "variableController", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "releaseViewVisitor", "", "getLogId", "()Ljava/lang/String;", "logId", "getComponentName", "setComponentName", "(Ljava/lang/String;)V", "componentName", "", "getVisualErrorsEnabled", "()Z", "setVisualErrorsEnabled", "(Z)V", "visualErrorsEnabled", "BulkActionHandler", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@SuppressLint
/* loaded from: classes2.dex */
public class Div2View extends FrameContainerLayout implements DivViewFacade {

    /* renamed from: R */
    public static final /* synthetic */ int f31541R = 0;

    /* renamed from: A */
    @NotNull
    public final Object f31542A;

    /* renamed from: B */
    @Nullable
    public SingleTimeOnAttachCallback f31543B;

    /* renamed from: C, reason: from kotlin metadata */
    @Nullable
    public SingleTimeOnAttachCallback bindOnAttachRunnable;

    /* renamed from: D */
    @Nullable
    public SingleTimeOnAttachCallback f31545D;

    /* renamed from: E */
    @Nullable
    public SingleTimeOnAttachCallback f31546E;

    /* renamed from: F, reason: from kotlin metadata */
    public long stateId;

    /* renamed from: G */
    public DivViewConfig f31548G;

    /* renamed from: H */
    @NotNull
    public final Function0<RenderConfiguration> f31549H;

    /* renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Lazy histogramReporter;

    /* renamed from: J, reason: from kotlin metadata */
    @NotNull
    public DivDataTag dataTag;

    /* renamed from: K, reason: from kotlin metadata */
    @NotNull
    public DivDataTag prevDataTag;

    /* renamed from: L, reason: from kotlin metadata */
    @Nullable
    public DivData divData;

    /* renamed from: M, reason: from kotlin metadata */
    @Nullable
    public DivActionHandler actionHandler;

    /* renamed from: N */
    public long f31555N;

    /* renamed from: O */
    @NotNull
    public final String f31556O;

    /* renamed from: P */
    public boolean f31557P;

    /* renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final DivTransitionHandler divTransitionHandler;

    /* renamed from: m */
    public final long f31559m;

    /* renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Div2Component div2Component;

    /* renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Div2ViewComponent viewComponent;

    /* renamed from: p */
    public final boolean f31562p;

    /* renamed from: q */
    @NotNull
    public final ViewBindingProvider f31563q;

    /* renamed from: r */
    @NotNull
    public final Div2Builder f31564r;

    /* renamed from: s */
    @NotNull
    public final List<LoadReference> f31565s;

    /* renamed from: t */
    @NotNull
    public final List<OverflowMenuSubscriber.Listener> f31566t;

    /* renamed from: u */
    @NotNull
    public final List<DivDataChangedObserver> f31567u;

    /* renamed from: v */
    @NotNull
    public final WeakHashMap<View, Div> f31568v;

    /* renamed from: w */
    @NotNull
    public final WeakHashMap<View, DivAccessibility.Mode> f31569w;

    /* renamed from: x */
    @NotNull
    public final BulkActionHandler f31570x;

    /* renamed from: y */
    @Nullable
    public ExpressionsRuntime f31571y;

    /* renamed from: z, reason: from kotlin metadata */
    @Nullable
    public DivTimerEventDispatcher divTimerEventDispatcher;

    /* compiled from: Div2View.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class BulkActionHandler {

        /* renamed from: a */
        public boolean f31580a;

        /* renamed from: b */
        @Nullable
        public DivData.State f31581b;

        /* renamed from: c */
        @NotNull
        public final List<DivStatePath> f31582c = new ArrayList();

        public BulkActionHandler() {
        }

        /* renamed from: a */
        public final void m16826a(@NotNull Function0<Unit> function) {
            Intrinsics.m32179h(function, "function");
            if (this.f31580a) {
                return;
            }
            this.f31580a = true;
            function.invoke();
            m16827b();
            this.f31580a = false;
        }

        /* renamed from: b */
        public final void m16827b() {
            if (Div2View.this.getChildCount() == 0) {
                Div2View div2View = Div2View.this;
                if (!ViewsKt.m16768b(div2View) || div2View.isLayoutRequested()) {
                    div2View.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.Div2View$BulkActionHandler$runBulkActions$$inlined$doOnActualLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            Intrinsics.m32179h(view, "view");
                            view.removeOnLayoutChangeListener(this);
                            Div2View.BulkActionHandler.this.m16826a(Div2View$BulkActionHandler$bulkActions$1.f31584b);
                        }
                    });
                    return;
                } else {
                    m16826a(Div2View$BulkActionHandler$bulkActions$1.f31584b);
                    return;
                }
            }
            DivData.State state = this.f31581b;
            if (state == null) {
                return;
            }
            DivStateSwitcher mo16656e = Div2View.this.getViewComponent().mo16656e();
            List<DivStatePath> list = this.f31582c;
            Intrinsics.m32179h(list, "<this>");
            if (!(list instanceof KMappedMarker) || (list instanceof KMutableList)) {
                list = Collections.unmodifiableList(new ArrayList(list));
                Intrinsics.m32178g(list, "{\n        Collections.un…st(ArrayList(this))\n    }");
            }
            mo16656e.mo17131a(state, list);
            this.f31581b = null;
            this.f31582c.clear();
        }

        /* renamed from: c */
        public final void m16828c(@Nullable DivData.State state, @NotNull DivStatePath divStatePath, boolean z) {
            List<DivStatePath> m31993F = CollectionsKt.m31993F(divStatePath);
            DivData.State state2 = this.f31581b;
            if (state2 != null && !Intrinsics.m32174c(state, state2)) {
                this.f31582c.clear();
            }
            this.f31581b = state;
            CollectionsKt.m32020g(this.f31582c, m31993F);
            Div2View div2View = Div2View.this;
            for (DivStatePath divStatePath2 : m31993F) {
                DivStateManager mo16645q = div2View.getDiv2Component().mo16645q();
                String str = div2View.getDivTag().f30859a;
                Intrinsics.m32178g(str, "divTag.id");
                mo16645q.m16714c(str, divStatePath2, z);
            }
            if (this.f31580a) {
                return;
            }
            m16827b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Div2View(final com.yandex.div.core.Div2Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r7 = r7 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r6 = 0
        Lb:
            java.lang.String r7 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r4, r7)
            long r1 = android.os.SystemClock.uptimeMillis()
            r3.<init>(r4, r5, r6)
            r3.f31559m = r1
            com.yandex.div.core.dagger.Div2Component r5 = r4.f30874a
            r3.div2Component = r5
            com.yandex.div.core.dagger.Div2Component r5 = r3.getDiv2Component()
            com.yandex.div.core.dagger.Div2ViewComponent$Builder r5 = r5.mo16642n()
            com.yandex.div.core.dagger.Div2ViewComponent$Builder r5 = r5.mo16651a(r3)
            com.yandex.div.core.dagger.Div2ViewComponent r5 = r5.mo16650A()
            r3.viewComponent = r5
            com.yandex.div.core.dagger.Div2Component r5 = r3.getDiv2Component()
            boolean r5 = r5.mo16630b()
            r3.f31562p = r5
            com.yandex.div.core.dagger.Div2ViewComponent r5 = r3.getViewComponent()
            com.yandex.div.core.view2.ViewBindingProvider r5 = r5.mo16655d()
            r3.f31563q = r5
            com.yandex.div.core.dagger.Div2Component r5 = r4.f30874a
            com.yandex.div.core.view2.Div2Builder r5 = r5.mo16633e()
            java.lang.String r6 = "context.div2Component.div2Builder"
            kotlin.jvm.internal.Intrinsics.m32178g(r5, r6)
            r3.f31564r = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f31565s = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f31566t = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f31567u = r5
            java.util.WeakHashMap r5 = new java.util.WeakHashMap
            r5.<init>()
            r3.f31568v = r5
            java.util.WeakHashMap r5 = new java.util.WeakHashMap
            r5.<init>()
            r3.f31569w = r5
            com.yandex.div.core.view2.Div2View$BulkActionHandler r5 = new com.yandex.div.core.view2.Div2View$BulkActionHandler
            r5.<init>()
            r3.f31570x = r5
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r3.f31542A = r5
            com.yandex.div2.DivData$Companion r5 = com.yandex.div2.DivData.f35444h
            com.yandex.div.util.DivDataUtilsKt.m17550a(r5)
            r5 = -1
            r3.stateId = r5
            com.yandex.div.core.DivViewConfig r7 = com.yandex.div.core.DivViewConfig.f30988C1
            r3.f31548G = r7
            com.yandex.div.core.view2.Div2View$renderConfig$1 r7 = new com.yandex.div.core.view2.Div2View$renderConfig$1
            r7.<init>()
            r3.f31549H = r7
            kotlin.LazyThreadSafetyMode r4 = kotlin.LazyThreadSafetyMode.NONE
            com.yandex.div.core.view2.Div2View$histogramReporter$2 r7 = new com.yandex.div.core.view2.Div2View$histogramReporter$2
            r7.<init>()
            kotlin.Lazy r4 = kotlin.LazyKt.m31880a(r4, r7)
            r3.histogramReporter = r4
            com.yandex.div.DivDataTag r4 = com.yandex.div.DivDataTag.f30858b
            r3.dataTag = r4
            r3.prevDataTag = r4
            r3.f31555N = r5
            com.yandex.div.core.dagger.Div2Component r4 = r3.getDiv2Component()
            com.yandex.div.core.DivCreationTracker r4 = r4.mo16632d()
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f30955e
            r5 = 1
            boolean r4 = r4.compareAndSet(r5, r0)
            if (r4 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicBoolean r4 = com.yandex.div.core.DivCreationTracker.f30950h
            boolean r4 = r4.compareAndSet(r5, r0)
            if (r4 == 0) goto Lc6
            java.lang.String r4 = "Cold"
            goto Lcb
        Lc6:
            java.lang.String r4 = "Cool"
            goto Lcb
        Lc9:
            java.lang.String r4 = "Warm"
        Lcb:
            r3.f31556O = r4
            r3.f31557P = r5
            com.yandex.div.core.view2.animations.DivTransitionHandler r4 = new com.yandex.div.core.view2.animations.DivTransitionHandler
            r4.<init>(r3)
            r3.divTransitionHandler = r4
            com.yandex.div.core.DivCreationTracker$Companion r4 = com.yandex.div.core.DivCreationTracker.f30948f
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f31555N = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.Div2View.<init>(com.yandex.div.core.Div2Context, android.util.AttributeSet, int, int):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        DivVideoActionHandler mo16631c = getDiv2Component().mo16631c();
        Intrinsics.m32178g(mo16631c, "div2Component.divVideoActionHandler");
        return mo16631c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private DivTooltipController getTooltipController() {
        DivTooltipController mo16647s = getDiv2Component().mo16647s();
        Intrinsics.m32178g(mo16647s, "div2Component.tooltipController");
        return mo16647s;
    }

    private VariableController getVariableController() {
        ExpressionsRuntime expressionsRuntime = this.f31571y;
        if (expressionsRuntime == null) {
            return null;
        }
        return expressionsRuntime.f31191b;
    }

    @HistogramCallType
    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    /* renamed from: A */
    public final long m16803A(DivData divData) {
        DivViewState currentState = getCurrentState();
        Long valueOf = currentState == null ? null : Long.valueOf(currentState.f31335a);
        if (valueOf != null) {
            return valueOf.longValue();
        }
        Intrinsics.m32179h(divData, "<this>");
        if (!divData.f35453b.isEmpty()) {
            return divData.f35453b.get(0).f35464b;
        }
        DivDataUtilsKt.m17550a(DivData.f35444h);
        return -1L;
    }

    /* renamed from: B */
    public void m16804B(@NotNull OverflowMenuSubscriber.Listener listener) {
        synchronized (this.f31542A) {
            this.f31566t.add(listener);
        }
    }

    /* renamed from: C */
    public void m16805C(long j2, boolean z) {
        synchronized (this.f31542A) {
            DivDataUtilsKt.m17550a(DivData.f35444h);
            if (j2 != -1) {
                SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                if (bindOnAttachRunnable != null) {
                    bindOnAttachRunnable.f31468a = null;
                }
                m16820u(j2, z);
            }
        }
    }

    /* renamed from: D */
    public void m16806D() {
        DivVisibilityActionTracker mo16644p = getDiv2Component().mo16644p();
        Intrinsics.m32178g(mo16644p, "div2Component.visibilityActionTracker");
        for (Map.Entry<View, Div> entry : this.f31568v.entrySet()) {
            View key = entry.getKey();
            Div div = entry.getValue();
            if (ViewCompat.m2173M(key)) {
                Intrinsics.m32178g(div, "div");
                mo16644p.m16876d(this, key, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
            }
        }
    }

    /* renamed from: E */
    public final void m16807E(DivData.State state) {
        DivVisibilityActionTracker mo16644p = getDiv2Component().mo16644p();
        Intrinsics.m32178g(mo16644p, "div2Component.visibilityActionTracker");
        mo16644p.m16876d(this, getView(), r4, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(state.f35463a.m17557a()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public void m16808F() {
        List<DivData.State> list;
        DivData divData = getDivData();
        DivData.State state = null;
        if (divData != null && (list = divData.f35453b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((DivData.State) next).f35464b == getStateId()) {
                    state = next;
                    break;
                }
            }
            state = state;
        }
        if (state != null) {
            m16807E(state);
        }
        m16806D();
    }

    @Nullable
    /* renamed from: G */
    public Div m16809G(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        return this.f31568v.remove(view);
    }

    /* renamed from: H */
    public final boolean m16810H(final DivData divData, DivDataTag divDataTag) {
        final View m16815p;
        Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
        if (histogramReporter != null) {
            histogramReporter.f33654e = Long.valueOf(SystemClock.uptimeMillis());
        }
        DivData divData2 = getDivData();
        TransitionSet transitionSet = null;
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.f30858b);
        Iterator<T> it = this.f31565s.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.f31565s.clear();
        this.f31568v.clear();
        this.f31569w.clear();
        DivTooltipController tooltipController = getTooltipController();
        Objects.requireNonNull(tooltipController);
        tooltipController.m16743b(this, this);
        m16817r();
        this.f31567u.clear();
        setDataTag$div_release(divDataTag);
        setDivData$div_release(divData);
        DivData.State m16825z = divData2 == null ? null : m16825z(divData2);
        final DivData.State m16825z2 = m16825z(divData);
        setStateId$div_release(m16803A(divData));
        boolean z = false;
        if (m16825z2 != null) {
            if (divData2 == null) {
                getDiv2Component().mo16645q().m16713b(getDataTag(), getStateId(), true);
                final DivStatePath m16720a = DivStatePath.f31330c.m16720a(m16825z2.f35464b);
                m16815p = this.f31564r.m16801b(m16825z2.f35463a, this, m16720a);
                if (this.f31562p) {
                    setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            Div2View div2View = Div2View.this;
                            View view = m16815p;
                            DivData.State state = m16825z2;
                            try {
                                div2View.getDiv2Component().mo16641m().m16852b(view, state.f35463a, div2View, m16720a);
                            } catch (ParsingException e2) {
                                if (!ExpressionFallbacksHelperKt.m16669a(e2)) {
                                    throw e2;
                                }
                            }
                            Div2View.this.getDiv2Component().mo16641m().m16851a();
                            return Unit.f63088a;
                        }
                    }));
                } else {
                    getDiv2Component().mo16641m().m16852b(m16815p, m16825z2.f35463a, this, m16720a);
                    if (ViewCompat.m2173M(this)) {
                        getDiv2Component().mo16641m().m16851a();
                    } else {
                        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(@NotNull View view) {
                                Intrinsics.m32179h(view, "view");
                                this.removeOnAttachStateChangeListener(this);
                                this.getDiv2Component().mo16641m().m16851a();
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(@NotNull View view) {
                                Intrinsics.m32179h(view, "view");
                            }
                        });
                    }
                }
            } else {
                m16815p = m16815p(m16825z2, getStateId(), true);
            }
            if (m16825z != null) {
                m16818s(m16825z);
            }
            m16807E(m16825z2);
            if (divData2 != null && DivTransitionsKt.m16888a(divData2, getExpressionResolver())) {
                z = true;
            }
            if (z || DivTransitionsKt.m16888a(divData, getExpressionResolver())) {
                Div div = m16825z == null ? null : m16825z.f35463a;
                Div div2 = m16825z2.f35463a;
                if (!Intrinsics.m32174c(div, div2)) {
                    final TransitionSet m16862a = getViewComponent().mo16659h().m16862a(div == null ? null : m16819t(divData2, div), div2 == null ? null : m16819t(divData, div2), getExpressionResolver());
                    if (m16862a.m4265Q() != 0) {
                        final DivDataChangeListener mo16646r = getDiv2Component().mo16646r();
                        Intrinsics.m32178g(mo16646r, "div2Component.divDataChangeListener");
                        mo16646r.mo16586b(this, divData);
                        m16862a.mo4237a(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
                            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                            /* renamed from: c */
                            public void mo4192c(@NotNull Transition transition) {
                                Intrinsics.m32179h(transition, "transition");
                                mo16646r.mo16585a(this, divData);
                                Transition.this.mo4255z(this);
                            }
                        });
                        transitionSet = m16862a;
                    }
                }
                if (transitionSet != null) {
                    Scene scene = (Scene) getTag(C2507R.id.transition_current_scene);
                    if (scene != null) {
                        scene.f6251c = new RunnableC0042c(this, 14);
                    }
                    Scene scene2 = new Scene(this, m16815p);
                    TransitionManager.m4257b(this);
                    TransitionManager.m4259d(scene2, transitionSet);
                } else {
                    ReleaseUtils.f32861a.m17110a(this, this);
                    addView(m16815p);
                    getViewComponent().mo16653b().m17120a(this);
                }
            } else {
                ReleaseUtils.f32861a.m17110a(this, this);
                addView(m16815p);
                getViewComponent().mo16653b().m17120a(this);
            }
            z = true;
        }
        m16813n();
        if (this.f31562p && divData2 == null) {
            Div2ViewHistogramReporter histogramReporter2 = getHistogramReporter();
            if (histogramReporter2 != null) {
                histogramReporter2.f33655f = Long.valueOf(SystemClock.uptimeMillis());
            }
            this.f31545D = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View$updateNow$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Div2ViewHistogramReporter histogramReporter3;
                    histogramReporter3 = Div2View.this.getHistogramReporter();
                    if (histogramReporter3 != null) {
                        histogramReporter3.f33656g = Long.valueOf(SystemClock.uptimeMillis());
                    }
                    return Unit.f63088a;
                }
            });
            this.f31546E = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View$updateNow$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Div2ViewHistogramReporter histogramReporter3;
                    histogramReporter3 = Div2View.this.getHistogramReporter();
                    if (histogramReporter3 != null) {
                        histogramReporter3.m17278b();
                    }
                    return Unit.f63088a;
                }
            });
        } else {
            Div2ViewHistogramReporter histogramReporter3 = getHistogramReporter();
            if (histogramReporter3 != null) {
                histogramReporter3.m17278b();
            }
        }
        return z;
    }

    @Override // com.yandex.div.core.DivViewFacade
    /* renamed from: b */
    public void mo16607b(@NotNull String str) {
        final DivTooltipController tooltipController = getTooltipController();
        Objects.requireNonNull(tooltipController);
        Pair<DivTooltip, View> m16748c = DivTooltipControllerKt.m16748c(str, this);
        if (m16748c == null) {
            return;
        }
        final DivTooltip divTooltip = m16748c.f63055b;
        final View view = m16748c.f63056c;
        if (tooltipController.f31411f.containsKey(divTooltip.f40502e)) {
            return;
        }
        if (!ViewsKt.m16768b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    DivTooltipController.m16742a(DivTooltipController.this, view, divTooltip, this);
                }
            });
        } else {
            DivTooltipController.m16742a(tooltipController, view, divTooltip, this);
        }
        if (ViewsKt.m16768b(view) || view.isLayoutRequested()) {
            return;
        }
        view.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.DivViewFacade
    /* renamed from: d */
    public void mo16608d(@NotNull DivStatePath divStatePath, boolean z) {
        List<DivData.State> list;
        synchronized (this.f31542A) {
            long stateId = getStateId();
            long j2 = divStatePath.f31331a;
            if (stateId == j2) {
                SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                DivData.State state = null;
                if (bindOnAttachRunnable != null) {
                    bindOnAttachRunnable.f31468a = null;
                }
                DivData divData = getDivData();
                if (divData != null && (list = divData.f35453b) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((DivData.State) next).f35464b == divStatePath.f31331a) {
                            state = next;
                            break;
                        }
                    }
                    state = state;
                }
                this.f31570x.m16828c(state, divStatePath, z);
            } else {
                DivData.Companion companion = DivData.f35444h;
                if (j2 != -1) {
                    DivStateManager mo16645q = getDiv2Component().mo16645q();
                    String str = getDataTag().f30859a;
                    Intrinsics.m32178g(str, "dataTag.id");
                    mo16645q.m16714c(str, divStatePath, z);
                    m16805C(divStatePath.f31331a, z);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if (this.f31557P) {
            Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
            Objects.requireNonNull(histogramReporter);
            histogramReporter.f33660k = Long.valueOf(SystemClock.uptimeMillis());
        }
        BaseDivViewExtensionsKt.m16963w(this, canvas);
        super.dispatchDraw(canvas);
        if (this.f31557P) {
            getHistogramReporter().m17279c();
        }
    }

    @Override // android.view.View
    public void draw(@Nullable Canvas canvas) {
        this.f31557P = false;
        Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f33660k = Long.valueOf(SystemClock.uptimeMillis());
        super.draw(canvas);
        getHistogramReporter().m17279c();
        this.f31557P = true;
    }

    @Override // com.yandex.div.core.DivViewFacade
    /* renamed from: f */
    public void mo16609f(@NotNull String str) {
        getTooltipController().m16744c(str, this);
    }

    @Nullable
    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    @Nullable
    /* renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public SingleTimeOnAttachCallback getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    @Nullable
    public String getComponentName() {
        return getHistogramReporter().f33652c;
    }

    @NotNull
    public DivViewConfig getConfig() {
        DivViewConfig config = this.f31548G;
        Intrinsics.m32178g(config, "config");
        return config;
    }

    @Nullable
    public DivViewState getCurrentState() {
        DivData divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState m16712a = getDiv2Component().mo16645q().m16712a(getDataTag());
        List<DivData.State> list = divData.f35453b;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (m16712a != null && ((DivData.State) it.next()).f35464b == m16712a.f31335a) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return m16712a;
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId();
    }

    @NotNull
    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        DivCustomContainerChildFactory mo16640l = getDiv2Component().mo16640l();
        Intrinsics.m32178g(mo16640l, "div2Component.divCustomContainerChildFactory");
        return mo16640l;
    }

    @NotNull
    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    @NotNull
    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    @Nullable
    public DivData getDivData() {
        return this.divData;
    }

    @NotNull
    public DivDataTag getDivTag() {
        return getDataTag();
    }

    @Nullable
    /* renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public DivTimerEventDispatcher getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    @NotNull
    /* renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public DivTransitionHandler getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public ExpressionResolver getExpressionResolver() {
        ExpressionsRuntime expressionsRuntime = this.f31571y;
        ExpressionResolver expressionResolver = expressionsRuntime == null ? null : expressionsRuntime.f31190a;
        return expressionResolver == null ? ExpressionResolver.f34350a : expressionResolver;
    }

    @NotNull
    public String getLogId() {
        String str;
        DivData divData = getDivData();
        return (divData == null || (str = divData.f35452a) == null) ? "" : str;
    }

    @NotNull
    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    @NotNull
    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent().mo16654c();
    }

    /* renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public Div2View getView() {
        return this;
    }

    @NotNull
    /* renamed from: getViewComponent$div_release, reason: from getter */
    public Div2ViewComponent getViewComponent() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().mo16653b().f32907b;
    }

    /* renamed from: l */
    public void m16811l(@NotNull LoadReference loadReference, @NotNull View targetView) {
        Intrinsics.m32179h(targetView, "targetView");
        synchronized (this.f31542A) {
            this.f31565s.add(loadReference);
        }
    }

    /* renamed from: m */
    public boolean m16812m(@NotNull String str, @NotNull String str2) {
        DivPlayerView playerView;
        DivVideoActionHandler divVideoActionHandler = getDivVideoActionHandler();
        Objects.requireNonNull(divVideoActionHandler);
        DivVideoView m16700a = divVideoActionHandler.m16700a(this, str);
        DivPlayer attachedPlayer = (m16700a == null || (playerView = m16700a.getPlayerView()) == null) ? null : playerView.getAttachedPlayer();
        if (attachedPlayer == null) {
            return false;
        }
        if (Intrinsics.m32174c(str2, "start")) {
            attachedPlayer.play();
        } else {
            if (!Intrinsics.m32174c(str2, "pause")) {
                return false;
            }
            attachedPlayer.pause();
        }
        return true;
    }

    /* renamed from: n */
    public final void m16813n() {
        if (this.f31562p) {
            this.f31543B = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View$attachVariableTriggers$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Div2View div2View = Div2View.this;
                    ExpressionsRuntime expressionsRuntime = div2View.f31571y;
                    if (expressionsRuntime != null) {
                        expressionsRuntime.f31192c.m16680b(div2View);
                    }
                    return Unit.f63088a;
                }
            });
            return;
        }
        ExpressionsRuntime expressionsRuntime = this.f31571y;
        if (expressionsRuntime == null) {
            return;
        }
        expressionsRuntime.f31192c.m16680b(this);
    }

    /* renamed from: o */
    public void m16814o(@NotNull View view, @NotNull Div div) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        this.f31568v.put(view, div);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.f31545D;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.m16766a();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.f31543B;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.m16766a();
        }
        SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.m16766a();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback3 = this.f31546E;
        if (singleTimeOnAttachCallback3 == null) {
            return;
        }
        singleTimeOnAttachCallback3.m16766a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m16808F();
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher == null) {
            return;
        }
        divTimerEventDispatcher.m16726c(this);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f33659j = Long.valueOf(SystemClock.uptimeMillis());
        super.onLayout(z, i2, i3, i4, i5);
        m16808F();
        Div2ViewHistogramReporter histogramReporter2 = getHistogramReporter();
        Long l2 = histogramReporter2.f33659j;
        if (l2 == null) {
            return;
        }
        histogramReporter2.m17277a().f33697d += histogramReporter2.m17280d(l2.longValue());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f33658i = Long.valueOf(SystemClock.uptimeMillis());
        super.onMeasure(i2, i3);
        Div2ViewHistogramReporter histogramReporter2 = getHistogramReporter();
        Long l2 = histogramReporter2.f33658i;
        if (l2 == null) {
            return;
        }
        histogramReporter2.m17277a().f33696c += histogramReporter2.m17280d(l2.longValue());
    }

    /* renamed from: p */
    public final View m16815p(DivData.State state, long j2, boolean z) {
        getDiv2Component().mo16645q().m16713b(getDataTag(), j2, z);
        View m16800a = this.f31564r.m16800a(state.f35463a, this, DivStatePath.f31330c.m16720a(state.f35464b));
        getDiv2Component().mo16641m().m16851a();
        return m16800a;
    }

    /* renamed from: q */
    public void m16816q(@NotNull Function0<Unit> function0) {
        this.f31570x.m16826a(function0);
    }

    /* renamed from: r */
    public void m16817r() {
        synchronized (this.f31542A) {
            this.f31566t.clear();
        }
    }

    /* renamed from: s */
    public final void m16818s(DivData.State state) {
        DivVisibilityActionTracker mo16644p = getDiv2Component().mo16644p();
        Intrinsics.m32178g(mo16644p, "div2Component.visibilityActionTracker");
        mo16644p.m16876d(this, null, r4, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(state.f35463a.m17557a()) : null);
    }

    public void setActionHandler(@Nullable DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(@Nullable SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setComponentName(@Nullable String str) {
        getHistogramReporter().f33652c = str;
    }

    public void setConfig(@NotNull DivViewConfig viewConfig) {
        Intrinsics.m32179h(viewConfig, "viewConfig");
        this.f31548G = viewConfig;
    }

    public void setDataTag$div_release(@NotNull DivDataTag value) {
        Intrinsics.m32179h(value, "value");
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = value;
        this.f31563q.m16877a(value, getDivData());
    }

    public void setDivData$div_release(@Nullable DivData divData) {
        DivTimerEventDispatcher divTimerEventDispatcher;
        this.divData = divData;
        DivData divData2 = getDivData();
        if (divData2 != null) {
            ExpressionsRuntime expressionsRuntime = this.f31571y;
            ExpressionsRuntime m16675a = getDiv2Component().mo16639k().m16675a(getDataTag(), divData2);
            this.f31571y = m16675a;
            if (!Intrinsics.m32174c(expressionsRuntime, m16675a) && expressionsRuntime != null) {
                expressionsRuntime.f31192c.m16679a();
            }
        }
        DivData divData3 = getDivData();
        if (divData3 != null) {
            DivTimerEventDispatcherProvider mo16635g = getDiv2Component().mo16635g();
            DivDataTag dataTag = getDataTag();
            ExpressionResolver expressionResolver = getExpressionResolver();
            Objects.requireNonNull(mo16635g);
            Intrinsics.m32179h(dataTag, "dataTag");
            Intrinsics.m32179h(expressionResolver, "expressionResolver");
            List<DivTimer> list = divData3.f35454c;
            DivTimerEventDispatcher divTimerEventDispatcher2 = null;
            if (list != null) {
                ErrorCollector m17115a = mo16635g.f31353b.m17115a(dataTag, divData3);
                Map<String, DivTimerEventDispatcher> controllers = mo16635g.f31354c;
                Intrinsics.m32178g(controllers, "controllers");
                String str = dataTag.f30859a;
                DivTimerEventDispatcher divTimerEventDispatcher3 = controllers.get(str);
                if (divTimerEventDispatcher3 == null) {
                    divTimerEventDispatcher3 = new DivTimerEventDispatcher(m17115a);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        divTimerEventDispatcher3.m16724a(new TimerController((DivTimer) it.next(), mo16635g.f31352a, m17115a, expressionResolver));
                    }
                    controllers.put(str, divTimerEventDispatcher3);
                }
                DivTimerEventDispatcher divTimerEventDispatcher4 = divTimerEventDispatcher3;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DivTimer divTimer = (DivTimer) it2.next();
                    if (!(divTimerEventDispatcher4.m16725b(divTimer.f40453c) != null)) {
                        divTimerEventDispatcher4.m16724a(new TimerController(divTimer, mo16635g.f31352a, m17115a, expressionResolver));
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((DivTimer) it3.next()).f40453c);
                }
                Map<String, TimerController> map = divTimerEventDispatcher4.f31348b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, TimerController> entry : map.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (TimerController timerController : linkedHashMap.values()) {
                    timerController.f31394e = null;
                    timerController.f31399j.m16735h();
                    timerController.f31398i = true;
                }
                divTimerEventDispatcher4.f31349c.clear();
                divTimerEventDispatcher4.f31349c.addAll(arrayList);
                divTimerEventDispatcher2 = divTimerEventDispatcher4;
            }
            if (!Intrinsics.m32174c(getDivTimerEventDispatcher(), divTimerEventDispatcher2) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
                divTimerEventDispatcher.m16726c(this);
            }
            setDivTimerEventDispatcher$div_release(divTimerEventDispatcher2);
            if (divTimerEventDispatcher2 != null) {
                Timer timer = new Timer();
                divTimerEventDispatcher2.f31350d = timer;
                divTimerEventDispatcher2.f31351e = this;
                Iterator<T> it4 = divTimerEventDispatcher2.f31349c.iterator();
                while (it4.hasNext()) {
                    TimerController timerController2 = divTimerEventDispatcher2.f31348b.get((String) it4.next());
                    if (timerController2 != null) {
                        timerController2.f31394e = this;
                        Ticker ticker = timerController2.f31399j;
                        Objects.requireNonNull(ticker);
                        ticker.f31371o = timer;
                        if (timerController2.f31398i) {
                            timerController2.f31399j.m16734g();
                            timerController2.f31398i = false;
                        }
                    }
                }
            }
        }
        this.f31563q.m16877a(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(@Nullable DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setPrevDataTag$div_release(@NotNull DivDataTag divDataTag) {
        Intrinsics.m32179h(divDataTag, "<set-?>");
        this.prevDataTag = divDataTag;
    }

    public void setStateId$div_release(long j2) {
        this.stateId = j2;
    }

    public void setVisualErrorsEnabled(boolean z) {
        ErrorVisualMonitor mo16653b = getViewComponent().mo16653b();
        mo16653b.f32907b = z;
        mo16653b.m17121b();
    }

    /* renamed from: t */
    public final Sequence<Div> m16819t(DivData divData, Div div) {
        Expression<DivTransitionSelector> expression;
        final ExpressionResolver expressionResolver = getExpressionResolver();
        final ArrayDeque arrayDeque = new ArrayDeque();
        DivTransitionSelector mo17535b = (divData == null || (expression = divData.f35455d) == null) ? null : expression.mo17535b(expressionResolver);
        if (mo17535b == null) {
            mo17535b = DivTransitionSelector.NONE;
        }
        arrayDeque.addLast(mo17535b);
        DivTreeWalk m16751b = DivTreeWalkKt.m16757a(div).m16751b(new Function1<Div, Boolean>() { // from class: com.yandex.div.core.view2.Div2View$divSequenceForTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Div div2) {
                Div div3 = div2;
                Intrinsics.m32179h(div3, "div");
                if (div3 instanceof Div.State) {
                    arrayDeque.addLast(((Div.State) div3).f34433c.f39245v.mo17535b(expressionResolver));
                }
                return Boolean.TRUE;
            }
        });
        return SequencesKt.m33841i(new DivTreeWalk(m16751b.f31453a, m16751b.f31454b, new Function1<Div, Unit>() { // from class: com.yandex.div.core.view2.Div2View$divSequenceForTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Div div2) {
                Div div3 = div2;
                Intrinsics.m32179h(div3, "div");
                if (div3 instanceof Div.State) {
                    arrayDeque.removeLast();
                }
                return Unit.f63088a;
            }
        }, m16751b.f31456d), new Function1<Div, Boolean>() { // from class: com.yandex.div.core.view2.Div2View$divSequenceForTransition$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Div div2) {
                int ordinal;
                Div div3 = div2;
                Intrinsics.m32179h(div3, "div");
                List<DivTransitionTrigger> mo17577k = div3.m17557a().mo17577k();
                Boolean valueOf = mo17577k == null ? null : Boolean.valueOf(mo17577k.contains(DivTransitionTrigger.DATA_CHANGE));
                boolean z = false;
                if (valueOf == null) {
                    DivTransitionSelector m31921t = arrayDeque.m31921t();
                    if (m31921t != null && ((ordinal = m31921t.ordinal()) == 1 || ordinal == 3)) {
                        z = true;
                    }
                } else {
                    z = valueOf.booleanValue();
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* renamed from: u */
    public final boolean m16820u(long j2, boolean z) {
        List<DivData.State> list;
        Object obj;
        DivData.State state;
        List<DivData.State> list2;
        Object obj2;
        DivData.State state2;
        setStateId$div_release(j2);
        DivViewState currentState = getCurrentState();
        Long valueOf = currentState == null ? null : Long.valueOf(currentState.f31335a);
        DivData divData = getDivData();
        if (divData == null || (list = divData.f35453b) == null) {
            state = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (valueOf != null && ((DivData.State) obj).f35464b == valueOf.longValue()) {
                    break;
                }
            }
            state = (DivData.State) obj;
        }
        DivData divData2 = getDivData();
        if (divData2 == null || (list2 = divData2.f35453b) == null) {
            state2 = null;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((DivData.State) obj2).f35464b == j2) {
                    break;
                }
            }
            state2 = (DivData.State) obj2;
        }
        if (state2 != null) {
            if (state != null) {
                m16818s(state);
            }
            m16807E(state2);
            if (DivComparator.f31728a.m16881b(state != null ? state.f35463a : null, state2.f35463a, getExpressionResolver())) {
                View rootView = getView().getChildAt(0);
                DivBinder mo16641m = getDiv2Component().mo16641m();
                Intrinsics.m32178g(rootView, "rootView");
                mo16641m.m16852b(rootView, state2.f35463a, this, DivStatePath.f31330c.m16720a(j2));
                getDiv2Component().mo16645q().m16713b(getDataTag(), j2, z);
                getDiv2Component().mo16641m().m16851a();
            } else {
                ReleaseUtils.f32861a.m17110a(this, this);
                addView(m16815p(state2, j2, z));
            }
        }
        return state2 != null;
    }

    /* renamed from: v */
    public final void m16821v(DivData divData, boolean z) {
        Object obj;
        try {
            if (getChildCount() == 0) {
                m16810H(divData, getDataTag());
                return;
            }
            Div2ViewHistogramReporter histogramReporter = getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.f33657h = Long.valueOf(SystemClock.uptimeMillis());
            }
            ErrorCollector m17115a = getViewComponent().mo16657f().m17115a(getDataTag(), getDivData());
            m17115a.f32879e.clear();
            m17115a.f32876b.clear();
            m17115a.m17114c();
            Iterator<T> it = divData.f35453b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((DivData.State) obj).f35464b == getStateId()) {
                        break;
                    }
                }
            }
            DivData.State state = (DivData.State) obj;
            if (state == null) {
                state = divData.f35453b.get(0);
            }
            View childAt = getChildAt(0);
            Intrinsics.m32178g(childAt, "");
            BaseDivViewExtensionsKt.m16958r(childAt, state.f35463a.m17557a(), getExpressionResolver());
            setDivData$div_release(divData);
            getDiv2Component().mo16641m().m16852b(childAt, state.f35463a, this, DivStatePath.f31330c.m16720a(getStateId()));
            requestLayout();
            if (z) {
                getDiv2Component().mo16636h().mo16705a(this);
            }
            m16813n();
            Div2ViewHistogramReporter histogramReporter2 = getHistogramReporter();
            if (histogramReporter2 == null) {
                return;
            }
            Long l2 = histogramReporter2.f33657h;
            RenderMetrics m17277a = histogramReporter2.m17277a();
            if (l2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis() - l2.longValue();
                m17277a.f33695b = uptimeMillis;
                HistogramReporter.m17295a(histogramReporter2.f33650a.invoke(), "Div.Rebinding", uptimeMillis, histogramReporter2.f33652c, null, null, 24, null);
            }
            histogramReporter2.f33657h = null;
        } catch (Exception unused) {
            m16810H(divData, getDataTag());
        }
    }

    /* renamed from: w */
    public final void m16822w() {
        long j2;
        if (this.f31555N < 0) {
            return;
        }
        DivCreationTracker mo16632d = getDiv2Component().mo16632d();
        long j3 = this.f31559m;
        long j4 = this.f31555N;
        HistogramReporter mo16629a = getDiv2Component().mo16629a();
        Intrinsics.m32178g(mo16629a, "div2Component.histogramReporter");
        String viewCreateCallType = this.f31556O;
        Objects.requireNonNull(mo16632d);
        Intrinsics.m32179h(viewCreateCallType, "viewCreateCallType");
        if (j4 < 0) {
            j2 = -1;
        } else {
            long j5 = j4 - j3;
            j2 = -1;
            HistogramReporter.m17295a(mo16629a, "Div.View.Create", j5, null, viewCreateCallType, null, 20, null);
            if (mo16632d.f30953c.compareAndSet(false, true)) {
                long j6 = mo16632d.f30952b;
                if (j6 >= 0) {
                    HistogramReporter.m17295a(mo16629a, "Div.Context.Create", j6 - mo16632d.f30951a, null, mo16632d.f30954d, null, 20, null);
                    mo16632d.f30952b = -1L;
                }
            }
        }
        this.f31555N = j2;
    }

    /* renamed from: x */
    public boolean m16823x(@Nullable DivData divData, @NotNull DivDataTag divDataTag) {
        boolean z;
        DivData divData2 = getDivData();
        synchronized (this.f31542A) {
            z = false;
            if (divData != null) {
                if (!Intrinsics.m32174c(getDivData(), divData)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                    DivData divData3 = null;
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.f31468a = null;
                    }
                    getHistogramReporter().f33653d = true;
                    DivData divData4 = getDivData();
                    if (divData4 != null) {
                        divData2 = divData4;
                    }
                    if (DivComparator.f31728a.m16884e(divData2, divData, getStateId(), getExpressionResolver())) {
                        divData3 = divData2;
                    }
                    setDataTag$div_release(divDataTag);
                    for (DivData.State state : divData.f35453b) {
                        DivPreloader mo16649u = getDiv2Component().mo16649u();
                        Intrinsics.m32178g(mo16649u, "div2Component.preloader");
                        mo16649u.m16588a(state.f35463a, getExpressionResolver(), C6523a.f63033x);
                    }
                    if (divData3 != null) {
                        if (DivTransitionsKt.m16888a(divData, getExpressionResolver())) {
                            m16810H(divData, divDataTag);
                        } else {
                            m16821v(divData, false);
                        }
                        getDiv2Component().mo16641m().m16851a();
                    } else {
                        z = m16810H(divData, divDataTag);
                    }
                    m16822w();
                }
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: y */
    public VariableMutationException m16824y(@NotNull String name, @NotNull String value) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
        VariableController variableController = getVariableController();
        Variable m16688c = variableController == null ? null : variableController.m16688c(name);
        if (m16688c == null) {
            VariableMutationException variableMutationException = new VariableMutationException(C0000a.m16m("Variable '", name, "' not defined!"), null, 2);
            ErrorCollector m17115a = getViewComponent().mo16657f().m17115a(getDivTag(), getDivData());
            m17115a.f32876b.add(variableMutationException);
            m17115a.m17114c();
            return variableMutationException;
        }
        try {
            m16688c.m17212d(value);
            return null;
        } catch (VariableMutationException e2) {
            VariableMutationException variableMutationException2 = new VariableMutationException(C0000a.m16m("Variable '", name, "' mutation failed!"), e2);
            ErrorCollector m17115a2 = getViewComponent().mo16657f().m17115a(getDivTag(), getDivData());
            m17115a2.f32876b.add(variableMutationException2);
            m17115a2.m17114c();
            return variableMutationException2;
        }
    }

    /* renamed from: z */
    public final DivData.State m16825z(DivData divData) {
        Object obj;
        long m16803A = m16803A(divData);
        Iterator<T> it = divData.f35453b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivData.State) obj).f35464b == m16803A) {
                break;
            }
        }
        return (DivData.State) obj;
    }
}
