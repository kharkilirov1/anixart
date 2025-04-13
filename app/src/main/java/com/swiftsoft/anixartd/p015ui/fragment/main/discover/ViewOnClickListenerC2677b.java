package com.swiftsoft.anixartd.p015ui.fragment.main.discover;

import android.view.View;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnDonate;
import com.yandex.metrica.YandexMetrica;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.discover.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2677b implements View.OnClickListener {

    /* renamed from: c */
    public static final /* synthetic */ ViewOnClickListenerC2677b f28077c = new ViewOnClickListenerC2677b(0);

    /* renamed from: d */
    public static final /* synthetic */ ViewOnClickListenerC2677b f28078d = new ViewOnClickListenerC2677b(1);

    /* renamed from: b */
    public final /* synthetic */ int f28079b;

    public /* synthetic */ ViewOnClickListenerC2677b(int i2) {
        this.f28079b = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28079b) {
            case 0:
                KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
                YandexMetrica.reportEvent("Переход в раздел Спонсорство");
                EventBusKt.m16327a(new OnDonate());
                break;
            default:
                KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f28062g;
                YandexMetrica.reportEvent("Переход в раздел Спонсорство");
                EventBusKt.m16327a(new OnDonate());
                break;
        }
    }
}
