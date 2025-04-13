package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oy0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class NativeAdViewBinder {

    /* renamed from: a */
    @NonNull
    private final View f57646a;

    /* renamed from: b */
    @NonNull
    private final HashMap f57647b;

    /* renamed from: c */
    @NonNull
    private final oy0 f57648c;

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        private final View f57649a;

        /* renamed from: b */
        @NonNull
        private final HashMap f57650b;

        @Deprecated
        public Builder(@NonNull View view) {
            this.f57649a = view;
            this.f57650b = new HashMap();
        }

        @NonNull
        public NativeAdViewBinder build() {
            return new NativeAdViewBinder(this);
        }

        @NonNull
        public Builder setAgeView(@Nullable TextView textView) {
            this.f57650b.put("age", textView);
            return this;
        }

        @NonNull
        public Builder setBodyView(@Nullable TextView textView) {
            this.f57650b.put("body", textView);
            return this;
        }

        @NonNull
        public Builder setCallToActionView(@Nullable TextView textView) {
            this.f57650b.put("call_to_action", textView);
            return this;
        }

        @NonNull
        public Builder setDomainView(@Nullable TextView textView) {
            this.f57650b.put("domain", textView);
            return this;
        }

        @NonNull
        public Builder setFaviconView(@Nullable ImageView imageView) {
            this.f57650b.put("favicon", imageView);
            return this;
        }

        @NonNull
        public Builder setFeedbackView(@Nullable ImageView imageView) {
            this.f57650b.put("feedback", imageView);
            return this;
        }

        @NonNull
        public Builder setIconView(@Nullable ImageView imageView) {
            this.f57650b.put("icon", imageView);
            return this;
        }

        @NonNull
        public Builder setMediaView(@Nullable MediaView mediaView) {
            this.f57650b.put("media", mediaView);
            return this;
        }

        @NonNull
        public Builder setPriceView(@Nullable TextView textView) {
            this.f57650b.put("price", textView);
            return this;
        }

        @NonNull
        public <T extends View & Rating> Builder setRatingView(@Nullable T t) {
            this.f57650b.put("rating", t);
            return this;
        }

        @NonNull
        public Builder setReviewCountView(@Nullable TextView textView) {
            this.f57650b.put("review_count", textView);
            return this;
        }

        @NonNull
        public Builder setSponsoredView(@Nullable TextView textView) {
            this.f57650b.put("sponsored", textView);
            return this;
        }

        @NonNull
        public Builder setTitleView(@Nullable TextView textView) {
            this.f57650b.put("title", textView);
            return this;
        }

        @NonNull
        public Builder setWarningView(@Nullable TextView textView) {
            this.f57650b.put("warning", textView);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m30487a(@Nullable View view, @NonNull String str) {
            this.f57650b.put(str, view);
        }

        public Builder(@NonNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
        }
    }

    @Nullable
    public TextView getAgeView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("age");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @NonNull
    public Map<String, View> getAssetViews() {
        return this.f57647b;
    }

    @Nullable
    public TextView getBodyView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("body");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public TextView getCallToActionView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("call_to_action");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public TextView getDomainView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("domain");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public ImageView getFaviconView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("favicon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, obj);
    }

    @Nullable
    public ImageView getFeedbackView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("feedback");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, obj);
    }

    @Nullable
    public ImageView getIconView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("icon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, obj);
    }

    @Nullable
    public MediaView getMediaView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("media");
        Objects.requireNonNull(oy0Var);
        return (MediaView) oy0.m27130a(MediaView.class, obj);
    }

    @NonNull
    public View getNativeAdView() {
        return this.f57646a;
    }

    @Nullable
    public TextView getPriceView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("price");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public View getRatingView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("rating");
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, obj);
    }

    @Nullable
    public TextView getReviewCountView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("review_count");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public TextView getSponsoredView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("sponsored");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public TextView getTitleView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("title");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    @Nullable
    public TextView getWarningView() {
        oy0 oy0Var = this.f57648c;
        Object obj = this.f57647b.get("warning");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, obj);
    }

    private NativeAdViewBinder(@NonNull Builder builder) {
        this.f57646a = builder.f57649a;
        this.f57647b = builder.f57650b;
        this.f57648c = new oy0();
    }
}
