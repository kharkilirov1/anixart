package com.swiftsoft.anixartd.network.response;

import com.swiftsoft.anixartd.database.entity.Related;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseSearchResponse.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/ReleaseSearchResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "related", "Lcom/swiftsoft/anixartd/database/entity/Related;", "getRelated", "()Lcom/swiftsoft/anixartd/database/entity/Related;", "setRelated", "(Lcom/swiftsoft/anixartd/database/entity/Related;)V", "releases", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getReleases", "()Ljava/util/List;", "setReleases", "(Ljava/util/List;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseSearchResponse extends Response {

    @Nullable
    private Related related;

    @NotNull
    private List<Release> releases = EmptyList.f63144b;

    @Nullable
    public final Related getRelated() {
        return this.related;
    }

    @NotNull
    public final List<Release> getReleases() {
        return this.releases;
    }

    public final void setRelated(@Nullable Related related) {
        this.related = related;
    }

    public final void setReleases(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.releases = list;
    }
}
