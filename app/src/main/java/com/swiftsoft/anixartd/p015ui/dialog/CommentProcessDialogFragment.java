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
import com.google.android.material.textfield.TextInputEditText;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommentProcessDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/CommentProcessDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommentProcessDialogFragment extends BaseDialogFragment {

    /* renamed from: l */
    @NotNull
    public static final Companion f27708l = new Companion(null);

    /* renamed from: d */
    public long f27709d;

    /* renamed from: f */
    @Nullable
    public String f27711f;

    /* renamed from: g */
    @Nullable
    public Long f27712g;

    /* renamed from: h */
    public boolean f27713h;

    /* renamed from: i */
    public boolean f27714i;

    /* renamed from: j */
    public boolean f27715j;

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f27716k = new LinkedHashMap();

    /* renamed from: e */
    @NotNull
    public String f27710e = "";

    /* compiled from: CommentProcessDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/CommentProcessDialogFragment$Companion;", "", "", "BAN_EXPIRES_VALUE", "Ljava/lang/String;", "BAN_REASON_VALUE", "COMMENT_ID_VALUE", "COMMENT_MESSAGE_VALUE", "COMMENT_PROCESS_BUTTON", "IS_BANNED_VALUE", "IS_DELETED_VALUE", "IS_SPOILER_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final CommentProcessDialogFragment m15434a(long j2, @NotNull String commentMessage, @Nullable String str, @Nullable Long l2, boolean z, boolean z2, boolean z3) {
            Intrinsics.m32179h(commentMessage, "commentMessage");
            CommentProcessDialogFragment commentProcessDialogFragment = new CommentProcessDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("COMMENT_ID_VALUE", j2);
            bundle.putString("COMMENT_MESSAGE_VALUE", commentMessage);
            if (str != null) {
                bundle.putString("BAN_REASON_VALUE", str);
            }
            if (l2 != null) {
                bundle.putLong("BAN_EXPIRES_VALUE", l2.longValue());
            }
            bundle.putBoolean("IS_SPOILER_VALUE", z);
            bundle.putBoolean("IS_DELETED_VALUE", z2);
            bundle.putBoolean("IS_BANNED_VALUE", z3);
            commentProcessDialogFragment.setArguments(bundle);
            return commentProcessDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27716k.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27709d = arguments.getLong("COMMENT_ID_VALUE");
            String string = arguments.getString("COMMENT_MESSAGE_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(COMMENT_MESSAGE_VALUE, \"\")");
            this.f27710e = string;
            if (arguments.containsKey("BAN_REASON_VALUE")) {
                this.f27711f = arguments.getString("BAN_REASON_VALUE");
            }
            if (arguments.containsKey("BAN_EXPIRES_VALUE")) {
                this.f27712g = Long.valueOf(arguments.getLong("BAN_EXPIRES_VALUE"));
            }
            this.f27713h = arguments.getBoolean("IS_SPOILER_VALUE");
            this.f27714i = arguments.getBoolean("IS_DELETED_VALUE");
            this.f27715j = arguments.getBoolean("IS_BANNED_VALUE");
        }
        if (bundle == null || !bundle.containsKey("BAN_EXPIRES_VALUE")) {
            return;
        }
        this.f27712g = Long.valueOf(bundle.getLong("BAN_EXPIRES_VALUE"));
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_comment_process, (ViewGroup) null);
            ((TextInputEditText) inflate.findViewById(C2507R.id.message)).setText(this.f27710e);
            Time time = Time.f30247a;
            TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.ban_expires);
            Intrinsics.m32178g(textInputEditText, "view.ban_expires");
            time.m16363i(textInputEditText, this.f27712g, "dd.MM.yyyy", new Function1<Long, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.CommentProcessDialogFragment$onCreateDialog$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Long l2) {
                    long longValue = l2.longValue();
                    CommentProcessDialogFragment.this.f27712g = Long.valueOf(longValue);
                    return Unit.f63088a;
                }
            });
            if (this.f27715j && this.f27711f != null) {
                ((TextInputEditText) inflate.findViewById(C2507R.id.ban_reason)).setText(this.f27711f);
            }
            ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).setChecked(this.f27713h);
            ((CheckBox) inflate.findViewById(C2507R.id.cb_is_deleted)).setChecked(this.f27714i);
            CheckBox checkBox = (CheckBox) inflate.findViewById(C2507R.id.cb_is_banned);
            checkBox.setOnCheckedChangeListener(new C2660q(inflate, 0));
            checkBox.setChecked(this.f27715j);
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.CommentProcessDialogFragment$onCreateDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.Unit invoke(android.view.View r15) {
                    /*
                        Method dump skipped, instructions count: 367
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment$onCreateDialog$3.invoke(java.lang.Object):java.lang.Object");
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.CommentProcessDialogFragment$onCreateDialog$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    CommentProcessDialogFragment.this.dismiss();
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
        this.f27716k.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        Long l2 = this.f27712g;
        if (l2 != null) {
            outState.putLong("BAN_EXPIRES_VALUE", l2.longValue());
        }
        super.onSaveInstanceState(outState);
    }
}
