package com.google.android.exoplayer2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DefaultRenderersFactory implements RenderersFactory {

    /* renamed from: a */
    public final Context f9500a;

    /* renamed from: b */
    public final DefaultMediaCodecAdapterFactory f9501b = new DefaultMediaCodecAdapterFactory();

    /* renamed from: c */
    public MediaCodecSelector f9502c = C0576a.f5948b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f9500a = context;
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    /* renamed from: a */
    public Renderer[] mo5699a(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MediaCodecVideoRenderer(this.f9500a, this.f9501b, this.f9502c, 5000L, false, handler, videoRendererEventListener, 50));
        Context context = this.f9500a;
        AudioCapabilities audioCapabilities = AudioCapabilities.f10294c;
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(AudioCapabilities.m6109a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"))), new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]), false, false, 0);
        arrayList.add(new MediaCodecAudioRenderer(this.f9500a, this.f9501b, this.f9502c, false, handler, audioRendererEventListener, defaultAudioSink));
        arrayList.add(new TextRenderer(textOutput, handler.getLooper()));
        arrayList.add(new MetadataRenderer(metadataOutput, handler.getLooper()));
        arrayList.add(new CameraMotionRenderer());
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
