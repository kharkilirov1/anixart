package com.swiftsoft.anixartd.p015ui.fragment.main.profile;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ProfileSocialFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/ProfileSocialFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileSocialView;", "Lcom/swiftsoft/anixartd/ui/fragment/BackPressedListener;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileSocialFragment extends BaseFragment implements ProfileSocialView, BackPressedListener {

    /* renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f28490g = {C2052a.m12277l(ProfileSocialFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileSocialPresenter;", 0)};

    /* renamed from: d */
    @Inject
    public Lazy<ProfileSocialPresenter> f28491d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28492e;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f28493f = new LinkedHashMap();

    public ProfileSocialFragment() {
        Function0<ProfileSocialPresenter> function0 = new Function0<ProfileSocialPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileSocialPresenter invoke() {
                Lazy<ProfileSocialPresenter> lazy = ProfileSocialFragment.this.f28491d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28492e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileSocialPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener
    /* renamed from: A2 */
    public boolean mo15435A2() {
        m15567e4();
        return false;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15565A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28493f;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: J3 */
    public void mo14831J3() {
        ((TextInputLayout) m15565A3(C2507R.id.tilTgPage)).setErrorEnabled(true);
        ((TextInputLayout) m15565A3(C2507R.id.tilTgPage)).setError(getString(C2507R.string.profile_social_error_invalid_page));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: O */
    public void mo14832O() {
        if (m15566c4().f26669c.f29167b.length() > 0) {
            TextInputEditText textInputEditText = (TextInputEditText) m15565A3(C2507R.id.etVkPage);
            StringBuilder m24u = C0000a.m24u("https://vk.com/");
            m24u.append(m15566c4().f26669c.f29167b);
            textInputEditText.setText(m24u.toString());
        }
        if (m15566c4().f26669c.f29168c.length() > 0) {
            TextInputEditText textInputEditText2 = (TextInputEditText) m15565A3(C2507R.id.etTgPage);
            StringBuilder m24u2 = C0000a.m24u("https://t.me/");
            m24u2.append(m15566c4().f26669c.f29168c);
            textInputEditText2.setText(m24u2.toString());
        }
        if (m15566c4().f26669c.f29169d.length() > 0) {
            TextInputEditText textInputEditText3 = (TextInputEditText) m15565A3(C2507R.id.etInstPage);
            StringBuilder m24u3 = C0000a.m24u("https://instagram.com/");
            m24u3.append(m15566c4().f26669c.f29169d);
            textInputEditText3.setText(m24u3.toString());
        }
        if (m15566c4().f26669c.f29170e.length() > 0) {
            TextInputEditText textInputEditText4 = (TextInputEditText) m15565A3(C2507R.id.etTtPage);
            StringBuilder m24u4 = C0000a.m24u("https://tiktok.com/@");
            m24u4.append(m15566c4().f26669c.f29170e);
            textInputEditText4.setText(m24u4.toString());
        }
        if (m15566c4().f26669c.f29171f.length() > 0) {
            ((TextInputEditText) m15565A3(C2507R.id.etDiscordPage)).setText(m15566c4().f26669c.f29171f);
        }
        TextInputEditText etVkPage = (TextInputEditText) m15565A3(C2507R.id.etVkPage);
        Intrinsics.m32178g(etVkPage, "etVkPage");
        etVkPage.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onLoaded$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15566c4().f26669c.f29172g = true;
                ((TextInputLayout) ProfileSocialFragment.this.m15565A3(C2507R.id.tilVkPage)).setErrorEnabled(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        TextInputEditText etTgPage = (TextInputEditText) m15565A3(C2507R.id.etTgPage);
        Intrinsics.m32178g(etTgPage, "etTgPage");
        etTgPage.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onLoaded$$inlined$addTextChangedListener$default$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15566c4().f26669c.f29172g = true;
                ((TextInputLayout) ProfileSocialFragment.this.m15565A3(C2507R.id.tilTgPage)).setErrorEnabled(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        TextInputEditText etInstPage = (TextInputEditText) m15565A3(C2507R.id.etInstPage);
        Intrinsics.m32178g(etInstPage, "etInstPage");
        etInstPage.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onLoaded$$inlined$addTextChangedListener$default$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15566c4().f26669c.f29172g = true;
                ((TextInputLayout) ProfileSocialFragment.this.m15565A3(C2507R.id.tilInstPage)).setErrorEnabled(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        TextInputEditText etTtPage = (TextInputEditText) m15565A3(C2507R.id.etTtPage);
        Intrinsics.m32178g(etTtPage, "etTtPage");
        etTtPage.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onLoaded$$inlined$addTextChangedListener$default$4
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15566c4().f26669c.f29172g = true;
                ((TextInputLayout) ProfileSocialFragment.this.m15565A3(C2507R.id.tilTtPage)).setErrorEnabled(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        TextInputEditText etDiscordPage = (TextInputEditText) m15565A3(C2507R.id.etDiscordPage);
        Intrinsics.m32178g(etDiscordPage, "etDiscordPage");
        etDiscordPage.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onLoaded$$inlined$addTextChangedListener$default$5
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15566c4().f26669c.f29172g = true;
                ((TextInputLayout) ProfileSocialFragment.this.m15565A3(C2507R.id.tilDiscordPage)).setErrorEnabled(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        NestedScrollView nested_scroll_view = (NestedScrollView) m15565A3(C2507R.id.nested_scroll_view);
        Intrinsics.m32178g(nested_scroll_view, "nested_scroll_view");
        nested_scroll_view.setVisibility(0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: P1 */
    public void mo14833P1() {
        ((TextInputLayout) m15565A3(C2507R.id.tilInstPage)).setErrorEnabled(true);
        ((TextInputLayout) m15565A3(C2507R.id.tilInstPage)).setError(getString(C2507R.string.profile_social_error_invalid_page));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: W2 */
    public void mo14834W2() {
        ((TextInputLayout) m15565A3(C2507R.id.tilTtPage)).setErrorEnabled(true);
        ((TextInputLayout) m15565A3(C2507R.id.tilTtPage)).setError(getString(C2507R.string.profile_social_error_invalid_page));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: X1 */
    public void mo14835X1() {
        ((TextInputLayout) m15565A3(C2507R.id.tilVkPage)).setErrorEnabled(true);
        ((TextInputLayout) m15565A3(C2507R.id.tilVkPage)).setError(getString(C2507R.string.profile_social_error_invalid_page));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: a */
    public void mo14836a() {
        ProgressBar progress_bar = (ProgressBar) m15565A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: b */
    public void mo14837b() {
        ProgressBar progress_bar = (ProgressBar) m15565A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: b3 */
    public void mo14838b3() {
        Keyboard.f30166a.m16340a(this);
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.changes_saved);
        Intrinsics.m32178g(string, "getString(R.string.changes_saved)");
        dialogs.m16308g(this, string, 0);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: c */
    public void mo14839c() {
        ((SwipeRefreshLayout) m15565A3(C2507R.id.refresh)).setEnabled(false);
        LinearLayout error_layout = (LinearLayout) m15565A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileSocialPresenter m15566c4() {
        return (ProfileSocialPresenter) this.f28492e.getValue(this, f28490g[0]);
    }

    /* renamed from: e4 */
    public final void m15567e4() {
        if (!m15566c4().f26669c.f29172g) {
            m15437u3().mo15323a3();
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        builder.m16318j(C2507R.string.confirm);
        builder.m16310b("Если вы закроете эту страницу, данные сохранены не будут. Вы уверены?");
        builder.m16315g(C2507R.string.yes);
        builder.m16311c(C2507R.string.cancel);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onBack$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15437u3().mo15323a3();
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: h3 */
    public void mo14840h3() {
        ((TextInputLayout) m15565A3(C2507R.id.tilDiscordPage)).setErrorEnabled(true);
        ((TextInputLayout) m15565A3(C2507R.id.tilDiscordPage)).setError(getString(C2507R.string.profile_social_error_invalid_page));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28493f.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14088D(this);
        super.onCreate(bundle);
        m15566c4().m14830b();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_social, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.back);
        Intrinsics.m32178g(relativeLayout, "view.back");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onCreateView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ProfileSocialFragment profileSocialFragment = ProfileSocialFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileSocialFragment.f28490g;
                profileSocialFragment.m15567e4();
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.saveChanges);
        Intrinsics.m32178g(relativeLayout2, "view.saveChanges");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileSocialFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.etVkPage)).getText());
                String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.etTgPage)).getText());
                String valueOf3 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.etInstPage)).getText());
                String valueOf4 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.etTtPage)).getText());
                String valueOf5 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.etDiscordPage)).getText());
                ((TextInputLayout) this.m15565A3(C2507R.id.tilVkPage)).setErrorEnabled(false);
                ((TextInputLayout) this.m15565A3(C2507R.id.tilTgPage)).setErrorEnabled(false);
                ((TextInputLayout) this.m15565A3(C2507R.id.tilInstPage)).setErrorEnabled(false);
                ((TextInputLayout) this.m15565A3(C2507R.id.tilTtPage)).setErrorEnabled(false);
                ((TextInputLayout) this.m15565A3(C2507R.id.tilDiscordPage)).setErrorEnabled(false);
                this.m15566c4().m14829a(new Regex("\\s").m33873e(valueOf, ""), new Regex("\\s").m33873e(valueOf2, ""), new Regex("\\s").m33873e(valueOf3, ""), new Regex("\\s").m33873e(valueOf4, ""), valueOf5);
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28493f.clear();
    }
}
