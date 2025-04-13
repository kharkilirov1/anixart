package com.swiftsoft.anixartd.presentation.auth;

import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.auth.GoogleResponse;
import com.swiftsoft.anixartd.network.response.profile.GoogleBindResponse;
import com.swiftsoft.anixartd.p015ui.activity.AuthActivity;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.presentation.main.MainPresenter;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnGoogleBound;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Locale;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.auth.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2546a implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ int f25830a;

    /* renamed from: b */
    public final /* synthetic */ Object f25831b;

    /* renamed from: c */
    public final /* synthetic */ Object f25832c;

    public /* synthetic */ C2546a(Object obj, Object obj2, int i2) {
        this.f25830a = i2;
        this.f25831b = obj;
        this.f25832c = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task taskAuthResult) {
        switch (this.f25830a) {
            case 0:
                FirebaseUser firebaseUser = (FirebaseUser) this.f25831b;
                final AuthPresenter this$0 = (AuthPresenter) this.f25832c;
                Intrinsics.m32179h(firebaseUser, "$firebaseUser");
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(taskAuthResult, "task");
                if (!taskAuthResult.mo9712q()) {
                    this$0.getViewState().mo14198w0();
                    return;
                }
                GetTokenResult getTokenResult = (GetTokenResult) taskAuthResult.mo9708m();
                final String str = getTokenResult != null ? getTokenResult.f22322a : null;
                String mo12249m = firebaseUser.mo12249m();
                if (mo12249m == null) {
                    mo12249m = "";
                }
                Locale locale = Locale.getDefault();
                Intrinsics.m32178g(locale, "getDefault()");
                final String lowerCase = mo12249m.toLowerCase(locale);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (str != null) {
                    AuthRepository authRepository = this$0.f25809a;
                    Objects.requireNonNull(authRepository);
                    authRepository.f27325a.signInWithGoogle(str).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithGoogle$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            AuthPresenter.this.getViewState().mo14193h();
                            return Unit.f63088a;
                        }
                    }, 5)).m31365g(new C2547b(this$0, 1)).m31370l(new C2548c(new Function1<GoogleResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithGoogle$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(GoogleResponse googleResponse) {
                            GoogleResponse googleResponse2 = googleResponse;
                            if (googleResponse2.isSuccess()) {
                                Profile profile = googleResponse2.getProfile();
                                ProfileToken profileToken = googleResponse2.getProfileToken();
                                if (profile != null && profileToken != null) {
                                    AuthPresenter.this.f25809a.m15277d(profile.getId());
                                    AuthPresenter.this.f25809a.m15276c(profile.getPrivilegeLevel());
                                    AuthPresenter.this.f25809a.m15278e(profileToken.getToken());
                                    AuthPresenter.this.f25809a.m15275b(false);
                                    User user = new User();
                                    user.setName(profile.getLogin());
                                    user.setAvatar(profile.getAvatar());
                                    AuthPresenter.this.f25809a.m15274a(user);
                                    AuthPresenter.this.getViewState().mo14197t();
                                }
                            } else {
                                int code = googleResponse2.getCode();
                                if (code == 2) {
                                    AuthPresenter.this.getViewState().mo14190P();
                                } else if (code == 3) {
                                    AuthPresenter.this.getViewState().mo14196q3(lowerCase, str);
                                }
                            }
                            return Unit.f63088a;
                        }
                    }, 6), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithGoogle$1$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            AuthPresenter.this.getViewState().mo14190P();
                            th.printStackTrace();
                            return Unit.f63088a;
                        }
                    }, 7), Functions.f59621b, Functions.f59622c);
                    return;
                }
                return;
            case 1:
                Task task = (Task) this.f25831b;
                AuthActivity this$02 = (AuthActivity) this.f25832c;
                KProperty<Object>[] kPropertyArr = AuthActivity.f27406j;
                Intrinsics.m32179h(task, "$task");
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(taskAuthResult, "taskAuthResult");
                if (!task.mo9712q()) {
                    this$02.m15327t4().getViewState().mo14198w0();
                    return;
                }
                FirebaseAuth firebaseAuth = this$02.f27414i;
                if (firebaseAuth == null) {
                    Intrinsics.m32189r("firebaseAuth");
                    throw null;
                }
                FirebaseUser firebaseUser2 = firebaseAuth.f22311f;
                if (firebaseUser2 != null) {
                    AuthPresenter m15327t4 = this$02.m15327t4();
                    Objects.requireNonNull(m15327t4);
                    Task m12238h = FirebaseAuth.getInstance(firebaseUser2.mo12257w()).m12238h(firebaseUser2, true);
                    m12238h.mo9698c(new C2546a(firebaseUser2, m15327t4, 0));
                    m12238h.mo9700e(C1136a.f14051r);
                    return;
                }
                return;
            default:
                Task task2 = (Task) this.f25831b;
                MainActivity this$03 = (MainActivity) this.f25832c;
                KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                Intrinsics.m32179h(task2, "$task");
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(taskAuthResult, "taskAuthResult");
                if (!task2.mo9712q()) {
                    this$03.m15333u4().getViewState().mo14352w0();
                    return;
                }
                FirebaseAuth firebaseAuth2 = this$03.f27434j;
                if (firebaseAuth2 == null) {
                    Intrinsics.m32189r("firebaseAuth");
                    throw null;
                }
                FirebaseUser firebaseUser3 = firebaseAuth2.f22311f;
                if (firebaseUser3 != null) {
                    final MainPresenter m15333u4 = this$03.m15333u4();
                    Objects.requireNonNull(m15333u4);
                    Task m12238h2 = FirebaseAuth.getInstance(firebaseUser3.mo12257w()).m12238h(firebaseUser3, true);
                    m12238h2.mo9698c(new OnCompleteListener() { // from class: com.swiftsoft.anixartd.presentation.main.a
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task3) {
                            final MainPresenter this$04 = MainPresenter.this;
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(task3, "task");
                            if (!task3.mo9712q()) {
                                this$04.getViewState().mo14352w0();
                                return;
                            }
                            GetTokenResult getTokenResult2 = (GetTokenResult) task3.mo9708m();
                            String str2 = getTokenResult2 != null ? getTokenResult2.f22322a : null;
                            if (str2 != null) {
                                ProfilePreferenceRepository profilePreferenceRepository = this$04.f25954f;
                                Objects.requireNonNull(profilePreferenceRepository);
                                profilePreferenceRepository.f27370a.googleBind(str2, profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2558c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleBind$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public Unit invoke(Disposable disposable) {
                                        MainPresenter.this.getViewState().mo14345h();
                                        return Unit.f63088a;
                                    }
                                }, 21)).m31365g(new C2555b(this$04, 3)).m31370l(new C2558c(new Function1<GoogleBindResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleBind$1$3
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public Unit invoke(GoogleBindResponse googleBindResponse) {
                                        GoogleBindResponse googleBindResponse2 = googleBindResponse;
                                        if (googleBindResponse2.isSuccess()) {
                                            EventBusKt.m16327a(new OnGoogleBound());
                                        } else {
                                            int code = googleBindResponse2.getCode();
                                            if (code == 2) {
                                                MainPresenter.this.getViewState().mo14337P();
                                            } else if (code == 3) {
                                                MainPresenter.this.getViewState().mo14348n1();
                                            }
                                        }
                                        return Unit.f63088a;
                                    }
                                }, 22), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleBind$1$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public Unit invoke(Throwable th) {
                                        MainPresenter.this.getViewState().mo14337P();
                                        th.printStackTrace();
                                        return Unit.f63088a;
                                    }
                                }, 23), Functions.f59621b, Functions.f59622c);
                            }
                        }
                    });
                    m12238h2.mo9700e(C1136a.f14052s);
                    return;
                }
                return;
        }
    }
}
