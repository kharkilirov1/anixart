package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.stfalcon.imageviewer.loader.ImageLoader;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.GlideApp;
import com.swiftsoft.anixartd.utils.GlideRequests;
import com.swiftsoft.anixartd.utils.ReleaseLinkMovementMethod;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.release.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2736k implements ImageLoader, SwipeRefreshLayout.OnRefreshListener, ReleaseLinkMovementMethod.ClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28825b;

    /* renamed from: c */
    public final /* synthetic */ ReleaseFragment f28826c;

    public /* synthetic */ C2736k(ReleaseFragment releaseFragment, int i2) {
        this.f28825b = i2;
        this.f28826c = releaseFragment;
    }

    @Override // com.swiftsoft.anixartd.utils.ReleaseLinkMovementMethod.ClickListener
    /* renamed from: a */
    public boolean mo15631a(String it) {
        switch (this.f28825b) {
            case 2:
                ReleaseFragment this$0 = this.f28826c;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32178g(it, "it");
                if (!StringsKt.m33922t(it, "studio#", false, 2, null)) {
                    if (!StringsKt.m33922t(it, "director#", false, 2, null)) {
                        if (StringsKt.m33922t(it, "author#", false, 2, null)) {
                            this$0.f28729q.mo15630d(StringsKt.m33891Q(it, "author#", "", false, 4, null));
                            break;
                        }
                    } else {
                        this$0.f28729q.mo15627a(StringsKt.m33891Q(it, "director#", "", false, 4, null));
                        break;
                    }
                } else {
                    this$0.f28729q.mo15629c(StringsKt.m33891Q(it, "studio#", "", false, 4, null));
                    break;
                }
                break;
            default:
                ReleaseFragment this$02 = this.f28826c;
                ReleaseFragment.Companion companion2 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32178g(it, "it");
                if (StringsKt.m33922t(it, "genre#", false, 2, null)) {
                    this$02.f28729q.mo15628b(StringsKt.m33891Q(it, "genre#", "", false, 4, null));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.stfalcon.imageviewer.loader.ImageLoader
    /* renamed from: b */
    public void mo14030b(ImageView imageView, Object obj) {
        switch (this.f28825b) {
            case 0:
                ReleaseFragment this$0 = this.f28826c;
                Intrinsics.m32179h(this$0, "this$0");
                GlideRequests m16333b = GlideApp.m16333b(this$0);
                Common common = new Common();
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                m16333b.m16339t(common.m16298c((String) obj, this$0.m15619e4().f26943g.m14082y())).m4887K(imageView);
                break;
            default:
                ReleaseFragment this$02 = this.f28826c;
                ReleaseFragment.Companion companion2 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$02, "this$0");
                GlideApp.m16333b(this$02).m16339t(new Common().m16298c((String) obj, this$02.m15619e4().f26943g.m14082y())).m4887K(imageView);
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        ReleaseFragment this$0 = this.f28826c;
        ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
        Intrinsics.m32179h(this$0, "this$0");
        ReleasePresenter m15619e4 = this$0.m15619e4();
        ReleaseUiLogic releaseUiLogic = m15619e4.f26944h;
        if (releaseUiLogic.f28956a) {
            releaseUiLogic.f29299m = false;
            releaseUiLogic.f29292f.clear();
            releaseUiLogic.f29301o.clear();
            releaseUiLogic.f29304r.clear();
            if (m15619e4.m15014a()) {
                ReleasePresenter.m15012l(m15619e4, 0, false, false, 7);
            } else {
                ReleasePresenter.m15012l(m15619e4, 0, false, true, 1);
            }
        }
    }
}
