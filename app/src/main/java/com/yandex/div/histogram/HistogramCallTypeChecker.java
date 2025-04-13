package com.yandex.div.histogram;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramCallTypeChecker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/HistogramCallTypeChecker;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class HistogramCallTypeChecker {

    /* renamed from: a */
    @NotNull
    public final Lazy f33670a = LazyKt.m31881b(new Function0<ConcurrentHashMap<String, Unit>>() { // from class: com.yandex.div.histogram.HistogramCallTypeChecker$reportedHistograms$2
        @Override // kotlin.jvm.functions.Function0
        public ConcurrentHashMap<String, Unit> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    /* renamed from: a */
    public final boolean m17282a(@NotNull String str) {
        return !((ConcurrentHashMap) this.f33670a.getValue()).containsKey(str) && ((ConcurrentHashMap) this.f33670a.getValue()).putIfAbsent(str, Unit.f63088a) == null;
    }
}
