package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    };

    /* renamed from: b */
    public final int f163b;

    /* renamed from: c */
    public final long f164c;

    /* renamed from: d */
    public final long f165d;

    /* renamed from: e */
    public final float f166e;

    /* renamed from: f */
    public final long f167f;

    /* renamed from: g */
    public final int f168g;

    /* renamed from: h */
    public final CharSequence f169h;

    /* renamed from: i */
    public final long f170i;

    /* renamed from: j */
    public List<CustomAction> f171j;

    /* renamed from: k */
    public final long f172k;

    /* renamed from: l */
    public final Bundle f173l;

    /* renamed from: m */
    public PlaybackState f174m;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Actions {
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m271a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        /* renamed from: b */
        public static PlaybackState.CustomAction m272b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: c */
        public static PlaybackState m273c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: d */
        public static PlaybackState.Builder m274d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        /* renamed from: e */
        public static PlaybackState.CustomAction.Builder m275e(String str, CharSequence charSequence, int i2) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static String m276f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        /* renamed from: g */
        public static long m277g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        /* renamed from: h */
        public static long m278h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        /* renamed from: i */
        public static long m279i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        /* renamed from: j */
        public static List<PlaybackState.CustomAction> m280j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        /* renamed from: k */
        public static CharSequence m281k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        /* renamed from: l */
        public static Bundle m282l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        /* renamed from: m */
        public static int m283m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        /* renamed from: n */
        public static long m284n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        /* renamed from: o */
        public static CharSequence m285o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        /* renamed from: p */
        public static float m286p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        /* renamed from: q */
        public static long m287q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        /* renamed from: r */
        public static int m288r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        /* renamed from: s */
        public static void m289s(PlaybackState.Builder builder, long j2) {
            builder.setActions(j2);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m290t(PlaybackState.Builder builder, long j2) {
            builder.setActiveQueueItemId(j2);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m291u(PlaybackState.Builder builder, long j2) {
            builder.setBufferedPosition(j2);
        }

        @DoNotInline
        /* renamed from: v */
        public static void m292v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        /* renamed from: w */
        public static void m293w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: x */
        public static void m294x(PlaybackState.Builder builder, int i2, long j2, float f2, long j3) {
            builder.setState(i2, j2, f2, j3);
        }
    }

    @RequiresApi
    public static class Api22Impl {
        @DoNotInline
        /* renamed from: a */
        public static Bundle m295a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m296b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface State {
    }

    public PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f163b = i2;
        this.f164c = j2;
        this.f165d = j3;
        this.f166e = f2;
        this.f167f = j4;
        this.f168g = i3;
        this.f169h = charSequence;
        this.f170i = j5;
        this.f171j = new ArrayList(list);
        this.f172k = j6;
        this.f173l = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m270a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> m280j = Api21Impl.m280j(playbackState);
        if (m280j != null) {
            ArrayList arrayList2 = new ArrayList(m280j.size());
            for (PlaybackState.CustomAction customAction2 : m280j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle m282l = Api21Impl.m282l(customAction3);
                    MediaSessionCompat.m195a(m282l);
                    customAction = new CustomAction(Api21Impl.m276f(customAction3), Api21Impl.m285o(customAction3), Api21Impl.m283m(customAction3), m282l);
                    customAction.f190f = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = Api22Impl.m295a(playbackState);
            MediaSessionCompat.m195a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(Api21Impl.m288r(playbackState), Api21Impl.m287q(playbackState), Api21Impl.m279i(playbackState), Api21Impl.m286p(playbackState), Api21Impl.m277g(playbackState), 0, Api21Impl.m281k(playbackState), Api21Impl.m284n(playbackState), arrayList, Api21Impl.m278h(playbackState), bundle);
        playbackStateCompat.f174m = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f163b);
        sb.append(", position=");
        sb.append(this.f164c);
        sb.append(", buffered position=");
        sb.append(this.f165d);
        sb.append(", speed=");
        sb.append(this.f166e);
        sb.append(", updated=");
        sb.append(this.f170i);
        sb.append(", actions=");
        sb.append(this.f167f);
        sb.append(", error code=");
        sb.append(this.f168g);
        sb.append(", error message=");
        sb.append(this.f169h);
        sb.append(", custom actions=");
        sb.append(this.f171j);
        sb.append(", active item id=");
        return C0000a.m19p(sb, this.f172k, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f163b);
        parcel.writeLong(this.f164c);
        parcel.writeFloat(this.f166e);
        parcel.writeLong(this.f170i);
        parcel.writeLong(this.f165d);
        parcel.writeLong(this.f167f);
        TextUtils.writeToParcel(this.f169h, parcel, i2);
        parcel.writeTypedList(this.f171j);
        parcel.writeLong(this.f172k);
        parcel.writeBundle(this.f173l);
        parcel.writeInt(this.f168g);
    }

    public static final class Builder {

        /* renamed from: a */
        public final List<CustomAction> f175a;

        /* renamed from: b */
        public int f176b;

        /* renamed from: c */
        public long f177c;

        /* renamed from: d */
        public long f178d;

        /* renamed from: e */
        public float f179e;

        /* renamed from: f */
        public long f180f;

        /* renamed from: g */
        public int f181g;

        /* renamed from: h */
        public CharSequence f182h;

        /* renamed from: i */
        public long f183i;

        /* renamed from: j */
        public long f184j;

        /* renamed from: k */
        public Bundle f185k;

        public Builder() {
            this.f175a = new ArrayList();
            this.f184j = -1L;
        }

        /* renamed from: a */
        public PlaybackStateCompat m297a() {
            return new PlaybackStateCompat(this.f176b, this.f177c, this.f178d, this.f179e, this.f180f, this.f181g, this.f182h, this.f183i, this.f175a, this.f184j, this.f185k);
        }

        /* renamed from: b */
        public Builder m298b(int i2, long j2, float f2, long j3) {
            this.f176b = i2;
            this.f177c = j2;
            this.f183i = j3;
            this.f179e = f2;
            return this;
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f175a = arrayList;
            this.f184j = -1L;
            this.f176b = playbackStateCompat.f163b;
            this.f177c = playbackStateCompat.f164c;
            this.f179e = playbackStateCompat.f166e;
            this.f183i = playbackStateCompat.f170i;
            this.f178d = playbackStateCompat.f165d;
            this.f180f = playbackStateCompat.f167f;
            this.f181g = playbackStateCompat.f168g;
            this.f182h = playbackStateCompat.f169h;
            List<CustomAction> list = playbackStateCompat.f171j;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f184j = playbackStateCompat.f172k;
            this.f185k = playbackStateCompat.f173l;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        };

        /* renamed from: b */
        public final String f186b;

        /* renamed from: c */
        public final CharSequence f187c;

        /* renamed from: d */
        public final int f188d;

        /* renamed from: e */
        public final Bundle f189e;

        /* renamed from: f */
        public PlaybackState.CustomAction f190f;

        public static final class Builder {

            /* renamed from: a */
            public final String f191a;

            /* renamed from: b */
            public final CharSequence f192b;

            /* renamed from: c */
            public final int f193c;

            public Builder(String str, CharSequence charSequence, int i2) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(null)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i2 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f191a = str;
                this.f192b = null;
                this.f193c = i2;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f186b = str;
            this.f187c = charSequence;
            this.f188d = i2;
            this.f189e = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Action:mName='");
            m24u.append((Object) this.f187c);
            m24u.append(", mIcon=");
            m24u.append(this.f188d);
            m24u.append(", mExtras=");
            m24u.append(this.f189e);
            return m24u.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f186b);
            TextUtils.writeToParcel(this.f187c, parcel, i2);
            parcel.writeInt(this.f188d);
            parcel.writeBundle(this.f189e);
        }

        public CustomAction(Parcel parcel) {
            this.f186b = parcel.readString();
            this.f187c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f188d = parcel.readInt();
            this.f189e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f163b = parcel.readInt();
        this.f164c = parcel.readLong();
        this.f166e = parcel.readFloat();
        this.f170i = parcel.readLong();
        this.f165d = parcel.readLong();
        this.f167f = parcel.readLong();
        this.f169h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f171j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f172k = parcel.readLong();
        this.f173l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f168g = parcel.readInt();
    }
}
