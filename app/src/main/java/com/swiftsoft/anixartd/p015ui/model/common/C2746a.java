package com.swiftsoft.anixartd.p015ui.model.common;

import android.widget.CompoundButton;
import com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.common.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2746a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f29452a;

    /* renamed from: b */
    public final /* synthetic */ CheckboxModel f29453b;

    public /* synthetic */ C2746a(CheckboxModel checkboxModel, int i2) {
        this.f29452a = i2;
        this.f29453b = checkboxModel;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f29452a) {
            case 0:
                CheckboxModel this$0 = this.f29453b;
                Intrinsics.m32179h(this$0, "this$0");
                CheckboxModel.Listener listener = this$0.f29381n;
                if (listener != null) {
                    listener.mo14649a(z, this$0.f29379l);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
            default:
                CheckboxModel this$02 = this.f29453b;
                Intrinsics.m32179h(this$02, "this$0");
                CheckboxModel.Listener listener2 = this$02.f29381n;
                if (listener2 != null) {
                    listener2.mo14649a(z, this$02.f29379l);
                    return;
                } else {
                    Intrinsics.m32189r("listener");
                    throw null;
                }
        }
    }
}
