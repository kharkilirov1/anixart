package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.z10;

/* loaded from: classes3.dex */
public abstract class NativeAdAssets {

    /* renamed from: a */
    @Nullable
    private NativeAdMedia f57602a;

    /* renamed from: b */
    @Nullable
    private String f57603b;

    /* renamed from: c */
    @Nullable
    private String f57604c;

    /* renamed from: d */
    @Nullable
    private String f57605d;

    /* renamed from: e */
    @Nullable
    private String f57606e;

    /* renamed from: f */
    @Nullable
    private NativeAdImage f57607f;

    /* renamed from: g */
    @Nullable
    private NativeAdImage f57608g;

    /* renamed from: h */
    @Nullable
    private NativeAdImage f57609h;

    /* renamed from: i */
    @Nullable
    private String f57610i;

    /* renamed from: j */
    @Nullable
    private Float f57611j;

    /* renamed from: k */
    @Nullable
    private String f57612k;

    /* renamed from: l */
    @Nullable
    private String f57613l;

    /* renamed from: m */
    @Nullable
    private String f57614m;

    /* renamed from: n */
    @Nullable
    private String f57615n;

    /* renamed from: o */
    private boolean f57616o;

    /* renamed from: a */
    public final void m30447a(@Nullable String str) {
        this.f57603b = str;
    }

    /* renamed from: b */
    public final void m30450b(@Nullable String str) {
        this.f57604c = str;
    }

    /* renamed from: c */
    public final void m30452c(@Nullable String str) {
        this.f57605d = str;
    }

    /* renamed from: d */
    public final void m30453d(@Nullable String str) {
        this.f57606e = str;
    }

    /* renamed from: e */
    public final void m30454e(@Nullable String str) {
        this.f57610i = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        NativeAdMedia nativeAdMedia = this.f57602a;
        if (nativeAdMedia == null ? nativeAdAssets.f57602a != null : !nativeAdMedia.equals(nativeAdAssets.f57602a)) {
            return false;
        }
        String str = this.f57603b;
        if (str == null ? nativeAdAssets.f57603b != null : !str.equals(nativeAdAssets.f57603b)) {
            return false;
        }
        String str2 = this.f57604c;
        if (str2 == null ? nativeAdAssets.f57604c != null : !str2.equals(nativeAdAssets.f57604c)) {
            return false;
        }
        String str3 = this.f57605d;
        if (str3 == null ? nativeAdAssets.f57605d != null : !str3.equals(nativeAdAssets.f57605d)) {
            return false;
        }
        String str4 = this.f57606e;
        if (str4 == null ? nativeAdAssets.f57606e != null : !str4.equals(nativeAdAssets.f57606e)) {
            return false;
        }
        NativeAdImage nativeAdImage = this.f57607f;
        if (nativeAdImage == null ? nativeAdAssets.f57607f != null : !nativeAdImage.equals(nativeAdAssets.f57607f)) {
            return false;
        }
        NativeAdImage nativeAdImage2 = this.f57608g;
        if (nativeAdImage2 == null ? nativeAdAssets.f57608g != null : !nativeAdImage2.equals(nativeAdAssets.f57608g)) {
            return false;
        }
        NativeAdImage nativeAdImage3 = this.f57609h;
        if (nativeAdImage3 == null ? nativeAdAssets.f57609h != null : !nativeAdImage3.equals(nativeAdAssets.f57609h)) {
            return false;
        }
        String str5 = this.f57610i;
        if (str5 == null ? nativeAdAssets.f57610i != null : !str5.equals(nativeAdAssets.f57610i)) {
            return false;
        }
        Float f2 = this.f57611j;
        if (f2 == null ? nativeAdAssets.f57611j != null : !f2.equals(nativeAdAssets.f57611j)) {
            return false;
        }
        String str6 = this.f57612k;
        if (str6 == null ? nativeAdAssets.f57612k != null : !str6.equals(nativeAdAssets.f57612k)) {
            return false;
        }
        String str7 = this.f57613l;
        if (str7 == null ? nativeAdAssets.f57613l != null : !str7.equals(nativeAdAssets.f57613l)) {
            return false;
        }
        String str8 = this.f57614m;
        if (str8 == null ? nativeAdAssets.f57614m != null : !str8.equals(nativeAdAssets.f57614m)) {
            return false;
        }
        String str9 = this.f57615n;
        String str10 = nativeAdAssets.f57615n;
        return str9 != null ? str9.equals(str10) : str10 == null;
    }

