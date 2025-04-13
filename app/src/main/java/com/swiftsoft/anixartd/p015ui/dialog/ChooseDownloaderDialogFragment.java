package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.TwoFieldsRadioButton;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseDownloaderDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseDownloaderDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseDownloaderDialogFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: g */
    public static final /* synthetic */ int f27656g = 0;

    /* renamed from: d */
    @Nullable
    public Episode f27657d;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f27659f = new LinkedHashMap();

    /* renamed from: e */
    public int f27658e = -1;

    /* compiled from: ChooseDownloaderDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseDownloaderDialogFragment$Companion;", "", "", "CB_ASK_ALWAYS_VALUE", "Ljava/lang/String;", "CHOOSE_DOWNLOADER_CONTINUE_BUTTON", "EPISODE_VALUE", "SELECTED_DOWNLOADER_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27659f.clear();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        int id2 = view.getId();
        if (id2 == C2507R.id.itemExternalLoader) {
            this.f27658e = 2;
        } else {
            if (id2 != C2507R.id.itemSystemLoader) {
                return;
            }
            this.f27658e = 1;
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("EPISODE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
            this.f27657d = (Episode) serializable;
        }
        if (bundle != null) {
            this.f27658e = bundle.getInt("SELECTED_DOWNLOADER_VALUE", -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_download, (ViewGroup) null);
            int i2 = this.f27658e;
            int i3 = 1;
            if (i2 == 1) {
                CustomRadioGroup customRadioGroup = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemSystemLoader);
                Intrinsics.m32178g(twoFieldsRadioButton, "view.itemSystemLoader");
                customRadioGroup.setSelectedButtonToSelectedState(twoFieldsRadioButton);
            } else if (i2 == 2) {
                CustomRadioGroup customRadioGroup2 = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton2 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemExternalLoader);
                Intrinsics.m32178g(twoFieldsRadioButton2, "view.itemExternalLoader");
                customRadioGroup2.setSelectedButtonToSelectedState(twoFieldsRadioButton2);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom)).setOnRadioClickListener(this);
            ((CheckBox) inflate.findViewById(C2507R.id.cbAskAlways)).setOnClickListener(new ViewOnClickListenerC2625a(this, 3));
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2646c((BaseDialogFragment) this, inflate, i3));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27659f.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_DOWNLOADER_VALUE", this.f27658e);
        super.onSaveInstanceState(outState);
    }
}
