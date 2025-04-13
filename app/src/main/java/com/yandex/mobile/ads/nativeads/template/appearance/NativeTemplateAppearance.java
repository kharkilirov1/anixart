package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.tg1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

/* loaded from: classes3.dex */
public final class NativeTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new C6246a();

    /* renamed from: m */
    @VisibleForTesting
    public static final int f57877m = Color.parseColor("#7f7f7f");

    /* renamed from: n */
    public static final int f57878n = Color.parseColor("#ffd200");

    /* renamed from: o */
    public static final int f57879o = Color.parseColor("#ffd200");

    /* renamed from: p */
    public static final int f57880p = Color.parseColor("#f4c900");

    /* renamed from: a */
    @NonNull
    private final BannerAppearance f57881a;

    /* renamed from: b */
    @NonNull
    private final TextAppearance f57882b;

    /* renamed from: c */
    @NonNull
    private final TextAppearance f57883c;

    /* renamed from: d */
    @NonNull
    private final TextAppearance f57884d;

    /* renamed from: e */
    @NonNull
    private final TextAppearance f57885e;

    /* renamed from: f */
    @NonNull
    private final TextAppearance f57886f;

    /* renamed from: g */
    @NonNull
    private final TextAppearance f57887g;

    /* renamed from: h */
    @NonNull
    private final TextAppearance f57888h;

    /* renamed from: i */
    @NonNull
    private final ImageAppearance f57889i;

    /* renamed from: j */
    @NonNull
    private final ImageAppearance f57890j;

    /* renamed from: k */
    @NonNull
    private final ButtonAppearance f57891k;

    /* renamed from: l */
    @NonNull
    private final RatingAppearance f57892l;

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        private BannerAppearance f57893a = m30692b();

        /* renamed from: k */
        @NonNull
        private ButtonAppearance f57903k = m30696d();

        /* renamed from: i */
        @NonNull
        private ImageAppearance f57901i = m30702g();

        /* renamed from: j */
        @NonNull
        private ImageAppearance f57902j = m30700f();

        /* renamed from: l */
        @NonNull
        private RatingAppearance f57904l = m30704h();

        /* renamed from: b */
        @NonNull
        private TextAppearance f57894b = m30691a();

        /* renamed from: c */
        @NonNull
        private TextAppearance f57895c = m30695c();

        /* renamed from: d */
        @NonNull
        private TextAppearance f57896d = m30698e();

        /* renamed from: e */
        @NonNull
        private TextAppearance f57897e = m30706i();

        /* renamed from: f */
        @NonNull
        private TextAppearance f57898f = m30708j();

        /* renamed from: g */
        @NonNull
        private TextAppearance f57899g = m30711k();

        /* renamed from: h */
        @NonNull
        private TextAppearance f57900h = m30713l();

        @NonNull
        public NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this, 0);
        }

        @NonNull
        public Builder withAgeAppearance(@NonNull TextAppearance textAppearance) {
            this.f57894b = C6250a.m30720a(this.f57894b, textAppearance);
            return this;
        }

        @NonNull
        public Builder withBannerAppearance(@NonNull BannerAppearance bannerAppearance) {
            BannerAppearance bannerAppearance2 = this.f57893a;
            if (bannerAppearance != null && !bannerAppearance2.equals(bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                int borderColor = bannerAppearance.getBorderColor();
                float borderWidth = bannerAppearance.getBorderWidth();
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearance2.getBackgroundColor();
                }
                BannerAppearance.Builder backgroundColor2 = builder.setBackgroundColor(backgroundColor);
                if (borderColor == 0) {
                    borderColor = bannerAppearance2.getBorderColor();
                }
                BannerAppearance.Builder borderColor2 = backgroundColor2.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = bannerAppearance2.getBorderWidth();
                }
                BannerAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                HorizontalOffset contentPadding = bannerAppearance2.getContentPadding();
                HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                if (contentPadding2 != null && !contentPadding.equals(contentPadding2)) {
                    contentPadding = new HorizontalOffset(contentPadding2.getLeft() >= 0.0f ? contentPadding2.getLeft() : 0.0f, contentPadding2.getRight() >= 0.0f ? contentPadding2.getRight() : 0.0f);
                }
                BannerAppearance.Builder contentPadding3 = borderWidth2.setContentPadding(contentPadding);
                if (imageMargins == null) {
                    imageMargins = bannerAppearance2.getImageMargins();
                }
                bannerAppearance2 = contentPadding3.setImageMargins(imageMargins).build();
            }
            this.f57893a = bannerAppearance2;
            return this;
        }

        @NonNull
        public Builder withBodyAppearance(@NonNull TextAppearance textAppearance) {
            this.f57895c = C6250a.m30720a(this.f57895c, textAppearance);
            return this;
        }

        @NonNull
        public Builder withCallToActionAppearance(@NonNull ButtonAppearance buttonAppearance) {
            ButtonAppearance buttonAppearance2 = this.f57903k;
            if (buttonAppearance != null && !buttonAppearance2.equals(buttonAppearance)) {
                TextAppearance m30720a = C6250a.m30720a(buttonAppearance2.getTextAppearance(), buttonAppearance.getTextAppearance());
                int borderColor = buttonAppearance.getBorderColor();
                float borderWidth = buttonAppearance.getBorderWidth();
                int normalColor = buttonAppearance.getNormalColor();
                int pressedColor = buttonAppearance.getPressedColor();
                ButtonAppearance.Builder textAppearance = new ButtonAppearance.Builder().setTextAppearance(m30720a);
                if (borderColor == 0) {
                    borderColor = buttonAppearance2.getBorderColor();
                }
                ButtonAppearance.Builder borderColor2 = textAppearance.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = buttonAppearance2.getBorderWidth();
                }
                ButtonAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearance2.getNormalColor();
                }
                ButtonAppearance.Builder normalColor2 = borderWidth2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearance2.getPressedColor();
                }
                buttonAppearance2 = normalColor2.setPressedColor(pressedColor).build();
            }
            this.f57903k = buttonAppearance2;
            return this;
        }

        @NonNull
        public Builder withDomainAppearance(@NonNull TextAppearance textAppearance) {
            this.f57896d = C6250a.m30720a(this.f57896d, textAppearance);
            return this;
        }

        public Builder withFaviconAppearance(@NonNull ImageAppearance imageAppearance) {
            ImageAppearance imageAppearance2 = this.f57902j;
            if (imageAppearance != null && !imageAppearance2.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance2.getWidthConstraint();
                }
                imageAppearance2 = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f57902j = imageAppearance2;
            return this;
        }

        @NonNull
        public Builder withImageAppearance(@NonNull ImageAppearance imageAppearance) {
            ImageAppearance imageAppearance2 = this.f57901i;
            if (imageAppearance != null && !imageAppearance2.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance2.getWidthConstraint();
                }
                imageAppearance2 = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f57901i = imageAppearance2;
            return this;
        }

        @NonNull
        public Builder withRatingAppearance(@NonNull RatingAppearance ratingAppearance) {
            RatingAppearance ratingAppearance2 = this.f57904l;
            if (ratingAppearance != null && !ratingAppearance2.equals(ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                RatingAppearance.Builder builder = new RatingAppearance.Builder();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearance2.getBackgroundStarColor();
                }
                RatingAppearance.Builder backgroundStarColor2 = builder.setBackgroundStarColor(backgroundStarColor);
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearance2.getProgressStarColor();
                }
                ratingAppearance2 = backgroundStarColor2.setProgressStarColor(progressStarColor).build();
            }
            this.f57904l = ratingAppearance2;
            return this;
        }

        @NonNull
        public Builder withReviewCountAppearance(@NonNull TextAppearance textAppearance) {
            this.f57897e = C6250a.m30720a(this.f57897e, textAppearance);
            return this;
        }

        @NonNull
        public Builder withSponsoredAppearance(@NonNull TextAppearance textAppearance) {
            this.f57898f = C6250a.m30720a(this.f57898f, textAppearance);
            return this;
        }

        @NonNull
        public Builder withTitleAppearance(@NonNull TextAppearance textAppearance) {
            this.f57899g = C6250a.m30720a(this.f57899g, textAppearance);
            return this;
        }

        @NonNull
        public Builder withWarningAppearance(@NonNull TextAppearance textAppearance) {
            this.f57900h = C6250a.m30720a(this.f57900h, textAppearance);
            return this;
        }

        @NonNull
        /* renamed from: a */
        private static TextAppearance m30691a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f57877m).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NonNull
        /* renamed from: b */
        private static BannerAppearance m30692b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(tg1.m28650a(-16777216, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        @NonNull
        /* renamed from: c */
        private static TextAppearance m30695c() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NonNull
        /* renamed from: d */
        private static ButtonAppearance m30696d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f57878n).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f57879o).setTextAppearance(new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        @NonNull
        /* renamed from: e */
        private static TextAppearance m30698e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f57877m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NonNull
        /* renamed from: f */
        private static ImageAppearance m30700f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        @NonNull
        /* renamed from: g */
        private static ImageAppearance m30702g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        @NonNull
        /* renamed from: h */
        private static RatingAppearance m30704h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f57880p).build();
        }

        @NonNull
        /* renamed from: i */
        private static TextAppearance m30706i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f57877m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NonNull
        /* renamed from: j */
        private static TextAppearance m30708j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f57877m).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NonNull
        /* renamed from: k */
        private static TextAppearance m30711k() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        @NonNull
        /* renamed from: l */
        private static TextAppearance m30713l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f57877m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance$a */
    public class C6246a implements Parcelable.Creator<NativeTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance createFromParcel(Parcel parcel) {
            return new NativeTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance[] newArray(int i2) {
            return new NativeTemplateAppearance[i2];
        }
    }

    public /* synthetic */ NativeTemplateAppearance(Builder builder, int i2) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f57881a;
        if (bannerAppearance == null ? nativeTemplateAppearance.f57881a != null : !bannerAppearance.equals(nativeTemplateAppearance.f57881a)) {
            return false;
        }
        TextAppearance textAppearance = this.f57882b;
        if (textAppearance == null ? nativeTemplateAppearance.f57882b != null : !textAppearance.equals(nativeTemplateAppearance.f57882b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f57883c;
        if (textAppearance2 == null ? nativeTemplateAppearance.f57883c != null : !textAppearance2.equals(nativeTemplateAppearance.f57883c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f57884d;
        if (textAppearance3 == null ? nativeTemplateAppearance.f57884d != null : !textAppearance3.equals(nativeTemplateAppearance.f57884d)) {
            return false;
        }
        TextAppearance textAppearance4 = this.f57885e;
        if (textAppearance4 == null ? nativeTemplateAppearance.f57885e != null : !textAppearance4.equals(nativeTemplateAppearance.f57885e)) {
            return false;
        }
        TextAppearance textAppearance5 = this.f57886f;
        if (textAppearance5 == null ? nativeTemplateAppearance.f57886f != null : !textAppearance5.equals(nativeTemplateAppearance.f57886f)) {
            return false;
        }
        TextAppearance textAppearance6 = this.f57887g;
        if (textAppearance6 == null ? nativeTemplateAppearance.f57887g != null : !textAppearance6.equals(nativeTemplateAppearance.f57887g)) {
            return false;
        }
        TextAppearance textAppearance7 = this.f57888h;
        if (textAppearance7 == null ? nativeTemplateAppearance.f57888h != null : !textAppearance7.equals(nativeTemplateAppearance.f57888h)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f57890j;
        if (imageAppearance == null ? nativeTemplateAppearance.f57890j != null : !imageAppearance.equals(nativeTemplateAppearance.f57890j)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f57889i;
        if (imageAppearance2 == null ? nativeTemplateAppearance.f57889i != null : !imageAppearance2.equals(nativeTemplateAppearance.f57889i)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f57891k;
        if (buttonAppearance == null ? nativeTemplateAppearance.f57891k != null : !buttonAppearance.equals(nativeTemplateAppearance.f57891k)) {
            return false;
        }
        RatingAppearance ratingAppearance = this.f57892l;
        if (ratingAppearance != null) {
            if (ratingAppearance.equals(nativeTemplateAppearance.f57892l)) {
                return true;
            }
        } else if (nativeTemplateAppearance.f57892l == null) {
            return true;
        }
        return false;
    }

    @NonNull
    public TextAppearance getAgeAppearance() {
        return this.f57882b;
    }

    @NonNull
    public BannerAppearance getBannerAppearance() {
        return this.f57881a;
    }

    @NonNull
    public TextAppearance getBodyAppearance() {
        return this.f57883c;
    }

    @NonNull
    public ButtonAppearance getCallToActionAppearance() {
        return this.f57891k;
    }

    @NonNull
    public TextAppearance getDomainAppearance() {
        return this.f57884d;
    }

    @NonNull
    public ImageAppearance getFaviconAppearance() {
        return this.f57889i;
    }

    @NonNull
    public ImageAppearance getImageAppearance() {
        return this.f57890j;
    }

    @NonNull
    public RatingAppearance getRatingAppearance() {
        return this.f57892l;
    }

    @NonNull
    public TextAppearance getReviewCountAppearance() {
        return this.f57885e;
    }

    @NonNull
    public TextAppearance getSponsoredAppearance() {
        return this.f57886f;
    }

    @NonNull
    public TextAppearance getTitleAppearance() {
        return this.f57887g;
    }

    @NonNull
    public TextAppearance getWarningAppearance() {
        return this.f57888h;
    }

    public int hashCode() {
        BannerAppearance bannerAppearance = this.f57881a;
        int hashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f57882b;
        int hashCode2 = (hashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f57883c;
        int hashCode3 = (hashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f57884d;
        int hashCode4 = (hashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        TextAppearance textAppearance4 = this.f57885e;
        int hashCode5 = (hashCode4 + (textAppearance4 != null ? textAppearance4.hashCode() : 0)) * 31;
        TextAppearance textAppearance5 = this.f57886f;
        int hashCode6 = (hashCode5 + (textAppearance5 != null ? textAppearance5.hashCode() : 0)) * 31;
        TextAppearance textAppearance6 = this.f57887g;
        int hashCode7 = (hashCode6 + (textAppearance6 != null ? textAppearance6.hashCode() : 0)) * 31;
        TextAppearance textAppearance7 = this.f57888h;
        int hashCode8 = (hashCode7 + (textAppearance7 != null ? textAppearance7.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f57890j;
        int hashCode9 = (hashCode8 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f57889i;
        int hashCode10 = (hashCode9 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f57891k;
        int hashCode11 = (hashCode10 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        RatingAppearance ratingAppearance = this.f57892l;
        return hashCode11 + (ratingAppearance != null ? ratingAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f57881a, i2);
        parcel.writeParcelable(this.f57882b, i2);
        parcel.writeParcelable(this.f57883c, i2);
        parcel.writeParcelable(this.f57884d, i2);
        parcel.writeParcelable(this.f57885e, i2);
        parcel.writeParcelable(this.f57886f, i2);
        parcel.writeParcelable(this.f57887g, i2);
        parcel.writeParcelable(this.f57888h, i2);
        parcel.writeParcelable(this.f57889i, i2);
        parcel.writeParcelable(this.f57890j, i2);
        parcel.writeParcelable(this.f57891k, i2);
        parcel.writeParcelable(this.f57892l, i2);
    }

    private NativeTemplateAppearance(@NonNull Builder builder) {
        this.f57881a = builder.f57893a;
        this.f57882b = builder.f57894b;
        this.f57883c = builder.f57895c;
        this.f57884d = builder.f57896d;
        this.f57885e = builder.f57897e;
        this.f57886f = builder.f57898f;
        this.f57887g = builder.f57899g;
        this.f57888h = builder.f57900h;
        this.f57890j = builder.f57901i;
        this.f57889i = builder.f57902j;
        this.f57891k = builder.f57903k;
        this.f57892l = builder.f57904l;
    }

    public NativeTemplateAppearance(Parcel parcel) {
        this.f57881a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f57882b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57883c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57884d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57885e = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57886f = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57887g = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57888h = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57889i = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f57890j = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f57891k = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f57892l = (RatingAppearance) parcel.readParcelable(RatingAppearance.class.getClassLoader());
    }
}
