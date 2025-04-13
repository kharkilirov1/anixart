package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Related.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\"\u001a\u00020#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u00020\u00068GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u00020\u00028GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006$"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Related;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "id", "getId", "()J", "setId", "(J)V", "image", "getImage", "setImage", "images", "", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "name", "getName", "setName", "nameRu", "getNameRu", "setNameRu", "releaseCount", "getReleaseCount", "setReleaseCount", "isEmpty", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Related implements Identifiable<Long>, Serializable {

    @PrimaryKey
    private long id;

    @Nullable
    private List<String> images;
    private long releaseCount;

    @NotNull
    private String name = "";

    @NotNull
    private String nameRu = "";

    @Nullable
    private String description = "";

    @NotNull
    private String image = "";

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @JsonProperty("name_ru")
    @NotNull
    public final String getNameRu() {
        return this.nameRu;
    }

    @JsonProperty("release_count")
    public final long getReleaseCount() {
        return this.releaseCount;
    }

    public final boolean isEmpty() {
        if (this.name.length() == 0) {
            if (this.nameRu.length() == 0) {
                String str = this.description;
                if (str == null || str.length() == 0) {
                    if ((this.image.length() == 0) && this.releaseCount == 0) {
                        List<String> list = this.images;
                        if (list == null || list.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.image = str;
    }

    public final void setImages(@Nullable List<String> list) {
        this.images = list;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.name = str;
    }

    public final void setNameRu(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.nameRu = str;
    }

    public final void setReleaseCount(long j2) {
        this.releaseCount = j2;
    }
}
