package com.swiftsoft.anixartd.presentation.main.profile;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.profile.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2602d implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26726b;

    /* renamed from: c */
    public final /* synthetic */ ProfileSocialPresenter f26727c;

    public /* synthetic */ C2602d(ProfileSocialPresenter profileSocialPresenter, int i2) {
        this.f26726b = i2;
        this.f26727c = profileSocialPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26726b) {
            case 0:
                ProfileSocialPresenter this$0 = this.f26727c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14836a();
                break;
            default:
                ProfileSocialPresenter this$02 = this.f26727c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14836a();
                break;
        }
    }
}
