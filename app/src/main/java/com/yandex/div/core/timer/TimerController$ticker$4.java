package com.yandex.div.core.timer;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TimerController.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class TimerController$ticker$4 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public TimerController$ticker$4(Object obj) {
        super(1, obj, TimerController.class, "onTick", "onTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Long l2) {
        long longValue = l2.longValue();
        final TimerController timerController = (TimerController) this.receiver;
        timerController.m16739b(longValue);
        UiThreadHandler uiThreadHandler = UiThreadHandler.f33903a;
        if (UiThreadHandler.m17397a()) {
            List<DivAction> list = timerController.f31397h;
            if (list != null) {
                for (DivAction divAction : list) {
                    Div2View div2View = timerController.f31394e;
                    if (div2View != null) {
                        timerController.f31391b.handleAction(divAction, div2View);
                    }
                }
            }
        } else {
            UiThreadHandler.f33904b.post(new Runnable() { // from class: com.yandex.div.core.timer.TimerController$onTick$$inlined$executeOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    List<DivAction> list2 = TimerController.this.f31397h;
                    if (list2 == null) {
                        return;
                    }
                    for (DivAction divAction2 : list2) {
                        TimerController timerController2 = TimerController.this;
                        Div2View div2View2 = timerController2.f31394e;
                        if (div2View2 != null) {
                            timerController2.f31391b.handleAction(divAction2, div2View2);
                        }
                    }
                }
            });
        }
        return Unit.f63088a;
    }
}
