package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideoHosting.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoHosting;", "Ljava/io/Serializable;", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoHosting implements Serializable {
    private long id;

    @NotNull
    private String name = "";

    @Nullable
    private String icon = "";

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.name = str;
    }
}
