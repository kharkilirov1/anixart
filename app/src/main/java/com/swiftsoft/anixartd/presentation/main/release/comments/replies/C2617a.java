package com.swiftsoft.anixartd.presentation.main.release.comments.replies;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.release.comments.replies.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2617a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f27123b;

    /* renamed from: c */
    public final /* synthetic */ ReleaseCommentsRepliesPresenter f27124c;

    public /* synthetic */ C2617a(ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter, int i2) {
        this.f27123b = i2;
        this.f27124c = releaseCommentsRepliesPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f27123b) {
            case 0:
                ReleaseCommentsRepliesPresenter this$0 = this.f27124c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo15129D();
                break;
            default:
                ReleaseCommentsRepliesPresenter this$02 = this.f27124c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo15149p();
                break;
        }
    }
}
