package com.yandex.div.core;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCreationTracker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/DivCreationTracker;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivCreationTracker {

    /* renamed from: f */
    @NotNull
    public static final Companion f30948f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final AtomicBoolean f30949g = new AtomicBoolean(true);

    /* renamed from: h */
    @NotNull
    public static final AtomicBoolean f30950h = new AtomicBoolean(true);

    /* renamed from: a */
    public final long f30951a;

    /* renamed from: b */
    public long f30952b = -1;

    /* renamed from: c */
    @NotNull
    public final AtomicBoolean f30953c = new AtomicBoolean(false);

    /* renamed from: d */
    @NotNull
    public final String f30954d;

    /* renamed from: e */
    @NotNull
    public final AtomicBoolean f30955e;

    /* compiled from: DivCreationTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/core/DivCreationTracker$Companion;", "", "", "INVALID_TIME", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdContextCreate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdViewCreate", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivCreationTracker(long j2) {
        this.f30951a = j2;
        this.f30954d = f30949g.compareAndSet(true, false) ? "Cold" : "Cool";
        this.f30955e = new AtomicBoolean(true);
    }
}
