package com.google.android.exoplayer2.ext.mediasession;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MediaSessionConnector {

    /* renamed from: l */
    public static final MediaMetadataCompat f10763l;

    /* renamed from: a */
    public final MediaSessionCompat f10764a;

    /* renamed from: b */
    public final Looper f10765b;

    /* renamed from: c */
    public final ComponentListener f10766c;

    /* renamed from: d */
    public final ArrayList<CommandReceiver> f10767d;

    /* renamed from: e */
    public final ArrayList<CommandReceiver> f10768e;

    /* renamed from: f */
    public CustomActionProvider[] f10769f;

    /* renamed from: g */
    public Map<String, CustomActionProvider> f10770g;

    /* renamed from: h */
    @Nullable
    public MediaMetadataProvider f10771h;

    /* renamed from: i */
    @Nullable
    public Player f10772i;

    /* renamed from: j */
    @Nullable
    public QueueNavigator f10773j;

    /* renamed from: k */
    public long f10774k;

    public interface CaptionCallback extends CommandReceiver {
    }

    public interface CommandReceiver {
        /* renamed from: g */
        boolean mo6337g(Player player, String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver);
    }

    public class ComponentListener extends MediaSessionCompat.Callback implements Player.Listener {

        /* renamed from: g */
        public int f10775g;

        /* renamed from: h */
        public int f10776h;

        public ComponentListener(C10021 c10021) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: A */
        public void mo205A() {
            if (MediaSessionConnector.m6333b(MediaSessionConnector.this, 16L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.f10773j.mo6344d(mediaSessionConnector.f10772i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: B */
        public void mo206B(long j2) {
            if (MediaSessionConnector.m6333b(MediaSessionConnector.this, 4096L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.f10773j.mo6346f(mediaSessionConnector.f10772i, j2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: C */
        public void mo207C() {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 1L)) {
                MediaSessionConnector.this.f10772i.stop();
                MediaSessionConnector.this.f10772i.mo5644i();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: b */
        public void mo210b(MediaDescriptionCompat mediaDescriptionCompat) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: c */
        public void mo211c(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: d */
        public void mo212d(String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver) {
            if (MediaSessionConnector.this.f10772i != null) {
                for (int i2 = 0; i2 < MediaSessionConnector.this.f10767d.size(); i2++) {
                    if (MediaSessionConnector.this.f10767d.get(i2).mo6337g(MediaSessionConnector.this.f10772i, str, bundle, resultReceiver)) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < MediaSessionConnector.this.f10768e.size() && !MediaSessionConnector.this.f10768e.get(i3).mo6337g(MediaSessionConnector.this.f10772i, str, bundle, resultReceiver); i3++) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: e */
        public void mo213e(String str, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            if (mediaSessionConnector.f10772i == null || !mediaSessionConnector.f10770g.containsKey(str)) {
                return;
            }
            MediaSessionConnector.this.f10770g.get(str).mo6338a(MediaSessionConnector.this.f10772i, str, bundle);
            MediaSessionConnector.this.m6335d();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: f */
        public void mo214f() {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 64L)) {
                MediaSessionConnector.this.f10772i.mo5634H();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: g */
        public boolean mo215g(Intent intent) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
            return super.mo215g(intent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: h */
        public void mo216h() {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 2L)) {
                MediaSessionConnector.this.f10772i.pause();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: i */
        public void mo217i() {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 4L)) {
                if (MediaSessionConnector.this.f10772i.getPlaybackState() == 1) {
                    Objects.requireNonNull(MediaSessionConnector.this);
                    MediaSessionConnector.this.f10772i.prepare();
                } else if (MediaSessionConnector.this.f10772i.getPlaybackState() == 4) {
                    Player player = MediaSessionConnector.this.f10772i;
                    player.mo5728e(player.getCurrentMediaItemIndex(), -9223372036854775807L);
                }
                Player player2 = MediaSessionConnector.this.f10772i;
                Objects.requireNonNull(player2);
                player2.play();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: j */
        public void mo218j(String str, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: k */
        public void mo219k(String str, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: l */
        public void mo220l(Uri uri, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: m */
        public void mo221m() {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: n */
        public void mo222n(String str, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: o */
        public void mo223o(String str, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            if (r6.f10775g == r4) goto L24;
         */
        @Override // com.google.android.exoplayer2.Player.EventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onEvents(com.google.android.exoplayer2.Player r7, com.google.android.exoplayer2.Player.Events r8) {
            /*
                r6 = this;
                r0 = 11
                boolean r0 = r8.m5927a(r0)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L20
                int r0 = r6.f10775g
                int r3 = r7.getCurrentMediaItemIndex()
                if (r0 == r3) goto L1d
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r0 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r0 = r0.f10773j
                if (r0 == 0) goto L1b
                r0.mo6345e(r7)
            L1b:
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                r3 = 1
                goto L22
            L20:
                r0 = 0
                r3 = 0
            L22:
                boolean r4 = r8.m5927a(r1)
                if (r4 == 0) goto L4b
                com.google.android.exoplayer2.Timeline r0 = r7.getCurrentTimeline()
                int r0 = r0.mo5937r()
                int r4 = r7.getCurrentMediaItemIndex()
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r5 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r5 = r5.f10773j
                if (r5 == 0) goto L3f
                r5.mo6347h(r7)
            L3d:
                r3 = 1
                goto L48
            L3f:
                int r5 = r6.f10776h
                if (r5 != r0) goto L3d
                int r5 = r6.f10775g
                if (r5 == r4) goto L48
                goto L3d
            L48:
                r6.f10776h = r0
                r0 = 1
            L4b:
                int r7 = r7.getCurrentMediaItemIndex()
                r6.f10775g = r7
                r7 = 5
                int[] r7 = new int[r7]
                r7 = {x0088: FILL_ARRAY_DATA , data: [4, 5, 7, 8, 12} // fill-array
                boolean r7 = r8.m5928b(r7)
                if (r7 == 0) goto L5e
                r3 = 1
            L5e:
                int[] r7 = new int[r2]
                r4 = 9
                r7[r1] = r4
                boolean r7 = r8.m5928b(r7)
                if (r7 == 0) goto L78
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r7 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r8 = r7.f10773j
                if (r8 == 0) goto L79
                com.google.android.exoplayer2.Player r7 = r7.f10772i
                if (r7 == 0) goto L79
                r8.mo6347h(r7)
                goto L79
            L78:
                r2 = r3
            L79:
                if (r2 == 0) goto L80
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r7 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                r7.m6335d()
            L80:
                if (r0 == 0) goto L87
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r7 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                r7.m6334c()
            L87:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.ComponentListener.onEvents(com.google.android.exoplayer2.Player, com.google.android.exoplayer2.Player$Events):void");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksInfoChanged(TracksInfo tracksInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: p */
        public void mo224p(Uri uri, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: q */
        public void mo225q(MediaDescriptionCompat mediaDescriptionCompat) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: r */
        public void mo226r() {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 8L)) {
                MediaSessionConnector.this.f10772i.mo5635I();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: s */
        public void mo227s(long j2) {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 256L)) {
                Player player = MediaSessionConnector.this.f10772i;
                player.mo5728e(player.getCurrentMediaItemIndex(), j2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: t */
        public void mo228t(boolean z) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: u */
        public void mo229u(float f2) {
            if (!MediaSessionConnector.m6332a(MediaSessionConnector.this, 4194304L) || f2 <= 0.0f) {
                return;
            }
            Player player = MediaSessionConnector.this.f10772i;
            player.mo5726d(new PlaybackParameters(f2, player.getPlaybackParameters().f9950c));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: v */
        public void mo230v(RatingCompat ratingCompat) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: w */
        public void mo231w(RatingCompat ratingCompat, @Nullable Bundle bundle) {
            MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
            MediaMetadataCompat mediaMetadataCompat = MediaSessionConnector.f10763l;
            Objects.requireNonNull(mediaSessionConnector);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: x */
        public void mo232x(int i2) {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 262144L)) {
                int i3 = 2;
                if (i2 == 1) {
                    i3 = 1;
                } else if (i2 != 2 && i2 != 3) {
                    i3 = 0;
                }
                MediaSessionConnector.this.f10772i.mo5730f(i3);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: y */
        public void mo233y(int i2) {
            if (MediaSessionConnector.m6332a(MediaSessionConnector.this, 2097152L)) {
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    z = false;
                }
                MediaSessionConnector.this.f10772i.mo5736k(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /* renamed from: z */
        public void mo234z() {
            if (MediaSessionConnector.m6333b(MediaSessionConnector.this, 32L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.f10773j.mo6341a(mediaSessionConnector.f10772i);
            }
        }
    }

    public interface CustomActionProvider {
        /* renamed from: a */
        void mo6338a(Player player, String str, @Nullable Bundle bundle);

        @Nullable
        /* renamed from: b */
        PlaybackStateCompat.CustomAction mo6339b(Player player);
    }

    public static final class DefaultMediaMetadataProvider implements MediaMetadataProvider {

        /* renamed from: a */
        public final MediaControllerCompat f10778a;

        /* renamed from: b */
        public final String f10779b = "";

        public DefaultMediaMetadataProvider(MediaControllerCompat mediaControllerCompat, @Nullable String str) {
            this.f10778a = mediaControllerCompat;
        }

        @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.MediaMetadataProvider
        /* renamed from: a */
        public MediaMetadataCompat mo6340a(Player player) {
            if (player.getCurrentTimeline().m5991s()) {
                return MediaSessionConnector.f10763l;
            }
            MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder();
            if (player.isPlayingAd()) {
                builder.m117c("android.media.metadata.ADVERTISEMENT", 1L);
            }
            builder.m117c("android.media.metadata.DURATION", (player.isCurrentMediaItemDynamic() || player.getDuration() == -9223372036854775807L) ? -1L : player.getDuration());
            long j2 = this.f10778a.m190b().f172k;
            if (j2 != -1) {
                List<MediaSessionCompat.QueueItem> m191c = this.f10778a.m191c();
                int i2 = 0;
                while (true) {
                    if (m191c == null || i2 >= m191c.size()) {
                        break;
                    }
                    MediaSessionCompat.QueueItem queueItem = m191c.get(i2);
                    if (queueItem.f151c == j2) {
                        MediaDescriptionCompat mediaDescriptionCompat = queueItem.f150b;
                        Bundle bundle = mediaDescriptionCompat.f61h;
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                Object obj = bundle.get(str);
                                if (obj instanceof String) {
                                    String valueOf = String.valueOf(this.f10779b);
                                    String valueOf2 = String.valueOf(str);
                                    builder.m119e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    String valueOf3 = String.valueOf(this.f10779b);
                                    String valueOf4 = String.valueOf(str);
                                    String concat = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                                    CharSequence charSequence = (CharSequence) obj;
                                    ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f72d;
                                    if ((arrayMap.m1119f(concat) >= 0) && arrayMap.getOrDefault(concat, null).intValue() != 1) {
                                        throw new IllegalArgumentException(C0000a.m16m("The ", concat, " key cannot be used to put a CharSequence"));
                                    }
                                    builder.f75a.putCharSequence(concat, charSequence);
                                } else if (obj instanceof Long) {
                                    String valueOf5 = String.valueOf(this.f10779b);
                                    String valueOf6 = String.valueOf(str);
                                    builder.m117c(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5), ((Long) obj).longValue());
                                } else if (obj instanceof Integer) {
                                    String valueOf7 = String.valueOf(this.f10779b);
                                    String valueOf8 = String.valueOf(str);
                                    builder.m117c(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7), ((Integer) obj).intValue());
                                } else if (obj instanceof Bitmap) {
                                    String valueOf9 = String.valueOf(this.f10779b);
                                    String valueOf10 = String.valueOf(str);
                                    builder.m116b(valueOf10.length() != 0 ? valueOf9.concat(valueOf10) : new String(valueOf9), (Bitmap) obj);
                                } else if (obj instanceof RatingCompat) {
                                    String valueOf11 = String.valueOf(this.f10779b);
                                    String valueOf12 = String.valueOf(str);
                                    builder.m118d(valueOf12.length() != 0 ? valueOf11.concat(valueOf12) : new String(valueOf11), (RatingCompat) obj);
                                }
                            }
                        }
                        CharSequence charSequence2 = mediaDescriptionCompat.f56c;
                        if (charSequence2 != null) {
                            String valueOf13 = String.valueOf(charSequence2);
                            builder.m119e("android.media.metadata.TITLE", valueOf13);
                            builder.m119e("android.media.metadata.DISPLAY_TITLE", valueOf13);
                        }
                        CharSequence charSequence3 = mediaDescriptionCompat.f57d;
                        if (charSequence3 != null) {
                            builder.m119e("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                        }
                        CharSequence charSequence4 = mediaDescriptionCompat.f58e;
                        if (charSequence4 != null) {
                            builder.m119e("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                        }
                        Bitmap bitmap = mediaDescriptionCompat.f59f;
                        if (bitmap != null) {
                            builder.m116b("android.media.metadata.DISPLAY_ICON", bitmap);
                        }
                        Uri uri = mediaDescriptionCompat.f60g;
                        if (uri != null) {
                            builder.m119e("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                        }
                        String str2 = mediaDescriptionCompat.f55b;
                        if (str2 != null) {
                            builder.m119e("android.media.metadata.MEDIA_ID", str2);
                        }
                        Uri uri2 = mediaDescriptionCompat.f62i;
                        if (uri2 != null) {
                            builder.m119e("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                        }
                    } else {
                        i2++;
                    }
                }
            }
            return builder.m115a();
        }
    }

    public interface MediaButtonEventHandler {
    }

    public interface MediaMetadataProvider {
        /* renamed from: a */
        MediaMetadataCompat mo6340a(Player player);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackActions {
    }

    public interface PlaybackPreparer extends CommandReceiver {
    }

    public interface QueueEditor extends CommandReceiver {
    }

    public interface QueueNavigator extends CommandReceiver {
        /* renamed from: a */
        void mo6341a(Player player);

        /* renamed from: b */
        long mo6342b(Player player);

        /* renamed from: c */
        long mo6343c(@Nullable Player player);

        /* renamed from: d */
        void mo6344d(Player player);

        /* renamed from: e */
        void mo6345e(Player player);

        /* renamed from: f */
        void mo6346f(Player player, long j2);

        /* renamed from: h */
        void mo6347h(Player player);
    }

    public interface RatingCallback extends CommandReceiver {
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.mediasession");
        f10763l = new MediaMetadataCompat.Builder().m115a();
    }

    public MediaSessionConnector(MediaSessionCompat mediaSessionCompat) {
        this.f10764a = mediaSessionCompat;
        Looper m7753v = Util.m7753v();
        this.f10765b = m7753v;
        ComponentListener componentListener = new ComponentListener(null);
        this.f10766c = componentListener;
        this.f10767d = new ArrayList<>();
        this.f10768e = new ArrayList<>();
        this.f10769f = new CustomActionProvider[0];
        this.f10770g = Collections.emptyMap();
        this.f10771h = new DefaultMediaMetadataProvider(mediaSessionCompat.f97b, null);
        this.f10774k = 2360143L;
        mediaSessionCompat.m200e(3);
        mediaSessionCompat.m199d(componentListener, new Handler(m7753v));
    }

    /* renamed from: a */
    public static boolean m6332a(MediaSessionConnector mediaSessionConnector, long j2) {
        return (mediaSessionConnector.f10772i == null || (j2 & mediaSessionConnector.f10774k) == 0) ? false : true;
    }

    /* renamed from: b */
    public static boolean m6333b(MediaSessionConnector mediaSessionConnector, long j2) {
        QueueNavigator queueNavigator;
        Player player = mediaSessionConnector.f10772i;
        return (player == null || (queueNavigator = mediaSessionConnector.f10773j) == null || (j2 & queueNavigator.mo6342b(player)) == 0) ? false : true;
    }

    /* renamed from: c */
    public final void m6334c() {
        Player player;
        MediaMetadataProvider mediaMetadataProvider = this.f10771h;
        this.f10764a.m201f((mediaMetadataProvider == null || (player = this.f10772i) == null) ? f10763l : mediaMetadataProvider.mo6340a(player));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x007e, code lost:
    
        if (r4 != false) goto L32;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6335d() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.m6335d():void");
    }

    /* renamed from: e */
    public void m6336e(@Nullable Player player) {
        Assertions.m7513a(player == null || player.mo5711D() == this.f10765b);
        Player player2 = this.f10772i;
        if (player2 != null) {
            player2.mo5740p(this.f10766c);
        }
        this.f10772i = player;
        if (player != null) {
            player.mo5745w(this.f10766c);
        }
        m6335d();
        m6334c();
    }
}
