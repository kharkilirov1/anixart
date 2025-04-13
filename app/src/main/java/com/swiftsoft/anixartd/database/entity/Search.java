package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Search.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u001d"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Search;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "id", "getId", "()J", "setId", "(J)V", "query", "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "tsLastRequest", "getTsLastRequest", "setTsLastRequest", "type", "getType", "setType", "equals", "", "other", "", "hashCode", "", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@Entity
/* loaded from: classes2.dex */
public final class Search implements Identifiable<Long>, Serializable {

    @NotNull
    public static final String TYPE_COLLECTION = "TYPE_COLLECTION";

    @NotNull
    public static final String TYPE_PROFILE = "TYPE_PROFILE";

    @NotNull
    public static final String TYPE_RELEASE = "TYPE_RELEASE";

    @PrimaryKey
    private long id;
    private long tsLastRequest;

    @NotNull
    private String type = "";

    @NotNull
    private String query = "";

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Search.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Search");
        Search search = (Search) other;
        return this.id == search.id && Intrinsics.m32174c(this.query, search.query);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final long getTsLastRequest() {
        return this.tsLastRequest;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setQuery(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.query = str;
    }

    public final void setTsLastRequest(long j2) {
        this.tsLastRequest = j2;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.type = str;
    }
}
