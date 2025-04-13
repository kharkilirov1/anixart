package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interesting.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\u001fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Interesting;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "id", "getId", "()J", "setId", "(J)V", "image", "getImage", "setImage", "isHidden", "", "()Z", "setHidden", "(Z)V", "title", "getTitle", "setTitle", "type", "", "getType", "()I", "setType", "(I)V", "equals", "other", "", "hashCode", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class Interesting implements Identifiable<Long>, Serializable {

    @PrimaryKey
    private long id;
    private boolean isHidden;
    private int type;

    @NotNull
    private String title = "";

    @NotNull
    private String description = "";

    @NotNull
    private String image = "";

    @NotNull
    private String action = "";

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Interesting.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Interesting");
        Interesting interesting = (Interesting) other;
        return this.id == interesting.id && Intrinsics.m32174c(this.title, interesting.title) && Intrinsics.m32174c(this.description, interesting.description) && Intrinsics.m32174c(this.image, interesting.image) && this.type == interesting.type && Intrinsics.m32174c(this.action, interesting.action) && this.isHidden == interesting.isHidden;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
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

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.action = str;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.description = str;
    }

    public final void setHidden(boolean z) {
        this.isHidden = z;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.image = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i2) {
        this.type = i2;
    }
}
