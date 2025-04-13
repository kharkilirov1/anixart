package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.p023ob.C3298Fg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zg */
/* loaded from: classes2.dex */
public final class C3797Zg {

    /* renamed from: a */
    private final C3304Fm<C3298Fg.a, Integer> f44678a;

    /* renamed from: b */
    private final long f44679b;

    /* renamed from: c */
    private final String f44680c;

    /* renamed from: d */
    private final String f44681d;

    /* renamed from: e */
    private final Context f44682e;

    /* renamed from: f */
    private final C3729Wn f44683f;

    /* renamed from: g */
    private final InterfaceC3706W0 f44684g;

    /* renamed from: com.yandex.metrica.impl.ob.Zg$a */
    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.m32109b((Comparable) ((Pair) t).f63056c, (Comparable) ((Pair) t2).f63056c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zg$b */
    public static final class b<T> implements Comparator<C3298Fg> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(C3298Fg c3298Fg, C3298Fg c3298Fg2) {
            int m32221a = MathKt.m32221a(c3298Fg.f42911c - c3298Fg2.f42911c);
            if (m32221a != 0) {
                return m32221a;
            }
            int intValue = ((Number) C3797Zg.this.f44678a.m18113a(c3298Fg.f42912d)).intValue();
            Object m18113a = C3797Zg.this.f44678a.m18113a(c3298Fg2.f42912d);
            Intrinsics.m32178g(m18113a, "sourcePriorities[second.source]");
            return intValue - ((Number) m18113a).intValue();
        }
    }

    public C3797Zg(@NotNull Context context, @NotNull C3729Wn c3729Wn, @NotNull InterfaceC3706W0 interfaceC3706W0) {
        this.f44682e = context;
        this.f44683f = c3729Wn;
        this.f44684g = interfaceC3706W0;
        C3304Fm<C3298Fg.a, Integer> c3304Fm = new C3304Fm<>(0);
        c3304Fm.m18115a(C3298Fg.a.HMS, 1);
        c3304Fm.m18115a(C3298Fg.a.GP, 2);
        this.f44678a = c3304Fm;
        this.f44679b = TimeUnit.DAYS.toSeconds(1L);
        this.f44680c = "com.android.vending";
        this.f44681d = "com.huawei.appmarket";
    }

    /* renamed from: c */
    private final JSONObject m19519c(C3298Fg c3298Fg) {
        JSONObject put = new JSONObject().put("referrer", c3298Fg.f42909a).put("install_timestamp_seconds", c3298Fg.f42911c).put("click_timestamp_seconds", c3298Fg.f42910b).put("source", c3298Fg.f42912d.f42917a);
        Intrinsics.m32178g(put, "JSONObject()\n           …eferrerInfo.source.value)");
        return put;
    }

    /* renamed from: b */
    public final boolean m19522b(@Nullable C3298Fg c3298Fg) {
        String str = c3298Fg != null ? c3298Fg.f42909a : null;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: a */
    public final boolean m19521a(@Nullable C3298Fg c3298Fg) {
        if (c3298Fg == null) {
            return false;
        }
        C3729Wn c3729Wn = this.f44683f;
        Context context = this.f44682e;
        String packageName = context.getPackageName();
        Objects.requireNonNull(c3729Wn);
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            str = C3658U2.m19211a(30) ? C3754Xn.m19409a(packageManager, packageName) : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable unused) {
        }
        int ordinal = c3298Fg.f42912d.ordinal();
        if (ordinal == 1) {
            return Intrinsics.m32174c(this.f44680c, str);
        }
        if (ordinal != 2) {
            return false;
        }
        return Intrinsics.m32174c(this.f44681d, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3797Zg(android.content.Context r1, com.yandex.metrica.impl.p023ob.C3729Wn r2, com.yandex.metrica.impl.p023ob.InterfaceC3706W0 r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r3 = 0
            if (r2 == 0) goto Lb
            com.yandex.metrica.impl.ob.Wn r2 = new com.yandex.metrica.impl.ob.Wn
            r2.<init>()
            goto Lc
        Lb:
            r2 = r3
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L19
            com.yandex.metrica.impl.ob.W0 r3 = com.yandex.metrica.impl.p023ob.C3524Oh.m18679a()
            java.lang.String r4 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r4)
        L19:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3797Zg.<init>(android.content.Context, com.yandex.metrica.impl.ob.Wn, com.yandex.metrica.impl.ob.W0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: a */
    public final C3298Fg m19520a(@NotNull List<C3298Fg> list) {
        C3298Fg c3298Fg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C3729Wn c3729Wn = this.f44683f;
        Context context = this.f44682e;
        PackageInfo m19373b = c3729Wn.m19373b(context, context.getPackageName(), 0);
        if (m19373b != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(m19373b.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C3298Fg c3298Fg2 = (C3298Fg) it.next();
                Pair pair = new Pair(c3298Fg2, Long.valueOf(Math.abs(c3298Fg2.f42911c - seconds)));
                while (it.hasNext()) {
                    C3298Fg c3298Fg3 = (C3298Fg) it.next();
                    Pair pair2 = new Pair(c3298Fg3, Long.valueOf(Math.abs(c3298Fg3.f42911c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                C3298Fg c3298Fg4 = (C3298Fg) pair.f63055b;
                if (((Number) pair.f63056c).longValue() < this.f44679b) {
                    c3298Fg = c3298Fg4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (c3298Fg == null) {
            b bVar = new b();
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C3298Fg c3298Fg5 = (C3298Fg) it2.next();
            while (it2.hasNext()) {
                C3298Fg c3298Fg6 = (C3298Fg) it2.next();
                if (bVar.compare(c3298Fg5, c3298Fg6) < 0) {
                    c3298Fg5 = c3298Fg6;
                }
            }
            c3298Fg = c3298Fg5;
        }
        this.f44684g.reportEvent("several_filled_referrers", m19518a(list, c3298Fg, m19373b).toString());
        return c3298Fg;
    }

    /* renamed from: a */
    private final JSONObject m19518a(List<C3298Fg> list, C3298Fg c3298Fg, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m19519c((C3298Fg) it.next()));
        }
        JSONObject putOpt = jSONObject.put("candidates", C4452ym.m21257b((List<?>) arrayList)).put("chosen", m19519c(c3298Fg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        Intrinsics.m32178g(putOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return putOpt;
    }
}
