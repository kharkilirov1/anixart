package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SuperMenuModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/SuperMenuModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SuperMenuModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29648k;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29649l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public int f29650m;

    /* renamed from: n */
    @EpoxyAttribute
    public int f29651n;

    /* renamed from: o */
    @EpoxyAttribute
    public int f29652o;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29653p;

    /* renamed from: q */
    @EpoxyAttribute
    public Listener f29654q;

    /* compiled from: SuperMenuModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/SuperMenuModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14546a(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29649l);
        ((TextView) view2.findViewById(C2507R.id.title)).setTextColor(context.getResources().getColor(this.f29650m));
        ((ImageView) view2.findViewById(C2507R.id.icon)).setImageResource(this.f29652o);
        ((ImageView) view2.findViewById(C2507R.id.icon)).setImageTintList(ColorStateList.valueOf(context.getResources().getColor(this.f29650m)));
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.new_dot);
        Intrinsics.m32178g(appCompatImageView, "view.new_dot");
        ViewsKt.m16379l(appCompatImageView, this.f29653p);
        ((RelativeLayout) view2.findViewById(C2507R.id.layout)).setBackgroundColor(context.getResources().getColor(this.f29651n));
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 7));
    }
}
