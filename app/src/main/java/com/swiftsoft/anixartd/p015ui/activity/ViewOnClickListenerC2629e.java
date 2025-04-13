package com.swiftsoft.anixartd.p015ui.activity;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2629e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27501b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetDialog f27502c;

    public /* synthetic */ ViewOnClickListenerC2629e(BottomSheetDialog bottomSheetDialog, int i2) {
        this.f27501b = i2;
        this.f27502c = bottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27501b) {
            case 0:
                BottomSheetDialog dialog = this.f27502c;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                Intrinsics.m32179h(dialog, "$dialog");
                dialog.dismiss();
                break;
            case 1:
                BottomSheetDialog dialog2 = this.f27502c;
                KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                Intrinsics.m32179h(dialog2, "$dialog");
                dialog2.dismiss();
                break;
            case 2:
                BottomSheetDialog dialog3 = this.f27502c;
                KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                Intrinsics.m32179h(dialog3, "$dialog");
                dialog3.dismiss();
                break;
            default:
                BottomSheetDialog dialog4 = this.f27502c;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                Intrinsics.m32179h(dialog4, "$dialog");
                dialog4.dismiss();
                break;
        }
    }
}
