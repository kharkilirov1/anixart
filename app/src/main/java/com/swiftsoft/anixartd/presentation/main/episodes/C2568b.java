package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter;
import com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter;
import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpPresenter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.episodes.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2568b implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26341b;

    /* renamed from: c */
    public final /* synthetic */ boolean f26342c;

    /* renamed from: d */
    public final /* synthetic */ Object f26343d;

    public /* synthetic */ C2568b(boolean z, MvpPresenter mvpPresenter, int i2) {
        this.f26341b = i2;
        this.f26342c = z;
        this.f26343d = mvpPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26341b) {
            case 0:
                boolean z = this.f26342c;
                EpisodesPresenter this$0 = (EpisodesPresenter) this.f26343d;
                Intrinsics.m32179h(this$0, "this$0");
                if (z) {
                    this$0.getViewState().mo14604a();
                    break;
                }
                break;
            case 1:
                boolean z2 = this.f26342c;
                ReleaseVideoAppealPresenter this$02 = (ReleaseVideoAppealPresenter) this.f26343d;
                Intrinsics.m32179h(this$02, "this$0");
                if (z2) {
                    this$02.getViewState().mo15175a();
                    break;
                }
                break;
            default:
                boolean z3 = this.f26342c;
                ReleaseStreamingPlatformPresenter this$03 = (ReleaseStreamingPlatformPresenter) this.f26343d;
                Intrinsics.m32179h(this$03, "this$0");
                if (z3) {
                    this$03.getViewState().mo15237a();
                    break;
                }
                break;
        }
    }
}
