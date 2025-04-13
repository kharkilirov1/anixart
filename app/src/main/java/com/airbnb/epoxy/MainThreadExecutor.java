package com.airbnb.epoxy;

/* loaded from: classes.dex */
class MainThreadExecutor extends HandlerExecutor {

    /* renamed from: c */
    public static final MainThreadExecutor f7001c = new MainThreadExecutor(false);

    /* renamed from: d */
    public static final MainThreadExecutor f7002d = new MainThreadExecutor(true);

    public MainThreadExecutor(boolean z) {
        super(z ? EpoxyAsyncUtil.f6901b : EpoxyAsyncUtil.f6900a);
    }
}
