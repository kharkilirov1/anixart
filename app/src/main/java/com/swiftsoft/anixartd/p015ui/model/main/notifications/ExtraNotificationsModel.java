package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtraNotificationsModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/ExtraNotificationsModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraNotificationsModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public int f29746k = 1;

    /* renamed from: l */
    @EpoxyAttribute
    public Listener f29747l;

    /* compiled from: ExtraNotificationsModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/ExtraNotificationsModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14715a(int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final PopupMenu popupMenu = new PopupMenu(view2.getContext(), (LinearLayout) view2.findViewById(C2507R.id.spinner));
        popupMenu.m882a().inflate(C2507R.menu.notifications_filter, popupMenu.f1394b);
        ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(popupMenu.f1394b.getItem(this.f29746k - 1)));
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.spinner);
        Intrinsics.m32178g(linearLayout, "view.spinner");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.ExtraNotificationsModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                PopupMenu popupMenu2 = PopupMenu.this;
                final ExtraNotificationsModel extraNotificationsModel = this;
                final View view4 = view2;
                popupMenu2.f1396d = new PopupMenu.OnMenuItemClickListener() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.a
                    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ExtraNotificationsModel this$0 = ExtraNotificationsModel.this;
                        View view5 = view4;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(view5, "$view");
                        int itemId = menuItem.getItemId();
                        if (itemId != C2507R.id.all_notifications) {
                            switch (itemId) {
                                case C2507R.id.only_comment_notifications /* 2131362570 */:
                                    this$0.m16011u2().mo14715a(5);
                                    break;
                                case C2507R.id.only_episode_notifications /* 2131362571 */:
                                    this$0.m16011u2().mo14715a(2);
                                    break;
                                case C2507R.id.only_friend_notifications /* 2131362572 */:
                                    this$0.m16011u2().mo14715a(4);
                                    break;
                                case C2507R.id.only_release_notifications /* 2131362573 */:
                                    this$0.m16011u2().mo14715a(3);
                                    break;
                            }
                        } else {
                            this$0.m16011u2().mo14715a(1);
                        }
                        C2052a.m12279n(menuItem, (TextView) view5.findViewById(C2507R.id.selectedSort));
                        return true;
                    }
                };
                Context context = view4.getContext();
                MenuBuilder menuBuilder = PopupMenu.this.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, (LinearLayout) view2.findViewById(C2507R.id.spinner));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
    }

    @NotNull
    /* renamed from: u2 */
    public final Listener m16011u2() {
        Listener listener = this.f29747l;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }
}
