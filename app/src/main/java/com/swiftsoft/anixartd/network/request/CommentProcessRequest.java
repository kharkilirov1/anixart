package com.swiftsoft.anixartd.network.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommentProcessRequest.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0013\u0010\t\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/CommentProcessRequest;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "banReason", "banExpires", "", "isSpoiler", "", "isDeleted", "isBanned", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZZ)V", "getBanExpires", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBanReason", "()Ljava/lang/String;", "()Z", "getMessage", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CommentProcessRequest {

    @Nullable
    private final Long banExpires;

    @Nullable
    private final String banReason;
    private final boolean isBanned;
    private final boolean isDeleted;
    private final boolean isSpoiler;

    @NotNull
    private final String message;

    public CommentProcessRequest(@NotNull String message, @Nullable String str, @Nullable Long l2, boolean z, boolean z2, boolean z3) {
        Intrinsics.m32179h(message, "message");
        this.message = message;
        this.banReason = str;
        this.banExpires = l2;
        this.isSpoiler = z;
        this.isDeleted = z2;
        this.isBanned = z3;
    }

    @Nullable
    public final Long getBanExpires() {
        return this.banExpires;
    }

    @Nullable
    public final String getBanReason() {
        return this.banReason;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @JsonProperty("is_banned")
    /* renamed from: isBanned, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }

    @JsonProperty("is_deleted")
    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @JsonProperty("is_spoiler")
    /* renamed from: isSpoiler, reason: from getter */
    public final boolean getIsSpoiler() {
        return this.isSpoiler;
    }
}
