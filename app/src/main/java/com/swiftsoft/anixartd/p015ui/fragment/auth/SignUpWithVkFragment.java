package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
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
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithVkFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.io.Serializable;
import java.util.HashMap;
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

/* compiled from: SignUpWithVkFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignUpWithVkFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/vk/SignUpWithVkView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpWithVkFragment extends BaseFragment implements SignUpWithVkView {

    /* renamed from: f */
    @Inject
    public Lazy<SignUpWithVkPresenter> f27853f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f27854g;

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f27850j = {C2052a.m12277l(SignUpWithVkFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/signup/vk/SignUpWithVkPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f27849i = new Companion(null);

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27855h = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27851d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithVkFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = SignUpWithVkFragment.this.getContext();
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
    public HashMap<String, Object> f27852e = new HashMap<>();

    /* compiled from: SignUpWithVkFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignUpWithVkFragment$Companion;", "", "", "VK_AUTH_DATA", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SignUpWithVkFragment() {
        Function0<SignUpWithVkPresenter> function0 = new Function0<SignUpWithVkPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithVkFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SignUpWithVkPresenter invoke() {
                Lazy<SignUpWithVkPresenter> lazy = SignUpWithVkFragment.this.f27853f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27854g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SignUpWithVkPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15445A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27855h;
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

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: C */
    public void mo14286C() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_already_taken, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: I */
    public void mo14287I() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.warning, C2507R.string.notification_code_already_sent, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: J */
    public void mo14288J() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_too_many_registrations, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: L */
    public void mo14289L() {
        ((TextInputLayout) m15445A3(C2507R.id.login_input_layout)).setError(getString(C2507R.string.login_is_empty));
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: P */
    public void mo14290P() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: Q */
    public void mo14291Q() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_service_disallowed, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: R */
    public void mo14292R(@NotNull String login, @NotNull String email, @NotNull String vkAccessToken, @NotNull String hash, long j2) {
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(vkAccessToken, "vkAccessToken");
        Intrinsics.m32179h(hash, "hash");
        m15437u3().mo15324d2(VerifyFragment.Companion.m15447a(VerifyFragment.f27861m, login, email, null, vkAccessToken, null, hash, j2, 20), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: b0 */
    public void mo14293b0() {
        ((TextInputLayout) m15445A3(C2507R.id.email_input_layout)).setError(getString(C2507R.string.email_is_empty));
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: h */
    public void mo14294h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27851d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: j */
    public void mo14295j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27851d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27855h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14137n(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        String obj;
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
            Serializable serializable = arguments.getSerializable("VK_AUTH_DATA");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            this.f27852e = (HashMap) serializable;
        }
        final String valueOf = String.valueOf(this.f27852e.get("accessToken"));
        Object obj2 = this.f27852e.get("email");
        if (obj2 == null || (obj = obj2.toString()) == null) {
            str = null;
        } else {
            Locale locale = Locale.getDefault();
            Intrinsics.m32178g(locale, "getDefault()");
            str = obj.toLowerCase(locale);
            Intrinsics.m32178g(str, "this as java.lang.String).toLowerCase(locale)");
        }
        if (str != null) {
            ((TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text)).setText(str);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.email_hint);
        Intrinsics.m32178g(linearLayout, "view.email_hint");
        ViewsKt.m16372e(linearLayout);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.sign_up_button);
        materialButton.setText(C2507R.string.text_continue);
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignUpWithVkFragment$onCreateView$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignUpWithVkFragment signUpWithVkFragment = SignUpWithVkFragment.this;
                SignUpWithVkFragment.Companion companion = SignUpWithVkFragment.f27849i;
                ((TextInputLayout) signUpWithVkFragment.m15445A3(C2507R.id.login_input_layout)).setError(null);
                ((TextInputLayout) signUpWithVkFragment.m15445A3(C2507R.id.email_input_layout)).setError(null);
                String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.login_edit_text)).getText());
                String m33891Q = StringsKt.m33891Q(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.email_edit_text)).getText()), " ", "", false, 4, null);
                Locale locale2 = Locale.getDefault();
                Intrinsics.m32178g(locale2, "getDefault()");
                String lowerCase = m33891Q.toLowerCase(locale2);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                SignUpWithVkFragment signUpWithVkFragment2 = SignUpWithVkFragment.this;
                ((SignUpWithVkPresenter) signUpWithVkFragment2.f27854g.getValue(signUpWithVkFragment2, SignUpWithVkFragment.f27850j[0])).m14285a(valueOf2, lowerCase, valueOf);
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
        this.f27855h.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: r */
    public void mo14296r() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: t */
    public void mo14297t() {
        Intent intent = new Intent(getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(268451840);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: w */
    public void mo14298w() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_invalid, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: y */
    public void mo14299y() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_login_already_taken, C2507R.string.ok);
        }
    }
}
