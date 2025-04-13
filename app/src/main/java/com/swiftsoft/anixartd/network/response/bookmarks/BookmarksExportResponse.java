package com.swiftsoft.anixartd.network.response.bookmarks;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: BookmarksExportResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/bookmarks/BookmarksExportResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "releases", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getReleases", "()Ljava/util/List;", "setReleases", "(Ljava/util/List;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class BookmarksExportResponse extends Response {
    public static final int INVALID_EXTRA_FIELDS = 3;
    public static final int INVALID_PROFILE_LISTS = 2;

    @Nullable
    private List<Release> releases;

    @Nullable
    public final List<Release> getReleases() {
        return this.releases;
    }

    public final void setReleases(@Nullable List<Release> list) {
        this.releases = list;
    }
}
