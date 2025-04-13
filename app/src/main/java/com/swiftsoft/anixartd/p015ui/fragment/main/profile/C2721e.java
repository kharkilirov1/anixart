package com.swiftsoft.anixartd.p015ui.fragment.main.profile;

import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.stfalcon.imageviewer.loader.ImageLoader;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.GlideApp;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.profile.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2721e implements SwipeRefreshLayout.OnRefreshListener, ImageLoader {

    /* renamed from: b */
    public final /* synthetic */ ProfileFragment f28526b;

    public /* synthetic */ C2721e(ProfileFragment profileFragment) {
        this.f28526b = profileFragment;
    }

    @Override // com.stfalcon.imageviewer.loader.ImageLoader
    /* renamed from: b */
    public void mo14030b(ImageView imageView, Object obj) {
        ProfileFragment this$0 = this.f28526b;
        ProfileFragment.Companion companion = ProfileFragment.f28458k;
        Intrinsics.m32179h(this$0, "this$0");
        GlideApp.m16333b(this$0).m16339t(new Common().m16298c((String) obj, this$0.m15561c4().f26637b.m14082y())).m4887K(imageView);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        ProfileFragment this$0 = this.f28526b;
        ProfileFragment.Companion companion = ProfileFragment.f28458k;
        Intrinsics.m32179h(this$0, "this$0");
        this$0.mo15322u();
    }
}
