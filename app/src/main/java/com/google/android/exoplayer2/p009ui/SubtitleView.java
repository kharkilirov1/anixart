package com.google.android.exoplayer2.p009ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.LanguageFeatureSpan;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements Player.Listener {

    /* renamed from: b */
    public List<Cue> f14290b;

    /* renamed from: c */
    public CaptionStyleCompat f14291c;

    /* renamed from: d */
    public int f14292d;

    /* renamed from: e */
    public float f14293e;

    /* renamed from: f */
    public float f14294f;

    /* renamed from: g */
    public boolean f14295g;

    /* renamed from: h */
    public boolean f14296h;

    /* renamed from: i */
    public int f14297i;

    /* renamed from: j */
    public Output f14298j;

    /* renamed from: k */
    public View f14299k;

    public interface Output {
        /* renamed from: a */
        void mo7344a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f2, int i2, float f3);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14290b = Collections.emptyList();
        this.f14291c = CaptionStyleCompat.f14079g;
        this.f14292d = 0;
        this.f14293e = 0.0533f;
        this.f14294f = 0.08f;
        this.f14295g = true;
        this.f14296h = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.f14298j = canvasSubtitleOutput;
        this.f14299k = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f14297i = 1;
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f14295g && this.f14296h) {
            return this.f14290b;
        }
        ArrayList arrayList = new ArrayList(this.f14290b.size());
        for (int i2 = 0; i2 < this.f14290b.size(); i2++) {
            Cue.Builder m7177b = this.f14290b.get(i2).m7177b();
            if (!this.f14295g) {
                m7177b.f13467n = false;
                CharSequence charSequence = m7177b.f13454a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        m7177b.f13454a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = m7177b.f13454a;
                    Objects.requireNonNull(charSequence2);
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof LanguageFeatureSpan)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                SubtitleViewUtils.m7413a(m7177b);
            } else if (!this.f14296h) {
                SubtitleViewUtils.m7413a(m7177b);
            }
            arrayList.add(m7177b.m7178a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Util.f14736a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        int i2 = Util.f14736a;
        if (i2 < 19 || isInEditMode()) {
            return CaptionStyleCompat.f14079g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return CaptionStyleCompat.f14079g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i2 < 21) {
            return new CaptionStyleCompat(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.f14299k);
        View view = this.f14299k;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f14311c.destroy();
        }
        this.f14299k = t;
        this.f14298j = t;
        addView(t);
    }

    /* renamed from: a */
    public void m7410a() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: b */
    public void m7411b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public final void m7412c() {
        this.f14298j.mo7344a(getCuesWithStylingPreferencesApplied(), this.f14291c, this.f14293e, this.f14292d, this.f14294f);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(List<Cue> list) {
        setCues(list);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
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

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f14296h = z;
        m7412c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f14295g = z;
        m7412c();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f14294f = f2;
        m7412c();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f14290b = list;
        m7412c();
    }

    public void setFractionalTextSize(float f2) {
        this.f14292d = 0;
        this.f14293e = f2;
        m7412c();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f14291c = captionStyleCompat;
        m7412c();
    }

    public void setViewType(int i2) {
        if (this.f14297i == i2) {
            return;
        }
        if (i2 == 1) {
            setView(new CanvasSubtitleOutput(getContext(), null));
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f14297i = i2;
    }
}
