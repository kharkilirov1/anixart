package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithGoogleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SignUpWithGoogleFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignUpWithGoogleFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/google/SignUpWithGoogleView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpWithGoogleFragment extends BaseFragment implements SignUpWithGoogleView {

    /* renamed from: g */
    @Inject
    public Lazy<SignUpWithGooglePresenter> f27840g;

    /* renamed from: h */
    @NotNull
    public final MoxyKtxDelegate f27841h;

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f27836k = {C2052a.m12277l(SignUpWithGoogleFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/signup/google/SignUpWithGooglePresenter;", 0)};

    /* renamed from: j */
    @NotNull
    public static final Companion f27835j = new Companion(null);

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f27842i = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27837d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithGoogleFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = SignUpWithGoogleFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* renamed from: e */
    @NotNull
    public String f27838e = "";

    /* renamed from: f */
    @NotNull
    public String f27839f = "";

    /* compiled from: SignUpWithGoogleFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignUpWithGoogleFragment$Companion;", "", "", "EMAIL_VALUE", "Ljava/lang/String;", "GOOGLE_ID_TOKEN_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SignUpWithGoogleFragment() {
        Function0<SignUpWithGooglePresenter> function0 = new Function0<SignUpWithGooglePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithGoogleFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SignUpWithGooglePresenter invoke() {
                Lazy<SignUpWithGooglePresenter> lazy = SignUpWithGoogleFragment.this.f27840g;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27841h = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SignUpWithGooglePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15444A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27842i;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: C */
    public void mo14253C() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_already_taken, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: I */
    public void mo14254I() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.warning, C2507R.string.notification_code_already_sent, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: J */
    public void mo14255J() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_too_many_registrations, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: L */
    public void mo14256L() {
        ((TextInputLayout) m15444A3(C2507R.id.login_input_layout)).setError("Никнейм не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: P */
    public void mo14257P() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: Q */
    public void mo14258Q() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_service_disallowed, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: R */
    public void mo14259R(@NotNull String login, @NotNull String email, @NotNull String googleIdToken, @NotNull String hash, long j2) {
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(googleIdToken, "googleIdToken");
        Intrinsics.m32179h(hash, "hash");
        m15437u3().mo15324d2(VerifyFragment.Companion.m15447a(VerifyFragment.f27861m, login, email, null, null, googleIdToken, hash, j2, 12), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: b0 */
    public void mo14260b0() {
        ((TextInputLayout) m15444A3(C2507R.id.email_input_layout)).setError("Email не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: h */
    public void mo14261h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27837d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: j */
    public void mo14262j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27837d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27842i.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14144q0(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_sign_up_custom, viewGroup, false);
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(true);
            supportActionBar.mo341t(true);
            supportActionBar.mo342u(true);
            supportActionBar.mo345x("Создать профиль");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EMAIL_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(EMAIL_VALUE, \"\")");
            this.f27838e = string;
            String string2 = arguments.getString("GOOGLE_ID_TOKEN_VALUE", "");
            Intrinsics.m32178g(string2, "arguments.getString(GOOGLE_ID_TOKEN_VALUE, \"\")");
            this.f27839f = string2;
        }
        if (this.f27838e.length() > 0) {
            ((TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text)).setText(this.f27838e);
        } else {
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.email_hint);
            Intrinsics.m32178g(linearLayout, "view.email_hint");
            ViewsKt.m16372e(linearLayout);
        }
        TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text);
        textInputEditText.setText(this.f27838e);
        textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithGoogleFragment$onCreateView$lambda$3$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                String valueOf = String.valueOf(editable);
                Locale locale = Locale.getDefault();
                Intrinsics.m32178g(locale, "getDefault()");
                String lowerCase = valueOf.toLowerCase(locale);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.m32174c(lowerCase, SignUpWithGoogleFragment.this.f27838e)) {
                    ((MaterialButton) inflate.findViewById(C2507R.id.sign_up_button)).setText(C2507R.string.create_profile);
                } else {
                    ((MaterialButton) inflate.findViewById(C2507R.id.sign_up_button)).setText(C2507R.string.text_continue);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.sign_up_button);
        Intrinsics.m32178g(materialButton, "view.sign_up_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithGoogleFragment$onCreateView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignUpWithGoogleFragment signUpWithGoogleFragment = SignUpWithGoogleFragment.this;
                SignUpWithGoogleFragment.Companion companion = SignUpWithGoogleFragment.f27835j;
                ((TextInputLayout) signUpWithGoogleFragment.m15444A3(C2507R.id.login_input_layout)).setError(null);
                ((TextInputLayout) signUpWithGoogleFragment.m15444A3(C2507R.id.email_input_layout)).setError(null);
                String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.login_edit_text)).getText());
                String m33891Q = StringsKt.m33891Q(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text)).getText()), " ", "", false, 4, null);
                Locale locale = Locale.getDefault();
                Intrinsics.m32178g(locale, "getDefault()");
                String lowerCase = m33891Q.toLowerCase(locale);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                SignUpWithGoogleFragment signUpWithGoogleFragment2 = SignUpWithGoogleFragment.this;
                ((SignUpWithGooglePresenter) signUpWithGoogleFragment2.f27841h.getValue(signUpWithGoogleFragment2, SignUpWithGoogleFragment.f27836k[0])).m14252a(valueOf, lowerCase, SignUpWithGoogleFragment.this.f27839f);
                return Unit.f63088a;
            }
        });
        TextView textView = (TextView) inflate.findViewById(C2507R.id.confirm_terms);
        textView.setText(Html.fromHtml(getString(C2507R.string.confirm_terms)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27842i.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: r */
    public void mo14263r() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: t */
    public void mo14264t() {
        Intent intent = new Intent(getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(268451840);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: w */
    public void mo14265w() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: y */
    public void mo14266y() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_already_taken, C2507R.string.ok);
        }
    }
}
