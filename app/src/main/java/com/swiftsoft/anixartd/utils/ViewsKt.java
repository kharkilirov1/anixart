package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.CustomClickListener;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"app_release"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ViewsKt {
    /* renamed from: a */
    public static final void m16368a(@NotNull AppCompatImageView appCompatImageView, @Nullable String str) {
        int applyDimension = (int) TypedValue.applyDimension(1, 6.0f, appCompatImageView.getResources().getDisplayMetrics());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.mo5276z(new CenterCrop(), new RoundedCorners(applyDimension));
        ((GlideRequest) GlideApp.m16332a(appCompatImageView).m16339t(new Common().m16298c(str, App.f25340b.m14044b().m14082y())).m16336Q().mo5266p(C2507R.drawable.placeholder_circle).m16335P(requestOptions).mo5255c()).m4887K(appCompatImageView);
    }

    @ColorInt
    /* renamed from: b */
    public static final int m16369b(@NotNull Context context, @AttrRes int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        int i3 = typedValue.resourceId;
        return i3 != 0 ? ContextCompat.m1670c(context, i3) : typedValue.data;
    }

    @ColorInt
    /* renamed from: c */
    public static final int m16370c(@NotNull View view, @AttrRes int i2) {
        Context context = view.getContext();
        Intrinsics.m32178g(context, "context");
        return m16369b(context, i2);
    }

    @ColorInt
    /* renamed from: d */
    public static final int m16371d(@NotNull Fragment fragment, @AttrRes int i2) {
        View view = fragment.getView();
        if (view != null) {
            return m16370c(view, i2);
        }
        throw new Exception("invalid state");
    }

    /* renamed from: e */
    public static final void m16372e(@NotNull View view) {
        Intrinsics.m32179h(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: f */
    public static void m16373f(View view, boolean z, boolean z2, Function1 function1, int i2) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        view.setVisibility(z ? z2 ? 4 : 8 : 0);
    }

    /* renamed from: g */
    public static final void m16374g(@NotNull ImageView imageView, @Nullable File file, int i2) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.mo5276z(new CenterCrop());
        RequestBuilder mo4898m = GlideApp.m16332a(imageView).mo4898m();
        GlideRequest glideRequest = (GlideRequest) mo4898m;
        glideRequest.f7939G = file;
        glideRequest.f7941I = true;
        GlideRequest m16335P = ((GlideRequest) mo4898m).m16336Q().mo5266p(i2).m16335P(requestOptions);
        m16335P.f7938F = DrawableTransitionOptions.m5197b();
        m16335P.m4887K(imageView);
    }

    /* renamed from: h */
    public static final void m16375h(@NotNull ImageView imageView, @Nullable String str) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.mo5276z(new CenterCrop());
        GlideRequest<Drawable> m16335P = GlideApp.m16332a(imageView).m16339t(new Common().m16298c(str, App.f25340b.m14044b().m14082y())).m16335P(requestOptions);
        m16335P.f7938F = DrawableTransitionOptions.m5197b();
        m16335P.m4887K(imageView);
    }

    /* renamed from: i */
    public static final void m16376i(@NotNull ImageView imageView, @Nullable String str, int i2) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.mo5276z(new CenterCrop());
        GlideRequest<Drawable> m16335P = GlideApp.m16332a(imageView).m16339t(new Common().m16298c(str, App.f25340b.m14044b().m14082y())).m16336Q().mo5266p(i2).m16335P(requestOptions);
        m16335P.f7938F = DrawableTransitionOptions.m5197b();
        m16335P.m4887K(imageView);
    }

    /* renamed from: j */
    public static final void m16377j(@NotNull View view, @NotNull final Function1<? super View, Unit> onClick) {
        Intrinsics.m32179h(onClick, "onClick");
        view.setOnClickListener(new CustomClickListener() { // from class: com.swiftsoft.anixartd.utils.ViewsKt$setCustomOnClickListener$1
            @Override // com.swiftsoft.anixartd.p015ui.CustomClickListener
            /* renamed from: a */
            public void mo15317a(@NotNull View view2) {
                onClick.invoke(view2);
            }
        });
    }

    /* renamed from: k */
    public static final void m16378k(@NotNull View view) {
        view.setVisibility(0);
    }

    /* renamed from: l */
    public static final void m16379l(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: m */
    public static final void m16380m(@NotNull View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
