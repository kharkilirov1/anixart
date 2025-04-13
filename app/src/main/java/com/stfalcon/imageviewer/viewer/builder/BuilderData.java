package com.stfalcon.imageviewer.viewer.builder;

import android.widget.ImageView;
import com.stfalcon.imageviewer.loader.ImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BuilderData.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/builder/BuilderData;", "T", "", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class BuilderData<T> {

    /* renamed from: a */
    public int f25266a;

    /* renamed from: b */
    public int f25267b;

    /* renamed from: c */
    @NotNull
    public int[] f25268c;

    /* renamed from: d */
    public boolean f25269d;

    /* renamed from: e */
    public boolean f25270e;

    /* renamed from: f */
    public boolean f25271f;

    /* renamed from: g */
    @Nullable
    public ImageView f25272g;

    /* renamed from: h */
    @NotNull
    public final List<T> f25273h;

    /* renamed from: i */
    @NotNull
    public final ImageLoader<T> f25274i;

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderData(@NotNull List<? extends T> images, @NotNull ImageLoader<T> imageLoader) {
        Intrinsics.m32180i(images, "images");
        Intrinsics.m32180i(imageLoader, "imageLoader");
        this.f25273h = images;
        this.f25274i = imageLoader;
        this.f25266a = -16777216;
        this.f25268c = new int[4];
        this.f25269d = true;
        this.f25270e = true;
        this.f25271f = true;
    }
}
