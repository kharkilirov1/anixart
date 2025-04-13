package com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.room.util.C0576a;
import androidx.viewpager.widget.ViewPager;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ProfileReleaseVideosFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/videos/ProfileReleaseVideosFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/CommonTabsFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosFragment extends CommonTabsFragment {

    /* renamed from: g */
    public long f28590g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28591h = new LinkedHashMap();

    /* compiled from: ProfileReleaseVideosFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/videos/ProfileReleaseVideosFragment$Companion;", "", "", "PROFILE_ID", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: A3 */
    public String mo15448A3(int i2) {
        if (i2 == 0) {
            return "INNER_TAB_PROFILE_VIDEOS_ALL";
        }
        if (i2 == 1) {
            return "INNER_TAB_PROFILE_VIDEOS_UPLOADED";
        }
        throw new Exception(C0000a.m7d("Invalid position: ", i2));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: c4 */
    public Fragment mo15449c4(int i2) {
        ProfileReleaseVideosTabFragment.Companion companion = ProfileReleaseVideosTabFragment.f28592l;
        long j2 = i2;
        long j3 = this.f28590g;
        String mo15448A3 = mo15448A3(i2);
        Objects.requireNonNull(companion);
        ProfileReleaseVideosTabFragment profileReleaseVideosTabFragment = new ProfileReleaseVideosTabFragment();
        Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
        m4108g.putLong("PROFILE_ID", j3);
        m4108g.putString("SELECTED_INNER_TAB_VALUE", mo15448A3);
        profileReleaseVideosTabFragment.setArguments(m4108g);
        return profileReleaseVideosTabFragment;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: e4 */
    public String mo15450e4(int i2) {
        Context context = getContext();
        if (context == null) {
            throw new Exception("invalid state");
        }
        if (i2 == 0) {
            String string = context.getString(C2507R.string.tab_title_video_all);
            Intrinsics.m32178g(string, "context.getString(R.string.tab_title_video_all)");
            return string;
        }
        if (i2 != 1) {
            throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
        String string2 = context.getString(C2507R.string.tab_title_video_uploaded);
        Intrinsics.m32178g(string2, "context.getString(R.stri…tab_title_video_uploaded)");
        return string2;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    /* renamed from: m4 */
    public int mo15451m4() {
        return 2;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28591h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14103S(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28590g = arguments.getLong("PROFILE_ID");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28591h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        ((AppCompatTextView) view.findViewById(C2507R.id.tvTitle)).setText(getString(C2507R.string.title_videos));
        ((ViewPager) view.findViewById(C2507R.id.view_pager)).setCurrentItem(0);
    }
}
