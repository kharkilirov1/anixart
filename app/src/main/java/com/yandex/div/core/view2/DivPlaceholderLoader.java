package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.widget.LoadableImageView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPlaceholderLoader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivPlaceholderLoader {

    /* renamed from: a */
    @NotNull
    public final Div2ImageStubProvider f31654a;

    /* renamed from: b */
    @NotNull
    public final ExecutorService f31655b;

    @Inject
    public DivPlaceholderLoader(@NotNull Div2ImageStubProvider imageStubProvider, @NotNull ExecutorService executorService) {
        Intrinsics.m32179h(imageStubProvider, "imageStubProvider");
        Intrinsics.m32179h(executorService, "executorService");
        this.f31654a = imageStubProvider;
        this.f31655b = executorService;
    }

    @MainThread
    /* renamed from: a */
    public void m16861a(@NotNull final LoadableImage loadableImage, @NotNull final ErrorCollector errorCollector, @Nullable String str, final int i2, boolean z, @NotNull final Function1<? super Drawable, Unit> function1, @NotNull final Function1<? super Bitmap, Unit> function12) {
        Intrinsics.m32179h(errorCollector, "errorCollector");
        Object obj = null;
        if (str != null) {
            final Function1<Bitmap, Unit> function13 = new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        ErrorCollector.this.m17113b(new Throwable("Preview doesn't contain base64 image"));
                        function1.invoke(this.f31654a.mo16565a(i2));
                    } else {
                        function12.invoke(bitmap2);
                    }
                    return Unit.f63088a;
                }
            };
            Future<?> loadingTask = loadableImage.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Bitmap bitmap) {
                    function13.invoke(bitmap);
                    loadableImage.mo17108f();
                    return Unit.f63088a;
                }
            });
            if (z) {
                decodeBase64ImageTask.run();
            } else {
                obj = this.f31655b.submit(decodeBase64ImageTask);
            }
            if (obj != null) {
                ((LoadableImageView) loadableImage).setTag(C2507R.id.bitmap_load_references_tag, obj);
            }
            obj = Unit.f63088a;
        }
        if (obj == null) {
            function1.invoke(this.f31654a.mo16565a(i2));
        }
    }
}
