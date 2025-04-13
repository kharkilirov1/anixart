package com.airbnb.epoxy;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public abstract class AsyncEpoxyController extends EpoxyController {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z) {
        if (!z) {
            return EpoxyAsyncUtil.f6900a;
        }
        if (EpoxyAsyncUtil.f6902c == null) {
            HandlerThread handlerThread = new HandlerThread("epoxy");
            handlerThread.start();
            EpoxyAsyncUtil.f6902c = EpoxyAsyncUtil.m4512a(handlerThread.getLooper(), true);
        }
        return EpoxyAsyncUtil.f6902c;
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
