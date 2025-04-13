package com.swiftsoft.anixartd.p015ui.model.main.schedule;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.lottie.LottieAnimationView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: HeaderModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/schedule/HeaderModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class HeaderModel extends EpoxyModel<View> {

    /* renamed from: k */
    @StringRes
    @EpoxyAttribute
    @Nullable
    public Integer f30083k = 0;

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        int i2 = Calendar.getInstance(Locale.getDefault()).get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(C2507R.id.isToday);
        Intrinsics.m32178g(lottieAnimationView, "view.isToday");
        Integer num = this.f30083k;
        ViewsKt.m16380m(lottieAnimationView, num != null && num.intValue() == i2);
        TextView textView = (TextView) view2.findViewById(C2507R.id.header);
        Integer num2 = this.f30083k;
        textView.setText(context.getString((num2 != null && num2.intValue() == 1) ? C2507R.string.monday : (num2 != null && num2.intValue() == 2) ? C2507R.string.tuesday : (num2 != null && num2.intValue() == 3) ? C2507R.string.wednesday : (num2 != null && num2.intValue() == 4) ? C2507R.string.thursday : (num2 != null && num2.intValue() == 5) ? C2507R.string.friday : (num2 != null && num2.intValue() == 6) ? C2507R.string.saturday : (num2 != null && num2.intValue() == 7) ? C2507R.string.sunday : C2507R.string.error));
    }
}
