package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.se1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class le1 {

    /* renamed from: a */
    private final Context f52374a;

    /* renamed from: b */
    @NotNull
    private final sf1 f52375b;

    /* renamed from: c */
    @NotNull
    private final yf1 f52376c;

    public le1(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f52374a = context.getApplicationContext();
        this.f52375b = new sf1();
        this.f52376c = new yf1();
    }

    /* renamed from: a */
    public final void m26442a(@NotNull List<String> rawUrls, @Nullable Map<String, String> map) {
        Intrinsics.m32179h(rawUrls, "rawUrls");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(rawUrls, 10));
        for (String str : rawUrls) {
            boolean z = map != null;
            if (z) {
                Objects.requireNonNull(this.f52375b);
                str = sf1.m28244a(str, map);
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.m32178g(str, "when (macros != null) {\n…e -> rawUrl\n            }");
            arrayList.add(str);
        }
        Objects.requireNonNull(this.f52376c);
        Iterator it = yf1.m29938a(arrayList).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            se1.C5744a c5744a = se1.f54656c;
            Context applicationContext = this.f52374a;
            Intrinsics.m32178g(applicationContext, "applicationContext");
            c5744a.m28240a(applicationContext).m28239a(str2);
        }
    }
}
