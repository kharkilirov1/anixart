package com.swiftsoft.anixartd.presentation.main.search;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.search.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2621a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27241b;

    /* renamed from: c */
    public final /* synthetic */ SearchPresenter f27242c;

    public /* synthetic */ C2621a(SearchPresenter searchPresenter, int i2) {
        this.f27241b = i2;
        this.f27242c = searchPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27241b) {
            case 0:
                SearchPresenter this$0 = this.f27242c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo15224a();
                this$0.getViewState().mo15228e();
                break;
            case 1:
                SearchPresenter this$02 = this.f27242c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo15224a();
                this$02.getViewState().mo15228e();
                break;
            default:
                SearchPresenter this$03 = this.f27242c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo15224a();
                this$03.getViewState().mo15228e();
                break;
        }
    }
}
