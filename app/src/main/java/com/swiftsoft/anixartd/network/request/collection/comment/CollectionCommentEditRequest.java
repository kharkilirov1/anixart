package com.swiftsoft.anixartd.network.request.collection.comment;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionCommentEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/collection/comment/CollectionCommentEditRequest;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "spoiler", "", "(Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getSpoiler", "()Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionCommentEditRequest {

    @NotNull
    private final String message;
    private final boolean spoiler;

    public CollectionCommentEditRequest(@NotNull String message, boolean z) {
        Intrinsics.m32179h(message, "message");
        this.message = message;
        this.spoiler = z;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSpoiler() {
        return this.spoiler;
    }
}
