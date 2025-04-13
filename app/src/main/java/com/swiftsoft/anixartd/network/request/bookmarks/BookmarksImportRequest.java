package com.swiftsoft.anixartd.network.request.bookmarks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Request;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BookmarksImportRequest.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\fR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/bookmarks/BookmarksImportRequest;", "Lcom/swiftsoft/anixartd/network/Request;", "selectedImporterName", "", "watching", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "plans", "completed", "dropped", "holdOn", "(Ljava/lang/String;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;)V", "getCompleted", "()Ljava/util/HashSet;", "getDropped", "getHoldOn", "getPlans", "getSelectedImporterName", "()Ljava/lang/String;", "getWatching", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class BookmarksImportRequest extends Request {

    @NotNull
    private final HashSet<Long> completed;

    @NotNull
    private final HashSet<Long> dropped;

    @NotNull
    private final HashSet<Long> holdOn;

    @NotNull
    private final HashSet<Long> plans;

    @NotNull
    private final String selectedImporterName;

    @NotNull
    private final HashSet<Long> watching;

    public BookmarksImportRequest(@NotNull String selectedImporterName, @NotNull HashSet<Long> watching, @NotNull HashSet<Long> plans, @NotNull HashSet<Long> completed, @NotNull HashSet<Long> dropped, @NotNull HashSet<Long> holdOn) {
        Intrinsics.m32179h(selectedImporterName, "selectedImporterName");
        Intrinsics.m32179h(watching, "watching");
        Intrinsics.m32179h(plans, "plans");
        Intrinsics.m32179h(completed, "completed");
        Intrinsics.m32179h(dropped, "dropped");
        Intrinsics.m32179h(holdOn, "holdOn");
        this.selectedImporterName = selectedImporterName;
        this.watching = watching;
        this.plans = plans;
        this.completed = completed;
        this.dropped = dropped;
        this.holdOn = holdOn;
    }

    @NotNull
    public final HashSet<Long> getCompleted() {
        return this.completed;
    }

    @NotNull
    public final HashSet<Long> getDropped() {
        return this.dropped;
    }

    @NotNull
    public final HashSet<Long> getHoldOn() {
        return this.holdOn;
    }

    @NotNull
    public final HashSet<Long> getPlans() {
        return this.plans;
    }

    @JsonProperty("selected_importer_name")
    @NotNull
    public final String getSelectedImporterName() {
        return this.selectedImporterName;
    }

    @NotNull
    public final HashSet<Long> getWatching() {
        return this.watching;
    }
}
