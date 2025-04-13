package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CommentVotesApi.kt */
@Metadata(m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJC\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/CommentVotesApi;", "", "collectionCommentVotes", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "commentId", "", "page", "", "sort", FirebaseMessagingService.EXTRA_TOKEN, "", "(JILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "releaseCommentVotes", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface CommentVotesApi {
    @GET("/collection/comment/votes/{commentId}/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> collectionCommentVotes(@Path("commentId") long commentId, @Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);

    @GET("/release/comment/votes/{commentId}/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> releaseCommentVotes(@Path("commentId") long commentId, @Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);
}
