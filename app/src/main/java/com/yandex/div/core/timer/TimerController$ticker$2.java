package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TimerController.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class TimerController$ticker$2 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public TimerController$ticker$2(Object obj) {
        super(1, obj, TimerController.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Long l2) {
        ((TimerController) this.receiver).m16739b(l2.longValue());
        return Unit.f63088a;
    }
}
