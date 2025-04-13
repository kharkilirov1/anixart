package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C1026l implements ListenerSet.Event, Bundleable.Creator {

    /* renamed from: c */
    public static final /* synthetic */ C1026l f11800c = new C1026l(0);

    /* renamed from: d */
    public static final /* synthetic */ C1026l f11801d = new C1026l(1);

    /* renamed from: e */
    public static final /* synthetic */ C1026l f11802e = new C1026l(2);

    /* renamed from: f */
    public static final /* synthetic */ C1026l f11803f = new C1026l(3);

    /* renamed from: g */
    public static final /* synthetic */ C1026l f11804g = new C1026l(4);

    /* renamed from: h */
    public static final /* synthetic */ C1026l f11805h = new C1026l(5);

    /* renamed from: i */
    public static final /* synthetic */ C1026l f11806i = new C1026l(6);

    /* renamed from: j */
    public static final /* synthetic */ C1026l f11807j = new C1026l(7);

    /* renamed from: k */
    public static final /* synthetic */ C1026l f11808k = new C1026l(8);

    /* renamed from: l */
    public static final /* synthetic */ C1026l f11809l = new C1026l(9);

    /* renamed from: m */
    public static final /* synthetic */ C1026l f11810m = new C1026l(10);

    /* renamed from: n */
    public static final /* synthetic */ C1026l f11811n = new C1026l(11);

    /* renamed from: o */
    public static final /* synthetic */ C1026l f11812o = new C1026l(14);

    /* renamed from: p */
    public static final /* synthetic */ C1026l f11813p = new C1026l(15);

    /* renamed from: q */
    public static final /* synthetic */ C1026l f11814q = new C1026l(16);

    /* renamed from: r */
    public static final /* synthetic */ C1026l f11815r = new C1026l(17);

    /* renamed from: s */
    public static final /* synthetic */ C1026l f11816s = new C1026l(19);

    /* renamed from: t */
    public static final /* synthetic */ C1026l f11817t = new C1026l(20);

    /* renamed from: u */
    public static final /* synthetic */ C1026l f11818u = new C1026l(22);

    /* renamed from: b */
    public final /* synthetic */ int f11819b;

    public /* synthetic */ C1026l(int i2) {
        this.f11819b = i2;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i2 = 0;
        boolean z = true;
        switch (this.f11819b) {
            case 1:
                return new DeviceInfo(bundle.getInt(DeviceInfo.m5700b(0), 0), bundle.getInt(DeviceInfo.m5700b(1), 0), bundle.getInt(DeviceInfo.m5700b(2), 0));
            case 2:
                return new ExoPlaybackException(bundle);
            case 3:
            default:
                Bundleable.Creator<TracksInfo.TrackGroupInfo> creator = TracksInfo.TrackGroupInfo.f10083f;
                TrackGroup trackGroup = (TrackGroup) BundleableUtil.m7524c(TrackGroup.f12588e, bundle.getBundle(TracksInfo.TrackGroupInfo.m6008b(0)));
                Objects.requireNonNull(trackGroup);
                return new TracksInfo.TrackGroupInfo(trackGroup, (int[]) MoreObjects.m11165a(bundle.getIntArray(TracksInfo.TrackGroupInfo.m6008b(1)), new int[trackGroup.f12589b]), bundle.getInt(TracksInfo.TrackGroupInfo.m6008b(2), -1), (boolean[]) MoreObjects.m11165a(bundle.getBooleanArray(TracksInfo.TrackGroupInfo.m6008b(3)), new boolean[trackGroup.f12589b]));
            case 4:
                Format format = Format.f9639H;
                Format.Builder builder = new Format.Builder();
                if (bundle != null) {
                    ClassLoader classLoader = BundleableUtil.class.getClassLoader();
                    int i3 = Util.f14736a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Format.m5826f(0));
                Format format2 = Format.f9639H;
                builder.f9677a = (String) Format.m5825d(string, format2.f9648b);
                builder.f9678b = (String) Format.m5825d(bundle.getString(Format.m5826f(1)), format2.f9649c);
                builder.f9679c = (String) Format.m5825d(bundle.getString(Format.m5826f(2)), format2.f9650d);
                builder.f9680d = bundle.getInt(Format.m5826f(3), format2.f9651e);
                builder.f9681e = bundle.getInt(Format.m5826f(4), format2.f9652f);
                builder.f9682f = bundle.getInt(Format.m5826f(5), format2.f9653g);
                builder.f9683g = bundle.getInt(Format.m5826f(6), format2.f9654h);
                builder.f9684h = (String) Format.m5825d(bundle.getString(Format.m5826f(7)), format2.f9656j);
                builder.f9685i = (Metadata) Format.m5825d((Metadata) bundle.getParcelable(Format.m5826f(8)), format2.f9657k);
                builder.f9686j = (String) Format.m5825d(bundle.getString(Format.m5826f(9)), format2.f9658l);
                builder.f9687k = (String) Format.m5825d(bundle.getString(Format.m5826f(10)), format2.f9659m);
                builder.f9688l = bundle.getInt(Format.m5826f(11), format2.f9660n);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Format.m5827g(i2));
                    if (byteArray == null) {
                        builder.f9689m = arrayList;
                        builder.f9690n = (DrmInitData) bundle.getParcelable(Format.m5826f(13));
                        String m5826f = Format.m5826f(14);
                        Format format3 = Format.f9639H;
                        builder.f9691o = bundle.getLong(m5826f, format3.f9663q);
                        builder.f9692p = bundle.getInt(Format.m5826f(15), format3.f9664r);
                        builder.f9693q = bundle.getInt(Format.m5826f(16), format3.f9665s);
                        builder.f9694r = bundle.getFloat(Format.m5826f(17), format3.f9666t);
                        builder.f9695s = bundle.getInt(Format.m5826f(18), format3.f9667u);
                        builder.f9696t = bundle.getFloat(Format.m5826f(19), format3.f9668v);
                        builder.f9697u = bundle.getByteArray(Format.m5826f(20));
                        builder.f9698v = bundle.getInt(Format.m5826f(21), format3.f9670x);
                        builder.f9699w = (ColorInfo) BundleableUtil.m7524c(ColorInfo.f14760g, bundle.getBundle(Format.m5826f(22)));
                        builder.f9700x = bundle.getInt(Format.m5826f(23), format3.f9672z);
                        builder.f9701y = bundle.getInt(Format.m5826f(24), format3.f9641A);
                        builder.f9702z = bundle.getInt(Format.m5826f(25), format3.f9642B);
                        builder.f9673A = bundle.getInt(Format.m5826f(26), format3.f9643C);
                        builder.f9674B = bundle.getInt(Format.m5826f(27), format3.f9644D);
                        builder.f9675C = bundle.getInt(Format.m5826f(28), format3.f9645E);
                        builder.f9676D = bundle.getInt(Format.m5826f(29), format3.f9646F);
                        return builder.m5833a();
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            case 5:
                Assertions.m7513a(bundle.getInt(HeartRating.m5836b(0), -1) == 0);
                return bundle.getBoolean(HeartRating.m5836b(1), false) ? new HeartRating(bundle.getBoolean(HeartRating.m5836b(2), false)) : new HeartRating();
            case 6:
                String string2 = bundle.getString(MediaItem.m5837c(0), "");
                Objects.requireNonNull(string2);
                Bundle bundle4 = bundle.getBundle(MediaItem.m5837c(1));
                MediaItem.LiveConfiguration liveConfiguration = bundle4 == null ? MediaItem.LiveConfiguration.f9758g : (MediaItem.LiveConfiguration) ((C1026l) MediaItem.LiveConfiguration.f9759h).fromBundle(bundle4);
                Bundle bundle5 = bundle.getBundle(MediaItem.m5837c(2));
                MediaMetadata mediaMetadata = bundle5 == null ? MediaMetadata.f9790I : (MediaMetadata) ((C1026l) MediaMetadata.f9791J).fromBundle(bundle5);
                Bundle bundle6 = bundle.getBundle(MediaItem.m5837c(3));
                return new MediaItem(string2, bundle6 == null ? MediaItem.ClippingProperties.f9741h : (MediaItem.ClippingProperties) ((C1026l) MediaItem.ClippingConfiguration.f9730g).fromBundle(bundle6), null, liveConfiguration, mediaMetadata);
            case 7:
                Bundleable.Creator<MediaItem.ClippingProperties> creator2 = MediaItem.ClippingConfiguration.f9730g;
                MediaItem.ClippingConfiguration.Builder builder2 = new MediaItem.ClippingConfiguration.Builder();
                long j2 = bundle.getLong(MediaItem.ClippingConfiguration.m5841b(0), 0L);
                Assertions.m7513a(j2 >= 0);
                builder2.f9736a = j2;
                long j3 = bundle.getLong(MediaItem.ClippingConfiguration.m5841b(1), Long.MIN_VALUE);
                if (j3 != Long.MIN_VALUE && j3 < 0) {
                    z = false;
                }
                Assertions.m7513a(z);
                builder2.f9737b = j3;
                builder2.f9738c = bundle.getBoolean(MediaItem.ClippingConfiguration.m5841b(2), false);
                builder2.f9739d = bundle.getBoolean(MediaItem.ClippingConfiguration.m5841b(3), false);
                builder2.f9740e = bundle.getBoolean(MediaItem.ClippingConfiguration.m5841b(4), false);
                return builder2.m5842a();
            case 8:
                return new MediaItem.LiveConfiguration(bundle.getLong(MediaItem.LiveConfiguration.m5843c(0), -9223372036854775807L), bundle.getLong(MediaItem.LiveConfiguration.m5843c(1), -9223372036854775807L), bundle.getLong(MediaItem.LiveConfiguration.m5843c(2), -9223372036854775807L), bundle.getFloat(MediaItem.LiveConfiguration.m5843c(3), -3.4028235E38f), bundle.getFloat(MediaItem.LiveConfiguration.m5843c(4), -3.4028235E38f));
            case 9:
                MediaMetadata.Builder builder3 = new MediaMetadata.Builder();
                builder3.f9831a = bundle.getCharSequence(MediaMetadata.m5846c(0));
                builder3.f9832b = bundle.getCharSequence(MediaMetadata.m5846c(1));
                builder3.f9833c = bundle.getCharSequence(MediaMetadata.m5846c(2));
                builder3.f9834d = bundle.getCharSequence(MediaMetadata.m5846c(3));
                builder3.f9835e = bundle.getCharSequence(MediaMetadata.m5846c(4));
                builder3.f9836f = bundle.getCharSequence(MediaMetadata.m5846c(5));
                builder3.f9837g = bundle.getCharSequence(MediaMetadata.m5846c(6));
                builder3.f9838h = (Uri) bundle.getParcelable(MediaMetadata.m5846c(7));
                byte[] byteArray2 = bundle.getByteArray(MediaMetadata.m5846c(10));
                Integer m4110i = bundle.containsKey(MediaMetadata.m5846c(29)) ? C0576a.m4110i(29, bundle) : null;
                builder3.f9841k = byteArray2 == null ? null : (byte[]) byteArray2.clone();
                builder3.f9842l = m4110i;
                builder3.f9843m = (Uri) bundle.getParcelable(MediaMetadata.m5846c(11));
                builder3.f9854x = bundle.getCharSequence(MediaMetadata.m5846c(22));
                builder3.f9855y = bundle.getCharSequence(MediaMetadata.m5846c(23));
                builder3.f9856z = bundle.getCharSequence(MediaMetadata.m5846c(24));
                builder3.f9827C = bundle.getCharSequence(MediaMetadata.m5846c(27));
                builder3.f9828D = bundle.getCharSequence(MediaMetadata.m5846c(28));
                builder3.f9829E = bundle.getCharSequence(MediaMetadata.m5846c(30));
                builder3.f9830F = bundle.getBundle(MediaMetadata.m5846c(1000));
                if (bundle.containsKey(MediaMetadata.m5846c(8)) && (bundle3 = bundle.getBundle(MediaMetadata.m5846c(8))) != null) {
                    builder3.f9839i = (Rating) ((C1026l) Rating.f9983b).fromBundle(bundle3);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(9)) && (bundle2 = bundle.getBundle(MediaMetadata.m5846c(9))) != null) {
                    builder3.f9840j = (Rating) ((C1026l) Rating.f9983b).fromBundle(bundle2);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(12))) {
                    builder3.f9844n = C0576a.m4110i(12, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(13))) {
                    builder3.f9845o = C0576a.m4110i(13, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(14))) {
                    builder3.f9846p = C0576a.m4110i(14, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(15))) {
                    builder3.f9847q = Boolean.valueOf(bundle.getBoolean(MediaMetadata.m5846c(15)));
                }
                if (bundle.containsKey(MediaMetadata.m5846c(16))) {
                    builder3.f9848r = C0576a.m4110i(16, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(17))) {
                    builder3.f9849s = C0576a.m4110i(17, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(18))) {
                    builder3.f9850t = C0576a.m4110i(18, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(19))) {
                    builder3.f9851u = C0576a.m4110i(19, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(20))) {
                    builder3.f9852v = C0576a.m4110i(20, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(21))) {
                    builder3.f9853w = C0576a.m4110i(21, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(25))) {
                    builder3.f9825A = C0576a.m4110i(25, bundle);
                }
                if (bundle.containsKey(MediaMetadata.m5846c(26))) {
                    builder3.f9826B = C0576a.m4110i(26, bundle);
                }
                return builder3.m5848a();
            case 10:
                Assertions.m7513a(bundle.getInt(PercentageRating.m5910b(0), -1) == 1);
                float f2 = bundle.getFloat(PercentageRating.m5910b(1), -1.0f);
                return f2 == -1.0f ? new PercentageRating() : new PercentageRating(f2);
            case 11:
                return new PlaybackException(bundle);
            case 12:
                return new PlaybackParameters(bundle.getFloat(PlaybackParameters.m5921b(0), 1.0f), bundle.getFloat(PlaybackParameters.m5921b(1), 1.0f));
            case 13:
                Player.Commands commands = Player.Commands.f9952c;
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
                if (integerArrayList == null) {
                    return Player.Commands.f9952c;
                }
                Player.Commands.Builder builder4 = new Player.Commands.Builder();
                for (int i4 = 0; i4 < integerArrayList.size(); i4++) {
                    builder4.m5923a(integerArrayList.get(i4).intValue());
                }
                return builder4.m5926d();
            case 14:
                return new Player.PositionInfo(null, bundle.getInt(Player.PositionInfo.m5929b(0), -1), (MediaItem) BundleableUtil.m7524c(MediaItem.f9712h, bundle.getBundle(Player.PositionInfo.m5929b(1))), null, bundle.getInt(Player.PositionInfo.m5929b(2), -1), bundle.getLong(Player.PositionInfo.m5929b(3), -9223372036854775807L), bundle.getLong(Player.PositionInfo.m5929b(4), -9223372036854775807L), bundle.getInt(Player.PositionInfo.m5929b(5), -1), bundle.getInt(Player.PositionInfo.m5929b(6), -1));
            case 15:
                Bundleable.Creator<Rating> creator3 = Rating.f9983b;
                int i5 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i5 == 0) {
                    return (Rating) ((C1026l) HeartRating.f9708e).fromBundle(bundle);
                }
                if (i5 == 1) {
                    return (Rating) ((C1026l) PercentageRating.f9924d).fromBundle(bundle);
                }
                if (i5 == 2) {
                    return (Rating) ((C1026l) StarRating.f10031e).fromBundle(bundle);
                }
                if (i5 == 3) {
                    return (Rating) ((C1026l) ThumbRating.f10044e).fromBundle(bundle);
                }
                throw new IllegalArgumentException(C0576a.m4111j(44, "Encountered unknown rating type: ", i5));
            case 16:
                Assertions.m7513a(bundle.getInt(StarRating.m5979b(0), -1) == 2);
                int i6 = bundle.getInt(StarRating.m5979b(1), 5);
                float f3 = bundle.getFloat(StarRating.m5979b(2), -1.0f);
                return f3 == -1.0f ? new StarRating(i6) : new StarRating(i6, f3);
            case 17:
                Assertions.m7513a(bundle.getInt(ThumbRating.m5983b(0), -1) == 3);
                return bundle.getBoolean(ThumbRating.m5983b(1), false) ? new ThumbRating(bundle.getBoolean(ThumbRating.m5983b(2), false)) : new ThumbRating();
            case 18:
                ImmutableList m5984b = Timeline.m5984b(Timeline.Window.f10063v, BundleUtil.m7520a(bundle, Timeline.m5985t(0)));
                ImmutableList m5984b2 = Timeline.m5984b(Timeline.Period.f10048i, BundleUtil.m7520a(bundle, Timeline.m5985t(1)));
                int[] intArray = bundle.getIntArray(Timeline.m5985t(2));
                if (intArray == null) {
                    int size = m5984b.size();
                    int[] iArr = new int[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        iArr[i7] = i7;
                    }
                    intArray = iArr;
                }
                return new Timeline.RemotableTimeline(m5984b, m5984b2, intArray);
            case 19:
                int i8 = bundle.getInt(Timeline.Period.m5992h(0), 0);
                long j4 = bundle.getLong(Timeline.Period.m5992h(1), -9223372036854775807L);
                long j5 = bundle.getLong(Timeline.Period.m5992h(2), 0L);
                boolean z2 = bundle.getBoolean(Timeline.Period.m5992h(3));
                Bundle bundle7 = bundle.getBundle(Timeline.Period.m5992h(4));
                AdPlaybackState adPlaybackState = bundle7 != null ? (AdPlaybackState) ((C0954j) AdPlaybackState.f12601j).fromBundle(bundle7) : AdPlaybackState.f12599h;
                Timeline.Period period = new Timeline.Period();
                period.m6000j(null, null, i8, j4, j5, adPlaybackState, z2);
                return period;
            case 20:
                Bundle bundle8 = bundle.getBundle(Timeline.Window.m6001e(1));
                MediaItem mediaItem = bundle8 != null ? (MediaItem) ((C1026l) MediaItem.f9712h).fromBundle(bundle8) : null;
                long j6 = bundle.getLong(Timeline.Window.m6001e(2), -9223372036854775807L);
                long j7 = bundle.getLong(Timeline.Window.m6001e(3), -9223372036854775807L);
                long j8 = bundle.getLong(Timeline.Window.m6001e(4), -9223372036854775807L);
                boolean z3 = bundle.getBoolean(Timeline.Window.m6001e(5), false);
                boolean z4 = bundle.getBoolean(Timeline.Window.m6001e(6), false);
                Bundle bundle9 = bundle.getBundle(Timeline.Window.m6001e(7));
                MediaItem.LiveConfiguration liveConfiguration2 = bundle9 != null ? (MediaItem.LiveConfiguration) ((C1026l) MediaItem.LiveConfiguration.f9759h).fromBundle(bundle9) : null;
                boolean z5 = bundle.getBoolean(Timeline.Window.m6001e(8), false);
                long j9 = bundle.getLong(Timeline.Window.m6001e(9), 0L);
                long j10 = bundle.getLong(Timeline.Window.m6001e(10), -9223372036854775807L);
                int i9 = bundle.getInt(Timeline.Window.m6001e(11), 0);
                int i10 = bundle.getInt(Timeline.Window.m6001e(12), 0);
                long j11 = bundle.getLong(Timeline.Window.m6001e(13), 0L);
                Timeline.Window window = new Timeline.Window();
                window.m6005f(Timeline.Window.f10061t, mediaItem, null, j6, j7, j8, z3, z4, liveConfiguration2, j9, j10, i9, i10, j11);
                window.f10075m = z5;
                return window;
            case 21:
                TracksInfo tracksInfo = TracksInfo.f10081c;
                return new TracksInfo(BundleableUtil.m7523b(TracksInfo.TrackGroupInfo.f10083f, bundle.getParcelableArrayList(Integer.toString(0, 36)), ImmutableList.m11627D()));
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f11819b) {
            case 0:
                int i2 = ExoPlayerImpl.f9532H;
                ((Player.EventListener) obj).onPlayerError(ExoPlaybackException.m5701d(new ExoTimeoutException(1), 1003));
                break;
            default:
                ((Player.EventListener) obj).onSeekProcessed();
                break;
        }
    }
}
