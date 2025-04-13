package com.swiftsoft.anixartd.dagger;

import android.app.ActivityManager;
import android.content.Context;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.framework.FrameworkSQLiteOpenHelperFactory;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.dagger.module.AppModule;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideAuthApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideCollectionApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideCollectionCommentApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideCollectionMyApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideCommentVotesApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideConfigApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideContextFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideCoverApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideDirectLinkApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideEpisodeApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideExportApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideFavoriteApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideFavoriteCollectionApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideFilterApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideHistoryApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideImportApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideNotificationPreferenceApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideNotificationsApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvidePrefsFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfileApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfileBlockListApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfileFriendApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfileListApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfilePreferenceApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideProfileReleaseVoteApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideRelatedApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseCommentApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseStreamingPlatformApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseVideoAppealApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseVideoFavoriteApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReleaseVideosApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideReportApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideRetrofitFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideScheduleApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideSearchApiFactory;
import com.swiftsoft.anixartd.dagger.module.AppModule_ProvideTypeApiFactory;
import com.swiftsoft.anixartd.dagger.module.RepositoryModule;
import com.swiftsoft.anixartd.dagger.module.RoomModule;
import com.swiftsoft.anixartd.database.DataManager;
import com.swiftsoft.anixartd.database.dao.CustomFilterDao;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.dao.SearchDao;
import com.swiftsoft.anixartd.database.dao.UserDao;
import com.swiftsoft.anixartd.network.api.AuthApi;
import com.swiftsoft.anixartd.network.api.CollectionApi;
import com.swiftsoft.anixartd.network.api.CollectionCommentApi;
import com.swiftsoft.anixartd.network.api.CollectionFavoriteApi;
import com.swiftsoft.anixartd.network.api.CollectionMyApi;
import com.swiftsoft.anixartd.network.api.CommentVotesApi;
import com.swiftsoft.anixartd.network.api.ConfigApi;
import com.swiftsoft.anixartd.network.api.DirectLinkApi;
import com.swiftsoft.anixartd.network.api.DiscoverApi;
import com.swiftsoft.anixartd.network.api.EpisodeApi;
import com.swiftsoft.anixartd.network.api.ExportApi;
import com.swiftsoft.anixartd.network.api.FavoriteApi;
import com.swiftsoft.anixartd.network.api.FilterApi;
import com.swiftsoft.anixartd.network.api.HistoryApi;
import com.swiftsoft.anixartd.network.api.ImportApi;
import com.swiftsoft.anixartd.network.api.NotificationApi;
import com.swiftsoft.anixartd.network.api.NotificationPreferenceApi;
import com.swiftsoft.anixartd.network.api.ProfileApi;
import com.swiftsoft.anixartd.network.api.ProfileBlockListApi;
import com.swiftsoft.anixartd.network.api.ProfileFriendApi;
import com.swiftsoft.anixartd.network.api.ProfileListApi;
import com.swiftsoft.anixartd.network.api.ProfilePreferenceApi;
import com.swiftsoft.anixartd.network.api.ProfileReleaseVoteApi;
import com.swiftsoft.anixartd.network.api.RelatedApi;
import com.swiftsoft.anixartd.network.api.ReleaseApi;
import com.swiftsoft.anixartd.network.api.ReleaseCommentApi;
import com.swiftsoft.anixartd.network.api.ReleaseStreamingPlatformApi;
import com.swiftsoft.anixartd.network.api.ReleaseVideoApi;
import com.swiftsoft.anixartd.network.api.ReleaseVideoAppealApi;
import com.swiftsoft.anixartd.network.api.ReleaseVideoFavoriteApi;
import com.swiftsoft.anixartd.network.api.ReportApi;
import com.swiftsoft.anixartd.network.api.ScheduleApi;
import com.swiftsoft.anixartd.network.api.SearchApi;
import com.swiftsoft.anixartd.network.api.TypeApi;
import com.swiftsoft.anixartd.notification.NotificationService;
import com.swiftsoft.anixartd.notification.SilentPushReceiver;
import com.swiftsoft.anixartd.p015ui.activity.AuthActivity;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.activity.StartActivity;
import com.swiftsoft.anixartd.p015ui.activity.UpdateActivity;
import com.swiftsoft.anixartd.p015ui.activity.kodik.KodikAdActivity;
import com.swiftsoft.anixartd.p015ui.activity.swiftplayer.SwiftPlayerActivity;
import com.swiftsoft.anixartd.p015ui.activity.webplayer.WebPlayerActivity;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseGenresDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.RestoreFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.RestoreVerifyFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignInFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithGoogleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithVkFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionEditorFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionProfileListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.discover.DiscoverFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.TorlookFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.updates.EpisodesUpdatesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filtered.FilteredFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.CustomFilterTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.notifications.NotificationsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.AdditionalPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.AppearancePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ChangeLoginPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.DataPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.MainPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.NotificationsPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.PlaybackPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfilePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileBlockListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileChangeLoginHistoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileSocialFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.comments.ProfileCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.comments.ProfileCommentsTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileOutFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.lists.ProfileListsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.lists.ProfileListsTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideoAppealsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosAllFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseVoteFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.RecommendationFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.related.RelatedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCollectionsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.ReleaseVideosFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.schedule.ScheduleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.streaming.ReleaseStreamingPlatformFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.top.TopFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.top.TopTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.WatchingFragment;
import com.swiftsoft.anixartd.presentation.auth.AuthPresenter;
import com.swiftsoft.anixartd.presentation.auth.AuthPresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter;
import com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter;
import com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter;
import com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkPresenter_Factory;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter_Factory;
import com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter;
import com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.MainPresenter;
import com.swiftsoft.anixartd.presentation.main.MainPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksPresenter;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter;
import com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter;
import com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresPresenter;
import com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter;
import com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.home.HomePresenter;
import com.swiftsoft.anixartd.presentation.main.home.HomePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter;
import com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter;
import com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter;
import com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter;
import com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter;
import com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.report.ReportPresenter;
import com.swiftsoft.anixartd.presentation.main.report.ReportPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter;
import com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.search.SearchPresenter;
import com.swiftsoft.anixartd.presentation.main.search.SearchPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter;
import com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter;
import com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter;
import com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter_Factory;
import com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter;
import com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter_Factory;
import com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter;
import com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter_Factory;
import com.swiftsoft.anixartd.presentation.start.StartPresenter;
import com.swiftsoft.anixartd.presentation.start.StartPresenter_Factory;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.BookmarksRepository;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.CommentVotesRepository;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import com.swiftsoft.anixartd.repository.DiscoverRepository;
import com.swiftsoft.anixartd.repository.EpisodeRepository;
import com.swiftsoft.anixartd.repository.ExportRepository;
import com.swiftsoft.anixartd.repository.FilterRepository;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.repository.ImportRepository;
import com.swiftsoft.anixartd.repository.MainRepository;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.NotificationRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.repository.ProfileReleaseVoteRepository;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.repository.RelatedRepository;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import com.swiftsoft.anixartd.repository.ReleaseRepository;
import com.swiftsoft.anixartd.repository.ReleaseStreamingPlatformRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import com.swiftsoft.anixartd.repository.ReportRepository;
import com.swiftsoft.anixartd.repository.ScheduleRepository;
import com.swiftsoft.anixartd.repository.SearchRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;
import retrofit2.Retrofit;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DaggerApplicationComponent {

    public static final class ApplicationComponentImpl implements ApplicationComponent {

        /* renamed from: A */
        public Provider<ReleaseRepository> f25400A;

        /* renamed from: A0 */
        public Provider<ProfileReleaseUnvotedPresenter> f25401A0;

        /* renamed from: A1 */
        public Provider<ProfileReleaseVideoAppealsPresenter> f25402A1;

        /* renamed from: B */
        public Provider<ProfileApi> f25403B;

        /* renamed from: B0 */
        public Provider<ProfileChangeLoginHistoryPresenter> f25404B0;

        /* renamed from: B1 */
        public Provider<ReportApi> f25405B1;

        /* renamed from: C */
        public Provider<ProfileFriendApi> f25406C;

        /* renamed from: C0 */
        public Provider<ChangeLoginPreferencePresenter> f25407C0;

        /* renamed from: C1 */
        public Provider<ReportRepository> f25408C1;

        /* renamed from: D */
        public Provider<ProfileBlockListApi> f25409D;

        /* renamed from: D0 */
        public Provider<SearchApi> f25410D0;

        /* renamed from: D1 */
        public Provider<ReportPresenter> f25411D1;

        /* renamed from: E */
        public Provider<ProfileRepository> f25412E;

        /* renamed from: E0 */
        public Provider<SearchDao> f25413E0;

        /* renamed from: E1 */
        public Provider<ChooseGenresPresenter> f25414E1;

        /* renamed from: F */
        public Provider<ProfilePreferenceApi> f25415F;

        /* renamed from: F0 */
        public Provider<SearchRepository> f25416F0;

        /* renamed from: F1 */
        public Provider<SwiftPlayerPresenter> f25417F1;

        /* renamed from: G */
        public Provider<ProfilePreferenceRepository> f25418G;

        /* renamed from: G0 */
        public Provider<SearchPresenter> f25419G0;

        /* renamed from: G1 */
        public Provider<UpdatePresenter> f25420G1;

        /* renamed from: H */
        public Provider<CollectionApi> f25421H;

        /* renamed from: H0 */
        public Provider<FilterPresenter> f25422H0;

        /* renamed from: I */
        public Provider<CollectionMyApi> f25423I;

        /* renamed from: I0 */
        public Provider<FilteredPresenter> f25424I0;

        /* renamed from: J */
        public Provider<CollectionFavoriteApi> f25425J;

        /* renamed from: J0 */
        public Provider<ReleasePresenter> f25426J0;

        /* renamed from: K */
        public Provider<CollectionRepository> f25427K;

        /* renamed from: K0 */
        public Provider<EpisodeApi> f25428K0;

        /* renamed from: L */
        public Provider<NotificationApi> f25429L;

        /* renamed from: L0 */
        public Provider<DirectLinkApi> f25430L0;

        /* renamed from: M */
        public Provider<NotificationRepository> f25431M;

        /* renamed from: M0 */
        public Provider<EpisodeRepository> f25432M0;

        /* renamed from: N */
        public Provider<MainPresenter> f25433N;

        /* renamed from: N0 */
        public Provider<EpisodesPresenter> f25434N0;

        /* renamed from: O */
        public Provider<FilterApi> f25435O;

        /* renamed from: O0 */
        public Provider<EpisodesUpdatesPresenter> f25436O0;

        /* renamed from: P */
        public Provider<CustomFilterDao> f25437P;

        /* renamed from: P0 */
        public Provider<TorlookPresenter> f25438P0;

        /* renamed from: Q */
        public Provider<HomeRepository> f25439Q;

        /* renamed from: Q0 */
        public Provider<RelatedApi> f25440Q0;

        /* renamed from: R */
        public Provider<HomePresenter> f25441R;

        /* renamed from: R0 */
        public Provider<RelatedRepository> f25442R0;

        /* renamed from: S */
        public Provider<HomeTabPresenter> f25443S;

        /* renamed from: S0 */
        public Provider<RelatedPresenter> f25444S0;

        /* renamed from: T */
        public Provider<FilterRepository> f25445T;

        /* renamed from: T0 */
        public Provider<ReleaseVideoApi> f25446T0;

        /* renamed from: U */
        public Provider<CustomFilterTabPresenter> f25447U;

        /* renamed from: U0 */
        public Provider<ReleaseVideoRepository> f25448U0;

        /* renamed from: V */
        public Provider<BookmarksPresenter> f25449V;

        /* renamed from: V0 */
        public Provider<ReleaseVideosPresenter> f25450V0;

        /* renamed from: W */
        public Provider<BookmarksRepository> f25451W;

        /* renamed from: W0 */
        public Provider<ReleaseVideoCategoryPresenter> f25452W0;

        /* renamed from: X */
        public Provider<BookmarksTabPresenter> f25453X;

        /* renamed from: X0 */
        public Provider<ReleaseVideoAppealApi> f25454X0;

        /* renamed from: Y */
        public Provider<DiscoverApi> f25455Y;

        /* renamed from: Y0 */
        public Provider<ReleaseVideoAppealRepository> f25456Y0;

        /* renamed from: Z */
        public Provider<DiscoverRepository> f25457Z;

        /* renamed from: Z0 */
        public Provider<ReleaseVideoAppealPresenter> f25458Z0;

        /* renamed from: a */
        public Provider<Context> f25459a;

        /* renamed from: a0 */
        public Provider<DiscoverPresenter> f25460a0;

        /* renamed from: a1 */
        public Provider<ReleaseCommentsPresenter> f25461a1;

        /* renamed from: b */
        public Provider<Retrofit> f25462b;

        /* renamed from: b0 */
        public Provider<NotificationPreferenceApi> f25463b0;

        /* renamed from: b1 */
        public Provider<ReleaseCollectionsPresenter> f25464b1;

        /* renamed from: c */
        public Provider<AuthApi> f25465c;

        /* renamed from: c0 */
        public Provider<NotificationPreferenceRepository> f25466c0;

        /* renamed from: c1 */
        public Provider<CollectionCommentsPresenter> f25467c1;

        /* renamed from: d */
        public Provider<Prefs> f25468d;

        /* renamed from: d0 */
        public Provider<NotificationsPresenter> f25469d0;

        /* renamed from: d1 */
        public Provider<CommentVotesApi> f25470d1;

        /* renamed from: e */
        public Provider<DataManager> f25471e;

        /* renamed from: e0 */
        public Provider<TypeApi> f25472e0;

        /* renamed from: e1 */
        public Provider<CommentVotesRepository> f25473e1;

        /* renamed from: f */
        public Provider<UserDao> f25474f;

        /* renamed from: f0 */
        public Provider<TypeRepository> f25475f0;

        /* renamed from: f1 */
        public Provider<CommentVotesPresenter> f25476f1;

        /* renamed from: g */
        public Provider<EpisodeDao> f25477g;

        /* renamed from: g0 */
        public Provider<NotificationsPreferencePresenter> f25478g0;

        /* renamed from: g1 */
        public Provider<ReleaseCommentsRepliesPresenter> f25479g1;

        /* renamed from: h */
        public Provider<LastWatchedEpisodeDao> f25480h;

        /* renamed from: h0 */
        public Provider<WatchingPresenter> f25481h0;

        /* renamed from: h1 */
        public Provider<CollectionCommentsRepliesPresenter> f25482h1;

        /* renamed from: i */
        public Provider<AuthRepository> f25483i;

        /* renamed from: i0 */
        public Provider<RecommendationPresenter> f25484i0;

        /* renamed from: i1 */
        public Provider<ReleaseStreamingPlatformApi> f25485i1;

        /* renamed from: j */
        public Provider<StartPresenter> f25486j;

        /* renamed from: j0 */
        public Provider<TopTabPresenter> f25487j0;

        /* renamed from: j1 */
        public Provider<ReleaseStreamingPlatformRepository> f25488j1;

        /* renamed from: k */
        public Provider<ConfigApi> f25489k;

        /* renamed from: k0 */
        public Provider<ProfilePresenter> f25490k0;

        /* renamed from: k1 */
        public Provider<ReleaseStreamingPlatformPresenter> f25491k1;

        /* renamed from: l */
        public Provider<ConfigRepository> f25492l;

        /* renamed from: l0 */
        public Provider<ProfileSocialPresenter> f25493l0;

        /* renamed from: l1 */
        public Provider<ScheduleApi> f25494l1;

        /* renamed from: m */
        public Provider<AuthPresenter> f25495m;

        /* renamed from: m0 */
        public Provider<ProfilePreferencePresenter> f25496m0;

        /* renamed from: m1 */
        public Provider<ScheduleRepository> f25497m1;

        /* renamed from: n */
        public Provider<SignInPresenter> f25498n;

        /* renamed from: n0 */
        public Provider<ReleaseCommentApi> f25499n0;

        /* renamed from: n1 */
        public Provider<SchedulePresenter> f25500n1;

        /* renamed from: o */
        public Provider<SignUpPresenter> f25501o;

        /* renamed from: o0 */
        public Provider<ReleaseCommentRepository> f25502o0;

        /* renamed from: o1 */
        public Provider<ProfileReleaseNotificationPreferencesPresenter> f25503o1;

        /* renamed from: p */
        public Provider<VerifyPresenter> f25504p;

        /* renamed from: p0 */
        public Provider<CollectionCommentApi> f25505p0;

        /* renamed from: p1 */
        public Provider<MainPreferencePresenter> f25506p1;

        /* renamed from: q */
        public Provider<RestorePresenter> f25507q;

        /* renamed from: q0 */
        public Provider<CollectionCommentRepository> f25508q0;

        /* renamed from: q1 */
        public Provider<ImportApi> f25509q1;

        /* renamed from: r */
        public Provider<RestoreVerifyPresenter> f25510r;

        /* renamed from: r0 */
        public Provider<ProfileCommentsTabPresenter> f25511r0;

        /* renamed from: r1 */
        public Provider<ImportRepository> f25512r1;

        /* renamed from: s */
        public Provider<SignUpWithVkPresenter> f25513s;

        /* renamed from: s0 */
        public Provider<ProfileFriendsPresenter> f25514s0;

        /* renamed from: s1 */
        public Provider<ExportApi> f25515s1;

        /* renamed from: t */
        public Provider<SignUpWithGooglePresenter> f25516t;

        /* renamed from: t0 */
        public Provider<ProfileFriendRequestsPresenter> f25517t0;

        /* renamed from: t1 */
        public Provider<ExportRepository> f25518t1;

        /* renamed from: u */
        public Provider<HistoryApi> f25519u;

        /* renamed from: u0 */
        public Provider<ProfileOutFriendRequestsPresenter> f25520u0;

        /* renamed from: u1 */
        public Provider<DataPreferencePresenter> f25521u1;

        /* renamed from: v */
        public Provider<FavoriteApi> f25522v;

        /* renamed from: v0 */
        public Provider<ProfileBlockListPresenter> f25523v0;

        /* renamed from: v1 */
        public Provider<CollectionListPresenter> f25524v1;

        /* renamed from: w */
        public Provider<ReleaseVideoFavoriteApi> f25525w;

        /* renamed from: w0 */
        public Provider<ProfileListsTabPresenter> f25526w0;

        /* renamed from: w1 */
        public Provider<CollectionPresenter> f25527w1;

        /* renamed from: x */
        public Provider<ProfileListApi> f25528x;

        /* renamed from: x0 */
        public Provider<ProfileReleaseVoteApi> f25529x0;

        /* renamed from: x1 */
        public Provider<CollectionEditorPresenter> f25530x1;

        /* renamed from: y */
        public Provider<MainRepository> f25531y;

        /* renamed from: y0 */
        public Provider<ProfileReleaseVoteRepository> f25532y0;

        /* renamed from: y1 */
        public Provider<CollectionProfileListPresenter> f25533y1;

        /* renamed from: z */
        public Provider<ReleaseApi> f25534z;

        /* renamed from: z0 */
        public Provider<ProfileReleaseVotePresenter> f25535z0;

        /* renamed from: z1 */
        public Provider<ProfileReleaseVideosTabPresenter> f25536z1;

        public ApplicationComponentImpl(AppModule appModule, final RoomModule roomModule, final RepositoryModule repositoryModule, C25081 c25081) {
            Provider appModule_ProvideContextFactory = new AppModule_ProvideContextFactory(appModule);
            Object obj = DoubleCheck.f58002c;
            appModule_ProvideContextFactory = appModule_ProvideContextFactory instanceof DoubleCheck ? appModule_ProvideContextFactory : new DoubleCheck(appModule_ProvideContextFactory);
            this.f25459a = appModule_ProvideContextFactory;
            Provider appModule_ProvideRetrofitFactory = new AppModule_ProvideRetrofitFactory(appModule, appModule_ProvideContextFactory);
            appModule_ProvideRetrofitFactory = appModule_ProvideRetrofitFactory instanceof DoubleCheck ? appModule_ProvideRetrofitFactory : new DoubleCheck(appModule_ProvideRetrofitFactory);
            this.f25462b = appModule_ProvideRetrofitFactory;
            Provider appModule_ProvideAuthApiFactory = new AppModule_ProvideAuthApiFactory(appModule, appModule_ProvideRetrofitFactory);
            this.f25465c = appModule_ProvideAuthApiFactory instanceof DoubleCheck ? appModule_ProvideAuthApiFactory : new DoubleCheck(appModule_ProvideAuthApiFactory);
            Provider appModule_ProvidePrefsFactory = new AppModule_ProvidePrefsFactory(appModule, this.f25459a);
            this.f25468d = appModule_ProvidePrefsFactory instanceof DoubleCheck ? appModule_ProvidePrefsFactory : new DoubleCheck(appModule_ProvidePrefsFactory);
            final Provider<Context> provider = this.f25459a;
            final Provider provider2 = new Factory<DataManager>(roomModule, provider) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideDataManager$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25719a;

                /* renamed from: b */
                public final Provider<Context> f25720b;

                {
                    this.f25719a = roomModule;
                    this.f25720b = provider;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    Executor executor;
                    RoomModule roomModule2 = this.f25719a;
                    Context context = this.f25720b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(context, "context");
                    RoomDatabase.Builder builder = new RoomDatabase.Builder(context, DataManager.class, "dataManager");
                    DataManager.Companion companion = DataManager.INSTANCE;
                    Migration[] migrationArr = {companion.getMIGRATION_2_TO_3(), companion.getMIGRATION_3_TO_4(), companion.getMIGRATION_4_TO_5(), companion.getMIGRATION_5_TO_6(), companion.getMIGRATION_6_TO_7(), companion.getMIGRATION_7_TO_8(), companion.getMIGRATION_8_TO_9()};
                    if (builder.f5851h == null) {
                        builder.f5851h = new HashSet();
                    }
                    for (int i2 = 0; i2 < 7; i2++) {
                        Migration migration = migrationArr[i2];
                        builder.f5851h.add(Integer.valueOf(migration.startVersion));
                        builder.f5851h.add(Integer.valueOf(migration.endVersion));
                    }
                    builder.f5850g.m4075a(migrationArr);
                    builder.f5849f = true;
                    Context context2 = builder.f5846c;
                    if (context2 == null) {
                        throw new IllegalArgumentException("Cannot provide null context for the database.");
                    }
                    if (builder.f5844a == null) {
                        throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
                    }
                    Executor executor2 = builder.f5847d;
                    if (executor2 == null && builder.f5848e == null) {
                        Executor executor3 = ArchTaskExecutor.f1687c;
                        builder.f5848e = executor3;
                        builder.f5847d = executor3;
                    } else if (executor2 != null && builder.f5848e == null) {
                        builder.f5848e = executor2;
                    } else if (executor2 == null && (executor = builder.f5848e) != null) {
                        builder.f5847d = executor;
                    }
                    FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
                    String str = builder.f5845b;
                    RoomDatabase.MigrationContainer migrationContainer = builder.f5850g;
                    ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                    DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context2, str, frameworkSQLiteOpenHelperFactory, migrationContainer, null, true, (activityManager == null || activityManager.isLowRamDevice()) ? RoomDatabase.JournalMode.TRUNCATE : RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING, builder.f5847d, builder.f5848e, null, true, false, null, null, null, null, null, null, null);
                    Class<T> cls = builder.f5844a;
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    if (!name.isEmpty()) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    String str2 = canonicalName.replace('.', '_') + "_Impl";
                    try {
                        RoomDatabase roomDatabase = (RoomDatabase) Class.forName(name.isEmpty() ? str2 : name + "." + str2, true, cls.getClassLoader()).newInstance();
                        roomDatabase.init(databaseConfiguration);
                        return (DataManager) roomDatabase;
                    } catch (ClassNotFoundException unused) {
                        StringBuilder m24u = C0000a.m24u("cannot find implementation for ");
                        m24u.append(cls.getCanonicalName());
                        m24u.append(". ");
                        m24u.append(str2);
                        m24u.append(" does not exist");
                        throw new RuntimeException(m24u.toString());
                    } catch (IllegalAccessException unused2) {
                        StringBuilder m24u2 = C0000a.m24u("Cannot access the constructor");
                        m24u2.append(cls.getCanonicalName());
                        throw new RuntimeException(m24u2.toString());
                    } catch (InstantiationException unused3) {
                        StringBuilder m24u3 = C0000a.m24u("Failed to create an instance of ");
                        m24u3.append(cls.getCanonicalName());
                        throw new RuntimeException(m24u3.toString());
                    }
                }
            };
            provider2 = provider2 instanceof DoubleCheck ? provider2 : new DoubleCheck(provider2);
            this.f25471e = provider2;
            Provider provider3 = new Factory<UserDao>(roomModule, provider2) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideUserDao$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25727a;

                /* renamed from: b */
                public final Provider<DataManager> f25728b;

                {
                    this.f25727a = roomModule;
                    this.f25728b = provider2;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RoomModule roomModule2 = this.f25727a;
                    DataManager dataManager = this.f25728b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(dataManager, "dataManager");
                    UserDao userDao = dataManager.getUserDao();
                    Objects.requireNonNull(userDao, "Cannot return null from a non-@Nullable @Provides method");
                    return userDao;
                }
            };
            this.f25474f = provider3 instanceof DoubleCheck ? provider3 : new DoubleCheck(provider3);
            final Provider<DataManager> provider4 = this.f25471e;
            Provider provider5 = new Factory<EpisodeDao>(roomModule, provider4) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideEpisodeDao$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25721a;

                /* renamed from: b */
                public final Provider<DataManager> f25722b;

                {
                    this.f25721a = roomModule;
                    this.f25722b = provider4;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RoomModule roomModule2 = this.f25721a;
                    DataManager dataManager = this.f25722b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(dataManager, "dataManager");
                    EpisodeDao episodeDao = dataManager.getEpisodeDao();
                    Objects.requireNonNull(episodeDao, "Cannot return null from a non-@Nullable @Provides method");
                    return episodeDao;
                }
            };
            this.f25477g = provider5 instanceof DoubleCheck ? provider5 : new DoubleCheck(provider5);
            final Provider<DataManager> provider6 = this.f25471e;
            Provider provider7 = new Factory<LastWatchedEpisodeDao>(roomModule, provider6) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideLastWatchedEpisodeDao$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25723a;

                /* renamed from: b */
                public final Provider<DataManager> f25724b;

                {
                    this.f25723a = roomModule;
                    this.f25724b = provider6;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RoomModule roomModule2 = this.f25723a;
                    DataManager dataManager = this.f25724b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(dataManager, "dataManager");
                    LastWatchedEpisodeDao lastWatchedEpisodeDao = dataManager.getLastWatchedEpisodeDao();
                    Objects.requireNonNull(lastWatchedEpisodeDao, "Cannot return null from a non-@Nullable @Provides method");
                    return lastWatchedEpisodeDao;
                }
            };
            final Provider doubleCheck = provider7 instanceof DoubleCheck ? provider7 : new DoubleCheck(provider7);
            this.f25480h = doubleCheck;
            final Provider<AuthApi> provider8 = this.f25465c;
            final Provider<Prefs> provider9 = this.f25468d;
            final Provider<UserDao> provider10 = this.f25474f;
            final Provider<EpisodeDao> provider11 = this.f25477g;
            Provider provider12 = new Factory<AuthRepository>(repositoryModule, provider8, provider9, provider10, provider11, doubleCheck) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideAuthRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25616a;

                /* renamed from: b */
                public final Provider<AuthApi> f25617b;

                /* renamed from: c */
                public final Provider<Prefs> f25618c;

                /* renamed from: d */
                public final Provider<UserDao> f25619d;

                /* renamed from: e */
                public final Provider<EpisodeDao> f25620e;

                /* renamed from: f */
                public final Provider<LastWatchedEpisodeDao> f25621f;

                {
                    this.f25616a = repositoryModule;
                    this.f25617b = provider8;
                    this.f25618c = provider9;
                    this.f25619d = provider10;
                    this.f25620e = provider11;
                    this.f25621f = doubleCheck;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25616a;
                    AuthApi authApi = this.f25617b.get();
                    Prefs prefs = this.f25618c.get();
                    UserDao userDao = this.f25619d.get();
                    EpisodeDao episodeDao = this.f25620e.get();
                    LastWatchedEpisodeDao lastWatchedEpisodeDao = this.f25621f.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(authApi, "authApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    Intrinsics.m32179h(userDao, "userDao");
                    Intrinsics.m32179h(episodeDao, "episodeDao");
                    Intrinsics.m32179h(lastWatchedEpisodeDao, "lastWatchedEpisodeDao");
                    return new AuthRepository(authApi, prefs, userDao, episodeDao, lastWatchedEpisodeDao);
                }
            };
            provider12 = provider12 instanceof DoubleCheck ? provider12 : new DoubleCheck(provider12);
            this.f25483i = provider12;
            this.f25486j = new StartPresenter_Factory(provider12);
            final Provider appModule_ProvideConfigApiFactory = new AppModule_ProvideConfigApiFactory(appModule, this.f25462b);
            appModule_ProvideConfigApiFactory = appModule_ProvideConfigApiFactory instanceof DoubleCheck ? appModule_ProvideConfigApiFactory : new DoubleCheck(appModule_ProvideConfigApiFactory);
            this.f25489k = appModule_ProvideConfigApiFactory;
            final Provider<Prefs> provider13 = this.f25468d;
            Provider provider14 = new Factory<ConfigRepository>(repositoryModule, appModule_ProvideConfigApiFactory, provider13) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideConfigRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25638a;

                /* renamed from: b */
                public final Provider<ConfigApi> f25639b;

                /* renamed from: c */
                public final Provider<Prefs> f25640c;

                {
                    this.f25638a = repositoryModule;
                    this.f25639b = appModule_ProvideConfigApiFactory;
                    this.f25640c = provider13;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25638a;
                    ConfigApi configApi = this.f25639b.get();
                    Prefs prefs = this.f25640c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(configApi, "configApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ConfigRepository(configApi, prefs);
                }
            };
            provider14 = provider14 instanceof DoubleCheck ? provider14 : new DoubleCheck(provider14);
            this.f25492l = provider14;
            Provider<AuthRepository> provider15 = this.f25483i;
            Provider<Prefs> provider16 = this.f25468d;
            this.f25495m = new AuthPresenter_Factory(provider15, provider14, provider16);
            this.f25498n = new SignInPresenter_Factory(provider15, provider16);
            this.f25501o = new SignUpPresenter_Factory(provider15);
            this.f25504p = new VerifyPresenter_Factory(provider15);
            this.f25507q = new RestorePresenter_Factory(provider15);
            this.f25510r = new RestoreVerifyPresenter_Factory(provider15);
            this.f25513s = new SignUpWithVkPresenter_Factory(provider15, provider16);
            this.f25516t = new SignUpWithGooglePresenter_Factory(provider15, provider16);
            Provider appModule_ProvideHistoryApiFactory = new AppModule_ProvideHistoryApiFactory(appModule, this.f25462b);
            this.f25519u = appModule_ProvideHistoryApiFactory instanceof DoubleCheck ? appModule_ProvideHistoryApiFactory : new DoubleCheck(appModule_ProvideHistoryApiFactory);
            Provider appModule_ProvideFavoriteApiFactory = new AppModule_ProvideFavoriteApiFactory(appModule, this.f25462b);
            this.f25522v = appModule_ProvideFavoriteApiFactory instanceof DoubleCheck ? appModule_ProvideFavoriteApiFactory : new DoubleCheck(appModule_ProvideFavoriteApiFactory);
            Provider appModule_ProvideReleaseVideoFavoriteApiFactory = new AppModule_ProvideReleaseVideoFavoriteApiFactory(appModule, this.f25462b);
            this.f25525w = appModule_ProvideReleaseVideoFavoriteApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseVideoFavoriteApiFactory : new DoubleCheck(appModule_ProvideReleaseVideoFavoriteApiFactory);
            Provider appModule_ProvideProfileListApiFactory = new AppModule_ProvideProfileListApiFactory(appModule, this.f25462b);
            this.f25528x = appModule_ProvideProfileListApiFactory instanceof DoubleCheck ? appModule_ProvideProfileListApiFactory : new DoubleCheck(appModule_ProvideProfileListApiFactory);
            final Provider<HistoryApi> provider17 = this.f25519u;
            final Provider<FavoriteApi> provider18 = this.f25522v;
            final Provider<ReleaseVideoFavoriteApi> provider19 = this.f25525w;
            final Provider<ProfileListApi> provider20 = this.f25528x;
            final Provider<Prefs> provider21 = this.f25468d;
            Provider provider22 = new Factory<MainRepository>(repositoryModule, provider17, provider18, provider19, provider20, provider21) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideMainRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25664a;

                /* renamed from: b */
                public final Provider<HistoryApi> f25665b;

                /* renamed from: c */
                public final Provider<FavoriteApi> f25666c;

                /* renamed from: d */
                public final Provider<ReleaseVideoFavoriteApi> f25667d;

                /* renamed from: e */
                public final Provider<ProfileListApi> f25668e;

                /* renamed from: f */
                public final Provider<Prefs> f25669f;

                {
                    this.f25664a = repositoryModule;
                    this.f25665b = provider17;
                    this.f25666c = provider18;
                    this.f25667d = provider19;
                    this.f25668e = provider20;
                    this.f25669f = provider21;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25664a;
                    HistoryApi historyApi = this.f25665b.get();
                    FavoriteApi favoriteApi = this.f25666c.get();
                    ReleaseVideoFavoriteApi releaseVideoFavoriteApi = this.f25667d.get();
                    ProfileListApi profileListApi = this.f25668e.get();
                    Prefs prefs = this.f25669f.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(historyApi, "historyApi");
                    Intrinsics.m32179h(favoriteApi, "favoriteApi");
                    Intrinsics.m32179h(releaseVideoFavoriteApi, "releaseVideoFavoriteApi");
                    Intrinsics.m32179h(profileListApi, "profileListApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new MainRepository(historyApi, favoriteApi, releaseVideoFavoriteApi, profileListApi, prefs);
                }
            };
            this.f25531y = provider22 instanceof DoubleCheck ? provider22 : new DoubleCheck(provider22);
            final Provider appModule_ProvideReleaseApiFactory = new AppModule_ProvideReleaseApiFactory(appModule, this.f25462b);
            appModule_ProvideReleaseApiFactory = appModule_ProvideReleaseApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseApiFactory : new DoubleCheck(appModule_ProvideReleaseApiFactory);
            this.f25534z = appModule_ProvideReleaseApiFactory;
            final Provider<Prefs> provider23 = this.f25468d;
            Provider provider24 = new Factory<ReleaseRepository>(repositoryModule, appModule_ProvideReleaseApiFactory, provider23) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReleasesRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25702a;

                /* renamed from: b */
                public final Provider<ReleaseApi> f25703b;

                /* renamed from: c */
                public final Provider<Prefs> f25704c;

                {
                    this.f25702a = repositoryModule;
                    this.f25703b = appModule_ProvideReleaseApiFactory;
                    this.f25704c = provider23;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25702a;
                    ReleaseApi releaseApi = this.f25703b.get();
                    Prefs prefs = this.f25704c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(releaseApi, "releaseApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ReleaseRepository(releaseApi, prefs);
                }
            };
            this.f25400A = provider24 instanceof DoubleCheck ? provider24 : new DoubleCheck(provider24);
            Provider appModule_ProvideProfileApiFactory = new AppModule_ProvideProfileApiFactory(appModule, this.f25462b);
            this.f25403B = appModule_ProvideProfileApiFactory instanceof DoubleCheck ? appModule_ProvideProfileApiFactory : new DoubleCheck(appModule_ProvideProfileApiFactory);
            Provider appModule_ProvideProfileFriendApiFactory = new AppModule_ProvideProfileFriendApiFactory(appModule, this.f25462b);
            this.f25406C = appModule_ProvideProfileFriendApiFactory instanceof DoubleCheck ? appModule_ProvideProfileFriendApiFactory : new DoubleCheck(appModule_ProvideProfileFriendApiFactory);
            Provider appModule_ProvideProfileBlockListApiFactory = new AppModule_ProvideProfileBlockListApiFactory(appModule, this.f25462b);
            this.f25409D = appModule_ProvideProfileBlockListApiFactory instanceof DoubleCheck ? appModule_ProvideProfileBlockListApiFactory : new DoubleCheck(appModule_ProvideProfileBlockListApiFactory);
            final Provider<ProfileApi> provider25 = this.f25403B;
            final Provider<ProfileFriendApi> provider26 = this.f25406C;
            final Provider<ProfileBlockListApi> provider27 = this.f25409D;
            final Provider<Prefs> provider28 = this.f25468d;
            Provider provider29 = new Factory<ProfileRepository>(repositoryModule, provider25, provider26, provider27, provider28) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideProfileRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25682a;

                /* renamed from: b */
                public final Provider<ProfileApi> f25683b;

                /* renamed from: c */
                public final Provider<ProfileFriendApi> f25684c;

                /* renamed from: d */
                public final Provider<ProfileBlockListApi> f25685d;

                /* renamed from: e */
                public final Provider<Prefs> f25686e;

                {
                    this.f25682a = repositoryModule;
                    this.f25683b = provider25;
                    this.f25684c = provider26;
                    this.f25685d = provider27;
                    this.f25686e = provider28;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25682a;
                    ProfileApi profileApi = this.f25683b.get();
                    ProfileFriendApi profileFriendApi = this.f25684c.get();
                    ProfileBlockListApi profileBlockListApi = this.f25685d.get();
                    Prefs prefs = this.f25686e.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(profileApi, "profileApi");
                    Intrinsics.m32179h(profileFriendApi, "profileFriendApi");
                    Intrinsics.m32179h(profileBlockListApi, "profileBlockListApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ProfileRepository(profileApi, profileFriendApi, profileBlockListApi, prefs);
                }
            };
            this.f25412E = provider29 instanceof DoubleCheck ? provider29 : new DoubleCheck(provider29);
            final Provider appModule_ProvideProfilePreferenceApiFactory = new AppModule_ProvideProfilePreferenceApiFactory(appModule, this.f25462b);
            appModule_ProvideProfilePreferenceApiFactory = appModule_ProvideProfilePreferenceApiFactory instanceof DoubleCheck ? appModule_ProvideProfilePreferenceApiFactory : new DoubleCheck(appModule_ProvideProfilePreferenceApiFactory);
            this.f25415F = appModule_ProvideProfilePreferenceApiFactory;
            final Provider<Prefs> provider30 = this.f25468d;
            Provider provider31 = new Factory<ProfilePreferenceRepository>(repositoryModule, appModule_ProvideProfilePreferenceApiFactory, provider30) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideProfilePreferenceRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25676a;

                /* renamed from: b */
                public final Provider<ProfilePreferenceApi> f25677b;

                /* renamed from: c */
                public final Provider<Prefs> f25678c;

                {
                    this.f25676a = repositoryModule;
                    this.f25677b = appModule_ProvideProfilePreferenceApiFactory;
                    this.f25678c = provider30;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25676a;
                    ProfilePreferenceApi profilePreferenceApi = this.f25677b.get();
                    Prefs prefs = this.f25678c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(profilePreferenceApi, "profilePreferenceApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ProfilePreferenceRepository(profilePreferenceApi, prefs);
                }
            };
            this.f25418G = provider31 instanceof DoubleCheck ? provider31 : new DoubleCheck(provider31);
            Provider appModule_ProvideCollectionApiFactory = new AppModule_ProvideCollectionApiFactory(appModule, this.f25462b);
            this.f25421H = appModule_ProvideCollectionApiFactory instanceof DoubleCheck ? appModule_ProvideCollectionApiFactory : new DoubleCheck(appModule_ProvideCollectionApiFactory);
            Provider appModule_ProvideCollectionMyApiFactory = new AppModule_ProvideCollectionMyApiFactory(appModule, this.f25462b);
            this.f25423I = appModule_ProvideCollectionMyApiFactory instanceof DoubleCheck ? appModule_ProvideCollectionMyApiFactory : new DoubleCheck(appModule_ProvideCollectionMyApiFactory);
            Provider appModule_ProvideFavoriteCollectionApiFactory = new AppModule_ProvideFavoriteCollectionApiFactory(appModule, this.f25462b);
            this.f25425J = appModule_ProvideFavoriteCollectionApiFactory instanceof DoubleCheck ? appModule_ProvideFavoriteCollectionApiFactory : new DoubleCheck(appModule_ProvideFavoriteCollectionApiFactory);
            final Provider<CollectionApi> provider32 = this.f25421H;
            final Provider<CollectionMyApi> provider33 = this.f25423I;
            final Provider<CollectionFavoriteApi> provider34 = this.f25425J;
            final Provider<Prefs> provider35 = this.f25468d;
            Provider provider36 = new Factory<CollectionRepository>(repositoryModule, provider32, provider33, provider34, provider35) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideCollectionRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25630a;

                /* renamed from: b */
                public final Provider<CollectionApi> f25631b;

                /* renamed from: c */
                public final Provider<CollectionMyApi> f25632c;

                /* renamed from: d */
                public final Provider<CollectionFavoriteApi> f25633d;

                /* renamed from: e */
                public final Provider<Prefs> f25634e;

                {
                    this.f25630a = repositoryModule;
                    this.f25631b = provider32;
                    this.f25632c = provider33;
                    this.f25633d = provider34;
                    this.f25634e = provider35;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25630a;
                    CollectionApi collectionApi = this.f25631b.get();
                    CollectionMyApi collectionMyApi = this.f25632c.get();
                    CollectionFavoriteApi collectionFavoriteApi = this.f25633d.get();
                    Prefs prefs = this.f25634e.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(collectionApi, "collectionApi");
                    Intrinsics.m32179h(collectionMyApi, "collectionMyApi");
                    Intrinsics.m32179h(collectionFavoriteApi, "collectionFavoriteApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new CollectionRepository(collectionApi, collectionMyApi, collectionFavoriteApi, prefs);
                }
            };
            this.f25427K = provider36 instanceof DoubleCheck ? provider36 : new DoubleCheck(provider36);
            final Provider appModule_ProvideNotificationsApiFactory = new AppModule_ProvideNotificationsApiFactory(appModule, this.f25462b);
            appModule_ProvideNotificationsApiFactory = appModule_ProvideNotificationsApiFactory instanceof DoubleCheck ? appModule_ProvideNotificationsApiFactory : new DoubleCheck(appModule_ProvideNotificationsApiFactory);
            this.f25429L = appModule_ProvideNotificationsApiFactory;
            final Provider<Prefs> provider37 = this.f25468d;
            Provider provider38 = new Factory<NotificationRepository>(repositoryModule, appModule_ProvideNotificationsApiFactory, provider37) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideNotificationsRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25673a;

                /* renamed from: b */
                public final Provider<NotificationApi> f25674b;

                /* renamed from: c */
                public final Provider<Prefs> f25675c;

                {
                    this.f25673a = repositoryModule;
                    this.f25674b = appModule_ProvideNotificationsApiFactory;
                    this.f25675c = provider37;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25673a;
                    NotificationApi notificationApi = this.f25674b.get();
                    Prefs prefs = this.f25675c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(notificationApi, "notificationApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new NotificationRepository(notificationApi, prefs);
                }
            };
            this.f25431M = provider38 instanceof DoubleCheck ? provider38 : new DoubleCheck(provider38);
            this.f25433N = new MainPresenter_Factory(this.f25492l, this.f25483i, this.f25531y, this.f25400A, this.f25412E, this.f25418G, this.f25427K, this.f25431M, this.f25468d);
            Provider appModule_ProvideFilterApiFactory = new AppModule_ProvideFilterApiFactory(appModule, this.f25462b);
            this.f25435O = appModule_ProvideFilterApiFactory instanceof DoubleCheck ? appModule_ProvideFilterApiFactory : new DoubleCheck(appModule_ProvideFilterApiFactory);
            final Provider<DataManager> provider39 = this.f25471e;
            Provider provider40 = new Factory<CustomFilterDao>(roomModule, provider39) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideCustomFilterDao$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25717a;

                /* renamed from: b */
                public final Provider<DataManager> f25718b;

                {
                    this.f25717a = roomModule;
                    this.f25718b = provider39;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RoomModule roomModule2 = this.f25717a;
                    DataManager dataManager = this.f25718b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(dataManager, "dataManager");
                    CustomFilterDao customFilterDao = dataManager.getCustomFilterDao();
                    Objects.requireNonNull(customFilterDao, "Cannot return null from a non-@Nullable @Provides method");
                    return customFilterDao;
                }
            };
            this.f25437P = provider40 instanceof DoubleCheck ? provider40 : new DoubleCheck(provider40);
            final Provider<FilterApi> provider41 = this.f25435O;
            final Provider<CustomFilterDao> provider42 = this.f25437P;
            final Provider<Prefs> provider43 = this.f25468d;
            Provider provider44 = new Factory<HomeRepository>(repositoryModule, provider41, provider42, provider43) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideHomeRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25657a;

                /* renamed from: b */
                public final Provider<FilterApi> f25658b;

                /* renamed from: c */
                public final Provider<CustomFilterDao> f25659c;

                /* renamed from: d */
                public final Provider<Prefs> f25660d;

                {
                    this.f25657a = repositoryModule;
                    this.f25658b = provider41;
                    this.f25659c = provider42;
                    this.f25660d = provider43;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25657a;
                    FilterApi filterApi = this.f25658b.get();
                    CustomFilterDao customFilterDao = this.f25659c.get();
                    Prefs prefs = this.f25660d.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(filterApi, "filterApi");
                    Intrinsics.m32179h(customFilterDao, "customFilterDao");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new HomeRepository(filterApi, customFilterDao, prefs);
                }
            };
            provider44 = provider44 instanceof DoubleCheck ? provider44 : new DoubleCheck(provider44);
            this.f25439Q = provider44;
            this.f25441R = new HomePresenter_Factory(provider44, this.f25468d);
            this.f25443S = new HomeTabPresenter_Factory(this.f25439Q, this.f25468d);
            final Provider<FilterApi> provider45 = this.f25435O;
            final Provider<Prefs> provider46 = this.f25468d;
            Provider provider47 = new Factory<FilterRepository>(repositoryModule, provider45, provider46) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideFilterRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25654a;

                /* renamed from: b */
                public final Provider<FilterApi> f25655b;

                /* renamed from: c */
                public final Provider<Prefs> f25656c;

                {
                    this.f25654a = repositoryModule;
                    this.f25655b = provider45;
                    this.f25656c = provider46;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25654a;
                    FilterApi filterApi = this.f25655b.get();
                    Prefs prefs = this.f25656c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(filterApi, "filterApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new FilterRepository(filterApi, prefs);
                }
            };
            this.f25445T = provider47 instanceof DoubleCheck ? provider47 : new DoubleCheck(provider47);
            this.f25447U = new CustomFilterTabPresenter_Factory(this.f25439Q, this.f25445T, this.f25468d);
            this.f25449V = new BookmarksPresenter_Factory(this.f25468d);
            final Provider<HistoryApi> provider48 = this.f25519u;
            final Provider<FavoriteApi> provider49 = this.f25522v;
            final Provider<ProfileListApi> provider50 = this.f25528x;
            final Provider<Prefs> provider51 = this.f25468d;
            Provider provider52 = new Factory<BookmarksRepository>(repositoryModule, provider48, provider49, provider50, provider51) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideBookmarksRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25622a;

                /* renamed from: b */
                public final Provider<HistoryApi> f25623b;

                /* renamed from: c */
                public final Provider<FavoriteApi> f25624c;

                /* renamed from: d */
                public final Provider<ProfileListApi> f25625d;

                /* renamed from: e */
                public final Provider<Prefs> f25626e;

                {
                    this.f25622a = repositoryModule;
                    this.f25623b = provider48;
                    this.f25624c = provider49;
                    this.f25625d = provider50;
                    this.f25626e = provider51;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25622a;
                    HistoryApi historyApi = this.f25623b.get();
                    FavoriteApi favoriteApi = this.f25624c.get();
                    ProfileListApi profileListApi = this.f25625d.get();
                    Prefs prefs = this.f25626e.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(historyApi, "historyApi");
                    Intrinsics.m32179h(favoriteApi, "favoriteApi");
                    Intrinsics.m32179h(profileListApi, "profileListApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new BookmarksRepository(historyApi, favoriteApi, profileListApi, prefs);
                }
            };
            provider52 = provider52 instanceof DoubleCheck ? provider52 : new DoubleCheck(provider52);
            this.f25451W = provider52;
            this.f25453X = new BookmarksTabPresenter_Factory(provider52, this.f25427K, this.f25468d);
            final Provider appModule_ProvideCoverApiFactory = new AppModule_ProvideCoverApiFactory(appModule, this.f25462b);
            appModule_ProvideCoverApiFactory = appModule_ProvideCoverApiFactory instanceof DoubleCheck ? appModule_ProvideCoverApiFactory : new DoubleCheck(appModule_ProvideCoverApiFactory);
            this.f25455Y = appModule_ProvideCoverApiFactory;
            final Provider<Prefs> provider53 = this.f25468d;
            Provider provider54 = new Factory<DiscoverRepository>(repositoryModule, appModule_ProvideCoverApiFactory, provider53) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideDiscoverRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25641a;

                /* renamed from: b */
                public final Provider<DiscoverApi> f25642b;

                /* renamed from: c */
                public final Provider<Prefs> f25643c;

                {
                    this.f25641a = repositoryModule;
                    this.f25642b = appModule_ProvideCoverApiFactory;
                    this.f25643c = provider53;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25641a;
                    DiscoverApi discoverApi = this.f25642b.get();
                    Prefs prefs = this.f25643c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(discoverApi, "discoverApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new DiscoverRepository(discoverApi, prefs);
                }
            };
            provider54 = provider54 instanceof DoubleCheck ? provider54 : new DoubleCheck(provider54);
            this.f25457Z = provider54;
            this.f25460a0 = new DiscoverPresenter_Factory(provider54, this.f25427K, this.f25468d);
            final Provider appModule_ProvideNotificationPreferenceApiFactory = new AppModule_ProvideNotificationPreferenceApiFactory(appModule, this.f25462b);
            appModule_ProvideNotificationPreferenceApiFactory = appModule_ProvideNotificationPreferenceApiFactory instanceof DoubleCheck ? appModule_ProvideNotificationPreferenceApiFactory : new DoubleCheck(appModule_ProvideNotificationPreferenceApiFactory);
            this.f25463b0 = appModule_ProvideNotificationPreferenceApiFactory;
            final Provider<Prefs> provider55 = this.f25468d;
            Provider provider56 = new Factory<NotificationPreferenceRepository>(repositoryModule, appModule_ProvideNotificationPreferenceApiFactory, provider55) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideNotificationPreferenceRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25670a;

                /* renamed from: b */
                public final Provider<NotificationPreferenceApi> f25671b;

                /* renamed from: c */
                public final Provider<Prefs> f25672c;

                {
                    this.f25670a = repositoryModule;
                    this.f25671b = appModule_ProvideNotificationPreferenceApiFactory;
                    this.f25672c = provider55;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25670a;
                    NotificationPreferenceApi notificationPreferenceApi = this.f25671b.get();
                    Prefs prefs = this.f25672c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(notificationPreferenceApi, "notificationPreferenceApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new NotificationPreferenceRepository(notificationPreferenceApi, prefs);
                }
            };
            provider56 = provider56 instanceof DoubleCheck ? provider56 : new DoubleCheck(provider56);
            this.f25466c0 = provider56;
            this.f25469d0 = new NotificationsPresenter_Factory(provider56, this.f25431M, this.f25468d);
            final Provider appModule_ProvideTypeApiFactory = new AppModule_ProvideTypeApiFactory(appModule, this.f25462b);
            appModule_ProvideTypeApiFactory = appModule_ProvideTypeApiFactory instanceof DoubleCheck ? appModule_ProvideTypeApiFactory : new DoubleCheck(appModule_ProvideTypeApiFactory);
            this.f25472e0 = appModule_ProvideTypeApiFactory;
            final Provider<Prefs> provider57 = this.f25468d;
            Provider provider58 = new Factory<TypeRepository>(repositoryModule, appModule_ProvideTypeApiFactory, provider57) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideTypeRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25714a;

                /* renamed from: b */
                public final Provider<TypeApi> f25715b;

                /* renamed from: c */
                public final Provider<Prefs> f25716c;

                {
                    this.f25714a = repositoryModule;
                    this.f25715b = appModule_ProvideTypeApiFactory;
                    this.f25716c = provider57;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25714a;
                    TypeApi typeApi = this.f25715b.get();
                    Prefs prefs = this.f25716c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(typeApi, "typeApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new TypeRepository(typeApi, prefs);
                }
            };
            this.f25475f0 = provider58 instanceof DoubleCheck ? provider58 : new DoubleCheck(provider58);
            this.f25478g0 = new NotificationsPreferencePresenter_Factory(this.f25483i, this.f25475f0, this.f25466c0, this.f25468d);
            this.f25481h0 = new WatchingPresenter_Factory(this.f25457Z, this.f25468d);
            this.f25484i0 = new RecommendationPresenter_Factory(this.f25457Z, this.f25468d);
            this.f25487j0 = new TopTabPresenter_Factory(this.f25445T);
            this.f25490k0 = new ProfilePresenter_Factory(this.f25412E, this.f25468d);
            this.f25493l0 = new ProfileSocialPresenter_Factory(this.f25483i, this.f25418G, this.f25468d);
            this.f25496m0 = new ProfilePreferencePresenter_Factory(this.f25483i, this.f25418G, this.f25468d);
            final Provider appModule_ProvideReleaseCommentApiFactory = new AppModule_ProvideReleaseCommentApiFactory(appModule, this.f25462b);
            appModule_ProvideReleaseCommentApiFactory = appModule_ProvideReleaseCommentApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseCommentApiFactory : new DoubleCheck(appModule_ProvideReleaseCommentApiFactory);
            this.f25499n0 = appModule_ProvideReleaseCommentApiFactory;
            final Provider<Prefs> provider59 = this.f25468d;
            Provider provider60 = new Factory<ReleaseCommentRepository>(repositoryModule, appModule_ProvideReleaseCommentApiFactory, provider59) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReleaseCommentsRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25690a;

                /* renamed from: b */
                public final Provider<ReleaseCommentApi> f25691b;

                /* renamed from: c */
                public final Provider<Prefs> f25692c;

                {
                    this.f25690a = repositoryModule;
                    this.f25691b = appModule_ProvideReleaseCommentApiFactory;
                    this.f25692c = provider59;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25690a;
                    ReleaseCommentApi releaseCommentApi = this.f25691b.get();
                    Prefs prefs = this.f25692c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(releaseCommentApi, "releaseCommentApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ReleaseCommentRepository(releaseCommentApi, prefs);
                }
            };
            this.f25502o0 = provider60 instanceof DoubleCheck ? provider60 : new DoubleCheck(provider60);
            final Provider appModule_ProvideCollectionCommentApiFactory = new AppModule_ProvideCollectionCommentApiFactory(appModule, this.f25462b);
            appModule_ProvideCollectionCommentApiFactory = appModule_ProvideCollectionCommentApiFactory instanceof DoubleCheck ? appModule_ProvideCollectionCommentApiFactory : new DoubleCheck(appModule_ProvideCollectionCommentApiFactory);
            this.f25505p0 = appModule_ProvideCollectionCommentApiFactory;
            final Provider<Prefs> provider61 = this.f25468d;
            Provider provider62 = new Factory<CollectionCommentRepository>(repositoryModule, appModule_ProvideCollectionCommentApiFactory, provider61) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideCollectionCommentsRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25627a;

                /* renamed from: b */
                public final Provider<CollectionCommentApi> f25628b;

                /* renamed from: c */
                public final Provider<Prefs> f25629c;

                {
                    this.f25627a = repositoryModule;
                    this.f25628b = appModule_ProvideCollectionCommentApiFactory;
                    this.f25629c = provider61;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25627a;
                    CollectionCommentApi collectionCommentApi = this.f25628b.get();
                    Prefs prefs = this.f25629c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(collectionCommentApi, "collectionCommentApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new CollectionCommentRepository(collectionCommentApi, prefs);
                }
            };
            this.f25508q0 = provider62 instanceof DoubleCheck ? provider62 : new DoubleCheck(provider62);
            this.f25511r0 = new ProfileCommentsTabPresenter_Factory(this.f25502o0, this.f25508q0, this.f25468d);
            this.f25514s0 = new ProfileFriendsPresenter_Factory(this.f25412E, this.f25468d);
            this.f25517t0 = new ProfileFriendRequestsPresenter_Factory(this.f25412E, this.f25468d);
            this.f25520u0 = new ProfileOutFriendRequestsPresenter_Factory(this.f25412E, this.f25468d);
            this.f25523v0 = new ProfileBlockListPresenter_Factory(this.f25412E, this.f25468d);
            this.f25526w0 = new ProfileListsTabPresenter_Factory(this.f25451W, this.f25468d);
            final Provider appModule_ProvideProfileReleaseVoteApiFactory = new AppModule_ProvideProfileReleaseVoteApiFactory(appModule, this.f25462b);
            appModule_ProvideProfileReleaseVoteApiFactory = appModule_ProvideProfileReleaseVoteApiFactory instanceof DoubleCheck ? appModule_ProvideProfileReleaseVoteApiFactory : new DoubleCheck(appModule_ProvideProfileReleaseVoteApiFactory);
            this.f25529x0 = appModule_ProvideProfileReleaseVoteApiFactory;
            final Provider<Prefs> provider63 = this.f25468d;
            Provider provider64 = new Factory<ProfileReleaseVoteRepository>(repositoryModule, appModule_ProvideProfileReleaseVoteApiFactory, provider63) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideProfileReleaseVoteRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25679a;

                /* renamed from: b */
                public final Provider<ProfileReleaseVoteApi> f25680b;

                /* renamed from: c */
                public final Provider<Prefs> f25681c;

                {
                    this.f25679a = repositoryModule;
                    this.f25680b = appModule_ProvideProfileReleaseVoteApiFactory;
                    this.f25681c = provider63;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25679a;
                    ProfileReleaseVoteApi profileReleaseVoteApi = this.f25680b.get();
                    Prefs prefs = this.f25681c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(profileReleaseVoteApi, "profileReleaseVoteApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ProfileReleaseVoteRepository(profileReleaseVoteApi, prefs);
                }
            };
            provider64 = provider64 instanceof DoubleCheck ? provider64 : new DoubleCheck(provider64);
            this.f25532y0 = provider64;
            this.f25535z0 = new ProfileReleaseVotePresenter_Factory(provider64, this.f25468d);
            this.f25401A0 = new ProfileReleaseUnvotedPresenter_Factory(this.f25532y0, this.f25468d);
            this.f25404B0 = new ProfileChangeLoginHistoryPresenter_Factory(this.f25412E, this.f25468d);
            this.f25407C0 = new ChangeLoginPreferencePresenter_Factory(this.f25418G, this.f25483i, this.f25412E, this.f25468d);
            Provider appModule_ProvideSearchApiFactory = new AppModule_ProvideSearchApiFactory(appModule, this.f25462b);
            this.f25410D0 = appModule_ProvideSearchApiFactory instanceof DoubleCheck ? appModule_ProvideSearchApiFactory : new DoubleCheck(appModule_ProvideSearchApiFactory);
            final Provider<DataManager> provider65 = this.f25471e;
            Provider provider66 = new Factory<SearchDao>(roomModule, provider65) { // from class: com.swiftsoft.anixartd.dagger.module.RoomModule_ProvideSearchDao$app_releaseFactory

                /* renamed from: a */
                public final RoomModule f25725a;

                /* renamed from: b */
                public final Provider<DataManager> f25726b;

                {
                    this.f25725a = roomModule;
                    this.f25726b = provider65;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RoomModule roomModule2 = this.f25725a;
                    DataManager dataManager = this.f25726b.get();
                    Objects.requireNonNull(roomModule2);
                    Intrinsics.m32179h(dataManager, "dataManager");
                    SearchDao searchDao = dataManager.getSearchDao();
                    Objects.requireNonNull(searchDao, "Cannot return null from a non-@Nullable @Provides method");
                    return searchDao;
                }
            };
            this.f25413E0 = provider66 instanceof DoubleCheck ? provider66 : new DoubleCheck(provider66);
            final Provider<SearchApi> provider67 = this.f25410D0;
            final Provider<Prefs> provider68 = this.f25468d;
            final Provider<SearchDao> provider69 = this.f25413E0;
            Provider provider70 = new Factory<SearchRepository>(repositoryModule, provider67, provider68, provider69) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideSearchRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25710a;

                /* renamed from: b */
                public final Provider<SearchApi> f25711b;

                /* renamed from: c */
                public final Provider<Prefs> f25712c;

                /* renamed from: d */
                public final Provider<SearchDao> f25713d;

                {
                    this.f25710a = repositoryModule;
                    this.f25711b = provider67;
                    this.f25712c = provider68;
                    this.f25713d = provider69;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25710a;
                    SearchApi searchApi = this.f25711b.get();
                    Prefs prefs = this.f25712c.get();
                    SearchDao searchDao = this.f25713d.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(searchApi, "searchApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    Intrinsics.m32179h(searchDao, "searchDao");
                    return new SearchRepository(searchApi, prefs, searchDao);
                }
            };
            provider70 = provider70 instanceof DoubleCheck ? provider70 : new DoubleCheck(provider70);
            this.f25416F0 = provider70;
            this.f25419G0 = new SearchPresenter_Factory(provider70, this.f25468d);
            this.f25422H0 = new FilterPresenter_Factory(this.f25439Q, this.f25475f0, this.f25468d);
            this.f25424I0 = new FilteredPresenter_Factory(this.f25445T, this.f25468d);
            this.f25426J0 = new ReleasePresenter_Factory(this.f25483i, this.f25475f0, this.f25400A, this.f25502o0, this.f25427K, this.f25466c0, this.f25468d);
            Provider appModule_ProvideEpisodeApiFactory = new AppModule_ProvideEpisodeApiFactory(appModule, this.f25462b);
            this.f25428K0 = appModule_ProvideEpisodeApiFactory instanceof DoubleCheck ? appModule_ProvideEpisodeApiFactory : new DoubleCheck(appModule_ProvideEpisodeApiFactory);
            Provider appModule_ProvideDirectLinkApiFactory = new AppModule_ProvideDirectLinkApiFactory(appModule, this.f25462b);
            this.f25430L0 = appModule_ProvideDirectLinkApiFactory instanceof DoubleCheck ? appModule_ProvideDirectLinkApiFactory : new DoubleCheck(appModule_ProvideDirectLinkApiFactory);
            final Provider<HistoryApi> provider71 = this.f25519u;
            final Provider<EpisodeApi> provider72 = this.f25428K0;
            final Provider<DirectLinkApi> provider73 = this.f25430L0;
            final Provider<Prefs> provider74 = this.f25468d;
            final Provider<EpisodeDao> provider75 = this.f25477g;
            final Provider<LastWatchedEpisodeDao> provider76 = this.f25480h;
            Provider provider77 = new Factory<EpisodeRepository>(repositoryModule, provider71, provider72, provider73, provider74, provider75, provider76) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideEpisodesRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25644a;

                /* renamed from: b */
                public final Provider<HistoryApi> f25645b;

                /* renamed from: c */
                public final Provider<EpisodeApi> f25646c;

                /* renamed from: d */
                public final Provider<DirectLinkApi> f25647d;

                /* renamed from: e */
                public final Provider<Prefs> f25648e;

                /* renamed from: f */
                public final Provider<EpisodeDao> f25649f;

                /* renamed from: g */
                public final Provider<LastWatchedEpisodeDao> f25650g;

                {
                    this.f25644a = repositoryModule;
                    this.f25645b = provider71;
                    this.f25646c = provider72;
                    this.f25647d = provider73;
                    this.f25648e = provider74;
                    this.f25649f = provider75;
                    this.f25650g = provider76;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25644a;
                    HistoryApi historyApi = this.f25645b.get();
                    EpisodeApi episodeApi = this.f25646c.get();
                    DirectLinkApi directLinkApi = this.f25647d.get();
                    Prefs prefs = this.f25648e.get();
                    EpisodeDao episodeDao = this.f25649f.get();
                    LastWatchedEpisodeDao lastWatchedEpisodeDao = this.f25650g.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(historyApi, "historyApi");
                    Intrinsics.m32179h(episodeApi, "episodeApi");
                    Intrinsics.m32179h(directLinkApi, "directLinkApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    Intrinsics.m32179h(episodeDao, "episodeDao");
                    Intrinsics.m32179h(lastWatchedEpisodeDao, "lastWatchedEpisodeDao");
                    return new EpisodeRepository(historyApi, episodeApi, directLinkApi, prefs, episodeDao, lastWatchedEpisodeDao);
                }
            };
            provider77 = provider77 instanceof DoubleCheck ? provider77 : new DoubleCheck(provider77);
            this.f25432M0 = provider77;
            this.f25434N0 = new EpisodesPresenter_Factory(provider77, this.f25468d);
            this.f25436O0 = new EpisodesUpdatesPresenter_Factory(this.f25432M0, this.f25468d);
            this.f25438P0 = new TorlookPresenter_Factory(this.f25468d);
            final Provider appModule_ProvideRelatedApiFactory = new AppModule_ProvideRelatedApiFactory(appModule, this.f25462b);
            appModule_ProvideRelatedApiFactory = appModule_ProvideRelatedApiFactory instanceof DoubleCheck ? appModule_ProvideRelatedApiFactory : new DoubleCheck(appModule_ProvideRelatedApiFactory);
            this.f25440Q0 = appModule_ProvideRelatedApiFactory;
            final Provider<Prefs> provider78 = this.f25468d;
            Provider provider79 = new Factory<RelatedRepository>(repositoryModule, appModule_ProvideRelatedApiFactory, provider78) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideRelatedRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25687a;

                /* renamed from: b */
                public final Provider<RelatedApi> f25688b;

                /* renamed from: c */
                public final Provider<Prefs> f25689c;

                {
                    this.f25687a = repositoryModule;
                    this.f25688b = appModule_ProvideRelatedApiFactory;
                    this.f25689c = provider78;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25687a;
                    RelatedApi relatedApi = this.f25688b.get();
                    Prefs prefs = this.f25689c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(relatedApi, "relatedApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new RelatedRepository(relatedApi, prefs);
                }
            };
            provider79 = provider79 instanceof DoubleCheck ? provider79 : new DoubleCheck(provider79);
            this.f25442R0 = provider79;
            this.f25444S0 = new RelatedPresenter_Factory(provider79, this.f25468d);
            final Provider appModule_ProvideReleaseVideosApiFactory = new AppModule_ProvideReleaseVideosApiFactory(appModule, this.f25462b);
            appModule_ProvideReleaseVideosApiFactory = appModule_ProvideReleaseVideosApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseVideosApiFactory : new DoubleCheck(appModule_ProvideReleaseVideosApiFactory);
            this.f25446T0 = appModule_ProvideReleaseVideosApiFactory;
            final Provider<ReleaseVideoFavoriteApi> provider80 = this.f25525w;
            final Provider<Prefs> provider81 = this.f25468d;
            Provider provider82 = new Factory<ReleaseVideoRepository>(repositoryModule, appModule_ProvideReleaseVideosApiFactory, provider80, provider81) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReleaseVideoRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25698a;

                /* renamed from: b */
                public final Provider<ReleaseVideoApi> f25699b;

                /* renamed from: c */
                public final Provider<ReleaseVideoFavoriteApi> f25700c;

                /* renamed from: d */
                public final Provider<Prefs> f25701d;

                {
                    this.f25698a = repositoryModule;
                    this.f25699b = appModule_ProvideReleaseVideosApiFactory;
                    this.f25700c = provider80;
                    this.f25701d = provider81;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25698a;
                    ReleaseVideoApi releaseVideoApi = this.f25699b.get();
                    ReleaseVideoFavoriteApi releaseVideoFavoriteApi = this.f25700c.get();
                    Prefs prefs = this.f25701d.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(releaseVideoApi, "releaseVideoApi");
                    Intrinsics.m32179h(releaseVideoFavoriteApi, "releaseVideoFavoriteApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ReleaseVideoRepository(releaseVideoApi, releaseVideoFavoriteApi, prefs);
                }
            };
            provider82 = provider82 instanceof DoubleCheck ? provider82 : new DoubleCheck(provider82);
            this.f25448U0 = provider82;
            this.f25450V0 = new ReleaseVideosPresenter_Factory(provider82, this.f25468d);
            this.f25452W0 = new ReleaseVideoCategoryPresenter_Factory(this.f25448U0, this.f25468d);
            final Provider appModule_ProvideReleaseVideoAppealApiFactory = new AppModule_ProvideReleaseVideoAppealApiFactory(appModule, this.f25462b);
            Object obj2 = DoubleCheck.f58002c;
            appModule_ProvideReleaseVideoAppealApiFactory = appModule_ProvideReleaseVideoAppealApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseVideoAppealApiFactory : new DoubleCheck(appModule_ProvideReleaseVideoAppealApiFactory);
            this.f25454X0 = appModule_ProvideReleaseVideoAppealApiFactory;
            final Provider<Prefs> provider83 = this.f25468d;
            Provider provider84 = new Factory<ReleaseVideoAppealRepository>(repositoryModule, appModule_ProvideReleaseVideoAppealApiFactory, provider83) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReleaseVideoAppealRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25695a;

                /* renamed from: b */
                public final Provider<ReleaseVideoAppealApi> f25696b;

                /* renamed from: c */
                public final Provider<Prefs> f25697c;

                {
                    this.f25695a = repositoryModule;
                    this.f25696b = appModule_ProvideReleaseVideoAppealApiFactory;
                    this.f25697c = provider83;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25695a;
                    ReleaseVideoAppealApi releaseVideoAppealApi = this.f25696b.get();
                    Prefs prefs = this.f25697c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(releaseVideoAppealApi, "releaseVideoAppealApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ReleaseVideoAppealRepository(releaseVideoAppealApi, prefs);
                }
            };
            provider84 = provider84 instanceof DoubleCheck ? provider84 : new DoubleCheck(provider84);
            this.f25456Y0 = provider84;
            Provider<ReleaseVideoRepository> provider85 = this.f25448U0;
            Provider<Prefs> provider86 = this.f25468d;
            this.f25458Z0 = new ReleaseVideoAppealPresenter_Factory(provider85, provider84, provider86);
            this.f25461a1 = new ReleaseCommentsPresenter_Factory(this.f25502o0, provider86);
            this.f25464b1 = new ReleaseCollectionsPresenter_Factory(this.f25427K, provider86);
            this.f25467c1 = new CollectionCommentsPresenter_Factory(this.f25508q0, provider86);
            final Provider appModule_ProvideCommentVotesApiFactory = new AppModule_ProvideCommentVotesApiFactory(appModule, this.f25462b);
            appModule_ProvideCommentVotesApiFactory = appModule_ProvideCommentVotesApiFactory instanceof DoubleCheck ? appModule_ProvideCommentVotesApiFactory : new DoubleCheck(appModule_ProvideCommentVotesApiFactory);
            this.f25470d1 = appModule_ProvideCommentVotesApiFactory;
            final Provider<Prefs> provider87 = this.f25468d;
            Provider provider88 = new Factory<CommentVotesRepository>(repositoryModule, appModule_ProvideCommentVotesApiFactory, provider87) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideCommentVotesRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25635a;

                /* renamed from: b */
                public final Provider<CommentVotesApi> f25636b;

                /* renamed from: c */
                public final Provider<Prefs> f25637c;

                {
                    this.f25635a = repositoryModule;
                    this.f25636b = appModule_ProvideCommentVotesApiFactory;
                    this.f25637c = provider87;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25635a;
                    CommentVotesApi commentVotesApi = this.f25636b.get();
                    Prefs prefs = this.f25637c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(commentVotesApi, "commentVotesApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new CommentVotesRepository(commentVotesApi, prefs);
                }
            };
            provider88 = provider88 instanceof DoubleCheck ? provider88 : new DoubleCheck(provider88);
            this.f25473e1 = provider88;
            Provider<Prefs> provider89 = this.f25468d;
            this.f25476f1 = new CommentVotesPresenter_Factory(provider88, provider89);
            this.f25479g1 = new ReleaseCommentsRepliesPresenter_Factory(this.f25502o0, provider89);
            this.f25482h1 = new CollectionCommentsRepliesPresenter_Factory(this.f25508q0, provider89);
            final Provider appModule_ProvideReleaseStreamingPlatformApiFactory = new AppModule_ProvideReleaseStreamingPlatformApiFactory(appModule, this.f25462b);
            appModule_ProvideReleaseStreamingPlatformApiFactory = appModule_ProvideReleaseStreamingPlatformApiFactory instanceof DoubleCheck ? appModule_ProvideReleaseStreamingPlatformApiFactory : new DoubleCheck(appModule_ProvideReleaseStreamingPlatformApiFactory);
            this.f25485i1 = appModule_ProvideReleaseStreamingPlatformApiFactory;
            Provider provider90 = new Factory<ReleaseStreamingPlatformRepository>(repositoryModule, appModule_ProvideReleaseStreamingPlatformApiFactory) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReleaseStreamingPlatformRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25693a;

                /* renamed from: b */
                public final Provider<ReleaseStreamingPlatformApi> f25694b;

                {
                    this.f25693a = repositoryModule;
                    this.f25694b = appModule_ProvideReleaseStreamingPlatformApiFactory;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25693a;
                    ReleaseStreamingPlatformApi releaseStreamingPlatformApi = this.f25694b.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(releaseStreamingPlatformApi, "releaseStreamingPlatformApi");
                    return new ReleaseStreamingPlatformRepository(releaseStreamingPlatformApi);
                }
            };
            provider90 = provider90 instanceof DoubleCheck ? provider90 : new DoubleCheck(provider90);
            this.f25488j1 = provider90;
            this.f25491k1 = new ReleaseStreamingPlatformPresenter_Factory(provider90, this.f25468d);
            final Provider appModule_ProvideScheduleApiFactory = new AppModule_ProvideScheduleApiFactory(appModule, this.f25462b);
            appModule_ProvideScheduleApiFactory = appModule_ProvideScheduleApiFactory instanceof DoubleCheck ? appModule_ProvideScheduleApiFactory : new DoubleCheck(appModule_ProvideScheduleApiFactory);
            this.f25494l1 = appModule_ProvideScheduleApiFactory;
            Provider provider91 = new Factory<ScheduleRepository>(repositoryModule, appModule_ProvideScheduleApiFactory) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideScheduleRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25708a;

                /* renamed from: b */
                public final Provider<ScheduleApi> f25709b;

                {
                    this.f25708a = repositoryModule;
                    this.f25709b = appModule_ProvideScheduleApiFactory;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25708a;
                    ScheduleApi scheduleApi = this.f25709b.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(scheduleApi, "scheduleApi");
                    return new ScheduleRepository(scheduleApi);
                }
            };
            provider91 = provider91 instanceof DoubleCheck ? provider91 : new DoubleCheck(provider91);
            this.f25497m1 = provider91;
            Provider<Prefs> provider92 = this.f25468d;
            this.f25500n1 = new SchedulePresenter_Factory(provider91, provider92);
            this.f25503o1 = new ProfileReleaseNotificationPreferencesPresenter_Factory(this.f25475f0, this.f25466c0, provider92);
            this.f25506p1 = new MainPreferencePresenter_Factory(provider92);
            final Provider appModule_ProvideImportApiFactory = new AppModule_ProvideImportApiFactory(appModule, this.f25462b);
            appModule_ProvideImportApiFactory = appModule_ProvideImportApiFactory instanceof DoubleCheck ? appModule_ProvideImportApiFactory : new DoubleCheck(appModule_ProvideImportApiFactory);
            this.f25509q1 = appModule_ProvideImportApiFactory;
            final Provider<Prefs> provider93 = this.f25468d;
            Provider provider94 = new Factory<ImportRepository>(repositoryModule, appModule_ProvideImportApiFactory, provider93) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideImportRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25661a;

                /* renamed from: b */
                public final Provider<ImportApi> f25662b;

                /* renamed from: c */
                public final Provider<Prefs> f25663c;

                {
                    this.f25661a = repositoryModule;
                    this.f25662b = appModule_ProvideImportApiFactory;
                    this.f25663c = provider93;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25661a;
                    ImportApi importApi = this.f25662b.get();
                    Prefs prefs = this.f25663c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(importApi, "importApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ImportRepository(importApi, prefs);
                }
            };
            this.f25512r1 = provider94 instanceof DoubleCheck ? provider94 : new DoubleCheck(provider94);
            final Provider appModule_ProvideExportApiFactory = new AppModule_ProvideExportApiFactory(appModule, this.f25462b);
            appModule_ProvideExportApiFactory = appModule_ProvideExportApiFactory instanceof DoubleCheck ? appModule_ProvideExportApiFactory : new DoubleCheck(appModule_ProvideExportApiFactory);
            this.f25515s1 = appModule_ProvideExportApiFactory;
            final Provider<Prefs> provider95 = this.f25468d;
            Provider provider96 = new Factory<ExportRepository>(repositoryModule, appModule_ProvideExportApiFactory, provider95) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideExportRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25651a;

                /* renamed from: b */
                public final Provider<ExportApi> f25652b;

                /* renamed from: c */
                public final Provider<Prefs> f25653c;

                {
                    this.f25651a = repositoryModule;
                    this.f25652b = appModule_ProvideExportApiFactory;
                    this.f25653c = provider95;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25651a;
                    ExportApi exportApi = this.f25652b.get();
                    Prefs prefs = this.f25653c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(exportApi, "exportApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ExportRepository(exportApi, prefs);
                }
            };
            this.f25518t1 = provider96 instanceof DoubleCheck ? provider96 : new DoubleCheck(provider96);
            this.f25521u1 = new DataPreferencePresenter_Factory(this.f25512r1, this.f25518t1, this.f25468d);
            this.f25524v1 = new CollectionListPresenter_Factory(this.f25427K, this.f25468d);
            this.f25527w1 = new CollectionPresenter_Factory(this.f25427K, this.f25483i, this.f25468d);
            this.f25530x1 = new CollectionEditorPresenter_Factory(this.f25427K, this.f25468d);
            this.f25533y1 = new CollectionProfileListPresenter_Factory(this.f25427K, this.f25468d);
            this.f25536z1 = new ProfileReleaseVideosTabPresenter_Factory(this.f25448U0, this.f25456Y0, this.f25468d);
            this.f25402A1 = new ProfileReleaseVideoAppealsPresenter_Factory(this.f25456Y0, this.f25468d);
            final Provider appModule_ProvideReportApiFactory = new AppModule_ProvideReportApiFactory(appModule, this.f25462b);
            appModule_ProvideReportApiFactory = appModule_ProvideReportApiFactory instanceof DoubleCheck ? appModule_ProvideReportApiFactory : new DoubleCheck(appModule_ProvideReportApiFactory);
            this.f25405B1 = appModule_ProvideReportApiFactory;
            final Provider<Prefs> provider97 = this.f25468d;
            Provider provider98 = new Factory<ReportRepository>(repositoryModule, appModule_ProvideReportApiFactory, provider97) { // from class: com.swiftsoft.anixartd.dagger.module.RepositoryModule_ProvideReportRepository$app_releaseFactory

                /* renamed from: a */
                public final RepositoryModule f25705a;

                /* renamed from: b */
                public final Provider<ReportApi> f25706b;

                /* renamed from: c */
                public final Provider<Prefs> f25707c;

                {
                    this.f25705a = repositoryModule;
                    this.f25706b = appModule_ProvideReportApiFactory;
                    this.f25707c = provider97;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    RepositoryModule repositoryModule2 = this.f25705a;
                    ReportApi reportApi = this.f25706b.get();
                    Prefs prefs = this.f25707c.get();
                    Objects.requireNonNull(repositoryModule2);
                    Intrinsics.m32179h(reportApi, "reportApi");
                    Intrinsics.m32179h(prefs, "prefs");
                    return new ReportRepository(reportApi, prefs);
                }
            };
            provider98 = provider98 instanceof DoubleCheck ? provider98 : new DoubleCheck(provider98);
            this.f25408C1 = provider98;
            this.f25411D1 = new ReportPresenter_Factory(provider98, this.f25468d);
            this.f25414E1 = new ChooseGenresPresenter_Factory(this.f25468d);
            this.f25417F1 = new SwiftPlayerPresenter_Factory(this.f25432M0, this.f25468d);
            this.f25420G1 = new UpdatePresenter_Factory(this.f25492l, this.f25468d);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: A */
        public void mo14084A(MainPreferenceFragment mainPreferenceFragment) {
            mainPreferenceFragment.f28328o = DoubleCheck.m30790a(this.f25506p1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: A0 */
        public void mo14085A0(SignInFragment signInFragment) {
            signInFragment.f27813e = DoubleCheck.m30790a(this.f25498n);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: B */
        public void mo14086B(ProfileFragment profileFragment) {
            profileFragment.f28462f = DoubleCheck.m30790a(this.f25490k0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: C */
        public void mo14087C(ProfileChangeLoginHistoryFragment profileChangeLoginHistoryFragment) {
            profileChangeLoginHistoryFragment.f28450e = DoubleCheck.m30790a(this.f25404B0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: D */
        public void mo14088D(ProfileSocialFragment profileSocialFragment) {
            profileSocialFragment.f28491d = DoubleCheck.m30790a(this.f25493l0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: E */
        public void mo14089E(ProfileCommentsTabFragment profileCommentsTabFragment) {
            profileCommentsTabFragment.f28516f = DoubleCheck.m30790a(this.f25511r0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: F */
        public void mo14090F(RelatedFragment relatedFragment) {
            relatedFragment.f28639e = DoubleCheck.m30790a(this.f25444S0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: G */
        public void mo14091G(ProfileListsTabFragment profileListsTabFragment) {
            profileListsTabFragment.f28560f = DoubleCheck.m30790a(this.f25526w0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: H */
        public void mo14092H(ProfileReleaseUnvotedFragment profileReleaseUnvotedFragment) {
            profileReleaseUnvotedFragment.f28606d = DoubleCheck.m30790a(this.f25401A0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: I */
        public void mo14093I(KodikAdActivity kodikAdActivity) {
            kodikAdActivity.f27524b = this.f25468d.get();
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: J */
        public void mo14094J(NotificationsPreferenceFragment notificationsPreferenceFragment) {
            notificationsPreferenceFragment.f28338p = DoubleCheck.m30790a(this.f25478g0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: K */
        public void mo14095K(TopFragment topFragment) {
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: L */
        public void mo14096L(VerifyFragment verifyFragment) {
            verifyFragment.f27864c = DoubleCheck.m30790a(this.f25504p);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: M */
        public void mo14097M(ProfilePreferenceFragment profilePreferenceFragment) {
            profilePreferenceFragment.f28365q = DoubleCheck.m30790a(this.f25496m0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: N */
        public void mo14098N(SilentPushReceiver silentPushReceiver) {
            silentPushReceiver.f25776a = this.f25468d.get();
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: O */
        public void mo14099O(CollectionFragment collectionFragment) {
            collectionFragment.f27981e = DoubleCheck.m30790a(this.f25527w1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: P */
        public void mo14100P(WebPlayerActivity webPlayerActivity) {
            webPlayerActivity.f27601b = this.f25468d.get();
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: Q */
        public void mo14101Q(ChangeLoginPreferenceFragment changeLoginPreferenceFragment) {
            changeLoginPreferenceFragment.f28304e = DoubleCheck.m30790a(this.f25407C0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: R */
        public void mo14102R(ProfileFriendsFragment profileFriendsFragment) {
            profileFriendsFragment.f28538d = DoubleCheck.m30790a(this.f25514s0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: S */
        public void mo14103S(ProfileReleaseVideosFragment profileReleaseVideosFragment) {
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: T */
        public void mo14104T(RestoreFragment restoreFragment) {
            restoreFragment.f27791e = DoubleCheck.m30790a(this.f25507q);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: U */
        public void mo14105U(ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment) {
            releaseStreamingPlatformFragment.f28922d = DoubleCheck.m30790a(this.f25491k1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: V */
        public void mo14106V(ReleaseVideosFragment releaseVideosFragment) {
            releaseVideosFragment.f28830e = DoubleCheck.m30790a(this.f25450V0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: W */
        public void mo14107W(AppearancePreferenceFragment appearancePreferenceFragment) {
            appearancePreferenceFragment.f28298o = DoubleCheck.m30790a(this.f25506p1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: X */
        public void mo14108X(CollectionCommentsFragment collectionCommentsFragment) {
            collectionCommentsFragment.f27913e = DoubleCheck.m30790a(this.f25467c1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: Y */
        public void mo14109Y(TorlookFragment torlookFragment) {
            torlookFragment.f28121d = DoubleCheck.m30790a(this.f25438P0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: Z */
        public void mo14110Z(ProfileCommentsFragment profileCommentsFragment) {
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: a */
        public void mo14111a(FilterFragment filterFragment) {
            filterFragment.f28171d = DoubleCheck.m30790a(this.f25422H0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: a0 */
        public void mo14112a0(ProfileReleaseVideoAppealsFragment profileReleaseVideoAppealsFragment) {
            profileReleaseVideoAppealsFragment.f28570e = DoubleCheck.m30790a(this.f25402A1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: b */
        public void mo14113b(WatchingFragment watchingFragment) {
            watchingFragment.f28942e = DoubleCheck.m30790a(this.f25481h0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: b0 */
        public void mo14114b0(DiscoverFragment discoverFragment) {
            discoverFragment.f28065d = DoubleCheck.m30790a(this.f25460a0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: c */
        public void mo14115c(ProfileBlockListFragment profileBlockListFragment) {
            profileBlockListFragment.f28439d = DoubleCheck.m30790a(this.f25523v0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: c0 */
        public void mo14116c0(ProfileReleaseVideosAllFragment profileReleaseVideosAllFragment) {
            profileReleaseVideosAllFragment.f28581d = DoubleCheck.m30790a(this.f25536z1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: d */
        public void mo14117d(CollectionListFragment collectionListFragment) {
            collectionListFragment.f28002d = DoubleCheck.m30790a(this.f25524v1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: d0 */
        public void mo14118d0(CollectionEditorFragment collectionEditorFragment) {
            collectionEditorFragment.f27964e = DoubleCheck.m30790a(this.f25530x1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: e */
        public void mo14119e(BookmarksFragment bookmarksFragment) {
            bookmarksFragment.f27897f = DoubleCheck.m30790a(this.f25449V);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: e0 */
        public void mo14120e0(ProfileOutFriendRequestsFragment profileOutFriendRequestsFragment) {
            profileOutFriendRequestsFragment.f28548d = DoubleCheck.m30790a(this.f25520u0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: f */
        public void mo14121f(ProfileFriendRequestsFragment profileFriendRequestsFragment) {
            profileFriendRequestsFragment.f28528d = DoubleCheck.m30790a(this.f25517t0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: f0 */
        public void mo14122f0(ReleaseVideoAppealFragment releaseVideoAppealFragment) {
            releaseVideoAppealFragment.f28843e = DoubleCheck.m30790a(this.f25458Z0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: g */
        public void mo14123g(ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment) {
            releaseCommentsRepliesFragment.f28691e = DoubleCheck.m30790a(this.f25479g1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: g0 */
        public void mo14124g0(CustomFilterTabFragment customFilterTabFragment) {
            customFilterTabFragment.f28239d = DoubleCheck.m30790a(this.f25447U);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: h */
        public void mo14125h(RestoreVerifyFragment restoreVerifyFragment) {
            restoreVerifyFragment.f27801e = DoubleCheck.m30790a(this.f25510r);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: h0 */
        public void mo14126h0(FilteredFragment filteredFragment) {
            filteredFragment.f28214d = DoubleCheck.m30790a(this.f25424I0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: i */
        public void mo14127i(CommentVotesFragment commentVotesFragment) {
            commentVotesFragment.f28054f = DoubleCheck.m30790a(this.f25476f1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: i0 */
        public void mo14128i0(StartActivity startActivity) {
            startActivity.f27471b = DoubleCheck.m30790a(this.f25486j);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: j */
        public void mo14129j(ProfileReleaseNotificationPreferencesFragment profileReleaseNotificationPreferencesFragment) {
            profileReleaseNotificationPreferencesFragment.f28384e = DoubleCheck.m30790a(this.f25503o1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: j0 */
        public void mo14130j0(MainActivity mainActivity) {
            mainActivity.f27429e = DoubleCheck.m30790a(this.f25433N);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: k */
        public void mo14131k(ProfileListsFragment profileListsFragment) {
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: k0 */
        public void mo14132k0(SearchFragment searchFragment) {
            searchFragment.f28896d = DoubleCheck.m30790a(this.f25419G0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: l */
        public void mo14133l(App app) {
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: l0 */
        public void mo14134l0(EpisodesUpdatesFragment episodesUpdatesFragment) {
            episodesUpdatesFragment.f28141e = DoubleCheck.m30790a(this.f25436O0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: m */
        public void mo14135m(CollectionProfileListFragment collectionProfileListFragment) {
            collectionProfileListFragment.f28013d = DoubleCheck.m30790a(this.f25533y1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: m0 */
        public void mo14136m0(DataPreferenceFragment dataPreferenceFragment) {
            dataPreferenceFragment.f28319p = DoubleCheck.m30790a(this.f25521u1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: n */
        public void mo14137n(SignUpWithVkFragment signUpWithVkFragment) {
            signUpWithVkFragment.f27853f = DoubleCheck.m30790a(this.f25513s);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: n0 */
        public void mo14138n0(RecommendationFragment recommendationFragment) {
            recommendationFragment.f28627e = DoubleCheck.m30790a(this.f25484i0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: o */
        public void mo14139o(NotificationService notificationService) {
            notificationService.f25774b = this.f25483i.get();
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: o0 */
        public void mo14140o0(ReleaseCollectionsFragment releaseCollectionsFragment) {
            releaseCollectionsFragment.f28656e = DoubleCheck.m30790a(this.f25464b1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: p */
        public void mo14141p(BookmarksTabFragment bookmarksTabFragment) {
            bookmarksTabFragment.f27903f = DoubleCheck.m30790a(this.f25453X);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: p0 */
        public void mo14142p0(CollectionCommentsRepliesFragment collectionCommentsRepliesFragment) {
            collectionCommentsRepliesFragment.f27937e = DoubleCheck.m30790a(this.f25482h1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: q */
        public void mo14143q(ScheduleFragment scheduleFragment) {
            scheduleFragment.f28890d = DoubleCheck.m30790a(this.f25500n1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: q0 */
        public void mo14144q0(SignUpWithGoogleFragment signUpWithGoogleFragment) {
            signUpWithGoogleFragment.f27840g = DoubleCheck.m30790a(this.f25516t);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: r */
        public void mo14145r(PlaybackPreferenceFragment playbackPreferenceFragment) {
            playbackPreferenceFragment.f28354o = DoubleCheck.m30790a(this.f25506p1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: r0 */
        public void mo14146r0(ReleaseFragment releaseFragment) {
            releaseFragment.f28716d = DoubleCheck.m30790a(this.f25426J0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: s */
        public void mo14147s(ReleaseCommentsFragment releaseCommentsFragment) {
            releaseCommentsFragment.f28667e = DoubleCheck.m30790a(this.f25461a1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: s0 */
        public void mo14148s0(UpdateActivity updateActivity) {
            updateActivity.f27479e = DoubleCheck.m30790a(this.f25420G1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: t */
        public void mo14149t(TopTabFragment topTabFragment) {
            topTabFragment.f28934f = DoubleCheck.m30790a(this.f25487j0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: t0 */
        public void mo14150t0(ReportFragment reportFragment) {
            reportFragment.f28870e = DoubleCheck.m30790a(this.f25411D1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: u */
        public void mo14151u(NotificationsFragment notificationsFragment) {
            notificationsFragment.f28274d = DoubleCheck.m30790a(this.f25469d0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: u0 */
        public void mo14152u0(EpisodesFragment episodesFragment) {
            episodesFragment.f28086g = DoubleCheck.m30790a(this.f25434N0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: v */
        public void mo14153v(ProfileReleaseVoteFragment profileReleaseVoteFragment) {
            profileReleaseVoteFragment.f28617e = DoubleCheck.m30790a(this.f25535z0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: v0 */
        public void mo14154v0(AdditionalPreferenceFragment additionalPreferenceFragment) {
            additionalPreferenceFragment.f28290o = DoubleCheck.m30790a(this.f25506p1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: w */
        public void mo14155w(HomeTabFragment homeTabFragment) {
            homeTabFragment.f28260f = DoubleCheck.m30790a(this.f25443S);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: w0 */
        public void mo14156w0(ReleaseVideoCategoryFragment releaseVideoCategoryFragment) {
            releaseVideoCategoryFragment.f28858e = DoubleCheck.m30790a(this.f25452W0);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: x */
        public void mo14157x(HomeFragment homeFragment) {
            homeFragment.f28250f = DoubleCheck.m30790a(this.f25441R);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: x0 */
        public void mo14158x0(AuthActivity authActivity) {
            authActivity.f27410e = DoubleCheck.m30790a(this.f25495m);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: y */
        public void mo14159y(ProfileReleaseVideosTabFragment profileReleaseVideosTabFragment) {
            profileReleaseVideosTabFragment.f28594f = DoubleCheck.m30790a(this.f25536z1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: y0 */
        public void mo14160y0(ChooseGenresDialogFragment chooseGenresDialogFragment) {
            chooseGenresDialogFragment.f27670d = DoubleCheck.m30790a(this.f25414E1);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: z */
        public void mo14161z(SignUpFragment signUpFragment) {
            signUpFragment.f27828e = DoubleCheck.m30790a(this.f25501o);
        }

        @Override // com.swiftsoft.anixartd.dagger.ApplicationComponent
        /* renamed from: z0 */
        public void mo14162z0(SwiftPlayerActivity swiftPlayerActivity) {
            swiftPlayerActivity.f27554c = DoubleCheck.m30790a(this.f25417F1);
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public AppModule f25537a;

        /* renamed from: b */
        public RoomModule f25538b;

        /* renamed from: c */
        public RepositoryModule f25539c;

        public Builder() {
        }

        /* renamed from: a */
        public ApplicationComponent m14163a() {
            Preconditions.m30793a(this.f25537a, AppModule.class);
            if (this.f25538b == null) {
                this.f25538b = new RoomModule();
            }
            if (this.f25539c == null) {
                this.f25539c = new RepositoryModule();
            }
            return new ApplicationComponentImpl(this.f25537a, this.f25538b, this.f25539c, null);
        }

        public Builder(C25081 c25081) {
        }
    }
}
