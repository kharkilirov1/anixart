package com.swiftsoft.anixartd.p015ui.model.extra;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImpMessageModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/extra/ImpMessageModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ImpMessageModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29454k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29455l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29456m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f29457n = "";

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f29458o;

    /* compiled from: ImpMessageModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/extra/ImpMessageModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a0 */
        void mo14660a0(@NotNull String str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.impMessageText)).setText(Html.fromHtml(this.f29454k));
        try {
            if (!StringsKt.m33879E(this.f29456m)) {
                Drawable m497b = AppCompatResources.m497b(context, C2507R.drawable.background_imp_message);
                Intrinsics.m32176e(m497b);
                Drawable m1845q = DrawableCompat.m1845q(m497b);
                Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
                DrawableCompat.m1841m(m1845q, Color.parseColor('#' + this.f29456m));
                ((TextView) view2.findViewById(C2507R.id.impMessageText)).setBackground(m1845q);
            }
            if (!StringsKt.m33879E(this.f29457n)) {
                ((TextView) view2.findViewById(C2507R.id.impMessageText)).setTextColor(Color.parseColor('#' + this.f29457n));
            }
        } catch (Exception unused) {
        }
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 1));
    }
}
