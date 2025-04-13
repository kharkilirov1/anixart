package com.swiftsoft.anixartd.p015ui.dialog;

import android.content.DialogInterface;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnMultiChoiceClickListenerC2645b implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f27741a;

    /* renamed from: b */
    public final /* synthetic */ Object f27742b;

    public /* synthetic */ DialogInterfaceOnMultiChoiceClickListenerC2645b(BaseDialogFragment baseDialogFragment, int i2) {
        this.f27741a = i2;
        this.f27742b = baseDialogFragment;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
        switch (this.f27741a) {
            case 0:
                BookmarksExportFragment this$0 = (BookmarksExportFragment) this.f27742b;
                int i3 = BookmarksExportFragment.f27608l;
                Intrinsics.m32179h(this$0, "this$0");
                boolean[] zArr = this$0.f27613h;
                if (zArr != null) {
                    zArr[i2] = z;
                    return;
                } else {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
            case 1:
                ChooseStatusDialogFragment this$02 = (ChooseStatusDialogFragment) this.f27742b;
                int i4 = ChooseStatusDialogFragment.f27687i;
                Intrinsics.m32179h(this$02, "this$0");
                boolean[] zArr2 = this$02.f27689e;
                if (zArr2 != null) {
                    zArr2[i2] = z;
                    return;
                } else {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
            default:
                ChooseTypeDialogFragment this$03 = (ChooseTypeDialogFragment) this.f27742b;
                ChooseTypeDialogFragment.Companion companion = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$03, "this$0");
                boolean[] zArr3 = this$03.f27696f;
                if (zArr3 != null) {
                    zArr3[i2] = z;
                    return;
                } else {
                    Intrinsics.m32189r("selectionTypes");
                    throw null;
                }
        }
    }
}
