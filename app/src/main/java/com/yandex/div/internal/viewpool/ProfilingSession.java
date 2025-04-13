package com.yandex.div.internal.viewpool;

import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfilingSession.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ProfilingSession;", "", "Accumulator", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ProfilingSession {

    /* renamed from: a */
    @NotNull
    public final Accumulator f33919a = new Accumulator();

    /* renamed from: b */
    @NotNull
    public final Accumulator f33920b = new Accumulator();

    /* renamed from: c */
    @NotNull
    public final ArrayMap<String, Accumulator> f33921c = new ArrayMap<>();

    /* compiled from: ProfilingSession.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ProfilingSession$Accumulator;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Accumulator {

        /* renamed from: a */
        public long f33922a;

        /* renamed from: b */
        public int f33923b;

        /* renamed from: a */
        public final void m17404a() {
            this.f33922a = 0L;
            this.f33923b = 0;
        }
    }

    /* compiled from: ProfilingSession.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ProfilingSession$Companion;", "", "", "LONG_OPERATION_THRESHOLD_NS", "J", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m17402a() {
        HashMap hashMap = new HashMap();
        hashMap.put("view obtaining - total count", Integer.valueOf(this.f33919a.f33923b));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(ProfilingSessionKt.m17405a(this.f33919a.f33922a / 1000)));
        Iterator<Map.Entry<String, Accumulator>> it = this.f33921c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Accumulator> next = it.next();
            String key = next.getKey();
            Accumulator value = next.getValue();
            if (value.f33923b > 0) {
                hashMap.put("blocking view obtaining for " + ((Object) key) + " - count", Integer.valueOf(value.f33923b));
                String str = "blocking view obtaining for " + ((Object) key) + " - avg time (µs)";
                int i2 = value.f33923b;
                hashMap.put(str, Long.valueOf(ProfilingSessionKt.m17405a((i2 != 0 ? value.f33922a / i2 : 0L) / 1000)));
            }
        }
        int i3 = this.f33920b.f33923b;
        if (i3 > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(i3));
            Accumulator accumulator = this.f33920b;
            int i4 = accumulator.f33923b;
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(ProfilingSessionKt.m17405a((i4 != 0 ? accumulator.f33922a / i4 : 0L) / 1000)));
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void m17403b(@NotNull String str, long j2) {
        Accumulator accumulator = this.f33919a;
        accumulator.f33922a += j2;
        accumulator.f33923b++;
        ArrayMap<String, Accumulator> arrayMap = this.f33921c;
        Accumulator accumulator2 = arrayMap.get(str);
        if (accumulator2 == null) {
            accumulator2 = new Accumulator();
            arrayMap.put(str, accumulator2);
        }
        Accumulator accumulator3 = accumulator2;
        accumulator3.f33922a += j2;
        accumulator3.f33923b++;
    }
}
