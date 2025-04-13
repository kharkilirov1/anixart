package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoCategory.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoCategory;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoCategory implements Serializable {
    private long id;

    @NotNull
    private String name = "";

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.name = str;
    }
}