    /* renamed from: f */
    public final void m30455f(@Nullable String str) {
        if (str != null) {
            try {
                this.f57611j = Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException e2) {
                n60.m26808a(e2, String.format("Could not parse rating value. Rating value is %s", str), new Object[0]);
            }
        }
    }

    /* renamed from: g */
    public final void m30456g(@Nullable String str) {
        this.f57612k = str;
    }

    @Nullable
    public String getAge() {
        return this.f57603b;
    }

    @Nullable
    public String getBody() {
        return this.f57604c;
    }

    @Nullable
    public String getCallToAction() {
        return this.f57605d;
    }

    @Nullable
    public String getDomain() {
        return this.f57606e;
    }

    @Nullable
    public NativeAdImage getFavicon() {
        return this.f57607f;
    }

    @Nullable
    public NativeAdImage getIcon() {
        return this.f57608g;
    }

    @Nullable
    public NativeAdImage getImage() {
        return this.f57609h;
    }

    @Nullable
    public NativeAdMedia getMedia() {
        return this.f57602a;
    }

    @Nullable
    public String getPrice() {
        return this.f57610i;
    }

    @Nullable
    public Float getRating() {
        return this.f57611j;
    }

    @Nullable
    public String getReviewCount() {
        return this.f57612k;
    }

    @Nullable
    public String getSponsored() {
        return this.f57613l;
    }

    @Nullable
    public String getTitle() {
        return this.f57614m;
    }

    @Nullable
    public String getWarning() {
        return this.f57615n;
    }

    /* renamed from: h */
    public final void m30457h(@Nullable String str) {
        this.f57613l = str;
    }

    public int hashCode() {
        NativeAdMedia nativeAdMedia = this.f57602a;
        int hashCode = (nativeAdMedia != null ? nativeAdMedia.hashCode() : 0) * 31;
        String str = this.f57603b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f57604c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f57605d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f57606e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage = this.f57607f;
        int hashCode6 = (hashCode5 + (nativeAdImage != null ? nativeAdImage.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage2 = this.f57608g;
        int hashCode7 = (hashCode6 + (nativeAdImage2 != null ? nativeAdImage2.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage3 = this.f57609h;
        int hashCode8 = (hashCode7 + (nativeAdImage3 != null ? nativeAdImage3.hashCode() : 0)) * 31;
        String str5 = this.f57610i;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f2 = this.f57611j;
        int hashCode10 = (hashCode9 + (f2 != null ? f2.hashCode() : 0)) * 31;
        String str6 = this.f57612k;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f57613l;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f57614m;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f57615n;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m30458i(@Nullable String str) {
        this.f57614m = str;
    }

    public boolean isFeedbackAvailable() {
        return this.f57616o;
    }

    /* renamed from: j */
    public final void m30459j(@Nullable String str) {
        this.f57615n = str;
    }

    /* renamed from: a */
    public final void m30448a(boolean z) {
        this.f57616o = z;
    }

    /* renamed from: b */
    public final void m30449b(@Nullable z10 z10Var, @NonNull w10 w10Var) {
        NativeAdImage nativeAdImage;
        if (z10Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.m30461a(z10Var.m30034a());
            nativeAdImage.m30464b(z10Var.m30043e());
            nativeAdImage.m30463a(z10Var.m30038b());
            nativeAdImage.m30462a(w10Var.mo24878a(z10Var));
        } else {
            nativeAdImage = null;
        }
        this.f57608g = nativeAdImage;
    }

    /* renamed from: c */
    public final void m30451c(@Nullable z10 z10Var, @NonNull w10 w10Var) {
        NativeAdImage nativeAdImage;
        if (z10Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.m30461a(z10Var.m30034a());
            nativeAdImage.m30464b(z10Var.m30043e());
            nativeAdImage.m30463a(z10Var.m30038b());
            nativeAdImage.m30462a(w10Var.mo24878a(z10Var));
        } else {
            nativeAdImage = null;
        }
        this.f57609h = nativeAdImage;
    }

    /* renamed from: a */
    public final void m30446a(@Nullable NativeAdMedia nativeAdMedia) {
        this.f57602a = nativeAdMedia;
    }

    /* renamed from: a */
    public final void m30445a(@Nullable z10 z10Var, @NonNull w10 w10Var) {
        NativeAdImage nativeAdImage;
        if (z10Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.m30461a(z10Var.m30034a());
            nativeAdImage.m30464b(z10Var.m30043e());
            nativeAdImage.m30463a(z10Var.m30038b());
            nativeAdImage.m30462a(w10Var.mo24878a(z10Var));
        } else {
            nativeAdImage = null;
        }
        this.f57607f = nativeAdImage;
    }
}
