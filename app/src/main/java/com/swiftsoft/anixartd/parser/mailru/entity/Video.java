package com.swiftsoft.anixartd.parser.mailru.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Video.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/mailru/entity/Video;", "", "key", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getUrl", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Video {

    @NotNull
    private final String key;

    @NotNull
    private final String url;

    public Video(@JsonProperty("key") @NotNull String key, @JsonProperty("url") @NotNull String url) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(url, "url");
        this.key = key;
        this.url = url;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
