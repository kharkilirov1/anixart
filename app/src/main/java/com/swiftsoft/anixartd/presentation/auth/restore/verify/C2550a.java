package com.swiftsoft.anixartd.presentation.auth.restore.verify;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.auth.restore.verify.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2550a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f25863b;

    /* renamed from: c */
    public final /* synthetic */ RestoreVerifyPresenter f25864c;

    public /* synthetic */ C2550a(RestoreVerifyPresenter restoreVerifyPresenter, int i2) {
        this.f25863b = i2;
        this.f25864c = restoreVerifyPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f25863b) {
            case 0:
                RestoreVerifyPresenter this$0 = this.f25864c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14219j();
                break;
            default:
                RestoreVerifyPresenter this$02 = this.f25864c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14219j();
                break;
        }
    }
}
