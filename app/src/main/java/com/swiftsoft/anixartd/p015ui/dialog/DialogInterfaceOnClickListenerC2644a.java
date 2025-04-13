package com.swiftsoft.anixartd.p015ui.dialog;

import android.content.DialogInterface;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2644a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27739b;

    /* renamed from: c */
    public final /* synthetic */ Object f27740c;

    public /* synthetic */ DialogInterfaceOnClickListenerC2644a(BaseDialogFragment baseDialogFragment, int i2) {
        this.f27739b = i2;
        this.f27740c = baseDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f27739b) {
            case 0:
                BookmarksExportFragment this$0 = (BookmarksExportFragment) this.f27740c;
                int i3 = BookmarksExportFragment.f27608l;
                Intrinsics.m32179h(this$0, "this$0");
                boolean[] zArr = this$0.f27613h;
                if (zArr == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                int length = zArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    boolean[] zArr2 = this$0.f27613h;
                    if (zArr2 == null) {
                        Intrinsics.m32189r("selectionProfileLists");
                        throw null;
                    }
                    zArr2[i4] = false;
                }
                return;
            case 1:
                ChooseStatusDialogFragment this$02 = (ChooseStatusDialogFragment) this.f27740c;
                int i5 = ChooseStatusDialogFragment.f27687i;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15423A3();
                return;
            default:
                ChooseTypeDialogFragment this$03 = (ChooseTypeDialogFragment) this.f27740c;
                ChooseTypeDialogFragment.Companion companion = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15427A3();
                return;
        }
    }
}
