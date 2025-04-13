package com.swiftsoft.anixartd.network.response.collection.comment;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionCommentAddResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/collection/comment/CollectionCommentAddResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "comment", "Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "getComment", "()Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "setComment", "(Lcom/swiftsoft/anixartd/database/entity/CollectionComment;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionCommentAddResponse extends Response {
    public static final int COMMENT_IS_TOO_LONG = 6;
    public static final int COMMENT_IS_TOO_SHORT = 5;
    public static final int COMMENT_LIMIT_REACHED = 7;
    public static final int COMMENT_NOT_FOUND = 3;
    public static final int EMBEDDABLE_NOT_FOUND = 2;
    public static final int IN_BLOCKLIST = 8;
    public static final int PROFILE_NOT_FOUND = 4;

    @Nullable
    private CollectionComment comment;

    @Nullable
    public final CollectionComment getComment() {
        return this.comment;
    }

    public final void setComment(@Nullable CollectionComment collectionComment) {
        this.comment = collectionComment;
    }
}
