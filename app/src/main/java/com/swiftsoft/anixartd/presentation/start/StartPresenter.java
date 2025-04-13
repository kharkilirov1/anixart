package com.swiftsoft.anixartd.presentation.start;

import com.swiftsoft.anixartd.repository.AuthRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: StartPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/start/StartPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/start/StartView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class StartPresenter extends MvpPresenter<StartView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f27323a;

    @Inject
    public StartPresenter(@NotNull AuthRepository authRepository) {
        Intrinsics.m32179h(authRepository, "authRepository");
        this.f27323a = authRepository;
    }
}
