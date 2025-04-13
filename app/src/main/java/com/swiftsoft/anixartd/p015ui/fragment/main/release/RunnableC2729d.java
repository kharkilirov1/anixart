package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.release.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2729d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f28806b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetDialog f28807c;

    public /* synthetic */ RunnableC2729d(BottomSheetDialog bottomSheetDialog, int i2) {
        this.f28806b = i2;
        this.f28807c = bottomSheetDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28806b) {
            case 0:
                BottomSheetDialog dialog = this.f28807c;
                ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                Intrinsics.m32179h(dialog, "$dialog");
                dialog.dismiss();
                break;
            case 1:
                BottomSheetDialog dialog2 = this.f28807c;
                ReleaseCommentsFragment.Companion companion2 = ReleaseCommentsFragment.f28664l;
                Intrinsics.m32179h(dialog2, "$dialog");
                dialog2.dismiss();
                break;
            case 2:
                BottomSheetDialog dialog3 = this.f28807c;
                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                Intrinsics.m32179h(dialog3, "$dialog");
                dialog3.dismiss();
                break;
            case 3:
                BottomSheetDialog dialog4 = this.f28807c;
                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                Intrinsics.m32179h(dialog4, "$dialog");
                dialog4.dismiss();
                break;
            case 4:
                BottomSheetDialog dialog5 = this.f28807c;
                ReleaseFragment.Companion companion5 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(dialog5, "$dialog");
                dialog5.dismiss();
                break;
            default:
                BottomSheetDialog dialog6 = this.f28807c;
                ReleaseFragment.Companion companion6 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(dialog6, "$dialog");
                dialog6.dismiss();
                break;
        }
    }
}
