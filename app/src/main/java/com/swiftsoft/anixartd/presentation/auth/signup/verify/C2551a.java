package com.swiftsoft.anixartd.presentation.auth.signup.verify;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.auth.signup.verify.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2551a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f25914b;

    /* renamed from: c */
    public final /* synthetic */ VerifyPresenter f25915c;

    public /* synthetic */ C2551a(VerifyPresenter verifyPresenter, int i2) {
        this.f25914b = i2;
        this.f25915c = verifyPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f25914b) {
            case 0:
                VerifyPresenter this$0 = this.f25915c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14278j();
                break;
            default:
                VerifyPresenter this$02 = this.f25915c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14278j();
                break;
        }
    }
}
