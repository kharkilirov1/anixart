package com.swiftsoft.anixartd.network.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TorlookPageableResponse.kt */
@Metadata(m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006&"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/TorlookPageableResponse;", "T", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "content", "", "getContent", "()Ljava/util/List;", "setContent", "(Ljava/util/List;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "needForce", "", "getNeedForce", "()Z", "setNeedForce", "(Z)V", "resultDate", "", "getResultDate", "()Ljava/lang/String;", "setResultDate", "(Ljava/lang/String;)V", "totalCount", "", "getTotalCount", "()J", "setTotalCount", "(J)V", "totalPageCount", "getTotalPageCount", "setTotalPageCount", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public class TorlookPageableResponse<T> extends Response {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INVALID_QUERY = 0;

    @JsonProperty("current_page")
    private int currentPage;

    @JsonProperty("need_force")
    private boolean needForce;

    @JsonProperty("total_count")
    private long totalCount;

    @JsonProperty("total_page_count")
    private int totalPageCount;

    @NotNull
    private List<? extends T> content = EmptyList.f63144b;

    @JsonProperty("result_date")
    @NotNull
    private String resultDate = "";

    /* compiled from: TorlookPageableResponse.kt */
    @Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/TorlookPageableResponse$Companion;", "", "()V", "INVALID_QUERY", "", "failed", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "T", "code", "successful", "content", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PageableResponse failed$default(Companion companion, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = 1;
            }
            return companion.failed(i2);
        }

        @NotNull
        public final <T> PageableResponse<T> failed(int code) {
            PageableResponse<T> pageableResponse = new PageableResponse<>();
            pageableResponse.setCode(code);
            return pageableResponse;
        }

        @NotNull
        public final <T> PageableResponse<T> successful(@NotNull List<? extends T> content) {
            Intrinsics.m32179h(content, "content");
            PageableResponse<T> pageableResponse = new PageableResponse<>();
            pageableResponse.setContent(content);
            return pageableResponse;
        }
    }

    @NotNull
    public final List<T> getContent() {
        return this.content;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getNeedForce() {
        return this.needForce;
    }

    @NotNull
    public final String getResultDate() {
        return this.resultDate;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final int getTotalPageCount() {
        return this.totalPageCount;
    }

    public final void setContent(@NotNull List<? extends T> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.content = list;
    }

    public final void setCurrentPage(int i2) {
        this.currentPage = i2;
    }

    public final void setNeedForce(boolean z) {
        this.needForce = z;
    }

    public final void setResultDate(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.resultDate = str;
    }

    public final void setTotalCount(long j2) {
        this.totalCount = j2;
    }

    public final void setTotalPageCount(int i2) {
        this.totalPageCount = i2;
    }
}
