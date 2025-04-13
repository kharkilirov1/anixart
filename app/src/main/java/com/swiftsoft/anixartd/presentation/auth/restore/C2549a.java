package com.swiftsoft.anixartd.presentation.auth.restore;

import com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter;
import com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter;
import com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter;
import com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter;
import com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter;
import com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter;
import com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter;
import com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter;
import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpPresenter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.auth.restore.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2549a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f25849b;

    /* renamed from: c */
    public final /* synthetic */ Object f25850c;

    public /* synthetic */ C2549a(MvpPresenter mvpPresenter, int i2) {
        this.f25849b = i2;
        this.f25850c = mvpPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f25849b) {
            case 0:
                RestorePresenter this$0 = (RestorePresenter) this.f25850c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14209j();
                break;
            case 1:
                SignInPresenter this$02 = (SignInPresenter) this.f25850c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14229j();
                break;
            case 2:
                SignUpPresenter this$03 = (SignUpPresenter) this.f25850c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo14247j();
                break;
            case 3:
                SignUpWithGooglePresenter this$04 = (SignUpWithGooglePresenter) this.f25850c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.getViewState().mo14262j();
                break;
            case 4:
                SignUpWithVkPresenter this$05 = (SignUpWithVkPresenter) this.f25850c;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.getViewState().mo14295j();
                break;
            case 5:
                CollectionPresenter this$06 = (CollectionPresenter) this.f25850c;
                Intrinsics.m32179h(this$06, "this$0");
                this$06.getViewState().mo14409j();
                break;
            case 6:
                DiscoverPresenter this$07 = (DiscoverPresenter) this.f25850c;
                Intrinsics.m32179h(this$07, "this$0");
                this$07.getViewState().mo14556a();
                this$07.getViewState().mo14560e();
                break;
            case 7:
                FilterPresenter this$08 = (FilterPresenter) this.f25850c;
                Intrinsics.m32179h(this$08, "this$0");
                this$08.getViewState().mo14639a();
                break;
            case 8:
                FilteredPresenter this$09 = (FilteredPresenter) this.f25850c;
                Intrinsics.m32179h(this$09, "this$0");
                this$09.getViewState().mo14644a();
                break;
            case 9:
                CustomFilterTabPresenter this$010 = (CustomFilterTabPresenter) this.f25850c;
                Intrinsics.m32179h(this$010, "this$0");
                this$010.getViewState().mo14667a();
                this$010.getViewState().mo14672e();
                break;
            case 10:
                HomeTabPresenter this$011 = (HomeTabPresenter) this.f25850c;
                Intrinsics.m32179h(this$011, "this$0");
                this$011.getViewState().mo14683a();
                this$011.getViewState().mo14688e();
                break;
            case 11:
                NotificationsPreferencePresenter this$012 = (NotificationsPreferencePresenter) this.f25850c;
                Intrinsics.m32179h(this$012, "this$0");
                this$012.getViewState().mo14701a();
                break;
            case 12:
                NotificationsPresenter this$013 = (NotificationsPresenter) this.f25850c;
                Intrinsics.m32179h(this$013, "this$0");
                this$013.getViewState().mo14723a();
                this$013.getViewState().mo14727e();
                break;
            case 13:
                ProfilePresenter this$014 = (ProfilePresenter) this.f25850c;
                Intrinsics.m32179h(this$014, "this$0");
                this$014.getViewState().mo14850a();
                this$014.getViewState().mo14854e();
                break;
            case 14:
                ProfileListsTabPresenter this$015 = (ProfileListsTabPresenter) this.f25850c;
                Intrinsics.m32179h(this$015, "this$0");
                this$015.getViewState().mo14923a();
                this$015.getViewState().mo14928e();
                break;
            case 15:
                ProfileReleaseVideosTabPresenter this$016 = (ProfileReleaseVideosTabPresenter) this.f25850c;
                Intrinsics.m32179h(this$016, "this$0");
                this$016.getViewState().mo14959a();
                this$016.getViewState().mo14963e();
                break;
            case 16:
                ProfileReleaseUnvotedPresenter this$017 = (ProfileReleaseUnvotedPresenter) this.f25850c;
                Intrinsics.m32179h(this$017, "this$0");
                this$017.getViewState().mo14976a();
                this$017.getViewState().mo14980e();
                break;
            case 17:
                ReleaseVideoAppealPresenter this$018 = (ReleaseVideoAppealPresenter) this.f25850c;
                Intrinsics.m32179h(this$018, "this$0");
                this$018.getViewState().mo15180p();
                break;
            case 18:
                SchedulePresenter this$019 = (SchedulePresenter) this.f25850c;
                Intrinsics.m32179h(this$019, "this$0");
                this$019.getViewState().mo15206a();
                break;
            case 19:
                TopTabPresenter this$020 = (TopTabPresenter) this.f25850c;
                Intrinsics.m32179h(this$020, "this$0");
                this$020.getViewState().mo15244a();
                this$020.getViewState().mo15248e();
                break;
            default:
                UpdatePresenter this$021 = (UpdatePresenter) this.f25850c;
                Intrinsics.m32179h(this$021, "this$0");
                this$021.getViewState().mo15251a();
                break;
        }
    }
}
