package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.aq */
/* loaded from: classes3.dex */
public final class C4820aq {

    /* renamed from: a */
    @NotNull
    private final vv0 f48638a;

    /* renamed from: b */
    @NotNull
    private final f70 f48639b;

    public C4820aq(@NotNull Context context, @NotNull vv0 reporter, @NotNull f70 jsonConvertor) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(reporter, "reporter");
        Intrinsics.m32179h(jsonConvertor, "jsonConvertor");
        this.f48638a = reporter;
        this.f48639b = jsonConvertor;
    }

    /* renamed from: a */
    public final void m22614a(@NotNull Uri uri, @Nullable JSONObject jSONObject) {
        HashMap hashMap;
        Intrinsics.m32179h(uri, "uri");
        String queryParameter = uri.getQueryParameter("eventName");
        if (queryParameter != null) {
            if (queryParameter.length() == 0) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                if (jSONObject != null) {
                    Objects.requireNonNull(this.f48639b);
                    hashMap = f70.m24322a(jSONObject);
                } else {
                    hashMap = new HashMap();
                }
                this.f48638a.mo23876a(new sv0(queryParameter, hashMap));
            }
        }
    }

    public /* synthetic */ C4820aq(Context context) {
        this(context, C5730s8.m28078a(context), new f70());
    }
}
