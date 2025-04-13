package com.swiftsoft.anixartd.network.request;

import com.swiftsoft.anixartd.network.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DirectLinksRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/DirectLinksRequest;", "Lcom/swiftsoft/anixartd/network/Request;", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "fill", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class DirectLinksRequest extends Request {

    @NotNull
    private String url = "";

    @NotNull
    public final DirectLinksRequest fill(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        this.url = url;
        return this;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.url = str;
    }
}
