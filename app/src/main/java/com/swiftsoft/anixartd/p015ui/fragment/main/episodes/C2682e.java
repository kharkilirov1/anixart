package com.swiftsoft.anixartd.p015ui.fragment.main.episodes;

import android.view.MenuItem;
import androidx.appcompat.widget.PopupMenu;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.chip.ChipGroup;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.TorlookFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.torlook.TorlookUiLogic;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.episodes.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2682e implements SwipeRefreshLayout.OnRefreshListener, ChipGroup.OnCheckedStateChangeListener, PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ TorlookFragment f28137b;

    public /* synthetic */ C2682e(TorlookFragment torlookFragment) {
        this.f28137b = torlookFragment;
    }

    @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
    /* renamed from: a */
    public void mo9961a(ChipGroup group, List list) {
        TorlookFragment this$0 = this.f28137b;
        TorlookFragment.Companion companion = TorlookFragment.f28119i;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(group, "group");
        if (list.size() == 0) {
            TorlookPresenter m15502c4 = this$0.m15502c4();
            Objects.requireNonNull(m15502c4);
            TorlookUiLogic torlookUiLogic = m15502c4.f26352c;
            Objects.requireNonNull(torlookUiLogic);
            torlookUiLogic.f29062c = "";
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer checkedId = (Integer) it.next();
                TorlookPresenter m15502c42 = this$0.m15502c4();
                ArrayList<Type> m15504m4 = this$0.m15504m4();
                Intrinsics.m32178g(checkedId, "checkedId");
                String type = m15504m4.get(checkedId.intValue()).getName();
                Objects.requireNonNull(m15502c42);
                Intrinsics.m32179h(type, "type");
                TorlookUiLogic torlookUiLogic2 = m15502c42.f26352c;
                Objects.requireNonNull(torlookUiLogic2);
                torlookUiLogic2.f29062c = type;
            }
        }
        this$0.m15505u();
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        TorlookFragment this$0 = this.f28137b;
        TorlookFragment.Companion companion = TorlookFragment.f28119i;
        Intrinsics.m32179h(this$0, "this$0");
        TorlookPresenter m15502c4 = this$0.m15502c4();
        String title = menuItem.getTitle().toString();
        Objects.requireNonNull(m15502c4);
        Intrinsics.m32179h(title, "title");
        TorlookUiLogic torlookUiLogic = m15502c4.f26352c;
        Objects.requireNonNull(torlookUiLogic);
        torlookUiLogic.f29061b = title;
        m15502c4.getViewState().mo14629m2(title);
        this$0.m15505u();
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        TorlookFragment this$0 = this.f28137b;
        TorlookFragment.Companion companion = TorlookFragment.f28119i;
        Intrinsics.m32179h(this$0, "this$0");
        this$0.m15505u();
    }
}
