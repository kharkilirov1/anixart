package com.swiftsoft.anixartd.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Quality.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Quality;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Quality {

    /* renamed from: a */
    @NotNull
    public static final Quality f30236a = new Quality();

    /* renamed from: b */
    @NotNull
    public static final List<String> f30237b = CollectionsKt.m31994G("Default", "360p", "480p", "720p", "1080p");

    /* renamed from: a */
    public final int m16353a(@NotNull List<String> qualityNames, @NotNull String selectedQuality) {
        Intrinsics.m32179h(qualityNames, "qualityNames");
        Intrinsics.m32179h(selectedQuality, "selectedQuality");
        if (qualityNames.contains(selectedQuality)) {
            return qualityNames.indexOf(selectedQuality);
        }
        System.out.println((Object) C0000a.m14k("quality doesn't exist => change quality from ", selectedQuality));
        int i2 = 0;
        IntProgression m32240g = RangesKt.m32240g(f30237b.indexOf(selectedQuality) - 1, 0);
        int i3 = m32240g.f63380b;
        int i4 = m32240g.f63381c;
        int i5 = m32240g.f63382d;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (true) {
                String str = f30237b.get(i3);
                if (!qualityNames.contains(str)) {
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                } else {
                    i2 = qualityNames.indexOf(str);
                    break;
                }
            }
        }
        StringBuilder m24u = C0000a.m24u("quality successfully changed => ");
        m24u.append(qualityNames.get(i2));
        System.out.println((Object) m24u.toString());
        return i2;
    }
}
