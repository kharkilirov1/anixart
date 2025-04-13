package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class r41 {

    /* renamed from: a */
    @NotNull
    private final String f54184a = "id";

    /* renamed from: b */
    @NotNull
    private final String f54185b = "Ad";

    /* renamed from: c */
    @NotNull
    private final uj1 f54186c = new uj1();

    @Nullable
    /* renamed from: a */
    public final String m27833a(@NotNull XmlPullParser parser) {
        Intrinsics.m32179h(parser, "parser");
        uj1 uj1Var = this.f54186c;
        String str = this.f54185b;
        Objects.requireNonNull(uj1Var);
        uj1.m29033a(parser, str);
        String attributeValue = parser.getAttributeValue(null, this.f54184a);
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
