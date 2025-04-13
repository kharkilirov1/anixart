package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import android.widget.TextView;
import at.blogc.android.views.ExpandableTextView;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.collections.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2749b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f29542b;

    /* renamed from: c */
    public final /* synthetic */ View f29543c;

    public /* synthetic */ RunnableC2749b(View view, int i2) {
        this.f29542b = i2;
        this.f29543c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.f29542b) {
            case 0:
                View view = this.f29543c;
                Intrinsics.m32179h(view, "$view");
                try {
                    ((TextView) view.findViewById(C2507R.id.description)).setTextIsSelectable(true);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                View view2 = this.f29543c;
                Intrinsics.m32179h(view2, "$view");
                try {
                    MaterialButton materialButton = (MaterialButton) view2.findViewById(C2507R.id.headerExpand);
                    Intrinsics.m32178g(materialButton, "view.headerExpand");
                    if (((ExpandableTextView) view2.findViewById(C2507R.id.headerDescription)).getLineCount() <= ((ExpandableTextView) view2.findViewById(C2507R.id.headerDescription)).getMaxLines()) {
                        z = false;
                    }
                    ViewsKt.m16380m(materialButton, z);
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
