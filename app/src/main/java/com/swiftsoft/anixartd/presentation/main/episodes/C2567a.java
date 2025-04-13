package com.swiftsoft.anixartd.presentation.main.episodes;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.episodes.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2567a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26339b;

    /* renamed from: c */
    public final /* synthetic */ EpisodesPresenter f26340c;

    public /* synthetic */ C2567a(EpisodesPresenter episodesPresenter, int i2) {
        this.f26339b = i2;
        this.f26340c = episodesPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26339b) {
            case 0:
                EpisodesPresenter this$0 = this.f26340c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14608d3();
                break;
            case 1:
                EpisodesPresenter this$02 = this.f26340c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14608d3();
                break;
            case 2:
                EpisodesPresenter this$03 = this.f26340c;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.getViewState().mo14604a();
                break;
            default:
                EpisodesPresenter this$04 = this.f26340c;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.getViewState().mo14604a();
                break;
        }
    }
}
