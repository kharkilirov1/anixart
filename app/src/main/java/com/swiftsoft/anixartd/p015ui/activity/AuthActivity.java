package com.swiftsoft.anixartd.p015ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.auth.C2052a;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthCredential;
import com.ncapdevi.fragnav.FragNavController;
import com.ncapdevi.fragnav.FragNavLogger;
import com.ncapdevi.fragnav.FragNavSwitchController;
import com.ncapdevi.fragnav.FragNavTransactionOptions;
import com.ncapdevi.fragnav.tabhistory.UniqueTabHistoryStrategy;
import com.p017vk.api.sdk.C2786VK;
import com.p017vk.api.sdk.auth.VKAccessToken;
import com.p017vk.api.sdk.auth.VKAuthCallback;
import com.p017vk.api.sdk.auth.VKScope;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.AuthActivity$appUpdatedListener$2;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignInFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithGoogleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignUpWithVkFragment;
import com.swiftsoft.anixartd.presentation.auth.AuthPresenter;
import com.swiftsoft.anixartd.presentation.auth.AuthView;
import com.swiftsoft.anixartd.presentation.auth.C2546a;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnGoogleAuthentication;
import com.swiftsoft.anixartd.utils.OnVkAuthentication;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpAppCompatActivity;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AuthActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/AuthActivity;", "Lmoxy/MvpAppCompatActivity;", "Lcom/swiftsoft/anixartd/presentation/auth/AuthView;", "Lcom/ncapdevi/fragnav/FragNavController$RootFragmentListener;", "Lcom/swiftsoft/anixartd/ui/fragment/FragmentNavigation;", "Lcom/swiftsoft/anixartd/utils/OnVkAuthentication;", "onVkAuthentication", "", "OnVkAuthentication", "Lcom/swiftsoft/anixartd/utils/OnGoogleAuthentication;", "onGoogleAuthentication", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AuthActivity extends MvpAppCompatActivity implements AuthView, FragNavController.RootFragmentListener, FragmentNavigation {

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f27406j = {C2052a.m12277l(AuthActivity.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/AuthPresenter;", 0)};

    /* renamed from: b */
    @NotNull
    public final Lazy f27407b;

    /* renamed from: c */
    @NotNull
    public final Lazy f27408c;

    /* renamed from: d */
    @NotNull
    public final Lazy f27409d;

    /* renamed from: e */
    @Inject
    public dagger.Lazy<AuthPresenter> f27410e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27411f;

    /* renamed from: g */
    @NotNull
    public final FragNavController f27412g;

    /* renamed from: h */
    public GoogleSignInClient f27413h;

    /* renamed from: i */
    public FirebaseAuth f27414i;

    /* compiled from: AuthActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/AuthActivity$Companion;", "", "", "APP_UPDATE_REQUEST_CODE", "I", "GOOGLE_SIGN_IN_REQUEST_CODE", "INDEX_SIGN_IN", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public AuthActivity() {
        new LinkedHashMap();
        this.f27407b = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$dialog$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Dialogs.MaterialDialog invoke() {
                Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(AuthActivity.this);
                builder.f30150b = 1;
                return new Dialogs.MaterialDialog(builder);
            }
        });
        this.f27408c = LazyKt.m31881b(new Function0<AppUpdateManager>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$appUpdateManager$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public AppUpdateManager invoke() {
                AppUpdateManager m10651a = AppUpdateManagerFactory.m10651a(AuthActivity.this);
                Intrinsics.m32178g(m10651a, "create(this)");
                return m10651a;
            }
        });
        this.f27409d = LazyKt.m31881b(new Function0<AuthActivity$appUpdatedListener$2.C26231>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$appUpdatedListener$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.swiftsoft.anixartd.ui.activity.AuthActivity$appUpdatedListener$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public C26231 invoke() {
                final AuthActivity authActivity = AuthActivity.this;
                return new InstallStateUpdatedListener() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$appUpdatedListener$2.1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    /* renamed from: a */
                    public void mo10687a(InstallState installState) {
                        InstallState installState2 = installState;
                        Intrinsics.m32179h(installState2, "installState");
                        if (installState2.mo10827c() == 11) {
                            AuthActivity.this.m15328u4();
                        } else if (installState2.mo10827c() == 4) {
                            AuthActivity authActivity2 = AuthActivity.this;
                            KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                            authActivity2.m15325s4().mo10650e(this);
                        }
                    }
                };
            }
        });
        Function0<AuthPresenter> function0 = new Function0<AuthPresenter>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public AuthPresenter invoke() {
                dagger.Lazy<AuthPresenter> lazy = AuthActivity.this.f27410e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27411f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(AuthPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m32178g(supportFragmentManager, "supportFragmentManager");
        this.f27412g = new FragNavController(supportFragmentManager, C2507R.id.root_container);
    }

    @Override // com.ncapdevi.fragnav.FragNavController.RootFragmentListener
    /* renamed from: A2 */
    public int mo13832A2() {
        return 1;
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: M1 */
    public void mo14189M1(@NotNull HashMap<String, Object> vkAuthData) {
        Intrinsics.m32179h(vkAuthData, "vkAuthData");
        FragNavController fragNavController = this.f27412g;
        Objects.requireNonNull(SignUpWithVkFragment.f27849i);
        SignUpWithVkFragment signUpWithVkFragment = new SignUpWithVkFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("VK_AUTH_DATA", vkAuthData);
        signUpWithVkFragment.setArguments(bundle);
        FragNavController.m13813l(fragNavController, signUpWithVkFragment, null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void OnVkAuthentication(@NotNull OnVkAuthentication onVkAuthentication) {
        Intrinsics.m32179h(onVkAuthentication, "onVkAuthentication");
        C2786VK.m16484c(this, CollectionsKt.m32024i(VKScope.EMAIL));
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: P */
    public void mo14190P() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: a3 */
    public void mo15323a3() {
        FragNavController.m13812j(this.f27412g, null, 1);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: d2 */
    public void mo15324d2(@NotNull Fragment fragment, @Nullable List<? extends Pair<? extends View, String>> list) {
        Intrinsics.m32179h(fragment, "fragment");
        FragNavTransactionOptions.Builder builder = new FragNavTransactionOptions.Builder();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair<View, String> element = (Pair) it.next();
                Intrinsics.m32180i(element, "element");
                builder.f24575a.add(element);
            }
        }
        this.f27412g.m13824k(fragment, new FragNavTransactionOptions(builder, null));
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: e0 */
    public void mo14191e0() {
        startActivity(new Intent(this, (Class<?>) UpdateActivity.class));
        finish();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: f1 */
    public void mo14192f1() {
        if (m15327t4().f25811c.f25344a.getLong("IN_APP_UPDATES_TIME_FOR_RETRY", 0L) < System.currentTimeMillis()) {
            AuthPresenter m15327t4 = m15327t4();
            m15327t4.f25811c.f25344a.edit().putLong("IN_APP_UPDATES_TIME_FOR_RETRY", System.currentTimeMillis() + m15327t4().f25812d.f28963c).apply();
            Task<AppUpdateInfo> mo10647b = m15325s4().mo10647b();
            Intrinsics.m32178g(mo10647b, "appUpdateManager.appUpdateInfo");
            mo10647b.mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onCheckForInAppUpdates$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
                    if (appUpdateInfo2.f19590a == 2) {
                        AuthActivity authActivity = AuthActivity.this;
                        KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                        if (authActivity.m15327t4().f25812d.f28962b == 0) {
                            AuthActivity.this.m15325s4().mo10648c((InstallStateUpdatedListener) AuthActivity.this.f27409d.getValue());
                        }
                        AuthActivity.this.m15325s4().mo10649d(appUpdateInfo2, AuthActivity.this.m15327t4().f25812d.f28962b, AuthActivity.this, 10101);
                    }
                    return Unit.f63088a;
                }
            }, 26));
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: h */
    public void mo14193h() {
        ((Dialogs.MaterialDialog) this.f27407b.getValue()).show();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: j */
    public void mo14194j() {
        ((Dialogs.MaterialDialog) this.f27407b.getValue()).dismiss();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: o0 */
    public void mo14195o0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_vk_login_failed);
        Intrinsics.m32178g(string, "getString(R.string.auth_vk_login_failed)");
        dialogs.m16307f(this, string);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        final HashMap<String, Object> hashMap = new HashMap<>();
        int i4 = 1;
        if (C2786VK.m16485d(i2, i3, intent, new VKAuthCallback() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onActivityResult$callback$1
            @Override // com.p017vk.api.sdk.auth.VKAuthCallback
            /* renamed from: a */
            public void mo15329a(int i5) {
                AuthActivity authActivity = this;
                KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                authActivity.m15327t4().getViewState().mo14195o0();
            }

            @Override // com.p017vk.api.sdk.auth.VKAuthCallback
            /* renamed from: b */
            public void mo15330b(@NotNull VKAccessToken token) {
                Intrinsics.m32179h(token, "token");
                hashMap.put("accessToken", token.f30662b);
                hashMap.put("userId", Integer.valueOf(token.f30661a));
                hashMap.put("email", token.f30665e);
            }
        }) && (!hashMap.isEmpty())) {
            m15327t4().m14188b(hashMap);
        }
        if (i2 == 9001) {
            com.google.android.gms.tasks.Task<GoogleSignInAccount> m7852a = GoogleSignIn.m7852a(intent);
            try {
                GoogleSignInAccount mo9709n = m7852a.mo9709n(ApiException.class);
                String str = mo9709n != null ? mo9709n.f15175d : null;
                String str2 = mo9709n != null ? mo9709n.f15176e : null;
                if (str == null || str2 == null) {
                    return;
                }
                GoogleAuthCredential googleAuthCredential = new GoogleAuthCredential(str, null);
                FirebaseAuth firebaseAuth = this.f27414i;
                if (firebaseAuth != null) {
                    firebaseAuth.m12234a(googleAuthCredential).mo9697b(this, new C2546a(m7852a, this, i4));
                } else {
                    Intrinsics.m32189r("firebaseAuth");
                    throw null;
                }
            } catch (ApiException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller m13819e = this.f27412g.m13819e();
        if ((!(m13819e instanceof BackPressedListener) || ((BackPressedListener) m13819e).mo15435A2()) && !FragNavController.m13812j(this.f27412g, null, 1)) {
            super.onBackPressed();
        }
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14158x0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        setContentView(C2507R.layout.activity_container);
        FragNavController fragNavController = this.f27412g;
        fragNavController.f24560b = this;
        fragNavController.f24563e = true;
        fragNavController.f24559a = new FragNavLogger() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onCreate$1$1
            @Override // com.ncapdevi.fragnav.FragNavLogger
            /* renamed from: a */
            public void mo13834a(@NotNull String message, @NotNull Throwable throwable) {
                Intrinsics.m32179h(message, "message");
                Intrinsics.m32179h(throwable, "throwable");
                Log.e("fragNavLogger", message, throwable);
            }
        };
        fragNavController.f24562d = 1;
        fragNavController.m13827o(new UniqueTabHistoryStrategy(new FragNavSwitchController() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onCreate$1$2
            @Override // com.ncapdevi.fragnav.FragNavSwitchController
            /* renamed from: a */
            public void mo13835a(int i2, @Nullable FragNavTransactionOptions fragNavTransactionOptions) {
            }
        }));
        this.f27412g.m13822h(0, bundle);
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.f15187m);
        builder.m7861b(getString(C2507R.string.default_web_client_id));
        builder.f15205a.add(GoogleSignInOptions.f15189o);
        this.f27413h = new GoogleSignInClient((Activity) this, builder.m7860a());
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.m32178g(firebaseAuth, "getInstance()");
        this.f27414i = firebaseAuth;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo339r(new ColorDrawable(0));
        }
        m15327t4().m14187a();
    }

    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGoogleAuthentication(@NotNull OnGoogleAuthentication onGoogleAuthentication) {
        Intrinsics.m32179h(onGoogleAuthentication, "onGoogleAuthentication");
        GoogleSignInClient googleSignInClient = this.f27413h;
        if (googleSignInClient != null) {
            startActivityForResult(googleSignInClient.m7855e(), 9001);
        } else {
            Intrinsics.m32189r("googleSignInClient");
            throw null;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.m32179h(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m15327t4().f25812d.f28962b == 1) {
            m15325s4().mo10647b().mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onResume$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
                    if (appUpdateInfo2.f19590a == 3) {
                        AuthActivity authActivity = AuthActivity.this;
                        KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                        authActivity.m15325s4().mo10649d(appUpdateInfo2, 1, AuthActivity.this, 10101);
                    }
                    return Unit.f63088a;
                }
            }, 24));
        } else {
            m15325s4().mo10647b().mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.AuthActivity$onResume$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    if (appUpdateInfo.f19591b == 11) {
                        AuthActivity.this.m15328u4();
                    }
                    return Unit.f63088a;
                }
            }, 25));
        }
    }

    @Override // moxy.MvpAppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        this.f27412g.m13823i(outState);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: q3 */
    public void mo14196q3(@NotNull String email, @NotNull String googleIdToken) {
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(googleIdToken, "googleIdToken");
        FragNavController fragNavController = this.f27412g;
        Objects.requireNonNull(SignUpWithGoogleFragment.f27835j);
        SignUpWithGoogleFragment signUpWithGoogleFragment = new SignUpWithGoogleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL_VALUE", email);
        bundle.putString("GOOGLE_ID_TOKEN_VALUE", googleIdToken);
        signUpWithGoogleFragment.setArguments(bundle);
        FragNavController.m13813l(fragNavController, signUpWithGoogleFragment, null, 2);
    }

    /* renamed from: s4 */
    public final AppUpdateManager m15325s4() {
        return (AppUpdateManager) this.f27408c.getValue();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: t */
    public void mo14197t() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(335560704);
        startActivity(intent);
        finish();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: t0 */
    public void mo15326t0(int i2) {
        FragNavController.m13814s(this.f27412g, i2, null, 2);
    }

    /* renamed from: t4 */
    public final AuthPresenter m15327t4() {
        return (AuthPresenter) this.f27411f.getValue(this, f27406j[0]);
    }

    @Override // com.ncapdevi.fragnav.FragNavController.RootFragmentListener
    @NotNull
    /* renamed from: u3 */
    public Fragment mo13833u3(int i2) {
        if (i2 == 0) {
            return new SignInFragment();
        }
        throw new Exception("Need to send an index that we know");
    }

    /* renamed from: u4 */
    public final void m15328u4() {
        Snackbar m10377j = Snackbar.m10377j(findViewById(C2507R.id.container), "Обновление загружено", -2);
        m10377j.m10379k("Установить", new ViewOnClickListenerC2625a(this, 0));
        BaseTransientBottomBar.SnackbarBaseLayout view = m10377j.f18817i;
        Intrinsics.m32178g(view, "view");
        ((SnackbarContentLayout) m10377j.f18817i.getChildAt(0)).getMessageView().setTextColor(ViewsKt.m16370c(view, C2507R.attr.primaryTextColor));
        ((SnackbarContentLayout) m10377j.f18817i.getChildAt(0)).getActionView().setTextColor(getResources().getColor(C2507R.color.carmine));
        BaseTransientBottomBar.SnackbarBaseLayout view2 = m10377j.f18817i;
        Intrinsics.m32178g(view2, "view");
        m10377j.f18817i.setBackgroundTintList(ColorStateList.valueOf(ViewsKt.m16370c(view2, C2507R.attr.backgroundColorSecondary)));
        m10377j.m10380l();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: w0 */
    public void mo14198w0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_google_login_failed);
        Intrinsics.m32178g(string, "getString(R.string.auth_google_login_failed)");
        dialogs.m16307f(this, string);
    }
}
