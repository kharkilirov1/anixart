package com.google.android.material.chip;

import android.widget.CompoundButton;
import com.google.android.material.internal.MaterialCheckable;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseGenresDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1251a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f17872a;

    /* renamed from: b */
    public final /* synthetic */ Object f17873b;

    public /* synthetic */ C1251a(Object obj, int i2) {
        this.f17872a = i2;
        this.f17873b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f17872a) {
            case 0:
                Chip chip = (Chip) this.f17873b;
                MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener = chip.f17781k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.mo10114a(chip, z);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.f17780j;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            default:
                ChooseGenresDialogFragment this$0 = (ChooseGenresDialogFragment) this.f17873b;
                ChooseGenresDialogFragment.Companion companion = ChooseGenresDialogFragment.f27668j;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.f27674h = z;
                break;
        }
    }
}
