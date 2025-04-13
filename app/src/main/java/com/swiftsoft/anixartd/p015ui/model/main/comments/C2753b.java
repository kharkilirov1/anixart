package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.comments.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2753b implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f29600b;

    /* renamed from: c */
    public final /* synthetic */ View f29601c;

    /* renamed from: d */
    public final /* synthetic */ Object f29602d;

    public /* synthetic */ C2753b(EpoxyModel epoxyModel, View view, int i2) {
        this.f29600b = i2;
        this.f29602d = epoxyModel;
        this.f29601c = view;
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f29600b) {
            case 0:
                ExtraCommentVotesModel this$0 = (ExtraCommentVotesModel) this.f29602d;
                View view = this.f29601c;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(view, "$view");
                int itemId = menuItem.getItemId();
                if (itemId == C2507R.id.all) {
                    this$0.m15893u2().mo14303a(0);
                } else if (itemId == C2507R.id.negative) {
                    this$0.m15893u2().mo14303a(1);
                } else if (itemId == C2507R.id.positive) {
                    this$0.m15893u2().mo14303a(2);
                }
                ((TextView) view.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(menuItem.getTitle()));
                break;
            default:
                ExtraCommentsModel this$02 = (ExtraCommentsModel) this.f29602d;
                View view2 = this.f29601c;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(view2, "$view");
                int itemId2 = menuItem.getItemId();
                if (itemId2 == C2507R.id.newest) {
                    this$02.m15900u2().mo14425a(1);
                } else if (itemId2 == C2507R.id.oldest) {
                    this$02.m15900u2().mo14425a(2);
                } else if (itemId2 == C2507R.id.popular) {
                    this$02.m15900u2().mo14425a(3);
                }
                ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(menuItem.getTitle()));
                break;
        }
        return true;
    }
}
