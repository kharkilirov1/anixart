package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TorlookFilterDialog.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/TorlookFilterDialog;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TorlookFilterDialog extends BaseDialogFragment {

    /* renamed from: h */
    public static final /* synthetic */ int f27734h = 0;

    /* renamed from: d */
    public int f27735d;

    /* renamed from: e */
    public boolean f27736e;

    /* renamed from: f */
    public boolean f27737f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27738g = new LinkedHashMap();

    /* compiled from: TorlookFilterDialog.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/TorlookFilterDialog$Companion;", "", "", "CHOOSE_CONTINUE_BUTTON", "Ljava/lang/String;", "FORCED_SEARCH_VALUE", "PROXY_TRACKERS_VALUE", "SELECTED_SORT_VALUE", "", "SORT_BY_DATE", "I", "SORT_BY_SEED", "SORT_BY_SIZE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27738g.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("SELECTED_SORT_VALUE")) {
                this.f27735d = arguments.getInt("SELECTED_SORT_VALUE");
            }
            if (arguments.containsKey("FORCED_SEARCH_VALUE")) {
                this.f27736e = arguments.getBoolean("FORCED_SEARCH_VALUE");
            }
            if (arguments.containsKey("PROXY_TRACKERS_VALUE")) {
                this.f27737f = arguments.getBoolean("PROXY_TRACKERS_VALUE");
            }
        }
        if (bundle != null) {
            this.f27735d = bundle.getInt("SELECTED_SORT_VALUE");
            this.f27736e = bundle.getBoolean("FORCED_SEARCH_VALUE");
            this.f27737f = bundle.getBoolean("PROXY_TRACKERS_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_torlook_filter, (ViewGroup) null);
            int i2 = this.f27735d;
            final int i3 = 1;
            if (i2 == 0) {
                ((RadioButton) inflate.findViewById(C2507R.id.rbBySeed)).setChecked(true);
            } else if (i2 == 1) {
                ((RadioButton) inflate.findViewById(C2507R.id.rbBySize)).setChecked(true);
            } else if (i2 == 2) {
                ((RadioButton) inflate.findViewById(C2507R.id.rbByDate)).setChecked(true);
            }
            ((CheckBox) inflate.findViewById(C2507R.id.cbForce)).setChecked(this.f27736e);
            ((CheckBox) inflate.findViewById(C2507R.id.cbProxy)).setChecked(this.f27737f);
            ((RadioGroup) inflate.findViewById(C2507R.id.rgSort)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.swiftsoft.anixartd.ui.dialog.s
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
                    TorlookFilterDialog this$0 = TorlookFilterDialog.this;
                    int i5 = TorlookFilterDialog.f27734h;
                    Intrinsics.m32179h(this$0, "this$0");
                    int i6 = 0;
                    if (i4 == C2507R.id.rbByDate) {
                        i6 = 2;
                    } else if (i4 == C2507R.id.rbBySize) {
                        i6 = 1;
                    }
                    this$0.f27735d = i6;
                }
            });
            final int i4 = 0;
            ((CheckBox) inflate.findViewById(C2507R.id.cbForce)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.r

                /* renamed from: b */
                public final /* synthetic */ TorlookFilterDialog f27783b;

                {
                    this.f27783b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    switch (i4) {
                        case 0:
                            TorlookFilterDialog this$0 = this.f27783b;
                            int i5 = TorlookFilterDialog.f27734h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27736e = z;
                            break;
                        default:
                            TorlookFilterDialog this$02 = this.f27783b;
                            int i6 = TorlookFilterDialog.f27734h;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27737f = z;
                            break;
                    }
                }
            });
            ((CheckBox) inflate.findViewById(C2507R.id.cbProxy)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.r

                /* renamed from: b */
                public final /* synthetic */ TorlookFilterDialog f27783b;

                {
                    this.f27783b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    switch (i3) {
                        case 0:
                            TorlookFilterDialog this$0 = this.f27783b;
                            int i5 = TorlookFilterDialog.f27734h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27736e = z;
                            break;
                        default:
                            TorlookFilterDialog this$02 = this.f27783b;
                            int i6 = TorlookFilterDialog.f27734h;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27737f = z;
                            break;
                    }
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2625a(this, 7));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27738g.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_SORT_VALUE", this.f27735d);
        outState.putBoolean("FORCED_SEARCH_VALUE", this.f27736e);
        outState.putBoolean("PROXY_TRACKERS_VALUE", this.f27737f);
        super.onSaveInstanceState(outState);
    }
}
