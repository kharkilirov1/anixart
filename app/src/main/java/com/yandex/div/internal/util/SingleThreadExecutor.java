package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleThreadExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/util/SingleThreadExecutor;", "", "Worker", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class SingleThreadExecutor {

    /* renamed from: a */
    @NotNull
    public final Executor f33895a;

    /* renamed from: b */
    @NotNull
    public final String f33896b;

    /* renamed from: c */
    @NotNull
    public final Object f33897c;

    /* renamed from: d */
    @Nullable
    public Worker f33898d;

    /* renamed from: e */
    @Nullable
    public List<Runnable> f33899e;

    /* compiled from: SingleThreadExecutor.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/util/SingleThreadExecutor$Worker;", "Lcom/yandex/div/internal/util/NamedRunnable;", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class Worker extends NamedRunnable {
        public Worker() {
            super(SingleThreadExecutor.this.f33896b);
        }

        @Override // com.yandex.div.internal.util.NamedRunnable
        /* renamed from: a */
        public void mo17391a() {
            List<Runnable> list;
            SingleThreadExecutor singleThreadExecutor = SingleThreadExecutor.this;
            synchronized (singleThreadExecutor.f33897c) {
                if (Intrinsics.m32174c(singleThreadExecutor.f33898d, this) && (list = singleThreadExecutor.f33899e) != null) {
                    singleThreadExecutor.f33899e = null;
                    boolean z = true;
                    while (z) {
                        if (list != null) {
                            try {
                                SingleThreadExecutor singleThreadExecutor2 = SingleThreadExecutor.this;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException e2) {
                                        singleThreadExecutor2.mo16546a(e2);
                                    }
                                }
                            } catch (Throwable th) {
                                SingleThreadExecutor singleThreadExecutor3 = SingleThreadExecutor.this;
                                synchronized (singleThreadExecutor3.f33897c) {
                                    singleThreadExecutor3.f33898d = null;
                                    throw th;
                                }
                            }
                        }
                        SingleThreadExecutor singleThreadExecutor4 = SingleThreadExecutor.this;
                        synchronized (singleThreadExecutor4.f33897c) {
                            List<Runnable> list2 = singleThreadExecutor4.f33899e;
                            if (list2 != null) {
                                singleThreadExecutor4.f33899e = null;
                                list = list2;
                            } else {
                                singleThreadExecutor4.f33898d = null;
                                z = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo16546a(@NotNull RuntimeException runtimeException);

    /* renamed from: b */
    public final void m17394b(@NotNull Runnable runnable) {
        Worker worker;
        synchronized (this.f33897c) {
            if (this.f33899e == null) {
                this.f33899e = new ArrayList(2);
            }
            List<Runnable> list = this.f33899e;
            if (list != null) {
                list.add(runnable);
            }
            if (this.f33898d == null) {
                worker = new Worker();
                this.f33898d = worker;
            } else {
                worker = null;
            }
        }
        if (worker != null) {
            this.f33895a.execute(worker);
        }
    }
}
