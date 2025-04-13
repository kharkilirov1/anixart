package com.swiftsoft.anixartd.p015ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2647d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27746b;

    /* renamed from: c */
    public final /* synthetic */ View f27747c;

    /* renamed from: d */
    public final /* synthetic */ Object f27748d;

    /* renamed from: e */
    public final /* synthetic */ Object f27749e;

    /* renamed from: f */
    public final /* synthetic */ Object f27750f;

    public /* synthetic */ ViewOnClickListenerC2647d(BaseDialogFragment baseDialogFragment, View view, AlertDialog alertDialog, Button button, int i2) {
        this.f27746b = i2;
        this.f27750f = baseDialogFragment;
        this.f27747c = view;
        this.f27748d = alertDialog;
        this.f27749e = button;
    }

    public /* synthetic */ ViewOnClickListenerC2647d(DivActionBinder divActionBinder, Div2View div2View, View view, List list) {
        this.f27746b = 3;
        this.f27750f = divActionBinder;
        this.f27748d = div2View;
        this.f27747c = view;
        this.f27749e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27746b) {
            case 0:
                BookmarksExportFragment this$0 = (BookmarksExportFragment) this.f27750f;
                View view2 = this.f27747c;
                AlertDialog dialog = (AlertDialog) this.f27748d;
                Button button = (Button) this.f27749e;
                int i2 = BookmarksExportFragment.f27608l;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(dialog, "$dialog");
                boolean[] zArr = this$0.f27613h;
                if (zArr == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                if (!ArraysKt.m31965o(zArr, true)) {
                    Dialogs dialogs = Dialogs.f30143a;
                    Context context = button.getContext();
                    Intrinsics.m32178g(context, "context");
                    String string = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string, "getString(R.string.error)");
                    String string2 = this$0.getString(C2507R.string.bookmarks_no_list_selected);
                    Intrinsics.m32178g(string2, "getString(R.string.bookmarks_no_list_selected)");
                    dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                    return;
                }
                Intrinsics.m32178g(view2, "view");
                ArrayList<Integer> arrayList = this$0.f27614i;
                if (arrayList == null) {
                    Intrinsics.m32189r("selectionProfileListsValues");
                    throw null;
                }
                arrayList.clear();
                boolean[] zArr2 = this$0.f27613h;
                if (zArr2 == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                int length = zArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (zArr2[i3]) {
                        ArrayList<Integer> arrayList2 = this$0.f27614i;
                        if (arrayList2 == null) {
                            Intrinsics.m32189r("selectionProfileListsValues");
                            throw null;
                        }
                        String[] strArr = this$0.f27612g;
                        if (strArr == null) {
                            Intrinsics.m32189r("profileListsValues");
                            throw null;
                        }
                        arrayList2.add(Integer.valueOf(Integer.parseInt(strArr[i4])));
                    }
                    i3++;
                    i4 = i5;
                }
                boolean isChecked = ((CheckBox) view2.findViewById(C2507R.id.cb_title_original_included)).isChecked();
                boolean isChecked2 = ((CheckBox) view2.findViewById(C2507R.id.cb_title_original_included)).isChecked();
                boolean isChecked3 = ((CheckBox) view2.findViewById(C2507R.id.cb_profile_list_status_included)).isChecked();
                boolean isChecked4 = ((CheckBox) view2.findViewById(C2507R.id.cb_your_vote_included)).isChecked();
                ArrayList<Integer> arrayList3 = this$0.f27615j;
                if (arrayList3 == null) {
                    Intrinsics.m32189r("selectionExtraFields");
                    throw null;
                }
                arrayList3.clear();
                if (isChecked) {
                    ArrayList<Integer> arrayList4 = this$0.f27615j;
                    if (arrayList4 == null) {
                        Intrinsics.m32189r("selectionExtraFields");
                        throw null;
                    }
                    arrayList4.add(0);
                }
                if (isChecked2) {
                    ArrayList<Integer> arrayList5 = this$0.f27615j;
                    if (arrayList5 == null) {
                        Intrinsics.m32189r("selectionExtraFields");
                        throw null;
                    }
                    arrayList5.add(1);
                }
                if (isChecked3) {
                    ArrayList<Integer> arrayList6 = this$0.f27615j;
                    if (arrayList6 == null) {
                        Intrinsics.m32189r("selectionExtraFields");
                        throw null;
                    }
                    arrayList6.add(2);
                }
                if (isChecked4) {
                    ArrayList<Integer> arrayList7 = this$0.f27615j;
                    if (arrayList7 == null) {
                        Intrinsics.m32189r("selectionExtraFields");
                        throw null;
                    }
                    arrayList7.add(3);
                }
                Intent intent = new Intent();
                intent.putExtra("BOOKMARKS_EXPORT_TYPE_VALUE", this$0.f27609d);
                intent.putExtra("BOOKMARKS_SELECTED_SORT_VALUE", this$0.f27610e);
                ArrayList<Integer> arrayList8 = this$0.f27614i;
                if (arrayList8 == null) {
                    Intrinsics.m32189r("selectionProfileListsValues");
                    throw null;
                }
                intent.putExtra("BOOKMARKS_EXPORT_PROFILE_LISTS_VALUE", arrayList8);
                ArrayList<Integer> arrayList9 = this$0.f27615j;
                if (arrayList9 == null) {
                    Intrinsics.m32189r("selectionExtraFields");
                    throw null;
                }
                intent.putExtra("BOOKMARKS_EXTRA_FIELDS_VALUE", arrayList9);
                if (this$0.m15411u3("CHOOSE_TYPE_CONTINUE_BUTTON", intent)) {
                    this$0.dismiss();
                }
                dialog.dismiss();
                return;
            case 1:
                ChooseStatusDialogFragment this$02 = (ChooseStatusDialogFragment) this.f27750f;
                View view3 = this.f27747c;
                AlertDialog dialog2 = (AlertDialog) this.f27748d;
                Button button2 = (Button) this.f27749e;
                int i6 = ChooseStatusDialogFragment.f27687i;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(dialog2, "$dialog");
                boolean[] zArr3 = this$02.f27689e;
                if (zArr3 == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                if (!ArraysKt.m31965o(zArr3, true)) {
                    Dialogs dialogs2 = Dialogs.f30143a;
                    Context context2 = button2.getContext();
                    Intrinsics.m32178g(context2, "context");
                    String string3 = this$02.getString(C2507R.string.error);
                    Intrinsics.m32178g(string3, "getString(R.string.error)");
                    String string4 = this$02.getString(C2507R.string.notifications_no_list_selected);
                    Intrinsics.m32178g(string4, "getString(R.string.notifications_no_list_selected)");
                    dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                    return;
                }
                ArrayList<Integer> arrayList10 = this$02.f27690f;
                if (arrayList10 == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                arrayList10.clear();
                boolean[] zArr4 = this$02.f27689e;
                if (zArr4 == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                int length2 = zArr4.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = i8 + 1;
                    if (zArr4[i7]) {
                        ArrayList<Integer> arrayList11 = this$02.f27690f;
                        if (arrayList11 == null) {
                            Intrinsics.m32189r("profileStatusNotificationPreferences");
                            throw null;
                        }
                        arrayList11.add(Integer.valueOf(i8));
                    }
                    i7++;
                    i8 = i9;
                }
                ArrayList<Integer> arrayList12 = this$02.f27690f;
                if (arrayList12 == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                int size = arrayList12.size();
                String[] strArr2 = this$02.f27688d;
                if (strArr2 == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                if (size == strArr2.length) {
                    Intrinsics.m32178g(view3, "view");
                    this$02.m15424c4(view3);
                } else {
                    Intrinsics.m32178g(view3, "view");
                    this$02.m15426m4(view3);
                }
                dialog2.dismiss();
                return;
            case 2:
                ChooseTypeDialogFragment this$03 = (ChooseTypeDialogFragment) this.f27750f;
                View view4 = this.f27747c;
                AlertDialog dialog3 = (AlertDialog) this.f27748d;
                Button button3 = (Button) this.f27749e;
                ChooseTypeDialogFragment.Companion companion = ChooseTypeDialogFragment.f27693j;
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(dialog3, "$dialog");
                boolean[] zArr5 = this$03.f27696f;
                if (zArr5 == null) {
                    Intrinsics.m32189r("selectionTypes");
                    throw null;
                }
                if (!ArraysKt.m31965o(zArr5, true)) {
                    Dialogs dialogs3 = Dialogs.f30143a;
                    Context context3 = button3.getContext();
                    Intrinsics.m32178g(context3, "context");
                    String string5 = this$03.getString(C2507R.string.error);
                    Intrinsics.m32178g(string5, "getString(R.string.error)");
                    String string6 = this$03.getString(C2507R.string.notifications_no_list_selected);
                    Intrinsics.m32178g(string6, "getString(R.string.notifications_no_list_selected)");
                    dialogs3.m16306c(context3, string5, string6, (r12 & 8) != 0 ? "Ок" : null, null);
                    return;
                }
                ArrayList<Long> arrayList13 = this$03.f27697g;
                if (arrayList13 == null) {
                    Intrinsics.m32189r("profileTypeNotificationPreferences");
                    throw null;
                }
                arrayList13.clear();
                boolean[] zArr6 = this$03.f27696f;
                if (zArr6 == null) {
                    Intrinsics.m32189r("selectionTypes");
                    throw null;
                }
                int length3 = zArr6.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length3) {
                    int i12 = i11 + 1;
                    if (zArr6[i10]) {
                        ArrayList<Long> arrayList14 = this$03.f27697g;
                        if (arrayList14 == null) {
                            Intrinsics.m32189r("profileTypeNotificationPreferences");
                            throw null;
                        }
                        String[] strArr3 = this$03.f27695e;
                        if (strArr3 == null) {
                            Intrinsics.m32189r("typesValues");
                            throw null;
                        }
                        arrayList14.add(Long.valueOf(Long.parseLong(strArr3[i11])));
                    }
                    i10++;
                    i11 = i12;
                }
                ArrayList<Long> arrayList15 = this$03.f27697g;
                if (arrayList15 == null) {
                    Intrinsics.m32189r("profileTypeNotificationPreferences");
                    throw null;
                }
                int size2 = arrayList15.size();
                String[] strArr4 = this$03.f27695e;
                if (strArr4 == null) {
                    Intrinsics.m32189r("typesValues");
                    throw null;
                }
                if (size2 == strArr4.length) {
                    Intrinsics.m32178g(view4, "view");
                    this$03.m15428c4(view4);
                } else {
                    Intrinsics.m32178g(view4, "view");
                    this$03.m15430m4(view4);
                }
                dialog3.dismiss();
                this$03.m15431n4();
                return;
            default:
                DivActionBinder this$04 = (DivActionBinder) this.f27750f;
                Div2View divView = (Div2View) this.f27748d;
                View target = this.f27747c;
                List<? extends DivAction> list = (List) this.f27749e;
                Intrinsics.m32179h(this$04, "this$0");
                Intrinsics.m32179h(divView, "$divView");
                Intrinsics.m32179h(target, "$target");
                this$04.m16971c(divView, target, list, "click");
                return;
        }
    }
}
