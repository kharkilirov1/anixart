package com.swiftsoft.anixartd.network.request.collection;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CreateEditCollectionRequest.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/collection/CreateEditCollectionRequest;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "isPrivate", "", "()Z", "setPrivate", "(Z)V", "releases", "", "", "getReleases", "()Ljava/util/List;", "setReleases", "(Ljava/util/List;)V", "title", "getTitle", "setTitle", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CreateEditCollectionRequest {
    public String description;

    @JsonProperty("is_private")
    private boolean isPrivate;
    public List<Long> releases;
    public String title;

    @NotNull
    public final String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("description");
        throw null;
    }

    @NotNull
    public final List<Long> getReleases() {
        List<Long> list = this.releases;
        if (list != null) {
            return list;
        }
        Intrinsics.m32189r("releases");
        throw null;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("title");
        throw null;
    }

    /* renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.description = str;
    }

    public final void setPrivate(boolean z) {
        this.isPrivate = z;
    }

    public final void setReleases(@NotNull List<Long> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.releases = list;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.title = str;
    }
}
