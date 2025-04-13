package com.swiftsoft.anixartd.presentation.auth;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.auth.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2547b implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f25833b;

    /* renamed from: c */
    public final /* synthetic */ AuthPresenter f25834c;

    public /* synthetic */ C2547b(AuthPresenter authPresenter, int i2) {
        this.f25833b = i2;
        this.f25834c = authPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f25833b) {
            case 0:
                AuthPresenter this$0 = this.f25834c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14194j();
                break;
            default:
                AuthPresenter this$02 = this.f25834c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14194j();
                break;
        }
    }
}
