package com.airbnb.epoxy.preload;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: PreloaderExtensions.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0005\"\b\b\u0002\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\n¢\u0006\u0002\b\r"}, m31884d2 = {"<anonymous>", "", "T", "Lcom/airbnb/epoxy/EpoxyModel;", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "context", "Landroid/content/Context;", "err", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "invoke"}, m31885k = 3, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
final class PreloaderExtensionsKt$addEpoxyPreloader$1 extends Lambda implements Function2<Context, RuntimeException, Unit> {
    static {
        new PreloaderExtensionsKt$addEpoxyPreloader$1();
    }

    public PreloaderExtensionsKt$addEpoxyPreloader$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public Unit invoke(Context context, RuntimeException runtimeException) {
        Context context2 = context;
        RuntimeException err = runtimeException;
        Intrinsics.m32179h(context2, "context");
        Intrinsics.m32179h(err, "err");
        if ((context2.getApplicationInfo().flags & 2) != 0) {
            return Unit.f63088a;
        }
        throw err;
    }
}
