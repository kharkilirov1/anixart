package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d */
    public static final ArrayMap<String, Integer> f72d;

    /* renamed from: b */
    public final Bundle f73b;

    /* renamed from: c */
    public MediaMetadata f74c;

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f72d = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat[] newArray(int i2) {
                return new MediaMetadataCompat[i2];
            }
        };
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f73b = bundle2;
        MediaSessionCompat.m195a(bundle2);
    }

    /* renamed from: a */
    public static MediaMetadataCompat m113a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f74c = mediaMetadata;
        return createFromParcel;
    }

    /* renamed from: c */
    public Bundle m114c() {
        return new Bundle(this.f73b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f73b);
    }

    public static final class Builder {

        /* renamed from: a */
        public final Bundle f75a;

        public Builder() {
            this.f75a = new Bundle();
        }

        /* renamed from: a */
        public MediaMetadataCompat m115a() {
            return new MediaMetadataCompat(this.f75a);
        }

        /* renamed from: b */
        public Builder m116b(String str, Bitmap bitmap) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f72d;
            if ((arrayMap.m1119f(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 2) {
                throw new IllegalArgumentException(C0000a.m16m("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.f75a.putParcelable(str, bitmap);
            return this;
        }

        /* renamed from: c */
        public Builder m117c(String str, long j2) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f72d;
            if ((arrayMap.m1119f(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 0) {
                throw new IllegalArgumentException(C0000a.m16m("The ", str, " key cannot be used to put a long"));
            }
            this.f75a.putLong(str, j2);
            return this;
        }

        /* renamed from: d */
        public Builder m118d(String str, RatingCompat ratingCompat) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f72d;
            Object obj = null;
            if ((arrayMap.m1119f(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 3) {
                throw new IllegalArgumentException(C0000a.m16m("The ", str, " key cannot be used to put a Rating"));
            }
            Bundle bundle = this.f75a;
            if (ratingCompat.f78d == null) {
                if (ratingCompat.m124g()) {
                    int i2 = ratingCompat.f76b;
                    switch (i2) {
                        case 1:
                            ratingCompat.f78d = RatingCompat.Api19Impl.m132g(ratingCompat.m123f());
                            break;
                        case 2:
                            ratingCompat.f78d = RatingCompat.Api19Impl.m135j(ratingCompat.m125h());
                            break;
                        case 3:
                        case 4:
                        case 5:
                            ratingCompat.f78d = RatingCompat.Api19Impl.m134i(i2, ratingCompat.m122d());
                            break;
                        case 6:
                            ratingCompat.f78d = RatingCompat.Api19Impl.m133h(ratingCompat.m121c());
                            break;
                    }
                } else {
                    ratingCompat.f78d = RatingCompat.Api19Impl.m136k(ratingCompat.f76b);
                }
            }
            obj = ratingCompat.f78d;
            bundle.putParcelable(str, (Parcelable) obj);
            return this;
        }

        /* renamed from: e */
        public Builder m119e(String str, String str2) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f72d;
            if ((arrayMap.m1119f(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(C0000a.m16m("The ", str, " key cannot be used to put a String"));
            }
            this.f75a.putCharSequence(str, str2);
            return this;
        }

        @RestrictTo
        public Builder(MediaMetadataCompat mediaMetadataCompat, int i2) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f73b);
            this.f75a = bundle;
            MediaSessionCompat.m195a(bundle);
            for (String str : bundle.keySet()) {
                Object obj = this.f75a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i2 || bitmap.getWidth() > i2) {
                        float f2 = i2;
                        float min = Math.min(f2 / bitmap.getWidth(), f2 / bitmap.getHeight());
                        m116b(str, Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f73b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
