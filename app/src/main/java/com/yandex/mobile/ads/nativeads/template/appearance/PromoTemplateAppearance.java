package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class PromoTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<PromoTemplateAppearance> CREATOR = new C6247a();

    /* renamed from: a */
    private final BannerAppearance f57905a;

    /* renamed from: b */
    private final TextAppearance f57906b;

    /* renamed from: c */
    private final TextAppearance f57907c;

    /* renamed from: d */
    private final TextAppearance f57908d;

    /* renamed from: e */
    private final ImageAppearance f57909e;

    /* renamed from: f */
    private final ImageAppearance f57910f;

    /* renamed from: g */
    private final ButtonAppearance f57911g;

    /* renamed from: h */
    private final ButtonAppearance f57912h;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.PromoTemplateAppearance$a */
    public class C6247a implements Parcelable.Creator<PromoTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance createFromParcel(Parcel parcel) {
            return new PromoTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance[] newArray(int i2) {
            return new PromoTemplateAppearance[i2];
        }
    }

    public PromoTemplateAppearance(Parcel parcel) {
        this.f57905a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f57906b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57907c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57908d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f57909e = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f57910f = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f57911g = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f57912h = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PromoTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        PromoTemplateAppearance promoTemplateAppearance = (PromoTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f57905a;
        if (bannerAppearance == null ? promoTemplateAppearance.f57905a != null : !bannerAppearance.equals(promoTemplateAppearance.f57905a)) {
            return false;
        }
        TextAppearance textAppearance = this.f57906b;
        if (textAppearance == null ? promoTemplateAppearance.f57906b != null : !textAppearance.equals(promoTemplateAppearance.f57906b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f57907c;
        if (textAppearance2 == null ? promoTemplateAppearance.f57907c != null : !textAppearance2.equals(promoTemplateAppearance.f57907c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f57908d;
        if (textAppearance3 == null ? promoTemplateAppearance.f57908d != null : !textAppearance3.equals(promoTemplateAppearance.f57908d)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f57909e;
        if (imageAppearance == null ? promoTemplateAppearance.f57909e != null : !imageAppearance.equals(promoTemplateAppearance.f57909e)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f57910f;
        if (imageAppearance2 == null ? promoTemplateAppearance.f57910f != null : !imageAppearance2.equals(promoTemplateAppearance.f57910f)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f57911g;
        if (buttonAppearance == null ? promoTemplateAppearance.f57911g != null : !buttonAppearance.equals(promoTemplateAppearance.f57911g)) {
            return false;
        }
        ButtonAppearance buttonAppearance2 = this.f57912h;
        return buttonAppearance2 != null ? buttonAppearance2.equals(promoTemplateAppearance.f57912h) : promoTemplateAppearance.f57912h == null;
    }

    public final int hashCode() {
        BannerAppearance bannerAppearance = this.f57905a;
        int hashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f57906b;
        int hashCode2 = (hashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f57907c;
        int hashCode3 = (hashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f57908d;
        int hashCode4 = (hashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f57909e;
        int hashCode5 = (hashCode4 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f57910f;
        int hashCode6 = (hashCode5 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f57911g;
        int hashCode7 = (hashCode6 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance2 = this.f57912h;
        return hashCode7 + (buttonAppearance2 != null ? buttonAppearance2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f57905a, i2);
        parcel.writeParcelable(this.f57906b, i2);
        parcel.writeParcelable(this.f57907c, i2);
        parcel.writeParcelable(this.f57908d, i2);
        parcel.writeParcelable(this.f57909e, i2);
        parcel.writeParcelable(this.f57910f, i2);
        parcel.writeParcelable(this.f57911g, i2);
        parcel.writeParcelable(this.f57912h, i2);
    }
}
