package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeCustomFilterTabNameFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChangeCustomFilterTabNameFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChangeCustomFilterTabNameFragment extends BaseDialogFragment {

    /* renamed from: e */
    @NotNull
    public Map<Integer, View> f27631e = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public String f27630d = "";

    /* compiled from: ChangeCustomFilterTabNameFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChangeCustomFilterTabNameFragment$Companion;", "", "", "CHANGE_TAB_NAME_BUTTON", "Ljava/lang/String;", "CURRENT_TAB_NAME_VALUE", "NEW_TAB_NAME_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27631e.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("CURRENT_TAB_NAME_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(CURRENT_TAB_NAME_VALUE, \"\")");
            this.f27630d = string;
        }
        if (bundle != null) {
            String string2 = bundle.getString("CURRENT_TAB_NAME_VALUE", "");
            Intrinsics.m32178g(string2, "savedInstanceState.getSt…RRENT_TAB_NAME_VALUE, \"\")");
            this.f27630d = string2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        String string;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_change_custom_filter_tab_name, (ViewGroup) null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f63351b = this.f27630d;
            TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.tab_name_edit_text);
            if (this.f27630d.length() > 0) {
                string = this.f27630d;
            } else {
                string = getString(C2507R.string.my_custom_filter_tab);
                Intrinsics.m32178g(string, "getString(R.string.my_custom_filter_tab)");
            }
            textInputEditText.setText(string);
            TextInputEditText onCreateDialog$lambda$2 = (TextInputEditText) inflate.findViewById(C2507R.id.tab_name_edit_text);
            Intrinsics.m32178g(onCreateDialog$lambda$2, "onCreateDialog$lambda$2");
            onCreateDialog$lambda$2.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.dialog.ChangeCustomFilterTabNameFragment$onCreateDialog$lambda$2$$inlined$addTextChangedListener$default$1
                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    Ref.ObjectRef.this.f63351b = String.valueOf(editable);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ChangeCustomFilterTabNameFragment$onCreateDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    if (objectRef.f63351b.length() <= 3) {
                        ((TextInputLayout) inflate.findViewById(C2507R.id.tab_name_input_layout)).setError("Название слишком короткое");
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("NEW_TAB_NAME_VALUE", objectRef.f63351b);
                        if (this.m15411u3("CHANGE_TAB_NAME_BUTTON", intent)) {
                            this.dismiss();
                        }
                    }
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ChangeCustomFilterTabNameFragment$onCreateDialog$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    ChangeCustomFilterTabNameFragment.this.dismiss();
                    return Unit.f63088a;
                }
            });
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27631e.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putString("CURRENT_TAB_NAME_VALUE", this.f27630d);
        super.onSaveInstanceState(outState);
    }
}
