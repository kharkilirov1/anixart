package com.yandex.div.internal.viewpool;

import android.view.View;
import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import com.yandex.div.internal.viewpool.ProfilingSession;
import com.yandex.div.internal.viewpool.ViewCreator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdvanceViewPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "Channel", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AdvanceViewPool implements ViewPool {

    /* renamed from: a */
    @Nullable
    public final ViewPoolProfiler f33906a;

    /* renamed from: b */
    @NotNull
    public final ViewCreator f33907b;

    /* renamed from: c */
    @NotNull
    public final Map<String, Channel<? extends View>> f33908c;

    /* compiled from: AdvanceViewPool.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "Landroid/view/View;", "T", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Channel<T extends View> {

        /* renamed from: a */
        @NotNull
        public final String f33909a;

        /* renamed from: b */
        @Nullable
        public final ViewPoolProfiler f33910b;

        /* renamed from: c */
        @NotNull
        public final ViewFactory<T> f33911c;

        /* renamed from: d */
        @NotNull
        public final ViewCreator f33912d;

        /* renamed from: e */
        @NotNull
        public final BlockingQueue<T> f33913e;

        /* renamed from: f */
        @NotNull
        public final AtomicBoolean f33914f;

        /* renamed from: g */
        public final boolean f33915g;

        /* compiled from: AdvanceViewPool.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel$Companion;", "", "", "MAX_WAITING_TIME", "J", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }

        public Channel(@NotNull String str, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i2) {
            Intrinsics.m32179h(viewCreator, "viewCreator");
            this.f33909a = str;
            this.f33910b = viewPoolProfiler;
            this.f33911c = viewFactory;
            this.f33912d = viewCreator;
            this.f33913e = new ArrayBlockingQueue(i2, false);
            this.f33914f = new AtomicBoolean(false);
            this.f33915g = !r2.isEmpty();
            int i3 = 0;
            while (i3 < i2) {
                i3++;
                ViewCreator viewCreator2 = this.f33912d;
                Objects.requireNonNull(viewCreator2);
                viewCreator2.f33925a.f33931c.offer(new ViewCreator.CreateViewTask(this, 0));
            }
        }
    }

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull ViewCreator viewCreator) {
        Intrinsics.m32179h(viewCreator, "viewCreator");
        this.f33906a = viewPoolProfiler;
        this.f33907b = viewCreator;
        this.f33908c = new ArrayMap();
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    @NotNull
    /* renamed from: a */
    public <T extends View> T mo17400a(@NotNull String tag) {
        Channel<? extends View> channel;
        Intrinsics.m32179h(tag, "tag");
        synchronized (this.f33908c) {
            Map<String, Channel<? extends View>> map = this.f33908c;
            Intrinsics.m32179h(map, "<this>");
            Channel<? extends View> channel2 = map.get(tag);
            if (channel2 == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            channel = channel2;
        }
        long nanoTime = System.nanoTime();
        View poll = channel.f33913e.poll();
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (poll == null) {
            long nanoTime3 = System.nanoTime();
            try {
                channel.f33912d.m17406a(channel);
                poll = channel.f33913e.poll(16L, TimeUnit.MILLISECONDS);
                if (poll == null) {
                    poll = channel.f33911c.mo16909a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                poll = channel.f33911c.mo16909a();
            }
            long nanoTime4 = System.nanoTime() - nanoTime3;
            ViewPoolProfiler viewPoolProfiler = channel.f33910b;
            if (viewPoolProfiler != null) {
                String viewName = channel.f33909a;
                Intrinsics.m32179h(viewName, "viewName");
                synchronized (viewPoolProfiler.f33934b) {
                    viewPoolProfiler.f33934b.m17403b(viewName, nanoTime4);
                    viewPoolProfiler.f33935c.m17408a(viewPoolProfiler.f33936d);
                }
            }
        } else {
            ViewPoolProfiler viewPoolProfiler2 = channel.f33910b;
            if (viewPoolProfiler2 != null) {
                synchronized (viewPoolProfiler2.f33934b) {
                    ProfilingSession.Accumulator accumulator = viewPoolProfiler2.f33934b.f33919a;
                    accumulator.f33922a += nanoTime2;
                    accumulator.f33923b++;
                    viewPoolProfiler2.f33935c.m17408a(viewPoolProfiler2.f33936d);
                }
            }
        }
        long nanoTime5 = System.nanoTime();
        int size = channel.f33913e.size();
        ViewCreator viewCreator = channel.f33912d;
        Objects.requireNonNull(viewCreator);
        viewCreator.f33925a.f33931c.offer(new ViewCreator.CreateViewTask(channel, size));
        long nanoTime6 = System.nanoTime() - nanoTime5;
        ViewPoolProfiler viewPoolProfiler3 = channel.f33910b;
        if (viewPoolProfiler3 != null) {
            synchronized (viewPoolProfiler3.f33934b) {
                ProfilingSession profilingSession = viewPoolProfiler3.f33934b;
                profilingSession.f33919a.f33922a += nanoTime6;
                if (nanoTime6 >= 1000000) {
                    ProfilingSession.Accumulator accumulator2 = profilingSession.f33920b;
                    accumulator2.f33922a += nanoTime6;
                    accumulator2.f33923b++;
                }
                viewPoolProfiler3.f33935c.m17408a(viewPoolProfiler3.f33936d);
            }
        }
        Intrinsics.m32176e(poll);
        return (T) poll;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    /* renamed from: b */
    public <T extends View> void mo17401b(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i2) {
        synchronized (this.f33908c) {
            if (this.f33908c.containsKey(str)) {
                return;
            }
            this.f33908c.put(str, new Channel<>(str, this.f33906a, viewFactory, this.f33907b, i2));
        }
    }
}
