package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface Renderer extends PlayerMessage.Target {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        /* renamed from: a */
        void mo5819a();

        /* renamed from: b */
        void mo5820b(long j2);
    }

    /* renamed from: b */
    boolean mo5905b();

    /* renamed from: c */
    boolean mo5906c();

    /* renamed from: e */
    void mo5659e(int i2);

    /* renamed from: f */
    void mo5660f();

    /* renamed from: g */
    int mo5661g();

    String getName();

    int getState();

    /* renamed from: h */
    boolean mo5662h();

    /* renamed from: i */
    void mo5663i(Format[] formatArr, SampleStream sampleStream, long j2, long j3) throws ExoPlaybackException;

    /* renamed from: j */
    void mo5664j();

    /* renamed from: k */
    RendererCapabilities mo5665k();

    /* renamed from: m */
    void mo5666m(float f2, float f3) throws ExoPlaybackException;

    /* renamed from: n */
    void mo5667n(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4) throws ExoPlaybackException;

    /* renamed from: p */
    void mo5938p(long j2, long j3) throws ExoPlaybackException;

    @Nullable
    /* renamed from: r */
    SampleStream mo5670r();

    void reset();

    /* renamed from: s */
    void mo5671s() throws IOException;

    void start() throws ExoPlaybackException;

    void stop();

    /* renamed from: t */
    long mo5672t();

    /* renamed from: u */
    void mo5673u(long j2) throws ExoPlaybackException;

    /* renamed from: v */
    boolean mo5674v();

    @Nullable
    /* renamed from: w */
    MediaClock mo5675w();
}
