package com.swiftsoft.anixartd.presentation.main.preference;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.preference.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2597a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26566b;

    /* renamed from: c */
    public final /* synthetic */ ProfileReleaseNotificationPreferencesPresenter f26567c;

    public /* synthetic */ C2597a(ProfileReleaseNotificationPreferencesPresenter profileReleaseNotificationPreferencesPresenter, int i2) {
        this.f26566b = i2;
        this.f26567c = profileReleaseNotificationPreferencesPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26566b) {
            case 0:
                ProfileReleaseNotificationPreferencesPresenter this$0 = this.f26567c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14761a();
                this$0.getViewState().mo14765e();
                break;
            default:
                ProfileReleaseNotificationPreferencesPresenter this$02 = this.f26567c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14769j();
                break;
        }
    }
}
