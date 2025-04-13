package com.yandex.div.core.timer;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTimer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimerController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/timer/TimerController;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TimerController {

    /* renamed from: a */
    @NotNull
    public final DivTimer f31390a;

    /* renamed from: b */
    @NotNull
    public final DivActionHandler f31391b;

    /* renamed from: c */
    @NotNull
    public final ErrorCollector f31392c;

    /* renamed from: d */
    @NotNull
    public final ExpressionResolver f31393d;

    /* renamed from: e */
    @Nullable
    public Div2View f31394e;

    /* renamed from: f */
    @Nullable
    public final String f31395f;

    /* renamed from: g */
    @Nullable
    public final List<DivAction> f31396g;

    /* renamed from: h */
    @Nullable
    public final List<DivAction> f31397h;

    /* renamed from: i */
    public boolean f31398i;

    /* renamed from: j */
    @NotNull
    public final Ticker f31399j;

    /* compiled from: TimerController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div/core/timer/TimerController$Companion;", "", "", "CANCEL_COMMAND", "Ljava/lang/String;", "PAUSE_COMMAND", "RESET_COMMAND", "RESUME_COMMAND", "START_COMMAND", "STOP_COMMAND", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public TimerController(@NotNull DivTimer divTimer, @NotNull DivActionHandler divActionHandler, @NotNull ErrorCollector errorCollector, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.m32179h(divTimer, "divTimer");
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(errorCollector, "errorCollector");
        Intrinsics.m32179h(expressionResolver, "expressionResolver");
        this.f31390a = divTimer;
        this.f31391b = divActionHandler;
        this.f31392c = errorCollector;
        this.f31393d = expressionResolver;
        String str = divTimer.f40453c;
        this.f31395f = divTimer.f40456f;
        this.f31396g = divTimer.f40452b;
        this.f31397h = divTimer.f40454d;
        this.f31399j = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        divTimer.f40451a.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                l2.longValue();
                TimerController.m16738a(TimerController.this);
                return Unit.f63088a;
            }
        });
        Expression<Long> expression = divTimer.f40455e;
        if (expression == null) {
            return;
        }
        expression.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.timer.TimerController.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                l2.longValue();
                TimerController.m16738a(TimerController.this);
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: a */
    public static final void m16738a(TimerController timerController) {
        Long mo17535b;
        Ticker ticker = timerController.f31399j;
        long longValue = timerController.f31390a.f40451a.mo17535b(timerController.f31393d).longValue();
        Expression<Long> expression = timerController.f31390a.f40455e;
        ticker.f31364h = (expression == null || (mo17535b = expression.mo17535b(timerController.f31393d)) == null) ? null : Long.valueOf(mo17535b.longValue());
        ticker.f31363g = longValue != 0 ? Long.valueOf(longValue) : null;
    }

    /* renamed from: b */
    public final void m16739b(final long j2) {
        if (this.f31395f != null) {
            UiThreadHandler uiThreadHandler = UiThreadHandler.f33903a;
            if (!UiThreadHandler.m17397a()) {
                UiThreadHandler.f33904b.post(new Runnable() { // from class: com.yandex.div.core.timer.TimerController$updateTimerVariable$$inlined$executeOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TimerController timerController = TimerController.this;
                        Div2View div2View = timerController.f31394e;
                        if (div2View == null) {
                            return;
                        }
                        div2View.m16824y(timerController.f31395f, String.valueOf(j2));
                    }
                });
                return;
            }
            Div2View div2View = this.f31394e;
            if (div2View == null) {
                return;
            }
            div2View.m16824y(this.f31395f, String.valueOf(j2));
        }
    }
}
