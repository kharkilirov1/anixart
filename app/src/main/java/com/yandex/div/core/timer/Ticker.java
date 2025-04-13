package com.yandex.div.core.timer;

import com.yandex.div.core.C2817d;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Ticker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/timer/Ticker;", "", "Companion", "State", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class Ticker {

    /* renamed from: a */
    @NotNull
    public final String f31357a;

    /* renamed from: b */
    @NotNull
    public final Function1<Long, Unit> f31358b;

    /* renamed from: c */
    @NotNull
    public final Function1<Long, Unit> f31359c;

    /* renamed from: d */
    @NotNull
    public final Function1<Long, Unit> f31360d;

    /* renamed from: e */
    @NotNull
    public final Function1<Long, Unit> f31361e;

    /* renamed from: f */
    @Nullable
    public final ErrorCollector f31362f;

    /* renamed from: g */
    @Nullable
    public Long f31363g;

    /* renamed from: h */
    @Nullable
    public Long f31364h;

    /* renamed from: i */
    @Nullable
    public Long f31365i;

    /* renamed from: j */
    @Nullable
    public Long f31366j;

    /* renamed from: k */
    @NotNull
    public State f31367k;

    /* renamed from: l */
    public long f31368l;

    /* renamed from: m */
    public long f31369m;

    /* renamed from: n */
    public long f31370n;

    /* renamed from: o */
    @Nullable
    public Timer f31371o;

    /* renamed from: p */
    @Nullable
    public TimerTask f31372p;

    /* compiled from: Ticker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/timer/Ticker$Companion;", "", "", "DEFAULT_VALUE", "J", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: Ticker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/timer/Ticker$State;", "", "STOPPED", "WORKING", "PAUSED", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* compiled from: Ticker.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@NotNull String name, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Long, Unit> function12, @NotNull Function1<? super Long, Unit> function13, @NotNull Function1<? super Long, Unit> function14, @Nullable ErrorCollector errorCollector) {
        Intrinsics.m32179h(name, "name");
        this.f31357a = name;
        this.f31358b = function1;
        this.f31359c = function12;
        this.f31360d = function13;
        this.f31361e = function14;
        this.f31362f = errorCollector;
        this.f31367k = State.STOPPED;
        this.f31369m = -1L;
        this.f31370n = -1L;
    }

    /* renamed from: j */
    public static /* synthetic */ void m16727j(Ticker ticker, long j2, long j3, Function0 function0, int i2, Object obj) {
        ticker.m16736i(j2, (i2 & 2) != 0 ? j2 : j3, function0);
    }

    /* renamed from: a */
    public void m16728a() {
        int ordinal = this.f31367k.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            this.f31367k = State.STOPPED;
            m16729b();
            this.f31358b.invoke(Long.valueOf(m16731d()));
            m16733f();
        }
    }

    /* renamed from: b */
    public void m16729b() {
        TimerTask timerTask = this.f31372p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f31372p = null;
    }

    /* renamed from: c */
    public final void m16730c() {
        Long l2 = this.f31363g;
        if (l2 != null) {
            this.f31361e.invoke(Long.valueOf(RangesKt.m32237d(m16731d(), l2.longValue())));
        } else {
            this.f31361e.invoke(Long.valueOf(m16731d()));
        }
    }

    /* renamed from: d */
    public final long m16731d() {
        return (this.f31369m == -1 ? 0L : System.currentTimeMillis() - this.f31369m) + this.f31368l;
    }

    /* renamed from: e */
    public final void m16732e(String str) {
        ErrorCollector errorCollector = this.f31362f;
        if (errorCollector == null) {
            return;
        }
        errorCollector.m17112a(new IllegalArgumentException(str));
    }

    /* renamed from: f */
    public final void m16733f() {
        this.f31369m = -1L;
        this.f31370n = -1L;
        this.f31368l = 0L;
    }

    /* renamed from: g */
    public final void m16734g() {
        Long l2 = this.f31366j;
        Long l3 = this.f31365i;
        if (l2 != null && this.f31370n != -1 && System.currentTimeMillis() - this.f31370n > l2.longValue()) {
            m16730c();
        }
        if (l2 == null && l3 != null) {
            final long longValue = l3.longValue();
            long m16731d = longValue - m16731d();
            if (m16731d >= 0) {
                m16727j(this, m16731d, 0L, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runCountDownTimer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        Ticker.this.m16729b();
                        Ticker.this.f31360d.invoke(Long.valueOf(longValue));
                        Ticker ticker = Ticker.this;
                        ticker.f31367k = Ticker.State.STOPPED;
                        ticker.m16733f();
                        return Unit.f63088a;
                    }
                }, 2, null);
                return;
            } else {
                this.f31360d.invoke(Long.valueOf(longValue));
                m16733f();
                return;
            }
        }
        if (l2 == null || l3 == null) {
            if (l2 == null || l3 != null) {
                return;
            }
            long longValue2 = l2.longValue();
            m16736i(longValue2, longValue2 - (m16731d() % longValue2), new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runEndlessTimer$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Ticker.this.m16730c();
                    return Unit.f63088a;
                }
            });
            return;
        }
        final long longValue3 = l3.longValue();
        final long longValue4 = l2.longValue();
        long m16731d2 = longValue4 - (m16731d() % longValue4);
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.f63350b = (longValue3 / longValue4) - (m16731d() / longValue4);
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                if (Ref.LongRef.this.f63350b > 0) {
                    this.f31361e.invoke(Long.valueOf(longValue3));
                }
                this.f31360d.invoke(Long.valueOf(longValue3));
                this.m16729b();
                this.m16733f();
                this.f31367k = Ticker.State.STOPPED;
                return Unit.f63088a;
            }
        };
        m16736i(longValue4, m16731d2, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                long m16731d3 = longValue3 - this.m16731d();
                this.m16730c();
                Ref.LongRef longRef2 = longRef;
                longRef2.f63350b--;
                boolean z = false;
                if (1 <= m16731d3 && m16731d3 < longValue4) {
                    z = true;
                }
                if (z) {
                    this.m16729b();
                    Ticker ticker = this;
                    final Function0<Unit> function02 = function0;
                    Ticker.m16727j(ticker, m16731d3, 0L, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            function02.invoke();
                            return Unit.f63088a;
                        }
                    }, 2, null);
                } else if (m16731d3 <= 0) {
                    function0.invoke();
                }
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: h */
    public final void m16735h() {
        if (this.f31369m != -1) {
            this.f31368l += System.currentTimeMillis() - this.f31369m;
            this.f31370n = System.currentTimeMillis();
            this.f31369m = -1L;
        }
        m16729b();
    }

    /* renamed from: i */
    public void m16736i(long j2, long j3, @NotNull final Function0<Unit> onTick) {
        Intrinsics.m32179h(onTick, "onTick");
        TimerTask timerTask = this.f31372p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f31372p = new TimerTask() { // from class: com.yandex.div.core.timer.Ticker$setupTimer$$inlined$timerTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Function0.this.invoke();
            }
        };
        this.f31369m = System.currentTimeMillis();
        Timer timer = this.f31371o;
        if (timer == null) {
            return;
        }
        timer.scheduleAtFixedRate(this.f31372p, j3, j2);
    }

    /* renamed from: k */
    public void m16737k() {
        int ordinal = this.f31367k.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C2817d.m16616b(C0000a.m24u("The timer '"), this.f31357a, "' already working!", this);
                return;
            } else {
                if (ordinal != 2) {
                    return;
                }
                C2817d.m16616b(C0000a.m24u("The timer '"), this.f31357a, "' paused!", this);
                return;
            }
        }
        m16729b();
        this.f31365i = this.f31363g;
        this.f31366j = this.f31364h;
        this.f31367k = State.WORKING;
        this.f31359c.invoke(Long.valueOf(m16731d()));
        m16734g();
    }
}
