package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    };

    /* renamed from: b */
    public final int f76b;

    /* renamed from: c */
    public final float f77c;

    /* renamed from: d */
    public Object f78d;

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static float m126a(Rating rating) {
            return rating.getPercentRating();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m127b(Rating rating) {
            return rating.getRatingStyle();
        }

        @DoNotInline
        /* renamed from: c */
        public static float m128c(Rating rating) {
            return rating.getStarRating();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m129d(Rating rating) {
            return rating.hasHeart();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m130e(Rating rating) {
            return rating.isRated();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m131f(Rating rating) {
            return rating.isThumbUp();
        }

        @DoNotInline
        /* renamed from: g */
        public static Rating m132g(boolean z) {
            return Rating.newHeartRating(z);
        }

        @DoNotInline
        /* renamed from: h */
        public static Rating m133h(float f2) {
            return Rating.newPercentageRating(f2);
        }

        @DoNotInline
        /* renamed from: i */
        public static Rating m134i(int i2, float f2) {
            return Rating.newStarRating(i2, f2);
        }

        @DoNotInline
        /* renamed from: j */
        public static Rating m135j(boolean z) {
            return Rating.newThumbRating(z);
        }

        @DoNotInline
        /* renamed from: k */
        public static Rating m136k(int i2) {
            return Rating.newUnratedRating(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Style {
    }

    public RatingCompat(int i2, float f2) {
        this.f76b = i2;
        this.f77c = f2;
    }

    /* renamed from: a */
    public static RatingCompat m120a(Object obj) {
        RatingCompat ratingCompat;
        float f2;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int m127b = Api19Impl.m127b(rating);
            if (!Api19Impl.m130e(rating)) {
                switch (m127b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(m127b, -1.0f);
                        break;
                }
            } else {
                switch (m127b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, Api19Impl.m129d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, Api19Impl.m131f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float m128c = Api19Impl.m128c(rating);
                        if (m127b == 3) {
                            f2 = 3.0f;
                        } else if (m127b == 4) {
                            f2 = 4.0f;
                        } else if (m127b != 5) {
                            Log.e("Rating", "Invalid rating style (" + m127b + ") for a star rating");
                            break;
                        } else {
                            f2 = 5.0f;
                        }
                        if (m128c >= 0.0f && m128c <= f2) {
                            ratingCompat2 = new RatingCompat(m127b, m128c);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float m126a = Api19Impl.m126a(rating);
                        if (m126a >= 0.0f && m126a <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, m126a);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                    default:
                        return null;
                }
            }
            ratingCompat2.f78d = obj;
        }
        return ratingCompat2;
    }

    /* renamed from: c */
    public float m121c() {
        if (this.f76b == 6 && m124g()) {
            return this.f77c;
        }
        return -1.0f;
    }

    /* renamed from: d */
    public float m122d() {
        int i2 = this.f76b;
        if ((i2 == 3 || i2 == 4 || i2 == 5) && m124g()) {
            return this.f77c;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f76b;
    }

    /* renamed from: f */
    public boolean m123f() {
        return this.f76b == 1 && this.f77c == 1.0f;
    }

    /* renamed from: g */
    public boolean m124g() {
        return this.f77c >= 0.0f;
    }

    /* renamed from: h */
    public boolean m125h() {
        return this.f76b == 2 && this.f77c == 1.0f;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Rating:style=");
        m24u.append(this.f76b);
        m24u.append(" rating=");
        float f2 = this.f77c;
        m24u.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f76b);
        parcel.writeFloat(this.f77c);
    }
}
