package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a */
/* loaded from: classes3.dex */
public final class C4785a {

    /* renamed from: a */
    @NotNull
    private final i91 f48276a;

    public C4785a(@NotNull i91 urlUtils) {
        Intrinsics.m32179h(urlUtils, "urlUtils");
        this.f48276a = urlUtils;
    }

    /* renamed from: a */
    public final boolean m22336a(@Nullable String str) {
        List<String> list;
        Objects.requireNonNull(this.f48276a);
        String str2 = null;
        try {
            list = Uri.parse(str).getPathSegments();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            str2 = list.get(0);
        }
        return Intrinsics.m32174c("appcry", str2);
    }
}
