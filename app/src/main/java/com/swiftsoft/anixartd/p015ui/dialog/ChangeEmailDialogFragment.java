package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeEmailDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChangeEmailDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChangeEmailDialogFragment extends BaseDialogFragment {

    /* renamed from: d */
    @Nullable
    public String f27641d;

    /* renamed from: e */
    @Nullable
    public String f27642e;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f27643f = new LinkedHashMap();

    /* compiled from: ChangeEmailDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChangeEmailDialogFragment$Companion;", "", "", "CHANGE_EMAIL_SAVE_BUTTON", "Ljava/lang/String;", "CURRENT_EMAIL_VALUE", "CURRENT_PASSWORD", "EMAIL_HINT", "NEW_EMAIL_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27643f.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27642e = arguments.getString("EMAIL_HINT");
            this.f27641d = arguments.getString("EMAIL_CONFIRM_TOKEN");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_change_email, (ViewGroup) null);
            String str = this.f27642e;
            if (str != null) {
                TextView textView = (TextView) inflate.findViewById(C2507R.id.current_email_hint);
                String string = getString(C2507R.string.current_email_hint, str);
                Intrinsics.m32178g(string, "getString(R.string.current_email_hint, emailHint)");
                C2052a.m12290y(new Object[0], 0, string, "format(format, *args)", textView);
            }
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ChangeEmailDialogFragment$onCreateDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.current_email_edit_text)).getText());
                    String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.new_email_edit_text)).getText());
                    Intent intent = new Intent();
                    intent.putExtra("EMAIL_CONFIRM_TOKEN", this.f27641d);
                    intent.putExtra("CURRENT_EMAIL_VALUE", valueOf);
                    intent.putExtra("NEW_EMAIL_VALUE", valueOf2);
                    if (this.m15411u3("CHANGE_EMAIL_SAVE_BUTTON", intent)) {
                        this.dismiss();
                    }
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ChangeEmailDialogFragment$onCreateDialog$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    ChangeEmailDialogFragment.this.dismiss();
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
        this.f27643f.clear();
    }
}
