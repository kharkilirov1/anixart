package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideo.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001e\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001a\u0010,\u001a\u00020-X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001c\u0010;\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R\u001a\u0010>\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&¨\u0006A"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "Ljava/io/Serializable;", "()V", "category", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;", "getCategory", "()Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;", "setCategory", "(Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;)V", "delete", "", "getDelete", "()Z", "setDelete", "(Z)V", "favoriteCount", "", "getFavoriteCount", "()I", "setFavoriteCount", "(I)V", "hosting", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoHosting;", "getHosting", "()Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoHosting;", "setHosting", "(Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoHosting;)V", "id", "", "getId", "()J", "setId", "(J)V", "image", "", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "isFavorite", "setFavorite", "playerUrl", "getPlayerUrl", "setPlayerUrl", "profile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "release", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getRelease", "()Lcom/swiftsoft/anixartd/database/entity/Release;", "setRelease", "(Lcom/swiftsoft/anixartd/database/entity/Release;)V", "timestamp", "getTimestamp", "setTimestamp", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public class ReleaseVideo implements Serializable {

    @Nullable
    private ReleaseVideoCategory category;

    @Ignore
    private boolean delete;

    @JsonProperty("favorites_count")
    private int favoriteCount;

    @Nullable
    private ReleaseVideoHosting hosting;
    private long id;

    @JsonProperty("is_favorite")
    private boolean isFavorite;
    public Profile profile;
    public Release release;
    private long timestamp;

    @Nullable
    private String title;

    @NotNull
    private String image = "";

    @NotNull
    private String url = "";

    @JsonProperty("player_url")
    @NotNull
    private String playerUrl = "";

    @Nullable
    public final ReleaseVideoCategory getCategory() {
        return this.category;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    public final int getFavoriteCount() {
        return this.favoriteCount;
    }

    @Nullable
    public final ReleaseVideoHosting getHosting() {
        return this.hosting;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getPlayerUrl() {
        return this.playerUrl;
    }

    @NotNull
    public final Profile getProfile() {
        Profile profile = this.profile;
        if (profile != null) {
            return profile;
        }
        Intrinsics.m32189r("profile");
        throw null;
    }

    @NotNull
    public final Release getRelease() {
        Release release = this.release;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final void setCategory(@Nullable ReleaseVideoCategory releaseVideoCategory) {
        this.category = releaseVideoCategory;
    }

    public final void setDelete(boolean z) {
        this.delete = z;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final void setFavoriteCount(int i2) {
        this.favoriteCount = i2;
    }

    public final void setHosting(@Nullable ReleaseVideoHosting releaseVideoHosting) {
        this.hosting = releaseVideoHosting;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.image = str;
    }

    public final void setPlayerUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.playerUrl = str;
    }

    public final void setProfile(@NotNull Profile profile) {
        Intrinsics.m32179h(profile, "<set-?>");
        this.profile = profile;
    }

    public final void setRelease(@NotNull Release release) {
        Intrinsics.m32179h(release, "<set-?>");
        this.release = release;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.url = str;
    }
}
