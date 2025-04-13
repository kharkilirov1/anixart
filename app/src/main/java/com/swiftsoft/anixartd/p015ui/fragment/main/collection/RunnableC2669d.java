package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.collection.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2669d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f28035b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetDialog f28036c;

    public /* synthetic */ RunnableC2669d(BottomSheetDialog bottomSheetDialog, int i2) {
        this.f28035b = i2;
        this.f28036c = bottomSheetDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28035b) {
            case 0:
                BottomSheetDialog dialog = this.f28036c;
                CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                Intrinsics.m32179h(dialog, "$dialog");
                dialog.dismiss();
                break;
            case 1:
                BottomSheetDialog dialog2 = this.f28036c;
                CollectionCommentsFragment.Companion companion2 = CollectionCommentsFragment.f27910l;
                Intrinsics.m32179h(dialog2, "$dialog");
                dialog2.dismiss();
                break;
            case 2:
                BottomSheetDialog dialog3 = this.f28036c;
                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                Intrinsics.m32179h(dialog3, "$dialog");
                dialog3.dismiss();
                break;
            default:
                BottomSheetDialog dialog4 = this.f28036c;
                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                Intrinsics.m32179h(dialog4, "$dialog");
                dialog4.dismiss();
                break;
        }
    }
}
