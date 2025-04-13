package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oy0;
import com.yandex.mobile.ads.impl.v90;
import com.yandex.mobile.ads.impl.yt0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.b0 */
/* loaded from: classes3.dex */
public final class C6201b0 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<View> f57669a;

    /* renamed from: b */
    @NonNull
    private final LinkedHashMap f57670b;

    /* renamed from: c */
    @NonNull
    private final oy0 f57671c;

    /* renamed from: d */
    @NonNull
    private final WeakReference<ImageView> f57672d;

    /* renamed from: com.yandex.mobile.ads.nativeads.b0$a */
    public static final class a {

        /* renamed from: a */
        @NonNull
        private final View f57673a;

        /* renamed from: b */
        @NonNull
        private final Map<String, View> f57674b;

        /* renamed from: c */
        @Nullable
        public ImageView f57675c;

        public a(@NonNull View view, @NonNull Map<String, View> map) {
            this.f57673a = view;
            this.f57674b = map;
        }

        @NonNull
        /* renamed from: c */
        public final a m30531c(@Nullable TextView textView) {
            this.f57674b.put("domain", textView);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final a m30532d(@Nullable TextView textView) {
            this.f57674b.put("review_count", textView);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final a m30533e(@Nullable TextView textView) {
            this.f57674b.put("sponsored", textView);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public final a m30534f(@Nullable TextView textView) {
            this.f57674b.put("title", textView);
            return this;
        }

        @NonNull
        /* renamed from: g */
        public final a m30535g(@Nullable TextView textView) {
            this.f57674b.put("warning", textView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C6201b0 m30527a() {
            return new C6201b0(this, 0);
        }

        @NonNull
        /* renamed from: b */
        public final a m30529b(@Nullable TextView textView) {
            this.f57674b.put("body", textView);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final a m30530c(@Nullable ImageView imageView) {
            this.f57674b.put("icon", imageView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m30524a(@Nullable TextView textView) {
            this.f57674b.put("age", textView);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a m30528b(@Nullable ImageView imageView) {
            this.f57674b.put("feedback", imageView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m30522a(@Nullable Button button) {
            this.f57674b.put("call_to_action", button);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m30523a(@Nullable ImageView imageView) {
            this.f57674b.put("favicon", imageView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m30526a(@Nullable MediaView mediaView) {
            this.f57674b.put("media", mediaView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m30525a(@Nullable yt0 yt0Var) {
            this.f57674b.put("rating", yt0Var);
            return this;
        }
    }

    public /* synthetic */ C6201b0(a aVar, int i2) {
        this(aVar);
    }

    @Nullable
    /* renamed from: a */
    public final TextView m30502a() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("age");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @NonNull
    /* renamed from: b */
    public final LinkedHashMap m30503b() {
        return this.f57670b;
    }

    @Nullable
    /* renamed from: c */
    public final TextView m30504c() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("body");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: d */
    public final TextView m30505d() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("call_to_action");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: e */
    public final TextView m30506e() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("close_button");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: f */
    public final TextView m30507f() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("domain");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: g */
    public final ImageView m30508g() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("favicon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, m30501a);
    }

    @Nullable
    /* renamed from: h */
    public final ImageView m30509h() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("feedback");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, m30501a);
    }

    @Nullable
    /* renamed from: i */
    public final ImageView m30510i() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("icon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, m30501a);
    }

    @Nullable
    @Deprecated
    /* renamed from: j */
    public final ImageView m30511j() {
        return this.f57672d.get();
    }

    @Nullable
    /* renamed from: k */
    public final MediaView m30512k() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("media");
        Objects.requireNonNull(oy0Var);
        return (MediaView) oy0.m27130a(MediaView.class, m30501a);
    }

    @NonNull
    /* renamed from: l */
    public final View m30513l() {
        return this.f57669a.get();
    }

    @Nullable
    /* renamed from: m */
    public final TextView m30514m() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("price");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: n */
    public final View m30515n() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("rating");
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, m30501a);
    }

    @Nullable
    /* renamed from: o */
    public final TextView m30516o() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("review_count");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: p */
    public final TextView m30517p() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("sponsored");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: q */
    public final TextView m30518q() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("title");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    @Nullable
    /* renamed from: r */
    public final TextView m30519r() {
        oy0 oy0Var = this.f57671c;
        View m30501a = m30501a("warning");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, m30501a);
    }

    private C6201b0(@NonNull a aVar) {
        this.f57669a = new WeakReference<>(aVar.f57673a);
        this.f57672d = new WeakReference<>(aVar.f57675c);
        this.f57670b = v90.m29199a(aVar.f57674b);
        this.f57671c = new oy0();
    }

    @Nullable
    /* renamed from: a */
    public final View m30501a(@NonNull String str) {
        WeakReference weakReference = (WeakReference) this.f57670b.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
