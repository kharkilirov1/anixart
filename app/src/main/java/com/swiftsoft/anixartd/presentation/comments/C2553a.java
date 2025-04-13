package com.swiftsoft.anixartd.presentation.comments;

import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter;
import com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter;
import com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter;
import com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter;
import com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter;
import com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter;
import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpPresenter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.comments.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2553a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f25945b;

    /* renamed from: c */
    public final /* synthetic */ boolean f25946c;

    /* renamed from: d */
    public final /* synthetic */ boolean f25947d;

    /* renamed from: e */
    public final /* synthetic */ Object f25948e;

    public /* synthetic */ C2553a(boolean z, MvpPresenter mvpPresenter, boolean z2, int i2) {
        this.f25945b = i2;
        this.f25946c = z;
        this.f25948e = mvpPresenter;
        this.f25947d = z2;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f25945b) {
            case 0:
                boolean z = this.f25946c;
                CommentVotesPresenter this$0 = (CommentVotesPresenter) this.f25948e;
                boolean z2 = this.f25947d;
                Intrinsics.m32179h(this$0, "this$0");
                if (z) {
                    this$0.getViewState().mo14305a();
                }
                if (z2) {
                    this$0.getViewState().mo14309e();
                    break;
                }
                break;
            case 1:
                boolean z3 = this.f25946c;
                CollectionPresenter this$02 = (CollectionPresenter) this.f25948e;
                boolean z4 = this.f25947d;
                Intrinsics.m32179h(this$02, "this$0");
                if (z3) {
                    this$02.getViewState().mo14399a();
                }
                if (z4) {
                    this$02.getViewState().mo14403e();
                    break;
                }
                break;
            case 2:
                boolean z5 = this.f25946c;
                CollectionCommentsPresenter this$03 = (CollectionCommentsPresenter) this.f25948e;
                boolean z6 = this.f25947d;
                Intrinsics.m32179h(this$03, "this$0");
                if (z5) {
                    this$03.getViewState().mo14440a();
                }
                if (z6) {
                    this$03.getViewState().mo14445e();
                    break;
                }
                break;
            case 3:
                boolean z7 = this.f25946c;
                CollectionCommentsRepliesPresenter this$04 = (CollectionCommentsRepliesPresenter) this.f25948e;
                boolean z8 = this.f25947d;
                Intrinsics.m32179h(this$04, "this$0");
                if (z7) {
                    this$04.getViewState().mo14476a();
                }
                if (z8) {
                    this$04.getViewState().mo14482e();
                    break;
                }
                break;
            case 4:
                boolean z9 = this.f25946c;
                CollectionListPresenter this$05 = (CollectionListPresenter) this.f25948e;
                boolean z10 = this.f25947d;
                Intrinsics.m32179h(this$05, "this$0");
                if (z9) {
                    this$05.getViewState().mo14522a();
                }
                if (z10) {
                    this$05.getViewState().mo14527e();
                    break;
                }
                break;
            case 5:
                boolean z11 = this.f25946c;
                CollectionProfileListPresenter this$06 = (CollectionProfileListPresenter) this.f25948e;
                boolean z12 = this.f25947d;
                Intrinsics.m32179h(this$06, "this$0");
                if (z11) {
                    this$06.getViewState().mo14535a();
                }
                if (z12) {
                    this$06.getViewState().mo14539e();
                    break;
                }
                break;
            case 6:
                boolean z13 = this.f25946c;
                TorlookPresenter this$07 = (TorlookPresenter) this.f25948e;
                boolean z14 = this.f25947d;
                Intrinsics.m32179h(this$07, "this$0");
                if (z13) {
                    this$07.getViewState().mo14624a();
                }
                if (z14) {
                    this$07.getViewState().mo14628e();
                    break;
                }
                break;
            case 7:
                boolean z15 = this.f25946c;
                EpisodesUpdatesPresenter this$08 = (EpisodesUpdatesPresenter) this.f25948e;
                boolean z16 = this.f25947d;
                Intrinsics.m32179h(this$08, "this$0");
                if (z15) {
                    this$08.getViewState().mo14633a();
                }
                if (z16) {
                    this$08.getViewState().mo14637e();
                    break;
                }
                break;
            case 8:
                boolean z17 = this.f25946c;
                ChangeLoginPreferencePresenter this$09 = (ChangeLoginPreferencePresenter) this.f25948e;
                boolean z18 = this.f25947d;
                Intrinsics.m32179h(this$09, "this$0");
                if (z17) {
                    this$09.getViewState().mo14737a();
                }
                if (z18) {
                    this$09.getViewState().mo14741e();
                    break;
                }
                break;
            case 9:
                boolean z19 = this.f25946c;
                ProfileBlockListPresenter this$010 = (ProfileBlockListPresenter) this.f25948e;
                boolean z20 = this.f25947d;
                Intrinsics.m32179h(this$010, "this$0");
                if (z19) {
                    this$010.getViewState().mo14779a();
                }
                if (z20) {
                    this$010.getViewState().mo14783e();
                    break;
                }
                break;
            case 10:
                boolean z21 = this.f25946c;
                ProfileChangeLoginHistoryPresenter this$011 = (ProfileChangeLoginHistoryPresenter) this.f25948e;
                boolean z22 = this.f25947d;
                Intrinsics.m32179h(this$011, "this$0");
                if (z21) {
                    this$011.getViewState().mo14786a();
                }
                if (z22) {
                    this$011.getViewState().mo14790e();
                    break;
                }
                break;
            case 11:
                boolean z23 = this.f25946c;
                ProfileFriendRequestsPresenter this$012 = (ProfileFriendRequestsPresenter) this.f25948e;
                boolean z24 = this.f25947d;
                Intrinsics.m32179h(this$012, "this$0");
                if (z23) {
                    this$012.getViewState().mo14882a();
                }
                if (z24) {
                    this$012.getViewState().mo14887e();
                    break;
                }
                break;
            case 12:
                boolean z25 = this.f25946c;
                ProfileOutFriendRequestsPresenter this$013 = (ProfileOutFriendRequestsPresenter) this.f25948e;
                boolean z26 = this.f25947d;
                Intrinsics.m32179h(this$013, "this$0");
                if (z25) {
                    this$013.getViewState().mo14911a();
                }
                if (z26) {
                    this$013.getViewState().mo14915e();
                    break;
                }
                break;
            case 13:
                boolean z27 = this.f25946c;
                ProfileReleaseVideoAppealsPresenter this$014 = (ProfileReleaseVideoAppealsPresenter) this.f25948e;
                boolean z28 = this.f25947d;
                Intrinsics.m32179h(this$014, "this$0");
                if (z27) {
                    this$014.getViewState().mo14939a();
                }
                if (z28) {
                    this$014.getViewState().mo14943e();
                    break;
                }
                break;
            case 14:
                boolean z29 = this.f25946c;
                RecommendationPresenter this$015 = (RecommendationPresenter) this.f25948e;
                boolean z30 = this.f25947d;
                Intrinsics.m32179h(this$015, "this$0");
                if (z29) {
                    this$015.getViewState().mo14997a();
                }
                if (z30) {
                    this$015.getViewState().mo15001e();
                    break;
                }
                break;
            case 15:
                boolean z31 = this.f25946c;
                RelatedPresenter this$016 = (RelatedPresenter) this.f25948e;
                boolean z32 = this.f25947d;
                Intrinsics.m32179h(this$016, "this$0");
                if (z31) {
                    this$016.getViewState().mo15006a();
                }
                if (z32) {
                    this$016.getViewState().mo15010e();
                    break;
                }
                break;
            case 16:
                boolean z33 = this.f25946c;
                ReleaseCollectionsPresenter this$017 = (ReleaseCollectionsPresenter) this.f25948e;
                boolean z34 = this.f25947d;
                Intrinsics.m32179h(this$017, "this$0");
                if (z33) {
                    this$017.getViewState().mo15079a();
                }
                if (z34) {
                    this$017.getViewState().mo15083e();
                    break;
                }
                break;
            case 17:
                boolean z35 = this.f25946c;
                ReleaseCommentsPresenter this$018 = (ReleaseCommentsPresenter) this.f25948e;
                boolean z36 = this.f25947d;
                Intrinsics.m32179h(this$018, "this$0");
                if (z35) {
                    this$018.getViewState().mo15103a();
                }
                if (z36) {
                    this$018.getViewState().mo15108e();
                    break;
                }
                break;
            case 18:
                boolean z37 = this.f25946c;
                ReleaseCommentsRepliesPresenter this$019 = (ReleaseCommentsRepliesPresenter) this.f25948e;
                boolean z38 = this.f25947d;
                Intrinsics.m32179h(this$019, "this$0");
                if (z37) {
                    this$019.getViewState().mo15137a();
                }
                if (z38) {
                    this$019.getViewState().mo15142e();
                    break;
                }
                break;
            case 19:
                boolean z39 = this.f25946c;
                ReleaseVideoCategoryPresenter this$020 = (ReleaseVideoCategoryPresenter) this.f25948e;
                boolean z40 = this.f25947d;
                Intrinsics.m32179h(this$020, "this$0");
                if (z39) {
                    this$020.getViewState().mo15185a();
                }
                if (z40) {
                    this$020.getViewState().mo15189e();
                    break;
                }
                break;
            default:
                boolean z41 = this.f25946c;
                WatchingPresenter this$021 = (WatchingPresenter) this.f25948e;
                boolean z42 = this.f25947d;
                Intrinsics.m32179h(this$021, "this$0");
                if (z41) {
                    this$021.getViewState().mo15257a();
                }
                if (z42) {
                    this$021.getViewState().mo15261e();
                    break;
                }
                break;
        }
    }
}
