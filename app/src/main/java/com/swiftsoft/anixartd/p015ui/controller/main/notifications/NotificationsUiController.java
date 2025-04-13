package com.swiftsoft.anixartd.p015ui.controller.main.notifications;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification;
import com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification;
import com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification;
import com.swiftsoft.anixartd.epoxy.Typed8EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.ExtraNotificationsModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.ExtraNotificationsModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationCollectionCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationCollectionCommentModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationsDisabledModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationsDisabledModel_;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationsPushDisabledModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: NotificationsUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u000028\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0007JN\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J\u0006\u0010\u0012\u001a\u00020\u0005¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/notifications/NotificationsUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed8EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/notifications/NotificationsUiController$Listener;", "()V", "buildModels", "", "profileNotifications", "filterSelected", "isPushNotificationsEnabled", "isEpisodeNotificationsEnabled", "isCommentNotificationsEnabled", "isMyCollectionCommentNotificationsEnabled", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class NotificationsUiController extends Typed8EpoxyController<List<? extends ProfileNotification>, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Listener> {

    /* compiled from: NotificationsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/notifications/NotificationsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/ExtraNotificationsModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationsDisabledModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationFriendModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationEpisodeModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseCommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationCollectionCommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ExtraNotificationsModel.Listener, NotificationsDisabledModel.Listener, NotificationFriendModel.Listener, NotificationEpisodeModel.Listener, NotificationReleaseCommentModel.Listener, NotificationCollectionCommentModel.Listener, NotificationReleaseModel.Listener {
    }

    public NotificationsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$7$lambda$6(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed8EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ProfileNotification> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Listener listener) {
        buildModels(list, num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<? extends ProfileNotification> profileNotifications, int filterSelected, boolean isPushNotificationsEnabled, boolean isEpisodeNotificationsEnabled, boolean isCommentNotificationsEnabled, boolean isMyCollectionCommentNotificationsEnabled, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(profileNotifications, "profileNotifications");
        Intrinsics.m32179h(listener, "listener");
        ExtraNotificationsModel_ extraNotificationsModel_ = new ExtraNotificationsModel_();
        extraNotificationsModel_.m4520h2("extraNotifications");
        extraNotificationsModel_.m4524l2();
        extraNotificationsModel_.f29746k = filterSelected;
        extraNotificationsModel_.m4524l2();
        extraNotificationsModel_.f29747l = listener;
        extraNotificationsModel_.f6932i = C6284a.f58029i;
        add(extraNotificationsModel_);
        boolean z = !(isEpisodeNotificationsEnabled || isCommentNotificationsEnabled || isMyCollectionCommentNotificationsEnabled || filterSelected != 1) || (!isEpisodeNotificationsEnabled && filterSelected == 2) || (!isCommentNotificationsEnabled && filterSelected == 5);
        if (!isPushNotificationsEnabled && z) {
            EpoxyModel<?> notificationsPushDisabledModel_ = new NotificationsPushDisabledModel_();
            notificationsPushDisabledModel_.m4520h2("notificationPushDisabled");
            add(notificationsPushDisabledModel_);
            NotificationsDisabledModel_ notificationsDisabledModel_ = new NotificationsDisabledModel_();
            notificationsDisabledModel_.m4520h2("notificationDisabled");
            notificationsDisabledModel_.m4524l2();
            notificationsDisabledModel_.f29801k = listener;
            add(notificationsDisabledModel_);
        } else if (!isPushNotificationsEnabled) {
            EpoxyModel<?> notificationsPushDisabledModel_2 = new NotificationsPushDisabledModel_();
            notificationsPushDisabledModel_2.m4520h2("notificationPushDisabled");
            add(notificationsPushDisabledModel_2);
        } else if (z) {
            NotificationsDisabledModel_ notificationsDisabledModel_2 = new NotificationsDisabledModel_();
            notificationsDisabledModel_2.m4520h2("notificationDisabled");
            notificationsDisabledModel_2.m4524l2();
            notificationsDisabledModel_2.f29801k = listener;
            add(notificationsDisabledModel_2);
        } else if (profileNotifications.isEmpty()) {
            EpoxyModel<?> emptyModel_ = new EmptyModel_();
            emptyModel_.m4520h2("empty");
            emptyModel_.f6932i = C6284a.f58030j;
            add(emptyModel_);
        }
        if (!profileNotifications.isEmpty()) {
            for (ProfileNotification profileNotification : profileNotifications) {
                if (profileNotification instanceof ProfileFriendNotification) {
                    ProfileFriendNotification profileFriendNotification = (ProfileFriendNotification) profileNotification;
                    Profile byProfile = profileFriendNotification.getByProfile();
                    ProfileFriendNotification.Status status = profileFriendNotification.getStatus();
                    if (byProfile != null && status != null) {
                        NotificationFriendModel_ notificationFriendModel_ = new NotificationFriendModel_();
                        notificationFriendModel_.m16024w2(profileNotification.getId());
                        long id2 = byProfile.getId();
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29774k = id2;
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29775l = status;
                        String login = byProfile.getLogin();
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29776m = login;
                        String avatar = byProfile.getAvatar();
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29777n = avatar;
                        long timestamp = profileNotification.getTimestamp();
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29778o = timestamp;
                        boolean isNew = profileNotification.getIsNew();
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29779p = isNew;
                        notificationFriendModel_.m4524l2();
                        notificationFriendModel_.f29780q = listener;
                        add(notificationFriendModel_);
                    }
                } else if (profileNotification instanceof ProfileEpisodeNotification) {
                    Episode episode = ((ProfileEpisodeNotification) profileNotification).getEpisode();
                    Release release = episode.getRelease();
                    Source source = episode.getSource();
                    if (release != null && source != null) {
                        NotificationEpisodeModel_ notificationEpisodeModel_ = new NotificationEpisodeModel_();
                        notificationEpisodeModel_.m16021w2(profileNotification.getId());
                        long id3 = release.getId();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29764k = id3;
                        String titleRu = release.getTitleRu();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29765l = titleRu;
                        String image = release.getImage();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29766m = image;
                        String name = episode.getName();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29767n = name;
                        String name2 = source.getType().getName();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29768o = name2;
                        String name3 = source.getName();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29769p = name3;
                        long timestamp2 = profileNotification.getTimestamp();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29770q = timestamp2;
                        boolean isNew2 = profileNotification.getIsNew();
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29771r = isNew2;
                        notificationEpisodeModel_.m4524l2();
                        notificationEpisodeModel_.f29772s = listener;
                        add(notificationEpisodeModel_);
                    }
                } else if (profileNotification instanceof ProfileReleaseCommentNotification) {
                    ProfileReleaseCommentNotification profileReleaseCommentNotification = (ProfileReleaseCommentNotification) profileNotification;
                    ReleaseComment parentComment = profileReleaseCommentNotification.getParentComment();
                    ReleaseComment comment = profileReleaseCommentNotification.getComment();
                    Profile profile = comment.getProfile();
                    Release release2 = comment.getRelease();
                    NotificationReleaseCommentModel_ notificationReleaseCommentModel_ = new NotificationReleaseCommentModel_();
                    notificationReleaseCommentModel_.m16028x2(profileNotification.getId());
                    long id4 = release2.getId();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29783k = id4;
                    long id5 = parentComment.getId();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29784l = id5;
                    long id6 = comment.getId();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29785m = id6;
                    notificationReleaseCommentModel_.m16030z2(comment.getMessage());
                    boolean isSpoiler = comment.getIsSpoiler();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29787o = isSpoiler;
                    notificationReleaseCommentModel_.m16029y2(profile.getLogin());
                    notificationReleaseCommentModel_.m16027w2(profile.getAvatar());
                    long timestamp3 = profileNotification.getTimestamp();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29790r = timestamp3;
                    boolean isNew3 = profileNotification.getIsNew();
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29791s = isNew3;
                    notificationReleaseCommentModel_.m4524l2();
                    notificationReleaseCommentModel_.f29792t = listener;
                    add(notificationReleaseCommentModel_);
                } else if (profileNotification instanceof ProfileCollectionCommentNotification) {
                    ProfileCollectionCommentNotification profileCollectionCommentNotification = (ProfileCollectionCommentNotification) profileNotification;
                    CollectionComment parentComment2 = profileCollectionCommentNotification.getParentComment();
                    CollectionComment comment2 = profileCollectionCommentNotification.getComment();
                    Profile profile2 = comment2.getProfile();
                    Collection collection = comment2.getCollection();
                    NotificationCollectionCommentModel_ notificationCollectionCommentModel_ = new NotificationCollectionCommentModel_();
                    notificationCollectionCommentModel_.m16017y2(profileNotification.getId());
                    long id7 = collection.getId();
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29752l = id7;
                    long id8 = parentComment2.getId();
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29753m = id8;
                    Long valueOf = Long.valueOf(comment2.getId());
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29754n = valueOf;
                    notificationCollectionCommentModel_.m16014A2(comment2.getMessage());
                    boolean isSpoiler2 = parentComment2.getIsSpoiler();
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29757q = isSpoiler2;
                    notificationCollectionCommentModel_.m16018z2(profile2.getLogin());
                    notificationCollectionCommentModel_.m16015w2(profile2.getAvatar());
                    long timestamp4 = profileNotification.getTimestamp();
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29760t = timestamp4;
                    boolean isNew4 = profileNotification.getIsNew();
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29761u = isNew4;
                    notificationCollectionCommentModel_.m4524l2();
                    notificationCollectionCommentModel_.f29762v = listener;
                    add(notificationCollectionCommentModel_);
                } else if (profileNotification instanceof ProfileMyCollectionCommentNotification) {
                    CollectionComment collectionComment = ((ProfileMyCollectionCommentNotification) profileNotification).getCollectionComment();
                    Profile profile3 = collectionComment.getProfile();
                    Collection collection2 = collectionComment.getCollection();
                    NotificationCollectionCommentModel_ notificationCollectionCommentModel_2 = new NotificationCollectionCommentModel_();
                    notificationCollectionCommentModel_2.m16017y2(profileNotification.getId());
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29751k = 1;
                    long id9 = collection2.getId();
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29752l = id9;
                    long id10 = collectionComment.getId();
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29753m = id10;
                    notificationCollectionCommentModel_2.m16016x2(collection2.getTitle());
                    notificationCollectionCommentModel_2.m16014A2(collectionComment.getMessage());
                    boolean isSpoiler3 = collectionComment.getIsSpoiler();
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29757q = isSpoiler3;
                    notificationCollectionCommentModel_2.m16018z2(profile3.getLogin());
                    notificationCollectionCommentModel_2.m16015w2(profile3.getAvatar());
                    long timestamp5 = profileNotification.getTimestamp();
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29760t = timestamp5;
                    boolean isNew5 = profileNotification.getIsNew();
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29761u = isNew5;
                    notificationCollectionCommentModel_2.m4524l2();
                    notificationCollectionCommentModel_2.f29762v = listener;
                    add(notificationCollectionCommentModel_2);
                } else if (profileNotification instanceof ProfileRelatedReleaseNotification) {
                    Release release3 = ((ProfileRelatedReleaseNotification) profileNotification).getRelease();
                    NotificationReleaseModel_ notificationReleaseModel_ = new NotificationReleaseModel_();
                    notificationReleaseModel_.m16033w2(profileNotification.getId());
                    long id11 = release3.getId();
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29794k = id11;
                    String titleRu2 = release3.getTitleRu();
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29795l = titleRu2;
                    String image2 = release3.getImage();
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29796m = image2;
                    long timestamp6 = profileNotification.getTimestamp();
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29797n = timestamp6;
                    boolean isNew6 = profileNotification.getIsNew();
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29798o = isNew6;
                    notificationReleaseModel_.m4524l2();
                    notificationReleaseModel_.f29799p = listener;
                    add(notificationReleaseModel_);
                }
            }
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
