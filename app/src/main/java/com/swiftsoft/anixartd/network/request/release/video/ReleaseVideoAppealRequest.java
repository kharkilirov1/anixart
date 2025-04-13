package com.swiftsoft.anixartd.network.request.release.video;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoAppealRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/release/video/ReleaseVideoAppealRequest;", "", "releaseId", "", "title", "", "categoryId", "url", "(JLjava/lang/String;JLjava/lang/String;)V", "getCategoryId", "()J", "getReleaseId", "getTitle", "()Ljava/lang/String;", "getUrl", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoAppealRequest {
    private final long categoryId;
    private final long releaseId;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public ReleaseVideoAppealRequest(long j2, @NotNull String title, long j3, @NotNull String url) {
        Intrinsics.m32179h(title, "title");
        Intrinsics.m32179h(url, "url");
        this.releaseId = j2;
        this.title = title;
        this.categoryId = j3;
        this.url = url;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final long getReleaseId() {
        return this.releaseId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
