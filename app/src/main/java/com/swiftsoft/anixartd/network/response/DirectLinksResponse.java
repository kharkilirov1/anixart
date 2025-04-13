package com.swiftsoft.anixartd.network.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: DirectLinksResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/DirectLinksResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "default", "", "getDefault", "()Ljava/lang/String;", "setDefault", "(Ljava/lang/String;)V", "q1080p", "getQ1080p", "setQ1080p", "q360p", "getQ360p", "setQ360p", "q480p", "getQ480p", "setQ480p", "q720p", "getQ720p", "setQ720p", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class DirectLinksResponse extends Response {

    @Nullable
    private String default;

    @JsonProperty("1080p")
    @Nullable
    private String q1080p;

    @JsonProperty("360p")
    @Nullable
    private String q360p;

    @JsonProperty("480p")
    @Nullable
    private String q480p;

    @JsonProperty("720p")
    @Nullable
    private String q720p;

    @Nullable
    public final String getDefault() {
        return this.default;
    }

    @Nullable
    public final String getQ1080p() {
        return this.q1080p;
    }

    @Nullable
    public final String getQ360p() {
        return this.q360p;
    }

    @Nullable
    public final String getQ480p() {
        return this.q480p;
    }

    @Nullable
    public final String getQ720p() {
        return this.q720p;
    }

    public final void setDefault(@Nullable String str) {
        this.default = str;
    }

    public final void setQ1080p(@Nullable String str) {
        this.q1080p = str;
    }

    public final void setQ360p(@Nullable String str) {
        this.q360p = str;
    }

    public final void setQ480p(@Nullable String str) {
        this.q480p = str;
    }

    public final void setQ720p(@Nullable String str) {
        this.q720p = str;
    }
}
