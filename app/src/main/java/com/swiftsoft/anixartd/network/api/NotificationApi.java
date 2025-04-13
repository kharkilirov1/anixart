package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification;
import com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification;
import com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.notifications.NotificationCountResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: NotificationApi.kt */
@Metadata(m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006!"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/NotificationApi;", "", "collectionComments", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/notification/collection/ProfileCollectionCommentNotification;", "page", "", FirebaseMessagingService.EXTRA_TOKEN, "", "count", "Lcom/swiftsoft/anixartd/network/response/notifications/NotificationCountResponse;", "deleteAll", "Lcom/swiftsoft/anixartd/network/Response;", "deleteCollectionCommentNotification", "id", "", "deleteEpisodeNotification", "deleteFriendNotification", "deleteMyCollectionCommentNotification", "deleteRelatedReleaseNotification", "deleteReleaseCommentNotification", "episodes", "Lcom/swiftsoft/anixartd/database/entity/notification/episode/ProfileEpisodeNotification;", "friends", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification;", "myCollectionComments", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileMyCollectionCommentNotification;", "read", "relatedReleases", "Lcom/swiftsoft/anixartd/database/entity/notification/related/ProfileRelatedReleaseNotification;", "releaseComments", "Lcom/swiftsoft/anixartd/database/entity/notification/release/ProfileReleaseCommentNotification;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface NotificationApi {
    @GET("notification/collectionComments/{page}")
    @NotNull
    Observable<PageableResponse<ProfileCollectionCommentNotification>> collectionComments(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("notification/count")
    @NotNull
    Observable<NotificationCountResponse> count(@NotNull @Query("token") String token);

    @GET("notification/delete/all")
    @NotNull
    Observable<Response> deleteAll(@NotNull @Query("token") String token);

    @GET("notification/collectionComment/delete/{id}")
    @NotNull
    Observable<Response> deleteCollectionCommentNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/episode/delete/{id}")
    @NotNull
    Observable<Response> deleteEpisodeNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/friend/delete/{id}")
    @NotNull
    Observable<Response> deleteFriendNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/my/collection/comment/delete/{id}")
    @NotNull
    Observable<Response> deleteMyCollectionCommentNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/related/release/delete/{id}")
    @NotNull
    Observable<Response> deleteRelatedReleaseNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/releaseComment/delete/{id}")
    @NotNull
    Observable<Response> deleteReleaseCommentNotification(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("notification/episodes/{page}")
    @NotNull
    Observable<PageableResponse<ProfileEpisodeNotification>> episodes(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("notification/friends/{page}")
    @NotNull
    Observable<PageableResponse<ProfileFriendNotification>> friends(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("notification/my/collection/comments/{page}")
    @NotNull
    Observable<PageableResponse<ProfileMyCollectionCommentNotification>> myCollectionComments(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("notification/read")
    @NotNull
    Observable<Response> read(@NotNull @Query("token") String token);

    @GET("notification/related/release/{page}")
    @NotNull
    Observable<PageableResponse<ProfileRelatedReleaseNotification>> relatedReleases(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("notification/releaseComments/{page}")
    @NotNull
    Observable<PageableResponse<ProfileReleaseCommentNotification>> releaseComments(@Path("page") int page, @NotNull @Query("token") String token);
}
