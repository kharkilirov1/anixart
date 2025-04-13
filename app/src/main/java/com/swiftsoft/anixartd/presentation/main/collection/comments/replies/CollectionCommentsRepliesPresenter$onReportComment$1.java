package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentReportResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: CollectionCommentsRepliesPresenter.kt */
@Metadata(m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "response", "Lcom/swiftsoft/anixartd/network/response/collection/comment/CollectionCommentReportResponse;", "kotlin.jvm.PlatformType", "invoke"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class CollectionCommentsRepliesPresenter$onReportComment$1 extends Lambda implements Function1<CollectionCommentReportResponse, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(CollectionCommentReportResponse collectionCommentReportResponse) {
        if (collectionCommentReportResponse.isSuccess()) {
            throw null;
        }
        return Unit.f63088a;
    }
}
