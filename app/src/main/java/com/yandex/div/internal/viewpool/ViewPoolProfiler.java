package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.internal.viewpool.ProfilingSession;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewPoolProfiler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "", "FrameWatcher", "Reporter", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewPoolProfiler {

    /* renamed from: a */
    @NotNull
    public final Reporter f33933a;

    /* renamed from: b */
    @NotNull
    public final ProfilingSession f33934b;

    /* renamed from: c */
    @NotNull
    public final FrameWatcher f33935c;

    /* renamed from: d */
    @NotNull
    public final Handler f33936d;

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$FrameWatcher;", "Ljava/lang/Runnable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class FrameWatcher implements Runnable {

        /* renamed from: b */
        public boolean f33937b;

        public FrameWatcher() {
        }

        /* renamed from: a */
        public final void m17408a(@NotNull Handler handler) {
            Intrinsics.m32179h(handler, "handler");
            if (this.f33937b) {
                return;
            }
            handler.post(this);
            this.f33937b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler viewPoolProfiler = ViewPoolProfiler.this;
            synchronized (viewPoolProfiler.f33934b) {
                ProfilingSession profilingSession = viewPoolProfiler.f33934b;
                boolean z = true;
                if (profilingSession.f33920b.f33923b <= 0) {
                    Iterator<Map.Entry<String, ProfilingSession.Accumulator>> it = profilingSession.f33921c.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next().getValue().f33923b > 0) {
                            break;
                        }
                    }
                }
                if (z) {
                    viewPoolProfiler.f33933a.reportEvent("view pool profiling", viewPoolProfiler.f33934b.m17402a());
                }
                ProfilingSession profilingSession2 = viewPoolProfiler.f33934b;
                profilingSession2.f33919a.m17404a();
                profilingSession2.f33920b.m17404a();
                Iterator<Map.Entry<String, ProfilingSession.Accumulator>> it2 = profilingSession2.f33921c.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().m17404a();
                }
            }
            this.f33937b = false;
        }
    }

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Reporter {

        /* renamed from: a */
        @JvmField
        @NotNull
        public static final Reporter f33939a = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
            }
        };

        /* compiled from: ViewPoolProfiler.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter$Companion;", "", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "NO_OP", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }

        void reportEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map);
    }

    public ViewPoolProfiler(@NotNull Reporter reporter) {
        Intrinsics.m32179h(reporter, "reporter");
        this.f33933a = reporter;
        this.f33934b = new ProfilingSession();
        this.f33935c = new FrameWatcher();
        this.f33936d = new Handler(Looper.getMainLooper());
    }
}
