package com.swiftsoft.anixartd.p015ui.fragment.main.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionProfileListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.comments.ProfileCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosAllFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseVoteFragment;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.profile.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2717a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28504b;

    /* renamed from: c */
    public final /* synthetic */ ProfileFragment f28505c;

    public /* synthetic */ ViewOnClickListenerC2717a(ProfileFragment profileFragment, int i2) {
        this.f28504b = i2;
        this.f28505c = profileFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28504b) {
            case 0:
                ProfileFragment this$0 = this.f28505c;
                ProfileFragment.Companion companion = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$0, "this$0");
                ((AppCompatImageView) this$0.m15560A3(C2507R.id.btnSocialAdd)).performHapticFeedback(1);
                this$0.m15437u3().mo15324d2(new ProfileSocialFragment(), null);
                break;
            case 1:
                ProfileFragment this$02 = this.f28505c;
                ProfileFragment.Companion companion2 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$02, "this$0");
                Common common = new Common();
                Context requireContext = this$02.requireContext();
                Intrinsics.m32178g(requireContext, "requireContext()");
                common.m16300e(requireContext, new Common().m16297b("https://anixart.tv", this$02.m15561c4().f26637b.m14082y()) + "/rules");
                break;
            case 2:
                ProfileFragment this$03 = this.f28505c;
                ProfileFragment.Companion companion3 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$03, "this$0");
                Context requireContext2 = this$03.requireContext();
                Intrinsics.m32178g(requireContext2, "requireContext()");
                Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext2);
                builder.f30150b = 2;
                builder.m16318j(C2507R.string.information);
                String string = this$03.getString(C2507R.string.profile_stats_hint);
                Intrinsics.m32178g(string, "getString(R.string.profile_stats_hint)");
                builder.f30152d = string;
                builder.m16315g(C2507R.string.understand);
                builder.f30159k = true;
                builder.m16317i();
                break;
            case 3:
                ProfileFragment this$04 = this.f28505c;
                ProfileFragment.Companion companion4 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$04, "this$0");
                Context requireContext3 = this$04.requireContext();
                Intrinsics.m32178g(requireContext3, "requireContext()");
                Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(requireContext3);
                builder2.f30150b = 2;
                builder2.m16318j(C2507R.string.information);
                String string2 = this$04.getString(C2507R.string.profile_watch_dynamics_hint);
                Intrinsics.m32178g(string2, "getString(R.string.profile_watch_dynamics_hint)");
                builder2.f30152d = string2;
                builder2.m16315g(C2507R.string.understand);
                builder2.f30159k = true;
                builder2.m16317i();
                break;
            case 4:
                ProfileFragment this$05 = this.f28505c;
                ProfileFragment.Companion companion5 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$05, "this$0");
                FragmentNavigation m15437u3 = this$05.m15437u3();
                long j2 = this$05.f28460d;
                ProfileCommentsFragment profileCommentsFragment = new ProfileCommentsFragment();
                Bundle bundle = new Bundle();
                bundle.putLong("PROFILE_ID", j2);
                profileCommentsFragment.setArguments(bundle);
                m15437u3.mo15324d2(profileCommentsFragment, null);
                break;
            case 5:
                ProfileFragment this$06 = this.f28505c;
                ProfileFragment.Companion companion6 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$06, "this$0");
                this$06.m15437u3().mo15324d2(CollectionProfileListFragment.f28011k.m15486a(this$06.f28460d, null, null), null);
                break;
            case 6:
                ProfileFragment this$07 = this.f28505c;
                ProfileFragment.Companion companion7 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$07, "this$0");
                FragmentNavigation m15437u32 = this$07.m15437u3();
                ProfileReleaseVideosAllFragment.Companion companion8 = ProfileReleaseVideosAllFragment.f28579i;
                long j3 = this$07.f28460d;
                Objects.requireNonNull(companion8);
                ProfileReleaseVideosAllFragment profileReleaseVideosAllFragment = new ProfileReleaseVideosAllFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("PROFILE_ID", j3);
                profileReleaseVideosAllFragment.setArguments(bundle2);
                m15437u32.mo15324d2(profileReleaseVideosAllFragment, null);
                break;
            case 7:
                ProfileFragment this$08 = this.f28505c;
                ProfileFragment.Companion companion9 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$08, "this$0");
                FragmentNavigation m15437u33 = this$08.m15437u3();
                ProfileFriendsFragment.Companion companion10 = ProfileFriendsFragment.f28536i;
                long j4 = this$08.f28460d;
                Objects.requireNonNull(companion10);
                ProfileFriendsFragment profileFriendsFragment = new ProfileFriendsFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("PROFILE_ID", j4);
                profileFriendsFragment.setArguments(bundle3);
                m15437u33.mo15324d2(profileFriendsFragment, null);
                break;
            case 8:
                ProfileFragment this$09 = this.f28505c;
                ProfileFragment.Companion companion11 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$09, "this$0");
                FragmentNavigation m15437u34 = this$09.m15437u3();
                ProfileReleaseVoteFragment.Companion companion12 = ProfileReleaseVoteFragment.f28614i;
                long j5 = this$09.f28460d;
                Objects.requireNonNull(companion12);
                ProfileReleaseVoteFragment profileReleaseVoteFragment = new ProfileReleaseVoteFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putLong("PROFILE_ID", j5);
                profileReleaseVoteFragment.setArguments(bundle4);
                m15437u34.mo15324d2(profileReleaseVoteFragment, null);
                break;
            default:
                ProfileFragment this$010 = this.f28505c;
                ProfileFragment.Companion companion13 = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$010, "this$0");
                this$010.m15437u3().mo15323a3();
                break;
        }
    }
}
