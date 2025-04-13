package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileProcessDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ProfileProcessDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileProcessDialogFragment extends BaseDialogFragment {

    /* renamed from: i */
    public static final /* synthetic */ int f27724i = 0;

    /* renamed from: d */
    public long f27725d;

    /* renamed from: e */
    @Nullable
    public String f27726e;

    /* renamed from: f */
    @Nullable
    public Long f27727f;

    /* renamed from: g */
    public boolean f27728g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27729h = new LinkedHashMap();

    /* compiled from: ProfileProcessDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ProfileProcessDialogFragment$Companion;", "", "", "BAN_EXPIRES_VALUE", "Ljava/lang/String;", "BAN_REASON_VALUE", "IS_BANNED_VALUE", "PROFILE_ID_VALUE", "PROFILE_PROCESS_BUTTON", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27729h.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27725d = arguments.getLong("PROFILE_ID_VALUE");
            if (arguments.containsKey("BAN_REASON_VALUE")) {
                this.f27726e = arguments.getString("BAN_REASON_VALUE");
            }
            if (arguments.containsKey("BAN_EXPIRES_VALUE")) {
                this.f27727f = Long.valueOf(arguments.getLong("BAN_EXPIRES_VALUE"));
            }
            this.f27728g = arguments.getBoolean("IS_BANNED_VALUE");
        }
        if (bundle == null || !bundle.containsKey("BAN_EXPIRES_VALUE")) {
            return;
        }
        this.f27727f = Long.valueOf(bundle.getLong("BAN_EXPIRES_VALUE"));
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_profile_process, (ViewGroup) null);
            Time time = Time.f30247a;
            TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.ban_expires);
            Intrinsics.m32178g(textInputEditText, "view.ban_expires");
            time.m16363i(textInputEditText, this.f27727f, "dd.MM.yyyy", new Function1<Long, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ProfileProcessDialogFragment$onCreateDialog$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Long l2) {
                    long longValue = l2.longValue();
                    ProfileProcessDialogFragment.this.f27727f = Long.valueOf(longValue);
                    return Unit.f63088a;
                }
            });
            if (this.f27728g && this.f27726e != null) {
                ((TextInputEditText) inflate.findViewById(C2507R.id.ban_reason)).setText(this.f27726e);
            }
            CheckBox checkBox = (CheckBox) inflate.findViewById(C2507R.id.cb_is_banned);
            checkBox.setOnCheckedChangeListener(new C2660q(inflate, 1));
            checkBox.setChecked(this.f27728g);
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ProfileProcessDialogFragment$onCreateDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    ((TextInputLayout) inflate.findViewById(C2507R.id.ban_reason_layout)).setError(null);
                    ((TextInputLayout) inflate.findViewById(C2507R.id.ban_expires_layout)).setError(null);
                    String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.ban_reason)).getText());
                    Long m16359e = Time.f30247a.m16359e(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.ban_expires)).getText()), "dd.MM.yyyy");
                    boolean isChecked = ((CheckBox) inflate.findViewById(C2507R.id.cb_is_banned)).isChecked();
                    boolean z = true;
                    if (isChecked) {
                        if (valueOf.length() == 0) {
                            ((TextInputLayout) inflate.findViewById(C2507R.id.ban_reason_layout)).setError(this.getString(C2507R.string.error_invalid_ban_reason));
                            z = false;
                        }
                        if (valueOf.length() < 5) {
                            ((TextInputLayout) inflate.findViewById(C2507R.id.ban_reason_layout)).setError(this.getString(C2507R.string.error_ban_reason_is_too_short));
                            z = false;
                        }
                        if (m16359e == null || m16359e.longValue() <= 0) {
                            ((TextInputLayout) inflate.findViewById(C2507R.id.ban_expires_layout)).setError(this.getString(C2507R.string.error_invalid_ban_expires));
                            z = false;
                        }
                    }
                    if (z) {
                        Intent intent = new Intent();
                        intent.putExtra("PROFILE_ID_VALUE", this.f27725d);
                        intent.putExtra("BAN_REASON_VALUE", valueOf);
                        intent.putExtra("BAN_EXPIRES_VALUE", m16359e);
                        intent.putExtra("IS_BANNED_VALUE", isChecked);
                        if (this.m15411u3("PROFILE_PROCESS_BUTTON", intent)) {
                            this.dismiss();
                        }
                    }
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.ProfileProcessDialogFragment$onCreateDialog$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    ProfileProcessDialogFragment.this.dismiss();
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
        this.f27729h.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        Long l2 = this.f27727f;
        if (l2 != null) {
            outState.putLong("BAN_EXPIRES_VALUE", l2.longValue());
        }
        super.onSaveInstanceState(outState);
    }
}
