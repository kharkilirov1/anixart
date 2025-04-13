package com.swiftsoft.anixartd.network.request.collection.comment;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionCommentAddRequest.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/collection/comment/CollectionCommentAddRequest;", "", "parentCommentId", "", "replyToProfileId", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "spoiler", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getParentCommentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReplyToProfileId", "getSpoiler", "()Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionCommentAddRequest {

    @NotNull
    private final String message;

    @Nullable
    private final Long parentCommentId;

    @Nullable
    private final Long replyToProfileId;
    private final boolean spoiler;

    public CollectionCommentAddRequest(@Nullable Long l2, @Nullable Long l3, @NotNull String message, boolean z) {
        Intrinsics.m32179h(message, "message");
        this.parentCommentId = l2;
        this.replyToProfileId = l3;
        this.message = message;
        this.spoiler = z;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Long getParentCommentId() {
        return this.parentCommentId;
    }

    @Nullable
    public final Long getReplyToProfileId() {
        return this.replyToProfileId;
    }

    public final boolean getSpoiler() {
        return this.spoiler;
    }

    public /* synthetic */ CollectionCommentAddRequest(Long l2, Long l3, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l2, (i2 & 2) != 0 ? null : l3, str, z);
    }
}
