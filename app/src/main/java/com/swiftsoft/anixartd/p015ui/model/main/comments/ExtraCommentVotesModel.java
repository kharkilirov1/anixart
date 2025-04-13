package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Plurals;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtraCommentVotesModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentVotesModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraCommentVotesModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29579k;

    /* renamed from: l */
    @EpoxyAttribute
    @PluralsRes
    public int f29580l;

    /* renamed from: m */
    @StringRes
    @EpoxyAttribute
    public int f29581m;

    /* renamed from: n */
    @EpoxyAttribute
    public long f29582n;

    /* renamed from: o */
    @EpoxyAttribute
    public int f29583o;

    /* compiled from: ExtraCommentVotesModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentVotesModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14303a(int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(C2507R.id.extra);
        Plurals plurals = Plurals.f30231a;
        Context context2 = view2.getContext();
        Intrinsics.m32178g(context2, "view.context");
        textView.setText(plurals.m16343c(context2, this.f29582n, this.f29580l, this.f29581m));
        final PopupMenu popupMenu = new PopupMenu(view2.getContext(), (LinearLayout) view2.findViewById(C2507R.id.spinner));
        popupMenu.m882a().inflate(C2507R.menu.comment_votes_sort, popupMenu.f1394b);
        ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(popupMenu.f1394b.getItem(this.f29583o)));
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.spinner);
        Intrinsics.m32178g(linearLayout, "view.spinner");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentVotesModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                PopupMenu popupMenu2 = PopupMenu.this;
                popupMenu2.f1396d = new C2753b(this, view2, 0);
                Context context3 = context;
                MenuBuilder menuBuilder = popupMenu2.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context3, menuBuilder, (LinearLayout) view2.findViewById(C2507R.id.spinner));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
    }

    @NotNull
    /* renamed from: u2 */
    public final Listener m15893u2() {
        Listener listener = this.f29579k;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }
}
