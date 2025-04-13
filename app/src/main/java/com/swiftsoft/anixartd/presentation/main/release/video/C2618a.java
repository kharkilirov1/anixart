package com.swiftsoft.anixartd.presentation.main.release.video;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.release.video.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2618a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27147b;

    /* renamed from: c */
    public final /* synthetic */ boolean f27148c;

    /* renamed from: d */
    public final /* synthetic */ ReleaseVideosPresenter f27149d;

    /* renamed from: e */
    public final /* synthetic */ boolean f27150e;

    public /* synthetic */ C2618a(boolean z, ReleaseVideosPresenter releaseVideosPresenter, boolean z2, int i2) {
        this.f27147b = i2;
        this.f27148c = z;
        this.f27149d = releaseVideosPresenter;
        this.f27150e = z2;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27147b) {
            case 0:
                boolean z = this.f27148c;
                ReleaseVideosPresenter this$0 = this.f27149d;
                boolean z2 = this.f27150e;
                Intrinsics.m32179h(this$0, "this$0");
                if (z) {
                    this$0.getViewState().mo15163a();
                }
                if (z2) {
                    this$0.getViewState().mo15167e();
                    break;
                }
                break;
            default:
                boolean z3 = this.f27148c;
                ReleaseVideosPresenter this$02 = this.f27149d;
                boolean z4 = this.f27150e;
                Intrinsics.m32179h(this$02, "this$0");
                if (z3) {
                    this$02.getViewState().mo15163a();
                }
                if (z4) {
                    this$02.getViewState().mo15167e();
                    break;
                }
                break;
        }
    }
}
