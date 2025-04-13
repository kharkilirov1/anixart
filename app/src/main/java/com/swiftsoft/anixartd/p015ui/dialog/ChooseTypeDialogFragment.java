package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.types.OneFieldCardRadioButton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseTypeDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseTypeDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseTypeDialogFragment extends BaseDialogFragment {

    /* renamed from: j */
    @NotNull
    public static final Companion f27693j = new Companion(null);

    /* renamed from: d */
    public String[] f27694d;

    /* renamed from: e */
    public String[] f27695e;

    /* renamed from: f */
    public boolean[] f27696f;

    /* renamed from: g */
    public ArrayList<Long> f27697g;

    /* renamed from: h */
    public boolean f27698h;

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f27699i = new LinkedHashMap();

    /* compiled from: ChooseTypeDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseTypeDialogFragment$Companion;", "", "", "CHOOSE_TYPE_CONTINUE_BUTTON", "Ljava/lang/String;", "IS_NOTHING_BUTTON_ENABLED", "PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE", "TYPES_VALUE", "TYPES_VALUES_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ChooseTypeDialogFragment m15432a(@NotNull String[] types, @NotNull String[] typesValues, @NotNull ArrayList<Long> profileTypeNotificationPreferences, boolean z) {
            Intrinsics.m32179h(types, "types");
            Intrinsics.m32179h(typesValues, "typesValues");
            Intrinsics.m32179h(profileTypeNotificationPreferences, "profileTypeNotificationPreferences");
            ChooseTypeDialogFragment chooseTypeDialogFragment = new ChooseTypeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArray("TYPES_VALUE", types);
            bundle.putStringArray("TYPES_VALUES_VALUE", typesValues);
            bundle.putSerializable("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE", profileTypeNotificationPreferences);
            bundle.putBoolean("IS_NOTHING_BUTTON_ENABLED", z);
            chooseTypeDialogFragment.setArguments(bundle);
            return chooseTypeDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: A3 */
    public final void m15427A3() {
        ArrayList<Long> arrayList = this.f27697g;
        if (arrayList == null) {
            Intrinsics.m32189r("profileTypeNotificationPreferences");
            throw null;
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            long longValue = ((Number) obj).longValue();
            boolean[] zArr = this.f27696f;
            if (zArr == null) {
                Intrinsics.m32189r("selectionTypes");
                throw null;
            }
            String[] strArr = this.f27695e;
            if (strArr == null) {
                Intrinsics.m32189r("typesValues");
                throw null;
            }
            zArr[ArraysKt.m31935K(strArr, String.valueOf(longValue))] = true;
            i2 = i3;
        }
    }

    /* renamed from: c4 */
    public final void m15428c4(View view) {
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.nothing)).mo16469e();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.all)).mo16468d();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.selected)).mo16469e();
    }

    /* renamed from: e4 */
    public final void m15429e4(View view) {
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.nothing)).mo16468d();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.all)).mo16469e();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.selected)).mo16469e();
    }

    /* renamed from: m4 */
    public final void m15430m4(View view) {
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.nothing)).mo16469e();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.all)).mo16469e();
        ((OneFieldCardRadioButton) view.findViewById(C2507R.id.selected)).mo16468d();
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27699i.clear();
    }

    /* renamed from: n4 */
    public final void m15431n4() {
        Intent intent = new Intent();
        ArrayList<Long> arrayList = this.f27697g;
        if (arrayList == null) {
            Intrinsics.m32189r("profileTypeNotificationPreferences");
            throw null;
        }
        intent.putExtra("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE", arrayList);
        if (m15411u3("CHOOSE_TYPE_CONTINUE_BUTTON", intent)) {
            dismiss();
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        long[] longArray;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String[] stringArray = arguments.getStringArray("TYPES_VALUE");
            if (stringArray == null) {
                return;
            }
            this.f27694d = stringArray;
            String[] stringArray2 = arguments.getStringArray("TYPES_VALUES_VALUE");
            if (stringArray2 == null) {
                return;
            }
            this.f27695e = stringArray2;
            Serializable serializable = arguments.getSerializable("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE");
            ArrayList<Long> arrayList = serializable instanceof ArrayList ? (ArrayList) serializable : null;
            if (arrayList == null) {
                return;
            }
            this.f27697g = arrayList;
            this.f27698h = arguments.getBoolean("IS_NOTHING_BUTTON_ENABLED");
        }
        String[] strArr = this.f27695e;
        if (strArr == null) {
            Intrinsics.m32189r("typesValues");
            throw null;
        }
        this.f27696f = new boolean[strArr.length];
        m15427A3();
        if (bundle == null || (longArray = bundle.getLongArray("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE")) == null) {
            return;
        }
        this.f27697g = new ArrayList<>(ArraysKt.m31951a0(longArray));
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View view = layoutInflater.inflate(C2507R.layout.dialog_choose_type, (ViewGroup) null);
            ArrayList<Long> arrayList = this.f27697g;
            if (arrayList == null) {
                Intrinsics.m32189r("profileTypeNotificationPreferences");
                throw null;
            }
            if (arrayList.isEmpty()) {
                Intrinsics.m32178g(view, "view");
                m15429e4(view);
            } else {
                ArrayList<Long> arrayList2 = this.f27697g;
                if (arrayList2 == null) {
                    Intrinsics.m32189r("profileTypeNotificationPreferences");
                    throw null;
                }
                int size = arrayList2.size();
                String[] strArr = this.f27694d;
                if (strArr == null) {
                    Intrinsics.m32189r("types");
                    throw null;
                }
                if (size == strArr.length) {
                    Intrinsics.m32178g(view, "view");
                    m15428c4(view);
                } else {
                    Intrinsics.m32178g(view, "view");
                    m15430m4(view);
                }
            }
            OneFieldCardRadioButton oneFieldCardRadioButton = (OneFieldCardRadioButton) view.findViewById(C2507R.id.nothing);
            oneFieldCardRadioButton.setOnClickListener(new ViewOnClickListenerC2656m(this, view, 0));
            ViewsKt.m16379l(oneFieldCardRadioButton, this.f27698h);
            ((OneFieldCardRadioButton) view.findViewById(C2507R.id.all)).setOnClickListener(new ViewOnClickListenerC2656m(this, view, 1));
            ((OneFieldCardRadioButton) view.findViewById(C2507R.id.selected)).setOnClickListener(new ViewOnClickListenerC2656m(view, this));
            builder.setView(view);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27699i.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        ArrayList<Long> arrayList = this.f27697g;
        if (arrayList == null) {
            Intrinsics.m32189r("profileTypeNotificationPreferences");
            throw null;
        }
        outState.putLongArray("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE", CollectionsKt.m32029k0(arrayList));
        super.onSaveInstanceState(outState);
    }
}
