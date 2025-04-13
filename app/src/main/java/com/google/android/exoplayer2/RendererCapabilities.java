package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface RendererCapabilities {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FormatSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    /* renamed from: a */
    int mo5904a(Format format) throws ExoPlaybackException;

    /* renamed from: g */
    int mo5661g();

    String getName();

    /* renamed from: o */
    int mo5668o() throws ExoPlaybackException;
}
