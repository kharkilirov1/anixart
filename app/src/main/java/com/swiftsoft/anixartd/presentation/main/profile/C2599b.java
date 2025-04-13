package com.swiftsoft.anixartd.presentation.main.profile;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.profile.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2599b implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26693b;

    /* renamed from: c */
    public final /* synthetic */ ProfilePreferencePresenter f26694c;

    public /* synthetic */ C2599b(ProfilePreferencePresenter profilePreferencePresenter, int i2) {
        this.f26693b = i2;
        this.f26694c = profilePreferencePresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26693b) {
            case 0:
                ProfilePreferencePresenter this$0 = this.f26694c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14814j();
                break;
            case 1:
                ProfilePreferencePresenter this$02 = this.f26694c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14814j();
                break;
            case 2:
                ProfilePreferencePresenter this$03 = this.f26694c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo14809a();
                break;
            default:
                ProfilePreferencePresenter this$04 = this.f26694c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.getViewState().mo14814j();
                break;
        }
    }
}
