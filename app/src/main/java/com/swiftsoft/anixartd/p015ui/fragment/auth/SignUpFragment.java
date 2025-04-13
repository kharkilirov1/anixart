package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.SignUpView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SignUpFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignUpFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/SignUpView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpFragment extends BaseFragment implements SignUpView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f27826h = {C2052a.m12277l(SignUpFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/signup/SignUpPresenter;", 0)};

    /* renamed from: e */
    @Inject
    public Lazy<SignUpPresenter> f27828e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27829f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27830g = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27827d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = SignUpFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    public SignUpFragment() {
        Function0<SignUpPresenter> function0 = new Function0<SignUpPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SignUpPresenter invoke() {
                Lazy<SignUpPresenter> lazy = SignUpFragment.this.f27828e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27829f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SignUpPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15443A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27830g;
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

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: C */
    public void mo14234C() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_already_taken, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: E */
    public void mo14235E(@NotNull String localizedMessage) {
        Intrinsics.m32179h(localizedMessage, "localizedMessage");
        Dialogs.f30143a.m16308g(this, localizedMessage, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: G0 */
    public void mo14236G0() {
        ((TextInputLayout) m15443A3(C2507R.id.password_repeat_input_layout)).setError("Пароль слишком короткий или содержит недопустимые символы");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: I */
    public void mo14237I() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.warning, C2507R.string.notification_code_already_sent, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: J */
    public void mo14238J() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_too_many_registrations, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: L */
    public void mo14239L() {
        ((TextInputLayout) m15443A3(C2507R.id.login_input_layout)).setError("Никнейм не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Q */
    public void mo14240Q() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_service_disallowed, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: R */
    public void mo14241R(@NotNull String login, @NotNull String email, @NotNull String password, @NotNull String hash, long j2) {
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(hash, "hash");
        m15437u3().mo15324d2(VerifyFragment.Companion.m15447a(VerifyFragment.f27861m, login, email, password, null, null, hash, j2, 24), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: S */
    public void mo14242S() {
        ((TextInputLayout) m15443A3(C2507R.id.password_repeat_input_layout)).setError("Пароль не совпадает");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Z */
    public void mo14243Z() {
        ((TextInputLayout) m15443A3(C2507R.id.password_input_layout)).setError("Пароль слишком короткий или содержит недопустимые символы");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Z0 */
    public void mo14244Z0() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_code_cannot_send, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: b0 */
    public void mo14245b0() {
        ((TextInputLayout) m15443A3(C2507R.id.email_input_layout)).setError("Email не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: h */
    public void mo14246h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27827d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: j */
    public void mo14247j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27827d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27830g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14161z(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_sign_up, viewGroup, false);
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(true);
            supportActionBar.mo341t(true);
            supportActionBar.mo342u(true);
            supportActionBar.mo345x("Создать профиль");
        }
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.sign_up_button);
        Intrinsics.m32178g(materialButton, "view.sign_up_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignUpFragment signUpFragment = SignUpFragment.this;
                KProperty<Object>[] kPropertyArr = SignUpFragment.f27826h;
                ((TextInputLayout) signUpFragment.m15443A3(C2507R.id.login_input_layout)).setError(null);
                ((TextInputLayout) signUpFragment.m15443A3(C2507R.id.email_input_layout)).setError(null);
                ((TextInputLayout) signUpFragment.m15443A3(C2507R.id.password_input_layout)).setError(null);
                ((TextInputLayout) signUpFragment.m15443A3(C2507R.id.password_repeat_input_layout)).setError(null);
                ((TextInputLayout) signUpFragment.m15443A3(C2507R.id.password_repeat_input_layout)).setError(null);
                String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.login_edit_text)).getText());
                String m33891Q = StringsKt.m33891Q(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text)).getText()), " ", "", false, 4, null);
                String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.password_edit_text)).getText());
                String valueOf3 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.password_repeat_edit_text)).getText());
                SignUpFragment signUpFragment2 = SignUpFragment.this;
                ((SignUpPresenter) signUpFragment2.f27829f.getValue(signUpFragment2, SignUpFragment.f27826h[0])).m14233a(valueOf, m33891Q, valueOf2, valueOf3);
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
        this.f27830g.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: r */
    public void mo14248r() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: w */
    public void mo14249w() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: y */
    public void mo14250y() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_already_taken, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: z */
    public void mo14251z() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_password_invalid, C2507R.string.ok);
        }
    }
}
