package com.swiftsoft.anixartd.p015ui.model.main.bookmarks;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
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
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtraBookmarksModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/bookmarks/ExtraBookmarksModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraBookmarksModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29464k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29465l;

    /* renamed from: m */
    @EpoxyAttribute
    public int f29466m = 1;

    /* compiled from: ExtraBookmarksModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/bookmarks/ExtraBookmarksModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: Y */
        void mo14361Y();

        /* renamed from: a */
        void mo14362a(int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(C2507R.id.count);
        String string = context.getString(C2507R.string.bookmarks_count);
        Intrinsics.m32178g(string, "context.getString(R.string.bookmarks_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f29465l)}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(format);
        final PopupMenu popupMenu = new PopupMenu(view2.getContext(), (LinearLayout) view2.findViewById(C2507R.id.spinner));
        popupMenu.m882a().inflate(C2507R.menu.bookmarks_sort, popupMenu.f1394b);
        ((TextView) view2.findViewById(C2507R.id.selectedSort)).setText(String.valueOf(popupMenu.f1394b.getItem(this.f29466m - 1)));
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.spinner);
        Intrinsics.m32178g(linearLayout, "view.spinner");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                PopupMenu popupMenu2 = PopupMenu.this;
                final View view4 = view2;
                final ExtraBookmarksModel extraBookmarksModel = this;
                popupMenu2.f1396d = new PopupMenu.OnMenuItemClickListener() { // from class: com.swiftsoft.anixartd.ui.model.main.bookmarks.a
                    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        View view5 = view4;
                        ExtraBookmarksModel this$0 = extraBookmarksModel;
                        Intrinsics.m32179h(view5, "$view");
                        Intrinsics.m32179h(this$0, "this$0");
                        switch (menuItem.getItemId()) {
                            case C2507R.id.profile_list_asc /* 2131362628 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_asc));
                                this$0.m15801u2().mo14362a(2);
                                break;
                            case C2507R.id.profile_list_desc /* 2131362629 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_desc));
                                this$0.m15801u2().mo14362a(1);
                                break;
                            case C2507R.id.release_asc /* 2131362697 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_asc));
                                this$0.m15801u2().mo14362a(4);
                                break;
                            case C2507R.id.release_desc /* 2131362698 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_desc));
                                this$0.m15801u2().mo14362a(3);
                                break;
                            case C2507R.id.title_asc /* 2131363008 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_asc));
                                this$0.m15801u2().mo14362a(6);
                                break;
                            case C2507R.id.title_desc /* 2131363009 */:
                                ((ImageView) view5.findViewById(C2507R.id.iconselectedSort)).setImageDrawable(view5.getResources().getDrawable(C2507R.drawable.sort_desc));
                                this$0.m15801u2().mo14362a(5);
                                break;
                        }
                        C2052a.m12279n(menuItem, (TextView) view5.findViewById(C2507R.id.selectedSort));
                        return true;
                    }
                };
                Context context2 = view4.getContext();
                MenuBuilder menuBuilder = PopupMenu.this.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context2, menuBuilder, (LinearLayout) view2.findViewById(C2507R.id.spinner));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.random);
        Intrinsics.m32178g(linearLayout2, "view.random");
        ViewsKt.m16377j(linearLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ExtraBookmarksModel.this.m15801u2().mo14361Y();
                return Unit.f63088a;
            }
        });
    }

    @NotNull
    /* renamed from: u2 */
    public final Listener m15801u2() {
        Listener listener = this.f29464k;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }
}
