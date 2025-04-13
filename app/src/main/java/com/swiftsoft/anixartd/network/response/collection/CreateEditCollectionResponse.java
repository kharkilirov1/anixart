package com.swiftsoft.anixartd.network.response.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: CreateEditCollectionResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/collection/CreateEditCollectionResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "collection", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "getCollection", "()Lcom/swiftsoft/anixartd/database/entity/Collection;", "setCollection", "(Lcom/swiftsoft/anixartd/database/entity/Collection;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CreateEditCollectionResponse extends Response {
    public static final int COLLECTION_DELETED = 8;
    public static final int COLLECTION_LIMIT_REACHED = 5;
    public static final int COLLECTION_NOT_FOUND = 6;
    public static final int COLLECTION_NOT_OWNED = 7;
    public static final int INVALID_DESCRIPTION = 3;
    public static final int INVALID_RELEASES = 4;
    public static final int INVALID_TITLE = 2;
    public static final int RELEASE_LIMIT_REACHED = 9;

    @Nullable
    private Collection collection;

    @Nullable
    public final Collection getCollection() {
        return this.collection;
    }

    public final void setCollection(@Nullable Collection collection) {
        this.collection = collection;
    }
}
