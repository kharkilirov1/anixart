package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationsPushDisabledModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationsPushDisabledModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class NotificationsPushDisabledModel extends EpoxyModel<View> {
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final Context context = view2.getContext();
        Button button = (Button) view2.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(button, "view.settings");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.NotificationsPushDisabledModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                Context context2 = context;
                Intrinsics.m32178g(context2, "context");
                Intent intent = new Intent();
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName());
                } else {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("app_package", context2.getPackageName());
                    intent.putExtra("app_uid", context2.getApplicationInfo().uid);
                }
                context2.startActivity(intent);
                return Unit.f63088a;
            }
        });
    }
}
