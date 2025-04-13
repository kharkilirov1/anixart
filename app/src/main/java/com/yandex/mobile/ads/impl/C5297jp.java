package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.u10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jp */
/* loaded from: classes3.dex */
public final class C5297jp implements DivImageLoader {

    /* renamed from: a */
    @NotNull
    private final u10 f51680a;

    /* renamed from: b */
    @NotNull
    private final f90 f51681b;

    /* renamed from: com.yandex.mobile.ads.impl.jp$a */
    public static final class a implements u10.InterfaceC5836d {

        /* renamed from: a */
        public final /* synthetic */ ImageView f51682a;

        public a(ImageView imageView) {
            this.f51682a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@Nullable qh1 qh1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.u10.InterfaceC5836d
        /* renamed from: a */
        public final void mo25927a(@Nullable u10.C5835c c5835c, boolean z) {
            Bitmap m28834b = c5835c.m28834b();
            if (m28834b != null) {
                this.f51682a.setImageBitmap(m28834b);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp$b */
    public static final class b implements u10.InterfaceC5836d {

        /* renamed from: a */
        public final /* synthetic */ DivImageDownloadCallback f51683a;

        /* renamed from: b */
        public final /* synthetic */ String f51684b;

        public b(String str, DivImageDownloadCallback divImageDownloadCallback) {
            this.f51683a = divImageDownloadCallback;
            this.f51684b = str;
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@Nullable qh1 qh1Var) {
            this.f51683a.mo16590a();
        }

        @Override // com.yandex.mobile.ads.impl.u10.InterfaceC5836d
        /* renamed from: a */
        public final void mo25927a(@Nullable u10.C5835c c5835c, boolean z) {
            Bitmap m28834b = c5835c.m28834b();
            if (m28834b != null) {
                this.f51683a.mo16591b(new CachedBitmap(m28834b, Uri.parse(this.f51684b), z ? BitmapSource.MEMORY : BitmapSource.NETWORK));
            }
        }
    }

    public C5297jp(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        u10 m29240a = vm0.m29239c(context).m29240a();
        Intrinsics.m32178g(m29240a, "getInstance(context).imageLoader");
        this.f51680a = m29240a;
        this.f51681b = new f90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.u10$c] */
    /* renamed from: a */
    public static final void m25920a(Ref.ObjectRef imageContainer, C5297jp this$0, String imageUrl, ImageView imageView) {
        Intrinsics.m32179h(imageContainer, "$imageContainer");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(imageUrl, "$imageUrl");
        Intrinsics.m32179h(imageView, "$imageView");
        imageContainer.f63351b = this$0.f51680a.m28818a(imageUrl, new a(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final void m25922b(Ref.ObjectRef imageContainer) {
        Intrinsics.m32179h(imageContainer, "$imageContainer");
        u10.C5835c c5835c = (u10.C5835c) imageContainer.f63351b;
        if (c5835c != null) {
            c5835c.m28833a();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public final LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(callback, "callback");
        return m25918a(imageUrl, callback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public final LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(callback, "callback");
        return m25918a(imageUrl, callback);
    }

    @NotNull
    public final LoadReference loadImage(@NotNull String imageUrl, @NotNull ImageView imageView) {
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(imageView, "imageView");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f51681b.m24373a(new lq1(objectRef, this, imageUrl, imageView, 2));
        return new hp1(objectRef, 1);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NonNull
    public LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i2) {
        return loadImageBytes(str, divImageDownloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m25919a(Ref.ObjectRef imageContainer) {
        Intrinsics.m32179h(imageContainer, "$imageContainer");
        u10.C5835c c5835c = (u10.C5835c) imageContainer.f63351b;
        if (c5835c != null) {
            c5835c.m28833a();
        }
    }

    /* renamed from: a */
    private final LoadReference m25918a(String str, DivImageDownloadCallback divImageDownloadCallback) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f51681b.m24373a(new lq1(objectRef, this, str, divImageDownloadCallback, 1));
        return new hp1(objectRef, 0);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NonNull
    public LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i2) {
        return loadImage(str, divImageDownloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.u10$c] */
    /* renamed from: a */
    public static final void m25921a(Ref.ObjectRef imageContainer, C5297jp this$0, String imageUrl, DivImageDownloadCallback callback) {
        Intrinsics.m32179h(imageContainer, "$imageContainer");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(imageUrl, "$imageUrl");
        Intrinsics.m32179h(callback, "$callback");
        imageContainer.f63351b = this$0.f51680a.m28818a(imageUrl, new b(imageUrl, callback));
    }
}
