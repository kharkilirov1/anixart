package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public interface TrackSelection {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* renamed from: a */
    TrackGroup mo7294a();

    /* renamed from: h */
    Format mo7299h(int i2);

    /* renamed from: j */
    int mo7300j(int i2);

    /* renamed from: l */
    int mo7301l(Format format);

    int length();

    /* renamed from: u */
    int mo7306u(int i2);
}
