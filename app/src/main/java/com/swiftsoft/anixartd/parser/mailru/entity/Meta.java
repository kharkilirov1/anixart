package com.swiftsoft.anixartd.parser.mailru.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Meta.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/mailru/entity/Meta;", "", "videos", "", "Lcom/swiftsoft/anixartd/parser/mailru/entity/Video;", "(Ljava/util/List;)V", "getVideos", "()Ljava/util/List;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Meta {

    @NotNull
    private final List<Video> videos;

    /* JADX WARN: Multi-variable type inference failed */
    public Meta() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Meta(@JsonProperty("videos") @NotNull List<Video> videos) {
        Intrinsics.m32179h(videos, "videos");
        this.videos = videos;
    }

    @NotNull
    public final List<Video> getVideos() {
        return this.videos;
    }

    public /* synthetic */ Meta(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmptyList.f63144b : list);
    }
}
