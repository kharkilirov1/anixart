package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCollectionsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.release.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2726a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28798b;

    /* renamed from: c */
    public final /* synthetic */ Object f28799c;

    public /* synthetic */ ViewOnClickListenerC2726a(Object obj, int i2) {
        this.f28798b = i2;
        this.f28799c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28798b) {
            case 0:
                ReleaseCollectionsFragment this$0 = (ReleaseCollectionsFragment) this.f28799c;
                ReleaseCollectionsFragment.Companion companion = ReleaseCollectionsFragment.f28653i;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15437u3().mo15323a3();
                break;
            default:
                BottomSheetDialog dialog = (BottomSheetDialog) this.f28799c;
                ReleaseFragment.Companion companion2 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(dialog, "$dialog");
                dialog.dismiss();
                break;
        }
    }
}
