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
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtraCommentsModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentsModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraCommentsModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29588k;

    /* renamed from: l */
    @EpoxyAttribute
    @PluralsRes
    public int f29589l;

    /* renamed from: m */
    @StringRes
    @EpoxyAttribute
    public int f29590m;

    /* renamed from: n */
    @EpoxyAttribute
    public long f29591n;

    /* renamed from: o */
    @EpoxyAttribute
    public int f29592o = 1;

    /* compiled from: ExtraCommentsModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentsModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14425a(int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(C2507R.id.extra);
        String string = context.getString(C2507R.string.bookmarks_count);
        Intrinsics.m32178g(string, "context.getString(R.string.bookmarks_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f29591n)}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(format);
        final PopupMenu popupMenu = new PopupMenu(view2.getContext(), (LinearLayout) view2.findViewById(C2507R.id.spinner));
        popupMenu.m882a().inflate(C2507R.menu.comments_sort, popupMenu.f1394b);
        ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(popupMenu.f1394b.getItem(this.f29592o - 1)));
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.spinner);
        Intrinsics.m32178g(linearLayout, "view.spinner");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentsModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                PopupMenu popupMenu2 = PopupMenu.this;
                popupMenu2.f1396d = new C2753b(this, view2, 1);
                Context context2 = context;
                MenuBuilder menuBuilder = popupMenu2.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context2, menuBuilder, (LinearLayout) view2.findViewById(C2507R.id.spinner));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
    }

    @NotNull
    /* renamed from: u2 */
    public final Listener m15900u2() {
        Listener listener = this.f29588k;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }
}
