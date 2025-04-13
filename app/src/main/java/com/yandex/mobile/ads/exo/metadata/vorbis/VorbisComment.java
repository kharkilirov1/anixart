package com.yandex.mobile.ads.exo.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class VorbisComment extends com.yandex.mobile.ads.exo.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C4772a();

    /* renamed from: com.yandex.mobile.ads.exo.metadata.vorbis.VorbisComment$a */
    public class C4772a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
