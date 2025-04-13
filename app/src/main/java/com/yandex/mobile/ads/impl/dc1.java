package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cc1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class dc1 {

    /* renamed from: d */
    @NotNull
    private static final List<String> f49628d = CollectionsKt.m31994G("ad_system", "social_ad_info", "yandex_ad_info");

    /* renamed from: a */
    @NotNull
    private final uj1 f49629a;

    /* renamed from: b */
    @NotNull
    private final e11 f49630b;

    /* renamed from: c */
    @NotNull
    private final sj1<j71> f49631c;

    public dc1() {
        uj1 uj1Var = new uj1();
        this.f49629a = uj1Var;
        this.f49630b = new e11(uj1Var);
        this.f49631c = m23868a();
    }

    @NotNull
    /* renamed from: a */
    public final cc1 m23869a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.m32179h(parser, "parser");
        Objects.requireNonNull(this.f49629a);
        uj1.m29033a(parser, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cc1.C4915a c4915a = new cc1.C4915a();
        while (true) {
            Objects.requireNonNull(this.f49629a);
            if (!uj1.m29034a(parser)) {
                c4915a.m23221a(arrayList2);
                c4915a.m23223b(arrayList);
                return c4915a.m23222a();
            }
            Objects.requireNonNull(this.f49629a);
            if (uj1.m29035b(parser)) {
                if (Intrinsics.m32174c("Extension", parser.getName())) {
                    String attributeValue = parser.getAttributeValue(null, "type");
                    if (f49628d.contains(attributeValue)) {
                        C5091ft mo22361a = this.f49630b.mo22361a(parser);
                        if (mo22361a != null) {
                            arrayList2.add(mo22361a);
                        }
                    } else if (Intrinsics.m32174c("yandex_tracking_events", attributeValue)) {
                        ArrayList mo22361a2 = this.f49631c.mo22361a(parser);
                        Intrinsics.m32178g(mo22361a2, "trackingEventsParser.parseElement(parser)");
                        arrayList.addAll(mo22361a2);
                    } else {
                        Objects.requireNonNull(this.f49629a);
                        uj1.m29037d(parser);
                    }
                } else {
                    Objects.requireNonNull(this.f49629a);
                    uj1.m29037d(parser);
                }
            }
        }
    }

    /* renamed from: a */
    private static sj1 m23868a() {
        return new sj1(new l71(), "Extension", "Tracking");
    }
}
