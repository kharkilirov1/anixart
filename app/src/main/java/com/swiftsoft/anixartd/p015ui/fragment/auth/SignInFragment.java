package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.RunnableC0042c;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter;
import com.swiftsoft.anixartd.presentation.auth.signin.SignInView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnGoogleAuthentication;
import com.swiftsoft.anixartd.utils.OnVkAuthentication;
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
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SignInFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/SignInFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/signin/SignInView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignInFragment extends BaseFragment implements SignInView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f27811h = {C2052a.m12277l(SignInFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/signin/SignInPresenter;", 0)};

    /* renamed from: e */
    @Inject
    public Lazy<SignInPresenter> f27813e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27814f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27815g = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27812d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = SignInFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    public SignInFragment() {
        Function0<SignInPresenter> function0 = new Function0<SignInPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SignInPresenter invoke() {
                Lazy<SignInPresenter> lazy = SignInFragment.this.f27813e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27814f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SignInPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15442A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27815g;
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

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: E */
    public void mo14225E(@NotNull String localizedMessage) {
        Intrinsics.m32179h(localizedMessage, "localizedMessage");
        Dialogs.f30143a.m16308g(this, localizedMessage, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: L */
    public void mo14226L() {
        ((TextInputLayout) m15442A3(C2507R.id.login_input_layout)).setError("Никнейм не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: Z */
    public void mo14227Z() {
        ((TextInputLayout) m15442A3(C2507R.id.password_input_layout)).setError("Пароль слишком короткий или содержит недопустимые символы");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: h */
    public void mo14228h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27812d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: j */
    public void mo14229j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27812d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27815g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14085A0(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_sign_in, viewGroup, false);
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(false);
            supportActionBar.mo341t(false);
            supportActionBar.mo342u(false);
        }
        new Handler().postDelayed(new RunnableC0042c(this, 9), 2000L);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(C2507R.id.logo);
        Intrinsics.m32178g(lottieAnimationView, "view.logo");
        ViewsKt.m16377j(lottieAnimationView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((LottieAnimationView) SignInFragment.this.m15442A3(C2507R.id.logo)).m4644k();
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.sign_in_button);
        Intrinsics.m32178g(materialButton, "view.sign_in_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignInFragment signInFragment = SignInFragment.this;
                KProperty<Object>[] kPropertyArr = SignInFragment.f27811h;
                ((TextInputLayout) signInFragment.m15442A3(C2507R.id.login_input_layout)).setError(null);
                ((TextInputLayout) signInFragment.m15442A3(C2507R.id.password_input_layout)).setError(null);
                String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.login_edit_text)).getText());
                String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.password_edit_text)).getText());
                SignInFragment signInFragment2 = SignInFragment.this;
                ((SignInPresenter) signInFragment2.f27814f.getValue(signInFragment2, SignInFragment.f27811h[0])).m14224a(valueOf, valueOf2);
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.sign_in_with_vk);
        Intrinsics.m32178g(relativeLayout, "view.sign_in_with_vk");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnVkAuthentication());
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.sign_in_with_google);
        Intrinsics.m32178g(relativeLayout2, "view.sign_in_with_google");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$6
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnGoogleAuthentication());
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) inflate.findViewById(C2507R.id.sign_up_button);
        Intrinsics.m32178g(relativeLayout3, "view.sign_up_button");
        ViewsKt.m16377j(relativeLayout3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignInFragment signInFragment = SignInFragment.this;
                KProperty<Object>[] kPropertyArr = SignInFragment.f27811h;
                signInFragment.m15437u3().mo15324d2(new SignUpFragment(), null);
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.auth_skip_button);
        Intrinsics.m32178g(materialButton2, "view.auth_skip_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignInFragment signInFragment = SignInFragment.this;
                SignInPresenter signInPresenter = (SignInPresenter) signInFragment.f27814f.getValue(signInFragment, SignInFragment.f27811h[0]);
                signInPresenter.f25865a.m15277d(0L);
                signInPresenter.f25865a.m15276c(1L);
                signInPresenter.f25865a.m15278e("");
                signInPresenter.f25865a.m15275b(true);
                signInPresenter.getViewState().mo14232z3(true);
                return Unit.f63088a;
            }
        });
        TextView textView = (TextView) inflate.findViewById(C2507R.id.restore_button);
        Intrinsics.m32178g(textView, "view.restore_button");
        ViewsKt.m16377j(textView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.SignInFragment$onCreateView$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                SignInFragment signInFragment = SignInFragment.this;
                KProperty<Object>[] kPropertyArr = SignInFragment.f27811h;
                signInFragment.m15437u3().mo15324d2(new RestoreFragment(), null);
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate.findViewById(C2507R.id.update_available_auth);
        Intrinsics.m32178g(relativeLayout4, "view.update_available_auth");
        ViewsKt.m16380m(relativeLayout4, 24111318 < ((SignInPresenter) this.f27814f.getValue(this, f27811h[0])).f25866b.m14068k());
        ((RelativeLayout) inflate.findViewById(C2507R.id.update_available_auth)).setOnClickListener(new ViewOnClickListenerC2625a(this, 8));
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27815g.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(false);
            supportActionBar.mo341t(false);
            supportActionBar.mo342u(false);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: r */
    public void mo14230r() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            builder.m16310b("Пользователь с таким Email или никнеймом не найден.");
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: z */
    public void mo14231z() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            builder.m16310b("Вы ошиблись при вводе пароля. Попробуйте еще раз.");
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: z3 */
    public void mo14232z3(boolean z) {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            View view = getView();
            inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        }
        Intent intent = new Intent(getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(335560704);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
