package com.swiftsoft.anixartd.p015ui.fragment.main.profile;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationCollectionCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ReleaseVoteModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.profile.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC2720d implements View.OnLongClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28524b;

    /* renamed from: c */
    public final /* synthetic */ Object f28525c;

    public /* synthetic */ ViewOnLongClickListenerC2720d(Object obj, int i2) {
        this.f28524b = i2;
        this.f28525c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f28524b) {
            case 0:
                ProfileFragment this$0 = (ProfileFragment) this.f28525c;
                ProfileFragment.Companion companion = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$0, "this$0");
                Context context = this$0.getContext();
                if (context != null) {
                    Object systemService = context.getSystemService("clipboard");
                    Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", new Common().m16297b("https://anixart.tv", this$0.m15561c4().f26637b.m14082y()) + "/profile/" + this$0.f28460d));
                }
                Dialogs.f30143a.m16308g(this$0, "Ссылка на профиль скопирована", 0);
                return true;
            case 1:
                ReleaseCardModel this$02 = (ReleaseCardModel) this.f28525c;
                Intrinsics.m32179h(this$02, "this$0");
                ReleaseModel.Listener listener = this$02.f29400x;
                if (listener != null) {
                    listener.mo14365k(this$02.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 2:
                ReleaseHistoryModel this$03 = (ReleaseHistoryModel) this.f28525c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15750v2().mo14365k(this$03.f6925b);
                return true;
            case 3:
                ReleaseModel this$04 = (ReleaseModel) this.f28525c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.m15754v2().mo14365k(this$04.f6925b);
                return true;
            case 4:
                TopReleaseModel this$05 = (TopReleaseModel) this.f28525c;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.m15782v2().mo15242k(this$05.f6925b);
                return true;
            case 5:
                DiscussModel this$06 = (DiscussModel) this.f28525c;
                Intrinsics.m32179h(this$06, "this$0");
                this$06.m15925v2().mo14551k(this$06.f6925b);
                return true;
            case 6:
                com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel this$07 = (com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel) this.f28525c;
                Intrinsics.m32179h(this$07, "this$0");
                ReleaseCardModel.Listener listener2 = this$07.f29646t;
                if (listener2 != null) {
                    listener2.mo14551k(this$07.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 7:
                NotificationCollectionCommentModel this$08 = (NotificationCollectionCommentModel) this.f28525c;
                Intrinsics.m32179h(this$08, "this$0");
                NotificationCollectionCommentModel.Listener listener3 = this$08.f29762v;
                if (listener3 != null) {
                    listener3.mo14718k(this$08.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 8:
                NotificationEpisodeModel this$09 = (NotificationEpisodeModel) this.f28525c;
                Intrinsics.m32179h(this$09, "this$0");
                NotificationEpisodeModel.Listener listener4 = this$09.f29772s;
                if (listener4 != null) {
                    listener4.mo14718k(this$09.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 9:
                NotificationFriendModel this$010 = (NotificationFriendModel) this.f28525c;
                Intrinsics.m32179h(this$010, "this$0");
                NotificationFriendModel.Listener listener5 = this$010.f29780q;
                if (listener5 != null) {
                    listener5.mo14718k(this$010.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 10:
                NotificationReleaseCommentModel this$011 = (NotificationReleaseCommentModel) this.f28525c;
                Intrinsics.m32179h(this$011, "this$0");
                NotificationReleaseCommentModel.Listener listener6 = this$011.f29792t;
                if (listener6 != null) {
                    listener6.mo14718k(this$011.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 11:
                NotificationReleaseModel this$012 = (NotificationReleaseModel) this.f28525c;
                Intrinsics.m32179h(this$012, "this$0");
                NotificationReleaseModel.Listener listener7 = this$012.f29799p;
                if (listener7 != null) {
                    listener7.mo14718k(this$012.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 12:
                ReleaseNotificationPreferenceModel this$013 = (ReleaseNotificationPreferenceModel) this.f28525c;
                Intrinsics.m32179h(this$013, "this$0");
                this$013.m16039v2().mo14760k(this$013.f6925b);
                return true;
            case 13:
                ReleaseVoteModel this$014 = (ReleaseVoteModel) this.f28525c;
                Intrinsics.m32179h(this$014, "this$0");
                this$014.m16157v2().mo14975k(this$014.f6925b);
                return true;
            case 14:
                RelatedModel this$015 = (RelatedModel) this.f28525c;
                Intrinsics.m32179h(this$015, "this$0");
                this$015.m16180v2().mo15005k(this$015.f6925b);
                return true;
            case 15:
                VideoBannerLargeModel this$016 = (VideoBannerLargeModel) this.f28525c;
                Intrinsics.m32179h(this$016, "this$0");
                VideoBannerLargeModel.Listener listener8 = this$016.f30044o;
                if (listener8 != null) {
                    listener8.mo15159f(this$016.f30040k, this$016.f6925b);
                    return true;
                }
                Intrinsics.m32189r("listener");
                throw null;
            case 16:
                VideoListItemModel this$017 = (VideoListItemModel) this.f28525c;
                Intrinsics.m32179h(this$017, "this$0");
                this$017.m16222v2().mo14954b(this$017.f30048k);
                return true;
            default:
                Function1 tmp0 = (Function1) this.f28525c;
                Intrinsics.m32179h(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(view)).booleanValue();
        }
    }
}
