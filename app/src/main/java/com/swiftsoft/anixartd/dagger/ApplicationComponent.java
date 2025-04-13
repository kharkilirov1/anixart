package com.swiftsoft.anixartd.dagger;

import com.swiftsoft.anixartd.App;
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
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApplicationComponent.kt */
@Component
@Singleton
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/dagger/ApplicationComponent;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ApplicationComponent {
    /* renamed from: A */
    void mo14084A(@NotNull MainPreferenceFragment mainPreferenceFragment);

    /* renamed from: A0 */
    void mo14085A0(@NotNull SignInFragment signInFragment);

    /* renamed from: B */
    void mo14086B(@NotNull ProfileFragment profileFragment);

    /* renamed from: C */
    void mo14087C(@NotNull ProfileChangeLoginHistoryFragment profileChangeLoginHistoryFragment);

    /* renamed from: D */
    void mo14088D(@NotNull ProfileSocialFragment profileSocialFragment);

    /* renamed from: E */
    void mo14089E(@NotNull ProfileCommentsTabFragment profileCommentsTabFragment);

    /* renamed from: F */
    void mo14090F(@NotNull RelatedFragment relatedFragment);

    /* renamed from: G */
    void mo14091G(@NotNull ProfileListsTabFragment profileListsTabFragment);

    /* renamed from: H */
    void mo14092H(@NotNull ProfileReleaseUnvotedFragment profileReleaseUnvotedFragment);

    /* renamed from: I */
    void mo14093I(@NotNull KodikAdActivity kodikAdActivity);

    /* renamed from: J */
    void mo14094J(@NotNull NotificationsPreferenceFragment notificationsPreferenceFragment);

    /* renamed from: K */
    void mo14095K(@NotNull TopFragment topFragment);

    /* renamed from: L */
    void mo14096L(@NotNull VerifyFragment verifyFragment);

    /* renamed from: M */
    void mo14097M(@NotNull ProfilePreferenceFragment profilePreferenceFragment);

    /* renamed from: N */
    void mo14098N(@NotNull SilentPushReceiver silentPushReceiver);

    /* renamed from: O */
    void mo14099O(@NotNull CollectionFragment collectionFragment);

    /* renamed from: P */
    void mo14100P(@NotNull WebPlayerActivity webPlayerActivity);

    /* renamed from: Q */
    void mo14101Q(@NotNull ChangeLoginPreferenceFragment changeLoginPreferenceFragment);

    /* renamed from: R */
    void mo14102R(@NotNull ProfileFriendsFragment profileFriendsFragment);

    /* renamed from: S */
    void mo14103S(@NotNull ProfileReleaseVideosFragment profileReleaseVideosFragment);

    /* renamed from: T */
    void mo14104T(@NotNull RestoreFragment restoreFragment);

    /* renamed from: U */
    void mo14105U(@NotNull ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment);

    /* renamed from: V */
    void mo14106V(@NotNull ReleaseVideosFragment releaseVideosFragment);

    /* renamed from: W */
    void mo14107W(@NotNull AppearancePreferenceFragment appearancePreferenceFragment);

    /* renamed from: X */
    void mo14108X(@NotNull CollectionCommentsFragment collectionCommentsFragment);

    /* renamed from: Y */
    void mo14109Y(@NotNull TorlookFragment torlookFragment);

    /* renamed from: Z */
    void mo14110Z(@NotNull ProfileCommentsFragment profileCommentsFragment);

    /* renamed from: a */
    void mo14111a(@NotNull FilterFragment filterFragment);

    /* renamed from: a0 */
    void mo14112a0(@NotNull ProfileReleaseVideoAppealsFragment profileReleaseVideoAppealsFragment);

    /* renamed from: b */
    void mo14113b(@NotNull WatchingFragment watchingFragment);

    /* renamed from: b0 */
    void mo14114b0(@NotNull DiscoverFragment discoverFragment);

    /* renamed from: c */
    void mo14115c(@NotNull ProfileBlockListFragment profileBlockListFragment);

    /* renamed from: c0 */
    void mo14116c0(@NotNull ProfileReleaseVideosAllFragment profileReleaseVideosAllFragment);

    /* renamed from: d */
    void mo14117d(@NotNull CollectionListFragment collectionListFragment);

    /* renamed from: d0 */
    void mo14118d0(@NotNull CollectionEditorFragment collectionEditorFragment);

    /* renamed from: e */
    void mo14119e(@NotNull BookmarksFragment bookmarksFragment);

    /* renamed from: e0 */
    void mo14120e0(@NotNull ProfileOutFriendRequestsFragment profileOutFriendRequestsFragment);

    /* renamed from: f */
    void mo14121f(@NotNull ProfileFriendRequestsFragment profileFriendRequestsFragment);

    /* renamed from: f0 */
    void mo14122f0(@NotNull ReleaseVideoAppealFragment releaseVideoAppealFragment);

    /* renamed from: g */
    void mo14123g(@NotNull ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment);

    /* renamed from: g0 */
    void mo14124g0(@NotNull CustomFilterTabFragment customFilterTabFragment);

    /* renamed from: h */
    void mo14125h(@NotNull RestoreVerifyFragment restoreVerifyFragment);

    /* renamed from: h0 */
    void mo14126h0(@NotNull FilteredFragment filteredFragment);

    /* renamed from: i */
    void mo14127i(@NotNull CommentVotesFragment commentVotesFragment);

    /* renamed from: i0 */
    void mo14128i0(@NotNull StartActivity startActivity);

    /* renamed from: j */
    void mo14129j(@NotNull ProfileReleaseNotificationPreferencesFragment profileReleaseNotificationPreferencesFragment);

    /* renamed from: j0 */
    void mo14130j0(@NotNull MainActivity mainActivity);

    /* renamed from: k */
    void mo14131k(@NotNull ProfileListsFragment profileListsFragment);

    /* renamed from: k0 */
    void mo14132k0(@NotNull SearchFragment searchFragment);

    /* renamed from: l */
    void mo14133l(@NotNull App app);

    /* renamed from: l0 */
    void mo14134l0(@NotNull EpisodesUpdatesFragment episodesUpdatesFragment);

    /* renamed from: m */
    void mo14135m(@NotNull CollectionProfileListFragment collectionProfileListFragment);

    /* renamed from: m0 */
    void mo14136m0(@NotNull DataPreferenceFragment dataPreferenceFragment);

    /* renamed from: n */
    void mo14137n(@NotNull SignUpWithVkFragment signUpWithVkFragment);

    /* renamed from: n0 */
    void mo14138n0(@NotNull RecommendationFragment recommendationFragment);

    /* renamed from: o */
    void mo14139o(@NotNull NotificationService notificationService);

    /* renamed from: o0 */
    void mo14140o0(@NotNull ReleaseCollectionsFragment releaseCollectionsFragment);

    /* renamed from: p */
    void mo14141p(@NotNull BookmarksTabFragment bookmarksTabFragment);

    /* renamed from: p0 */
    void mo14142p0(@NotNull CollectionCommentsRepliesFragment collectionCommentsRepliesFragment);

    /* renamed from: q */
    void mo14143q(@NotNull ScheduleFragment scheduleFragment);

    /* renamed from: q0 */
    void mo14144q0(@NotNull SignUpWithGoogleFragment signUpWithGoogleFragment);

    /* renamed from: r */
    void mo14145r(@NotNull PlaybackPreferenceFragment playbackPreferenceFragment);

    /* renamed from: r0 */
    void mo14146r0(@NotNull ReleaseFragment releaseFragment);

    /* renamed from: s */
    void mo14147s(@NotNull ReleaseCommentsFragment releaseCommentsFragment);

    /* renamed from: s0 */
    void mo14148s0(@NotNull UpdateActivity updateActivity);

    /* renamed from: t */
    void mo14149t(@NotNull TopTabFragment topTabFragment);

    /* renamed from: t0 */
    void mo14150t0(@NotNull ReportFragment reportFragment);

    /* renamed from: u */
    void mo14151u(@NotNull NotificationsFragment notificationsFragment);

    /* renamed from: u0 */
    void mo14152u0(@NotNull EpisodesFragment episodesFragment);

    /* renamed from: v */
    void mo14153v(@NotNull ProfileReleaseVoteFragment profileReleaseVoteFragment);

    /* renamed from: v0 */
    void mo14154v0(@NotNull AdditionalPreferenceFragment additionalPreferenceFragment);

    /* renamed from: w */
    void mo14155w(@NotNull HomeTabFragment homeTabFragment);

    /* renamed from: w0 */
    void mo14156w0(@NotNull ReleaseVideoCategoryFragment releaseVideoCategoryFragment);

    /* renamed from: x */
    void mo14157x(@NotNull HomeFragment homeFragment);

    /* renamed from: x0 */
    void mo14158x0(@NotNull AuthActivity authActivity);

    /* renamed from: y */
    void mo14159y(@NotNull ProfileReleaseVideosTabFragment profileReleaseVideosTabFragment);

    /* renamed from: y0 */
    void mo14160y0(@NotNull ChooseGenresDialogFragment chooseGenresDialogFragment);

    /* renamed from: z */
    void mo14161z(@NotNull SignUpFragment signUpFragment);

    /* renamed from: z0 */
    void mo14162z0(@NotNull SwiftPlayerActivity swiftPlayerActivity);
}
