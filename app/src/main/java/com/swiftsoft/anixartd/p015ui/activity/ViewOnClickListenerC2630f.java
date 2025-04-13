package com.swiftsoft.anixartd.p015ui.activity;

import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnDonate;
import com.yandex.metrica.YandexMetrica;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2630f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27503b;

    /* renamed from: c */
    public final /* synthetic */ MainActivity f27504c;

    public /* synthetic */ ViewOnClickListenerC2630f(MainActivity mainActivity, int i2) {
        this.f27503b = i2;
        this.f27504c = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27503b) {
            case 0:
                MainActivity this$0 = this.f27504c;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15332t4().mo10646a();
                break;
            default:
                MainActivity this$02 = this.f27504c;
                KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                Intrinsics.m32179h(this$02, "this$0");
                if (!this$02.m15333u4().m14312a()) {
                    YandexMetrica.reportEvent("Переход в раздел Спонсорство");
                    EventBusKt.m16327a(new OnDonate());
                    break;
                } else {
                    Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(this$02);
                    builder.f30150b = 2;
                    builder.m16318j(C2507R.string.information);
                    String string = this$02.getString(C2507R.string.donation_bonus_no_ads_no_auth);
                    Intrinsics.m32178g(string, "getString(R.string.donation_bonus_no_ads_no_auth)");
                    builder.f30152d = string;
                    builder.m16315g(C2507R.string.close);
                    builder.m16317i();
                    break;
                }
        }
    }
}
