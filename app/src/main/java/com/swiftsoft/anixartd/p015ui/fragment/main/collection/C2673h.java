package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.stfalcon.imageviewer.loader.ImageLoader;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.GlideApp;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.collection.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2673h implements ImageLoader, SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: b */
    public final /* synthetic */ CollectionFragment f28045b;

    public /* synthetic */ C2673h(CollectionFragment collectionFragment) {
        this.f28045b = collectionFragment;
    }

    @Override // com.stfalcon.imageviewer.loader.ImageLoader
    /* renamed from: b */
    public void mo14030b(ImageView imageView, Object obj) {
        CollectionFragment this$0 = this.f28045b;
        CollectionFragment.Companion companion = CollectionFragment.f27978k;
        Intrinsics.m32179h(this$0, "this$0");
        GlideApp.m16333b(this$0).m16339t(new Common().m16298c((String) obj, this$0.m15476c4().f26071c.m14082y())).m4887K(imageView);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        CollectionFragment this$0 = this.f28045b;
        CollectionFragment.Companion companion = CollectionFragment.f27978k;
        Intrinsics.m32179h(this$0, "this$0");
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this$0.f27985i;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener2 = this$0.f27985i;
        if (endlessRecyclerViewScrollListener2 == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener2.f27402c = 2;
        CollectionPresenter m15476c4 = this$0.m15476c4();
        CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
        if (collectionUiLogic.f28956a) {
            collectionUiLogic.m15674a();
            m15476c4.m14378c(false, true);
        }
    }
}
