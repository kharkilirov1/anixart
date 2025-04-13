package com.swiftsoft.anixartd.utils;

import com.swiftsoft.anixartd.utils.TimeMeasuring;
import java.util.Comparator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

/* compiled from: Comparisons.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class TimeMeasuring$statistics$$inlined$sortedByDescending$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Pair pair = (Pair) t2;
        Objects.requireNonNull((TimeMeasuring.Measurement) pair.f63056c);
        Pair pair2 = (Pair) t;
        Objects.requireNonNull((TimeMeasuring.Measurement) pair2.f63056c);
        return ComparisonsKt.m32109b(0L, 0L);
    }
}
