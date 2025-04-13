package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoBanner.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBanner;", "Ljava/io/Serializable;", "()V", "actionId", "", "getActionId", "()J", "setActionId", "(J)V", "image", "", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "isNew", "", "()Z", "setNew", "(Z)V", "name", "getName", "setName", "value", "getValue", "setValue", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoBanner implements Serializable {
    public static final long ACTION_URL = 1;
    public static final long ACTION_VIDEO_CATEGORY = 0;

    @JsonProperty("action_id")
    private long actionId;

    @JsonProperty("is_new")
    private boolean isNew;

    @NotNull
    private String name = "";

    @NotNull
    private String image = "";

    @NotNull
    private String value = "";

    public final long getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* renamed from: isNew, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public final void setActionId(long j2) {
        this.actionId = j2;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.image = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.name = str;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.value = str;
    }
}
