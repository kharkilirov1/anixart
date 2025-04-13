package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@SuppressLint
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m93a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    };

    /* renamed from: b */
    public final String f55b;

    /* renamed from: c */
    public final CharSequence f56c;

    /* renamed from: d */
    public final CharSequence f57d;

    /* renamed from: e */
    public final CharSequence f58e;

    /* renamed from: f */
    public final Bitmap f59f;

    /* renamed from: g */
    public final Uri f60g;

    /* renamed from: h */
    public final Bundle f61h;

    /* renamed from: i */
    public final Uri f62i;

    /* renamed from: j */
    public MediaDescription f63j;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static MediaDescription m95a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: b */
        public static MediaDescription.Builder m96b() {
            return new MediaDescription.Builder();
        }

        @Nullable
        @DoNotInline
        /* renamed from: c */
        public static CharSequence m97c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @Nullable
        @DoNotInline
        /* renamed from: d */
        public static Bundle m98d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @Nullable
        @DoNotInline
        /* renamed from: e */
        public static Bitmap m99e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @Nullable
        @DoNotInline
        /* renamed from: f */
        public static Uri m100f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        @DoNotInline
        /* renamed from: g */
        public static String m101g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        @DoNotInline
        /* renamed from: h */
        public static CharSequence m102h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @Nullable
        @DoNotInline
        /* renamed from: i */
        public static CharSequence m103i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* renamed from: j */
        public static void m104j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m105k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: l */
        public static void m106l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m107m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m108n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m109o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* renamed from: p */
        public static void m110p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static Uri m111a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m112b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public String f64a;

        /* renamed from: b */
        public CharSequence f65b;

        /* renamed from: c */
        public CharSequence f66c;

        /* renamed from: d */
        public CharSequence f67d;

        /* renamed from: e */
        public Bitmap f68e;

        /* renamed from: f */
        public Uri f69f;

        /* renamed from: g */
        public Bundle f70g;

        /* renamed from: h */
        public Uri f71h;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55b = str;
        this.f56c = charSequence;
        this.f57d = charSequence2;
        this.f58e = charSequence3;
        this.f59f = bitmap;
        this.f60g = uri;
        this.f61h = bundle;
        this.f62i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat m93a(java.lang.Object r12) {
        /*
            r0 = 0
            if (r12 == 0) goto L88
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$Builder r2 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r2.<init>()
            android.media.MediaDescription r12 = (android.media.MediaDescription) r12
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m101g(r12)
            r2.f64a = r3
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m103i(r12)
            r2.f65b = r3
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m102h(r12)
            r2.f66c = r3
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m97c(r12)
            r2.f67d = r3
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m99e(r12)
            r2.f68e = r3
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m100f(r12)
            r2.f69f = r3
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.m98d(r12)
            if (r3 == 0) goto L3a
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.m197j(r3)
        L3a:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L45
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L46
        L45:
            r5 = r0
        L46:
            if (r5 == 0) goto L5e
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L58
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L58
            goto L5f
        L58:
            r3.remove(r4)
            r3.remove(r6)
        L5e:
            r0 = r3
        L5f:
            r2.f70g = r0
            if (r5 == 0) goto L66
            r2.f71h = r5
            goto L70
        L66:
            r0 = 23
            if (r1 < r0) goto L70
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.Api23Impl.m111a(r12)
            r2.f71h = r0
        L70:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r4 = r2.f64a
            java.lang.CharSequence r5 = r2.f65b
            java.lang.CharSequence r6 = r2.f66c
            java.lang.CharSequence r7 = r2.f67d
            android.graphics.Bitmap r8 = r2.f68e
            android.net.Uri r9 = r2.f69f
            android.os.Bundle r10 = r2.f70g
            android.net.Uri r11 = r2.f71h
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f63j = r12
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m93a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: c */
    public Object m94c() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f63j;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription.Builder m96b = Api21Impl.m96b();
        Api21Impl.m108n(m96b, this.f55b);
        Api21Impl.m110p(m96b, this.f56c);
        Api21Impl.m109o(m96b, this.f57d);
        Api21Impl.m104j(m96b, this.f58e);
        Api21Impl.m106l(m96b, this.f59f);
        Api21Impl.m107m(m96b, this.f60g);
        if (i2 >= 23 || this.f62i == null) {
            Api21Impl.m105k(m96b, this.f61h);
        } else {
            if (this.f61h == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f61h);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f62i);
            Api21Impl.m105k(m96b, bundle);
        }
        if (i2 >= 23) {
            Api23Impl.m112b(m96b, this.f62i);
        }
        MediaDescription m95a = Api21Impl.m95a(m96b);
        this.f63j = m95a;
        return m95a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f56c) + ", " + ((Object) this.f57d) + ", " + ((Object) this.f58e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        ((MediaDescription) m94c()).writeToParcel(parcel, i2);
    }
}
