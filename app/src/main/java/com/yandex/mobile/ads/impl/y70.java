package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x70;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class y70 {

    /* renamed from: a */
    @NotNull
    private final C5012eb f56681a;

    /* renamed from: b */
    @NotNull
    private final uj1 f56682b;

    /* renamed from: c */
    @NotNull
    private final b80 f56683c;

    public y70(@NotNull C5012eb assetsJsonParser) {
        Intrinsics.m32179h(assetsJsonParser, "assetsJsonParser");
        this.f56681a = assetsJsonParser;
        this.f56682b = new uj1();
        this.f56683c = new b80();
    }

    @NotNull
    /* renamed from: a */
    public final x70 m29868a(@NotNull XmlPullParser parser) throws JSONException {
        Intrinsics.m32179h(parser, "parser");
        try {
            x70.C6010a c6010a = new x70.C6010a();
            Objects.requireNonNull(this.f56682b);
            String m29036c = uj1.m29036c(parser);
            Intrinsics.m32178g(m29036c, "xmlHelper.parseText(parser)");
            JSONObject jSONObject = new JSONObject(m29036c);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (Intrinsics.m32174c("assets", next)) {
                    c6010a.m29686a(this.f56681a.m24052a(jSONObject));
                } else if (Intrinsics.m32174c("link", next)) {
                    a80 m22740a = this.f56683c.m22740a(jSONObject.getJSONObject(next));
                    Intrinsics.m32178g(m22740a, "linkJsonParser.parseLink(jsonLink)");
                    c6010a.m29685a(m22740a);
                }
            }
            return c6010a.m29684a();
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage());
        }
    }
}
