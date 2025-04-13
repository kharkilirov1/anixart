package com.swiftsoft.anixartd.presentation.main;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2555b implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26022b;

    /* renamed from: c */
    public final /* synthetic */ MainPresenter f26023c;

    public /* synthetic */ C2555b(MainPresenter mainPresenter, int i2) {
        this.f26022b = i2;
        this.f26023c = mainPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26022b) {
            case 0:
                MainPresenter this$0 = this.f26023c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14346j();
                break;
            case 1:
                MainPresenter this$02 = this.f26023c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14346j();
                break;
            case 2:
                MainPresenter this$03 = this.f26023c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo14346j();
                break;
            default:
                MainPresenter this$04 = this.f26023c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.getViewState().mo14346j();
                break;
        }
    }
}
