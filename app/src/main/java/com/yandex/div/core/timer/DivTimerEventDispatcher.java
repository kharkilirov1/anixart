package com.yandex.div.core.timer;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTimerEventDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTimerEventDispatcher {

    /* renamed from: a */
    @NotNull
    public final ErrorCollector f31347a;

    /* renamed from: b */
    @NotNull
    public final Map<String, TimerController> f31348b = new LinkedHashMap();

    /* renamed from: c */
    @NotNull
    public final Set<String> f31349c = new LinkedHashSet();

    /* renamed from: d */
    @Nullable
    public Timer f31350d;

    /* renamed from: e */
    @Nullable
    public Div2View f31351e;

    public DivTimerEventDispatcher(@NotNull ErrorCollector errorCollector) {
        this.f31347a = errorCollector;
    }

    /* renamed from: a */
    public final void m16724a(@NotNull TimerController timerController) {
        String str = timerController.f31390a.f40453c;
        if (this.f31348b.containsKey(str)) {
            return;
        }
        this.f31348b.put(str, timerController);
    }

    @Nullable
    /* renamed from: b */
    public final TimerController m16725b(@NotNull String id2) {
        Intrinsics.m32179h(id2, "id");
        if (this.f31349c.contains(id2)) {
            return this.f31348b.get(id2);
        }
        return null;
    }

    /* renamed from: c */
    public final void m16726c(@NotNull Div2View div2View) {
        if (Intrinsics.m32174c(this.f31351e, div2View)) {
            for (TimerController timerController : this.f31348b.values()) {
                timerController.f31394e = null;
                timerController.f31399j.m16735h();
                timerController.f31398i = true;
            }
            Timer timer = this.f31350d;
            if (timer != null) {
                timer.cancel();
            }
            this.f31350d = null;
        }
    }
}
