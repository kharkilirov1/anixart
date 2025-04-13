package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivImageScale;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.FilesKt;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivGifImageBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivGifImage;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Companion", "LoadDrawableOnPostPTask", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivGifImageBinder implements DivViewBinder<DivGifImage, DivGifImageView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32066a;

    /* renamed from: b */
    @NotNull
    public final DivImageLoader f32067b;

    /* renamed from: c */
    @NotNull
    public final DivPlaceholderLoader f32068c;

    /* renamed from: d */
    @NotNull
    public final ErrorCollectors f32069d;

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$Companion;", "", "", "TAG", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$LoadDrawableOnPostPTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroid/graphics/drawable/Drawable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    @RequiresApi
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        @NotNull
        public final WeakReference<DivGifImageView> f32070a;

        /* renamed from: b */
        @NotNull
        public final CachedBitmap f32071b;

        public LoadDrawableOnPostPTask(@NotNull WeakReference<DivGifImageView> weakReference, @NotNull CachedBitmap cachedBitmap) {
            Intrinsics.m32179h(cachedBitmap, "cachedBitmap");
            this.f32070a = weakReference;
            this.f32071b = cachedBitmap;
        }

        /* renamed from: a */
        public final Drawable m16997a() throws IOException, IllegalStateException {
            byte[] bArr = this.f32071b.f31290c;
            if (bArr == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.f32070a.get();
            Context context = divGifImageView == null ? null : divGifImageView.getContext();
            if (context == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File tempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                Intrinsics.m32178g(tempFile, "tempFile");
                FilesKt.m32142c(tempFile, bArr);
                ImageDecoder.Source createSource = ImageDecoder.createSource(tempFile);
                Intrinsics.m32178g(createSource, "createSource(tempFile)");
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                Intrinsics.m32178g(decodeDrawable, "{\n                tempFi…ble(source)\n            }");
                return decodeDrawable;
            } finally {
                tempFile.delete();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x001a  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.drawable.Drawable doInBackground(java.lang.Void[] r3) {
            /*
                r2 = this;
                java.lang.Void[] r3 = (java.lang.Void[]) r3
                java.lang.String r0 = "params"
                kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
                android.graphics.drawable.Drawable r3 = r2.m16997a()     // Catch: java.lang.IllegalStateException -> Lc java.io.IOException -> Lf
                goto L3a
            Lc:
                com.yandex.div.internal.KLog r3 = com.yandex.div.internal.KLog.f33717a
                goto L11
            Lf:
                com.yandex.div.internal.KLog r3 = com.yandex.div.internal.KLog.f33717a
            L11:
                com.yandex.div.core.images.CachedBitmap r3 = r2.f32071b
                android.net.Uri r3 = r3.f31289b
                r0 = 0
                if (r3 != 0) goto L1a
                r3 = r0
                goto L1e
            L1a:
                java.lang.String r3 = r3.getPath()
            L1e:
                if (r3 == 0) goto L2d
                java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L2a
                r1.<init>(r3)     // Catch: java.io.IOException -> L2a
                android.graphics.ImageDecoder$Source r3 = android.graphics.ImageDecoder.createSource(r1)     // Catch: java.io.IOException -> L2a
                goto L30
            L2a:
                com.yandex.div.internal.KLog r3 = com.yandex.div.internal.KLog.f33717a
                goto L2f
            L2d:
                com.yandex.div.internal.KLog r3 = com.yandex.div.internal.KLog.f33717a
            L2f:
                r3 = r0
            L30:
                if (r3 == 0) goto L39
                android.graphics.drawable.Drawable r3 = android.graphics.ImageDecoder.decodeDrawable(r3)     // Catch: java.io.IOException -> L37
                goto L3a
            L37:
                com.yandex.div.internal.KLog r3 = com.yandex.div.internal.KLog.f33717a
            L39:
                r3 = r0
            L3a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivGifImageBinder.LoadDrawableOnPostPTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            super.onPostExecute(drawable2);
            if (drawable2 == null || !(drawable2 instanceof AnimatedImageDrawable)) {
                DivGifImageView divGifImageView = this.f32070a.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(this.f32071b.f31288a);
                }
            } else {
                DivGifImageView divGifImageView2 = this.f32070a.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(drawable2);
                }
            }
            DivGifImageView divGifImageView3 = this.f32070a.get();
            if (divGifImageView3 == null) {
                return;
            }
            divGifImageView3.m17179i();
        }
    }

    @Inject
    public DivGifImageBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivImageLoader imageLoader, @NotNull DivPlaceholderLoader placeholderLoader, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(imageLoader, "imageLoader");
        Intrinsics.m32179h(placeholderLoader, "placeholderLoader");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32066a = baseBinder;
        this.f32067b = imageLoader;
        this.f32068c = placeholderLoader;
        this.f32069d = errorCollectors;
    }

    /* renamed from: a */
    public void m16996a(@NotNull final DivGifImageView view, @NotNull final DivGifImage div, @NotNull final Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivGifImage div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ErrorCollector m17115a = this.f32069d.m17115a(divView.getDataTag(), divView.getDivData());
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32066a.m16988i(view, div2, divView);
        }
        this.f32066a.m16984e(view, div, div2, divView);
        BaseDivViewExtensionsKt.m16941c(view, divView, div.f36211b, div.f36213d, div.f36230u, div.f36224o, div.f36212c);
        BaseDivViewExtensionsKt.m16921K(view, expressionResolver, div.f36217h);
        C6855a.m34405a(view, div.f36198B.mo17538f(expressionResolver, new Function1<DivImageScale, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bindView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivImageScale divImageScale) {
                DivImageScale scale = divImageScale;
                Intrinsics.m32179h(scale, "scale");
                DivGifImageView.this.setImageScale(BaseDivViewExtensionsKt.m16930T(scale));
                return Unit.f63088a;
            }
        }));
        final Expression<DivAlignmentHorizontal> expression = div.f36221l;
        final Expression<DivAlignmentVertical> expression2 = div.f36222m;
        view.setGravity(BaseDivViewExtensionsKt.m16964x(expression.mo17535b(expressionResolver), expression2.mo17535b(expressionResolver)));
        Function1<? super DivAlignmentHorizontal, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivGifImageBinder divGifImageBinder = DivGifImageBinder.this;
                DivGifImageView divGifImageView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Expression<DivAlignmentHorizontal> expression3 = expression;
                Expression<DivAlignmentVertical> expression4 = expression2;
                Objects.requireNonNull(divGifImageBinder);
                divGifImageView.setGravity(BaseDivViewExtensionsKt.m16964x(expression3.mo17535b(expressionResolver2), expression4.mo17535b(expressionResolver2)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, expression.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, expression2.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f36227r.mo17538f(expressionResolver, new Function1<Uri, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Uri uri) {
                Uri it = uri;
                Intrinsics.m32179h(it, "it");
                final DivGifImageBinder divGifImageBinder = DivGifImageBinder.this;
                final DivGifImageView divGifImageView = view;
                Div2View div2View = divView;
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivGifImage divGifImage = div;
                ErrorCollector errorCollector = m17115a;
                Objects.requireNonNull(divGifImageBinder);
                Uri mo17535b = divGifImage.f36227r.mo17535b(expressionResolver2);
                if (!Intrinsics.m32174c(mo17535b, divGifImageView.getGifUrl())) {
                    divGifImageView.mo17100l();
                    LoadReference loadReference = divGifImageView.getLoadReference();
                    if (loadReference != null) {
                        loadReference.cancel();
                    }
                    DivPlaceholderLoader divPlaceholderLoader = divGifImageBinder.f32068c;
                    Expression<String> expression3 = divGifImage.f36235z;
                    divPlaceholderLoader.m16861a(divGifImageView, errorCollector, expression3 == null ? null : expression3.mo17535b(expressionResolver2), divGifImage.f36233x.mo17535b(expressionResolver2).intValue(), false, new Function1<Drawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Drawable drawable) {
                            Drawable drawable2 = drawable;
                            if (!DivGifImageView.this.m17180j() && !DivGifImageView.this.m17181k()) {
                                DivGifImageView.this.setPlaceholder(drawable2);
                            }
                            return Unit.f63088a;
                        }
                    }, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (!DivGifImageView.this.m17180j()) {
                                DivGifImageView.this.setPreview(bitmap2);
                                DivGifImageView.this.setTag(C2507R.id.image_loaded_flag, Boolean.FALSE);
                            }
                            return Unit.f63088a;
                        }
                    });
                    divGifImageView.setGifUrl$div_release(mo17535b);
                    LoadReference loadImageBytes = divGifImageBinder.f32067b.loadImageBytes(mo17535b.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
                        @Override // com.yandex.div.core.images.DivImageDownloadCallback
                        /* renamed from: a */
                        public void mo16590a() {
                            divGifImageView.setGifUrl$div_release(null);
                        }

                        @Override // com.yandex.div.core.images.DivImageDownloadCallback
                        /* renamed from: b */
                        public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
                            if (Build.VERSION.SDK_INT < 28) {
                                divGifImageView.setImage(cachedBitmap.f31288a);
                                divGifImageView.m17179i();
                            } else {
                                DivGifImageBinder divGifImageBinder2 = divGifImageBinder;
                                DivGifImageView divGifImageView2 = divGifImageView;
                                Objects.requireNonNull(divGifImageBinder2);
                                new DivGifImageBinder.LoadDrawableOnPostPTask(new WeakReference(divGifImageView2), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                            }
                        }
                    });
                    Intrinsics.m32178g(loadImageBytes, "private fun DivGifImageV…ference = reference\n    }");
                    div2View.m16811l(loadImageBytes, divGifImageView);
                    divGifImageView.setLoadReference$div_release(loadImageBytes);
                }
                return Unit.f63088a;
            }
        }));
    }
}
