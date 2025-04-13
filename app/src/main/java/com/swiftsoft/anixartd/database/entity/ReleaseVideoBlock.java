package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideoBlock.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBlock;", "Ljava/io/Serializable;", "()V", "category", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;", "getCategory", "()Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;", "setCategory", "(Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;)V", "videos", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "getVideos", "()Ljava/util/List;", "setVideos", "(Ljava/util/List;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoBlock implements Serializable {

    @Nullable
    private ReleaseVideoCategory category;

    @NotNull
    private List<? extends ReleaseVideo> videos = EmptyList.f63144b;

    @Nullable
    public final ReleaseVideoCategory getCategory() {
        return this.category;
    }

    @NotNull
    public final List<ReleaseVideo> getVideos() {
        return this.videos;
    }

    public final void setCategory(@Nullable ReleaseVideoCategory releaseVideoCategory) {
        this.category = releaseVideoCategory;
    }

    public final void setVideos(@NotNull List<? extends ReleaseVideo> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.videos = list;
    }
}
