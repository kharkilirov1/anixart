package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseStatusDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseStatusDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseStatusDialogFragment extends BaseDialogFragment {

    /* renamed from: i */
    public static final /* synthetic */ int f27687i = 0;

    /* renamed from: d */
    public String[] f27688d;

    /* renamed from: e */
    public boolean[] f27689e;

    /* renamed from: f */
    public ArrayList<Integer> f27690f;

    /* renamed from: g */
    public boolean f27691g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27692h = new LinkedHashMap();

    /* compiled from: ChooseStatusDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseStatusDialogFragment$Companion;", "", "", "CHOOSE_STATUS_CONTINUE_BUTTON", "Ljava/lang/String;", "IS_RELEASE_TYPE_NOTIFICATIONS_ENABLED_VALUE", "PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: A3 */
    public final void m15423A3() {
        ArrayList<Integer> arrayList = this.f27690f;
        if (arrayList == null) {
            Intrinsics.m32189r("profileStatusNotificationPreferences");
            throw null;
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            ((Number) obj).intValue();
            boolean[] zArr = this.f27689e;
            if (zArr == null) {
                Intrinsics.m32189r("selectionProfileLists");
                throw null;
            }
            zArr[i2] = true;
            i2 = i3;
        }
    }

    /* renamed from: c4 */
    public final void m15424c4(View view) {
        ((RadioButton) view.findViewById(C2507R.id.rbAll)).setChecked(true);
        ((RadioButton) view.findViewById(C2507R.id.rbSelected)).setChecked(false);
        ((RadioButton) view.findViewById(C2507R.id.rbReleaseTypes)).setChecked(false);
    }

    /* renamed from: e4 */
    public final void m15425e4(View view) {
        ((RadioButton) view.findViewById(C2507R.id.rbAll)).setChecked(false);
        ((RadioButton) view.findViewById(C2507R.id.rbSelected)).setChecked(false);
        ((RadioButton) view.findViewById(C2507R.id.rbReleaseTypes)).setChecked(true);
    }

    /* renamed from: m4 */
    public final void m15426m4(View view) {
        ((RadioButton) view.findViewById(C2507R.id.rbAll)).setChecked(false);
        ((RadioButton) view.findViewById(C2507R.id.rbSelected)).setChecked(true);
        ((RadioButton) view.findViewById(C2507R.id.rbReleaseTypes)).setChecked(false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27692h.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        ArrayList<Integer> integerArrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<Integer> integerArrayList2 = arguments.getIntegerArrayList("PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE");
            if (integerArrayList2 == null) {
                return;
            }
            this.f27690f = integerArrayList2;
            this.f27691g = arguments.getBoolean("IS_RELEASE_TYPE_NOTIFICATIONS_ENABLED_VALUE");
        }
        String[] stringArray = getResources().getStringArray(C2507R.array.profile_lists);
        Intrinsics.m32178g(stringArray, "resources.getStringArray(R.array.profile_lists)");
        this.f27688d = stringArray;
        this.f27689e = new boolean[stringArray.length];
        m15423A3();
        if (bundle == null || (integerArrayList = bundle.getIntegerArrayList("PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE")) == null) {
            return;
        }
        this.f27690f = integerArrayList;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View view = layoutInflater.inflate(C2507R.layout.dialog_choose_status, (ViewGroup) null);
            if (this.f27691g) {
                Intrinsics.m32178g(view, "view");
                m15425e4(view);
            } else {
                ArrayList<Integer> arrayList = this.f27690f;
                if (arrayList == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                int size = arrayList.size();
                String[] strArr = this.f27688d;
                if (strArr == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                if (size == strArr.length) {
                    Intrinsics.m32178g(view, "view");
                    m15424c4(view);
                } else {
                    Intrinsics.m32178g(view, "view");
                    m15426m4(view);
                }
            }
            final int i2 = 0;
            ((LinearLayout) view.findViewById(C2507R.id.all)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.l

                /* renamed from: c */
                public final /* synthetic */ ChooseStatusDialogFragment f27768c;

                {
                    this.f27768c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = 0;
                    int i4 = 1;
                    switch (i2) {
                        case 0:
                            ChooseStatusDialogFragment this$0 = this.f27768c;
                            View view3 = view;
                            int i5 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32178g(view3, "view");
                            this$0.m15424c4(view3);
                            this$0.f27691g = false;
                            ArrayList<Integer> arrayList2 = this$0.f27690f;
                            if (arrayList2 == null) {
                                Intrinsics.m32189r("profileStatusNotificationPreferences");
                                throw null;
                            }
                            arrayList2.clear();
                            String[] strArr2 = this$0.f27688d;
                            if (strArr2 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            int length = strArr2.length;
                            int i6 = 0;
                            while (i3 < length) {
                                String str = strArr2[i3];
                                int i7 = i6 + 1;
                                ArrayList<Integer> arrayList3 = this$0.f27690f;
                                if (arrayList3 == null) {
                                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                                    throw null;
                                }
                                arrayList3.add(Integer.valueOf(i6));
                                i3++;
                                i6 = i7;
                            }
                            return;
                        case 1:
                            ChooseStatusDialogFragment this$02 = this.f27768c;
                            View view4 = view;
                            int i8 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27691g = false;
                            if (((RadioButton) view4.findViewById(C2507R.id.rbAll)).isChecked()) {
                                boolean[] zArr = this$02.f27689e;
                                if (zArr == null) {
                                    Intrinsics.m32189r("selectionProfileLists");
                                    throw null;
                                }
                                int length2 = zArr.length;
                                for (int i9 = 0; i9 < length2; i9++) {
                                    boolean[] zArr2 = this$02.f27689e;
                                    if (zArr2 == null) {
                                        Intrinsics.m32189r("selectionProfileLists");
                                        throw null;
                                    }
                                    zArr2[i9] = false;
                                }
                            }
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext(), C2507R.style.DialogTheme);
                            builder2.mo377k(C2507R.string.select_lists);
                            String[] strArr3 = this$02.f27688d;
                            if (strArr3 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            boolean[] zArr3 = this$02.f27689e;
                            if (zArr3 == null) {
                                Intrinsics.m32189r("selectionProfileLists");
                                throw null;
                            }
                            DialogInterfaceOnMultiChoiceClickListenerC2645b dialogInterfaceOnMultiChoiceClickListenerC2645b = new DialogInterfaceOnMultiChoiceClickListenerC2645b(this$02, i4);
                            AlertController.AlertParams alertParams = builder2.f413a;
                            alertParams.f388q = strArr3;
                            alertParams.f396y = dialogInterfaceOnMultiChoiceClickListenerC2645b;
                            alertParams.f392u = zArr3;
                            alertParams.f393v = true;
                            AlertDialog create = builder2.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterfaceOnClickListenerC2644a(this$02, i4)).create();
                            Intrinsics.m32178g(create, "builder.setTitle(R.strin…                .create()");
                            create.show();
                            Button m365g = create.m365g(-1);
                            m365g.setOnClickListener(new ViewOnClickListenerC2647d(this$02, view4, create, m365g, 1));
                            return;
                        default:
                            ChooseStatusDialogFragment this$03 = this.f27768c;
                            View view5 = view;
                            int i10 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32178g(view5, "view");
                            this$03.m15425e4(view5);
                            this$03.f27691g = true;
                            return;
                    }
                }
            });
            final int i3 = 1;
            ((LinearLayout) view.findViewById(C2507R.id.selected)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.l

                /* renamed from: c */
                public final /* synthetic */ ChooseStatusDialogFragment f27768c;

                {
                    this.f27768c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i32 = 0;
                    int i4 = 1;
                    switch (i3) {
                        case 0:
                            ChooseStatusDialogFragment this$0 = this.f27768c;
                            View view3 = view;
                            int i5 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32178g(view3, "view");
                            this$0.m15424c4(view3);
                            this$0.f27691g = false;
                            ArrayList<Integer> arrayList2 = this$0.f27690f;
                            if (arrayList2 == null) {
                                Intrinsics.m32189r("profileStatusNotificationPreferences");
                                throw null;
                            }
                            arrayList2.clear();
                            String[] strArr2 = this$0.f27688d;
                            if (strArr2 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            int length = strArr2.length;
                            int i6 = 0;
                            while (i32 < length) {
                                String str = strArr2[i32];
                                int i7 = i6 + 1;
                                ArrayList<Integer> arrayList3 = this$0.f27690f;
                                if (arrayList3 == null) {
                                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                                    throw null;
                                }
                                arrayList3.add(Integer.valueOf(i6));
                                i32++;
                                i6 = i7;
                            }
                            return;
                        case 1:
                            ChooseStatusDialogFragment this$02 = this.f27768c;
                            View view4 = view;
                            int i8 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27691g = false;
                            if (((RadioButton) view4.findViewById(C2507R.id.rbAll)).isChecked()) {
                                boolean[] zArr = this$02.f27689e;
                                if (zArr == null) {
                                    Intrinsics.m32189r("selectionProfileLists");
                                    throw null;
                                }
                                int length2 = zArr.length;
                                for (int i9 = 0; i9 < length2; i9++) {
                                    boolean[] zArr2 = this$02.f27689e;
                                    if (zArr2 == null) {
                                        Intrinsics.m32189r("selectionProfileLists");
                                        throw null;
                                    }
                                    zArr2[i9] = false;
                                }
                            }
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext(), C2507R.style.DialogTheme);
                            builder2.mo377k(C2507R.string.select_lists);
                            String[] strArr3 = this$02.f27688d;
                            if (strArr3 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            boolean[] zArr3 = this$02.f27689e;
                            if (zArr3 == null) {
                                Intrinsics.m32189r("selectionProfileLists");
                                throw null;
                            }
                            DialogInterfaceOnMultiChoiceClickListenerC2645b dialogInterfaceOnMultiChoiceClickListenerC2645b = new DialogInterfaceOnMultiChoiceClickListenerC2645b(this$02, i4);
                            AlertController.AlertParams alertParams = builder2.f413a;
                            alertParams.f388q = strArr3;
                            alertParams.f396y = dialogInterfaceOnMultiChoiceClickListenerC2645b;
                            alertParams.f392u = zArr3;
                            alertParams.f393v = true;
                            AlertDialog create = builder2.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterfaceOnClickListenerC2644a(this$02, i4)).create();
                            Intrinsics.m32178g(create, "builder.setTitle(R.strin…                .create()");
                            create.show();
                            Button m365g = create.m365g(-1);
                            m365g.setOnClickListener(new ViewOnClickListenerC2647d(this$02, view4, create, m365g, 1));
                            return;
                        default:
                            ChooseStatusDialogFragment this$03 = this.f27768c;
                            View view5 = view;
                            int i10 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32178g(view5, "view");
                            this$03.m15425e4(view5);
                            this$03.f27691g = true;
                            return;
                    }
                }
            });
            final int i4 = 2;
            ((LinearLayout) view.findViewById(C2507R.id.releaseTypes)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.l

                /* renamed from: c */
                public final /* synthetic */ ChooseStatusDialogFragment f27768c;

                {
                    this.f27768c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i32 = 0;
                    int i42 = 1;
                    switch (i4) {
                        case 0:
                            ChooseStatusDialogFragment this$0 = this.f27768c;
                            View view3 = view;
                            int i5 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32178g(view3, "view");
                            this$0.m15424c4(view3);
                            this$0.f27691g = false;
                            ArrayList<Integer> arrayList2 = this$0.f27690f;
                            if (arrayList2 == null) {
                                Intrinsics.m32189r("profileStatusNotificationPreferences");
                                throw null;
                            }
                            arrayList2.clear();
                            String[] strArr2 = this$0.f27688d;
                            if (strArr2 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            int length = strArr2.length;
                            int i6 = 0;
                            while (i32 < length) {
                                String str = strArr2[i32];
                                int i7 = i6 + 1;
                                ArrayList<Integer> arrayList3 = this$0.f27690f;
                                if (arrayList3 == null) {
                                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                                    throw null;
                                }
                                arrayList3.add(Integer.valueOf(i6));
                                i32++;
                                i6 = i7;
                            }
                            return;
                        case 1:
                            ChooseStatusDialogFragment this$02 = this.f27768c;
                            View view4 = view;
                            int i8 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27691g = false;
                            if (((RadioButton) view4.findViewById(C2507R.id.rbAll)).isChecked()) {
                                boolean[] zArr = this$02.f27689e;
                                if (zArr == null) {
                                    Intrinsics.m32189r("selectionProfileLists");
                                    throw null;
                                }
                                int length2 = zArr.length;
                                for (int i9 = 0; i9 < length2; i9++) {
                                    boolean[] zArr2 = this$02.f27689e;
                                    if (zArr2 == null) {
                                        Intrinsics.m32189r("selectionProfileLists");
                                        throw null;
                                    }
                                    zArr2[i9] = false;
                                }
                            }
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext(), C2507R.style.DialogTheme);
                            builder2.mo377k(C2507R.string.select_lists);
                            String[] strArr3 = this$02.f27688d;
                            if (strArr3 == null) {
                                Intrinsics.m32189r("profileLists");
                                throw null;
                            }
                            boolean[] zArr3 = this$02.f27689e;
                            if (zArr3 == null) {
                                Intrinsics.m32189r("selectionProfileLists");
                                throw null;
                            }
                            DialogInterfaceOnMultiChoiceClickListenerC2645b dialogInterfaceOnMultiChoiceClickListenerC2645b = new DialogInterfaceOnMultiChoiceClickListenerC2645b(this$02, i42);
                            AlertController.AlertParams alertParams = builder2.f413a;
                            alertParams.f388q = strArr3;
                            alertParams.f396y = dialogInterfaceOnMultiChoiceClickListenerC2645b;
                            alertParams.f392u = zArr3;
                            alertParams.f393v = true;
                            AlertDialog create = builder2.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterfaceOnClickListenerC2644a(this$02, i42)).create();
                            Intrinsics.m32178g(create, "builder.setTitle(R.strin…                .create()");
                            create.show();
                            Button m365g = create.m365g(-1);
                            m365g.setOnClickListener(new ViewOnClickListenerC2647d(this$02, view4, create, m365g, 1));
                            return;
                        default:
                            ChooseStatusDialogFragment this$03 = this.f27768c;
                            View view5 = view;
                            int i10 = ChooseStatusDialogFragment.f27687i;
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32178g(view5, "view");
                            this$03.m15425e4(view5);
                            this$03.f27691g = true;
                            return;
                    }
                }
            });
            ((MaterialButton) view.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2625a(this, 5));
            builder.setView(view);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27692h.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        ArrayList<Integer> arrayList = this.f27690f;
        if (arrayList == null) {
            Intrinsics.m32189r("profileStatusNotificationPreferences");
            throw null;
        }
        outState.putIntegerArrayList("PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE", arrayList);
        super.onSaveInstanceState(outState);
    }
}
