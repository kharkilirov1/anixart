package com.swiftsoft.anixartd.presentation.main.report;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.report.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2620a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27191b;

    /* renamed from: c */
    public final /* synthetic */ ReportPresenter f27192c;

    public /* synthetic */ C2620a(ReportPresenter reportPresenter, int i2) {
        this.f27191b = i2;
        this.f27192c = reportPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27191b) {
            case 0:
                ReportPresenter this$0 = this.f27192c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo15201p();
                break;
            default:
                ReportPresenter this$02 = this.f27192c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo15195a();
                break;
        }
    }
}
