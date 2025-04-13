package com.swiftsoft.anixartd.p015ui.model.common;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListCountModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ListCountModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ListCountModel extends EpoxyModel<View> {
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(C2507R.id.count);
        String string = context.getString(C2507R.string.bookmarks_count);
        Intrinsics.m32178g(string, "context.getString(R.string.bookmarks_count)");
        C2052a.m12290y(new Object[]{0L}, 1, string, "format(format, *args)", textView);
    }
}
