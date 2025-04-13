package com.swiftsoft.anixartd.p015ui.fragment.main.watching;

import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.extra.ImpMessageModel;
import com.swiftsoft.anixartd.p015ui.model.extra.LiteVersionModel;
import com.swiftsoft.anixartd.p015ui.model.extra.UpdateAvailableModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderMyListCollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.SuperMenuModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.VideoStreamingPlatformModel;
import com.yandex.div.internal.widget.SelectView;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.watching.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2744a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28949b;

    /* renamed from: c */
    public final /* synthetic */ Object f28950c;

    public /* synthetic */ ViewOnClickListenerC2744a(Object obj, int i2) {
        this.f28949b = i2;
        this.f28950c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28949b) {
            case 0:
                WatchingFragment this$0 = (WatchingFragment) this.f28950c;
                KProperty<Object>[] kPropertyArr = WatchingFragment.f28940h;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15437u3().mo15323a3();
                return;
            case 1:
                ImpMessageModel this$02 = (ImpMessageModel) this.f28950c;
                Intrinsics.m32179h(this$02, "this$0");
                if (this$02.f29455l.length() > 0) {
                    ImpMessageModel.Listener listener = this$02.f29458o;
                    if (listener != null) {
                        listener.mo14660a0(this$02.f29455l);
                        return;
                    } else {
                        Intrinsics.m32189r("listener");
                        throw null;
                    }
                }
                return;
            case 2:
                LiteVersionModel this$03 = (LiteVersionModel) this.f28950c;
                Intrinsics.m32179h(this$03, "this$0");
                LiteVersionModel.Listener listener2 = this$03.f29459k;
                if (listener2 != null) {
                    listener2.mo14657T();
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 3:
                UpdateAvailableModel this$04 = (UpdateAvailableModel) this.f28950c;
                Intrinsics.m32179h(this$04, "this$0");
                UpdateAvailableModel.Listener listener3 = this$04.f29460k;
                if (listener3 != null) {
                    listener3.mo14658V();
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 4:
                CollectionCountReleaseModel this$05 = (CollectionCountReleaseModel) this.f28950c;
                Intrinsics.m32179h(this$05, "this$0");
                CollectionCountReleaseModel.Listener listener4 = this$05.f29488q;
                if (listener4 != null) {
                    listener4.mo14385Y();
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 5:
                HeaderMyListCollectionModel this$06 = (HeaderMyListCollectionModel) this.f28950c;
                Intrinsics.m32179h(this$06, "this$0");
                HeaderMyListCollectionModel.Listener listener5 = this$06.f29539k;
                if (listener5 != null) {
                    listener5.mo14533M();
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 6:
                CommentProfileVoteModel this$07 = (CommentProfileVoteModel) this.f28950c;
                Intrinsics.m32179h(this$07, "this$0");
                CommentProfileVoteModel.Listener listener6 = this$07.f29578q;
                if (listener6 != null) {
                    listener6.mo14304f(this$07.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 7:
                SuperMenuModel this$08 = (SuperMenuModel) this.f28950c;
                Intrinsics.m32179h(this$08, "this$0");
                SuperMenuModel.Listener listener7 = this$08.f29654q;
                if (listener7 != null) {
                    listener7.mo14546a(this$08.f29648k);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 8:
                EpisodeModel this$09 = (EpisodeModel) this.f28950c;
                Intrinsics.m32179h(this$09, "this$0");
                this$09.m15967v2().mo14590g(this$09.f29691q);
                return;
            case 9:
                SourceModel this$010 = (SourceModel) this.f28950c;
                Intrinsics.m32179h(this$010, "this$0");
                SourceModel.Listener listener8 = this$010.f29709o;
                if (listener8 != null) {
                    listener8.mo14589f(this$010.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 10:
                TypeModel this$011 = (TypeModel) this.f28950c;
                Intrinsics.m32179h(this$011, "this$0");
                TypeModel.Listener listener9 = this$011.f29719q;
                if (listener9 != null) {
                    listener9.mo14587d(this$011.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 11:
                ProfileModel this$012 = (ProfileModel) this.f28950c;
                Intrinsics.m32179h(this$012, "this$0");
                ProfileModel.Listener listener10 = this$012.f29835p;
                if (listener10 != null) {
                    listener10.mo15220f(this$012.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 12:
                FriendModel this$013 = (FriendModel) this.f28950c;
                Intrinsics.m32179h(this$013, "this$0");
                FriendModel.Listener listener11 = this$013.f29908r;
                if (listener11 != null) {
                    listener11.mo14775f(this$013.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 13:
                FriendRecommendationModel this$014 = (FriendRecommendationModel) this.f28950c;
                Intrinsics.m32179h(this$014, "this$0");
                this$014.m16133v2().mo14775f(this$014.f6925b);
                return;
            case 14:
                FriendRequestModel this$015 = (FriendRequestModel) this.f28950c;
                Intrinsics.m32179h(this$015, "this$0");
                this$015.m16137v2().mo14775f(this$015.f6925b);
                return;
            case 15:
                ReleaseStreamingPlatformModel this$016 = (ReleaseStreamingPlatformModel) this.f28950c;
                Intrinsics.m32179h(this$016, "this$0");
                ReleaseStreamingPlatformModel.Listener listener12 = this$016.f30115n;
                if (listener12 != null) {
                    listener12.mo15234a(this$016.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 16:
                ReleaseThirdPartyPlatformModel this$017 = (ReleaseThirdPartyPlatformModel) this.f28950c;
                Intrinsics.m32179h(this$017, "this$0");
                ReleaseThirdPartyPlatformModel.Listener listener13 = this$017.f30116k;
                if (listener13 != null) {
                    listener13.mo15233K0();
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 17:
                VideoStreamingPlatformModel this$018 = (VideoStreamingPlatformModel) this.f28950c;
                Intrinsics.m32179h(this$018, "this$0");
                VideoStreamingPlatformModel.Listener listener14 = this$018.f30119m;
                if (listener14 != null) {
                    listener14.mo15157a(this$018.f6925b);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            case 18:
                SelectView.m17418k((SelectView) this.f28950c, view);
                return;
            default:
                OverflowMenuWrapper overflowMenuWrapper = (OverflowMenuWrapper) this.f28950c;
                Objects.requireNonNull(overflowMenuWrapper);
                PopupMenu popupMenu = new PopupMenu(view.getContext(), view, overflowMenuWrapper.f34091a, C2507R.attr.popupMenuStyle, 0);
                OverflowMenuWrapper.Listener listener15 = overflowMenuWrapper.f34092b;
                if (listener15 != null) {
                    listener15.mo16972a(popupMenu);
                }
                popupMenu.f1395c.m653g();
                OverflowMenuWrapper.Listener listener16 = overflowMenuWrapper.f34092b;
                if (listener16 != null) {
                    listener16.mo17446b();
                    return;
                }
                return;
        }
    }
}
