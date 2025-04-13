package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.CommentProcessRequest;
import com.swiftsoft.anixartd.network.request.release.comment.ReleaseCommentAddRequest;
import com.swiftsoft.anixartd.network.request.release.comment.ReleaseCommentEditRequest;
import com.swiftsoft.anixartd.network.request.release.comment.ReleaseCommentReportRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentAddResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentEditResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentReportResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ReleaseCommentApi.kt */
@Metadata(m31883d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH'J<\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\nH'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\t\u001a\u00020\nH'J<\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\nH'J<\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\nH'¨\u0006%"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseCommentApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/comment/ReleaseCommentAddResponse;", "releaseId", "", "releaseCommentAddRequest", "Lcom/swiftsoft/anixartd/network/request/release/comment/ReleaseCommentAddRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "comment", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "comments", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "page", "", "sort", "delete", "Lcom/swiftsoft/anixartd/network/response/release/comment/ReleaseCommentDeleteResponse;", "commentId", "edit", "Lcom/swiftsoft/anixartd/network/response/release/comment/ReleaseCommentEditResponse;", "commentEditRequest", "Lcom/swiftsoft/anixartd/network/request/release/comment/ReleaseCommentEditRequest;", "process", "Lcom/swiftsoft/anixartd/network/Response;", "commentProcessRequest", "Lcom/swiftsoft/anixartd/network/request/CommentProcessRequest;", "profileComments", "profileId", "replies", "report", "Lcom/swiftsoft/anixartd/network/response/release/comment/ReleaseCommentReportResponse;", "releaseCommentReportRequest", "Lcom/swiftsoft/anixartd/network/request/release/comment/ReleaseCommentReportRequest;", "vote", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseCommentApi {
    @POST("release/comment/add/{releaseId}")
    @NotNull
    Observable<ReleaseCommentAddResponse> add(@Path("releaseId") long releaseId, @Body @NotNull ReleaseCommentAddRequest releaseCommentAddRequest, @NotNull @Query("token") String token);

    @GET("release/comment/{releaseId}")
    @NotNull
    Observable<ReleaseComment> comment(@Path("releaseId") long releaseId, @NotNull @Query("token") String token);

    @GET("release/comment/all/{releaseId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseComment>> comments(@Path("releaseId") long releaseId, @Path("page") int page, @Query("sort") int sort, @NotNull @Query("token") String token);

    @GET("release/comment/delete/{commentId}")
    @NotNull
    Observable<ReleaseCommentDeleteResponse> delete(@Path("commentId") long commentId, @NotNull @Query("token") String token);

    @POST("release/comment/edit/{commentId}")
    @NotNull
    Observable<ReleaseCommentEditResponse> edit(@Path("commentId") long commentId, @Body @NotNull ReleaseCommentEditRequest commentEditRequest, @NotNull @Query("token") String token);

    @POST("release/comment/process/{commentId}")
    @NotNull
    Observable<Response> process(@Path("commentId") long commentId, @Body @NotNull CommentProcessRequest commentProcessRequest, @NotNull @Query("token") String token);

    @GET("release/comment/all/profile/{p_id}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseComment>> profileComments(@Path("p_id") long profileId, @Path("page") int page, @Query("sort") int sort, @NotNull @Query("token") String token);

    @POST("release/comment/replies/{commentId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseComment>> replies(@Path("commentId") long commentId, @Path("page") int page, @Query("sort") int sort, @NotNull @Query("token") String token);

    @POST("release/comment/report/{commentId}")
    @NotNull
    Observable<ReleaseCommentReportResponse> report(@Path("commentId") long commentId, @Body @NotNull ReleaseCommentReportRequest releaseCommentReportRequest, @NotNull @Query("token") String token);

    @GET("release/comment/vote/{commentId}/{vote}")
    @NotNull
    Observable<Response> vote(@Path("commentId") long commentId, @Path("vote") int vote, @NotNull @Query("token") String token);
}
