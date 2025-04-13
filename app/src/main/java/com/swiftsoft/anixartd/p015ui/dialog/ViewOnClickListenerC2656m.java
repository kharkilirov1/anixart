package com.swiftsoft.anixartd.p015ui.dialog;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import com.swiftsoft.anixartd.utils.radiobutton.types.OneFieldCardRadioButton;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2656m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27770b;

    /* renamed from: c */
    public final /* synthetic */ ChooseTypeDialogFragment f27771c;

    /* renamed from: d */
    public final /* synthetic */ View f27772d;

    public /* synthetic */ ViewOnClickListenerC2656m(View view, ChooseTypeDialogFragment chooseTypeDialogFragment) {
        this.f27770b = 2;
        this.f27772d = view;
        this.f27771c = chooseTypeDialogFragment;
    }

    public /* synthetic */ ViewOnClickListenerC2656m(ChooseTypeDialogFragment chooseTypeDialogFragment, View view, int i2) {
        this.f27770b = i2;
        this.f27771c = chooseTypeDialogFragment;
        this.f27772d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27770b) {
            case 0:
                ChooseTypeDialogFragment this$0 = this.f27771c;
                View view2 = this.f27772d;
                ChooseTypeDialogFragment.Companion companion = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32178g(view2, "view");
                this$0.m15429e4(view2);
                ArrayList<Long> arrayList = this$0.f27697g;
                if (arrayList == null) {
                    Intrinsics.m32189r("profileTypeNotificationPreferences");
                    throw null;
                }
                arrayList.clear();
                this$0.m15431n4();
                return;
            case 1:
                ChooseTypeDialogFragment this$02 = this.f27771c;
                View view3 = this.f27772d;
                ChooseTypeDialogFragment.Companion companion2 = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32178g(view3, "view");
                this$02.m15428c4(view3);
                ArrayList<Long> arrayList2 = this$02.f27697g;
                if (arrayList2 == null) {
                    Intrinsics.m32189r("profileTypeNotificationPreferences");
                    throw null;
                }
                arrayList2.clear();
                String[] strArr = this$02.f27695e;
                if (strArr == null) {
                    Intrinsics.m32189r("typesValues");
                    throw null;
                }
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    String str = strArr[i2];
                    int i4 = i3 + 1;
                    boolean[] zArr = this$02.f27696f;
                    if (zArr == null) {
                        Intrinsics.m32189r("selectionTypes");
                        throw null;
                    }
                    zArr[i3] = false;
                    ArrayList<Long> arrayList3 = this$02.f27697g;
                    if (arrayList3 == null) {
                        Intrinsics.m32189r("profileTypeNotificationPreferences");
                        throw null;
                    }
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                    i2++;
                    i3 = i4;
                }
                this$02.m15431n4();
                return;
            default:
                View view4 = this.f27772d;
                ChooseTypeDialogFragment this$03 = this.f27771c;
                ChooseTypeDialogFragment.Companion companion3 = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$03, "this$0");
                if (((OneFieldCardRadioButton) view4.findViewById(C2507R.id.all)).isChecked) {
                    boolean[] zArr2 = this$03.f27696f;
                    if (zArr2 == null) {
                        Intrinsics.m32189r("selectionTypes");
                        throw null;
                    }
                    int length2 = zArr2.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        boolean[] zArr3 = this$03.f27696f;
                        if (zArr3 == null) {
                            Intrinsics.m32189r("selectionTypes");
                            throw null;
                        }
                        zArr3[i5] = false;
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(view4.getContext(), C2507R.style.DialogTheme);
                builder.mo377k(C2507R.string.select_types);
                String[] strArr2 = this$03.f27694d;
                if (strArr2 == null) {
                    Intrinsics.m32189r("types");
                    throw null;
                }
                boolean[] zArr4 = this$03.f27696f;
                if (zArr4 == null) {
                    Intrinsics.m32189r("selectionTypes");
                    throw null;
                }
                DialogInterfaceOnMultiChoiceClickListenerC2645b dialogInterfaceOnMultiChoiceClickListenerC2645b = new DialogInterfaceOnMultiChoiceClickListenerC2645b(this$03, 2);
                AlertController.AlertParams alertParams = builder.f413a;
                alertParams.f388q = strArr2;
                alertParams.f396y = dialogInterfaceOnMultiChoiceClickListenerC2645b;
                alertParams.f392u = zArr4;
                alertParams.f393v = true;
                AlertDialog create = builder.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterfaceOnClickListenerC2644a(this$03, 2)).create();
                Intrinsics.m32178g(create, "builder.setTitle(R.strin…                .create()");
                create.show();
                Button m365g = create.m365g(-1);
                m365g.setOnClickListener(new ViewOnClickListenerC2647d(this$03, view4, create, m365g, 2));
                return;
        }
    }
}
