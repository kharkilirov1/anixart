package com.swiftsoft.anixartd.presentation.main.release;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.release.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2613a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27019b;

    /* renamed from: c */
    public final /* synthetic */ ReleasePresenter f27020c;

    public /* synthetic */ C2613a(ReleasePresenter releasePresenter, int i2) {
        this.f27019b = i2;
        this.f27020c = releasePresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27019b) {
            case 0:
                ReleasePresenter this$0 = this.f27020c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo15059j();
                break;
            case 1:
                ReleasePresenter this$02 = this.f27020c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo15048Z1();
                break;
            case 2:
                ReleasePresenter this$03 = this.f27020c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo15049a();
                this$03.getViewState().mo15054e();
                break;
            case 3:
                ReleasePresenter this$04 = this.f27020c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.getViewState().mo15075z1();
                break;
            default:
                ReleasePresenter this$05 = this.f27020c;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.getViewState().mo15036D();
                break;
        }
    }
}
