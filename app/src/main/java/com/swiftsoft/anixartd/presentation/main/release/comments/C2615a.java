package com.swiftsoft.anixartd.presentation.main.release.comments;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.release.comments.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2615a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27077b;

    /* renamed from: c */
    public final /* synthetic */ ReleaseCommentsPresenter f27078c;

    public /* synthetic */ C2615a(ReleaseCommentsPresenter releaseCommentsPresenter, int i2) {
        this.f27077b = i2;
        this.f27078c = releaseCommentsPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27077b) {
            case 0:
                ReleaseCommentsPresenter this$0 = this.f27078c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo15096D();
                break;
            default:
                ReleaseCommentsPresenter this$02 = this.f27078c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo15114p();
                break;
        }
    }
}
