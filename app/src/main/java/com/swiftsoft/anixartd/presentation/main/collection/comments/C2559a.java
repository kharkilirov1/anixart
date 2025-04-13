package com.swiftsoft.anixartd.presentation.main.collection.comments;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.collection.comments.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2559a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26132b;

    /* renamed from: c */
    public final /* synthetic */ CollectionCommentsPresenter f26133c;

    public /* synthetic */ C2559a(CollectionCommentsPresenter collectionCommentsPresenter, int i2) {
        this.f26132b = i2;
        this.f26133c = collectionCommentsPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26132b) {
            case 0:
                CollectionCommentsPresenter this$0 = this.f26133c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14433D();
                break;
            default:
                CollectionCommentsPresenter this$02 = this.f26133c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14452p();
                break;
        }
    }
}
