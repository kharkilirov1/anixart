package com.swiftsoft.anixartd.p015ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.TwoFieldsRadioButton;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KodikVideoQualityFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/KodikVideoQualityFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class KodikVideoQualityFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: f */
    public static final /* synthetic */ int f27721f = 0;

    /* renamed from: e */
    @NotNull
    public Map<Integer, View> f27723e = new LinkedHashMap();

    /* renamed from: d */
    public int f27722d = 1;

    /* compiled from: KodikVideoQualityFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/KodikVideoQualityFragment$Companion;", "", "", "CHOOSE_TYPE_CONTINUE_BUTTON", "Ljava/lang/String;", "SELECTED_KODIK_VIDEO_QUALITY_VALUE", "", "VIDEO_QUALITY_HIGH", "I", "VIDEO_QUALITY_MEDIUM", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27723e.clear();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        switch (view.getId()) {
            case C2507R.id.itemVideoQualityHigh /* 2131362407 */:
                this.f27722d = 0;
                break;
            case C2507R.id.itemVideoQualityMedium /* 2131362408 */:
                this.f27722d = 1;
                break;
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27722d = arguments.getInt("SELECTED_KODIK_VIDEO_QUALITY_VALUE");
        }
        if (bundle != null) {
            this.f27722d = bundle.getInt("SELECTED_KODIK_VIDEO_QUALITY_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @SuppressLint
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_kodik_video_quality, (ViewGroup) null);
            int i2 = this.f27722d;
            if (i2 == 0) {
                CustomRadioGroup customRadioGroup = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemVideoQualityHigh);
                Intrinsics.m32178g(twoFieldsRadioButton, "view.itemVideoQualityHigh");
                customRadioGroup.setSelectedButtonToSelectedState(twoFieldsRadioButton);
            } else if (i2 == 1) {
                CustomRadioGroup customRadioGroup2 = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton2 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemVideoQualityMedium);
                Intrinsics.m32178g(twoFieldsRadioButton2, "view.itemVideoQualityMedium");
                customRadioGroup2.setSelectedButtonToSelectedState(twoFieldsRadioButton2);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom)).setOnRadioClickListener(this);
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2625a(this, 6));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27723e.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_KODIK_VIDEO_QUALITY_VALUE", this.f27722d);
        super.onSaveInstanceState(outState);
    }
}
