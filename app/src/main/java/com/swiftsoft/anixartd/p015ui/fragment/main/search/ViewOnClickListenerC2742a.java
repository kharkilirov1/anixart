package com.swiftsoft.anixartd.p015ui.fragment.main.search;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.search.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2742a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28916b;

    /* renamed from: c */
    public final /* synthetic */ View f28917c;

    public /* synthetic */ ViewOnClickListenerC2742a(View view, int i2) {
        this.f28916b = i2;
        this.f28917c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28916b) {
            case 0:
                View view2 = this.f28917c;
                SearchFragment.Companion companion = SearchFragment.f28894p;
                ((AppCompatEditText) view2.findViewById(C2507R.id.etSearch)).setText("");
                break;
            default:
                View view3 = this.f28917c;
                Intrinsics.m32179h(view3, "$view");
                TextView textView = (TextView) view3.findViewById(C2507R.id.last_update_date);
                Intrinsics.m32178g(textView, "view.last_update_date");
                textView.setVisibility(0);
                AppCompatImageView appCompatImageView = (AppCompatImageView) view3.findViewById(C2507R.id.date_more);
                Intrinsics.m32178g(appCompatImageView, "view.date_more");
                ViewsKt.m16372e(appCompatImageView);
                break;
        }
    }
}
