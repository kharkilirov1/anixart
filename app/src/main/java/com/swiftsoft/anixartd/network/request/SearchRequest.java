package com.swiftsoft.anixartd.network.request;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SearchRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/SearchRequest;", "", "query", "", "searchBy", "", "(Ljava/lang/String;I)V", "getQuery", "()Ljava/lang/String;", "getSearchBy", "()I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SearchRequest {

    @NotNull
    private final String query;
    private final int searchBy;

    public SearchRequest(@NotNull String query, int i2) {
        Intrinsics.m32179h(query, "query");
        this.query = query;
        this.searchBy = i2;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final int getSearchBy() {
        return this.searchBy;
    }

    public /* synthetic */ SearchRequest(String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i2);
    }
}
