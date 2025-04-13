package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.ExtraReleaseCollectionModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.collections.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2750c implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f29544b;

    /* renamed from: c */
    public final /* synthetic */ View f29545c;

    /* renamed from: d */
    public final /* synthetic */ Object f29546d;

    public /* synthetic */ C2750c(EpoxyModel epoxyModel, View view, int i2) {
        this.f29544b = i2;
        this.f29546d = epoxyModel;
        this.f29545c = view;
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f29544b) {
            case 0:
                ExtraCollectionModel this$0 = (ExtraCollectionModel) this.f29546d;
                View view = this.f29545c;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(view, "$view");
                switch (menuItem.getItemId()) {
                    case C2507R.id.leaders /* 2131362421 */:
                        this$0.m15862u2().mo14519a(1);
                        break;
                    case C2507R.id.popular_season /* 2131362606 */:
                        this$0.m15862u2().mo14519a(3);
                        break;
                    case C2507R.id.popular_week /* 2131362607 */:
                        this$0.m15862u2().mo14519a(4);
                        break;
                    case C2507R.id.popular_year /* 2131362608 */:
                        this$0.m15862u2().mo14519a(2);
                        break;
                    case C2507R.id.random /* 2131362655 */:
                        this$0.m15862u2().mo14519a(6);
                        break;
                    case C2507R.id.recent /* 2131362675 */:
                        this$0.m15862u2().mo14519a(5);
                        break;
                }
                ((TextView) view.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(menuItem.getTitle()));
                return true;
            default:
                ExtraReleaseCollectionModel this$02 = (ExtraReleaseCollectionModel) this.f29546d;
                View view2 = this.f29545c;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(view2, "$view");
                int itemId = menuItem.getItemId();
                if (itemId == C2507R.id.popular_first) {
                    ExtraReleaseCollectionModel.Listener listener = this$02.f29530k;
                    if (listener == null) {
                        Intrinsics.m32189r("listener");
                        throw null;
                    }
                    listener.mo15078a(1);
                } else if (itemId == C2507R.id.recent) {
                    ExtraReleaseCollectionModel.Listener listener2 = this$02.f29530k;
                    if (listener2 == null) {
                        Intrinsics.m32189r("listener");
                        throw null;
                    }
                    listener2.mo15078a(5);
                }
                ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(menuItem.getTitle()));
                return true;
        }
    }
}
