package com.swiftsoft.anixartd.database.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Torlook.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Torlook;", "", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "leechCount", "getLeechCount", "setLeechCount", "link", "getLink", "setLink", "magnetLink", "getMagnetLink", "setMagnetLink", "seedCount", "getSeedCount", "setSeedCount", "size", "getSize", "setSize", "title", "getTitle", "setTitle", "trackerDomain", "getTrackerDomain", "setTrackerDomain", "trackerIcon", "getTrackerIcon", "setTrackerIcon", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Torlook {

    @NotNull
    private String title = "";

    @NotNull
    private String link = "";

    @NotNull
    private String size = "";

    @NotNull
    private String date = "";

    @NotNull
    private String trackerDomain = "";

    @NotNull
    private String trackerIcon = "";

    @NotNull
    private String seedCount = "";

    @NotNull
    private String leechCount = "";

    @NotNull
    private String magnetLink = "";

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getLeechCount() {
        return this.leechCount;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getMagnetLink() {
        return this.magnetLink;
    }

    @NotNull
    public final String getSeedCount() {
        return this.seedCount;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTrackerDomain() {
        return this.trackerDomain;
    }

    @NotNull
    public final String getTrackerIcon() {
        return this.trackerIcon;
    }

    public final void setDate(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.date = str;
    }

    public final void setLeechCount(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.leechCount = str;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.link = str;
    }

    public final void setMagnetLink(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.magnetLink = str;
    }

    public final void setSeedCount(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.seedCount = str;
    }

    public final void setSize(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.size = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.title = str;
    }

    public final void setTrackerDomain(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.trackerDomain = str;
    }

    public final void setTrackerIcon(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.trackerIcon = str;
    }
}
