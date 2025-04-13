package com.swiftsoft.anixartd.p015ui.dialog;

import android.widget.NumberPicker;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2653j implements NumberPicker.Formatter {

    /* renamed from: b */
    public static final /* synthetic */ C2653j f27762b = new C2653j(0);

    /* renamed from: c */
    public static final /* synthetic */ C2653j f27763c = new C2653j(1);

    /* renamed from: a */
    public final /* synthetic */ int f27764a;

    public /* synthetic */ C2653j(int i2) {
        this.f27764a = i2;
    }

    @Override // android.widget.NumberPicker.Formatter
    public final String format(int i2) {
        switch (this.f27764a) {
            case 0:
                int i3 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                return i2 + " мин";
            default:
                int i4 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                return i2 + " сек";
        }
    }
}
