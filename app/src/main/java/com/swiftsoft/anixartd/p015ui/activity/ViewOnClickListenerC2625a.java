package com.swiftsoft.anixartd.p015ui.activity;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.BookmarksImportFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseDownloaderDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChoosePlayerDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseStatusDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.KodikVideoQualityFragment;
import com.swiftsoft.anixartd.p015ui.dialog.TorlookFilterDialog;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignInFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.NeedAuthFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.updates.EpisodesUpdatesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.notifications.NotificationsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileBlockListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileChangeLoginHistoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileOutFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideoAppealsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosAllFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseVoteFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.RecommendationFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.related.RelatedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.schedule.ScheduleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.streaming.ReleaseStreamingPlatformFragment;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.yandex.metrica.YandexMetrica;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2625a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27491b;

    /* renamed from: c */
    public final /* synthetic */ Object f27492c;

    public /* synthetic */ ViewOnClickListenerC2625a(Object obj, int i2) {
        this.f27491b = i2;
        this.f27492c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27491b) {
            case 0:
                AuthActivity this$0 = (AuthActivity) this.f27492c;
                KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15325s4().mo10646a();
                return;
            case 1:
                UpdateActivity this$02 = (UpdateActivity) this.f27492c;
                KProperty<Object>[] kPropertyArr2 = UpdateActivity.f27474h;
                Intrinsics.m32179h(this$02, "this$0");
                YandexMetrica.reportEvent("Переход в раздел Помощь при обновлении");
                new Common().m16300e(this$02, new Common().m16297b("https://anixart.tv", this$02.m15340v4().f27273b.m14082y()) + "/update-help?gp=false&dark=" + new Common().m16299d(this$02));
                return;
            case 2:
                BookmarksImportFragment.m15412A3((BookmarksImportFragment) this.f27492c, view);
                return;
            case 3:
                ChooseDownloaderDialogFragment this$03 = (ChooseDownloaderDialogFragment) this.f27492c;
                int i2 = ChooseDownloaderDialogFragment.f27656g;
                Intrinsics.m32179h(this$03, "this$0");
                Dialogs dialogs = Dialogs.f30143a;
                String string = this$03.getString(C2507R.string.hint_ask_always);
                Intrinsics.m32178g(string, "getString(R.string.hint_ask_always)");
                dialogs.m16308g(this$03, string, 0);
                return;
            case 4:
                ChoosePlayerDialogFragment this$04 = (ChoosePlayerDialogFragment) this.f27492c;
                int i3 = ChoosePlayerDialogFragment.f27677h;
                Intrinsics.m32179h(this$04, "this$0");
                Dialogs dialogs2 = Dialogs.f30143a;
                String string2 = this$04.getString(C2507R.string.hint_ask_always);
                Intrinsics.m32178g(string2, "getString(R.string.hint_ask_always)");
                dialogs2.m16308g(this$04, string2, 0);
                return;
            case 5:
                ChooseStatusDialogFragment this$05 = (ChooseStatusDialogFragment) this.f27492c;
                int i4 = ChooseStatusDialogFragment.f27687i;
                Intrinsics.m32179h(this$05, "this$0");
                Intent intent = new Intent();
                ArrayList<Integer> arrayList = this$05.f27690f;
                if (arrayList == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                intent.putIntegerArrayListExtra("PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE", arrayList);
                intent.putExtra("IS_RELEASE_TYPE_NOTIFICATIONS_ENABLED_VALUE", this$05.f27691g);
                if (this$05.m15411u3("CHOOSE_STATUS_CONTINUE_BUTTON", intent)) {
                    this$05.dismiss();
                    return;
                }
                return;
            case 6:
                KodikVideoQualityFragment this$06 = (KodikVideoQualityFragment) this.f27492c;
                int i5 = KodikVideoQualityFragment.f27721f;
                Intrinsics.m32179h(this$06, "this$0");
                Intent intent2 = new Intent();
                intent2.putExtra("SELECTED_KODIK_VIDEO_QUALITY_VALUE", this$06.f27722d);
                if (this$06.m15411u3("CHOOSE_VIDEO_QUALITY_CONTINUE_BUTTON", intent2)) {
                    this$06.dismiss();
                    return;
                }
                return;
            case 7:
                TorlookFilterDialog this$07 = (TorlookFilterDialog) this.f27492c;
                int i6 = TorlookFilterDialog.f27734h;
                Intrinsics.m32179h(this$07, "this$0");
                Intent intent3 = new Intent();
                intent3.putExtra("SELECTED_SORT_VALUE", this$07.f27735d);
                intent3.putExtra("FORCED_SEARCH_VALUE", this$07.f27736e);
                intent3.putExtra("PROXY_TRACKERS_VALUE", this$07.f27737f);
                if (this$07.m15411u3("CHOOSE_CONTINUE_BUTTON", intent3)) {
                    this$07.dismiss();
                    return;
                }
                return;
            case 8:
                SignInFragment this$08 = (SignInFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr3 = SignInFragment.f27811h;
                Intrinsics.m32179h(this$08, "this$0");
                this$08.startActivity(new Intent(this$08.getActivity(), (Class<?>) UpdateActivity.class));
                return;
            case 9:
                CommonTabsFragment this$09 = (CommonTabsFragment) this.f27492c;
                int i7 = CommonTabsFragment.f27877f;
                Intrinsics.m32179h(this$09, "this$0");
                this$09.m15437u3().mo15323a3();
                return;
            case 10:
                NeedAuthFragment this$010 = (NeedAuthFragment) this.f27492c;
                int i8 = NeedAuthFragment.f27882c;
                Intrinsics.m32179h(this$010, "this$0");
                FragmentActivity activity = this$010.getActivity();
                if (activity != null) {
                    Intent intent4 = new Intent(activity, (Class<?>) AuthActivity.class);
                    intent4.setFlags(268451840);
                    this$010.startActivity(intent4);
                    return;
                }
                return;
            case 11:
                CommentVotesFragment this$011 = (CommentVotesFragment) this.f27492c;
                CommentVotesFragment.Companion companion = CommentVotesFragment.f28050j;
                Intrinsics.m32179h(this$011, "this$0");
                this$011.m15437u3().mo15323a3();
                return;
            case 12:
                EpisodesFragment this$012 = (EpisodesFragment) this.f27492c;
                EpisodesFragment.Companion companion2 = EpisodesFragment.f28080m;
                Intrinsics.m32179h(this$012, "this$0");
                if (this$012.m15496m4().m14571e()) {
                    this$012.m15437u3().mo15323a3();
                    return;
                }
                return;
            case 13:
                EpisodesUpdatesFragment this$013 = (EpisodesUpdatesFragment) this.f27492c;
                EpisodesUpdatesFragment.Companion companion3 = EpisodesUpdatesFragment.f28138i;
                Intrinsics.m32179h(this$013, "this$0");
                this$013.m15437u3().mo15323a3();
                return;
            case 14:
                NotificationsFragment this$014 = (NotificationsFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr4 = NotificationsFragment.f28273i;
                Intrinsics.m32179h(this$014, "this$0");
                this$014.m15437u3().mo15323a3();
                return;
            case 15:
                ProfileBlockListFragment this$015 = (ProfileBlockListFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr5 = ProfileBlockListFragment.f28438h;
                Intrinsics.m32179h(this$015, "this$0");
                this$015.m15437u3().mo15323a3();
                return;
            case 16:
                ProfileChangeLoginHistoryFragment this$016 = (ProfileChangeLoginHistoryFragment) this.f27492c;
                ProfileChangeLoginHistoryFragment.Companion companion4 = ProfileChangeLoginHistoryFragment.f28447i;
                Intrinsics.m32179h(this$016, "this$0");
                this$016.m15437u3().mo15323a3();
                return;
            case 17:
                ProfileFriendRequestsFragment this$017 = (ProfileFriendRequestsFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr6 = ProfileFriendRequestsFragment.f28527h;
                Intrinsics.m32179h(this$017, "this$0");
                this$017.m15437u3().mo15323a3();
                return;
            case 18:
                ProfileFriendsFragment this$018 = (ProfileFriendsFragment) this.f27492c;
                ProfileFriendsFragment.Companion companion5 = ProfileFriendsFragment.f28536i;
                Intrinsics.m32179h(this$018, "this$0");
                this$018.m15437u3().mo15323a3();
                return;
            case 19:
                ProfileOutFriendRequestsFragment this$019 = (ProfileOutFriendRequestsFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr7 = ProfileOutFriendRequestsFragment.f28547h;
                Intrinsics.m32179h(this$019, "this$0");
                this$019.m15437u3().mo15323a3();
                return;
            case 20:
                ProfileReleaseVideoAppealsFragment this$020 = (ProfileReleaseVideoAppealsFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr8 = ProfileReleaseVideoAppealsFragment.f28568h;
                Intrinsics.m32179h(this$020, "this$0");
                this$020.m15437u3().mo15323a3();
                return;
            case 21:
                ProfileReleaseVideosAllFragment this$021 = (ProfileReleaseVideosAllFragment) this.f27492c;
                ProfileReleaseVideosAllFragment.Companion companion6 = ProfileReleaseVideosAllFragment.f28579i;
                Intrinsics.m32179h(this$021, "this$0");
                this$021.m15437u3().mo15323a3();
                return;
            case 22:
                ProfileReleaseUnvotedFragment this$022 = (ProfileReleaseUnvotedFragment) this.f27492c;
                ProfileReleaseUnvotedFragment.Companion companion7 = ProfileReleaseUnvotedFragment.f28604h;
                Intrinsics.m32179h(this$022, "this$0");
                this$022.m15437u3().mo15323a3();
                return;
            case 23:
                ProfileReleaseVoteFragment this$023 = (ProfileReleaseVoteFragment) this.f27492c;
                ProfileReleaseVoteFragment.Companion companion8 = ProfileReleaseVoteFragment.f28614i;
                Intrinsics.m32179h(this$023, "this$0");
                this$023.m15437u3().mo15323a3();
                return;
            case 24:
                RecommendationFragment this$024 = (RecommendationFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr9 = RecommendationFragment.f28625h;
                Intrinsics.m32179h(this$024, "this$0");
                this$024.m15437u3().mo15323a3();
                return;
            case 25:
                RelatedFragment this$025 = (RelatedFragment) this.f27492c;
                RelatedFragment.Companion companion9 = RelatedFragment.f28636o;
                Intrinsics.m32179h(this$025, "this$0");
                this$025.m15437u3().mo15323a3();
                return;
            case 26:
                ReleaseVideoAppealFragment this$026 = (ReleaseVideoAppealFragment) this.f27492c;
                ReleaseVideoAppealFragment.Companion companion10 = ReleaseVideoAppealFragment.f28840l;
                Intrinsics.m32179h(this$026, "this$0");
                this$026.m15437u3().mo15323a3();
                return;
            case 27:
                ReleaseVideoCategoryFragment this$027 = (ReleaseVideoCategoryFragment) this.f27492c;
                ReleaseVideoCategoryFragment.Companion companion11 = ReleaseVideoCategoryFragment.f28855j;
                Intrinsics.m32179h(this$027, "this$0");
                this$027.m15437u3().mo15323a3();
                return;
            case 28:
                ScheduleFragment this$028 = (ScheduleFragment) this.f27492c;
                KProperty<Object>[] kPropertyArr10 = ScheduleFragment.f28889g;
                Intrinsics.m32179h(this$028, "this$0");
                this$028.m15437u3().mo15323a3();
                return;
            default:
                ReleaseStreamingPlatformFragment this$029 = (ReleaseStreamingPlatformFragment) this.f27492c;
                ReleaseStreamingPlatformFragment.Companion companion12 = ReleaseStreamingPlatformFragment.f28920i;
                Intrinsics.m32179h(this$029, "this$0");
                this$029.m15437u3().mo15323a3();
                return;
        }
    }
}
