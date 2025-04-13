package com.swiftsoft.anixartd.presentation.auth.restore;

import com.swiftsoft.anixartd.repository.AuthRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: RestorePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/restore/RestorePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/restore/RestoreView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RestorePresenter extends MvpPresenter<RestoreView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25837a;

    @Inject
    public RestorePresenter(@NotNull AuthRepository authRepository) {
        Intrinsics.m32179h(authRepository, "authRepository");
        this.f25837a = authRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14199a(@org.jetbrains.annotations.NotNull final java.lang.String r6, @org.jetbrains.annotations.NotNull final java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L17
            moxy.MvpView r0 = r5.getViewState()
            com.swiftsoft.anixartd.presentation.auth.restore.RestoreView r0 = (com.swiftsoft.anixartd.presentation.auth.restore.RestoreView) r0
            r0.mo14207f3()
            r1 = 0
        L17:
            int r0 = r7.length()
            r3 = 32
            r4 = 6
            if (r0 < r4) goto L26
            int r0 = r7.length()
            if (r0 <= r3) goto L30
        L26:
            moxy.MvpView r0 = r5.getViewState()
            com.swiftsoft.anixartd.presentation.auth.restore.RestoreView r0 = (com.swiftsoft.anixartd.presentation.auth.restore.RestoreView) r0
            r0.mo14205Z()
            r1 = 0
        L30:
            int r0 = r7.length()
            if (r0 < r4) goto L4d
            int r0 = r7.length()
            if (r0 <= r3) goto L3d
            goto L4d
        L3d:
            boolean r8 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r8)
            if (r8 != 0) goto L57
            moxy.MvpView r8 = r5.getViewState()
            com.swiftsoft.anixartd.presentation.auth.restore.RestoreView r8 = (com.swiftsoft.anixartd.presentation.auth.restore.RestoreView) r8
            r8.mo14204S()
            goto L56
        L4d:
            moxy.MvpView r8 = r5.getViewState()
            com.swiftsoft.anixartd.presentation.auth.restore.RestoreView r8 = (com.swiftsoft.anixartd.presentation.auth.restore.RestoreView) r8
            r8.mo14202G0()
        L56:
            r1 = 0
        L57:
            if (r1 == 0) goto Laa
            com.swiftsoft.anixartd.repository.AuthRepository r8 = r5.f25837a
            java.util.Objects.requireNonNull(r8)
            com.swiftsoft.anixartd.network.api.AuthApi r8 = r8.f27325a
            io.reactivex.Observable r8 = r8.restore(r6)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.f62901c
            io.reactivex.Observable r8 = r8.m31372n(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.m31390a()
            io.reactivex.Observable r8 = r8.m31369k(r0)
            com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$1 r0 = new com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$1
            r0.<init>()
            com.swiftsoft.anixartd.presentation.auth.c r1 = new com.swiftsoft.anixartd.presentation.auth.c
            r3 = 8
            r1.<init>(r0, r3)
            io.reactivex.Observable r8 = r8.m31367i(r1)
            com.swiftsoft.anixartd.presentation.auth.restore.a r0 = new com.swiftsoft.anixartd.presentation.auth.restore.a
            r0.<init>(r5, r2)
            io.reactivex.Observable r8 = r8.m31365g(r0)
            com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$3 r0 = new com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$3
            r0.<init>()
            com.swiftsoft.anixartd.presentation.auth.c r6 = new com.swiftsoft.anixartd.presentation.auth.c
            r7 = 9
            r6.<init>(r0, r7)
            com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$4 r7 = new com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter$onRestore$4
            r7.<init>()
            com.swiftsoft.anixartd.presentation.auth.c r0 = new com.swiftsoft.anixartd.presentation.auth.c
            r1 = 10
            r0.<init>(r7, r1)
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.f59621b
            io.reactivex.functions.Consumer<java.lang.Object> r1 = io.reactivex.internal.functions.Functions.f59622c
            r8.m31370l(r6, r0, r7, r1)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter.m14199a(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
