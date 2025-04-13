package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimeoutOperation {
    }

    public ExoTimeoutException(int i2) {
        super(i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
