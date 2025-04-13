package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2560a implements Action {

    /* renamed from: b */
    public final /* synthetic */ int f26176b;

    /* renamed from: c */
    public final /* synthetic */ CollectionCommentsRepliesPresenter f26177c;

    public /* synthetic */ C2560a(CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter, int i2) {
        this.f26176b = i2;
        this.f26177c = collectionCommentsRepliesPresenter;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f26176b) {
            case 0:
                CollectionCommentsRepliesPresenter this$0 = this.f26177c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.getViewState().mo14469D();
                break;
            default:
                CollectionCommentsRepliesPresenter this$02 = this.f26177c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.getViewState().mo14489p();
                break;
        }
    }
}
