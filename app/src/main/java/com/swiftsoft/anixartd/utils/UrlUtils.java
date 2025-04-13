package com.swiftsoft.anixartd.utils;

import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UrlUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/UrlUtils;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UrlUtils {

    /* renamed from: a */
    @NotNull
    public static final UrlUtils f30249a = new UrlUtils();

    @Nullable
    /* renamed from: a */
    public final String m16366a(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        URI uri = new URI(url);
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
    }
}
